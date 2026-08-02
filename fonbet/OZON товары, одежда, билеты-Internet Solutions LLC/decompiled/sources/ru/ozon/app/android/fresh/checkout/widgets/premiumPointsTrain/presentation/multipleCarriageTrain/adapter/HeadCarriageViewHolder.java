package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter;

import Ar.b;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.FreshPremiumPointsTrainMultipleVO;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.adapter.maualviews.HeadCarriageView;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/HeadCarriageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/HeadCarriageView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/HeadCarriageView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$HeadCarriage;", "item", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$HeadCarriage;)V", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/adapter/maualviews/HeadCarriageView;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleVO$PremiumPointsItem$HeadCarriage;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HeadCarriageViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.HeadCarriage item;

    @NotNull
    private final HeadCarriageView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeadCarriageViewHolder(@NotNull HeadCarriageView view, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view = view;
        this.actionHandler = actionHandler;
        view.setOnClickListener(new b(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(HeadCarriageViewHolder headCarriageViewHolder, View view) {
        AtomAction action;
        FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.HeadCarriage headCarriage = headCarriageViewHolder.item;
        if (headCarriage == null || (action = headCarriage.getAction()) == null) {
            return;
        }
        headCarriageViewHolder.actionHandler.invoke(action);
    }

    public final void bind(@NotNull FreshPremiumPointsTrainMultipleVO.PremiumPointsItem.HeadCarriage item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        HeadCarriageView headCarriageView = this.view;
        headCarriageView.setClickable(item.getAction() != null);
        TextHolderKt.bind$default(headCarriageView.getTitleTv(), item.getTitle(), null, 2, null);
        if (item.getIcon() == null) {
            ViewExtKt.gone(headCarriageView.getIconIv());
            return;
        }
        ViewExtKt.show(headCarriageView.getIconIv());
        ImageViewExtKt.load$default(headCarriageView.getIconIv(), item.getIcon(), null, null, null, null, false, null, 126, null);
        ImageView iconIv = headCarriageView.getIconIv();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = headCarriageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(iconIv, styleParser.parseColor(context, item.getIconTint()));
    }
}
