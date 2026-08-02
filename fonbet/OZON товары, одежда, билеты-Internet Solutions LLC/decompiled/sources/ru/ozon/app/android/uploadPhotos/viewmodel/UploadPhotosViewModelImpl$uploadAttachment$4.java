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
@e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelImpl$uploadAttachment$4", f = "UploadPhotosViewModelImpl.kt", l = {224}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UploadPhotosViewModelImpl$uploadAttachment$4 extends j implements InterfaceC6511n<InterfaceC2397i<? super AttachmentVO.AttachedImageVO>, Throwable, d<? super Unit>, Object> {
    final /* synthetic */ AttachmentVO.AttachedImageVO $attachment;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadPhotosViewModelImpl$uploadAttachment$4(AttachmentVO.AttachedImageVO attachedImageVO, d<? super UploadPhotosViewModelImpl$uploadAttachment$4> dVar) {
        super(3, dVar);
        this.$attachment = attachedImageVO;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super AttachmentVO.AttachedImageVO> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        UploadPhotosViewModelImpl$uploadAttachment$4 uploadPhotosViewModelImpl$uploadAttachment$4 = new UploadPhotosViewModelImpl$uploadAttachment$4(this.$attachment, dVar);
        uploadPhotosViewModelImpl$uploadAttachment$4.L$0 = interfaceC2397i;
        return uploadPhotosViewModelImpl$uploadAttachment$4.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
            AttachmentVO.AttachedImageVO copy$default = AttachmentVO.AttachedImageVO.copy$default(this.$attachment, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, AttachmentVO.Status.UPLOADING_ERROR.INSTANCE, null, false, 229371, null);
            this.label = 1;
            if (interfaceC2397i.emit(copy$default, this) == aVar) {
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
}
