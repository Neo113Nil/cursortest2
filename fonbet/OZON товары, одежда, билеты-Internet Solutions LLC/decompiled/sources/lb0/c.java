package lb0;

import Ld0.f;
import Od0.e;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import mb0.C8123a;
import org.jetbrains.annotations.NotNull;
import za0.InterfaceC11014a;

/* loaded from: classes7.dex */
public final class c extends e<InterfaceC11014a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7914a f73164a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Class<? extends InterfaceC11014a> f73165b;

    public c(@NotNull C7914a params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f73164a = params;
        this.f73165b = InterfaceC11014a.class;
    }

    @Override // Od0.d
    public final Ld0.e create(Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        Ba0.c.f3352a.d(new C7915b(store));
        return new C8123a.C1264a(this.f73164a).a();
    }

    @Override // Od0.d
    @NotNull
    public final List<f> createPluginProviderIntegration(@NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        Ba0.c.f3352a.d(new C7915b(diStore));
        return C7714v.a0(new Wa0.b(diStore.c().a()));
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends InterfaceC11014a> getKey() {
        return this.f73165b;
    }

    @Override // Od0.e
    @NotNull
    public final e.a handleDeeplink(@NotNull Ld0.c store, @NotNull e.b deeplink) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (store.c().b() == Nd0.b.RELEASE) {
            return new e.a.c();
        }
        e.a a11 = Wa0.a.a(store.c().a(), deeplink);
        if (a11 instanceof e.a.C0409a) {
            Ba0.c.f3352a.d(new C7915b(store));
        }
        return a11;
    }
}
