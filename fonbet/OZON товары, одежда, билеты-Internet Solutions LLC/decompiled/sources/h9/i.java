package h9;

/* loaded from: classes9.dex */
public final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    private final j f65107c;

    public i(j jVar) {
        super(jVar.d(), jVar.a());
        this.f65107c = jVar;
    }

    @Override // h9.j
    public final byte[] b() {
        byte[] b11 = this.f65107c.b();
        int a11 = a() * d();
        byte[] bArr = new byte[a11];
        for (int i11 = 0; i11 < a11; i11++) {
            bArr[i11] = (byte) (255 - (b11[i11] & 255));
        }
        return bArr;
    }

    @Override // h9.j
    public final byte[] c(int i11, byte[] bArr) {
        byte[] c11 = this.f65107c.c(i11, bArr);
        int d11 = d();
        for (int i12 = 0; i12 < d11; i12++) {
            c11[i12] = (byte) (255 - (c11[i12] & 255));
        }
        return c11;
    }

    @Override // h9.j
    public final boolean e() {
        return this.f65107c.e();
    }

    @Override // h9.j
    public final j f() {
        return new i(this.f65107c.f());
    }
}
