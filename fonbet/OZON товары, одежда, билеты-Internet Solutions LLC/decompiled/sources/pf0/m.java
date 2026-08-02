package pf0;

import Cf0.J;
import We.A;
import We.E;
import fg0.C6563b;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.initializers.whitelisting.WhitelistingInitializer$init$1;
import vf0.InterfaceC10316b;

/* loaded from: classes7.dex */
public final class m implements InterfaceC8924g, l {

    /* renamed from: a, reason: collision with root package name */
    private static volatile J f80514a;

    public static final class a {
        @NotNull
        public static J a() {
            J j11 = m.f80514a;
            if (j11 != null) {
                return j11;
            }
            throw new RuntimeException("NetworkDi must be initialized.");
        }
    }

    public m(@NotNull Ld0.c store, @NotNull K hostInterceptors) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(hostInterceptors, "hostInterceptors");
        f80514a = new J(store, hostInterceptors);
    }

    @Override // pf0.h
    @NotNull
    public final String A() {
        return a.a().r().B().a().b();
    }

    @Override // pf0.h
    public final Retrofit H(@NotNull i config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (a.a().m().b(config.getConsumer())) {
            return j(config);
        }
        return null;
    }

    @Override // pf0.h
    @NotNull
    public final InterfaceC10316b d() {
        return a.a().t().getValue();
    }

    @Override // pf0.h
    @NotNull
    public final Retrofit j(@NotNull i config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Retrofit.Builder client = new Retrofit.Builder().client(y(config));
        A.a aVar = new A.a();
        aVar.s("https");
        aVar.j(a.a().j().a());
        Retrofit build = client.baseUrl(aVar.e()).addCallAdapterFactory(new C6563b()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @Override // pf0.InterfaceC8924g
    public final void o(@NotNull WhitelistingInitializer$init$1 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        wf0.c.c(config);
    }

    @Override // Ld0.e
    public final void onInstantPluginsCreated() {
    }

    @Override // pf0.h
    @NotNull
    public final wf0.a u() {
        return wf0.c.a();
    }

    @Override // pf0.h
    @NotNull
    public final InterfaceC8918a x() {
        return a.a().i();
    }

    @Override // pf0.h
    @NotNull
    public final E y(@NotNull i config) {
        Intrinsics.checkNotNullParameter(config, "config");
        E e11 = a.a().q().e(config);
        return config.getIsPerfMetricsEnabled() ? new k(e11) : e11;
    }
}
