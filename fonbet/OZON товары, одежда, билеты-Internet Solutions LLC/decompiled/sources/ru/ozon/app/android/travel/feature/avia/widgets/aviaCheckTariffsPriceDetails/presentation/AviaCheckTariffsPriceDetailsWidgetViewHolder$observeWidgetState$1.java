package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation;

import Sc.s;
import Wc.a;
import android.view.View;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.view.AviaCheckTariffsPriceDetailsView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.AviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1", f = "AviaCheckTariffsPriceDetailsWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1 extends j implements Function2<AviaCheckTariffsPriceDetailsVO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AviaCheckTariffsPriceDetailsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1(AviaCheckTariffsPriceDetailsWidgetViewHolder aviaCheckTariffsPriceDetailsWidgetViewHolder, d<? super AviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1> dVar) {
        super(2, dVar);
        this.this$0 = aviaCheckTariffsPriceDetailsWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1 aviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1 = new AviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1(this.this$0, dVar);
        aviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1.L$0 = obj;
        return aviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1<? super AtomAction, Unit> function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AviaCheckTariffsPriceDetailsVO aviaCheckTariffsPriceDetailsVO = (AviaCheckTariffsPriceDetailsVO) this.L$0;
        View view = this.this$0.getView();
        AviaCheckTariffsPriceDetailsView aviaCheckTariffsPriceDetailsView = view instanceof AviaCheckTariffsPriceDetailsView ? (AviaCheckTariffsPriceDetailsView) view : null;
        if (aviaCheckTariffsPriceDetailsView != null) {
            D a11 = K.a(this.this$0);
            function1 = this.this$0.actionHandler;
            aviaCheckTariffsPriceDetailsView.bind(aviaCheckTariffsPriceDetailsVO, a11, function1);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AviaCheckTariffsPriceDetailsVO aviaCheckTariffsPriceDetailsVO, d<? super Unit> dVar) {
        return ((AviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1) create(aviaCheckTariffsPriceDetailsVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
