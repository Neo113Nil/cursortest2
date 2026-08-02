package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes11.dex */
public final class WidgetTotalCommonStickyBinding implements a {

    @NonNull
    public final ButtonAtom buttonBA;

    @NonNull
    public final TextAtomV2View infoTAV;

    @NonNull
    public final IslandSeparatorView islandSeparator;

    @NonNull
    public final BadgeView notificationBadge;

    @NonNull
    public final FrameLayout notificationBadgeContainer;

    @NonNull
    public final PriceAtomView priceAV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final View spaceForSeparator;

    @NonNull
    public final TextAtomV2View taxAmountView;

    @NonNull
    public final LinearLayout totalContainer;

    private WidgetTotalCommonStickyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonAtom buttonAtom, @NonNull TextAtomV2View textAtomV2View, @NonNull IslandSeparatorView islandSeparatorView, @NonNull BadgeView badgeView, @NonNull FrameLayout frameLayout, @NonNull PriceAtomView priceAtomView, @NonNull View view, @NonNull View view2, @NonNull TextAtomV2View textAtomV2View2, @NonNull LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.buttonBA = buttonAtom;
        this.infoTAV = textAtomV2View;
        this.islandSeparator = islandSeparatorView;
        this.notificationBadge = badgeView;
        this.notificationBadgeContainer = frameLayout;
        this.priceAV = priceAtomView;
        this.separator = view;
        this.spaceForSeparator = view2;
        this.taxAmountView = textAtomV2View2;
        this.totalContainer = linearLayout;
    }

    @NonNull
    public static WidgetTotalCommonStickyBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.buttonBA;
        ButtonAtom buttonAtom = (ButtonAtom) C2548q.d(i11, view);
        if (buttonAtom != null) {
            i11 = R$id.infoTAV;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.islandSeparator;
                IslandSeparatorView islandSeparatorView = (IslandSeparatorView) C2548q.d(i11, view);
                if (islandSeparatorView != null) {
                    i11 = R$id.notificationBadge;
                    BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                    if (badgeView != null) {
                        i11 = R$id.notificationBadgeContainer;
                        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                        if (frameLayout != null) {
                            i11 = R$id.priceAV;
                            PriceAtomView priceAtomView = (PriceAtomView) C2548q.d(i11, view);
                            if (priceAtomView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null && (d12 = C2548q.d((i11 = R$id.spaceForSeparator), view)) != null) {
                                i11 = R$id.taxAmountView;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View2 != null) {
                                    i11 = R$id.totalContainer;
                                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                                    if (linearLayout != null) {
                                        return new WidgetTotalCommonStickyBinding((ConstraintLayout) view, buttonAtom, textAtomV2View, islandSeparatorView, badgeView, frameLayout, priceAtomView, d11, d12, textAtomV2View2, linearLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetTotalCommonStickyBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_total_common_sticky, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
