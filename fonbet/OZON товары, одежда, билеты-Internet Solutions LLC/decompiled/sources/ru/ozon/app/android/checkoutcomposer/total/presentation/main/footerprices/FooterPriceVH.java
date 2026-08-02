package ru.ozon.app.android.checkoutcomposer.total.presentation.main.footerprices;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.databinding.WidgetTotalCommonFooterPriceBinding;
import ru.ozon.app.android.checkoutcomposer.total.models.TotalVO;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/presentation/main/footerprices/FooterPriceVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonFooterPriceBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonFooterPriceBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$FooterPrice;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary$FooterPrice;)V", "Lru/ozon/app/android/checkout/databinding/WidgetTotalCommonFooterPriceBinding;", "Lkotlin/jvm/functions/Function1;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FooterPriceVH extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTotalCommonFooterPriceBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FooterPriceVH(@NotNull WidgetTotalCommonFooterPriceBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.binding = binding;
        this.actionHandler = actionHandler;
    }

    public final void bind(@NotNull TotalVO.Summary.FooterPrice item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetTotalCommonFooterPriceBinding widgetTotalCommonFooterPriceBinding = this.binding;
        SingleAtom.bind$default(widgetTotalCommonFooterPriceBinding.titleTA, item.getTitle(), false, 2, null);
        TextAtomView subtitleTA = widgetTotalCommonFooterPriceBinding.subtitleTA;
        Intrinsics.checkNotNullExpressionValue(subtitleTA, "subtitleTA");
        TextAtomHolderKt.bindOrGone$default(subtitleTA, item.getSubtitle(), null, 2, null);
        SingleAtom.bind$default(widgetTotalCommonFooterPriceBinding.priceTA, item.getPrice(), false, 2, null);
        SmallBorderlessButtonView footerBtn = widgetTotalCommonFooterPriceBinding.footerBtn;
        Intrinsics.checkNotNullExpressionValue(footerBtn, "footerBtn");
        WrappedBorderlessButtonHolderKt.bindOrGone(footerBtn, item.getSmallBorderlessButton(), this.actionHandler);
    }
}
