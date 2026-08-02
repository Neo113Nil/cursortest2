package fe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.u;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer", f = "BasePlacemarkClusterizer.kt", l = {352, 354}, m = "updateVisiblePoints")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6547a f63354d;

    /* renamed from: e, reason: collision with root package name */
    we0.i f63355e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f63356f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C6547a<Algorithm<u>> f63357g;

    /* renamed from: h, reason: collision with root package name */
    int f63358h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(C6547a c6547a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f63357g = c6547a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object I11;
        this.f63356f = obj;
        this.f63358h |= LinearLayoutManager.INVALID_OFFSET;
        I11 = this.f63357g.I(null, null, 0.0f, this);
        return I11;
    }
}
