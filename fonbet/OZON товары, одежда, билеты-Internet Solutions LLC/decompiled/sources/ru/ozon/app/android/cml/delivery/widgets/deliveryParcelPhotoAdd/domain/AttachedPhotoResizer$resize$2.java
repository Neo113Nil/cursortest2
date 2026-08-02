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
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhotoResizer;
import ru.ozon.app.android.platform.image.ImageResizer;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/domain/AttachedPhoto;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhotoResizer$resize$2", f = "AttachedPhotoResizer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AttachedPhotoResizer$resize$2 extends j implements Function2<M, d<? super AttachedPhoto>, Object> {
    final /* synthetic */ AttachedPhoto $photo;
    int label;
    final /* synthetic */ AttachedPhotoResizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AttachedPhotoResizer$resize$2(AttachedPhotoResizer attachedPhotoResizer, AttachedPhoto attachedPhoto, d<? super AttachedPhotoResizer$resize$2> dVar) {
        super(2, dVar);
        this.this$0 = attachedPhotoResizer;
        this.$photo = attachedPhoto;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AttachedPhotoResizer$resize$2(this.this$0, this.$photo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        AttachedPhotoResizer.Companion companion;
        ImageResizer imageResizer;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        try {
            imageResizer = this.this$0.imageResizer;
            str = imageResizer.resize(this.$photo.getMediaUri(), 1200.0f);
        } catch (Exception unused) {
            str = null;
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return AttachedPhoto.copy$default(this.$photo, null, null, null, null, null, null, AttachedPhoto.Status.RESIZING_ERROR, null, null, 415, null);
        }
        AttachedPhoto.Status status = AttachedPhoto.Status.UPLOADING;
        companion = AttachedPhotoResizer.Companion;
        return AttachedPhoto.copy$default(this.$photo, null, null, null, null, companion.getIMAGE_MEDIA_TYPE(), str2, status, null, null, 399, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super AttachedPhoto> dVar) {
        return ((AttachedPhotoResizer$resize$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
