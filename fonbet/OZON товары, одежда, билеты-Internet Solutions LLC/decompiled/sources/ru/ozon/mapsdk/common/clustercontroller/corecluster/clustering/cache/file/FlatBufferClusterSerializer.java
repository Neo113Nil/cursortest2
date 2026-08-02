package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.flatbuffers.b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model.CacheCluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model.CacheClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model.CacheClusterList;
import we0.u;
import xe.N;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FlatBufferClusterSerializer;", "", "<init>", "()V", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "Lwe0/u;", "data", "", "serialize", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;)[B", "bytes", "", "", "mapOfItmes", "deserialize", "([BLjava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlatBufferClusterSerializer {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(@NotNull byte[] bArr, @NotNull Map<Long, u> map, @NotNull d<? super ClusterizingResult<u>> dVar) {
        FlatBufferClusterSerializer$deserialize$1 flatBufferClusterSerializer$deserialize$1;
        int i11;
        int i12;
        CacheClusterList cacheClusterList;
        Map<Long, u> map2;
        HashSet hashSet;
        int itemsLength;
        if (dVar instanceof FlatBufferClusterSerializer$deserialize$1) {
            flatBufferClusterSerializer$deserialize$1 = (FlatBufferClusterSerializer$deserialize$1) dVar;
            int i13 = flatBufferClusterSerializer$deserialize$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                flatBufferClusterSerializer$deserialize$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = flatBufferClusterSerializer$deserialize$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = flatBufferClusterSerializer$deserialize$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    CacheClusterList rootAsCacheClusterList = CacheClusterList.getRootAsCacheClusterList(ByteBuffer.wrap(bArr));
                    HashSet hashSet2 = new HashSet();
                    int clustersLength = rootAsCacheClusterList.clustersLength();
                    int max = Math.max(Runtime.getRuntime().availableProcessors() - 2, 1);
                    int min = Math.min(max, clustersLength);
                    FlatBufferClusterSerializer$deserialize$2 flatBufferClusterSerializer$deserialize$2 = new FlatBufferClusterSerializer$deserialize$2(min, min > 0 ? (clustersLength / max) + 1 : 0, clustersLength, rootAsCacheClusterList, map, hashSet2, null);
                    flatBufferClusterSerializer$deserialize$1.L$0 = map;
                    flatBufferClusterSerializer$deserialize$1.L$1 = rootAsCacheClusterList;
                    flatBufferClusterSerializer$deserialize$1.L$2 = hashSet2;
                    flatBufferClusterSerializer$deserialize$1.label = 1;
                    if (N.d(flatBufferClusterSerializer$deserialize$2, flatBufferClusterSerializer$deserialize$1) == aVar) {
                        return aVar;
                    }
                    cacheClusterList = rootAsCacheClusterList;
                    map2 = map;
                    hashSet = hashSet2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hashSet = (HashSet) flatBufferClusterSerializer$deserialize$1.L$2;
                    cacheClusterList = (CacheClusterList) flatBufferClusterSerializer$deserialize$1.L$1;
                    map2 = (Map) flatBufferClusterSerializer$deserialize$1.L$0;
                    s.b(obj);
                }
                itemsLength = cacheClusterList.itemsLength();
                ArrayList arrayList = new ArrayList(itemsLength);
                for (i12 = 0; i12 < itemsLength; i12++) {
                    u uVar = map2.get(new Long(cacheClusterList.items(i12).id()));
                    if (uVar != null) {
                        arrayList.add(uVar);
                    }
                }
                return new ClusterizingResult(hashSet, arrayList);
            }
        }
        flatBufferClusterSerializer$deserialize$1 = new FlatBufferClusterSerializer$deserialize$1(this, dVar);
        Object obj2 = flatBufferClusterSerializer$deserialize$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = flatBufferClusterSerializer$deserialize$1.label;
        if (i11 != 0) {
        }
        itemsLength = cacheClusterList.itemsLength();
        ArrayList arrayList2 = new ArrayList(itemsLength);
        while (i12 < itemsLength) {
        }
        return new ClusterizingResult(hashSet, arrayList2);
    }

    @NotNull
    public final byte[] serialize(@NotNull ClusterizingResult<u> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        b bVar = new b(0);
        Set<Cluster<u>> calculatedClusters = data.getCalculatedClusters();
        ArrayList arrayList = new ArrayList(C7714v.z(calculatedClusters, 10));
        Iterator<T> it = calculatedClusters.iterator();
        while (it.hasNext()) {
            Collection items = ((Cluster) it.next()).getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            Collection collection = items;
            ArrayList arrayList2 = new ArrayList(C7714v.z(collection, 10));
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((u) it2.next()).e().hashCode()));
            }
            arrayList.add(Integer.valueOf(CacheCluster.createCacheCluster(bVar, CacheCluster.createItemIdsVector(bVar, C7714v.V0(arrayList2)))));
        }
        int createClustersVector = CacheClusterList.createClustersVector(bVar, C7714v.T0(arrayList));
        Collection<u> calculatedClusterItems = data.getCalculatedClusterItems();
        ArrayList arrayList3 = new ArrayList(C7714v.z(calculatedClusterItems, 10));
        Iterator<T> it3 = calculatedClusterItems.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Long.valueOf(((u) it3.next()).e().hashCode()));
        }
        long[] V02 = C7714v.V0(arrayList3);
        ArrayList arrayList4 = new ArrayList(V02.length);
        for (long j11 : V02) {
            arrayList4.add(Integer.valueOf(CacheClusterItem.createCacheClusterItem(bVar, j11)));
        }
        bVar.f(CacheClusterList.createCacheClusterList(bVar, createClustersVector, CacheClusterList.createItemsVector(bVar, C7714v.T0(arrayList4))));
        byte[] k11 = bVar.k();
        Intrinsics.checkNotNullExpressionValue(k11, "sizedByteArray(...)");
        return k11;
    }
}
