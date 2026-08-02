package ru.ozon.app.android.mediaupload.video;

import Ae.C2405m;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationEvent;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/app/android/mediaupload/video/validation/VideoValidationEvent$ValidResult$ValidOk;", "<destruct>", "LAe/h;", "Lru/ozon/app/android/mediaupload/video/NewUploadingResponse;", "<anonymous>", "(Lru/ozon/app/android/mediaupload/video/validation/VideoValidationEvent$ValidResult$ValidOk;)LAe/h;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl$newUpload$2$2", f = "VideoUploadRepository.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoUploadRepositoryImpl$newUpload$2$2 extends j implements Function2<VideoValidationEvent.ValidResult.ValidOk, d<? super InterfaceC2395h<? extends NewUploadingResponse>>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ boolean $isRetryWithoutCheckSum;
    final /* synthetic */ String $uploadProcessId;
    final /* synthetic */ String $videoType;
    final /* synthetic */ Uri $videoUri;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VideoUploadRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoUploadRepositoryImpl$newUpload$2$2(VideoUploadRepositoryImpl videoUploadRepositoryImpl, String str, String str2, Uri uri, String str3, boolean z11, d<? super VideoUploadRepositoryImpl$newUpload$2$2> dVar) {
        super(2, dVar);
        this.this$0 = videoUploadRepositoryImpl;
        this.$actionName = str;
        this.$videoType = str2;
        this.$videoUri = uri;
        this.$uploadProcessId = str3;
        this.$isRetryWithoutCheckSum = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        VideoUploadRepositoryImpl$newUpload$2$2 videoUploadRepositoryImpl$newUpload$2$2 = new VideoUploadRepositoryImpl$newUpload$2$2(this.this$0, this.$actionName, this.$videoType, this.$videoUri, this.$uploadProcessId, this.$isRetryWithoutCheckSum, dVar);
        videoUploadRepositoryImpl$newUpload$2$2.L$0 = obj;
        return videoUploadRepositoryImpl$newUpload$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(VideoValidationEvent.ValidResult.ValidOk validOk, d<? super InterfaceC2395h<? extends NewUploadingResponse>> dVar) {
        return invoke2(validOk, (d<? super InterfaceC2395h<NewUploadingResponse>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VideoNetworkDataStore videoNetworkDataStore;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            JSONObject ffprobe = ((VideoValidationEvent.ValidResult.ValidOk) this.L$0).getFfprobe();
            videoNetworkDataStore = this.this$0.networkDataStore;
            String str = this.$actionName;
            String str2 = this.$videoType;
            Uri uri = this.$videoUri;
            String str3 = this.$uploadProcessId;
            boolean z11 = this.$isRetryWithoutCheckSum;
            this.label = 1;
            obj = videoNetworkDataStore.getUploadingId(str, ffprobe, str2, uri, str3, z11, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return new C2405m(obj);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(VideoValidationEvent.ValidResult.ValidOk validOk, d<? super InterfaceC2395h<NewUploadingResponse>> dVar) {
        return ((VideoUploadRepositoryImpl$newUpload$2$2) create(validOk, dVar)).invokeSuspend(Unit.f71690a);
    }
}
