package s10;

import QZ.a;
import androidx.lifecycle.w0;
import f00.InterfaceC6396b;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l10.f;
import m20.InterfaceC8046a;
import n20.k;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes7.dex */
public final class c extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9583b f98125a;

    public c(@NotNull K00.a network, @NotNull RZ.a analytics, @NotNull k<? extends InterfaceC8046a<?, ? extends l20.c>> widgetStore, @NotNull a.C0454a<l> builder, @NotNull E10.c prefetchManager, @NotNull X10.f widgetViewAsyncCreator, @NotNull f.EnumC1196f initialTopSpacerType, @NotNull InterfaceC6396b composerDebugMenuFlagsManagerLibsApi) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        Intrinsics.checkNotNullParameter(widgetViewAsyncCreator, "widgetViewAsyncCreator");
        Intrinsics.checkNotNullParameter(initialTopSpacerType, "initialTopSpacerType");
        Intrinsics.checkNotNullParameter(composerDebugMenuFlagsManagerLibsApi, "composerDebugMenuFlagsManagerLibsApi");
        network.getClass();
        analytics.getClass();
        widgetStore.getClass();
        initialTopSpacerType.getClass();
        composerDebugMenuFlagsManagerLibsApi.getClass();
        this.f98125a = new j(new d(), network, analytics, widgetStore, builder, prefetchManager, widgetViewAsyncCreator, initialTopSpacerType, composerDebugMenuFlagsManagerLibsApi);
    }

    @NotNull
    public final InterfaceC9583b d0() {
        return this.f98125a;
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        super.onCleared();
        j jVar = (j) this.f98125a;
        jVar.i().a(K.f71697a);
        jVar.getComposerStore().a();
    }
}
