package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sb2 extends FilterInputStream {
    public final /* synthetic */ int a = 2;
    public long b;
    public long c;

    public sb2(long j, InputStream inputStream) {
        super(inputStream);
        this.c = -1L;
        inputStream.getClass();
        zzguk.b("limit must be non-negative", j >= 0);
        this.b = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        long min;
        switch (this.a) {
            case 0:
                min = Math.min(((FilterInputStream) this).in.available(), this.b);
                break;
            case 1:
            default:
                return super.available();
            case 2:
                min = Math.min(((FilterInputStream) this).in.available(), this.b);
                break;
        }
        return (int) min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.c = this.b;
                }
                return;
            case 1:
            default:
                super.mark(i);
                return;
            case 2:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.c = this.b;
                }
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                long j = this.b;
                if (j == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
                if (read != -1) {
                    this.b -= read;
                }
                return read;
            case 1:
                int read2 = super.read(bArr, i, i2);
                if (read2 != -1) {
                    this.c += read2;
                }
                return read2;
            default:
                long j2 = this.b;
                if (j2 == 0) {
                    return -1;
                }
                int read3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j2));
                if (read3 != -1) {
                    this.b -= read3;
                }
                return read3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.c == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.b = this.c;
                }
                return;
            case 1:
            default:
                super.reset();
                return;
            case 2:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.c == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.b = this.c;
                }
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        switch (this.a) {
            case 0:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.b));
                this.b -= skip;
                return skip;
            case 1:
            default:
                return super.skip(j);
            case 2:
                long skip2 = ((FilterInputStream) this).in.skip(Math.min(j, this.b));
                this.b -= skip2;
                return skip2;
        }
    }

    public sb2(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.b = j;
    }

    public sb2(InputStream inputStream) {
        super(inputStream);
        this.c = -1L;
        this.b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.a) {
            case 0:
                if (this.b == 0) {
                    return -1;
                }
                int read = ((FilterInputStream) this).in.read();
                if (read != -1) {
                    this.b--;
                }
                return read;
            case 1:
                int read2 = super.read();
                if (read2 != -1) {
                    this.c++;
                }
                return read2;
            default:
                if (this.b == 0) {
                    return -1;
                }
                int read3 = ((FilterInputStream) this).in.read();
                if (read3 != -1) {
                    this.b--;
                }
                return read3;
        }
    }
}
