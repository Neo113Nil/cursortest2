package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f37269c = new a0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f37271b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final f0 f37270a = new G();

    public static a0 a() {
        return f37269c;
    }

    public e0 b(Class cls, e0 e0Var) {
        AbstractC3493z.b(cls, "messageType");
        AbstractC3493z.b(e0Var, "schema");
        return (e0) this.f37271b.putIfAbsent(cls, e0Var);
    }

    public e0 c(Class cls) {
        e0 b10;
        AbstractC3493z.b(cls, "messageType");
        e0 e0Var = (e0) this.f37271b.get(cls);
        return (e0Var != null || (b10 = b(cls, (e0Var = this.f37270a.createSchema(cls)))) == null) ? e0Var : b10;
    }

    public e0 d(Object obj) {
        return c(obj.getClass());
    }
}
