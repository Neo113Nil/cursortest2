package defpackage;

import java.io.OutputStream;
import java.security.SecureRandom;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o1l extends OutputStream {
    public OutputStream a;
    public boolean b;
    public byte[] c;
    public byte[] d;
    public m1l e;
    public SecureRandom f;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1l m1lVar = new m1l();
        m1lVar.a = (byte) (dmi.a(4) | 128);
        m1lVar.b = false;
        m1lVar.c = 0L;
        byte[] bArr = this.d;
        int b = m1lVar.b(bArr.length, bArr);
        OutputStream outputStream = this.a;
        outputStream.write(bArr, 0, b);
        outputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        OutputStream outputStream = this.a;
        byte[] bArr2 = this.d;
        m1l m1lVar = this.e;
        m1lVar.c = i2;
        if (this.b) {
            int nextInt = this.f.nextInt();
            m1lVar.b = true;
            m1lVar.d = nextInt;
            m1lVar.e = 0;
        }
        int b = m1lVar.b(bArr2.length, bArr2);
        int min = Math.min(i2, bArr2.length - b);
        System.arraycopy(bArr, i, bArr2, b, min);
        m1lVar.a(b, min, bArr2);
        outputStream.write(bArr2, 0, b + min);
        if (min < i2) {
            int i3 = i + min;
            int i4 = i2 - min;
            m1lVar.a(i3, i4, bArr);
            outputStream.write(bArr, i3, i4);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.c;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
