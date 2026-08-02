package ru.ozon.app.android.pdp.widgets.cartButtonV4.button;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonWithBadge;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/ViewGroup;", "Landroid/view/View;", "view", "", "addViewIfNeed", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTO", "bindBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButton;", "button", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButton;", "getButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButton;", "LSc/j;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badge", "LSc/j;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonWithBadge extends FrameLayout {

    @NotNull
    private final InterfaceC4008j<BadgeView> badge;

    @NotNull
    private final CartButton button;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartButtonWithBadge(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addViewIfNeed(ViewGroup viewGroup, View view) {
        if (viewGroup.indexOfChild(view) != -1) {
            return;
        }
        viewGroup.addView(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0181, code lost:
    
        if (r5 != (r3 != null ? r3.bottomMargin : 0)) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01e0, code lost:
    
        if (r5 != (r1 != null ? r1.bottomMargin : 0)) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
    
        if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindBadge(BadgeDTO badgeDTO) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (badgeDTO == null) {
            CartButton cartButton = this.button;
            ViewGroup.LayoutParams layoutParams = cartButton.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                int i11 = marginLayoutParams2.topMargin;
                int i12 = marginLayoutParams2.rightMargin;
                int i13 = marginLayoutParams2.bottomMargin;
                marginLayoutParams2.topMargin = 0;
                ViewGroup.LayoutParams layoutParams2 = cartButton.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i11 == (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = cartButton.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i12 == (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = cartButton.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
                cartButton.setLayoutParams(marginLayoutParams2);
            }
            ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            if (marginLayoutParams6 != null) {
                int i14 = marginLayoutParams6.leftMargin;
                int i15 = marginLayoutParams6.topMargin;
                int i16 = marginLayoutParams6.rightMargin;
                int i17 = marginLayoutParams6.bottomMargin;
                marginLayoutParams6.topMargin = Dimens.INSTANCE.getDP_8();
                if (i14 == marginLayoutParams6.leftMargin) {
                    ViewGroup.LayoutParams layoutParams6 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                    if (i15 == (marginLayoutParams7 != null ? marginLayoutParams7.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams7 = getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                        if (i16 == (marginLayoutParams8 != null ? marginLayoutParams8.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams8 = getLayoutParams();
                            marginLayoutParams = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                        }
                    }
                }
                setLayoutParams(marginLayoutParams6);
            }
            if (this.badge.isInitialized()) {
                removeView(this.badge.getValue());
                return;
            }
            return;
        }
        BadgeView value = this.badge.getValue();
        addViewIfNeed(this, value);
        BadgeHolderKt.bind$default(value, badgeDTO, (Function1) null, 2, (Object) null);
        ViewGroup.LayoutParams layoutParams9 = value.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
        if (marginLayoutParams9 != null) {
            int i18 = marginLayoutParams9.leftMargin;
            int i19 = marginLayoutParams9.topMargin;
            int i21 = marginLayoutParams9.rightMargin;
            int i22 = marginLayoutParams9.bottomMargin;
            marginLayoutParams9.topMargin = Dimens.INSTANCE.getDP_3();
            if (i18 == marginLayoutParams9.leftMargin) {
                ViewGroup.LayoutParams layoutParams10 = value.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
                if (i19 == (marginLayoutParams10 != null ? marginLayoutParams10.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams11 = value.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
                    if (i21 == (marginLayoutParams11 != null ? marginLayoutParams11.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams12 = value.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
                    }
                }
            }
            value.setLayoutParams(marginLayoutParams9);
        }
        CartButton cartButton2 = this.button;
        ViewGroup.LayoutParams layoutParams13 = cartButton2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams13 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams13 : null;
        if (marginLayoutParams13 != null) {
            int i23 = marginLayoutParams13.leftMargin;
            int i24 = marginLayoutParams13.topMargin;
            int i25 = marginLayoutParams13.rightMargin;
            int i26 = marginLayoutParams13.bottomMargin;
            marginLayoutParams13.topMargin = Dimens.INSTANCE.getDP_8();
            if (i23 == marginLayoutParams13.leftMargin) {
                ViewGroup.LayoutParams layoutParams14 = cartButton2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams14 = layoutParams14 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams14 : null;
                if (i24 == (marginLayoutParams14 != null ? marginLayoutParams14.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams15 = cartButton2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams15 = layoutParams15 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams15 : null;
                    if (i25 == (marginLayoutParams15 != null ? marginLayoutParams15.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams16 = cartButton2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams16 = layoutParams16 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams16 : null;
                    }
                }
            }
            cartButton2.setLayoutParams(marginLayoutParams13);
        }
        ViewGroup.LayoutParams layoutParams17 = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams17 = layoutParams17 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams17 : null;
        if (marginLayoutParams17 == null) {
            return;
        }
        int i27 = marginLayoutParams17.topMargin;
        int i28 = marginLayoutParams17.rightMargin;
        int i29 = marginLayoutParams17.bottomMargin;
        marginLayoutParams17.topMargin = 0;
        ViewGroup.LayoutParams layoutParams18 = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams18 = layoutParams18 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams18 : null;
        if (i27 == (marginLayoutParams18 != null ? marginLayoutParams18.topMargin : 0)) {
            ViewGroup.LayoutParams layoutParams19 = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams19 = layoutParams19 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams19 : null;
            if (i28 == (marginLayoutParams19 != null ? marginLayoutParams19.rightMargin : 0)) {
                ViewGroup.LayoutParams layoutParams20 = getLayoutParams();
                marginLayoutParams = layoutParams20 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams20 : null;
                if (i29 == (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) {
                    return;
                }
            }
        }
        setLayoutParams(marginLayoutParams17);
    }

    @NotNull
    public final CartButton getButton() {
        return this.button;
    }

    public /* synthetic */ CartButtonWithBadge(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartButtonWithBadge(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        CartButton cartButton = new CartButton(context, null, 0, 6, null);
        cartButton.setId(R$id.cartButtonWithBadge_Button);
        cartButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.button = cartButton;
        this.badge = DelegatesKt.lazyUnsafe(new CartButtonWithBadge$special$$inlined$lazyView$default$1(null, context));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(cartButton);
    }
}
