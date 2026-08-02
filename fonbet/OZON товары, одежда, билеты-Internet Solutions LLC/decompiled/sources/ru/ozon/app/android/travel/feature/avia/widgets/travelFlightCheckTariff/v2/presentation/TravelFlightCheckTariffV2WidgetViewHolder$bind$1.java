package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation;

import Sc.s;
import Wc.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetFlightCheckTariffV2Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.view.TravelFlightCheckTariffView;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2WidgetViewHolder$bind$1", f = "TravelFlightCheckTariffV2WidgetViewHolder.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TravelFlightCheckTariffV2WidgetViewHolder$bind$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ TravelFlightCheckTariffV2VO $item;
    final /* synthetic */ TravelFlightCheckTariffView $tariffItemView;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TravelFlightCheckTariffV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelFlightCheckTariffV2WidgetViewHolder$bind$1(TravelFlightCheckTariffView travelFlightCheckTariffView, TravelFlightCheckTariffV2WidgetViewHolder travelFlightCheckTariffV2WidgetViewHolder, TravelFlightCheckTariffV2VO travelFlightCheckTariffV2VO, d<? super TravelFlightCheckTariffV2WidgetViewHolder$bind$1> dVar) {
        super(2, dVar);
        this.$tariffItemView = travelFlightCheckTariffView;
        this.this$0 = travelFlightCheckTariffV2WidgetViewHolder;
        this.$item = travelFlightCheckTariffV2VO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TravelFlightCheckTariffV2WidgetViewHolder$bind$1 travelFlightCheckTariffV2WidgetViewHolder$bind$1 = new TravelFlightCheckTariffV2WidgetViewHolder$bind$1(this.$tariffItemView, this.this$0, this.$item, dVar);
        travelFlightCheckTariffV2WidgetViewHolder$bind$1.L$0 = obj;
        return travelFlightCheckTariffV2WidgetViewHolder$bind$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M m11;
        WidgetFlightCheckTariffV2Binding widgetFlightCheckTariffV2Binding;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m12 = (M) this.L$0;
            TravelFlightCheckTariffView travelFlightCheckTariffView = this.$tariffItemView;
            TravelFlightCheckTariffView.bind$default(travelFlightCheckTariffView, this.$item.getTallestTariff(), null, 2, null);
            travelFlightCheckTariffView.requestLayout();
            this.L$0 = m12;
            this.label = 1;
            if (ViewExtensionsKt.awaitNextLayout(travelFlightCheckTariffView, this) == aVar) {
                return aVar;
            }
            m11 = m12;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        if (N.f(m11)) {
            widgetFlightCheckTariffV2Binding = this.this$0.binding;
            RecyclerView recyclerView = widgetFlightCheckTariffV2Binding.travelFlightCheckTariffV2RecyclerView;
            TravelFlightCheckTariffView travelFlightCheckTariffView2 = this.$tariffItemView;
            recyclerView.getLayoutParams().height = recyclerView.getPaddingBottom() + recyclerView.getPaddingTop() + travelFlightCheckTariffView2.getHeight();
            recyclerView.requestLayout();
            ((ViewGroup) this.this$0.getContainerView()).removeView(this.$tariffItemView);
            this.this$0.showTariffs(this.$item.getTariffs(), this.$item.getSelectedTariffPosition());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TravelFlightCheckTariffV2WidgetViewHolder$bind$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
