package ru.ozon.app.android.uploadPhotos.viewmodel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachment$5", f = "UploadPhotosViewModelComposeImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UploadPhotosViewModelComposeImpl$uploadAttachment$5 extends j implements Function2<AttachmentVO.AttachedImageVO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    UploadPhotosViewModelComposeImpl$uploadAttachment$5(d<? super UploadPhotosViewModelComposeImpl$uploadAttachment$5> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UploadPhotosViewModelComposeImpl$uploadAttachment$5 uploadPhotosViewModelComposeImpl$uploadAttachment$5 = new UploadPhotosViewModelComposeImpl$uploadAttachment$5(dVar);
        uploadPhotosViewModelComposeImpl$uploadAttachment$5.L$0 = obj;
        return uploadPhotosViewModelComposeImpl$uploadAttachment$5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Lm0.a.f17149a.d(String.valueOf(((AttachmentVO.AttachedImageVO) this.L$0).getUploadingProgress()), new Object[0]);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AttachmentVO.AttachedImageVO attachedImageVO, d<? super Unit> dVar) {
        return ((UploadPhotosViewModelComposeImpl$uploadAttachment$5) create(attachedImageVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
