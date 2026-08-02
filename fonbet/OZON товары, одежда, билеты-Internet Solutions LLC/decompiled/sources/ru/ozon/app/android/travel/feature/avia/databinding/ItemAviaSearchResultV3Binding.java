package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.view.RouteGroupLayout;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.app.android.uikit.view.skeleton.SkeletonPlaceholderView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes8.dex */
public final class ItemAviaSearchResultV3Binding implements a {

    @NonNull
    public final SkeletonPlaceholderView aviaSearchDiscountSkeletonSpv;

    @NonNull
    public final TextAtomView aviaSearchDiscountTav;

    @NonNull
    public final RecyclerView aviaSearchLuggageRv;

    @NonNull
    public final BadgeView aviaSearchPremiumBadgeBv;

    @NonNull
    public final SkeletonPlaceholderView aviaSearchPremiumBadgeSkeletonSpv;

    @NonNull
    public final PriceView aviaSearchPricePv;

    @NonNull
    public final SkeletonPlaceholderView aviaSearchPriceSkeletonSpv;

    @NonNull
    public final TextAtomView aviaSearchRemainingTicketsTv;

    @NonNull
    public final HorizontalAtomsLayout aviaSearchResultBadgesHal;

    @NonNull
    public final RouteGroupLayout aviaSearchRouteGl;

    @NonNull
    public final SmallButtonView aviaSearchSmallButtonSbv;

    @NonNull
    public final SkeletonPlaceholderView aviaSearchSmallButtonSkeletonSpv;

    @NonNull
    private final ConstraintLayoutWithBorder rootView;

    private ItemAviaSearchResultV3Binding(@NonNull ConstraintLayoutWithBorder constraintLayoutWithBorder, @NonNull SkeletonPlaceholderView skeletonPlaceholderView, @NonNull TextAtomView textAtomView, @NonNull RecyclerView recyclerView, @NonNull BadgeView badgeView, @NonNull SkeletonPlaceholderView skeletonPlaceholderView2, @NonNull PriceView priceView, @NonNull SkeletonPlaceholderView skeletonPlaceholderView3, @NonNull TextAtomView textAtomView2, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull RouteGroupLayout routeGroupLayout, @NonNull SmallButtonView smallButtonView, @NonNull SkeletonPlaceholderView skeletonPlaceholderView4) {
        this.rootView = constraintLayoutWithBorder;
        this.aviaSearchDiscountSkeletonSpv = skeletonPlaceholderView;
        this.aviaSearchDiscountTav = textAtomView;
        this.aviaSearchLuggageRv = recyclerView;
        this.aviaSearchPremiumBadgeBv = badgeView;
        this.aviaSearchPremiumBadgeSkeletonSpv = skeletonPlaceholderView2;
        this.aviaSearchPricePv = priceView;
        this.aviaSearchPriceSkeletonSpv = skeletonPlaceholderView3;
        this.aviaSearchRemainingTicketsTv = textAtomView2;
        this.aviaSearchResultBadgesHal = horizontalAtomsLayout;
        this.aviaSearchRouteGl = routeGroupLayout;
        this.aviaSearchSmallButtonSbv = smallButtonView;
        this.aviaSearchSmallButtonSkeletonSpv = skeletonPlaceholderView4;
    }

    @NonNull
    public static ItemAviaSearchResultV3Binding bind(@NonNull View view) {
        int i11 = R$id.aviaSearchDiscountSkeletonSpv;
        SkeletonPlaceholderView skeletonPlaceholderView = (SkeletonPlaceholderView) C2548q.d(i11, view);
        if (skeletonPlaceholderView != null) {
            i11 = R$id.aviaSearchDiscountTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.aviaSearchLuggageRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.aviaSearchPremiumBadgeBv;
                    BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                    if (badgeView != null) {
                        i11 = R$id.aviaSearchPremiumBadgeSkeletonSpv;
                        SkeletonPlaceholderView skeletonPlaceholderView2 = (SkeletonPlaceholderView) C2548q.d(i11, view);
                        if (skeletonPlaceholderView2 != null) {
                            i11 = R$id.aviaSearchPricePv;
                            PriceView priceView = (PriceView) C2548q.d(i11, view);
                            if (priceView != null) {
                                i11 = R$id.aviaSearchPriceSkeletonSpv;
                                SkeletonPlaceholderView skeletonPlaceholderView3 = (SkeletonPlaceholderView) C2548q.d(i11, view);
                                if (skeletonPlaceholderView3 != null) {
                                    i11 = R$id.aviaSearchRemainingTicketsTv;
                                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView2 != null) {
                                        i11 = R$id.aviaSearchResultBadgesHal;
                                        HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
                                        if (horizontalAtomsLayout != null) {
                                            i11 = R$id.aviaSearchRouteGl;
                                            RouteGroupLayout routeGroupLayout = (RouteGroupLayout) C2548q.d(i11, view);
                                            if (routeGroupLayout != null) {
                                                i11 = R$id.aviaSearchSmallButtonSbv;
                                                SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
                                                if (smallButtonView != null) {
                                                    i11 = R$id.aviaSearchSmallButtonSkeletonSpv;
                                                    SkeletonPlaceholderView skeletonPlaceholderView4 = (SkeletonPlaceholderView) C2548q.d(i11, view);
                                                    if (skeletonPlaceholderView4 != null) {
                                                        return new ItemAviaSearchResultV3Binding((ConstraintLayoutWithBorder) view, skeletonPlaceholderView, textAtomView, recyclerView, badgeView, skeletonPlaceholderView2, priceView, skeletonPlaceholderView3, textAtomView2, horizontalAtomsLayout, routeGroupLayout, smallButtonView, skeletonPlaceholderView4);
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

    @NonNull
    public static ItemAviaSearchResultV3Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_avia_search_result_v3, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayoutWithBorder getRoot() {
        return this.rootView;
    }
}
