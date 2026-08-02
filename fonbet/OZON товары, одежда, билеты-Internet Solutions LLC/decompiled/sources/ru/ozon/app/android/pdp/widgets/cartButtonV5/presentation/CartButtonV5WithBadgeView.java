package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJc\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072(\u0010\u0016\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u001eJ\r\u0010!\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u001eR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5WithBadgeView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5View;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "configuration", "", "isFirst", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;Z)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "item", "withAnimationSubtitle", "withAnimationTitle", "isAsyncSubtitle", "keepSubtitleIfShown", "Lkotlin/Function2;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "onTrackTooltip", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;ZLjava/lang/Boolean;ZZLkotlin/jvm/functions/Function2;)V", "Lkotlin/Function0;", "onClick", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "hideLoader", "()V", "hideSubtitleUpdateAnimation", "showTooltip", "releaseClickListener", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonView;", "cartButton", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonView;", "getCartButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ButtonView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class CartButtonV5WithBadgeView extends FrameLayout implements CartButtonV5View {

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final CartButtonV5ButtonView cartButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartButtonV5WithBadgeView(@NotNull Context context, @NotNull CartButtonV5Configuration configuration, boolean z11) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        CartButtonV5ButtonView cartButtonV5ButtonView = new CartButtonV5ButtonView(context, configuration, z11);
        Dimens dimens = Dimens.INSTANCE;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, dimens.getDP_56());
        layoutParams.gravity = 80;
        cartButtonV5ButtonView.setLayoutParams(layoutParams);
        this.cartButton = cartButtonV5ButtonView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(R$id.cartBtnV5Badge);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388613;
        layoutParams2.rightMargin = dimens.getDP_2();
        badgeView.setLayoutParams(layoutParams2);
        this.badgeView = badgeView;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, dimens.getDP_60());
        layoutParams3.topMargin = dimens.getDP_4();
        layoutParams3.gravity = 80;
        layoutParams3.weight = 1.0f;
        setLayoutParams(layoutParams3);
        addView(cartButtonV5ButtonView);
        addView(badgeView);
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5View
    public void bind(@NotNull CartButtonV5VO.CartButton item, boolean withAnimationSubtitle, Boolean withAnimationTitle, boolean isAsyncSubtitle, boolean keepSubtitleIfShown, Function2<? super Map<String, TokenizedTrackingInfo>, ? super Boolean, Unit> onTrackTooltip) {
        CartButtonV5DTO.CartButton.Button toCart;
        BadgeDTO badgeDTO;
        Intrinsics.checkNotNullParameter(item, "item");
        this.cartButton.bind(item, withAnimationSubtitle, withAnimationTitle, isAsyncSubtitle, keepSubtitleIfShown, onTrackTooltip);
        if (item.getIsInCart()) {
            toCart = item.getInCart();
            if (toCart == null) {
                badgeDTO = null;
                BadgeHolderKt.bindOrGone$default(this.badgeView, badgeDTO, (Function1) null, 2, (Object) null);
            }
        } else {
            toCart = item.getToCart();
        }
        badgeDTO = toCart.getBadge();
        BadgeHolderKt.bindOrGone$default(this.badgeView, badgeDTO, (Function1) null, 2, (Object) null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5View
    public void hideLoader() {
        this.cartButton.hideLoader();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5View
    public void hideSubtitleUpdateAnimation() {
        this.cartButton.hideSubtitleUpdateAnimation();
    }

    public final void releaseClickListener() {
        this.cartButton.releaseClickListener();
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5View
    public void setOnClick(@NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.cartButton.setOnClick(onClick);
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5View
    public void showTooltip() {
        this.cartButton.showTooltip();
    }
}
