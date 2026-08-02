package ru.ozon.app.android.mediaupload.video.metrics.network;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.metrics.network.VideoUploadingPerformanceInterceptor$handleMetric$1$1", f = "VideoUploadingPerformanceInterceptor.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoUploadingPerformanceInterceptor$handleMetric$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ UploadMetricEvent.EventType $event;
    final /* synthetic */ int $responseCode;
    final /* synthetic */ long $startMs;
    final /* synthetic */ String $uploadProcessId;
    final /* synthetic */ String $uploadRequestId;
    int label;
    final /* synthetic */ VideoUploadingPerformanceInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoUploadingPerformanceInterceptor$handleMetric$1$1(VideoUploadingPerformanceInterceptor videoUploadingPerformanceInterceptor, String str, UploadMetricEvent.EventType eventType, String str2, long j11, int i11, d<? super VideoUploadingPerformanceInterceptor$handleMetric$1$1> dVar) {
        super(2, dVar);
        this.this$0 = videoUploadingPerformanceInterceptor;
        this.$uploadProcessId = str;
        this.$event = eventType;
        this.$uploadRequestId = str2;
        this.$startMs = j11;
        this.$responseCode = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoUploadingPerformanceInterceptor$handleMetric$1$1(this.this$0, this.$uploadProcessId, this.$event, this.$uploadRequestId, this.$startMs, this.$responseCode, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VideoUploadMetricsManager videoUploadMetricsManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            videoUploadMetricsManager = this.this$0.videoUploadMetricsManager;
            String str = this.$uploadProcessId;
            UploadMetricEvent.UploadStep uploadStep = new UploadMetricEvent.UploadStep(this.$event, this.$uploadRequestId, this.$startMs, this.$responseCode, 0L, 16, null);
            this.label = 1;
            if (videoUploadMetricsManager.addMetric(str, uploadStep, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VideoUploadingPerformanceInterceptor$handleMetric$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
