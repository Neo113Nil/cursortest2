package ru.ozon.app.android.uploadPhotos.viewmodel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "attach", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachments$4", f = "UploadPhotosViewModelComposeImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UploadPhotosViewModelComposeImpl$uploadAttachments$4 extends j implements Function2<AttachmentVO.AttachedImageVO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UploadPhotosViewModelComposeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadPhotosViewModelComposeImpl$uploadAttachments$4(UploadPhotosViewModelComposeImpl uploadPhotosViewModelComposeImpl, d<? super UploadPhotosViewModelComposeImpl$uploadAttachments$4> dVar) {
        super(2, dVar);
        this.this$0 = uploadPhotosViewModelComposeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UploadPhotosViewModelComposeImpl$uploadAttachments$4 uploadPhotosViewModelComposeImpl$uploadAttachments$4 = new UploadPhotosViewModelComposeImpl$uploadAttachments$4(this.this$0, dVar);
        uploadPhotosViewModelComposeImpl$uploadAttachments$4.L$0 = obj;
        return uploadPhotosViewModelComposeImpl$uploadAttachments$4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.actualizeAttaches(C7714v.a0((AttachmentVO.AttachedImageVO) this.L$0), e0.h(AttachmentVO.Status.UPLOADED.INSTANCE));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AttachmentVO.AttachedImageVO attachedImageVO, d<? super Unit> dVar) {
        return ((UploadPhotosViewModelComposeImpl$uploadAttachments$4) create(attachedImageVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
