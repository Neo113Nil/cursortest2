package ru.ozon.app.android.pdp.widgets.cartButtonQuant.button;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantWithBadge;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTO", "", "bindBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuant;", "button$delegate", "LSc/j;", "getButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuant;", "button", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badge$delegate", "getBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badge", "Landroid/view/View;", "badgeCenterLine$delegate", "getBadgeCenterLine", "()Landroid/view/View;", "badgeCenterLine", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuantWithBadge extends ConstraintLayout {

    /* renamed from: badge$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badge;

    /* renamed from: badgeCenterLine$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeCenterLine;

    /* renamed from: button$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j button;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonQuantWithBadge$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<d, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            invoke2(dVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d updateConstraints) {
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, CartButtonQuantWithBadge.this.getBadge());
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, CartButtonQuantWithBadge.this.getBadge());
            ConstraintSetExtKt.layoutConstraintTopToTopOf(updateConstraints, CartButtonQuantWithBadge.this.getBadgeCenterLine(), CartButtonQuantWithBadge.this.getBadge());
            ConstraintSetExtKt.layoutConstraintBottomToBottomOf(updateConstraints, CartButtonQuantWithBadge.this.getBadgeCenterLine(), CartButtonQuantWithBadge.this.getBadge());
            ConstraintSetExtKt.layoutConstraintStartToStartOf(updateConstraints, CartButtonQuantWithBadge.this.getBadgeCenterLine(), CartButtonQuantWithBadge.this.getBadge());
            ConstraintSetExtKt.layoutConstraintEndToEndOf(updateConstraints, CartButtonQuantWithBadge.this.getBadgeCenterLine(), CartButtonQuantWithBadge.this.getBadge());
            ConstraintSetExtKt.layoutConstraintTopToTopOf(updateConstraints, CartButtonQuantWithBadge.this.getButton(), CartButtonQuantWithBadge.this.getBadgeCenterLine());
            ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, CartButtonQuantWithBadge.this.getButton());
            ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, CartButtonQuantWithBadge.this.getButton());
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, CartButtonQuantWithBadge.this.getButton());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartButtonQuantWithBadge(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getBadge() {
        return (BadgeView) this.badge.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBadgeCenterLine() {
        return (View) this.badgeCenterLine.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r5 != (r0 != null ? r0.bottomMargin : 0)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindBadge(BadgeDTO badgeDTO) {
        Dimens dimens = Dimens.INSTANCE;
        int dp_8 = badgeDTO == null ? dimens.getDP_8() : dimens.getDP_5();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.topMargin;
            int i12 = marginLayoutParams.rightMargin;
            int i13 = marginLayoutParams.bottomMargin;
            marginLayoutParams.topMargin = dp_8;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i11 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i12 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                }
            }
            setLayoutParams(marginLayoutParams);
        }
        BadgeHolderKt.bindOrGone$default(getBadge(), badgeDTO, (Function1) null, 2, (Object) null);
    }

    @NotNull
    public final CartButtonQuant getButton() {
        return (CartButtonQuant) this.button.getValue();
    }

    public /* synthetic */ CartButtonQuantWithBadge(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartButtonQuantWithBadge(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.button = DelegatesKt.lazyUnsafe(new CartButtonQuantWithBadge$special$$inlined$lazyView$default$1(null, context));
        this.badge = DelegatesKt.lazyUnsafe(new CartButtonQuantWithBadge$special$$inlined$lazyView$default$2(null, context));
        this.badgeCenterLine = DelegatesKt.lazyUnsafe(new CartButtonQuantWithBadge$special$$inlined$lazyView$default$3(null, context));
        addView(getButton());
        addView(getBadgeCenterLine());
        addView(getBadge());
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
        BadgeView badge = getBadge();
        ViewGroup.LayoutParams layoutParams = badge.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i12 = marginLayoutParams.leftMargin;
        int i13 = marginLayoutParams.topMargin;
        int i14 = marginLayoutParams.rightMargin;
        int i15 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginEnd(Dimens.INSTANCE.getDP_1());
        if (i12 == marginLayoutParams.leftMargin) {
            ViewGroup.LayoutParams layoutParams2 = badge.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i13 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = badge.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i14 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = badge.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i15 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        badge.setLayoutParams(marginLayoutParams);
    }
}
