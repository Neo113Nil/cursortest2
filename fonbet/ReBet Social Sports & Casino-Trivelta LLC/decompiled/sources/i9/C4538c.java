package i9;

/* renamed from: i9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4538c implements InterfaceC4537b {

    /* renamed from: b, reason: collision with root package name */
    public static final C4538c f48186b = new C4538c(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f48187a;

    public C4538c(Object obj) {
        this.f48187a = obj;
    }

    public static InterfaceC4537b a(Object obj) {
        return new C4538c(d.c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f48187a;
    }
}
