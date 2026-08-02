package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCache", f = "AbstractClusterCache.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "setCalcAlgorithmSuspend")
/* loaded from: classes3.dex */
final class AbstractClusterCache$setCalcAlgorithmSuspend$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractClusterCache<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClusterCache$setCalcAlgorithmSuspend$1(AbstractClusterCache<T> abstractClusterCache, d<? super AbstractClusterCache$setCalcAlgorithmSuspend$1> dVar) {
        super(dVar);
        this.this$0 = abstractClusterCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.setCalcAlgorithmSuspend(null, this);
    }
}
