package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
final class O {

    /* renamed from: a, reason: collision with root package name */
    private static final M f59320a;

    /* renamed from: b, reason: collision with root package name */
    private static final N f59321b;

    static {
        M m11;
        int i11 = c0.f59349d;
        try {
            m11 = (M) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            m11 = null;
        }
        f59320a = m11;
        f59321b = new N();
    }

    static M a() {
        return f59320a;
    }

    static N b() {
        return f59321b;
    }
}
