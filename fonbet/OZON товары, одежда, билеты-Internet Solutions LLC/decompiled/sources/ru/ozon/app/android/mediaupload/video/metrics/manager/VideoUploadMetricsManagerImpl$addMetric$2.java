package ru.ozon.app.android.mediaupload.video.metrics.manager;

import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;
import ru.ozon.app.android.utils.CollectionExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManagerImpl$addMetric$2", f = "VideoUploadMetricsManagerImpl.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoUploadMetricsManagerImpl$addMetric$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ UploadMetricEvent $metricEvent;
    final /* synthetic */ String $uploadProcessId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ VideoUploadMetricsManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoUploadMetricsManagerImpl$addMetric$2(VideoUploadMetricsManagerImpl videoUploadMetricsManagerImpl, UploadMetricEvent uploadMetricEvent, String str, d<? super VideoUploadMetricsManagerImpl$addMetric$2> dVar) {
        super(2, dVar);
        this.this$0 = videoUploadMetricsManagerImpl;
        this.$metricEvent = uploadMetricEvent;
        this.$uploadProcessId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoUploadMetricsManagerImpl$addMetric$2(this.this$0, this.$metricEvent, this.$uploadProcessId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        VideoUploadMetricsManagerImpl videoUploadMetricsManagerImpl;
        UploadMetricEvent uploadMetricEvent;
        String str;
        Map map;
        Map map2;
        List U02;
        Map map3;
        Map map4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC3394a = this.this$0.mutex;
            UploadMetricEvent uploadMetricEvent2 = this.$metricEvent;
            videoUploadMetricsManagerImpl = this.this$0;
            String str2 = this.$uploadProcessId;
            this.L$0 = interfaceC3394a;
            this.L$1 = uploadMetricEvent2;
            this.L$2 = videoUploadMetricsManagerImpl;
            this.L$3 = str2;
            this.label = 1;
            if (interfaceC3394a.a(this) == aVar) {
                return aVar;
            }
            uploadMetricEvent = uploadMetricEvent2;
            str = str2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$3;
            videoUploadMetricsManagerImpl = (VideoUploadMetricsManagerImpl) this.L$2;
            uploadMetricEvent = (UploadMetricEvent) this.L$1;
            interfaceC3394a = (InterfaceC3394a) this.L$0;
            s.b(obj);
        }
        try {
            if (uploadMetricEvent instanceof UploadMetricEvent.InitStep) {
                map4 = videoUploadMetricsManagerImpl.uploadMetricsMap;
                map4.put(str, new ArrayList());
            }
            map = videoUploadMetricsManagerImpl.uploadMetricsMap;
            List list = (List) map.get(str);
            if ((!CollectionExtKt.isNullOrEmpty(list) || (uploadMetricEvent instanceof UploadMetricEvent.InitStep)) && list != null) {
                list.add(uploadMetricEvent);
            }
            if (uploadMetricEvent instanceof UploadMetricEvent.FinishStep) {
                map2 = videoUploadMetricsManagerImpl.uploadMetricsMap;
                List list2 = (List) map2.get(str);
                if (list2 != null && (U02 = C7714v.U0(list2)) != null) {
                    map3 = videoUploadMetricsManagerImpl.uploadMetricsMap;
                    map3.remove(str);
                    videoUploadMetricsManagerImpl.sendPerfMetrics(str, U02);
                }
            }
            Unit unit = Unit.f71690a;
            interfaceC3394a.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            interfaceC3394a.c(null);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VideoUploadMetricsManagerImpl$addMetric$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
