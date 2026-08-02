package ru.ozon.app.android.mediaupload.video;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "", "exception", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl$newUpload$3", f = "VideoUploadRepository.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoUploadRepositoryImpl$newUpload$3 extends j implements InterfaceC6511n<InterfaceC2397i<? super UploadingProgress>, Throwable, d<? super Unit>, Object> {
    final /* synthetic */ String $uploadProcessId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VideoUploadRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoUploadRepositoryImpl$newUpload$3(VideoUploadRepositoryImpl videoUploadRepositoryImpl, String str, d<? super VideoUploadRepositoryImpl$newUpload$3> dVar) {
        super(3, dVar);
        this.this$0 = videoUploadRepositoryImpl;
        this.$uploadProcessId = str;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super UploadingProgress> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        VideoUploadRepositoryImpl$newUpload$3 videoUploadRepositoryImpl$newUpload$3 = new VideoUploadRepositoryImpl$newUpload$3(this.this$0, this.$uploadProcessId, dVar);
        videoUploadRepositoryImpl$newUpload$3.L$0 = th2;
        return videoUploadRepositoryImpl$newUpload$3.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VideoUploadMetricsManager videoUploadMetricsManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th2 = (Throwable) this.L$0;
            s.b(obj);
            throw th2;
        }
        s.b(obj);
        Throwable th3 = (Throwable) this.L$0;
        videoUploadMetricsManager = this.this$0.videoUploadMetricsManager;
        String str = this.$uploadProcessId;
        UploadMetricEvent.FinishStep finishStep = new UploadMetricEvent.FinishStep(0L, false, false, 1, null);
        this.L$0 = th3;
        this.label = 1;
        if (videoUploadMetricsManager.addMetric(str, finishStep, this) == aVar) {
            return aVar;
        }
        throw th3;
    }
}
