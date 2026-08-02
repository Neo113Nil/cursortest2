package fe0;

import Ae.M0;
import De.C2862e;
import ce0.InterfaceC5817a;
import de0.C6193b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm;
import we0.k;
import we0.x;
import xe0.InterfaceC10767f;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10767f f63359a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC5817a f63360b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M0<x> f63361c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ee0.i f63362d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f63363e;

    public i(@NotNull InterfaceC10767f placemarkControllerFactory, @NotNull InterfaceC5817a cameraController, @NotNull M0 mapState, @NotNull ee0.i customProjection, @NotNull C2862e coroutineScope) {
        Intrinsics.checkNotNullParameter(placemarkControllerFactory, "placemarkControllerFactory");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(mapState, "mapState");
        Intrinsics.checkNotNullParameter(customProjection, "customProjection");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f63359a = placemarkControllerFactory;
        this.f63360b = cameraController;
        this.f63361c = mapState;
        this.f63362d = customProjection;
        this.f63363e = coroutineScope;
    }

    @NotNull
    public final C6547a a(@NotNull Function2 clusterView, @NotNull k options, @NotNull Algorithm algorithm, @NotNull C6193b clusterizerMode) {
        Intrinsics.checkNotNullParameter(clusterView, "clusterView");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(clusterizerMode, "clusterizerMode");
        ee0.e eVar = new ee0.e(clusterView, this.f63359a.b(), this.f63363e);
        boolean z11 = algorithm instanceof ScreenBasedAlgorithm;
        ee0.i iVar = this.f63362d;
        if (!z11) {
            return new C6547a(P4.f.b("toString(...)"), algorithm, options, this.f63360b, eVar, iVar, clusterizerMode);
        }
        return new j(P4.f.b("toString(...)"), options, this.f63360b, eVar, this.f63361c, (ScreenBasedAlgorithm) algorithm, iVar, clusterizerMode);
    }
}
