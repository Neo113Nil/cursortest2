package io.sentry;

import com.facebook.hermes.intl.Constants;
import java.util.List;

/* loaded from: classes3.dex */
public final class E1 {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.u f50256a;

    /* renamed from: b, reason: collision with root package name */
    public d4 f50257b;

    /* renamed from: c, reason: collision with root package name */
    public d4 f50258c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f50259d;

    /* renamed from: e, reason: collision with root package name */
    public final C4734d f50260e;

    public E1() {
        this(new io.sentry.protocol.u(), new d4(), null, null, null);
    }

    public static E1 a(ILogger iLogger, String str, List list, F3 f32) {
        if (str == null) {
            return new E1();
        }
        try {
            return b(new L3(str), C4734d.g(list, iLogger), null, f32);
        } catch (io.sentry.exception.b e10) {
            iLogger.a(EnumC4788n3.DEBUG, e10, "Failed to parse Sentry trace header: %s", e10.getMessage());
            return new E1();
        }
    }

    public static E1 b(L3 l32, C4734d c4734d, d4 d4Var, F3 f32) {
        if (f32 != null && !io.sentry.util.H.h(f32, c4734d)) {
            f32.getLogger().c(EnumC4788n3.DEBUG, "Not continuing trace due to strict org ID validation failure.", new Object[0]);
            return new E1();
        }
        if (d4Var == null) {
            d4Var = new d4();
        }
        return new E1(l32.b(), d4Var, l32.a(), c4734d, l32.d());
    }

    public C4734d c() {
        return this.f50260e;
    }

    public d4 d() {
        return this.f50258c;
    }

    public Double e() {
        Double o10 = this.f50260e.o();
        return Double.valueOf(o10 == null ? 0.0d : o10.doubleValue());
    }

    public d4 f() {
        return this.f50257b;
    }

    public io.sentry.protocol.u g() {
        return this.f50256a;
    }

    public Boolean h() {
        return this.f50259d;
    }

    public a4 i() {
        a4 a4Var = new a4(this.f50256a, this.f50257b, Constants.COLLATION_DEFAULT, null, null);
        a4Var.v("auto");
        return a4Var;
    }

    public j4 j() {
        return this.f50260e.T();
    }

    public E1(E1 e12) {
        this(e12.g(), e12.f(), e12.d(), e12.c(), e12.h());
    }

    public E1(io.sentry.protocol.u uVar, d4 d4Var, d4 d4Var2, C4734d c4734d, Boolean bool) {
        this.f50256a = uVar;
        this.f50257b = d4Var;
        this.f50258c = d4Var2;
        this.f50260e = io.sentry.util.H.e(c4734d, bool, null, null);
        this.f50259d = bool;
    }
}
