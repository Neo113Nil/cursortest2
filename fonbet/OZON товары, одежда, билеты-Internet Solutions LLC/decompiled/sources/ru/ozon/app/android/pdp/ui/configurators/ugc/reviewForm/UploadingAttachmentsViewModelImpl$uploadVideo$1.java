package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm;

import Sc.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedVideoVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModelImpl$uploadVideo$1", f = "UploadingAttachmentsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class UploadingAttachmentsViewModelImpl$uploadVideo$1 extends j implements Function2<AttachmentVO.AttachedVideoVO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UploadingAttachmentsViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadingAttachmentsViewModelImpl$uploadVideo$1(UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl, d<? super UploadingAttachmentsViewModelImpl$uploadVideo$1> dVar) {
        super(2, dVar);
        this.this$0 = uploadingAttachmentsViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UploadingAttachmentsViewModelImpl$uploadVideo$1 uploadingAttachmentsViewModelImpl$uploadVideo$1 = new UploadingAttachmentsViewModelImpl$uploadVideo$1(this.this$0, dVar);
        uploadingAttachmentsViewModelImpl$uploadVideo$1.L$0 = obj;
        return uploadingAttachmentsViewModelImpl$uploadVideo$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AttachmentVO.AttachedVideoVO attachedVideoVO = (AttachmentVO.AttachedVideoVO) this.L$0;
        UploadingAttachmentsViewModelImpl uploadingAttachmentsViewModelImpl = this.this$0;
        List a02 = C7714v.a0(attachedVideoVO);
        AttachmentVO.Status[] elements = {AttachmentVO.Status.UPLOADED.INSTANCE, AttachmentVO.Status.UPLOADING.INSTANCE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        uploadingAttachmentsViewModelImpl.actualizeAttaches(a02, C7705l.j0(elements));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AttachmentVO.AttachedVideoVO attachedVideoVO, d<? super Unit> dVar) {
        return ((UploadingAttachmentsViewModelImpl$uploadVideo$1) create(attachedVideoVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
