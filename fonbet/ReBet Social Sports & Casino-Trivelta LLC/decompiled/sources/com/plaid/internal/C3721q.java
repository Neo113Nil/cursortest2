package com.plaid.internal;

/* renamed from: com.plaid.internal.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3721q extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final T0 f40981a;

    public C3721q(T0 t02) {
        this.f40981a = t02;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb2 = new StringBuilder("errorCode=");
        sb2.append(this.f40981a);
        if (super.getMessage() == null) {
            str = "";
        } else {
            str = "; " + super.getMessage();
        }
        sb2.append(str);
        return sb2.toString();
    }

    public C3721q(T0 t02, String str) {
        super(str);
        this.f40981a = t02;
    }

    public C3721q(T0 t02, Exception exc) {
        super(exc);
        this.f40981a = t02;
    }
}
