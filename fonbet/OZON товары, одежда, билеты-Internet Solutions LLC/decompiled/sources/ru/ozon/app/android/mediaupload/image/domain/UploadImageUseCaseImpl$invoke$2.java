package ru.ozon.app.android.mediaupload.image.domain;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import xe.C10727i;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/mediaupload/image/domain/UploadedImage;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/mediaupload/image/domain/UploadedImage;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCaseImpl$invoke$2", f = "UploadImageUseCaseImpl.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class UploadImageUseCaseImpl$invoke$2 extends j implements Function2<M, d<? super UploadedImage>, Object> {
    final /* synthetic */ AttachmentVO.AttachedImageVO $attachmentVO;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UploadImageUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadImageUseCaseImpl$invoke$2(UploadImageUseCaseImpl uploadImageUseCaseImpl, AttachmentVO.AttachedImageVO attachedImageVO, d<? super UploadImageUseCaseImpl$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = uploadImageUseCaseImpl;
        this.$attachmentVO = attachedImageVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        UploadImageUseCaseImpl$invoke$2 uploadImageUseCaseImpl$invoke$2 = new UploadImageUseCaseImpl$invoke$2(this.this$0, this.$attachmentVO, dVar);
        uploadImageUseCaseImpl$invoke$2.L$0 = obj;
        return uploadImageUseCaseImpl$invoke$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        U u11;
        Map map;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            U a11 = C10727i.a((M) this.L$0, null, null, new UploadImageUseCaseImpl$invoke$2$deferredResult$1(this.this$0, this.$attachmentVO, null), 3);
            this.L$0 = a11;
            this.label = 1;
            Object s11 = a11.s(this);
            if (s11 == aVar) {
                return aVar;
            }
            u11 = a11;
            obj = s11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u11 = (U) this.L$0;
            s.b(obj);
        }
        UploadedImage uploadedImage = (UploadedImage) obj;
        map = this.this$0.jobs;
        map.put(new Long(this.$attachmentVO.getId()), u11);
        return uploadedImage;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super UploadedImage> dVar) {
        return ((UploadImageUseCaseImpl$invoke$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
