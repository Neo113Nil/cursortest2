package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.cards.CardsAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV4View$hideCards$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ HotelsMapInfoV4View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4View$hideCards$1(HotelsMapInfoV4View hotelsMapInfoV4View) {
        super(0);
        this.this$0 = hotelsMapInfoV4View;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        RecyclerView recyclerView;
        recyclerView = this.this$0.cardsRv;
        RecyclerView.g adapter = recyclerView.getAdapter();
        CardsAdapter cardsAdapter = adapter instanceof CardsAdapter ? (CardsAdapter) adapter : null;
        if (cardsAdapter != null) {
            cardsAdapter.submitList(null);
        }
    }
}
