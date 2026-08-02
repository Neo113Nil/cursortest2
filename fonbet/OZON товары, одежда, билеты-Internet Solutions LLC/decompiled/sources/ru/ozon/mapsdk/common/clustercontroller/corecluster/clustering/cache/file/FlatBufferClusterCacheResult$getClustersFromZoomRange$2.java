package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Sc.s;
import Wc.a;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import we0.u;
import xe.M;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxe/M;", "", "", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "Lwe0/u;", "<anonymous>", "(Lxe/M;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterCacheResult$getClustersFromZoomRange$2", f = "FlatBufferClusterCacheResult.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlatBufferClusterCacheResult$getClustersFromZoomRange$2 extends j implements Function2<M, d<? super Map<Integer, ? extends ClusterizingResult<u>>>, Object> {
    final /* synthetic */ IntRange $zoomRange;
    int label;
    final /* synthetic */ FlatBufferClusterCacheResult this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "Lwe0/u;", "<anonymous>", "(I)Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterCacheResult$getClustersFromZoomRange$2$1", f = "FlatBufferClusterCacheResult.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterCacheResult$getClustersFromZoomRange$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Integer, d<? super ClusterizingResult<u>>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ FlatBufferClusterCacheResult this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FlatBufferClusterCacheResult flatBufferClusterCacheResult, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = flatBufferClusterCacheResult;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, d<? super ClusterizingResult<u>> dVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            int i12 = this.I$0;
            FlatBufferClusterCacheResult flatBufferClusterCacheResult = this.this$0;
            this.label = 1;
            Object clustersFromZoomLevel = flatBufferClusterCacheResult.getClustersFromZoomLevel(i12, this);
            return clustersFromZoomLevel == aVar ? aVar : clustersFromZoomLevel;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super ClusterizingResult<u>> dVar) {
            return invoke(num.intValue(), dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatBufferClusterCacheResult$getClustersFromZoomRange$2(FlatBufferClusterCacheResult flatBufferClusterCacheResult, IntRange intRange, d<? super FlatBufferClusterCacheResult$getClustersFromZoomRange$2> dVar) {
        super(2, dVar);
        this.this$0 = flatBufferClusterCacheResult;
        this.$zoomRange = intRange;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlatBufferClusterCacheResult$getClustersFromZoomRange$2(this.this$0, this.$zoomRange, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super Map<Integer, ? extends ClusterizingResult<u>>> dVar) {
        return invoke2(m11, (d<? super Map<Integer, ClusterizingResult<u>>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object associateWithNotNull;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        FlatBufferClusterCacheResult flatBufferClusterCacheResult = this.this$0;
        IntRange intRange = this.$zoomRange;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(flatBufferClusterCacheResult, null);
        this.label = 1;
        associateWithNotNull = flatBufferClusterCacheResult.associateWithNotNull(intRange, anonymousClass1, this);
        return associateWithNotNull == aVar ? aVar : associateWithNotNull;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super Map<Integer, ClusterizingResult<u>>> dVar) {
        return ((FlatBufferClusterCacheResult$getClustersFromZoomRange$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
