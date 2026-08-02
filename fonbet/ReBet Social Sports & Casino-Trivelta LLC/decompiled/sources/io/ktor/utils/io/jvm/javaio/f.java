package io.ktor.utils.io.jvm.javaio;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f49515a = new ThreadLocal();

    public static final e a() {
        e eVar = (e) f49515a.get();
        return eVar == null ? c.f49505a : eVar;
    }

    public static final boolean b() {
        return a() != g.f49516a;
    }
}
