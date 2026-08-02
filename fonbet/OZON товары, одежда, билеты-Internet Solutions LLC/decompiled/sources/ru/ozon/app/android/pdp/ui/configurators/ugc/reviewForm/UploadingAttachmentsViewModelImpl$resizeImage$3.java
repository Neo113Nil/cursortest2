package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import Ae.InterfaceC2397i;
import Sc.s;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$resizeImage$3", f = "UploadingAttachmentsViewModel.kt", l = {450}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class UploadingAttachmentsViewModelImpl$resizeImage$3 extends j implements InterfaceC6511n<InterfaceC2397i<? super AttachmentVO.AttachedImageVO>, Throwable, d<? super Unit>, Object> {
    final /* synthetic */ AttachmentVO.AttachedImageVO $attach;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadingAttachmentsViewModelImpl$resizeImage$3(AttachmentVO.AttachedImageVO attachedImageVO, d<? super UploadingAttachmentsViewModelImpl$resizeImage$3> dVar) {
        super(3, dVar);
        this.$attach = attachedImageVO;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super AttachmentVO.AttachedImageVO> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        UploadingAttachmentsViewModelImpl$resizeImage$3 uploadingAttachmentsViewModelImpl$resizeImage$3 = new UploadingAttachmentsViewModelImpl$resizeImage$3(this.$attach, dVar);
        uploadingAttachmentsViewModelImpl$resizeImage$3.L$0 = interfaceC2397i;
        return uploadingAttachmentsViewModelImpl$resizeImage$3.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
            AttachmentVO.AttachedImageVO copy$default = AttachmentVO.AttachedImageVO.copy$default(this.$attach, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, AttachmentVO.Status.RESIZING_ERROR.INSTANCE, null, false, 229373, null);
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
