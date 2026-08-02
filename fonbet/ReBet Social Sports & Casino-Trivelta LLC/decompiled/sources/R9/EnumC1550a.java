package R9;

/* renamed from: R9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1550a implements com.google.android.gms.fido.fido2.api.common.a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);


    /* renamed from: a, reason: collision with root package name */
    public final int f10116a;

    EnumC1550a(int i10) {
        this.f10116a = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.a
    public int a() {
        return this.f10116a;
    }
}
