package org.spongycastle.crypto;

/* loaded from: classes5.dex */
public abstract class A implements e, B {

    /* renamed from: a, reason: collision with root package name */
    public final e f62292a;

    public A(e eVar) {
        this.f62292a = eVar;
    }

    public abstract byte b(byte b10);

    public e c() {
        return this.f62292a;
    }

    @Override // org.spongycastle.crypto.B
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i12 + i11 > bArr2.length) {
            throw new l("output buffer too short");
        }
        int i13 = i10 + i11;
        if (i13 > bArr.length) {
            throw new l("input buffer too small");
        }
        while (i10 < i13) {
            bArr2[i12] = b(bArr[i10]);
            i12++;
            i10++;
        }
        return i11;
    }
}
