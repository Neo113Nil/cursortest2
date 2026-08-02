package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownVO;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.adapter.DirectFlightsDropdownAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class DirectFlightsDropdownView$bind$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ DirectFlightsDropdownVO $data;
    final /* synthetic */ DirectFlightsDropdownView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectFlightsDropdownView$bind$1(DirectFlightsDropdownView directFlightsDropdownView, DirectFlightsDropdownVO directFlightsDropdownVO) {
        super(0);
        this.this$0 = directFlightsDropdownView;
        this.$data = directFlightsDropdownVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DirectFlightsDropdownAdapter directFlightsDropdownAdapter;
        directFlightsDropdownAdapter = this.this$0.itemsAdapter;
        if (directFlightsDropdownAdapter != null) {
            directFlightsDropdownAdapter.submitList(this.$data.getVisibleItems());
        }
    }
}
