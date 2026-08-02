package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.CalcCacheConfig;
import we0.k;
import we0.u;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.FlatBufferClusterCache$calcCache$2", f = "FlatBufferClusterCache.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 38, 46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlatBufferClusterCache$calcCache$2 extends j implements Function2<M, d<? super List<? extends Unit>>, Object> {
    final /* synthetic */ Algorithm<u> $algorithm;
    final /* synthetic */ CalcCacheConfig $calcCacheConfig;
    final /* synthetic */ FlatBufferClusterCacheResult $clusterCacheResult;
    final /* synthetic */ k $clusteringOptions;
    final /* synthetic */ IntRange $zoomRange;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlatBufferClusterCache$calcCache$2(CalcCacheConfig calcCacheConfig, IntRange intRange, Algorithm<u> algorithm, k kVar, FlatBufferClusterCacheResult flatBufferClusterCacheResult, d<? super FlatBufferClusterCache$calcCache$2> dVar) {
        super(2, dVar);
        this.$calcCacheConfig = calcCacheConfig;
        this.$zoomRange = intRange;
        this.$algorithm = algorithm;
        this.$clusteringOptions = kVar;
        this.$clusterCacheResult = flatBufferClusterCacheResult;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FlatBufferClusterCache$calcCache$2 flatBufferClusterCache$calcCache$2 = new FlatBufferClusterCache$calcCache$2(this.$calcCacheConfig, this.$zoomRange, this.$algorithm, this.$clusteringOptions, this.$clusterCacheResult, dVar);
        flatBufferClusterCache$calcCache$2.L$0 = obj;
        return flatBufferClusterCache$calcCache$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends Unit>> dVar) {
        return invoke2(m11, (d<? super List<Unit>>) dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
    
        if (r13 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00c5 -> B:13:0x00cc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Algorithm<u> algorithm;
        k kVar;
        FlatBufferClusterCacheResult flatBufferClusterCacheResult;
        Object arrayList;
        C7665d it;
        Algorithm<u> algorithm2;
        k kVar2;
        FlatBufferClusterCacheResult flatBufferClusterCacheResult2;
        Object obj2;
        C7665d c7665d;
        ?? r22;
        int i11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        if (i12 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            if (this.$calcCacheConfig.getIsSequentialCalculation()) {
                IntRange intRange = this.$zoomRange;
                algorithm = this.$algorithm;
                kVar = this.$clusteringOptions;
                flatBufferClusterCacheResult = this.$clusterCacheResult;
                arrayList = new ArrayList(C7714v.z(intRange, 10));
                it = intRange.iterator();
                if (it.hasNext()) {
                }
            } else {
                IntRange intRange2 = this.$zoomRange;
                Algorithm<u> algorithm3 = this.$algorithm;
                k kVar3 = this.$clusteringOptions;
                FlatBufferClusterCacheResult flatBufferClusterCacheResult3 = this.$clusterCacheResult;
                ArrayList arrayList2 = new ArrayList(C7714v.z(intRange2, 10));
                C7665d it2 = intRange2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C10727i.a(m11, null, null, new FlatBufferClusterCache$calcCache$2$2$1(algorithm3, it2.b(), kVar3, flatBufferClusterCacheResult3, null), 3));
                }
                this.label = 3;
                obj = C10721f.a(arrayList2, this);
            }
        } else {
            if (i12 == 1) {
                i11 = this.I$0;
                r22 = (Collection) this.L$5;
                ?? r52 = (Iterator) this.L$4;
                Object obj3 = (Collection) this.L$3;
                flatBufferClusterCacheResult2 = (FlatBufferClusterCacheResult) this.L$2;
                kVar2 = (k) this.L$1;
                algorithm2 = (Algorithm) this.L$0;
                s.b(obj);
                c7665d = r52;
                obj2 = obj3;
                this.L$0 = algorithm2;
                this.L$1 = kVar2;
                this.L$2 = flatBufferClusterCacheResult2;
                this.L$3 = obj2;
                this.L$4 = c7665d;
                this.L$5 = r22;
                this.label = 2;
                if (flatBufferClusterCacheResult2.saveClusterResult(i11, (ClusterizingResult) obj, this) != aVar) {
                }
                return aVar;
            }
            if (i12 == 2) {
                Collection collection = (Collection) this.L$5;
                ?? r23 = (Iterator) this.L$4;
                Object obj4 = (Collection) this.L$3;
                flatBufferClusterCacheResult = (FlatBufferClusterCacheResult) this.L$2;
                k kVar4 = (k) this.L$1;
                Algorithm<u> algorithm4 = (Algorithm) this.L$0;
                s.b(obj);
                it = r23;
                kVar = kVar4;
                arrayList = obj4;
                collection.add(Unit.f71690a);
                algorithm = algorithm4;
                if (it.hasNext()) {
                    int b11 = it.b();
                    this.L$0 = algorithm;
                    this.L$1 = kVar;
                    this.L$2 = flatBufferClusterCacheResult;
                    this.L$3 = arrayList;
                    this.L$4 = it;
                    this.L$5 = arrayList;
                    this.I$0 = b11;
                    this.label = 1;
                    Object clusters = algorithm.getClusters(b11, kVar, this);
                    if (clusters != aVar) {
                        algorithm2 = algorithm;
                        i11 = b11;
                        c7665d = it;
                        obj = clusters;
                        kVar2 = kVar;
                        r22 = arrayList;
                        flatBufferClusterCacheResult2 = flatBufferClusterCacheResult;
                        obj2 = r22;
                        this.L$0 = algorithm2;
                        this.L$1 = kVar2;
                        this.L$2 = flatBufferClusterCacheResult2;
                        this.L$3 = obj2;
                        this.L$4 = c7665d;
                        this.L$5 = r22;
                        this.label = 2;
                        if (flatBufferClusterCacheResult2.saveClusterResult(i11, (ClusterizingResult) obj, this) != aVar) {
                            FlatBufferClusterCacheResult flatBufferClusterCacheResult4 = flatBufferClusterCacheResult2;
                            arrayList = obj2;
                            flatBufferClusterCacheResult = flatBufferClusterCacheResult4;
                            collection = r22;
                            it = c7665d;
                            kVar = kVar2;
                            algorithm4 = algorithm2;
                            collection.add(Unit.f71690a);
                            algorithm = algorithm4;
                            if (it.hasNext()) {
                                return (List) arrayList;
                            }
                        }
                    }
                    return aVar;
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
        }
        return (List) obj;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<Unit>> dVar) {
        return ((FlatBufferClusterCache$calcCache$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
