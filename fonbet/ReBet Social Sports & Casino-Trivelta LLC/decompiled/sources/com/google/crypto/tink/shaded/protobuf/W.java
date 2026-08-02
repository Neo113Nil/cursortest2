package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final U f37265a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final U f37266b = new V();

    public static U a() {
        return f37265a;
    }

    public static U b() {
        return f37266b;
    }

    public static U c() {
        try {
            return (U) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
