package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins;

import Sc.s;
import Wc.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import we0.i;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.PinManager$performClustering$1", f = "PinManager.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PinManager$performClustering$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ PinManager this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.PinManager$performClustering$1$1", f = "PinManager.kt", l = {206}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins.PinManager$performClustering$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ PinManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PinManager pinManager, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = pinManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007f -> B:7:0x0082). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            M m11;
            ConcurrentLinkedDeque concurrentLinkedDeque;
            ConcurrentHashMap concurrentHashMap;
            GeoHashAlgorithm geoHashAlgorithm;
            ConcurrentHashMap concurrentHashMap2;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                m11 = (M) this.L$0;
                while (N.f(m11)) {
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) this.L$3;
            ClusteringTask clusteringTask = (ClusteringTask) this.L$2;
            PinManager pinManager = (PinManager) this.L$1;
            m11 = (M) this.L$0;
            try {
                s.b(obj);
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                ThrowableExtKt.log(th2, clusteringTask.getClass().getSimpleName().concat("_performClustering"));
            }
            concurrentHashMap3.putAll((Map) obj);
            Function1<Map<String, HotelsMapInfoV4VO.Pin>, Unit> onFinish = clusteringTask.getOnFinish();
            concurrentHashMap2 = pinManager.clusteredPins;
            onFinish.invoke(concurrentHashMap2);
            while (N.f(m11)) {
                concurrentLinkedDeque = this.this$0.clusteringTasks;
                clusteringTask = (ClusteringTask) concurrentLinkedDeque.pollFirst();
                if (clusteringTask != null) {
                    pinManager = this.this$0;
                    concurrentHashMap = pinManager.clusteredPins;
                    concurrentHashMap.clear();
                    concurrentHashMap3 = pinManager.clusteredPins;
                    geoHashAlgorithm = pinManager.algorithm;
                    ConcurrentHashMap<String, HotelsMapInfoV4VO.Pin> pins = clusteringTask.getPins();
                    int latitudeCellPxSize = clusteringTask.getLatitudeCellPxSize();
                    int longitudeCellPxSize = clusteringTask.getLongitudeCellPxSize();
                    i area = clusteringTask.getArea();
                    float zoom = clusteringTask.getZoom();
                    this.L$0 = m11;
                    this.L$1 = pinManager;
                    this.L$2 = clusteringTask;
                    this.L$3 = concurrentHashMap3;
                    this.label = 1;
                    obj = geoHashAlgorithm.getClusters(pins, latitudeCellPxSize, longitudeCellPxSize, area, zoom, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    concurrentHashMap3.putAll((Map) obj);
                    Function1<Map<String, HotelsMapInfoV4VO.Pin>, Unit> onFinish2 = clusteringTask.getOnFinish();
                    concurrentHashMap2 = pinManager.clusteredPins;
                    onFinish2.invoke(concurrentHashMap2);
                    while (N.f(m11)) {
                    }
                }
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PinManager$performClustering$1(PinManager pinManager, d<? super PinManager$performClustering$1> dVar) {
        super(2, dVar);
        this.this$0 = pinManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PinManager$performClustering$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B0 b02;
        M m11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            b02 = this.this$0.clusteringJob;
            if (b02 != null) {
                this.label = 1;
                if (b02.r0(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        PinManager pinManager = this.this$0;
        m11 = pinManager.scope;
        pinManager.clusteringJob = C10727i.c(m11, null, null, new AnonymousClass1(this.this$0, null), 3);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PinManager$performClustering$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
