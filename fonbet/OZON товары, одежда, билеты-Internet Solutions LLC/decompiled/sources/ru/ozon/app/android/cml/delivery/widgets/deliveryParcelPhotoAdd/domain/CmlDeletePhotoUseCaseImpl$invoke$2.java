package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhoto;
import xe.C10727i;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlDeletePhotoUseCaseImpl$invoke$2", f = "CmlDeletePhotoUseCase.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CmlDeletePhotoUseCaseImpl$invoke$2 extends j implements Function2<M, d<? super AttachedPhoto>, Object> {
    final /* synthetic */ AttachedPhoto $photo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CmlDeletePhotoUseCaseImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlDeletePhotoUseCaseImpl$invoke$2(AttachedPhoto attachedPhoto, CmlDeletePhotoUseCaseImpl cmlDeletePhotoUseCaseImpl, d<? super CmlDeletePhotoUseCaseImpl$invoke$2> dVar) {
        super(2, dVar);
        this.$photo = attachedPhoto;
        this.this$0 = cmlDeletePhotoUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CmlDeletePhotoUseCaseImpl$invoke$2 cmlDeletePhotoUseCaseImpl$invoke$2 = new CmlDeletePhotoUseCaseImpl$invoke$2(this.$photo, this.this$0, dVar);
        cmlDeletePhotoUseCaseImpl$invoke$2.L$0 = obj;
        return cmlDeletePhotoUseCaseImpl$invoke$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object s11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            U a11 = C10727i.a((M) this.L$0, null, null, new CmlDeletePhotoUseCaseImpl$invoke$2$deferredResult$1(this.this$0, this.$photo, null), 3);
            this.label = 1;
            s11 = a11.s(this);
            if (s11 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            s11 = obj;
        }
        boolean booleanValue = ((Boolean) s11).booleanValue();
        return AttachedPhoto.copy$default(this.$photo, null, booleanValue ? null : this.$photo.getCdnUrl(), booleanValue ? null : this.$photo.getRemoteId(), null, null, null, booleanValue ? AttachedPhoto.Status.DELETED : AttachedPhoto.Status.DELETING_ERROR, null, null, 441, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super AttachedPhoto> dVar) {
        return ((CmlDeletePhotoUseCaseImpl$invoke$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
