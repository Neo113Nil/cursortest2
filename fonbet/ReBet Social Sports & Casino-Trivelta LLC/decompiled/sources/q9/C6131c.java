package q9;

import i9.InterfaceC4537b;

/* renamed from: q9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6131c implements InterfaceC4537b {

    /* renamed from: q9.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C6131c f63445a = new C6131c();
    }

    public static C6131c a() {
        return a.f63445a;
    }

    public static InterfaceC6129a b() {
        return (InterfaceC6129a) i9.d.c(AbstractC6130b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6129a get() {
        return b();
    }
}
