package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class aek extends UploadDataProvider {
    public volatile FileChannel a;
    public final zdk b;
    public final Object c = new Object();

    public aek(zdk zdkVar) {
        this.b = zdkVar;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return h().size();
    }

    public final FileChannel h() {
        if (this.a == null) {
            synchronized (this.c) {
                try {
                    if (this.a == null) {
                        this.a = this.b.c();
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            a70.r("Cronet passed a buffer with no bytes remaining");
            return;
        }
        FileChannel h = h();
        int i = 0;
        while (i == 0) {
            int read = h.read(byteBuffer);
            if (read == -1) {
                break;
            } else {
                i += read;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        h().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
