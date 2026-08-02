package ru.ozon.app.android.uploadPhotos.viewmodel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.image.domain.UploadedImage;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/mediaupload/image/domain/UploadedImage;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModelComposeImpl$uploadAttachment$2", f = "UploadPhotosViewModelComposeImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UploadPhotosViewModelComposeImpl$uploadAttachment$2 extends j implements Function2<UploadedImage, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    UploadPhotosViewModelComposeImpl$uploadAttachment$2(d<? super UploadPhotosViewModelComposeImpl$uploadAttachment$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UploadPhotosViewModelComposeImpl$uploadAttachment$2 uploadPhotosViewModelComposeImpl$uploadAttachment$2 = new UploadPhotosViewModelComposeImpl$uploadAttachment$2(dVar);
        uploadPhotosViewModelComposeImpl$uploadAttachment$2.L$0 = obj;
        return uploadPhotosViewModelComposeImpl$uploadAttachment$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (((UploadedImage) this.L$0).getUrl().length() > 0) {
            return Unit.f71690a;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UploadedImage uploadedImage, d<? super Unit> dVar) {
        return ((UploadPhotosViewModelComposeImpl$uploadAttachment$2) create(uploadedImage, dVar)).invokeSuspend(Unit.f71690a);
    }
}
