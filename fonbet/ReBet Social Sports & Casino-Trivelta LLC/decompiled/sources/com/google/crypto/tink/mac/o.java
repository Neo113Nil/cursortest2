package com.google.crypto.tink.mac;

import com.google.crypto.tink.proto.J;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37169a = new k().d();

    /* renamed from: b, reason: collision with root package name */
    public static final J f37170b;

    /* renamed from: c, reason: collision with root package name */
    public static final J f37171c;

    /* renamed from: d, reason: collision with root package name */
    public static final J f37172d;

    static {
        J P10 = J.P();
        f37170b = P10;
        f37171c = P10;
        f37172d = P10;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        r.f();
        h.d();
        k.p(true);
        if (Wa.a.a()) {
            return;
        }
        c.o(true);
    }
}
