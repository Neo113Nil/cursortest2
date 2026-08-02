package io.ably.lib.types;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes9.dex */
public class Annotation extends BaseMessage {
    private static final String ACTION = "action";
    private static final String COUNT = "count";
    private static final String EXTRAS = "extras";
    private static final String MESSAGE_SERIAL = "messageSerial";
    private static final String NAME = "name";
    private static final String SERIAL = "serial";
    private static final String TAG = "io.ably.lib.types.Annotation";
    private static final String TYPE = "type";
    public AnnotationAction action;
    public Integer count;
    public MessageExtras extras;
    public String messageSerial;
    public String name;
    public String serial;
    public String type;

    public static Annotation fromMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        return new Annotation().readMsgpack(messageUnpacker);
    }

    void writeMsgpack(MessagePacker messagePacker) throws IOException {
        int countFields = super.countFields();
        if (this.action != null) {
            countFields++;
        }
        if (this.serial != null) {
            countFields++;
        }
        if (this.messageSerial != null) {
            countFields++;
        }
        if (this.type != null) {
            countFields++;
        }
        if (this.name != null) {
            countFields++;
        }
        if (this.count != null) {
            countFields++;
        }
        if (this.extras != null) {
            countFields++;
        }
        messagePacker.packMapHeader(countFields);
        super.writeFields(messagePacker);
        if (this.action != null) {
            messagePacker.packString("action");
            messagePacker.packInt(this.action.ordinal());
        }
        if (this.serial != null) {
            messagePacker.packString(SERIAL);
            messagePacker.packString(this.serial);
        }
        if (this.messageSerial != null) {
            messagePacker.packString(MESSAGE_SERIAL);
            messagePacker.packString(this.messageSerial);
        }
        if (this.type != null) {
            messagePacker.packString("type");
            messagePacker.packString(this.type);
        }
        if (this.name != null) {
            messagePacker.packString("name");
            messagePacker.packString(this.name);
        }
        if (this.count != null) {
            messagePacker.packString("count");
            messagePacker.packInt(this.count.intValue());
        }
        if (this.extras != null) {
            messagePacker.packString("extras");
            this.extras.write(messagePacker);
        }
    }

    Annotation readMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            MessageFormat nextFormat = messageUnpacker.getNextFormat();
            if (nextFormat.equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else if (!super.readField(messageUnpacker, intern, nextFormat)) {
                if (intern.equals("action")) {
                    this.action = AnnotationAction.tryFindByOrdinal(messageUnpacker.unpackInt());
                } else if (intern.equals(SERIAL)) {
                    this.serial = messageUnpacker.unpackString();
                } else if (intern.equals(MESSAGE_SERIAL)) {
                    this.messageSerial = messageUnpacker.unpackString();
                } else if (intern.equals("type")) {
                    this.type = messageUnpacker.unpackString();
                } else if (intern.equals("name")) {
                    this.name = messageUnpacker.unpackString();
                } else if (intern.equals("count")) {
                    this.count = Integer.valueOf(messageUnpacker.unpackInt());
                } else if (intern.equals("extras")) {
                    this.extras = MessageExtras.read(messageUnpacker);
                } else {
                    Log.v(TAG, "Unexpected field: " + intern);
                    messageUnpacker.skipValue();
                }
            }
        }
        return this;
    }

    @Override // io.ably.lib.types.BaseMessage
    protected void read(JsonObject jsonObject) throws MessageDecodeException {
        super.read(jsonObject);
        Integer readInt = readInt(jsonObject, "action");
        this.action = readInt == null ? null : AnnotationAction.tryFindByOrdinal(readInt.intValue());
        this.serial = readString(jsonObject, SERIAL);
        this.messageSerial = readString(jsonObject, MESSAGE_SERIAL);
        this.type = readString(jsonObject, "type");
        this.name = readString(jsonObject, "name");
        this.count = readInt(jsonObject, "count");
        JsonElement jsonElement = jsonObject.get("extras");
        if (jsonElement != null) {
            if (!jsonElement.isJsonObject()) {
                throw MessageDecodeException.fromDescription("Message extras is of type \"" + jsonElement.getClass() + "\" when expected a JSON object.");
            }
            this.extras = MessageExtras.read((JsonObject) jsonElement);
        }
    }

    public static class Serializer implements JsonSerializer<Annotation>, JsonDeserializer<Annotation> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Annotation annotation, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = BaseMessage.toJsonObject(annotation);
            if (annotation.action != null) {
                jsonObject.addProperty("action", Integer.valueOf(annotation.action.ordinal()));
            }
            if (annotation.serial != null) {
                jsonObject.addProperty(Annotation.SERIAL, annotation.serial);
            }
            if (annotation.messageSerial != null) {
                jsonObject.addProperty(Annotation.MESSAGE_SERIAL, annotation.messageSerial);
            }
            if (annotation.type != null) {
                jsonObject.addProperty("type", annotation.type);
            }
            if (annotation.name != null) {
                jsonObject.addProperty("name", annotation.name);
            }
            if (annotation.count != null) {
                jsonObject.addProperty("count", annotation.count);
            }
            if (annotation.extras != null) {
                jsonObject.add("extras", Serialisation.gson.toJsonTree(annotation.extras));
            }
            return jsonObject;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Annotation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (!jsonElement.isJsonObject()) {
                throw new JsonParseException("Expected an object but got \"" + jsonElement.getClass() + "\".");
            }
            Annotation annotation = new Annotation();
            try {
                annotation.read((JsonObject) jsonElement);
                return annotation;
            } catch (MessageDecodeException e) {
                Log.e(Annotation.TAG, e.getMessage(), e);
                throw new JsonParseException("Failed to deserialize Message from JSON.", e);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        super.getDetails(sb);
        sb.append(" name=");
        sb.append(this.name);
        sb.append(" serial=");
        sb.append(this.serial);
        sb.append(" messageSerial=");
        sb.append(this.messageSerial);
        sb.append(" type=");
        sb.append(this.type);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public static class ActionSerializer implements JsonSerializer<AnnotationAction>, JsonDeserializer<AnnotationAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public AnnotationAction deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return AnnotationAction.tryFindByOrdinal(jsonElement.getAsInt());
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(AnnotationAction annotationAction, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Integer.valueOf(annotationAction.ordinal()));
        }
    }
}
