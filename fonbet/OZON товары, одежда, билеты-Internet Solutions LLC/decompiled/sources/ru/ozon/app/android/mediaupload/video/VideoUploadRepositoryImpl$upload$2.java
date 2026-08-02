package ru.ozon.app.android.mediaupload.video;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import android.net.Uri;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl$upload$2", f = "VideoUploadRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoUploadRepositoryImpl$upload$2 extends j implements InterfaceC6511n<InterfaceC2397i<? super UploadingProgress>, Throwable, d<? super Unit>, Object> {
    final /* synthetic */ Uri $videoUri;
    int label;
    final /* synthetic */ VideoUploadRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoUploadRepositoryImpl$upload$2(VideoUploadRepositoryImpl videoUploadRepositoryImpl, Uri uri, d<? super VideoUploadRepositoryImpl$upload$2> dVar) {
        super(3, dVar);
        this.this$0 = videoUploadRepositoryImpl;
        this.$videoUri = uri;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super UploadingProgress> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        return new VideoUploadRepositoryImpl$upload$2(this.this$0, this.$videoUri, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        Map map2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        map = this.this$0.uploadIds;
        map.remove(this.$videoUri);
        map2 = this.this$0.uploadJobs;
        map2.remove(this.$videoUri);
        return Unit.f71690a;
    }
}
