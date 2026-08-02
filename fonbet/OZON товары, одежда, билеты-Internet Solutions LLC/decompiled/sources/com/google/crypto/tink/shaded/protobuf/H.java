package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
final class H {

    /* renamed from: a, reason: collision with root package name */
    private static final F f59309a;

    /* renamed from: b, reason: collision with root package name */
    private static final G f59310b;

    static {
        F f7;
        int i11 = c0.f59349d;
        try {
            f7 = (F) Class.forName("com.google.crypto.tink.shaded.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            f7 = null;
        }
        f59309a = f7;
        f59310b = new G();
    }

    static F a() {
        return f59309a;
    }

    static G b() {
        return f59310b;
    }
}
