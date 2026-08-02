package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ydk extends UploadDataProvider {
    public final ByteBuffer a;

    public ydk(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            a70.r("Cronet passed a buffer with no bytes remaining");
            return;
        }
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.a;
        if (remaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
        } else {
            int limit = byteBuffer2.limit();
            byteBuffer2.limit(byteBuffer.remaining() + byteBuffer2.position());
            byteBuffer.put(byteBuffer2);
            byteBuffer2.limit(limit);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
