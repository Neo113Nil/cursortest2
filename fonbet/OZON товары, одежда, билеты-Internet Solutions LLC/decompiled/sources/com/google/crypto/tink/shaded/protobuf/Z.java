package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
final class Z {

    /* renamed from: a, reason: collision with root package name */
    private static final X f59345a;

    /* renamed from: b, reason: collision with root package name */
    private static final Y f59346b;

    static {
        X x11;
        int i11 = c0.f59349d;
        try {
            x11 = (X) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            x11 = null;
        }
        f59345a = x11;
        f59346b = new Y();
    }

    static X a() {
        return f59345a;
    }

    static Y b() {
        return f59346b;
    }
}
