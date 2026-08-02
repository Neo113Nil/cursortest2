package io.ably.lib.types;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.annotations.SerializedName;
import io.ably.lib.http.HttpCore;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes9.dex */
public class PublishResponse {
    private static final String TAG = MessageSerializer.class.getName();
    private static HttpCore.BodyHandler<PublishResponse> batchErrorBodyHandler;
    private static HttpCore.BodyHandler<PublishResponse> bulkResponseBodyHandler;

    @SerializedName(AppsFlyerProperties.CHANNEL)
    public String channelId;
    public ErrorInfo error;
    public String messageId;

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResponse[] fromJSONArray(byte[] bArr) {
        return (PublishResponse[]) Serialisation.gson.fromJson(new String(bArr), PublishResponse[].class);
    }

    private static PublishResponse fromMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        return new PublishResponse().readMsgpack(messageUnpacker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResponse[] fromMsgpackArray(byte[] bArr) throws IOException {
        return fromMsgpackArray(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PublishResponse[] fromMsgpackArray(MessageUnpacker messageUnpacker) throws IOException {
        int unpackArrayHeader = messageUnpacker.unpackArrayHeader();
        PublishResponse[] publishResponseArr = new PublishResponse[unpackArrayHeader];
        for (int i = 0; i < unpackArrayHeader; i++) {
            publishResponseArr[i] = fromMsgpack(messageUnpacker);
        }
        return publishResponseArr;
    }

    private PublishResponse readMsgpack(MessageUnpacker messageUnpacker) throws IOException {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (!messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                intern.hashCode();
                switch (intern) {
                    case "messageId":
                        this.messageId = messageUnpacker.unpackString();
                        break;
                    case "error":
                        this.error = ErrorInfo.fromMsgpack(messageUnpacker);
                        break;
                    case "channel":
                    case "channelId":
                        this.channelId = messageUnpacker.unpackString();
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

    public static HttpCore.BodyHandler<PublishResponse> getBulkPublishResponseHandler(int i) {
        return i < 300 ? bulkResponseBodyHandler : batchErrorBodyHandler;
    }

    private static class BatchErrorResponse {
        public PublishResponse[] batchResponse;
        public ErrorInfo error;

        private BatchErrorResponse() {
        }

        static BatchErrorResponse readJSON(byte[] bArr) {
            return (BatchErrorResponse) Serialisation.gson.fromJson(new String(bArr), BatchErrorResponse.class);
        }

        static BatchErrorResponse readMsgpack(byte[] bArr) throws IOException {
            return new BatchErrorResponse().readMsgpack(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        }

        BatchErrorResponse readMsgpack(MessageUnpacker messageUnpacker) throws IOException {
            int unpackMapHeader = messageUnpacker.unpackMapHeader();
            for (int i = 0; i < unpackMapHeader; i++) {
                String intern = messageUnpacker.unpackString().intern();
                if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                    messageUnpacker.unpackNil();
                } else {
                    intern.hashCode();
                    if (intern.equals("error")) {
                        this.error = ErrorInfo.fromMsgpack(messageUnpacker);
                    } else if (!intern.equals("batchResponse")) {
                        Log.v(PublishResponse.TAG, "Unexpected field: " + intern);
                        messageUnpacker.skipValue();
                    } else {
                        this.batchResponse = PublishResponse.fromMsgpackArray(messageUnpacker);
                    }
                }
            }
            return this;
        }
    }

    private static class BulkResponseBodyHandler implements HttpCore.BodyHandler<PublishResponse> {
        private BulkResponseBodyHandler() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public PublishResponse[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            try {
                if ("application/json".equals(str)) {
                    return PublishResponse.fromJSONArray(bArr);
                }
                if ("application/x-msgpack".equals(str)) {
                    return PublishResponse.fromMsgpackArray(bArr);
                }
                return null;
            } catch (IOException e) {
                throw AblyException.fromThrowable(e);
            }
        }
    }

    private static class BatchErrorBodyHandler implements HttpCore.BodyHandler<PublishResponse> {
        private BatchErrorBodyHandler() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public PublishResponse[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            BatchErrorResponse readMsgpack;
            try {
                if ("application/json".equals(str)) {
                    readMsgpack = BatchErrorResponse.readJSON(bArr);
                } else {
                    readMsgpack = "application/x-msgpack".equals(str) ? BatchErrorResponse.readMsgpack(bArr) : null;
                }
                if (readMsgpack == null) {
                    return null;
                }
                if (readMsgpack.error != null && readMsgpack.error.code != 40020) {
                    throw AblyException.fromErrorInfo(readMsgpack.error);
                }
                return readMsgpack.batchResponse;
            } catch (IOException e) {
                throw AblyException.fromThrowable(e);
            }
        }
    }

    static {
        batchErrorBodyHandler = new BatchErrorBodyHandler();
        bulkResponseBodyHandler = new BulkResponseBodyHandler();
    }
}
