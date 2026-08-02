package io.ably.lib.types;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.ably.lib.util.Log;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes9.dex */
public class MessageAnnotations {
    private static final String SUMMARY = "summary";
    private static final String TAG = "io.ably.lib.types.MessageAnnotations";
    public Summary summary;

    public MessageAnnotations() {
        this.summary = new Summary(new HashMap());
    }

    public MessageAnnotations(Summary summary) {
        this.summary = summary == null ? new Summary(new HashMap()) : summary;
    }

    void writeMsgpack(MessagePacker messagePacker) throws IOException {
        messagePacker.packMapHeader(this.summary != null ? 1 : 0);
        if (this.summary != null) {
            messagePacker.packString(SUMMARY);
            this.summary.write(messagePacker);
        }
    }

    static MessageAnnotations read(MessageUnpacker messageUnpacker) throws IOException {
        MessageAnnotations messageAnnotations = new MessageAnnotations();
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else if (intern.equals(SUMMARY)) {
                messageAnnotations.summary = Summary.read(messageUnpacker);
            } else {
                Log.v(TAG, "Unexpected field: " + intern);
                messageUnpacker.skipValue();
            }
        }
        return messageAnnotations;
    }

    static MessageAnnotations read(JsonElement jsonElement) throws MessageDecodeException {
        if (!jsonElement.isJsonObject()) {
            throw MessageDecodeException.fromDescription("Message annotations is of type \"" + jsonElement.getClass() + "\" when expected a JSON object.");
        }
        MessageAnnotations messageAnnotations = new MessageAnnotations();
        JsonElement jsonElement2 = jsonElement.getAsJsonObject().get(SUMMARY);
        if (jsonElement2 == null) {
            return messageAnnotations;
        }
        if (!jsonElement2.isJsonObject()) {
            throw MessageDecodeException.fromDescription("MessageAnnotations summary is of type \"" + jsonElement2.getClass() + "\" when expected a JSON object.");
        }
        messageAnnotations.summary = Summary.read(jsonElement2.getAsJsonObject());
        return messageAnnotations;
    }

    JsonElement toJsonTree() {
        JsonObject jsonObject = new JsonObject();
        Summary summary = this.summary;
        if (summary != null) {
            jsonObject.add(SUMMARY, summary.toJsonTree());
        }
        return jsonObject;
    }

    public static class Serializer implements JsonSerializer<MessageAnnotations>, JsonDeserializer<MessageAnnotations> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(MessageAnnotations messageAnnotations, Type type, JsonSerializationContext jsonSerializationContext) {
            return messageAnnotations.toJsonTree();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public MessageAnnotations deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                return MessageAnnotations.read(jsonElement);
            } catch (MessageDecodeException e) {
                Log.e(MessageAnnotations.TAG, e.getMessage(), e);
                throw new JsonParseException("Failed to deserialize MessageAnnotations from JSON.", e);
            }
        }
    }

    public String toString() {
        return "{MessageAnnotations summary=" + this.summary + "}";
    }
}
