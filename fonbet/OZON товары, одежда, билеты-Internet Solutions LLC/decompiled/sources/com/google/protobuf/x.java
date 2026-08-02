package com.google.protobuf;

/* loaded from: classes.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final w f60241a;

    /* renamed from: b, reason: collision with root package name */
    private static final MapFieldSchemaLite f60242b;

    static {
        w wVar;
        int i11 = C5950a.f60193b;
        try {
            wVar = (w) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            wVar = null;
        }
        f60241a = wVar;
        f60242b = new MapFieldSchemaLite();
    }

    static w a() {
        return f60241a;
    }

    static MapFieldSchemaLite b() {
        return f60242b;
    }
}
