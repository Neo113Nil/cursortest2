package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cp3 extends FilterInputStream {
    public final long a;
    public int b;

    public cp3(long j, InputStream inputStream) {
        super(inputStream);
        this.a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.a - this.b, ((FilterInputStream) this).in.available());
    }

    public final void e(int i) {
        int i2 = this.b;
        if (i >= 0) {
            this.b = i2 + i;
            return;
        }
        long j = this.a;
        if (j - i2 <= 0) {
            return;
        }
        StringBuilder o = ljg.o("Failed to read all expected data, expected: ", j, ", but read: ");
        o.append(this.b);
        throw new IOException(o.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        e(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        e(read);
        return read;
    }
}
