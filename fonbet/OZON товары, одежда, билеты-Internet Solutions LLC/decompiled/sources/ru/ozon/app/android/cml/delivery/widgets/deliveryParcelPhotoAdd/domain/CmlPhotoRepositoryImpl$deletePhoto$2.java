package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.data.AttachedPhotoDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/data/AttachedPhotoDTO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.CmlPhotoRepositoryImpl$deletePhoto$2", f = "CmlPhotoRepository.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CmlPhotoRepositoryImpl$deletePhoto$2 extends j implements Function2<M, d<? super AttachedPhotoDTO>, Object> {
    final /* synthetic */ AttachedPhoto $photo;
    int label;
    final /* synthetic */ CmlPhotoRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlPhotoRepositoryImpl$deletePhoto$2(AttachedPhoto attachedPhoto, CmlPhotoRepositoryImpl cmlPhotoRepositoryImpl, d<? super CmlPhotoRepositoryImpl$deletePhoto$2> dVar) {
        super(2, dVar);
        this.$photo = attachedPhoto;
        this.this$0 = cmlPhotoRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CmlPhotoRepositoryImpl$deletePhoto$2(this.$photo, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$photo.getDeletePhotoAction() == null) {
                return null;
            }
            AttachedPhoto attachedPhoto = this.$photo;
            Tc.d builder = new Tc.d();
            Map<String, String> params = attachedPhoto.getDeletePhotoAction().getParams();
            if (params == null) {
                params = U.c();
            }
            builder.putAll(params);
            builder.putIfAbsent("photo_id", attachedPhoto.getRemoteId());
            Intrinsics.checkNotNullParameter(builder, "builder");
            ActionV2Request actionV2Request = new ActionV2Request(builder.u(), this.$photo.getDeletePhotoAction().getActionName(), false, 4, null);
            actionV2Repository = this.this$0.actionV2Repository;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, AttachedPhotoDTO.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return ((ActionV2Response) obj).getData();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super AttachedPhotoDTO> dVar) {
        return ((CmlPhotoRepositoryImpl$deletePhoto$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
