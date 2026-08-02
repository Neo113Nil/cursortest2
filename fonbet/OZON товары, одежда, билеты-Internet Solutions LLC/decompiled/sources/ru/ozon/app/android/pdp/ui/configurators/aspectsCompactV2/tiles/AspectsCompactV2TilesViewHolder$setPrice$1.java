package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.tiles;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2TilesLayoutBinding;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2TilesLayoutBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsCompactV2TilesViewHolder$setPrice$1 extends AbstractC7737t implements Function1<WidgetAspectsCompactV2TilesLayoutBinding, Unit> {
    final /* synthetic */ AspectsCompactTilesVariantV2VO $this_setPrice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsCompactV2TilesViewHolder$setPrice$1(AspectsCompactTilesVariantV2VO aspectsCompactTilesVariantV2VO) {
        super(1);
        this.$this_setPrice = aspectsCompactTilesVariantV2VO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsCompactV2TilesLayoutBinding widgetAspectsCompactV2TilesLayoutBinding) {
        invoke2(widgetAspectsCompactV2TilesLayoutBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetAspectsCompactV2TilesLayoutBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        if (this.$this_setPrice.getIsAvailable()) {
            TextView notAvailableTv = binding.notAvailableTv;
            Intrinsics.checkNotNullExpressionValue(notAvailableTv, "notAvailableTv");
            ViewExtKt.gone(notAvailableTv);
            PriceAtomView pricePa = binding.pricePa;
            Intrinsics.checkNotNullExpressionValue(pricePa, "pricePa");
            PriceAtomHolderKt.bindOrGone$default(pricePa, this.$this_setPrice.getPrice(), null, 2, null);
            return;
        }
        PriceAtomView pricePa2 = binding.pricePa;
        Intrinsics.checkNotNullExpressionValue(pricePa2, "pricePa");
        ViewExtKt.gone(pricePa2);
        TextView notAvailableTv2 = binding.notAvailableTv;
        Intrinsics.checkNotNullExpressionValue(notAvailableTv2, "notAvailableTv");
        ViewExtKt.show(notAvailableTv2);
    }
}
