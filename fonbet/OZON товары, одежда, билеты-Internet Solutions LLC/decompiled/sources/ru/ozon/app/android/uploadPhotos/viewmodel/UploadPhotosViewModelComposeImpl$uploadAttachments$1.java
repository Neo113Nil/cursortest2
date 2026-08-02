package ru.ozon.app.android.uploadPhotos.viewmodel;

import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "it", "LAe/h;", "<anonymous>", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;)LAe/h;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachments$1", f = "UploadPhotosViewModelComposeImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UploadPhotosViewModelComposeImpl$uploadAttachments$1 extends j implements Function2<AttachmentVO.AttachedImageVO, d<? super InterfaceC2395h<? extends AttachmentVO.AttachedImageVO>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UploadPhotosViewModelComposeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadPhotosViewModelComposeImpl$uploadAttachments$1(UploadPhotosViewModelComposeImpl uploadPhotosViewModelComposeImpl, d<? super UploadPhotosViewModelComposeImpl$uploadAttachments$1> dVar) {
        super(2, dVar);
        this.this$0 = uploadPhotosViewModelComposeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UploadPhotosViewModelComposeImpl$uploadAttachments$1 uploadPhotosViewModelComposeImpl$uploadAttachments$1 = new UploadPhotosViewModelComposeImpl$uploadAttachments$1(this.this$0, dVar);
        uploadPhotosViewModelComposeImpl$uploadAttachments$1.L$0 = obj;
        return uploadPhotosViewModelComposeImpl$uploadAttachments$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AttachmentVO.AttachedImageVO attachedImageVO, d<? super InterfaceC2395h<? extends AttachmentVO.AttachedImageVO>> dVar) {
        return invoke2(attachedImageVO, (d<? super InterfaceC2395h<AttachmentVO.AttachedImageVO>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2395h resizeImage;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        resizeImage = this.this$0.resizeImage((AttachmentVO.AttachedImageVO) this.L$0);
        return resizeImage;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AttachmentVO.AttachedImageVO attachedImageVO, d<? super InterfaceC2395h<AttachmentVO.AttachedImageVO>> dVar) {
        return ((UploadPhotosViewModelComposeImpl$uploadAttachments$1) create(attachedImageVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
