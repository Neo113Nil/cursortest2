package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCache", f = "AbstractClusterCache.kt", l = {66}, m = "clearCacheSuspend$suspendImpl")
/* loaded from: classes3.dex */
final class AbstractClusterCache$clearCacheSuspend$1<T extends ClusterItem> extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractClusterCache<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClusterCache$clearCacheSuspend$1(AbstractClusterCache<T> abstractClusterCache, d<? super AbstractClusterCache$clearCacheSuspend$1> dVar) {
        super(dVar);
        this.this$0 = abstractClusterCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return AbstractClusterCache.clearCacheSuspend$suspendImpl(this.this$0, this);
    }
}
