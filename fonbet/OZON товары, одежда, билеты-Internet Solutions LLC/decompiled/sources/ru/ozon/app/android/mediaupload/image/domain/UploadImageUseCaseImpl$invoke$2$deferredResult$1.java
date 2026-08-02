package ru.ozon.app.android.mediaupload.image.domain;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.image.data.response.UploadedImageDTO;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/mediaupload/image/domain/UploadedImage;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/mediaupload/image/domain/UploadedImage;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCaseImpl$invoke$2$deferredResult$1", f = "UploadImageUseCaseImpl.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class UploadImageUseCaseImpl$invoke$2$deferredResult$1 extends j implements Function2<M, d<? super UploadedImage>, Object> {
    final /* synthetic */ AttachmentVO.AttachedImageVO $attachmentVO;
    int label;
    final /* synthetic */ UploadImageUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadImageUseCaseImpl$invoke$2$deferredResult$1(UploadImageUseCaseImpl uploadImageUseCaseImpl, AttachmentVO.AttachedImageVO attachedImageVO, d<? super UploadImageUseCaseImpl$invoke$2$deferredResult$1> dVar) {
        super(2, dVar);
        this.this$0 = uploadImageUseCaseImpl;
        this.$attachmentVO = attachedImageVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UploadImageUseCaseImpl$invoke$2$deferredResult$1(this.this$0, this.$attachmentVO, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        UploadImageRepository uploadImageRepository;
        UploadedImageFromDTOMapper uploadedImageFromDTOMapper;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            uploadImageRepository = this.this$0.uploadImageRepository;
            AttachmentVO.AttachedImageVO attachedImageVO = this.$attachmentVO;
            this.label = 1;
            obj = uploadImageRepository.uploadImage(attachedImageVO, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            uploadedImageFromDTOMapper = this.this$0.uploadedImageFromDTOMapper;
            return uploadedImageFromDTOMapper.invoke((UploadedImageDTO) ((Result.Success) result).getValue());
        }
        if (result instanceof Result.Failure) {
            return new UploadedImage("", "", null, "", new Integer(0), new Integer(0));
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super UploadedImage> dVar) {
        return ((UploadImageUseCaseImpl$invoke$2$deferredResult$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
