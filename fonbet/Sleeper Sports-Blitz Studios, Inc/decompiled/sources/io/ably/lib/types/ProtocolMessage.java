package io.ably.lib.types;

import com.appsflyer.AppsFlyerProperties;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import io.ably.lib.objects.ObjectsHelper;
import io.ably.lib.objects.ObjectsJsonSerializer;
import io.ably.lib.objects.ObjectsSerializer;
import io.ably.lib.realtime.Presence;
import io.ably.lib.util.Log;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import org.apache.commons.lang3.CharUtils;
import org.mp4parser.boxes.threegpp.ts26244.AuthorBox;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes9.dex */
public class ProtocolMessage {
    private static final String TAG = "io.ably.lib.types.ProtocolMessage";
    public Action action;
    public Annotation[] annotations;
    public AuthDetails auth;
    public String channel;
    public String channelSerial;
    public ConnectionDetails connectionDetails;
    public String connectionId;
    public int count;
    public ErrorInfo error;
    public int flags;
    public String id;
    public Message[] messages;
    public Long msgSerial;
    public Map<String, String> params;
    public PresenceMessage[] presence;

    @JsonAdapter(ObjectsJsonSerializer.class)
    public Object[] state;
    public long timestamp;

    public enum Action {
        heartbeat,
        ack,
        nack,
        connect,
        connected,
        disconnect,
        disconnected,
        close,
        closed,
        error,
        attach,
        attached,
        detach,
        detached,
        presence,
        message,
        sync,
        auth,
        activate,
        object,
        object_sync,
        annotation;

        public int getValue() {
            return ordinal();
        }

        public static Action findByValue(int i) {
            return values()[i];
        }
    }

    public enum Flag {
        has_presence(0),
        has_backlog(1),
        resumed(2),
        attach_resume(5),
        has_objects(7),
        presence(16),
        publish(17),
        subscribe(18),
        presence_subscribe(19),
        annotation_publish(21),
        annotation_subscribe(22),
        object_subscribe(24),
        object_publish(25);

        private final int mask;

        Flag(int i) {
            this.mask = 1 << i;
        }

        public int getMask() {
            return this.mask;
        }
    }

    public static boolean ackRequired(ProtocolMessage protocolMessage) {
        return protocolMessage.action == Action.message || protocolMessage.action == Action.presence || protocolMessage.action == Action.object || protocolMessage.action == Action.annotation;
    }

    public ProtocolMessage() {
    }

    public ProtocolMessage(Action action) {
        this.action = action;
    }

    public ProtocolMessage(Action action, String str) {
        this.action = action;
        this.channel = str;
    }

    public boolean hasFlag(Flag flag) {
        return (this.flags & flag.getMask()) == flag.getMask();
    }

    public void setFlag(Flag flag) {
        this.flags = flag.getMask() | this.flags;
    }

    public void setFlags(int i) {
        this.flags = i | this.flags;
    }

    void writeMsgpack(MessagePacker messagePacker) throws IOException {
        int i = this.channel != null ? 2 : 1;
        if (this.msgSerial != null) {
            i++;
        }
        if (this.messages != null) {
            i++;
        }
        if (this.presence != null) {
            i++;
        }
        if (this.auth != null) {
            i++;
        }
        if (this.flags != 0) {
            i++;
        }
        if (this.params != null) {
            i++;
        }
        if (this.channelSerial != null) {
            i++;
        }
        if (this.annotations != null) {
            i++;
        }
        if (this.state != null && ObjectsHelper.getSerializer() != null) {
            i++;
        }
        messagePacker.packMapHeader(i);
        messagePacker.packString("action");
        messagePacker.packInt(this.action.getValue());
        if (this.channel != null) {
            messagePacker.packString(AppsFlyerProperties.CHANNEL);
            messagePacker.packString(this.channel);
        }
        if (this.msgSerial != null) {
            messagePacker.packString("msgSerial");
            messagePacker.packLong(this.msgSerial.longValue());
        }
        if (this.messages != null) {
            messagePacker.packString("messages");
            MessageSerializer.writeMsgpackArray(this.messages, messagePacker);
        }
        if (this.presence != null) {
            messagePacker.packString("presence");
            PresenceSerializer.writeMsgpackArray(this.presence, messagePacker);
        }
        if (this.auth != null) {
            messagePacker.packString(AuthorBox.TYPE);
            this.auth.writeMsgpack(messagePacker);
        }
        if (this.flags != 0) {
            messagePacker.packString("flags");
            messagePacker.packInt(this.flags);
        }
        if (this.params != null) {
            messagePacker.packString("params");
            MessageSerializer.write(this.params, messagePacker);
        }
        if (this.channelSerial != null) {
            messagePacker.packString("channelSerial");
            messagePacker.packString(this.channelSerial);
        }
        if (this.annotations != null) {
            messagePacker.packString("annotations");
            AnnotationSerializer.writeMsgpackArray(this.annotations, messagePacker);
        }
        if (this.state != null) {
            ObjectsSerializer serializer = ObjectsHelper.getSerializer();
            if (serializer != null) {
                messagePacker.packString("state");
                serializer.writeMsgpackArray(this.state, messagePacker);
            } else {
                Log.w(TAG, "Skipping 'state' field msgpack serialization because ObjectsSerializer not found");
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    ProtocolMessage readMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                intern.hashCode();
                char c = 65535;
                switch (intern.hashCode()) {
                    case -1487721259:
                        if (intern.equals("msgSerial")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1422950858:
                        if (intern.equals("action")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1276666629:
                        if (intern.equals("presence")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -995427962:
                        if (intern.equals("params")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -961709276:
                        if (intern.equals("annotations")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -513224031:
                        if (intern.equals("connectionKey")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -462094004:
                        if (intern.equals("messages")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3355:
                        if (intern.equals("id")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 3005864:
                        if (intern.equals(AuthorBox.TYPE)) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 55126294:
                        if (intern.equals("timestamp")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 94851343:
                        if (intern.equals("count")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 96784904:
                        if (intern.equals("error")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 97513095:
                        if (intern.equals("flags")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 109757585:
                        if (intern.equals("state")) {
                            c = CharUtils.CR;
                            break;
                        }
                        break;
                    case 321402244:
                        if (intern.equals("connectionDetails")) {
                            c = 14;
                            break;
                        }
                        break;
                    case 738950403:
                        if (intern.equals(AppsFlyerProperties.CHANNEL)) {
                            c = 15;
                            break;
                        }
                        break;
                    case 1423136983:
                        if (intern.equals("channelSerial")) {
                            c = 16;
                            break;
                        }
                        break;
                    case 1923106969:
                        if (intern.equals(Presence.GET_CONNECTIONID)) {
                            c = 17;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.msgSerial = Long.valueOf(messageUnpacker.unpackLong());
                        break;
                    case 1:
                        this.action = Action.findByValue(messageUnpacker.unpackInt());
                        break;
                    case 2:
                        this.presence = PresenceSerializer.readMsgpackArray(messageUnpacker);
                        break;
                    case 3:
                        this.params = MessageSerializer.readStringMap(messageUnpacker);
                        break;
                    case 4:
                        this.annotations = AnnotationSerializer.readMsgpackArray(messageUnpacker);
                        break;
                    case 5:
                        messageUnpacker.unpackString();
                        break;
                    case 6:
                        this.messages = MessageSerializer.readMsgpackArray(messageUnpacker);
                        break;
                    case 7:
                        this.id = messageUnpacker.unpackString();
                        break;
                    case '\b':
                        this.auth = AuthDetails.fromMsgpack(messageUnpacker);
                        break;
                    case '\t':
                        this.timestamp = messageUnpacker.unpackLong();
                        break;
                    case '\n':
                        this.count = messageUnpacker.unpackInt();
                        break;
                    case 11:
                        this.error = ErrorInfo.fromMsgpack(messageUnpacker);
                        break;
                    case '\f':
                        this.flags = messageUnpacker.unpackInt();
                        break;
                    case '\r':
                        ObjectsSerializer serializer = ObjectsHelper.getSerializer();
                        if (serializer != null) {
                            this.state = serializer.readMsgpackArray(messageUnpacker);
                            break;
                        } else {
                            Log.w(TAG, "Skipping 'state' field msgpack deserialization because ObjectsSerializer not found");
                            messageUnpacker.skipValue();
                            break;
                        }
                    case 14:
                        this.connectionDetails = ConnectionDetails.fromMsgpack(messageUnpacker);
                        break;
                    case 15:
                        this.channel = messageUnpacker.unpackString();
                        break;
                    case 16:
                        this.channelSerial = messageUnpacker.unpackString();
                        break;
                    case 17:
                        this.connectionId = messageUnpacker.unpackString();
                        break;
                    default:
                        Log.v(TAG, "Unexpected field: " + intern);
                        messageUnpacker.skipValue();
                        break;
                }
            } else {
                messageUnpacker.unpackNil();
            }
        }
        return this;
    }

    static ProtocolMessage fromMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        return new ProtocolMessage().readMsgpack(messageUnpacker);
    }

    public static class ActionSerializer implements JsonSerializer<Action>, JsonDeserializer<Action> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Action deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return Action.findByValue(jsonElement.getAsInt());
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(Action action, Type type, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Integer.valueOf(action.getValue()));
        }
    }

    public static class AuthDetails {
        public String accessToken;

        private AuthDetails() {
        }

        public AuthDetails(String str) {
            this.accessToken = str;
        }

        AuthDetails readMsgpack(MessageUnpacker messageUnpacker) throws IOException {
            int unpackMapHeader = messageUnpacker.unpackMapHeader();
            for (int i = 0; i < unpackMapHeader; i++) {
                String intern = messageUnpacker.unpackString().intern();
                if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                    messageUnpacker.unpackNil();
                } else {
                    intern.hashCode();
                    if (!intern.equals(SDKConstants.PARAM_ACCESS_TOKEN)) {
                        Log.v(ProtocolMessage.TAG, "Unexpected field: " + intern);
                        messageUnpacker.skipValue();
                    } else {
                        this.accessToken = messageUnpacker.unpackString();
                    }
                }
            }
            return this;
        }

        static AuthDetails fromMsgpack(MessageUnpacker messageUnpacker) throws IOException {
            return new AuthDetails().readMsgpack(messageUnpacker);
        }

        void writeMsgpack(MessagePacker messagePacker) throws IOException {
            messagePacker.packMapHeader(this.accessToken != null ? 1 : 0);
            if (this.accessToken != null) {
                messagePacker.packString(SDKConstants.PARAM_ACCESS_TOKEN);
                messagePacker.packString(this.accessToken);
            }
        }
    }
}
