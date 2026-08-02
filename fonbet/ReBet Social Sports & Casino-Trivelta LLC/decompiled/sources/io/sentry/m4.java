package io.sentry;

import com.facebook.hermes.intl.Constants;

/* loaded from: classes3.dex */
public final class m4 extends a4 {

    /* renamed from: t, reason: collision with root package name */
    public static final io.sentry.protocol.E f52195t = io.sentry.protocol.E.CUSTOM;

    /* renamed from: p, reason: collision with root package name */
    public String f52196p;

    /* renamed from: q, reason: collision with root package name */
    public io.sentry.protocol.E f52197q;

    /* renamed from: r, reason: collision with root package name */
    public l4 f52198r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f52199s;

    public m4(String str, String str2) {
        this(str, str2, (l4) null);
    }

    public static m4 z(E1 e12) {
        Boolean h10 = e12.h();
        C4734d c10 = e12.c();
        return new m4(e12.g(), e12.f(), e12.d(), h10 == null ? null : new l4(h10, c10.p(), e12.e()), c10);
    }

    public String A() {
        return this.f52196p;
    }

    public l4 B() {
        return this.f52198r;
    }

    public io.sentry.protocol.E C() {
        return this.f52197q;
    }

    public void D(boolean z10) {
        this.f52199s = z10;
    }

    public void E(String str) {
        this.f52196p = (String) io.sentry.util.w.c(str, "name is required");
    }

    public void F(io.sentry.protocol.E e10) {
        this.f52197q = e10;
    }

    public m4(String str, io.sentry.protocol.E e10, String str2) {
        this(str, e10, str2, null);
    }

    public m4(String str, String str2, l4 l4Var) {
        this(str, io.sentry.protocol.E.CUSTOM, str2, l4Var);
    }

    public m4(String str, io.sentry.protocol.E e10, String str2, l4 l4Var) {
        super(str2);
        this.f52199s = false;
        this.f52196p = (String) io.sentry.util.w.c(str, "name is required");
        this.f52197q = e10;
        w(l4Var);
        this.f50605m = io.sentry.util.H.d(null, l4Var);
    }

    public m4(io.sentry.protocol.u uVar, d4 d4Var, d4 d4Var2, l4 l4Var, C4734d c4734d) {
        super(uVar, d4Var, Constants.COLLATION_DEFAULT, d4Var2, null);
        this.f52199s = false;
        this.f52196p = "<unlabeled transaction>";
        this.f52198r = l4Var;
        this.f52197q = f52195t;
        this.f50605m = io.sentry.util.H.d(c4734d, l4Var);
    }
}
