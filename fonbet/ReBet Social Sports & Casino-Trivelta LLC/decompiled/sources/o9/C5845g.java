package o9;

import i9.InterfaceC4537b;

/* renamed from: o9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5845g implements InterfaceC4537b {

    /* renamed from: o9.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C5845g f59538a = new C5845g();
    }

    public static C5845g a() {
        return a.f59538a;
    }

    public static String b() {
        return (String) i9.d.c(AbstractC5844f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
