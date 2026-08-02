package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import Sc.s;
import Wc.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.AttachedPhotoDTO;
import xe.C10727i;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlUploadPhotoUseCaseImpl$invoke$2", f = "CmlUploadPhotoUseCase.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CmlUploadPhotoUseCaseImpl$invoke$2 extends j implements Function2<M, d<? super AttachedPhoto>, Object> {
    final /* synthetic */ String $deliveryNumber;
    final /* synthetic */ AttachedPhoto $photo;
    final /* synthetic */ String $postingNumber;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CmlUploadPhotoUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlUploadPhotoUseCaseImpl$invoke$2(CmlUploadPhotoUseCaseImpl cmlUploadPhotoUseCaseImpl, AttachedPhoto attachedPhoto, String str, String str2, d<? super CmlUploadPhotoUseCaseImpl$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = cmlUploadPhotoUseCaseImpl;
        this.$photo = attachedPhoto;
        this.$deliveryNumber = str;
        this.$postingNumber = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CmlUploadPhotoUseCaseImpl$invoke$2 cmlUploadPhotoUseCaseImpl$invoke$2 = new CmlUploadPhotoUseCaseImpl$invoke$2(this.this$0, this.$photo, this.$deliveryNumber, this.$postingNumber, dVar);
        cmlUploadPhotoUseCaseImpl$invoke$2.L$0 = obj;
        return cmlUploadPhotoUseCaseImpl$invoke$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap concurrentHashMap;
        AttachedPhoto attachedPhoto;
        AttachedPhoto updateWithDTO;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            U a11 = C10727i.a((M) this.L$0, null, null, new CmlUploadPhotoUseCaseImpl$invoke$2$deferredResult$1(this.this$0, this.$photo, this.$deliveryNumber, this.$postingNumber, null), 3);
            concurrentHashMap = this.this$0.jobs;
            concurrentHashMap.put(this.$photo.getPhotoKey(), a11);
            AttachedPhoto attachedPhoto2 = this.$photo;
            this.L$0 = attachedPhoto2;
            this.label = 1;
            obj = a11.s(this);
            if (obj == aVar) {
                return aVar;
            }
            attachedPhoto = attachedPhoto2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attachedPhoto = (AttachedPhoto) this.L$0;
            s.b(obj);
        }
        updateWithDTO = CmlUploadPhotoUseCaseKt.updateWithDTO(attachedPhoto, (AttachedPhotoDTO.Data) obj);
        return updateWithDTO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super AttachedPhoto> dVar) {
        return ((CmlUploadPhotoUseCaseImpl$invoke$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
