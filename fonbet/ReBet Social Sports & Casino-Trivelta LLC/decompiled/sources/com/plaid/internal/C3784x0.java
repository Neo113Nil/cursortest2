package com.plaid.internal;

/* renamed from: com.plaid.internal.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3784x0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f41181a;

    public C3784x0(String str) {
        W3 w32 = Z3.f39803a;
        this.f41181a = str.concat(": ");
    }

    public final String a(String str, Object... objArr) {
        if (objArr.length == 0) {
            return this.f41181a + str;
        }
        try {
            return this.f41181a + String.format(str, objArr);
        } catch (Exception e10) {
            return this.f41181a + str + "... {format error " + e10.getMessage() + "}";
        }
    }

    public final void a(W3 w32, String str, Object... objArr) {
        W3 w33 = Z3.f39803a;
        if (w32.f39739a <= Z3.f39803a.f39739a) {
            Z3.f39805c.a(w32, a(str, objArr));
        }
    }

    public final void a(Exception exc, String str) {
        W3 w32 = W3.ERROR;
        W3 w33 = Z3.f39803a;
        if (w32.f39739a <= Z3.f39803a.f39739a) {
            Z3.f39805c.a(w32, a(str, new Object[0]), exc);
        }
    }
}
