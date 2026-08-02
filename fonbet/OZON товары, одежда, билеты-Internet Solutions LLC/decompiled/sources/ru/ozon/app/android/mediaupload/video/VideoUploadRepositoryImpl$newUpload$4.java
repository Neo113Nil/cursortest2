package ru.ozon.app.android.mediaupload.video;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "", "cause", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl$newUpload$4", f = "VideoUploadRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoUploadRepositoryImpl$newUpload$4 extends j implements InterfaceC6511n<InterfaceC2397i<? super UploadingProgress>, Throwable, d<? super Unit>, Object> {
    final /* synthetic */ String $uploadProcessId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VideoUploadRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoUploadRepositoryImpl$newUpload$4(VideoUploadRepositoryImpl videoUploadRepositoryImpl, String str, d<? super VideoUploadRepositoryImpl$newUpload$4> dVar) {
        super(3, dVar);
        this.this$0 = videoUploadRepositoryImpl;
        this.$uploadProcessId = str;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super UploadingProgress> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        VideoUploadRepositoryImpl$newUpload$4 videoUploadRepositoryImpl$newUpload$4 = new VideoUploadRepositoryImpl$newUpload$4(this.this$0, this.$uploadProcessId, dVar);
        videoUploadRepositoryImpl$newUpload$4.L$0 = th2;
        return videoUploadRepositoryImpl$newUpload$4.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VideoUploadMetricsManager videoUploadMetricsManager;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (((Throwable) this.L$0) instanceof CancellationException) {
            videoUploadMetricsManager = this.this$0.videoUploadMetricsManager;
            videoUploadMetricsManager.onUploadCancelled(this.$uploadProcessId);
        }
        return Unit.f71690a;
    }
}
