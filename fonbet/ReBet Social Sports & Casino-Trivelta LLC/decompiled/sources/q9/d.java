package q9;

import i9.InterfaceC4537b;

/* loaded from: classes2.dex */
public final class d implements InterfaceC4537b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f63446a = new d();
    }

    public static d a() {
        return a.f63446a;
    }

    public static InterfaceC6129a c() {
        return (InterfaceC6129a) i9.d.c(AbstractC6130b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6129a get() {
        return c();
    }
}
