package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3486s {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3485q f37413a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC3485q f37414b = c();

    public static AbstractC3485q a() {
        AbstractC3485q abstractC3485q = f37414b;
        if (abstractC3485q != null) {
            return abstractC3485q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC3485q b() {
        return f37413a;
    }

    public static AbstractC3485q c() {
        try {
            return (AbstractC3485q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
