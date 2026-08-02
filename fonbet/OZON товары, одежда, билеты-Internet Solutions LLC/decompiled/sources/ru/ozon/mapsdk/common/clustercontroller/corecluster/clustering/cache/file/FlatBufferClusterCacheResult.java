package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Sc.s;
import T7.E;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.Q;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult;
import we0.k;
import we0.u;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132$\u0010\u0017\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b2\u0006\u0010\r\u001a\u00020\fH\u0094@¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b0\u0018H\u0094@¢\u0006\u0004\b\"\u0010#J*\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b0\u00182\u0006\u0010%\u001a\u00020$H\u0094@¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b)\u0010#J\u0010\u0010*\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b*\u0010#R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R0\u00102\u001a\u001e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00020/j\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0002`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FlatBufferClusterCacheResult;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/AbstractClusterCacheResult;", "Lwe0/u;", "", "clusterItems", "Lwe0/k;", "clusteringOptions", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FileManager;", "", "fileManager", "<init>", "(Ljava/util/Collection;Lwe0/k;Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FileManager;)V", "", "zoomLevel", "", "getFileName", "(I)Ljava/lang/String;", "K", "V", "", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "block", "", "associateWithNotNull", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "clusterizingResult", "", "saveClusterResult", "(ILru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getClustersFromZoomLevel", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "getAllCachedClusters", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/ranges/IntRange;", "zoomRange", "getClustersFromZoomRange", "(Lkotlin/ranges/IntRange;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "isCacheExistSuspend", "clearSuspend", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FileManager;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FlatBufferClusterSerializer;", "flatBufferClusterSerializer", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/file/FlatBufferClusterSerializer;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "clusterItemsMap", "Ljava/util/HashMap;", "allSupportedZoomLevels", "Lkotlin/ranges/IntRange;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlatBufferClusterCacheResult extends AbstractClusterCacheResult<u> {

    @NotNull
    private final IntRange allSupportedZoomLevels;

    @NotNull
    private final HashMap<Long, u> clusterItemsMap;

    @NotNull
    private final FileManager<byte[]> fileManager;

    @NotNull
    private final FlatBufferClusterSerializer flatBufferClusterSerializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlatBufferClusterCacheResult(@NotNull Collection<u> clusterItems, @NotNull k clusteringOptions, @NotNull FileManager<byte[]> fileManager) {
        super(clusteringOptions);
        Intrinsics.checkNotNullParameter(clusterItems, "clusterItems");
        Intrinsics.checkNotNullParameter(clusteringOptions, "clusteringOptions");
        Intrinsics.checkNotNullParameter(fileManager, "fileManager");
        this.fileManager = fileManager;
        this.flatBufferClusterSerializer = new FlatBufferClusterSerializer();
        HashMap<Long, u> hashMap = new HashMap<>();
        Iterator<T> it = clusterItems.iterator();
        while (it.hasNext()) {
            hashMap.put(Long.valueOf(((u) r5).e().hashCode()), it.next());
        }
        this.clusterItemsMap = hashMap;
        this.allSupportedZoomLevels = new IntRange(0, 24, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0068 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> Object associateWithNotNull(Iterable<? extends K> iterable, Function2<? super K, ? super d<? super V>, ? extends Object> function2, d<? super Map<K, ? extends V>> dVar) {
        FlatBufferClusterCacheResult$associateWithNotNull$1 flatBufferClusterCacheResult$associateWithNotNull$1;
        int i11;
        Iterator<? extends K> it;
        Function2<? super K, ? super d<? super V>, ? extends Object> function22;
        Collection collection;
        if (dVar instanceof FlatBufferClusterCacheResult$associateWithNotNull$1) {
            flatBufferClusterCacheResult$associateWithNotNull$1 = (FlatBufferClusterCacheResult$associateWithNotNull$1) dVar;
            int i12 = flatBufferClusterCacheResult$associateWithNotNull$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                flatBufferClusterCacheResult$associateWithNotNull$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = flatBufferClusterCacheResult$associateWithNotNull$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = flatBufferClusterCacheResult$associateWithNotNull$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    ArrayList arrayList = new ArrayList();
                    it = iterable.iterator();
                    function22 = function2;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = flatBufferClusterCacheResult$associateWithNotNull$1.L$3;
                    it = (Iterator) flatBufferClusterCacheResult$associateWithNotNull$1.L$2;
                    collection = (Collection) flatBufferClusterCacheResult$associateWithNotNull$1.L$1;
                    Function2<? super K, ? super d<? super V>, ? extends Object> function23 = (Function2) flatBufferClusterCacheResult$associateWithNotNull$1.L$0;
                    s.b(obj);
                    Pair pair = obj == null ? new Pair(obj2, obj) : null;
                    if (pair != null) {
                        collection.add(pair);
                    }
                    function22 = function23;
                    if (it.hasNext()) {
                        Object next = it.next();
                        flatBufferClusterCacheResult$associateWithNotNull$1.L$0 = function22;
                        flatBufferClusterCacheResult$associateWithNotNull$1.L$1 = collection;
                        flatBufferClusterCacheResult$associateWithNotNull$1.L$2 = it;
                        flatBufferClusterCacheResult$associateWithNotNull$1.L$3 = next;
                        flatBufferClusterCacheResult$associateWithNotNull$1.label = 1;
                        Object invoke = function22.invoke(next, flatBufferClusterCacheResult$associateWithNotNull$1);
                        if (invoke == aVar) {
                            return aVar;
                        }
                        function23 = function22;
                        obj2 = next;
                        obj = invoke;
                        if (obj == null) {
                        }
                        if (pair != null) {
                        }
                        function22 = function23;
                        if (it.hasNext()) {
                            return U.s((List) collection);
                        }
                    }
                }
            }
        }
        flatBufferClusterCacheResult$associateWithNotNull$1 = new FlatBufferClusterCacheResult$associateWithNotNull$1(this, dVar);
        Object obj3 = flatBufferClusterCacheResult$associateWithNotNull$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = flatBufferClusterCacheResult$associateWithNotNull$1.label;
        if (i11 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFileName(int zoomLevel) {
        return E.a(zoomLevel, "placemarks_cache_", ".fb");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearSuspend(@NotNull d<? super Unit> dVar) {
        FlatBufferClusterCacheResult$clearSuspend$1 flatBufferClusterCacheResult$clearSuspend$1;
        int i11;
        FlatBufferClusterCacheResult flatBufferClusterCacheResult;
        Iterator<Integer> it;
        if (dVar instanceof FlatBufferClusterCacheResult$clearSuspend$1) {
            flatBufferClusterCacheResult$clearSuspend$1 = (FlatBufferClusterCacheResult$clearSuspend$1) dVar;
            int i12 = flatBufferClusterCacheResult$clearSuspend$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                flatBufferClusterCacheResult$clearSuspend$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = flatBufferClusterCacheResult$clearSuspend$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = flatBufferClusterCacheResult$clearSuspend$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    flatBufferClusterCacheResult = this;
                    it = this.allSupportedZoomLevels.iterator();
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) flatBufferClusterCacheResult$clearSuspend$1.L$1;
                    flatBufferClusterCacheResult = (FlatBufferClusterCacheResult) flatBufferClusterCacheResult$clearSuspend$1.L$0;
                    s.b(obj);
                }
                while (it.hasNext()) {
                    int b11 = ((Q) it).b();
                    FileManager<byte[]> fileManager = flatBufferClusterCacheResult.fileManager;
                    String fileName = flatBufferClusterCacheResult.getFileName(b11);
                    flatBufferClusterCacheResult$clearSuspend$1.L$0 = flatBufferClusterCacheResult;
                    flatBufferClusterCacheResult$clearSuspend$1.L$1 = it;
                    flatBufferClusterCacheResult$clearSuspend$1.label = 1;
                    if (fileManager.removeFile(fileName, flatBufferClusterCacheResult$clearSuspend$1) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
        }
        flatBufferClusterCacheResult$clearSuspend$1 = new FlatBufferClusterCacheResult$clearSuspend$1(this, dVar);
        Object obj2 = flatBufferClusterCacheResult$clearSuspend$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = flatBufferClusterCacheResult$clearSuspend$1.label;
        if (i11 != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.f71690a;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getAllCachedClusters(@NotNull d<? super Map<Integer, ClusterizingResult<u>>> dVar) {
        return C10727i.f(C10720e0.a(), new FlatBufferClusterCacheResult$getAllCachedClusters$2(this, null), dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getClustersFromZoomLevel(int i11, @NotNull d<? super ClusterizingResult<u>> dVar) {
        return C10727i.f(C10720e0.a(), new FlatBufferClusterCacheResult$getClustersFromZoomLevel$2(this, i11, null), dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult
    protected Object getClustersFromZoomRange(@NotNull IntRange intRange, @NotNull d<? super Map<Integer, ClusterizingResult<u>>> dVar) {
        return C10727i.f(C10720e0.a(), new FlatBufferClusterCacheResult$getClustersFromZoomRange$2(this, intRange, null), dVar);
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.AbstractClusterCacheResult, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult
    public Object isCacheExistSuspend(@NotNull d<? super Boolean> dVar) {
        Iterable iterable = this.allSupportedZoomLevels;
        boolean z11 = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (this.fileManager.isFileExist(getFileName(((Q) it).b()))) {
                    z11 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z11);
    }

    public final Object saveClusterResult(int i11, @NotNull ClusterizingResult<u> clusterizingResult, @NotNull d<? super Unit> dVar) {
        Object f7 = C10727i.f(C10720e0.a(), new FlatBufferClusterCacheResult$saveClusterResult$2(this, i11, clusterizingResult, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
