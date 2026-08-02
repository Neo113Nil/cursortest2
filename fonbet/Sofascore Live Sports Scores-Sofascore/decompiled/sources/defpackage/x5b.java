package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x5b extends OutputStream {
    public long a;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.a += i2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a++;
    }
}
