package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru.LruClusterCacheResult", f = "LruClusterCacheResult.kt", l = {24}, m = "saveClusters")
/* loaded from: classes3.dex */
final class LruClusterCacheResult$saveClusters$1 extends c {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LruClusterCacheResult<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LruClusterCacheResult$saveClusters$1(LruClusterCacheResult<T> lruClusterCacheResult, d<? super LruClusterCacheResult$saveClusters$1> dVar) {
        super(dVar);
        this.this$0 = lruClusterCacheResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.saveClusters(0, null, this);
    }
}
