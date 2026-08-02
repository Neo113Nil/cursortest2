package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.price;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/price/PriceBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "infoBadge", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindInfoBadge", "(Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection$PriceBlock;", "item", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/CheckoutTotalVO$Summary$PriceSection$PriceBlock;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView$delegate", "LSc/j;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView$delegate", "getIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView$delegate", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "subtitleView$delegate", "getSubtitleView", "subtitleView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView$delegate", "getPriceView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PriceBlockView extends ConstraintLayout {

    /* renamed from: badgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeView;

    /* renamed from: iconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconView;

    /* renamed from: priceView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j priceView;

    /* renamed from: subtitleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j subtitleView;

    /* renamed from: titleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/price/PriceBlockView$Companion;", "", "<init>", "()V", "HORIZONTAL_BIAS", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ PriceBlockView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindInfoBadge(AtomDTO infoBadge, Function1<? super AtomAction, Unit> actionHandler) {
        if (infoBadge instanceof BadgeDTO) {
            ViewExtKt.gone(getIconView());
            BadgeHolderKt.bindOrGone(getBadgeView(), (BadgeDTO) infoBadge, actionHandler);
        } else if (infoBadge instanceof IconDTO) {
            ViewExtKt.gone(getBadgeView());
            IconHolderKt.bindOrGone(getIconView(), (IconDTO) infoBadge, actionHandler);
        } else {
            ViewExtKt.gone(getIconView());
            ViewExtKt.gone(getBadgeView());
        }
    }

    private final BadgeView getBadgeView() {
        return (BadgeView) this.badgeView.getValue();
    }

    private final IconView getIconView() {
        return (IconView) this.iconView.getValue();
    }

    private final PriceAtomView getPriceView() {
        return (PriceAtomView) this.priceView.getValue();
    }

    private final TextAtomV2View getSubtitleView() {
        return (TextAtomV2View) this.subtitleView.getValue();
    }

    private final TextAtomV2View getTitleView() {
        return (TextAtomV2View) this.titleView.getValue();
    }

    public final void bind(@NotNull CheckoutTotalVO.Summary.PriceSection.PriceBlock item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bindOrGone(getTitleView(), item.getTitle(), actionHandler);
        TextHolderKt.bindOrGone(getSubtitleView(), item.getSubtitle(), actionHandler);
        PriceAtomHolderKt.bindOrGone(getPriceView(), item.getPrice(), actionHandler);
        bindInfoBadge(item.getInfoBadge(), actionHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceBlockView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.titleView = LazyUtilsKt.unsafeLazy(new PriceBlockView$titleView$2(context, this));
        this.iconView = LazyUtilsKt.unsafeLazy(new PriceBlockView$iconView$2(context, this));
        this.badgeView = LazyUtilsKt.unsafeLazy(new PriceBlockView$badgeView$2(context, this));
        this.subtitleView = LazyUtilsKt.unsafeLazy(new PriceBlockView$subtitleView$2(context, this));
        this.priceView = LazyUtilsKt.unsafeLazy(new PriceBlockView$priceView$2(context, this));
    }
}
