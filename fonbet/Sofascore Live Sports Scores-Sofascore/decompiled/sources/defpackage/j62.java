package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j62 extends OutputStream {
    public final FileOutputStream a;
    public byte[] b;
    public final kn4 c;
    public int d;

    public j62(FileOutputStream fileOutputStream, kn4 kn4Var) {
        this.a = fileOutputStream;
        this.c = kn4Var;
        this.b = (byte[]) kn4Var.d(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.b;
            if (bArr != null) {
                this.c.j(bArr);
                this.b = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i = this.d;
        FileOutputStream fileOutputStream = this.a;
        if (i > 0) {
            fileOutputStream.write(this.b, 0, i);
            this.d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.d;
            FileOutputStream fileOutputStream = this.a;
            if (i6 == 0 && i4 >= this.b.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.b.length - i6);
            System.arraycopy(bArr, i5, this.b, this.d, min);
            int i7 = this.d + min;
            this.d = i7;
            i3 += min;
            byte[] bArr2 = this.b;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.d = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.b;
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.a.write(bArr, 0, i3);
        this.d = 0;
    }
}
