package com.google.crypto.tink.aead;

import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3446a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f36910a = new C3450e().d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f36911b = new p().d();

    /* renamed from: c, reason: collision with root package name */
    public static final String f36912c = new u().d();

    /* renamed from: d, reason: collision with root package name */
    public static final String f36913d = new C3453h().d();

    /* renamed from: e, reason: collision with root package name */
    public static final String f36914e = new D().d();

    /* renamed from: f, reason: collision with root package name */
    public static final String f36915f = new F().d();

    /* renamed from: g, reason: collision with root package name */
    public static final String f36916g = new z().d();

    /* renamed from: h, reason: collision with root package name */
    public static final String f36917h = new H().d();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.crypto.tink.proto.J f36918i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.google.crypto.tink.proto.J f36919j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.crypto.tink.proto.J f36920k;

    static {
        com.google.crypto.tink.proto.J P10 = com.google.crypto.tink.proto.J.P();
        f36918i = P10;
        f36919j = P10;
        f36920k = P10;
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
        C3449d.e();
        com.google.crypto.tink.mac.o.b();
        C3450e.p(true);
        p.o(true);
        if (Wa.a.a()) {
            return;
        }
        C3453h.o(true);
        u.p(true);
        z.m(true);
        D.m(true);
        F.m(true);
        H.m(true);
    }
}
