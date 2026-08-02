package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownItemView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownItemView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class DirectFlightsDropdownWidgetViewHolder$tempViewForMeasure$2 extends AbstractC7737t implements Function0<DirectFlightsDropdownItemView> {
    final /* synthetic */ DirectFlightsDropdownWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectFlightsDropdownWidgetViewHolder$tempViewForMeasure$2(DirectFlightsDropdownWidgetViewHolder directFlightsDropdownWidgetViewHolder) {
        super(0);
        this.this$0 = directFlightsDropdownWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DirectFlightsDropdownItemView invoke() {
        DirectFlightsDropdownItemView directFlightsDropdownItemView = new DirectFlightsDropdownItemView(this.this$0.getContext());
        directFlightsDropdownItemView.setId(R$id.directFlightsDropdownItemTempView);
        directFlightsDropdownItemView.setLayoutParams(new ConstraintLayout.b(0, -2));
        directFlightsDropdownItemView.setVisibility(4);
        return directFlightsDropdownItemView;
    }
}
