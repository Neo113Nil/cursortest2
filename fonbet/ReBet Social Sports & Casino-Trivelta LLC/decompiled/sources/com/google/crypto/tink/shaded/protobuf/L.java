package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final J f37244a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final J f37245b = new K();

    public static J a() {
        return f37244a;
    }

    public static J b() {
        return f37245b;
    }

    public static J c() {
        try {
            return (J) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
