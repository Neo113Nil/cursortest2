package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.domain.AttachedPhoto;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.viewmodel.ParcelPhotoAddViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/viewmodel/ParcelPhotoAddViewModel$Companion$ViewState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddWidgetViewHolder$initObservers$1", f = "ParcelPhotoAddWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ParcelPhotoAddWidgetViewHolder$initObservers$1 extends j implements Function2<ParcelPhotoAddViewModel.Companion.ViewState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ParcelPhotoAddWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParcelPhotoAddWidgetViewHolder$initObservers$1(ParcelPhotoAddWidgetViewHolder parcelPhotoAddWidgetViewHolder, d<? super ParcelPhotoAddWidgetViewHolder$initObservers$1> dVar) {
        super(2, dVar);
        this.this$0 = parcelPhotoAddWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ParcelPhotoAddWidgetViewHolder$initObservers$1 parcelPhotoAddWidgetViewHolder$initObservers$1 = new ParcelPhotoAddWidgetViewHolder$initObservers$1(this.this$0, dVar);
        parcelPhotoAddWidgetViewHolder$initObservers$1.L$0 = obj;
        return parcelPhotoAddWidgetViewHolder$initObservers$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ParcelPhotoAddViewModel.Companion.ViewState viewState, d<? super Unit> dVar) {
        return m598invokesG6W6Mc(viewState.getAttachments(), dVar);
    }

    /* renamed from: invoke-sG6W6Mc, reason: not valid java name */
    public final Object m598invokesG6W6Mc(List<? extends AttachedPhoto> list, d<? super Unit> dVar) {
        return ((ParcelPhotoAddWidgetViewHolder$initObservers$1) create(ParcelPhotoAddViewModel.Companion.ViewState.m599boximpl(list), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.updateAttaches(((ParcelPhotoAddViewModel.Companion.ViewState) this.L$0).getAttachments());
        return Unit.f71690a;
    }
}
