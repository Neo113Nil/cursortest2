package io.ably.lib.types;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueFactory;

/* loaded from: classes9.dex */
public final class MessageExtras {
    private static final String DELTA = "delta";
    private static final String TAG = "io.ably.lib.types.MessageExtras";
    private final DeltaExtras delta;
    private final JsonObject jsonObject;

    public MessageExtras(JsonObject jsonObject) {
        this(jsonObject, null);
    }

    private MessageExtras(JsonObject jsonObject, DeltaExtras deltaExtras) {
        if (jsonObject == null) {
            throw new NullPointerException("jsonObject cannot be null.");
        }
        this.jsonObject = jsonObject;
        this.delta = deltaExtras;
    }

    public DeltaExtras getDelta() {
        return this.delta;
    }

    public JsonObject asJsonObject() {
        return this.jsonObject;
    }

    void write(MessagePacker messagePacker) {
        Serialisation.gsonToMsgpack((JsonElement) this.jsonObject, messagePacker);
    }

    static MessageExtras read(MessageUnpacker messageUnpacker) throws IOException {
        DeltaExtras deltaExtras;
        Value value;
        ImmutableValue unpackValue = messageUnpacker.unpackValue();
        if (!(unpackValue instanceof ImmutableMapValue) || (value = ((ImmutableMapValue) unpackValue).map().get(ValueFactory.newString(DELTA))) == null) {
            deltaExtras = null;
        } else {
            if (!(value instanceof ImmutableMapValue)) {
                throw new IOException("The delta extras unpacked to the wrong type \"" + value.getClass() + "\" when expected a map.");
            }
            deltaExtras = DeltaExtras.read(((ImmutableMapValue) value).map());
        }
        JsonElement msgpackToGson = Serialisation.msgpackToGson(unpackValue);
        if (!(msgpackToGson instanceof JsonObject)) {
            throw new IOException("The extras unpacked to the wrong type \"" + msgpackToGson.getClass() + "\" when expected a JsonObject.");
        }
        return new MessageExtras((JsonObject) msgpackToGson, deltaExtras);
    }

    static MessageExtras read(JsonObject jsonObject) throws MessageDecodeException {
        DeltaExtras deltaExtras;
        JsonElement jsonElement = jsonObject.get(DELTA);
        if (jsonElement instanceof JsonObject) {
            deltaExtras = DeltaExtras.read((JsonObject) jsonElement);
        } else {
            if (jsonElement != null) {
                throw MessageDecodeException.fromDescription("The value under the delta key is of the wrong type \"" + jsonElement.getClass() + "\" when expected a map.");
            }
            deltaExtras = null;
        }
        return new MessageExtras(jsonObject, deltaExtras);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.jsonObject, ((MessageExtras) obj).jsonObject);
    }

    public int hashCode() {
        return Objects.hashCode(this.jsonObject);
    }

    public String toString() {
        return "MessageExtras{delta=" + this.delta + ", raw=" + this.jsonObject + AbstractJsonLexerKt.END_OBJ;
    }

    public static class Serializer implements JsonSerializer<MessageExtras> {
        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(MessageExtras messageExtras, Type type, JsonSerializationContext jsonSerializationContext) {
            return messageExtras.jsonObject;
        }
    }
}
