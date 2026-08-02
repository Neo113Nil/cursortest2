package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f19461c = new b0();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f19462d = false;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f19464b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final g0 f19463a = new H();

    public static b0 a() {
        return f19461c;
    }

    public f0 b(Class cls, f0 f0Var) {
        AbstractC2149y.b(cls, "messageType");
        AbstractC2149y.b(f0Var, "schema");
        return (f0) this.f19464b.putIfAbsent(cls, f0Var);
    }

    public f0 c(Class cls) {
        f0 b10;
        AbstractC2149y.b(cls, "messageType");
        f0 f0Var = (f0) this.f19464b.get(cls);
        return (f0Var != null || (b10 = b(cls, (f0Var = this.f19463a.createSchema(cls)))) == null) ? f0Var : b10;
    }

    public f0 d(Object obj) {
        return c(obj.getClass());
    }
}
