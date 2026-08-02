package io.ably.lib.types;

import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes9.dex */
public class ErrorInfo {
    private static final String HREF_BASE = "https://help.ably.io/error/";
    private static final String TAG = "io.ably.lib.types.ErrorInfo";
    public int code;
    public String href;
    public String message;
    public int statusCode;

    public ErrorInfo() {
    }

    public ErrorInfo(String str, int i) {
        this.code = i;
        this.message = str;
    }

    public ErrorInfo(String str, int i, int i2) {
        this(str, i2);
        this.statusCode = i;
        if (i2 > 0) {
            this.href = href(i2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ErrorInfo message=");
        sb.append(logMessage());
        if (this.code > 0) {
            sb.append(" code=");
            sb.append(this.code);
        }
        if (this.statusCode > 0) {
            sb.append(" statusCode=");
            sb.append(this.statusCode);
        }
        if (this.href != null) {
            sb.append(" href=");
            sb.append(this.href);
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    ErrorInfo readMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                intern.hashCode();
                switch (intern) {
                    case "code":
                        this.code = messageUnpacker.unpackInt();
                        break;
                    case "href":
                        this.href = messageUnpacker.unpackString();
                        break;
                    case "statusCode":
                        this.statusCode = messageUnpacker.unpackInt();
                        break;
                    case "message":
                        this.message = messageUnpacker.unpackString();
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

    public static ErrorInfo fromMsgpackBody(byte[] bArr) throws IOException {
        return fromMsgpackBody(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
    }

    private static ErrorInfo fromMsgpackBody(MessageUnpacker messageUnpacker) throws IOException {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        ErrorInfo errorInfo = null;
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                intern.hashCode();
                if (intern.equals("error")) {
                    errorInfo = fromMsgpack(messageUnpacker);
                } else {
                    Log.v(TAG, "Unexpected field: " + intern);
                    messageUnpacker.skipValue();
                }
            }
        }
        return errorInfo;
    }

    static ErrorInfo fromMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        return new ErrorInfo().readMsgpack(messageUnpacker);
    }

    public static ErrorInfo fromThrowable(Throwable th) {
        if ((th instanceof UnknownHostException) || (th instanceof NoRouteToHostException)) {
            return new ErrorInfo(th.getLocalizedMessage(), 500, 50002);
        }
        if (th instanceof IOException) {
            return new ErrorInfo(th.getLocalizedMessage(), 500, 50000);
        }
        return new ErrorInfo("Unexpected exception: " + th.getLocalizedMessage(), 50000, 500);
    }

    public static ErrorInfo fromResponseStatus(String str, int i) {
        return new ErrorInfo(str, i, i * 100);
    }

    private String logMessage() {
        String str = this.message;
        if (str == null) {
            str = "";
        }
        String str2 = this.href;
        if (str2 == null) {
            int i = this.code;
            str2 = i > 0 ? href(i) : null;
        }
        if (str2 == null || str.contains(str2)) {
            return str;
        }
        return str + " (See " + str2 + ")";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        if (this.code == errorInfo.code && this.statusCode == errorInfo.statusCode) {
            String str = this.message;
            String str2 = errorInfo.message;
            if (str == str2) {
                return true;
            }
            if (str != null && str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static String href(int i) {
        return HREF_BASE + i;
    }
}
