package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.AttachedPhotoDTO;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO$Data;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlUploadPhotoUseCaseImpl$invoke$2$deferredResult$1", f = "CmlUploadPhotoUseCase.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CmlUploadPhotoUseCaseImpl$invoke$2$deferredResult$1 extends j implements Function2<M, d<? super AttachedPhotoDTO.Data>, Object> {
    final /* synthetic */ String $deliveryNumber;
    final /* synthetic */ AttachedPhoto $photo;
    final /* synthetic */ String $postingNumber;
    int label;
    final /* synthetic */ CmlUploadPhotoUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlUploadPhotoUseCaseImpl$invoke$2$deferredResult$1(CmlUploadPhotoUseCaseImpl cmlUploadPhotoUseCaseImpl, AttachedPhoto attachedPhoto, String str, String str2, d<? super CmlUploadPhotoUseCaseImpl$invoke$2$deferredResult$1> dVar) {
        super(2, dVar);
        this.this$0 = cmlUploadPhotoUseCaseImpl;
        this.$photo = attachedPhoto;
        this.$deliveryNumber = str;
        this.$postingNumber = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CmlUploadPhotoUseCaseImpl$invoke$2$deferredResult$1(this.this$0, this.$photo, this.$deliveryNumber, this.$postingNumber, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CmlPhotoRepository cmlPhotoRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cmlPhotoRepository = this.this$0.cmlPhotoRepository;
            AttachedPhoto attachedPhoto = this.$photo;
            String str = this.$deliveryNumber;
            String str2 = this.$postingNumber;
            this.label = 1;
            obj = cmlPhotoRepository.uploadPhoto(attachedPhoto, str, str2, this);
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
            AttachedPhotoDTO.Data m585unboximpl = ((AttachedPhotoDTO) ((Result.Success) result).getValue()).m585unboximpl();
            return m585unboximpl == null ? new AttachedPhotoDTO.Data(null, C7714v.a0(AttachedPhotoDTO.FailedPhotoDTO.m586boximpl(AttachedPhotoDTO.FailedPhotoDTO.m587constructorimpl(this.$photo.getPhotoKey())))) : m585unboximpl;
        }
        if (result instanceof Result.Failure) {
            return new AttachedPhotoDTO.Data(null, C7714v.a0(AttachedPhotoDTO.FailedPhotoDTO.m586boximpl(AttachedPhotoDTO.FailedPhotoDTO.m587constructorimpl(this.$photo.getPhotoKey()))));
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super AttachedPhotoDTO.Data> dVar) {
        return ((CmlUploadPhotoUseCaseImpl$invoke$2$deferredResult$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
