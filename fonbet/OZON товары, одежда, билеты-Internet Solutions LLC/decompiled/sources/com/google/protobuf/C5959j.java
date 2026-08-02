package com.google.protobuf;

/* renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5959j {

    /* renamed from: a, reason: collision with root package name */
    private static final ExtensionSchemaLite f60210a = new ExtensionSchemaLite();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5958i<?> f60211b;

    static {
        AbstractC5958i<?> abstractC5958i;
        int i11 = C5950a.f60193b;
        try {
            abstractC5958i = (AbstractC5958i) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC5958i = null;
        }
        f60211b = abstractC5958i;
    }

    static AbstractC5958i<?> a() {
        AbstractC5958i<?> abstractC5958i = f60211b;
        if (abstractC5958i != null) {
            return abstractC5958i;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static ExtensionSchemaLite b() {
        return f60210a;
    }
}
