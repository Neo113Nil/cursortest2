package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru.LruClusterCache", f = "LruClusterCache.kt", l = {52, 54}, m = "calcCache")
/* loaded from: classes3.dex */
final class LruClusterCache$calcCache$3 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LruClusterCache<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LruClusterCache$calcCache$3(LruClusterCache<T> lruClusterCache, d<? super LruClusterCache$calcCache$3> dVar) {
        super(dVar);
        this.this$0 = lruClusterCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.calcCache(null, null, null, this);
    }
}
