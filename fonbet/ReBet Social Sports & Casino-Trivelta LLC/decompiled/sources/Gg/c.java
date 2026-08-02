package Gg;

/* loaded from: classes4.dex */
public final class c implements b, Fg.a {

    /* renamed from: b, reason: collision with root package name */
    public static final c f3953b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f3954a;

    public c(Object obj) {
        this.f3954a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f3954a;
    }
}
