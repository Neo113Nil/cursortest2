package fe0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import ce0.InterfaceC5817a;
import de0.C6193b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm;
import we0.k;
import we0.u;
import we0.x;
import xe.B0;
import xe.E0;

/* loaded from: classes3.dex */
public final class j extends C6547a<ScreenBasedAlgorithm<u>> {

    /* renamed from: v, reason: collision with root package name */
    private B0 f63364v;

    /* synthetic */ class a extends C7719a implements Function2<x, kotlin.coroutines.d<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, kotlin.coroutines.d<? super Unit> dVar) {
            j jVar = (j) this.receiver;
            jVar.getClass();
            x e11 = xVar.e();
            jVar.b().updateViewSize(e11.d(), e11.c());
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.ScreenBasedPlacemarkClusterizer", f = "ScreenBasedPlacemarkClusterizer.kt", l = {58}, m = "getClustersForSameZoom")
    static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f63365d;

        /* renamed from: f, reason: collision with root package name */
        int f63367f;

        b(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f63365d = obj;
            this.f63367f |= LinearLayoutManager.INVALID_OFFSET;
            return j.this.A(0.0f, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull String id2, @NotNull k clusteringOptions, @NotNull InterfaceC5817a cameraController, @NotNull ee0.e render, @NotNull M0<x> mapState, @NotNull ScreenBasedAlgorithm<u> screenBasedAlgorithm, @NotNull ee0.i customProjection, @NotNull C6193b clusterizerMode) {
        super(id2, screenBasedAlgorithm, clusteringOptions, cameraController, render, customProjection, clusterizerMode);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(clusteringOptions, "clusteringOptions");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(render, "render");
        Intrinsics.checkNotNullParameter(mapState, "mapState");
        Intrinsics.checkNotNullParameter(screenBasedAlgorithm, "screenBasedAlgorithm");
        Intrinsics.checkNotNullParameter(customProjection, "customProjection");
        Intrinsics.checkNotNullParameter(clusterizerMode, "clusterizerMode");
        b().onCameraChange(cameraController.getCurrentPosition());
        this.f63364v = C2399j.C(new C2408n0(mapState, new a(2, this, j.class, "updateViewport", "updateViewport(Lru/ozon/mapsdk/common/model/MapState;)V", 4)), C());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // fe0.C6547a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object A(float f7, @NotNull k kVar, @NotNull kotlin.coroutines.d<? super ClusterizingResult<u>> dVar) {
        b bVar;
        int i11;
        ClusterizingResult clusterizingResult;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.f63367f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f63367f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f63365d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f63367f;
                if (i11 != 0) {
                    s.b(obj);
                    ScreenBasedAlgorithm<u> b11 = b();
                    bVar.f63367f = 1;
                    obj = b11.getClustersForSameZoomLevel(f7, kVar, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                clusterizingResult = (ClusterizingResult) obj;
                if (clusterizingResult.isEmpty()) {
                    return clusterizingResult;
                }
                return null;
            }
        }
        bVar = new b((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = bVar.f63365d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f63367f;
        if (i11 != 0) {
        }
        clusterizingResult = (ClusterizingResult) obj2;
        if (clusterizingResult.isEmpty()) {
        }
    }

    @Override // fe0.C6547a
    protected final void E(@NotNull we0.h cameraPositionUpdate) {
        Intrinsics.checkNotNullParameter(cameraPositionUpdate, "cameraPositionUpdate");
        b().onCameraChange(cameraPositionUpdate.a());
    }

    @Override // fe0.C6547a
    protected final Object F(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object c11;
        B0 b02 = this.f63364v;
        return (b02 == null || (c11 = E0.c(b02, dVar)) != Wc.a.COROUTINE_SUSPENDED) ? Unit.f71690a : c11;
    }
}
