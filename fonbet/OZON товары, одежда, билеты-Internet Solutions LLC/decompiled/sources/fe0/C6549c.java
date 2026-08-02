package fe0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.u;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer", f = "BasePlacemarkClusterizer.kt", l = {338, 340}, m = "clusterize")
/* renamed from: fe0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6549c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6547a f63329d;

    /* renamed from: e, reason: collision with root package name */
    we0.i f63330e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f63331f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C6547a<Algorithm<u>> f63332g;

    /* renamed from: h, reason: collision with root package name */
    int f63333h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6549c(C6547a c6547a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f63332g = c6547a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object v11;
        this.f63331f = obj;
        this.f63333h |= LinearLayoutManager.INVALID_OFFSET;
        v11 = this.f63332g.v(null, null, 0.0f, this);
        return v11;
    }
}
