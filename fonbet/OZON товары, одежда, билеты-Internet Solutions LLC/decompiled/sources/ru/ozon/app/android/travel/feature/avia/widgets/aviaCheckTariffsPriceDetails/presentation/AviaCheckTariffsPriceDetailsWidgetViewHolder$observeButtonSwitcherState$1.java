package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.i;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "switcherFlag", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.AviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1", f = "AviaCheckTariffsPriceDetailsWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AviaCheckTariffsPriceDetailsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1(AviaCheckTariffsPriceDetailsWidgetViewHolder aviaCheckTariffsPriceDetailsWidgetViewHolder, d<? super AviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1> dVar) {
        super(2, dVar);
        this.this$0 = aviaCheckTariffsPriceDetailsWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1 aviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1 = new AviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1(this.this$0, dVar);
        aviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1.Z$0 = ((Boolean) obj).booleanValue();
        return aviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        iVar = this.this$0.container;
        iVar.M().d(new AviaCheckTariffsPriceDetailsButtonUpdate(z11));
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((AviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
