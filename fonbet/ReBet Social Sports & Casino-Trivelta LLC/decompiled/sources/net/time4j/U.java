package net.time4j;

/* loaded from: classes5.dex */
public final class U implements oi.v {

    /* renamed from: a, reason: collision with root package name */
    public final oi.v f57675a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f57676b;

    public U(oi.v vVar, Object obj) {
        this.f57675a = vVar;
        this.f57676b = obj;
    }

    public static U a(oi.v vVar, Object obj) {
        return new U(vVar, obj);
    }

    @Override // oi.v
    public Object apply(Object obj) {
        return this.f57675a.apply(obj);
    }
}
