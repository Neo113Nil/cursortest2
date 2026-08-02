package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.viewHolder;

import Lt.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.R$drawable;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.FreshPaymentInfoVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/payments/viewHolder/BaseFreshPaymentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/FreshPaymentInfoVO$Payment;", "item", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/FreshPaymentInfoVO$Payment;)V", "Landroid/view/View;", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/FreshPaymentInfoVO$Payment;", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners;", "roundedCornersTransformations", "Ljava/util/List;", "", "backgroundRes", "I", "cardBackgroundRes", "Landroid/widget/ImageView;", "getCardBgIv", "()Landroid/widget/ImageView;", "cardBgIv", "getIconIv", "iconIv", "getRightIconIv", "rightIconIv", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTav", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeV", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeV", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BaseFreshPaymentViewHolder extends RecyclerView.C {
    private final int backgroundRes;
    private final int cardBackgroundRes;
    private FreshPaymentInfoVO.Payment item;

    @NotNull
    private final List<ImageTransformation.RoundedCorners> roundedCornersTransformations;

    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFreshPaymentViewHolder(@NotNull View view, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
        this.roundedCornersTransformations = C7714v.a0(new ImageTransformation.RoundedCorners(ResourceExtKt.toPx(CornerRadius.RADIUS_400.getPx()), null, 2, null));
        this.backgroundRes = R$drawable.bg_payment_info_v2_payment_selector;
        this.cardBackgroundRes = R$drawable.bg_payment_info_v2_card;
        view.setOnClickListener(new c(4, this, onAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(BaseFreshPaymentViewHolder baseFreshPaymentViewHolder, Function1 function1, View view) {
        AtomAction action;
        FreshPaymentInfoVO.Payment payment = baseFreshPaymentViewHolder.item;
        if (payment == null || (action = payment.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    public final void bind(@NotNull FreshPaymentInfoVO.Payment item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.view.setBackgroundResource(this.backgroundRes);
        BadgeHolderKt.bindOrGone$default(getBadgeV(), item.getPromoteLabel(), (Function1) null, 2, (Object) null);
        this.view.setSelected(item.getIsSelected());
        if (item.getBackgroundColor() != null) {
            getCardBgIv().setBackgroundResource(this.cardBackgroundRes);
            Drawable background = getCardBgIv().getBackground();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            background.setTint(styleParser.parseColor(context, item.getBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_SECONDARY));
        } else {
            getCardBgIv().setBackground(null);
        }
        if (item.getBackground() != null) {
            getCardBgIv().setScaleType(ImageView.ScaleType.CENTER_CROP);
            ImageViewExtKt.load$default(getCardBgIv(), item.getBackground(), this.roundedCornersTransformations, null, null, null, false, null, 124, null);
        } else {
            getCardBgIv().setImageDrawable(null);
        }
        ImageViewExtKt.loadImageOrGone(getIconIv(), item.getIcon());
        ImageViewExtKt.loadImageOrGone(getRightIconIv(), item.getIconRight());
        TextAtomHolderKt.bindOrInvisible$default(getTitleTav(), item.getTitle(), null, 2, null);
        this.view.setContentDescription(item.getAutomatizationDescription());
    }

    @NotNull
    public abstract BadgeView getBadgeV();

    @NotNull
    public abstract ImageView getCardBgIv();

    @NotNull
    public abstract ImageView getIconIv();

    @NotNull
    public abstract ImageView getRightIconIv();

    @NotNull
    public abstract TextAtomView getTitleTav();
}
