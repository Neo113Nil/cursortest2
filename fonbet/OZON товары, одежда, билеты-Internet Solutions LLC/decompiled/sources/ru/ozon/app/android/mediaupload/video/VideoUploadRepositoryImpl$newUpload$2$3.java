package ru.ozon.app.android.mediaupload.video;

import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/app/android/mediaupload/video/NewUploadingResponse;", "<destruct>", "LAe/h;", "Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "<anonymous>", "(Lru/ozon/app/android/mediaupload/video/NewUploadingResponse;)LAe/h;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl$newUpload$2$3", f = "VideoUploadRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoUploadRepositoryImpl$newUpload$2$3 extends j implements Function2<NewUploadingResponse, d<? super InterfaceC2395h<? extends UploadingProgress>>, Object> {
    final /* synthetic */ boolean $isRetryWithoutCheckSum;
    final /* synthetic */ String $uploadProcessId;
    final /* synthetic */ Uri $videoUri;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VideoUploadRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoUploadRepositoryImpl$newUpload$2$3(VideoUploadRepositoryImpl videoUploadRepositoryImpl, Uri uri, String str, boolean z11, d<? super VideoUploadRepositoryImpl$newUpload$2$3> dVar) {
        super(2, dVar);
        this.this$0 = videoUploadRepositoryImpl;
        this.$videoUri = uri;
        this.$uploadProcessId = str;
        this.$isRetryWithoutCheckSum = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        VideoUploadRepositoryImpl$newUpload$2$3 videoUploadRepositoryImpl$newUpload$2$3 = new VideoUploadRepositoryImpl$newUpload$2$3(this.this$0, this.$videoUri, this.$uploadProcessId, this.$isRetryWithoutCheckSum, dVar);
        videoUploadRepositoryImpl$newUpload$2$3.L$0 = obj;
        return videoUploadRepositoryImpl$newUpload$2$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(NewUploadingResponse newUploadingResponse, d<? super InterfaceC2395h<? extends UploadingProgress>> dVar) {
        return invoke2(newUploadingResponse, (d<? super InterfaceC2395h<UploadingProgress>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        InterfaceC2395h upload;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String uploadId = ((NewUploadingResponse) this.L$0).getUploadId();
        map = this.this$0.uploadIds;
        map.put(this.$videoUri, uploadId);
        upload = this.this$0.upload(this.$videoUri, uploadId, this.$uploadProcessId, this.$isRetryWithoutCheckSum);
        return upload;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(NewUploadingResponse newUploadingResponse, d<? super InterfaceC2395h<UploadingProgress>> dVar) {
        return ((VideoUploadRepositoryImpl$newUpload$2$3) create(newUploadingResponse, dVar)).invokeSuspend(Unit.f71690a);
    }
}
