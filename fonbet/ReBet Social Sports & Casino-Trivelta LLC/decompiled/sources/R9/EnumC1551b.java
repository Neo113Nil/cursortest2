package R9;

/* renamed from: R9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1551b implements com.google.android.gms.fido.fido2.api.common.a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    /* renamed from: a, reason: collision with root package name */
    public final int f10125a;

    EnumC1551b(int i10) {
        this.f10125a = i10;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.a
    public int a() {
        return this.f10125a;
    }
}
