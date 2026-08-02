package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetComparisonCarouselItemBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ComparisonCarouselProductViewHolder$bindNotifyButton$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ FavoriteProductMolecule $favoriteButton;
    final /* synthetic */ PdpWidgetComparisonCarouselItemBinding $this_bindNotifyButton;
    final /* synthetic */ ComparisonCarouselProductViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComparisonCarouselProductViewHolder$bindNotifyButton$1$1(FavoriteProductMolecule favoriteProductMolecule, PdpWidgetComparisonCarouselItemBinding pdpWidgetComparisonCarouselItemBinding, ComparisonCarouselProductViewHolder comparisonCarouselProductViewHolder) {
        super(1);
        this.$favoriteButton = favoriteProductMolecule;
        this.$this_bindNotifyButton = pdpWidgetComparisonCarouselItemBinding;
        this.this$0 = comparisonCarouselProductViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.d(action.getId(), "subscribeToStock") && !this.$favoriteButton.isFavorite()) {
            this.$this_bindNotifyButton.favouriteButtonPFMBV.revertAndRebindViewState();
        }
        function1 = this.this$0.onAtomAction;
        function1.invoke(action);
    }
}
