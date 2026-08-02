package k7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public final char[] f18883e;

    public j0(i0 i0Var) {
        super(i0Var, (Character) null);
        this.f18883e = new char[512];
        char[] cArr = i0Var.f18875b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i5 = 0; i5 < 256; i5++) {
            char[] cArr2 = this.f18883e;
            cArr2[i5] = cArr[i5 >>> 4];
            cArr2[i5 | 256] = cArr[i5 & 15];
        }
    }

    @Override // k7.l0
    public final void a(StringBuilder sb2, byte[] bArr, int i5) {
        a.n(0, i5, bArr.length);
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f18883e;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
