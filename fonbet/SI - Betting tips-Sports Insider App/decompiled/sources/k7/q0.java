package k7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 extends r0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f18907d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18908e;

    public q0(byte[] bArr, int i5, int i10) {
        super(bArr);
        r0.g(i5, i5 + i10, bArr.length);
        this.f18907d = i5;
        this.f18908e = i10;
    }

    @Override // k7.r0
    public final byte a(int i5) {
        int i10 = this.f18908e;
        if (((i10 - (i5 + 1)) | i5) >= 0) {
            return this.f18915b[this.f18907d + i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.c1.i(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Index > length: ", ", ", i10));
    }

    @Override // k7.r0
    public final byte b(int i5) {
        return this.f18915b[this.f18907d + i5];
    }

    @Override // k7.r0
    public final int c() {
        return this.f18907d;
    }

    @Override // k7.r0
    public final int d() {
        return this.f18908e;
    }

    @Override // k7.r0
    public final void e(int i5, byte[] bArr) {
        System.arraycopy(this.f18915b, this.f18907d, bArr, 0, i5);
    }
}
