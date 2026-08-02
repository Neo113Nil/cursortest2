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
import java.util.Map;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes9.dex */
public class MessageVersion {
    private static final String CLIENT_ID = "clientId";
    private static final String DESCRIPTION = "description";
    private static final String METADATA = "metadata";
    private static final String SERIAL = "serial";
    private static final String TAG = "io.ably.lib.types.MessageVersion";
    private static final String TIMESTAMP = "timestamp";
    public String clientId;
    public String description;
    public Map<String, String> metadata;
    public String serial;
    public long timestamp;

    public MessageVersion() {
    }

    public MessageVersion(String str, Long l) {
        this.serial = str;
        this.timestamp = l.longValue();
    }

    void writeMsgpack(MessagePacker messagePacker) throws IOException {
        int i = this.serial != null ? 1 : 0;
        if (this.timestamp != 0) {
            i++;
        }
        if (this.clientId != null) {
            i++;
        }
        if (this.description != null) {
            i++;
        }
        if (this.metadata != null) {
            i++;
        }
        messagePacker.packMapHeader(i);
        if (this.serial != null) {
            messagePacker.packString(SERIAL);
            messagePacker.packString(this.serial);
        }
        if (this.timestamp != 0) {
            messagePacker.packString("timestamp");
            messagePacker.packLong(this.timestamp);
        }
        if (this.clientId != null) {
            messagePacker.packString("clientId");
            messagePacker.packString(this.clientId);
        }
        if (this.description != null) {
            messagePacker.packString("description");
            messagePacker.packString(this.description);
        }
        if (this.metadata != null) {
            messagePacker.packString("metadata");
            messagePacker.packMapHeader(this.metadata.size());
            for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
                messagePacker.packString(entry.getKey());
                messagePacker.packString(entry.getValue());
            }
        }
    }

    static MessageVersion read(MessageUnpacker messageUnpacker) throws IOException {
        MessageVersion messageVersion = new MessageVersion();
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                intern.hashCode();
                switch (intern) {
                    case "description":
                        messageVersion.description = messageUnpacker.unpackString();
                        break;
                    case "serial":
                        messageVersion.serial = messageUnpacker.unpackString();
                        break;
                    case "metadata":
                        int unpackMapHeader2 = messageUnpacker.unpackMapHeader();
                        messageVersion.metadata = new HashMap(unpackMapHeader2);
                        for (int i2 = 0; i2 < unpackMapHeader2; i2++) {
                            messageVersion.metadata.put(messageUnpacker.unpackString(), messageUnpacker.unpackString());
                        }
                        break;
                    case "timestamp":
                        messageVersion.timestamp = messageUnpacker.unpackLong();
                        break;
                    case "clientId":
                        messageVersion.clientId = messageUnpacker.unpackString();
                        break;
                    default:
                        Log.v(TAG, "Unexpected field: " + intern);
                        messageUnpacker.skipValue();
                        break;
                }
            }
        }
        return messageVersion;
    }

    static MessageVersion read(JsonElement jsonElement) throws MessageDecodeException {
        if (!jsonElement.isJsonObject()) {
            throw MessageDecodeException.fromDescription("Expected an object but got \"" + jsonElement.getClass() + "\".");
        }
        MessageVersion messageVersion = new MessageVersion();
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        messageVersion.serial = readString(asJsonObject, SERIAL);
        messageVersion.timestamp = readLong(asJsonObject, "timestamp");
        messageVersion.clientId = readString(asJsonObject, "clientId");
        messageVersion.description = readString(asJsonObject, "description");
        if (asJsonObject.has("metadata")) {
            JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("metadata");
            messageVersion.metadata = new HashMap();
            for (Map.Entry<String, JsonElement> entry : asJsonObject2.entrySet()) {
                messageVersion.metadata.put(entry.getKey(), entry.getValue().getAsString());
            }
        }
        return messageVersion;
    }

    private static String readString(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return null;
        }
        return jsonElement.getAsString();
    }

    private static long readLong(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return 0L;
        }
        return jsonElement.getAsLong();
    }

    JsonElement toJsonTree() {
        JsonObject jsonObject = new JsonObject();
        String str = this.serial;
        if (str != null) {
            jsonObject.addProperty(SERIAL, str);
        }
        long j = this.timestamp;
        if (j != 0) {
            jsonObject.addProperty("timestamp", Long.valueOf(j));
        }
        String str2 = this.clientId;
        if (str2 != null) {
            jsonObject.addProperty("clientId", str2);
        }
        String str3 = this.description;
        if (str3 != null) {
            jsonObject.addProperty("description", str3);
        }
        if (this.metadata != null) {
            JsonObject jsonObject2 = new JsonObject();
            for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
                jsonObject2.addProperty(entry.getKey(), entry.getValue());
            }
            jsonObject.add("metadata", jsonObject2);
        }
        return jsonObject;
    }

    public static class Serializer implements JsonSerializer<MessageVersion>, JsonDeserializer<MessageVersion> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(MessageVersion messageVersion, Type type, JsonSerializationContext jsonSerializationContext) {
            return messageVersion.toJsonTree();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public MessageVersion deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            try {
                return MessageVersion.read(jsonElement);
            } catch (MessageDecodeException e) {
                Log.e(MessageVersion.TAG, e.getMessage(), e);
                throw new JsonParseException("Failed to deserialize MessageVersion from JSON.", e);
            }
        }
    }

    public String toString() {
        return "{MessageVersion serial=" + this.serial + ", timestamp=" + this.timestamp + "}";
    }
}
