package g9;

import i9.InterfaceC4537b;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class k implements InterfaceC4537b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f47204a = new k();
    }

    public static k a() {
        return a.f47204a;
    }

    public static Executor b() {
        return (Executor) i9.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
