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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "", "error", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$launchUpload$2", f = "UploadingAttachmentsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class UploadingAttachmentsViewModelImpl$launchUpload$2 extends j implements InterfaceC6511n<InterfaceC2397i<? super AttachmentVO>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    UploadingAttachmentsViewModelImpl$launchUpload$2(d<? super UploadingAttachmentsViewModelImpl$launchUpload$2> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super AttachmentVO> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        UploadingAttachmentsViewModelImpl$launchUpload$2 uploadingAttachmentsViewModelImpl$launchUpload$2 = new UploadingAttachmentsViewModelImpl$launchUpload$2(dVar);
        uploadingAttachmentsViewModelImpl$launchUpload$2.L$0 = th2;
        return uploadingAttachmentsViewModelImpl$launchUpload$2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Lm0.a.f17149a.e((Throwable) this.L$0);
        return Unit.f71690a;
    }
}
