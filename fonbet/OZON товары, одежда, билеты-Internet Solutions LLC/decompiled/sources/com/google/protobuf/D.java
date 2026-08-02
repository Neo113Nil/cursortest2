package com.google.protobuf;

/* loaded from: classes.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    private static final C f60107a;

    /* renamed from: b, reason: collision with root package name */
    private static final NewInstanceSchemaLite f60108b;

    static {
        C c11;
        int i11 = C5950a.f60193b;
        try {
            c11 = (C) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c11 = null;
        }
        f60107a = c11;
        f60108b = new NewInstanceSchemaLite();
    }

    static C a() {
        return f60107a;
    }

    static NewInstanceSchemaLite b() {
        return f60108b;
    }
}
