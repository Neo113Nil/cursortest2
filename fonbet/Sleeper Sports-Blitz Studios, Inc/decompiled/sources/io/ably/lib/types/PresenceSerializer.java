package io.ably.lib.types;

import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* loaded from: classes9.dex */
public class PresenceSerializer {
    private static HttpCore.BodyHandler<PresenceMessage> presenceResponseHandler = new PresenceBodyHandler(null);
    private static final String TAG = PresenceSerializer.class.getName();

    public static PresenceMessage[] readMsgpackArray(MessageUnpacker messageUnpacker) throws IOException {
        int unpackArrayHeader = messageUnpacker.unpackArrayHeader();
        PresenceMessage[] presenceMessageArr = new PresenceMessage[unpackArrayHeader];
        for (int i = 0; i < unpackArrayHeader; i++) {
            presenceMessageArr[i] = PresenceMessage.fromMsgpack(messageUnpacker);
        }
        return presenceMessageArr;
    }

    public static PresenceMessage[] readMsgpack(byte[] bArr) throws AblyException {
        try {
            return readMsgpackArray(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static byte[] writeMsgpackArray(PresenceMessage[] presenceMessageArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MessagePacker newPacker = Serialisation.msgpackPackerConfig.newPacker(byteArrayOutputStream);
            writeMsgpackArray(presenceMessageArr, newPacker);
            newPacker.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public static void writeMsgpackArray(PresenceMessage[] presenceMessageArr, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(presenceMessageArr.length);
            for (PresenceMessage presenceMessage : presenceMessageArr) {
                presenceMessage.writeMsgpack(messagePacker);
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PresenceMessage[] readJson(byte[] bArr) throws IOException {
        return (PresenceMessage[]) Serialisation.gson.fromJson(new String(bArr), PresenceMessage[].class);
    }

    public static HttpCore.RequestBody asJsonRequest(PresenceMessage presenceMessage) throws AblyException {
        return asJsonRequest(new PresenceMessage[]{presenceMessage});
    }

    public static HttpCore.RequestBody asJsonRequest(PresenceMessage[] presenceMessageArr) {
        return new HttpUtils.JsonRequestBody(Serialisation.gson.toJson(presenceMessageArr));
    }

    public static HttpCore.BodyHandler<PresenceMessage> getPresenceResponseHandler(ChannelOptions channelOptions) {
        return channelOptions == null ? presenceResponseHandler : new PresenceBodyHandler(channelOptions);
    }

    private static class PresenceBodyHandler implements HttpCore.BodyHandler<PresenceMessage> {
        private ChannelOptions opts;

        PresenceBodyHandler(ChannelOptions channelOptions) {
            this.opts = channelOptions;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public PresenceMessage[] handleResponseBody(String str, byte[] bArr) throws AblyException {
            PresenceMessage[] readMsgpack;
            try {
                if ("application/json".equals(str)) {
                    readMsgpack = PresenceSerializer.readJson(bArr);
                } else {
                    readMsgpack = "application/x-msgpack".equals(str) ? PresenceSerializer.readMsgpack(bArr) : null;
                }
                if (readMsgpack != null) {
                    for (PresenceMessage presenceMessage : readMsgpack) {
                        try {
                            presenceMessage.decode(this.opts);
                        } catch (MessageDecodeException e) {
                            Log.e(PresenceSerializer.TAG, e.errorInfo.message);
                        }
                    }
                }
                return readMsgpack;
            } catch (IOException e2) {
                throw AblyException.fromThrowable(e2);
            }
        }
    }
}
