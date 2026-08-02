package com.plaid.internal;

/* loaded from: classes3.dex */
public final class r extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC3684l7 f41008a;

    public r(EnumC3684l7 enumC3684l7) {
        super("device descriptor contains an error");
        this.f41008a = enumC3684l7;
    }

    public final T0 a() {
        return getCause() instanceof C3721q ? ((C3721q) getCause()).f40981a : T0.GENERIC_UNKNOWN_REASON;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "step=" + this.f41008a + "; " + super.getMessage();
    }

    public r(EnumC3684l7 enumC3684l7, Throwable th2) {
        super(th2.getMessage(), th2);
        this.f41008a = enumC3684l7;
    }
}
