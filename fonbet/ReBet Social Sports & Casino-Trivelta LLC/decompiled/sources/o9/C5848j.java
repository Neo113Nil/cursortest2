package o9;

import i9.InterfaceC4537b;

/* renamed from: o9.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5848j implements InterfaceC4537b {

    /* renamed from: o9.j$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C5848j f59541a = new C5848j();
    }

    public static C5848j a() {
        return a.f59541a;
    }

    public static AbstractC5843e c() {
        return (AbstractC5843e) i9.d.c(AbstractC5844f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5843e get() {
        return c();
    }
}
