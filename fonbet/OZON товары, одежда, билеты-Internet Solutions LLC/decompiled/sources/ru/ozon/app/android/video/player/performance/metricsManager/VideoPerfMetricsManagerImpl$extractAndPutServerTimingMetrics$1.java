package ru.ozon.app.android.video.player.performance.metricsManager;

import Sc.s;
import Wc.a;
import We.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerImpl$extractAndPutServerTimingMetrics$1", f = "VideoPerfMetricsManager.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class VideoPerfMetricsManagerImpl$extractAndPutServerTimingMetrics$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ z $headers;
    final /* synthetic */ VideoAsset $videoAsset;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ VideoPerfMetricsManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoPerfMetricsManagerImpl$extractAndPutServerTimingMetrics$1(z zVar, VideoPerfMetricsManagerImpl videoPerfMetricsManagerImpl, VideoAsset videoAsset, d<? super VideoPerfMetricsManagerImpl$extractAndPutServerTimingMetrics$1> dVar) {
        super(2, dVar);
        this.$headers = zVar;
        this.this$0 = videoPerfMetricsManagerImpl;
        this.$videoAsset = videoAsset;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoPerfMetricsManagerImpl$extractAndPutServerTimingMetrics$1(this.$headers, this.this$0, this.$videoAsset, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b1 A[Catch: Exception -> 0x001e, TRY_LEAVE, TryCatch #0 {Exception -> 0x001e, blocks: (B:6:0x0019, B:8:0x00ab, B:10:0x00b1, B:19:0x0081, B:21:0x0087, B:24:0x00a1, B:33:0x002c, B:34:0x0037, B:36:0x003d, B:39:0x0050, B:44:0x0054, B:45:0x0063, B:47:0x0069, B:49:0x0079), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:6:0x0019, B:8:0x00ab, B:10:0x00b1, B:19:0x0081, B:21:0x0087, B:24:0x00a1, B:33:0x002c, B:34:0x0037, B:36:0x003d, B:39:0x0050, B:44:0x0054, B:45:0x0063, B:47:0x0069, B:49:0x0079), top: B:2:0x0005 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a1 -> B:7:0x00ab). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VideoPerfMetricsManagerImpl videoPerfMetricsManagerImpl;
        VideoAsset videoAsset;
        Iterator it;
        VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;
        Object handleMetricActionByUrlInternal;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Exception e11) {
            Lm0.a.f17149a.e(Nk.a.b("VideoPerfMetricsManager extractAndPutServerTimingMetrics error: ", e11.getMessage()), new Object[0]);
        }
        if (i11 == 0) {
            s.b(obj);
            z zVar = this.$headers;
            ArrayList arrayList = new ArrayList();
            for (Pair<? extends String, ? extends String> pair : zVar) {
                if (Intrinsics.d(pair.e(), "server-timing")) {
                    arrayList.add(pair);
                }
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Pair) it2.next()).f());
            }
            videoPerfMetricsManagerImpl = this.this$0;
            videoAsset = this.$videoAsset;
            it = arrayList2.iterator();
            while (it.hasNext()) {
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it3 = (Iterator) this.L$3;
        Iterator it4 = (Iterator) this.L$2;
        VideoAsset videoAsset2 = (VideoAsset) this.L$1;
        VideoPerfMetricsManagerImpl videoPerfMetricsManagerImpl2 = (VideoPerfMetricsManagerImpl) this.L$0;
        s.b(obj);
        while (it3.hasNext()) {
            VideoPerfMetricAction.PutServerTimingMetricAction putServerTimingMetricAction = (VideoPerfMetricAction.PutServerTimingMetricAction) it3.next();
            this.L$0 = videoPerfMetricsManagerImpl2;
            this.L$1 = videoAsset2;
            this.L$2 = it4;
            this.L$3 = it3;
            this.label = 1;
            handleMetricActionByUrlInternal = videoPerfMetricsManagerImpl2.handleMetricActionByUrlInternal(videoAsset2, putServerTimingMetricAction, this);
            if (handleMetricActionByUrlInternal == aVar) {
                return aVar;
            }
        }
        it = it4;
        videoAsset = videoAsset2;
        videoPerfMetricsManagerImpl = videoPerfMetricsManagerImpl2;
        while (it.hasNext()) {
            List<VideoPerfMetricAction.PutServerTimingMetricAction> parseServerTimingMetric = VideoPerfMetricAction.INSTANCE.parseServerTimingMetric((String) it.next());
            videoPerfMetricsManagerHelper = videoPerfMetricsManagerImpl.videoPerfMetricsManagerHelper;
            if (videoPerfMetricsManagerHelper.isUrlActive(videoAsset.getVideoUrl())) {
                videoPerfMetricsManagerImpl2 = videoPerfMetricsManagerImpl;
                it3 = parseServerTimingMetric.iterator();
                videoAsset2 = videoAsset;
                it4 = it;
                while (it3.hasNext()) {
                }
                it = it4;
                videoAsset = videoAsset2;
                videoPerfMetricsManagerImpl = videoPerfMetricsManagerImpl2;
                while (it.hasNext()) {
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VideoPerfMetricsManagerImpl$extractAndPutServerTimingMetrics$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
