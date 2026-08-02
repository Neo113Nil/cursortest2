package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter;

import Ar.c;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.FreshPremiumPointsTrainMultipleVO;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews.ItemFreshPremiumPointsTrainTailCarriageWrapper;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/TailCarriageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/ItemFreshPremiumPointsTrainTailCarriageWrapper;", "viewWrapper", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/ItemFreshPremiumPointsTrainTailCarriageWrapper;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$TailCarriage;", "item", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$TailCarriage;)V", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/ItemFreshPremiumPointsTrainTailCarriageWrapper;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$TailCarriage;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TailCarriageViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.TailCarriage item;

    @NotNull
    private final ItemFreshPremiumPointsTrainTailCarriageWrapper viewWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TailCarriageViewHolder(@NotNull ItemFreshPremiumPointsTrainTailCarriageWrapper viewWrapper, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(viewWrapper.getRoot());
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.viewWrapper = viewWrapper;
        this.actionHandler = actionHandler;
        viewWrapper.getCarriageCv().setOnClickListener(new c(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TailCarriageViewHolder tailCarriageViewHolder, View view) {
        AtomAction action;
        FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.TailCarriage tailCarriage = tailCarriageViewHolder.item;
        if (tailCarriage == null || (action = tailCarriage.getAction()) == null) {
            return;
        }
        tailCarriageViewHolder.actionHandler.invoke(action);
    }

    public final void bind(@NotNull FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.TailCarriage item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        ItemFreshPremiumPointsTrainTailCarriageWrapper itemFreshPremiumPointsTrainTailCarriageWrapper = this.viewWrapper;
        itemFreshPremiumPointsTrainTailCarriageWrapper.getCarriageCv().setClickable(item.getAction() != null);
        ImageView statusIv = itemFreshPremiumPointsTrainTailCarriageWrapper.getStatusIv();
        if (statusIv != null) {
            if (item.getStatusIcon() != null) {
                ViewExtKt.show(statusIv);
                ImageViewExtKt.load$default(statusIv, item.getStatusIcon(), null, null, null, null, false, null, 126, null);
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = itemFreshPremiumPointsTrainTailCarriageWrapper.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ThemeExtKt.tint(statusIv, styleParser.parseColor(context, item.getStatusIconTint()));
            } else {
                ViewExtKt.gone(statusIv);
            }
        }
        itemFreshPremiumPointsTrainTailCarriageWrapper.getTitleTv().setText(item.getTitle());
        TextView titleTv = itemFreshPremiumPointsTrainTailCarriageWrapper.getTitleTv();
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context2 = itemFreshPremiumPointsTrainTailCarriageWrapper.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String titleTintColor = item.getTitleTintColor();
        StyleParser.OzColor ozColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY;
        titleTv.setTextColor(styleParser2.parseColor(context2, titleTintColor, ozColor));
        Context context3 = itemFreshPremiumPointsTrainTailCarriageWrapper.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int parseColor = styleParser2.parseColor(context3, item.getPointsTintColor(), ozColor);
        itemFreshPremiumPointsTrainTailCarriageWrapper.getPointsTv().setText(item.getPoints());
        itemFreshPremiumPointsTrainTailCarriageWrapper.getPointsTv().setTextColor(parseColor);
        if (item.getPointsIcon() == null) {
            ViewExtKt.gone(itemFreshPremiumPointsTrainTailCarriageWrapper.getPointsIconIv());
            return;
        }
        ViewExtKt.show(itemFreshPremiumPointsTrainTailCarriageWrapper.getPointsIconIv());
        ImageViewExtKt.load$default(itemFreshPremiumPointsTrainTailCarriageWrapper.getPointsIconIv(), item.getPointsIcon(), null, null, null, null, false, null, 126, null);
        ThemeExtKt.tint(itemFreshPremiumPointsTrainTailCarriageWrapper.getPointsIconIv(), Integer.valueOf(parseColor));
    }
}
