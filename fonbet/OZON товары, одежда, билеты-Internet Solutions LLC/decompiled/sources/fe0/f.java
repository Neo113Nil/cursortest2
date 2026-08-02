package fe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import fe0.C6547a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.u;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer", f = "BasePlacemarkClusterizer.kt", l = {310, 315, 320, 327}, m = "handleClusterizerUpdateEvenets")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6547a f63344d;

    /* renamed from: e, reason: collision with root package name */
    C6547a.b.C1013a f63345e;

    /* renamed from: f, reason: collision with root package name */
    float f63346f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f63347g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C6547a<Algorithm<u>> f63348h;

    /* renamed from: i, reason: collision with root package name */
    int f63349i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(C6547a c6547a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f63348h = c6547a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f63347g = obj;
        this.f63349i |= LinearLayoutManager.INVALID_OFFSET;
        return C6547a.t(this.f63348h, null, this);
    }
}
