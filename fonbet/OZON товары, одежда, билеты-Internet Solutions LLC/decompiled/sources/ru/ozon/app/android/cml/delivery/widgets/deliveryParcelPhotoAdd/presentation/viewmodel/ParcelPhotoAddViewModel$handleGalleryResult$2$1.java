package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel.ParcelPhotoAddViewModel;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel.ParcelPhotoAddViewModel$handleGalleryResult$2$1", f = "ParcelPhotoAddViewModel.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ParcelPhotoAddViewModel$handleGalleryResult$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ParcelPhotoAddViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParcelPhotoAddViewModel$handleGalleryResult$2$1(ParcelPhotoAddViewModel parcelPhotoAddViewModel, d<? super ParcelPhotoAddViewModel$handleGalleryResult$2$1> dVar) {
        super(2, dVar);
        this.this$0 = parcelPhotoAddViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ParcelPhotoAddViewModel$handleGalleryResult$2$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h hVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            hVar = this.this$0._analyticsEvents;
            ParcelPhotoAddViewModel.Companion.AnalyticsEvent analyticsEvent = ParcelPhotoAddViewModel.Companion.AnalyticsEvent.PICKED;
            this.label = 1;
            if (hVar.n(analyticsEvent, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ParcelPhotoAddViewModel$handleGalleryResult$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
