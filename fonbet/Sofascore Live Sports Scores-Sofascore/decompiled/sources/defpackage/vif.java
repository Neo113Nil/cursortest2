package defpackage;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vif extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ xif c;

    public vif(xif xifVar, uif uifVar) {
        this.c = xifVar;
        this.a = xifVar.t(uifVar.b + 4);
        this.b = uifVar.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            yhk.s("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.a;
        xif xifVar = this.c;
        xifVar.m(i4, i, i2, bArr);
        this.a = xifVar.t(this.a + i2);
        this.b -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() {
        xif xifVar = this.c;
        RandomAccessFile randomAccessFile = xifVar.a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.a);
        int read = randomAccessFile.read();
        this.a = xifVar.t(this.a + 1);
        this.b--;
        return read;
    }
}
