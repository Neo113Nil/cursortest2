package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gf6 extends InputStream {
    public final /* synthetic */ int a;
    public final Object b;
    public int c;

    public /* synthetic */ gf6(InputStream inputStream, int i) {
        this.a = i;
        this.b = inputStream;
        this.c = 1073741824;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.a) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            default:
                return ((ByteBuffer) this.b).remaining();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 0:
                ((InputStream) this.b).close();
                break;
            case 1:
                ((InputStream) this.b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 2:
                synchronized (this) {
                    this.c = ((ByteBuffer) this.b).position();
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.a) {
            case 2:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                int read = ((InputStream) obj).read(bArr, i, i2);
                if (read == -1) {
                    this.c = 0;
                }
                return read;
            case 1:
                int read2 = ((InputStream) obj).read(bArr, i, i2);
                if (read2 == -1) {
                    this.c = 0;
                }
                return read2;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int min = Math.min(i2, byteBuffer.remaining());
                byteBuffer.get(bArr, i, min);
                return min;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        switch (this.a) {
            case 2:
                synchronized (this) {
                    int i = this.c;
                    if (i == -1) {
                        throw new IOException("Cannot reset to unset mark position");
                    }
                    ((ByteBuffer) this.b).position(i);
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((InputStream) obj).skip(j);
            case 1:
                return ((InputStream) obj).skip(j);
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1L;
                }
                long min = Math.min(j, byteBuffer.remaining());
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
        }
    }

    public gf6(ByteBuffer byteBuffer) {
        this.a = 2;
        this.c = -1;
        this.b = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int read = ((InputStream) obj).read();
                if (read == -1) {
                    this.c = 0;
                }
                return read;
            case 1:
                int read2 = ((InputStream) obj).read();
                if (read2 == -1) {
                    this.c = 0;
                }
                return read2;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                }
                return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        switch (this.a) {
            case 0:
                int read = ((InputStream) this.b).read(bArr);
                if (read == -1) {
                    this.c = 0;
                }
                return read;
            case 1:
                int read2 = ((InputStream) this.b).read(bArr);
                if (read2 == -1) {
                    this.c = 0;
                }
                return read2;
            default:
                return super.read(bArr);
        }
    }
}
