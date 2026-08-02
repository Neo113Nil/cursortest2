package ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder;

import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/viewHolder/DefaultPaymentViewHolder;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/viewHolder/BasePaymentViewHolder;", "view", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/viewHolder/DefaultPaymentView;", "appType", "Lru/ozon/app/android/utils/AppType;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/payments/viewHolder/DefaultPaymentView;Lru/ozon/app/android/utils/AppType;Lkotlin/jvm/functions/Function1;)V", "cardBgIv", "Landroid/widget/ImageView;", "getCardBgIv", "()Landroid/widget/ImageView;", "iconIv", "getIconIv", "rightIconIv", "getRightIconIv", "titleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "badgeV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DefaultPaymentViewHolder extends BasePaymentViewHolder {

    @NotNull
    private final BadgeView badgeV;

    @NotNull
    private final ImageView cardBgIv;

    @NotNull
    private final ImageView iconIv;

    @NotNull
    private final ImageView rightIconIv;

    @NotNull
    private final TextAtomView titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentViewHolder(@NotNull DefaultPaymentView view, @NotNull AppType appType, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view, appType, onAction);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.cardBgIv = view.getCardBgIv();
        this.iconIv = view.getIconIv();
        this.rightIconIv = view.getRightIconIv();
        this.titleTav = view.getTitleTav();
        this.badgeV = view.getBadgeV();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.BasePaymentViewHolder
    @NotNull
    public BadgeView getBadgeV() {
        return this.badgeV;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.BasePaymentViewHolder
    @NotNull
    public ImageView getCardBgIv() {
        return this.cardBgIv;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.BasePaymentViewHolder
    @NotNull
    public ImageView getIconIv() {
        return this.iconIv;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.BasePaymentViewHolder
    @NotNull
    public ImageView getRightIconIv() {
        return this.rightIconIv;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.BasePaymentViewHolder
    @NotNull
    public TextAtomView getTitleTav() {
        return this.titleTav;
    }
}
