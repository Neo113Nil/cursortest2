package ru.ozon.app.android.mediaupload.video;

import Ae.C2399j;
import Ae.C2405m;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.Z;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.recyclerview.widget.m;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LAe/i;", "it", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl$newUpload$$inlined$flatMapLatest$1", f = "VideoUploadRepository.kt", l = {m.e.DEFAULT_DRAG_ANIMATION_DURATION, 189}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class VideoUploadRepositoryImpl$newUpload$$inlined$flatMapLatest$1 extends j implements InterfaceC6511n<InterfaceC2397i<? super UploadingProgress>, Boolean, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName$inlined;
    final /* synthetic */ boolean $isRetryWithoutCheckSum$inlined;
    final /* synthetic */ String $uploadId$inlined;
    final /* synthetic */ String $uploadProcessId$inlined;
    final /* synthetic */ String $videoType$inlined;
    final /* synthetic */ Uri $videoUri$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ VideoUploadRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoUploadRepositoryImpl$newUpload$$inlined$flatMapLatest$1(d dVar, String str, boolean z11, VideoUploadRepositoryImpl videoUploadRepositoryImpl, Uri uri, String str2, String str3, String str4) {
        super(3, dVar);
        this.$uploadId$inlined = str;
        this.$isRetryWithoutCheckSum$inlined = z11;
        this.this$0 = videoUploadRepositoryImpl;
        this.$videoUri$inlined = uri;
        this.$uploadProcessId$inlined = str2;
        this.$videoType$inlined = str3;
        this.$actionName$inlined = str4;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super UploadingProgress> interfaceC2397i, Boolean bool, d<? super Unit> dVar) {
        VideoUploadRepositoryImpl$newUpload$$inlined$flatMapLatest$1 videoUploadRepositoryImpl$newUpload$$inlined$flatMapLatest$1 = new VideoUploadRepositoryImpl$newUpload$$inlined$flatMapLatest$1(dVar, this.$uploadId$inlined, this.$isRetryWithoutCheckSum$inlined, this.this$0, this.$videoUri$inlined, this.$uploadProcessId$inlined, this.$videoType$inlined, this.$actionName$inlined);
        videoUploadRepositoryImpl$newUpload$$inlined$flatMapLatest$1.L$0 = interfaceC2397i;
        videoUploadRepositoryImpl$newUpload$$inlined$flatMapLatest$1.L$1 = bool;
        return videoUploadRepositoryImpl$newUpload$$inlined$flatMapLatest$1.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        if (Ae.C2399j.r(r1, r13, r12) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r13 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        VideoNetworkDataStore videoNetworkDataStore;
        boolean z11;
        InterfaceC2395h upload;
        InterfaceC2395h a11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            if (!((Boolean) this.L$1).booleanValue()) {
                throw new IllegalStateException("Connection lost");
            }
            String str = this.$uploadId$inlined;
            if (str == null || (z11 = this.$isRetryWithoutCheckSum$inlined)) {
                videoNetworkDataStore = this.this$0.networkDataStore;
                Uri uri = this.$videoUri$inlined;
                String str2 = this.$videoType$inlined;
                String str3 = this.$uploadProcessId$inlined;
                this.L$0 = interfaceC2397i;
                this.label = 1;
                obj = videoNetworkDataStore.validate(uri, str2, str3, this);
            } else {
                upload = this.this$0.upload(this.$videoUri$inlined, str, this.$uploadProcessId$inlined, z11);
                this.L$0 = null;
                this.label = 2;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            s.b(obj);
        }
        a11 = Z.a(new C2405m(obj), new VideoUploadRepositoryImpl$newUpload$2$2(this.this$0, this.$actionName$inlined, this.$videoType$inlined, this.$videoUri$inlined, this.$uploadProcessId$inlined, this.$isRetryWithoutCheckSum$inlined, null));
        upload = C2399j.y(a11, new VideoUploadRepositoryImpl$newUpload$2$3(this.this$0, this.$videoUri$inlined, this.$uploadProcessId$inlined, this.$isRetryWithoutCheckSum$inlined, null));
        this.L$0 = null;
        this.label = 2;
    }
}
