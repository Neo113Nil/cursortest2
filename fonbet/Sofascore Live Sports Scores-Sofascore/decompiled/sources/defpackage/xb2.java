package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xb2 extends ec2 {
    public final int e;
    public final int f;

    public xb2(byte[] bArr, int i, int i2) {
        super(bArr);
        ec2.d(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.ec2
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

    @Override // defpackage.ec2
    public final void m(int i, byte[] bArr) {
        System.arraycopy(this.b, this.e, bArr, 0, i);
    }

    @Override // defpackage.ec2
    public final int n() {
        return this.e;
    }

    @Override // defpackage.ec2
    public final byte o(int i) {
        return this.b[this.e + i];
    }

    @Override // defpackage.ec2
    public final int size() {
        return this.f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = w7a.b;
        } else {
            byte[] bArr2 = new byte[size];
            m(size, bArr2);
            bArr = bArr2;
        }
        return new ec2(bArr);
    }
}
