package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "message", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.ParcelPhotoAddWidgetViewHolder$initObservers$3", f = "ParcelPhotoAddWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ParcelPhotoAddWidgetViewHolder$initObservers$3 extends j implements Function2<String, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ParcelPhotoAddWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParcelPhotoAddWidgetViewHolder$initObservers$3(ParcelPhotoAddWidgetViewHolder parcelPhotoAddWidgetViewHolder, d<? super ParcelPhotoAddWidgetViewHolder$initObservers$3> dVar) {
        super(2, dVar);
        this.this$0 = parcelPhotoAddWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ParcelPhotoAddWidgetViewHolder$initObservers$3 parcelPhotoAddWidgetViewHolder$initObservers$3 = new ParcelPhotoAddWidgetViewHolder$initObservers$3(this.this$0, dVar);
        parcelPhotoAddWidgetViewHolder$initObservers$3.L$0 = obj;
        return parcelPhotoAddWidgetViewHolder$initObservers$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.showError((String) this.L$0);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((ParcelPhotoAddWidgetViewHolder$initObservers$3) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
