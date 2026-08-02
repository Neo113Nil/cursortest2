package ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter;

import Ez.ViewOnClickListenerC2978b;
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
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.PremiumPointsTrainV2MultipleVO;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.ItemPremiumPointsV2TrainTailCarriageWrapper;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/TailCarriageV2ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/ItemPremiumPointsV2TrainTailCarriageWrapper;", "viewWrapper", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/ItemPremiumPointsV2TrainTailCarriageWrapper;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$TailCarriage;", "item", "bind", "(Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$TailCarriage;)V", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/ItemPremiumPointsV2TrainTailCarriageWrapper;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$TailCarriage;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TailCarriageV2ViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private PremiumPointsTrainV2MultipleVO.PremiumPointsItem.TailCarriage item;

    @NotNull
    private final ItemPremiumPointsV2TrainTailCarriageWrapper viewWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TailCarriageV2ViewHolder(@NotNull ItemPremiumPointsV2TrainTailCarriageWrapper viewWrapper, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(viewWrapper.getRoot());
        Intrinsics.checkNotNullParameter(viewWrapper, "viewWrapper");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.viewWrapper = viewWrapper;
        this.actionHandler = actionHandler;
        viewWrapper.getCarriageCv().setOnClickListener(new ViewOnClickListenerC2978b(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TailCarriageV2ViewHolder tailCarriageV2ViewHolder, View view) {
        AtomAction action;
        PremiumPointsTrainV2MultipleVO.PremiumPointsItem.TailCarriage tailCarriage = tailCarriageV2ViewHolder.item;
        if (tailCarriage == null || (action = tailCarriage.getAction()) == null) {
            return;
        }
        tailCarriageV2ViewHolder.actionHandler.invoke(action);
    }

    public final void bind(@NotNull PremiumPointsTrainV2MultipleVO.PremiumPointsItem.TailCarriage item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        ItemPremiumPointsV2TrainTailCarriageWrapper itemPremiumPointsV2TrainTailCarriageWrapper = this.viewWrapper;
        itemPremiumPointsV2TrainTailCarriageWrapper.getCarriageCv().setClickable(item.getAction() != null);
        ImageView statusIv = itemPremiumPointsV2TrainTailCarriageWrapper.getStatusIv();
        if (statusIv != null) {
            if (item.getStatusIcon() != null) {
                ViewExtKt.show(statusIv);
                ImageViewExtKt.load$default(statusIv, item.getStatusIcon(), null, null, null, null, false, null, 126, null);
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = itemPremiumPointsV2TrainTailCarriageWrapper.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ThemeExtKt.tint(statusIv, styleParser.parseColor(context, item.getStatusIconTint()));
            } else {
                ViewExtKt.gone(statusIv);
            }
        }
        itemPremiumPointsV2TrainTailCarriageWrapper.getTitleTv().setText(item.getTitle());
        TextView titleTv = itemPremiumPointsV2TrainTailCarriageWrapper.getTitleTv();
        StyleParser styleParser2 = StyleParser.INSTANCE;
        Context context2 = itemPremiumPointsV2TrainTailCarriageWrapper.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        titleTv.setTextColor(styleParser2.parseColor(context2, item.getTitleTintColor(), R$color.text_primary));
        Context context3 = itemPremiumPointsV2TrainTailCarriageWrapper.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int parseColor = styleParser2.parseColor(context3, item.getPointsTintColor(), R$color.text_primary);
        itemPremiumPointsV2TrainTailCarriageWrapper.getPointsTv().setText(item.getPoints());
        itemPremiumPointsV2TrainTailCarriageWrapper.getPointsTv().setTextColor(parseColor);
        if (item.getPointsIcon() == null) {
            ViewExtKt.gone(itemPremiumPointsV2TrainTailCarriageWrapper.getPointsIconIv());
            return;
        }
        ViewExtKt.show(itemPremiumPointsV2TrainTailCarriageWrapper.getPointsIconIv());
        ImageViewExtKt.load$default(itemPremiumPointsV2TrainTailCarriageWrapper.getPointsIconIv(), item.getPointsIcon(), null, null, null, null, false, null, 126, null);
        ThemeExtKt.tint(itemPremiumPointsV2TrainTailCarriageWrapper.getPointsIconIv(), Integer.valueOf(parseColor));
    }
}
