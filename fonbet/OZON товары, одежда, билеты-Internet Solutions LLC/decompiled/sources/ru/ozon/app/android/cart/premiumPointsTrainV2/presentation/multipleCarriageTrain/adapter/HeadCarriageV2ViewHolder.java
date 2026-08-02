package ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter;

import Nt.a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.PremiumPointsTrainV2MultipleVO;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.HeadCarriageV2View;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/HeadCarriageV2ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/HeadCarriageV2View;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/HeadCarriageV2View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$HeadCarriage;", "item", "bind", "(Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$HeadCarriage;)V", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/HeadCarriageV2View;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$HeadCarriage;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HeadCarriageV2ViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private PremiumPointsTrainV2MultipleVO.PremiumPointsItem.HeadCarriage item;

    @NotNull
    private final HeadCarriageV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeadCarriageV2ViewHolder(@NotNull HeadCarriageV2View view, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view = view;
        this.actionHandler = actionHandler;
        view.setOnClickListener(new a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(HeadCarriageV2ViewHolder headCarriageV2ViewHolder, View view) {
        AtomAction action;
        PremiumPointsTrainV2MultipleVO.PremiumPointsItem.HeadCarriage headCarriage = headCarriageV2ViewHolder.item;
        if (headCarriage == null || (action = headCarriage.getAction()) == null) {
            return;
        }
        headCarriageV2ViewHolder.actionHandler.invoke(action);
    }

    public final void bind(@NotNull PremiumPointsTrainV2MultipleVO.PremiumPointsItem.HeadCarriage item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        HeadCarriageV2View headCarriageV2View = this.view;
        headCarriageV2View.setClickable(item.getAction() != null);
        TextAtomHolderKt.bind$default(headCarriageV2View.getTitleTv(), item.getTitle(), null, 2, null);
        if (item.getIcon() == null) {
            ViewExtKt.gone(headCarriageV2View.getIconIv());
            return;
        }
        ViewExtKt.show(headCarriageV2View.getIconIv());
        ImageViewExtKt.load$default(headCarriageV2View.getIconIv(), item.getIcon(), null, null, null, null, false, null, 126, null);
        ImageView iconIv = headCarriageV2View.getIconIv();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = headCarriageV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(iconIv, styleParser.parseColor(context, item.getIconTint()));
    }
}
