package ru.ozon.app.android.mediaupload.video;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uploadingProgress", "Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$upload$2", f = "VideoNetworkDataStore.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoNetworkDataStore$upload$2 extends j implements Function2<UploadingProgress, d<? super Unit>, Object> {
    final /* synthetic */ String $uploadProcessId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VideoNetworkDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoNetworkDataStore$upload$2(VideoNetworkDataStore videoNetworkDataStore, String str, d<? super VideoNetworkDataStore$upload$2> dVar) {
        super(2, dVar);
        this.this$0 = videoNetworkDataStore;
        this.$uploadProcessId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        VideoNetworkDataStore$upload$2 videoNetworkDataStore$upload$2 = new VideoNetworkDataStore$upload$2(this.this$0, this.$uploadProcessId, dVar);
        videoNetworkDataStore$upload$2.L$0 = obj;
        return videoNetworkDataStore$upload$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VideoUploadMetricsManager videoUploadMetricsManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (((UploadingProgress) this.L$0).isDone()) {
                videoUploadMetricsManager = this.this$0.videoUploadMetricsManager;
                String str = this.$uploadProcessId;
                UploadMetricEvent.FinishStep finishStep = new UploadMetricEvent.FinishStep(0L, true, false, 1, null);
                this.label = 1;
                if (videoUploadMetricsManager.addMetric(str, finishStep, this) == aVar) {
                    return aVar;
                }
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
    public final Object invoke(UploadingProgress uploadingProgress, d<? super Unit> dVar) {
        return ((VideoNetworkDataStore$upload$2) create(uploadingProgress, dVar)).invokeSuspend(Unit.f71690a);
    }
}
