package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksView;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetTotalStickyV2Binding implements a {

    @NonNull
    public final Space bottomSpacer;

    @NonNull
    public final View fadeEndOfPartnerBanksView;

    @NonNull
    public final IslandSeparatorView islandSeparatorV;

    @NonNull
    public final PartnerBanksView partnerBanksView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ShimmerFrameLayout shimmerView;

    @NonNull
    public final Space spaceToTotalStickyPrice;

    @NonNull
    public final Barrier summaryInfoBarrier;

    @NonNull
    public final View totalStickyBackground;

    @NonNull
    public final SmallButtonView totalStickyButton;

    @NonNull
    public final BadgeView totalStickyInfoBadge;

    @NonNull
    public final TextAtomView totalStickyInfoText;

    @NonNull
    public final ButtonV3View totalStickyNewButton;

    @NonNull
    public final PriceView totalStickyPrice;

    @NonNull
    public final PriceView totalStickySecondPrice;

    @NonNull
    public final Barrier totalStickyTextsBarrier;

    private WidgetTotalStickyV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull Space space, @NonNull View view, @NonNull IslandSeparatorView islandSeparatorView, @NonNull PartnerBanksView partnerBanksView, @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull Space space2, @NonNull Barrier barrier, @NonNull View view2, @NonNull SmallButtonView smallButtonView, @NonNull BadgeView badgeView, @NonNull TextAtomView textAtomView, @NonNull ButtonV3View buttonV3View, @NonNull PriceView priceView, @NonNull PriceView priceView2, @NonNull Barrier barrier2) {
        this.rootView = constraintLayout;
        this.bottomSpacer = space;
        this.fadeEndOfPartnerBanksView = view;
        this.islandSeparatorV = islandSeparatorView;
        this.partnerBanksView = partnerBanksView;
        this.shimmerView = shimmerFrameLayout;
        this.spaceToTotalStickyPrice = space2;
        this.summaryInfoBarrier = barrier;
        this.totalStickyBackground = view2;
        this.totalStickyButton = smallButtonView;
        this.totalStickyInfoBadge = badgeView;
        this.totalStickyInfoText = textAtomView;
        this.totalStickyNewButton = buttonV3View;
        this.totalStickyPrice = priceView;
        this.totalStickySecondPrice = priceView2;
        this.totalStickyTextsBarrier = barrier2;
    }

    @NonNull
    public static WidgetTotalStickyV2Binding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.bottomSpacer;
        Space space = (Space) C2548q.d(i11, view);
        if (space != null && (d11 = C2548q.d((i11 = R$id.fadeEndOfPartnerBanksView), view)) != null) {
            i11 = R$id.islandSeparatorV;
            IslandSeparatorView islandSeparatorView = (IslandSeparatorView) C2548q.d(i11, view);
            if (islandSeparatorView != null) {
                i11 = R$id.partnerBanksView;
                PartnerBanksView partnerBanksView = (PartnerBanksView) C2548q.d(i11, view);
                if (partnerBanksView != null) {
                    i11 = R$id.shimmerView;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C2548q.d(i11, view);
                    if (shimmerFrameLayout != null) {
                        i11 = R$id.spaceToTotalStickyPrice;
                        Space space2 = (Space) C2548q.d(i11, view);
                        if (space2 != null) {
                            i11 = R$id.summaryInfoBarrier;
                            Barrier barrier = (Barrier) C2548q.d(i11, view);
                            if (barrier != null && (d12 = C2548q.d((i11 = R$id.totalStickyBackground), view)) != null) {
                                i11 = R$id.totalStickyButton;
                                SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
                                if (smallButtonView != null) {
                                    i11 = R$id.totalStickyInfoBadge;
                                    BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                                    if (badgeView != null) {
                                        i11 = R$id.totalStickyInfoText;
                                        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView != null) {
                                            i11 = R$id.totalStickyNewButton;
                                            ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                                            if (buttonV3View != null) {
                                                i11 = R$id.totalStickyPrice;
                                                PriceView priceView = (PriceView) C2548q.d(i11, view);
                                                if (priceView != null) {
                                                    i11 = R$id.totalStickySecondPrice;
                                                    PriceView priceView2 = (PriceView) C2548q.d(i11, view);
                                                    if (priceView2 != null) {
                                                        i11 = R$id.totalStickyTextsBarrier;
                                                        Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                                                        if (barrier2 != null) {
                                                            return new WidgetTotalStickyV2Binding((ConstraintLayout) view, space, d11, islandSeparatorView, partnerBanksView, shimmerFrameLayout, space2, barrier, d12, smallButtonView, badgeView, textAtomView, buttonV3View, priceView, priceView2, barrier2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
