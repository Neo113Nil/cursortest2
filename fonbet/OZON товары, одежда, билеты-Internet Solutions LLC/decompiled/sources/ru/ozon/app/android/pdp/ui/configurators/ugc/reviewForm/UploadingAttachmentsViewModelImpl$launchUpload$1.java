package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "attach", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$launchUpload$1", f = "UploadingAttachmentsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class UploadingAttachmentsViewModelImpl$launchUpload$1 extends j implements Function2<AttachmentVO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UploadingAttachmentsViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadingAttachmentsViewModelImpl$launchUpload$1(UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl, d<? super UploadingAttachmentsViewModelImpl$launchUpload$1> dVar) {
        super(2, dVar);
        this.this$0 = uploadingAttachmentsViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UploadingAttachmentsViewModelImpl$launchUpload$1 uploadingAttachmentsViewModelImpl$launchUpload$1 = new UploadingAttachmentsViewModelImpl$launchUpload$1(this.this$0, dVar);
        uploadingAttachmentsViewModelImpl$launchUpload$1.L$0 = obj;
        return uploadingAttachmentsViewModelImpl$launchUpload$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AttachmentVO attachmentVO = (AttachmentVO) this.L$0;
        this.this$0.actualizeAttaches(C7714v.a0(attachmentVO), e0.h(AttachmentVO.Status.UPLOADED.INSTANCE));
        if ((attachmentVO.getStatus() instanceof AttachmentVO.Status.UPLOADING_ERROR) && attachmentVO.getIsFallbackUploading()) {
            this.this$0.uploadAttaches(C7714v.a0(attachmentVO));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AttachmentVO attachmentVO, d<? super Unit> dVar) {
        return ((UploadingAttachmentsViewModelImpl$launchUpload$1) create(attachmentVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
