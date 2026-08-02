package Qa;

/* renamed from: Qa.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1523m implements InterfaceC1522l {

    /* renamed from: b, reason: collision with root package name */
    public static final C1523m f9595b = new C1523m(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f9596a;

    public C1523m(Object obj) {
        this.f9596a = obj;
    }

    public static InterfaceC1522l b(Object obj) {
        if (obj != null) {
            return new C1523m(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // Qa.o
    public final Object a() {
        return this.f9596a;
    }
}
