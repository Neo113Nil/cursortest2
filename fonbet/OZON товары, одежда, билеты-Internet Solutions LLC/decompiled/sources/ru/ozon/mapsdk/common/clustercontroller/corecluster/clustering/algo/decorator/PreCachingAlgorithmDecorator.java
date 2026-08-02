package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterItem;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.ScreenBasedAlgorithm;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCache;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.ClusterCacheResult;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.lru.LruClusterCache;
import we0.k;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;
import xe.Y;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 D*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001DB\u0017\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u001d\u0010\u001f\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u0017J&\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020!2\u0006\u0010\"\u001a\u00020\rH\u0096@¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u001dR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R.\u00103\u001a\u0004\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u00010/8\u0000@BX\u0081\u000e¢\u0006\u0012\n\u0004\b3\u00101\u0012\u0004\b6\u0010\u001d\u001a\u0004\b4\u00105R.\u00107\u001a\u0004\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u00010/8\u0000@BX\u0081\u000e¢\u0006\u0012\n\u0004\b7\u00101\u0012\u0004\b9\u0010\u001d\u001a\u0004\b8\u00105R \u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000:8@X\u0081\u0004¢\u0006\f\u0012\u0004\b=\u0010\u001d\u001a\u0004\b;\u0010<R$\u0010C\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/PreCachingAlgorithmDecorator;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/AlgorithmDecorator;", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "algorithm", "<init>", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;)V", "", "clearCache", "()Lkotlin/Unit;", "", "discreteZoom", "Lwe0/k;", "options", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterizingResult;", "getClustersInternal", "(ILwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "zoom", "precacheZoomLevel", "item", "", "addItem", "(Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;)Z", "", "items", "addItems", "(Ljava/util/Collection;)Z", "clearItems", "()V", "removeItem", "removeItems", "updateItem", "", "clusteringOptions", "getClusters", "(FLwe0/k;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dispose", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/lru/LruClusterCache;", "lruClusterCache", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/lru/LruClusterCache;", "Lxe/M;", "scope", "Lxe/M;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Lxe/B0;", "clearCacheJob", "Lxe/B0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "nextZoomCalcJob", "getNextZoomCalcJob$mapsdk_fullFirebaseOpenglRelease", "()Lxe/B0;", "getNextZoomCalcJob$mapsdk_fullFirebaseOpenglRelease$annotations", "prevZoomCalcJob", "getPrevZoomCalcJob$mapsdk_fullFirebaseOpenglRelease", "getPrevZoomCalcJob$mapsdk_fullFirebaseOpenglRelease$annotations", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCacheResult;", "getLruCacheResult$mapsdk_fullFirebaseOpenglRelease", "()Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/cache/ClusterCacheResult;", "getLruCacheResult$mapsdk_fullFirebaseOpenglRelease$annotations", "lruCacheResult", "getMaxDistanceBetweenClusteredItems", "()I", "setMaxDistanceBetweenClusteredItems", "(I)V", "maxDistanceBetweenClusteredItems", "Companion", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreCachingAlgorithmDecorator<T extends ClusterItem> extends AlgorithmDecorator<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ReentrantReadWriteLock cacheLock;
    private B0 clearCacheJob;

    @NotNull
    private final LruClusterCache<T> lruClusterCache;
    private B0 nextZoomCalcJob;
    private B0 prevZoomCalcJob;

    @NotNull
    private final M scope;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\t¨\u0006\n"}, d2 = {"Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/PreCachingAlgorithmDecorator$Companion;", "", "<init>", "()V", "create", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/decorator/PreCachingAlgorithmDecorator;", "T", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/ClusterItem;", "algorithm", "Lru/ozon/mapsdk/common/clustercontroller/corecluster/clustering/algo/Algorithm;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends ClusterItem> PreCachingAlgorithmDecorator<T> create(@NotNull Algorithm<T> algorithm) {
            Intrinsics.checkNotNullParameter(algorithm, "algorithm");
            if ((algorithm instanceof AlgorithmDecorator) || (algorithm instanceof ScreenBasedAlgorithm)) {
                return null;
            }
            return new PreCachingAlgorithmDecorator<>(algorithm);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreCachingAlgorithmDecorator(@NotNull Algorithm<T> algorithm) {
        super(algorithm);
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        this.lruClusterCache = new LruClusterCache<>(5, algorithm);
        this.scope = N.a(C10720e0.a().plus(X0.b()));
        this.cacheLock = new ReentrantReadWriteLock();
    }

    private final Unit clearCache() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.cacheLock;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Unit unit = null;
            this.clearCacheJob = C10727i.c(this.scope, null, null, new PreCachingAlgorithmDecorator$clearCache$1$1(this, null), 3);
            B0 b02 = this.nextZoomCalcJob;
            if (b02 != null) {
                b02.j(null);
            }
            B0 b03 = this.prevZoomCalcJob;
            if (b03 != null) {
                b03.j(null);
                unit = Unit.f71690a;
            }
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            return unit;
        } catch (Throwable th2) {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(6:(1:(1:(1:(11:13|14|15|16|(1:18)|20|21|(1:23)|24|25|26)(2:35|36))(8:37|38|39|40|41|42|(9:45|16|(0)|20|21|(0)|24|25|26)|44))(12:53|54|55|56|57|58|(3:60|(4:62|41|42|(0))|44)|21|(0)|24|25|26))(4:69|70|71|72)|29|(1:31)|32|33|34)(9:85|(1:87)(1:103)|88|(1:90)|91|92|93|94|(3:96|(1:98)|44)(5:100|74|75|(9:77|57|58|(0)|21|(0)|24|25|26)|44))|73|74|75|(0)|44))|104|6|7|(0)(0)|73|74|75|(0)|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0198, code lost:
    
        r2 = r3;
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0173 A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #7 {all -> 0x017d, blocks: (B:15:0x003d, B:16:0x016f, B:18:0x0173), top: B:14:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018d A[LOOP:0: B:22:0x018b->B:23:0x018d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019e A[LOOP:1: B:30:0x019c->B:31:0x019e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b A[Catch: all -> 0x0187, TRY_LEAVE, TryCatch #3 {all -> 0x0187, blocks: (B:58:0x0127, B:60:0x012b), top: B:57:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getClustersInternal(int i11, k kVar, d<? super ClusterizingResult<T>> dVar) {
        PreCachingAlgorithmDecorator$getClustersInternal$1 preCachingAlgorithmDecorator$getClustersInternal$1;
        Object obj;
        a aVar;
        int i12;
        ReentrantReadWriteLock.WriteLock writeLock;
        ReentrantReadWriteLock.ReadLock readLock;
        int i13;
        int i14;
        k kVar2;
        ReentrantReadWriteLock.ReadLock readLock2;
        int i15;
        PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator;
        ReentrantReadWriteLock.ReadLock readLock3;
        ReentrantReadWriteLock.WriteLock writeLock2;
        k kVar3;
        int i16;
        int i17;
        ReentrantReadWriteLock.WriteLock writeLock3;
        PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator2;
        ReentrantReadWriteLock.ReadLock readLock4;
        ClusterizingResult clusterizingResult;
        PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator3;
        k kVar4;
        int i18;
        if (dVar instanceof PreCachingAlgorithmDecorator$getClustersInternal$1) {
            preCachingAlgorithmDecorator$getClustersInternal$1 = (PreCachingAlgorithmDecorator$getClustersInternal$1) dVar;
            int i19 = preCachingAlgorithmDecorator$getClustersInternal$1.label;
            if ((i19 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                preCachingAlgorithmDecorator$getClustersInternal$1.label = i19 - LinearLayoutManager.INVALID_OFFSET;
                PreCachingAlgorithmDecorator$getClustersInternal$1 preCachingAlgorithmDecorator$getClustersInternal$12 = preCachingAlgorithmDecorator$getClustersInternal$1;
                obj = preCachingAlgorithmDecorator$getClustersInternal$12.result;
                aVar = a.COROUTINE_SUSPENDED;
                i12 = preCachingAlgorithmDecorator$getClustersInternal$12.label;
                int i21 = 0;
                if (i12 != 0) {
                    s.b(obj);
                    ReentrantReadWriteLock reentrantReadWriteLock = this.cacheLock;
                    ReentrantReadWriteLock.ReadLock readLock5 = reentrantReadWriteLock.readLock();
                    int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i22 = 0; i22 < readHoldCount; i22++) {
                        readLock5.unlock();
                    }
                    writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        B0 b02 = this.clearCacheJob;
                        if (b02 != null) {
                            preCachingAlgorithmDecorator$getClustersInternal$12.L$0 = this;
                            kVar2 = kVar;
                            preCachingAlgorithmDecorator$getClustersInternal$12.L$1 = kVar2;
                            preCachingAlgorithmDecorator$getClustersInternal$12.L$2 = readLock5;
                            preCachingAlgorithmDecorator$getClustersInternal$12.L$3 = writeLock;
                            i14 = i11;
                            preCachingAlgorithmDecorator$getClustersInternal$12.I$0 = i14;
                            preCachingAlgorithmDecorator$getClustersInternal$12.I$1 = readHoldCount;
                            preCachingAlgorithmDecorator$getClustersInternal$12.label = 1;
                            if (b02.r0(preCachingAlgorithmDecorator$getClustersInternal$12) != aVar) {
                                preCachingAlgorithmDecorator = this;
                                readLock3 = readLock5;
                                i15 = readHoldCount;
                            }
                            return aVar;
                        }
                        i14 = i11;
                        kVar2 = kVar;
                        int i23 = readHoldCount;
                        readLock2 = readLock5;
                        i15 = i23;
                        preCachingAlgorithmDecorator = this;
                        ClusterCacheResult<T> lruCacheResult$mapsdk_fullFirebaseOpenglRelease = preCachingAlgorithmDecorator.getLruCacheResult$mapsdk_fullFirebaseOpenglRelease();
                        preCachingAlgorithmDecorator$getClustersInternal$12.L$0 = preCachingAlgorithmDecorator;
                        preCachingAlgorithmDecorator$getClustersInternal$12.L$1 = kVar2;
                        preCachingAlgorithmDecorator$getClustersInternal$12.L$2 = readLock2;
                        preCachingAlgorithmDecorator$getClustersInternal$12.L$3 = writeLock;
                        preCachingAlgorithmDecorator$getClustersInternal$12.I$0 = i14;
                        preCachingAlgorithmDecorator$getClustersInternal$12.I$1 = i15;
                        preCachingAlgorithmDecorator$getClustersInternal$12.label = 2;
                        obj = lruCacheResult$mapsdk_fullFirebaseOpenglRelease.getClustersFromZoomLevel(i14, kVar2, preCachingAlgorithmDecorator$getClustersInternal$12);
                        if (obj != aVar) {
                            kVar3 = kVar2;
                            i16 = i14;
                            i17 = i15;
                            writeLock3 = writeLock;
                            preCachingAlgorithmDecorator2 = preCachingAlgorithmDecorator;
                            readLock4 = readLock2;
                            clusterizingResult = (ClusterizingResult) obj;
                            if (clusterizingResult == null) {
                            }
                            while (i21 < i17) {
                            }
                            writeLock3.unlock();
                            return clusterizingResult;
                        }
                        return aVar;
                    } catch (Throwable th2) {
                        th = th2;
                        readLock = readLock5;
                        i13 = readHoldCount;
                        writeLock2 = writeLock;
                        while (i21 < i13) {
                        }
                        writeLock2.unlock();
                        throw th;
                    }
                }
                if (i12 == 1) {
                    i15 = preCachingAlgorithmDecorator$getClustersInternal$12.I$1;
                    int i24 = preCachingAlgorithmDecorator$getClustersInternal$12.I$0;
                    writeLock = (ReentrantReadWriteLock.WriteLock) preCachingAlgorithmDecorator$getClustersInternal$12.L$3;
                    ReentrantReadWriteLock.ReadLock readLock6 = (ReentrantReadWriteLock.ReadLock) preCachingAlgorithmDecorator$getClustersInternal$12.L$2;
                    k kVar5 = (k) preCachingAlgorithmDecorator$getClustersInternal$12.L$1;
                    preCachingAlgorithmDecorator = (PreCachingAlgorithmDecorator) preCachingAlgorithmDecorator$getClustersInternal$12.L$0;
                    try {
                        s.b(obj);
                        readLock3 = readLock6;
                        kVar2 = kVar5;
                        i14 = i24;
                    } catch (Throwable th3) {
                        th = th3;
                        i13 = i15;
                        writeLock2 = writeLock;
                        readLock = readLock6;
                    }
                } else if (i12 == 2) {
                    int i25 = preCachingAlgorithmDecorator$getClustersInternal$12.I$1;
                    int i26 = preCachingAlgorithmDecorator$getClustersInternal$12.I$0;
                    ReentrantReadWriteLock.WriteLock writeLock4 = (ReentrantReadWriteLock.WriteLock) preCachingAlgorithmDecorator$getClustersInternal$12.L$3;
                    ReentrantReadWriteLock.ReadLock readLock7 = (ReentrantReadWriteLock.ReadLock) preCachingAlgorithmDecorator$getClustersInternal$12.L$2;
                    k kVar6 = (k) preCachingAlgorithmDecorator$getClustersInternal$12.L$1;
                    PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator4 = (PreCachingAlgorithmDecorator) preCachingAlgorithmDecorator$getClustersInternal$12.L$0;
                    try {
                        s.b(obj);
                        i16 = i26;
                        readLock4 = readLock7;
                        kVar3 = kVar6;
                        i17 = i25;
                        preCachingAlgorithmDecorator2 = preCachingAlgorithmDecorator4;
                        writeLock3 = writeLock4;
                        try {
                            clusterizingResult = (ClusterizingResult) obj;
                            if (clusterizingResult == null) {
                                LruClusterCache<T> lruClusterCache = preCachingAlgorithmDecorator2.lruClusterCache;
                                IntRange intRange = new IntRange(i16, i16, 1);
                                preCachingAlgorithmDecorator$getClustersInternal$12.L$0 = kVar3;
                                preCachingAlgorithmDecorator$getClustersInternal$12.L$1 = readLock4;
                                preCachingAlgorithmDecorator$getClustersInternal$12.L$2 = writeLock3;
                                preCachingAlgorithmDecorator$getClustersInternal$12.L$3 = preCachingAlgorithmDecorator2;
                                preCachingAlgorithmDecorator$getClustersInternal$12.I$0 = i16;
                                preCachingAlgorithmDecorator$getClustersInternal$12.I$1 = i17;
                                preCachingAlgorithmDecorator$getClustersInternal$12.label = 3;
                                k kVar7 = kVar3;
                                PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator5 = preCachingAlgorithmDecorator2;
                                if (ClusterCache.DefaultImpls.calcCache$default(lruClusterCache, kVar7, intRange, null, preCachingAlgorithmDecorator$getClustersInternal$12, 4, null) != aVar) {
                                    preCachingAlgorithmDecorator3 = preCachingAlgorithmDecorator5;
                                    kVar4 = kVar7;
                                    writeLock2 = writeLock3;
                                    i18 = i16;
                                    ClusterCacheResult<T> lruCacheResult$mapsdk_fullFirebaseOpenglRelease2 = preCachingAlgorithmDecorator3.getLruCacheResult$mapsdk_fullFirebaseOpenglRelease();
                                    preCachingAlgorithmDecorator$getClustersInternal$12.L$0 = readLock4;
                                    preCachingAlgorithmDecorator$getClustersInternal$12.L$1 = writeLock2;
                                    preCachingAlgorithmDecorator$getClustersInternal$12.L$2 = null;
                                    preCachingAlgorithmDecorator$getClustersInternal$12.L$3 = null;
                                    preCachingAlgorithmDecorator$getClustersInternal$12.I$0 = i17;
                                    preCachingAlgorithmDecorator$getClustersInternal$12.label = 4;
                                    obj = lruCacheResult$mapsdk_fullFirebaseOpenglRelease2.getClustersFromZoomLevel(i18, kVar4, preCachingAlgorithmDecorator$getClustersInternal$12);
                                    if (obj != aVar) {
                                    }
                                }
                                return aVar;
                            }
                            while (i21 < i17) {
                            }
                            writeLock3.unlock();
                            return clusterizingResult;
                        } catch (Throwable th4) {
                            th = th4;
                            i13 = i17;
                            writeLock2 = writeLock3;
                            readLock = readLock4;
                            while (i21 < i13) {
                            }
                            writeLock2.unlock();
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        i13 = i25;
                        writeLock2 = writeLock4;
                        readLock = readLock7;
                    }
                } else if (i12 == 3) {
                    int i27 = preCachingAlgorithmDecorator$getClustersInternal$12.I$1;
                    i18 = preCachingAlgorithmDecorator$getClustersInternal$12.I$0;
                    preCachingAlgorithmDecorator3 = (PreCachingAlgorithmDecorator) preCachingAlgorithmDecorator$getClustersInternal$12.L$3;
                    ReentrantReadWriteLock.WriteLock writeLock5 = (ReentrantReadWriteLock.WriteLock) preCachingAlgorithmDecorator$getClustersInternal$12.L$2;
                    ReentrantReadWriteLock.ReadLock readLock8 = (ReentrantReadWriteLock.ReadLock) preCachingAlgorithmDecorator$getClustersInternal$12.L$1;
                    kVar4 = (k) preCachingAlgorithmDecorator$getClustersInternal$12.L$0;
                    try {
                        s.b(obj);
                        i17 = i27;
                        writeLock2 = writeLock5;
                        readLock4 = readLock8;
                        try {
                            ClusterCacheResult<T> lruCacheResult$mapsdk_fullFirebaseOpenglRelease22 = preCachingAlgorithmDecorator3.getLruCacheResult$mapsdk_fullFirebaseOpenglRelease();
                            preCachingAlgorithmDecorator$getClustersInternal$12.L$0 = readLock4;
                            preCachingAlgorithmDecorator$getClustersInternal$12.L$1 = writeLock2;
                            preCachingAlgorithmDecorator$getClustersInternal$12.L$2 = null;
                            preCachingAlgorithmDecorator$getClustersInternal$12.L$3 = null;
                            preCachingAlgorithmDecorator$getClustersInternal$12.I$0 = i17;
                            preCachingAlgorithmDecorator$getClustersInternal$12.label = 4;
                            obj = lruCacheResult$mapsdk_fullFirebaseOpenglRelease22.getClustersFromZoomLevel(i18, kVar4, preCachingAlgorithmDecorator$getClustersInternal$12);
                            if (obj != aVar) {
                                i13 = i17;
                                readLock = readLock4;
                                clusterizingResult = (ClusterizingResult) obj;
                                if (clusterizingResult == null) {
                                }
                                i17 = i13;
                                writeLock3 = writeLock2;
                                readLock4 = readLock;
                                while (i21 < i17) {
                                }
                                writeLock3.unlock();
                                return clusterizingResult;
                            }
                            return aVar;
                        } catch (Throwable th6) {
                            th = th6;
                            i13 = i17;
                            readLock = readLock4;
                            while (i21 < i13) {
                            }
                            writeLock2.unlock();
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        i13 = i27;
                        writeLock2 = writeLock5;
                        readLock = readLock8;
                    }
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = preCachingAlgorithmDecorator$getClustersInternal$12.I$0;
                    writeLock2 = (ReentrantReadWriteLock.WriteLock) preCachingAlgorithmDecorator$getClustersInternal$12.L$1;
                    readLock = (ReentrantReadWriteLock.ReadLock) preCachingAlgorithmDecorator$getClustersInternal$12.L$0;
                    try {
                        s.b(obj);
                        clusterizingResult = (ClusterizingResult) obj;
                        if (clusterizingResult == null) {
                            clusterizingResult = new ClusterizingResult(kotlin.collections.M.f71699a, K.f71697a);
                        }
                        i17 = i13;
                        writeLock3 = writeLock2;
                        readLock4 = readLock;
                        while (i21 < i17) {
                            readLock4.lock();
                            i21++;
                        }
                        writeLock3.unlock();
                        return clusterizingResult;
                    } catch (Throwable th8) {
                        th = th8;
                    }
                }
                while (i21 < i13) {
                    readLock.lock();
                    i21++;
                }
                writeLock2.unlock();
                throw th;
                readLock2 = readLock3;
                ClusterCacheResult<T> lruCacheResult$mapsdk_fullFirebaseOpenglRelease3 = preCachingAlgorithmDecorator.getLruCacheResult$mapsdk_fullFirebaseOpenglRelease();
                preCachingAlgorithmDecorator$getClustersInternal$12.L$0 = preCachingAlgorithmDecorator;
                preCachingAlgorithmDecorator$getClustersInternal$12.L$1 = kVar2;
                preCachingAlgorithmDecorator$getClustersInternal$12.L$2 = readLock2;
                preCachingAlgorithmDecorator$getClustersInternal$12.L$3 = writeLock;
                preCachingAlgorithmDecorator$getClustersInternal$12.I$0 = i14;
                preCachingAlgorithmDecorator$getClustersInternal$12.I$1 = i15;
                preCachingAlgorithmDecorator$getClustersInternal$12.label = 2;
                obj = lruCacheResult$mapsdk_fullFirebaseOpenglRelease3.getClustersFromZoomLevel(i14, kVar2, preCachingAlgorithmDecorator$getClustersInternal$12);
                if (obj != aVar) {
                }
                return aVar;
            }
        }
        preCachingAlgorithmDecorator$getClustersInternal$1 = new PreCachingAlgorithmDecorator$getClustersInternal$1(this, dVar);
        PreCachingAlgorithmDecorator$getClustersInternal$1 preCachingAlgorithmDecorator$getClustersInternal$122 = preCachingAlgorithmDecorator$getClustersInternal$1;
        obj = preCachingAlgorithmDecorator$getClustersInternal$122.result;
        aVar = a.COROUTINE_SUSPENDED;
        i12 = preCachingAlgorithmDecorator$getClustersInternal$122.label;
        int i212 = 0;
        if (i12 != 0) {
        }
        readLock2 = readLock3;
        ClusterCacheResult<T> lruCacheResult$mapsdk_fullFirebaseOpenglRelease32 = preCachingAlgorithmDecorator.getLruCacheResult$mapsdk_fullFirebaseOpenglRelease();
        preCachingAlgorithmDecorator$getClustersInternal$122.L$0 = preCachingAlgorithmDecorator;
        preCachingAlgorithmDecorator$getClustersInternal$122.L$1 = kVar2;
        preCachingAlgorithmDecorator$getClustersInternal$122.L$2 = readLock2;
        preCachingAlgorithmDecorator$getClustersInternal$122.L$3 = writeLock;
        preCachingAlgorithmDecorator$getClustersInternal$122.I$0 = i14;
        preCachingAlgorithmDecorator$getClustersInternal$122.I$1 = i15;
        preCachingAlgorithmDecorator$getClustersInternal$122.label = 2;
        obj = lruCacheResult$mapsdk_fullFirebaseOpenglRelease32.getClustersFromZoomLevel(i14, kVar2, preCachingAlgorithmDecorator$getClustersInternal$122);
        if (obj != aVar) {
        }
        return aVar;
    }

    public static /* synthetic */ void getLruCacheResult$mapsdk_fullFirebaseOpenglRelease$annotations() {
    }

    public static /* synthetic */ void getNextZoomCalcJob$mapsdk_fullFirebaseOpenglRelease$annotations() {
    }

    public static /* synthetic */ void getPrevZoomCalcJob$mapsdk_fullFirebaseOpenglRelease$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r2.getClustersInternal(r8, r9, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object precacheZoomLevel(int i11, k kVar, d<? super Unit> dVar) {
        PreCachingAlgorithmDecorator$precacheZoomLevel$1 preCachingAlgorithmDecorator$precacheZoomLevel$1;
        int i12;
        PreCachingAlgorithmDecorator preCachingAlgorithmDecorator;
        if (dVar instanceof PreCachingAlgorithmDecorator$precacheZoomLevel$1) {
            preCachingAlgorithmDecorator$precacheZoomLevel$1 = (PreCachingAlgorithmDecorator$precacheZoomLevel$1) dVar;
            int i13 = preCachingAlgorithmDecorator$precacheZoomLevel$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                preCachingAlgorithmDecorator$precacheZoomLevel$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = preCachingAlgorithmDecorator$precacheZoomLevel$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i12 = preCachingAlgorithmDecorator$precacheZoomLevel$1.label;
                if (i12 != 0) {
                    s.b(obj);
                    IntRange intRange = new IntRange(CounterView.COUNTER_MAX_DEFAULT, 1000, 1);
                    c.Companion random = c.INSTANCE;
                    Intrinsics.checkNotNullParameter(intRange, "<this>");
                    Intrinsics.checkNotNullParameter(random, "random");
                    try {
                        long b11 = kotlin.random.d.b(random, intRange);
                        preCachingAlgorithmDecorator$precacheZoomLevel$1.L$0 = this;
                        preCachingAlgorithmDecorator$precacheZoomLevel$1.L$1 = kVar;
                        preCachingAlgorithmDecorator$precacheZoomLevel$1.I$0 = i11;
                        preCachingAlgorithmDecorator$precacheZoomLevel$1.label = 1;
                        if (Y.b(b11, preCachingAlgorithmDecorator$precacheZoomLevel$1) != aVar) {
                            preCachingAlgorithmDecorator = this;
                        }
                        return aVar;
                    } catch (IllegalArgumentException e11) {
                        throw new NoSuchElementException(e11.getMessage());
                    }
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                i11 = preCachingAlgorithmDecorator$precacheZoomLevel$1.I$0;
                kVar = (k) preCachingAlgorithmDecorator$precacheZoomLevel$1.L$1;
                preCachingAlgorithmDecorator = (PreCachingAlgorithmDecorator) preCachingAlgorithmDecorator$precacheZoomLevel$1.L$0;
                s.b(obj);
                preCachingAlgorithmDecorator$precacheZoomLevel$1.L$0 = null;
                preCachingAlgorithmDecorator$precacheZoomLevel$1.L$1 = null;
                preCachingAlgorithmDecorator$precacheZoomLevel$1.label = 2;
            }
        }
        preCachingAlgorithmDecorator$precacheZoomLevel$1 = new PreCachingAlgorithmDecorator$precacheZoomLevel$1(this, dVar);
        Object obj2 = preCachingAlgorithmDecorator$precacheZoomLevel$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i12 = preCachingAlgorithmDecorator$precacheZoomLevel$1.label;
        if (i12 != 0) {
        }
        preCachingAlgorithmDecorator$precacheZoomLevel$1.L$0 = null;
        preCachingAlgorithmDecorator$precacheZoomLevel$1.L$1 = null;
        preCachingAlgorithmDecorator$precacheZoomLevel$1.label = 2;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.AlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean addItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean addItem = getAlgorithm().addItem(item);
        if (addItem) {
            clearCache();
        }
        return addItem;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.AlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean addItems(@NotNull Collection<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        boolean addItems = getAlgorithm().addItems(items);
        if (addItems) {
            clearCache();
        }
        return addItems;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.AlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public void clearItems() {
        getAlgorithm().clearItems();
        clearCache();
    }

    public final void dispose() {
        N.c(this.scope, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.AlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getClusters(float f7, @NotNull k kVar, @NotNull d<? super ClusterizingResult<T>> dVar) {
        PreCachingAlgorithmDecorator$getClusters$1 preCachingAlgorithmDecorator$getClusters$1;
        a aVar;
        int i11;
        int i12;
        PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator;
        ClusterizingResult clusterizingResult;
        int i13;
        int i14;
        Object clustersFromZoomLevel;
        k kVar2;
        int i15;
        Object clustersFromZoomLevel2;
        int i16;
        ClusterizingResult clusterizingResult2;
        PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator2;
        k kVar3;
        if (dVar instanceof PreCachingAlgorithmDecorator$getClusters$1) {
            preCachingAlgorithmDecorator$getClusters$1 = (PreCachingAlgorithmDecorator$getClusters$1) dVar;
            int i17 = preCachingAlgorithmDecorator$getClusters$1.label;
            if ((i17 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                preCachingAlgorithmDecorator$getClusters$1.label = i17 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = preCachingAlgorithmDecorator$getClusters$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                i11 = preCachingAlgorithmDecorator$getClusters$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    i12 = (int) f7;
                    preCachingAlgorithmDecorator$getClusters$1.L$0 = this;
                    preCachingAlgorithmDecorator$getClusters$1.L$1 = kVar;
                    preCachingAlgorithmDecorator$getClusters$1.I$0 = i12;
                    preCachingAlgorithmDecorator$getClusters$1.label = 1;
                    obj = getClustersInternal(i12, kVar, preCachingAlgorithmDecorator$getClusters$1);
                    if (obj != aVar) {
                        preCachingAlgorithmDecorator = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i16 = preCachingAlgorithmDecorator$getClusters$1.I$0;
                        clusterizingResult2 = (ClusterizingResult) preCachingAlgorithmDecorator$getClusters$1.L$2;
                        kVar3 = (k) preCachingAlgorithmDecorator$getClusters$1.L$1;
                        preCachingAlgorithmDecorator2 = (PreCachingAlgorithmDecorator) preCachingAlgorithmDecorator$getClusters$1.L$0;
                        s.b(obj);
                        if (obj == null) {
                            B0 b02 = preCachingAlgorithmDecorator2.prevZoomCalcJob;
                            if (b02 != null) {
                                b02.j(null);
                            }
                            preCachingAlgorithmDecorator2.prevZoomCalcJob = C10727i.c(preCachingAlgorithmDecorator2.scope, null, null, new PreCachingAlgorithmDecorator$getClusters$3(preCachingAlgorithmDecorator2, i16, kVar3, null), 3);
                        }
                        return clusterizingResult2;
                    }
                    i14 = preCachingAlgorithmDecorator$getClusters$1.I$1;
                    i15 = preCachingAlgorithmDecorator$getClusters$1.I$0;
                    ClusterizingResult clusterizingResult3 = (ClusterizingResult) preCachingAlgorithmDecorator$getClusters$1.L$2;
                    k kVar4 = (k) preCachingAlgorithmDecorator$getClusters$1.L$1;
                    PreCachingAlgorithmDecorator<T> preCachingAlgorithmDecorator3 = (PreCachingAlgorithmDecorator) preCachingAlgorithmDecorator$getClusters$1.L$0;
                    s.b(obj);
                    clustersFromZoomLevel = obj;
                    clusterizingResult = clusterizingResult3;
                    preCachingAlgorithmDecorator = preCachingAlgorithmDecorator3;
                    kVar2 = kVar4;
                    if (clustersFromZoomLevel == null) {
                        B0 b03 = preCachingAlgorithmDecorator.nextZoomCalcJob;
                        if (b03 != null) {
                            b03.j(null);
                        }
                        preCachingAlgorithmDecorator.nextZoomCalcJob = C10727i.c(preCachingAlgorithmDecorator.scope, null, null, new PreCachingAlgorithmDecorator$getClusters$2(preCachingAlgorithmDecorator, i14, kVar2, null), 3);
                    }
                    ClusterCacheResult<T> lruCacheResult$mapsdk_fullFirebaseOpenglRelease = preCachingAlgorithmDecorator.getLruCacheResult$mapsdk_fullFirebaseOpenglRelease();
                    preCachingAlgorithmDecorator$getClusters$1.L$0 = preCachingAlgorithmDecorator;
                    preCachingAlgorithmDecorator$getClusters$1.L$1 = kVar2;
                    preCachingAlgorithmDecorator$getClusters$1.L$2 = clusterizingResult;
                    preCachingAlgorithmDecorator$getClusters$1.I$0 = i15;
                    preCachingAlgorithmDecorator$getClusters$1.label = 3;
                    clustersFromZoomLevel2 = lruCacheResult$mapsdk_fullFirebaseOpenglRelease.getClustersFromZoomLevel(i15, kVar2, preCachingAlgorithmDecorator$getClusters$1);
                    if (clustersFromZoomLevel2 != aVar) {
                        ClusterizingResult clusterizingResult4 = clusterizingResult;
                        obj = clustersFromZoomLevel2;
                        i16 = i15;
                        clusterizingResult2 = clusterizingResult4;
                        preCachingAlgorithmDecorator2 = preCachingAlgorithmDecorator;
                        kVar3 = kVar2;
                        if (obj == null) {
                        }
                        return clusterizingResult2;
                    }
                    return aVar;
                }
                i12 = preCachingAlgorithmDecorator$getClusters$1.I$0;
                kVar = (k) preCachingAlgorithmDecorator$getClusters$1.L$1;
                preCachingAlgorithmDecorator = (PreCachingAlgorithmDecorator) preCachingAlgorithmDecorator$getClusters$1.L$0;
                s.b(obj);
                clusterizingResult = (ClusterizingResult) obj;
                i13 = i12 - 1;
                if (i13 < 0) {
                    i13 = 0;
                }
                i14 = i12 + 1;
                if (i14 > 24) {
                    i14 = 24;
                }
                ClusterCacheResult<T> lruCacheResult$mapsdk_fullFirebaseOpenglRelease2 = preCachingAlgorithmDecorator.getLruCacheResult$mapsdk_fullFirebaseOpenglRelease();
                preCachingAlgorithmDecorator$getClusters$1.L$0 = preCachingAlgorithmDecorator;
                preCachingAlgorithmDecorator$getClusters$1.L$1 = kVar;
                preCachingAlgorithmDecorator$getClusters$1.L$2 = clusterizingResult;
                preCachingAlgorithmDecorator$getClusters$1.I$0 = i13;
                preCachingAlgorithmDecorator$getClusters$1.I$1 = i14;
                preCachingAlgorithmDecorator$getClusters$1.label = 2;
                clustersFromZoomLevel = lruCacheResult$mapsdk_fullFirebaseOpenglRelease2.getClustersFromZoomLevel(i14, kVar, preCachingAlgorithmDecorator$getClusters$1);
                if (clustersFromZoomLevel != aVar) {
                    kVar2 = kVar;
                    i15 = i13;
                    if (clustersFromZoomLevel == null) {
                    }
                    ClusterCacheResult<T> lruCacheResult$mapsdk_fullFirebaseOpenglRelease3 = preCachingAlgorithmDecorator.getLruCacheResult$mapsdk_fullFirebaseOpenglRelease();
                    preCachingAlgorithmDecorator$getClusters$1.L$0 = preCachingAlgorithmDecorator;
                    preCachingAlgorithmDecorator$getClusters$1.L$1 = kVar2;
                    preCachingAlgorithmDecorator$getClusters$1.L$2 = clusterizingResult;
                    preCachingAlgorithmDecorator$getClusters$1.I$0 = i15;
                    preCachingAlgorithmDecorator$getClusters$1.label = 3;
                    clustersFromZoomLevel2 = lruCacheResult$mapsdk_fullFirebaseOpenglRelease3.getClustersFromZoomLevel(i15, kVar2, preCachingAlgorithmDecorator$getClusters$1);
                    if (clustersFromZoomLevel2 != aVar) {
                    }
                }
                return aVar;
            }
        }
        preCachingAlgorithmDecorator$getClusters$1 = new PreCachingAlgorithmDecorator$getClusters$1(this, dVar);
        Object obj2 = preCachingAlgorithmDecorator$getClusters$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = preCachingAlgorithmDecorator$getClusters$1.label;
        if (i11 != 0) {
        }
        clusterizingResult = (ClusterizingResult) obj2;
        i13 = i12 - 1;
        if (i13 < 0) {
        }
        i14 = i12 + 1;
        if (i14 > 24) {
        }
        ClusterCacheResult<T> lruCacheResult$mapsdk_fullFirebaseOpenglRelease22 = preCachingAlgorithmDecorator.getLruCacheResult$mapsdk_fullFirebaseOpenglRelease();
        preCachingAlgorithmDecorator$getClusters$1.L$0 = preCachingAlgorithmDecorator;
        preCachingAlgorithmDecorator$getClusters$1.L$1 = kVar;
        preCachingAlgorithmDecorator$getClusters$1.L$2 = clusterizingResult;
        preCachingAlgorithmDecorator$getClusters$1.I$0 = i13;
        preCachingAlgorithmDecorator$getClusters$1.I$1 = i14;
        preCachingAlgorithmDecorator$getClusters$1.label = 2;
        clustersFromZoomLevel = lruCacheResult$mapsdk_fullFirebaseOpenglRelease22.getClustersFromZoomLevel(i14, kVar, preCachingAlgorithmDecorator$getClusters$1);
        if (clustersFromZoomLevel != aVar) {
        }
        return aVar;
    }

    @NotNull
    public final ClusterCacheResult<T> getLruCacheResult$mapsdk_fullFirebaseOpenglRelease() {
        return this.lruClusterCache.getPreparedCache().getValue();
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.AlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return getAlgorithm().getMaxDistanceBetweenClusteredItems();
    }

    /* renamed from: getNextZoomCalcJob$mapsdk_fullFirebaseOpenglRelease, reason: from getter */
    public final B0 getNextZoomCalcJob() {
        return this.nextZoomCalcJob;
    }

    /* renamed from: getPrevZoomCalcJob$mapsdk_fullFirebaseOpenglRelease, reason: from getter */
    public final B0 getPrevZoomCalcJob() {
        return this.prevZoomCalcJob;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.AlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean removeItem = getAlgorithm().removeItem(item);
        if (removeItem) {
            clearCache();
        }
        return removeItem;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.AlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean removeItems(@NotNull Collection<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        boolean removeItems = getAlgorithm().removeItems(items);
        if (removeItems) {
            clearCache();
        }
        return removeItems;
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.AlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i11) {
        getAlgorithm().setMaxDistanceBetweenClusteredItems(i11);
        clearCache();
    }

    @Override // ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.decorator.AlgorithmDecorator, ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm
    public boolean updateItem(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean updateItem = getAlgorithm().updateItem(item);
        if (updateItem) {
            clearCache();
        }
        return updateItem;
    }
}
