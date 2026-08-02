package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5912s {

    /* renamed from: a, reason: collision with root package name */
    private static final r f59461a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5911q<?> f59462b;

    static {
        AbstractC5911q<?> abstractC5911q;
        int i11 = c0.f59349d;
        try {
            abstractC5911q = (AbstractC5911q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC5911q = null;
        }
        f59462b = abstractC5911q;
    }

    static AbstractC5911q<?> a() {
        AbstractC5911q<?> abstractC5911q = f59462b;
        if (abstractC5911q != null) {
            return abstractC5911q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static r b() {
        return f59461a;
    }
}
