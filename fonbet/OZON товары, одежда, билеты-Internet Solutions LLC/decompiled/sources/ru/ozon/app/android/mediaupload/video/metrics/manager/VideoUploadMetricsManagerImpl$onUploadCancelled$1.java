package ru.ozon.app.android.mediaupload.video.metrics.manager;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManagerImpl$onUploadCancelled$1", f = "VideoUploadMetricsManagerImpl.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoUploadMetricsManagerImpl$onUploadCancelled$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $uploadProcessId;
    int label;
    final /* synthetic */ VideoUploadMetricsManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoUploadMetricsManagerImpl$onUploadCancelled$1(VideoUploadMetricsManagerImpl videoUploadMetricsManagerImpl, String str, d<? super VideoUploadMetricsManagerImpl$onUploadCancelled$1> dVar) {
        super(2, dVar);
        this.this$0 = videoUploadMetricsManagerImpl;
        this.$uploadProcessId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoUploadMetricsManagerImpl$onUploadCancelled$1(this.this$0, this.$uploadProcessId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            VideoUploadMetricsManagerImpl videoUploadMetricsManagerImpl = this.this$0;
            String str = this.$uploadProcessId;
            UploadMetricEvent.FinishStep finishStep = new UploadMetricEvent.FinishStep(0L, false, true, 1, null);
            this.label = 1;
            if (videoUploadMetricsManagerImpl.addMetric(str, finishStep, this) == aVar) {
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
        return ((VideoUploadMetricsManagerImpl$onUploadCancelled$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
