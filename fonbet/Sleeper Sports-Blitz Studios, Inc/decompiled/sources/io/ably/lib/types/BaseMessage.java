package io.ably.lib.types;

import com.davidehrmann.vcdiff.VCDiffDecoder;
import com.davidehrmann.vcdiff.VCDiffDecoderBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import fr.greweb.reactnativeviewshot.ViewShot;
import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.Crypto;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes9.dex */
public class BaseMessage implements Cloneable {
    private static final String CLIENT_ID = "clientId";
    private static final String CONNECTION_ID = "connectionId";
    private static final String DATA = "data";
    private static final String ENCODING = "encoding";
    private static final String ID = "id";
    private static final String TIMESTAMP = "timestamp";
    public String clientId;
    public String connectionId;
    public Object data;
    public String encoding;
    public String id;
    public long timestamp;
    private static final VCDiffDecoder vcdiffDecoder = VCDiffDecoderBuilder.builder().buildSimple();
    private static Pattern xformPattern = Pattern.compile("([\\-\\w]+)(\\+([\\-\\w]+))?");
    private static final String TAG = BaseMessage.class.getName();

    public void getDetails(StringBuilder sb) {
        if (this.clientId != null) {
            sb.append(" clientId=");
            sb.append(this.clientId);
        }
        if (this.connectionId != null) {
            sb.append(" connectionId=");
            sb.append(this.connectionId);
        }
        if (this.data != null) {
            sb.append(" data=");
            sb.append(this.data);
        }
        if (this.encoding != null) {
            sb.append(" encoding=");
            sb.append(this.encoding);
        }
        if (this.id != null) {
            sb.append(" id=");
            sb.append(this.id);
        }
    }

    public void decode(ChannelOptions channelOptions) throws MessageDecodeException {
        decode(channelOptions, new DecodingContext());
    }

    private static byte[] vcdiffApply(byte[] bArr, byte[] bArr2) throws MessageDecodeException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            vcdiffDecoder.decode(bArr2, bArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            throw MessageDecodeException.fromThrowableAndErrorInfo(th, new ErrorInfo("VCDIFF delta decode failed", 400, 40018));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        throw io.ably.lib.types.MessageDecodeException.fromDescription("Encrypted message received but encryption is not set up");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void decode(ChannelOptions channelOptions, DecodingContext decodingContext) throws MessageDecodeException {
        Object obj = this.data;
        String str = this.encoding;
        if (str != null) {
            String[] split = str.split("\\/");
            int length = split.length;
            while (true) {
                if (length > 0) {
                    try {
                        int i = length - 1;
                        Matcher matcher = xformPattern.matcher(split[i]);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            switch (group.hashCode()) {
                                case -1396204209:
                                    if (!group.equals(ViewShot.Results.BASE_64)) {
                                        break;
                                    } else {
                                        try {
                                            byte[] decode = Base64Coder.decode((String) this.data);
                                            this.data = decode;
                                            if (length == split.length) {
                                                obj = decode;
                                            }
                                            length = i;
                                        } catch (IllegalArgumentException unused) {
                                            throw MessageDecodeException.fromDescription("Invalid base64 data received");
                                        }
                                    }
                                case -1360271861:
                                    if (!group.equals("cipher")) {
                                        break;
                                    } else if (channelOptions != null && channelOptions.encrypted) {
                                        try {
                                            this.data = Crypto.createChannelDecipher(channelOptions.getCipherParamsOrDefault()).decrypt((byte[]) this.data);
                                            length = i;
                                        } catch (AblyException e) {
                                            throw MessageDecodeException.fromDescription(e.errorInfo.message);
                                        }
                                    }
                                    break;
                                case -822215630:
                                    if (!group.equals(DeltaExtras.FORMAT_VCDIFF)) {
                                        break;
                                    } else {
                                        obj = vcdiffApply((byte[]) this.data, decodingContext.getLastMessageData());
                                        this.data = obj;
                                        length = i;
                                    }
                                case 3271912:
                                    if (!group.equals("json")) {
                                        break;
                                    } else {
                                        try {
                                            this.data = Serialisation.gsonParser.parse(((String) this.data).trim());
                                            length = i;
                                        } catch (JsonParseException unused2) {
                                            throw MessageDecodeException.fromDescription("Invalid JSON data received");
                                        }
                                    }
                                case 111607186:
                                    if (!group.equals("utf-8")) {
                                        break;
                                    } else {
                                        try {
                                            this.data = new String((byte[]) this.data, "UTF-8");
                                        } catch (UnsupportedEncodingException | ClassCastException unused3) {
                                        }
                                        length = i;
                                    }
                            }
                        }
                    } finally {
                        this.encoding = length > 0 ? join(split, IOUtils.DIR_SEPARATOR_UNIX, 0, length) : null;
                    }
                }
            }
        }
        if (obj instanceof String) {
            decodingContext.setLastMessageData((String) obj);
        } else if (obj instanceof byte[]) {
            decodingContext.setLastMessageData((byte[]) obj);
        } else if (obj != null) {
            throw MessageDecodeException.fromDescription("Message data neither String nor byte[]. Unsupported message data type.");
        }
    }

    public void encode(ChannelOptions channelOptions) throws AblyException {
        String str;
        String str2;
        Object obj = this.data;
        String str3 = "";
        if (obj != null) {
            if (obj instanceof JsonElement) {
                this.data = Serialisation.gson.toJson((JsonElement) this.data);
                StringBuilder sb = new StringBuilder();
                if (this.encoding == null) {
                    str2 = "";
                } else {
                    str2 = this.encoding + "/";
                }
                sb.append(str2);
                sb.append("json");
                this.encoding = sb.toString();
            }
            Object obj2 = this.data;
            if (obj2 instanceof String) {
                if (channelOptions != null && channelOptions.encrypted) {
                    try {
                        this.data = ((String) this.data).getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (this.encoding == null) {
                        str = "";
                    } else {
                        str = this.encoding + "/";
                    }
                    sb2.append(str);
                    sb2.append("utf-8");
                    this.encoding = sb2.toString();
                }
            } else if (!(obj2 instanceof byte[])) {
                Log.d(TAG, "Message data must be either `byte[]`, `String` or `JSONElement`; implicit coercion of other types to String is deprecated");
                throw AblyException.fromErrorInfo(new ErrorInfo("Invalid message data or encoding", 400, 40013));
            }
        }
        if (channelOptions == null || !channelOptions.encrypted) {
            return;
        }
        Crypto.EncryptingChannelCipher createChannelEncipher = Crypto.createChannelEncipher(channelOptions.getCipherParamsOrDefault());
        this.data = createChannelEncipher.encrypt((byte[]) this.data);
        StringBuilder sb3 = new StringBuilder();
        if (this.encoding != null) {
            str3 = this.encoding + "/";
        }
        sb3.append(str3);
        sb3.append("cipher+");
        sb3.append(createChannelEncipher.getAlgorithm());
        this.encoding = sb3.toString();
    }

    private String join(String[] strArr, char c, int i, int i2) {
        StringBuilder sb = new StringBuilder(strArr[i]);
        for (int i3 = i + 1; i3 < i2; i3++) {
            sb.append(c);
            sb.append(strArr[i3]);
        }
        return sb.toString();
    }

    public static JsonObject toJsonObject(BaseMessage baseMessage) {
        String str;
        JsonObject jsonObject = new JsonObject();
        Object obj = baseMessage.data;
        String str2 = baseMessage.encoding;
        if (obj != null) {
            if (obj instanceof byte[]) {
                jsonObject.addProperty("data", new String(Base64Coder.encode((byte[]) obj)));
                if (str2 == null) {
                    str = ViewShot.Results.BASE_64;
                } else {
                    str = str2 + "/base64";
                }
                str2 = str;
            } else {
                jsonObject.addProperty("data", obj.toString());
            }
            if (str2 != null) {
                jsonObject.addProperty("encoding", str2);
            }
        }
        String str3 = baseMessage.id;
        if (str3 != null) {
            jsonObject.addProperty("id", str3);
        }
        String str4 = baseMessage.clientId;
        if (str4 != null) {
            jsonObject.addProperty("clientId", str4);
        }
        String str5 = baseMessage.connectionId;
        if (str5 != null) {
            jsonObject.addProperty("connectionId", str5);
        }
        return jsonObject;
    }

    protected void read(JsonObject jsonObject) throws MessageDecodeException {
        Long readLong = readLong(jsonObject, "timestamp");
        if (readLong != null) {
            this.timestamp = readLong.longValue();
        }
        this.id = readString(jsonObject, "id");
        this.clientId = readString(jsonObject, "clientId");
        this.connectionId = readString(jsonObject, "connectionId");
        this.encoding = readString(jsonObject, "encoding");
        this.data = readString(jsonObject, "data");
    }

    protected String readString(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return jsonElement.getAsString();
    }

    protected Long readLong(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return Long.valueOf(jsonElement.getAsLong());
    }

    protected Integer readInt(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        return Integer.valueOf(jsonElement.getAsInt());
    }

    boolean readField(MessageUnpacker messageUnpacker, String str, MessageFormat messageFormat) throws IOException {
        str.hashCode();
        switch (str) {
            case "id":
                this.id = messageUnpacker.unpackString();
                return true;
            case "data":
                if (messageFormat.getValueType().isBinaryType()) {
                    byte[] bArr = new byte[messageUnpacker.unpackBinaryHeader()];
                    messageUnpacker.readPayload(bArr);
                    this.data = bArr;
                    return true;
                }
                this.data = messageUnpacker.unpackString();
                return true;
            case "timestamp":
                this.timestamp = messageUnpacker.unpackLong();
                return true;
            case "clientId":
                this.clientId = messageUnpacker.unpackString();
                return true;
            case "encoding":
                this.encoding = messageUnpacker.unpackString();
                return true;
            case "connectionId":
                this.connectionId = messageUnpacker.unpackString();
                return true;
            default:
                return false;
        }
    }

    protected int countFields() {
        int i = this.timestamp > 0 ? 1 : 0;
        if (this.id != null) {
            i++;
        }
        if (this.clientId != null) {
            i++;
        }
        if (this.connectionId != null) {
            i++;
        }
        if (this.encoding != null) {
            i++;
        }
        return this.data != null ? i + 1 : i;
    }

    void writeFields(MessagePacker messagePacker) throws IOException {
        if (this.timestamp > 0) {
            messagePacker.packString("timestamp");
            messagePacker.packLong(this.timestamp);
        }
        if (this.id != null) {
            messagePacker.packString("id");
            messagePacker.packString(this.id);
        }
        if (this.clientId != null) {
            messagePacker.packString("clientId");
            messagePacker.packString(this.clientId);
        }
        if (this.connectionId != null) {
            messagePacker.packString("connectionId");
            messagePacker.packString(this.connectionId);
        }
        if (this.encoding != null) {
            messagePacker.packString("encoding");
            messagePacker.packString(this.encoding);
        }
        if (this.data != null) {
            messagePacker.packString("data");
            Object obj = this.data;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                messagePacker.packBinaryHeader(bArr.length);
                messagePacker.writePayload(bArr);
                return;
            }
            messagePacker.packString(obj.toString());
        }
    }
}
