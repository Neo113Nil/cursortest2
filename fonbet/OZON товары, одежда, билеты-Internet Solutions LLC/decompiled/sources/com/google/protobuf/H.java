package com.google.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class H {

    /* renamed from: c, reason: collision with root package name */
    private static final H f60120c = new H();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f60122b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final ManifestSchemaFactory f60121a = new ManifestSchemaFactory();

    private H() {
    }

    public static H a() {
        return f60120c;
    }

    public final <T> J<T> b(Class<T> cls) {
        Internal.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f60122b;
        J<T> j11 = (J) concurrentHashMap.get(cls);
        if (j11 == null) {
            j11 = this.f60121a.createSchema(cls);
            Internal.a(j11, "schema");
            J<T> j12 = (J) concurrentHashMap.putIfAbsent(cls, j11);
            if (j12 != null) {
                return j12;
            }
        }
        return j11;
    }

    public final <T> J<T> c(T t2) {
        return b(t2.getClass());
    }

    public final void d(Object obj, BinaryWriter binaryWriter) throws IOException {
        c(obj).writeTo(obj, binaryWriter);
    }
}
