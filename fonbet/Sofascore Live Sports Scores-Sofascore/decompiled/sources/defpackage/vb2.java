package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vb2 extends cc2 {
    public final int e;
    public final int f;

    public vb2(byte[] bArr, int i, int i2) {
        super(bArr);
        cc2.d(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.cc2
    public final byte c(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            hc5.h(ljg.j(i, "Index < 0: "));
            return (byte) 0;
        }
        hc5.h(dmi.k(i, i2, "Index > length: ", ", "));
        return (byte) 0;
    }

    @Override // defpackage.cc2
    public final int m() {
        return this.e;
    }

    @Override // defpackage.cc2
    public final byte n(int i) {
        return this.b[this.e + i];
    }

    @Override // defpackage.cc2
    public final int size() {
        return this.f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int i = this.f;
        if (i == 0) {
            bArr = u7a.b;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(this.b, this.e, bArr2, 0, i);
            bArr = bArr2;
        }
        return new cc2(bArr);
    }
}
