package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.AttachedPhotoDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlDeletePhotoUseCaseImpl$invoke$2$deferredResult$1", f = "CmlDeletePhotoUseCase.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CmlDeletePhotoUseCaseImpl$invoke$2$deferredResult$1 extends j implements Function2<M, d<? super Boolean>, Object> {
    final /* synthetic */ AttachedPhoto $photo;
    int label;
    final /* synthetic */ CmlDeletePhotoUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlDeletePhotoUseCaseImpl$invoke$2$deferredResult$1(CmlDeletePhotoUseCaseImpl cmlDeletePhotoUseCaseImpl, AttachedPhoto attachedPhoto, d<? super CmlDeletePhotoUseCaseImpl$invoke$2$deferredResult$1> dVar) {
        super(2, dVar);
        this.this$0 = cmlDeletePhotoUseCaseImpl;
        this.$photo = attachedPhoto;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CmlDeletePhotoUseCaseImpl$invoke$2$deferredResult$1(this.this$0, this.$photo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CmlPhotoRepository cmlPhotoRepository;
        List<AttachedPhotoDTO.FailedPhotoDTO> failed;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            cmlPhotoRepository = this.this$0.cmlPhotoRepository;
            AttachedPhoto attachedPhoto = this.$photo;
            this.label = 1;
            obj = cmlPhotoRepository.mo578deletePhotosWrulAk(attachedPhoto, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        AttachedPhotoDTO attachedPhotoDTO = (AttachedPhotoDTO) obj;
        AttachedPhotoDTO.Data m585unboximpl = attachedPhotoDTO != null ? attachedPhotoDTO.m585unboximpl() : null;
        return Boolean.valueOf((m585unboximpl == null || (failed = m585unboximpl.getFailed()) == null || !failed.isEmpty()) ? false : true);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Boolean> dVar) {
        return ((CmlDeletePhotoUseCaseImpl$invoke$2$deferredResult$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
