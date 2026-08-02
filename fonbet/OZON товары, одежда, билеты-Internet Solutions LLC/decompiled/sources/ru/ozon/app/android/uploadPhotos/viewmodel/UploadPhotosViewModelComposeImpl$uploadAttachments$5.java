package ru.ozon.app.android.uploadPhotos.viewmodel;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachments$5", f = "UploadPhotosViewModelComposeImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UploadPhotosViewModelComposeImpl$uploadAttachments$5 extends j implements InterfaceC6511n<InterfaceC2397i<? super AttachmentVO.AttachedImageVO>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    UploadPhotosViewModelComposeImpl$uploadAttachments$5(d<? super UploadPhotosViewModelComposeImpl$uploadAttachments$5> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super AttachmentVO.AttachedImageVO> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        UploadPhotosViewModelComposeImpl$uploadAttachments$5 uploadPhotosViewModelComposeImpl$uploadAttachments$5 = new UploadPhotosViewModelComposeImpl$uploadAttachments$5(dVar);
        uploadPhotosViewModelComposeImpl$uploadAttachments$5.L$0 = th2;
        return uploadPhotosViewModelComposeImpl$uploadAttachments$5.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Lm0.a.f17149a.e((Throwable) this.L$0);
        return Unit.f71690a;
    }
}
