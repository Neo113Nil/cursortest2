package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.airbnb.lottie.LottieAnimationView;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;
import ru.ozon.app.android.geo.map.presentation.selector.SwitchButtonsLayout;
import ru.ozon.app.android.storefront.navBar.views.MiniappHeaderView;
import ru.ozon.uni.android.atom.tabs.TabsView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetNouiAddressEditMapBinding implements a {

    @NonNull
    public final ImageView backBtn;

    @NonNull
    public final CoordinatorLayout bottomSheetCoordinatorContainer;

    @NonNull
    public final TabsView dsTabs;

    @NonNull
    public final LinearLayout filtersContainerFl;

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final LottieAnimationView mapAnimationView;

    @NonNull
    public final FrameLayout mapContainer;

    @NonNull
    public final ImageView markerIv;

    @NonNull
    public final MiniappHeaderView navBarHeader;

    @NonNull
    public final IslandSeparatorView navBarRoundedSeparator;

    @NonNull
    public final LinearLayout navbarContainer;

    @NonNull
    public final TextView navbarSubtitleTv;

    @NonNull
    public final TextView navbarTitleTv;

    @NonNull
    public final IconButtonV3View rightButton;

    @NonNull
    private final View rootView;

    @NonNull
    public final ConstraintLayout selectorContainer;

    @NonNull
    public final SwitchButtonsLayout selectorRV;

    @NonNull
    public final FrameLayout shortInfoFL;

    @NonNull
    public final WidgetSplitShortInfoBinding widgetSplitShortInfoInclude;

    private WidgetNouiAddressEditMapBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull TabsView tabsView, @NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull LottieAnimationView lottieAnimationView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView2, @NonNull MiniappHeaderView miniappHeaderView, @NonNull IslandSeparatorView islandSeparatorView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull IconButtonV3View iconButtonV3View, @NonNull ConstraintLayout constraintLayout, @NonNull SwitchButtonsLayout switchButtonsLayout, @NonNull FrameLayout frameLayout2, @NonNull WidgetSplitShortInfoBinding widgetSplitShortInfoBinding) {
        this.rootView = view;
        this.backBtn = imageView;
        this.bottomSheetCoordinatorContainer = coordinatorLayout;
        this.dsTabs = tabsView;
        this.filtersContainerFl = linearLayout;
        this.guideline = guideline;
        this.mapAnimationView = lottieAnimationView;
        this.mapContainer = frameLayout;
        this.markerIv = imageView2;
        this.navBarHeader = miniappHeaderView;
        this.navBarRoundedSeparator = islandSeparatorView;
        this.navbarContainer = linearLayout2;
        this.navbarSubtitleTv = textView;
        this.navbarTitleTv = textView2;
        this.rightButton = iconButtonV3View;
        this.selectorContainer = constraintLayout;
        this.selectorRV = switchButtonsLayout;
        this.shortInfoFL = frameLayout2;
        this.widgetSplitShortInfoInclude = widgetSplitShortInfoBinding;
    }

    @NonNull
    public static WidgetNouiAddressEditMapBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.backBtn;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.bottomSheetCoordinatorContainer;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C2548q.d(i11, view);
            if (coordinatorLayout != null) {
                i11 = R$id.dsTabs;
                TabsView tabsView = (TabsView) C2548q.d(i11, view);
                if (tabsView != null) {
                    i11 = R$id.filtersContainerFl;
                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout != null) {
                        i11 = R$id.guideline;
                        Guideline guideline = (Guideline) C2548q.d(i11, view);
                        if (guideline != null) {
                            i11 = R$id.mapAnimationView;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) C2548q.d(i11, view);
                            if (lottieAnimationView != null) {
                                i11 = R$id.mapContainer;
                                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                                if (frameLayout != null) {
                                    i11 = R$id.markerIv;
                                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                                    if (imageView2 != null) {
                                        i11 = R$id.navBarHeader;
                                        MiniappHeaderView miniappHeaderView = (MiniappHeaderView) C2548q.d(i11, view);
                                        if (miniappHeaderView != null) {
                                            i11 = R$id.navBarRoundedSeparator;
                                            IslandSeparatorView islandSeparatorView = (IslandSeparatorView) C2548q.d(i11, view);
                                            if (islandSeparatorView != null) {
                                                i11 = R$id.navbarContainer;
                                                LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
                                                if (linearLayout2 != null) {
                                                    i11 = R$id.navbarSubtitleTv;
                                                    TextView textView = (TextView) C2548q.d(i11, view);
                                                    if (textView != null) {
                                                        i11 = R$id.navbarTitleTv;
                                                        TextView textView2 = (TextView) C2548q.d(i11, view);
                                                        if (textView2 != null) {
                                                            i11 = R$id.rightButton;
                                                            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                                                            if (iconButtonV3View != null) {
                                                                i11 = R$id.selectorContainer;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                                                                if (constraintLayout != null) {
                                                                    i11 = R$id.selectorRV;
                                                                    SwitchButtonsLayout switchButtonsLayout = (SwitchButtonsLayout) C2548q.d(i11, view);
                                                                    if (switchButtonsLayout != null) {
                                                                        i11 = R$id.shortInfoFL;
                                                                        FrameLayout frameLayout2 = (FrameLayout) C2548q.d(i11, view);
                                                                        if (frameLayout2 != null && (d11 = C2548q.d((i11 = R$id.widgetSplitShortInfoInclude), view)) != null) {
                                                                            return new WidgetNouiAddressEditMapBinding(view, imageView, coordinatorLayout, tabsView, linearLayout, guideline, lottieAnimationView, frameLayout, imageView2, miniappHeaderView, islandSeparatorView, linearLayout2, textView, textView2, iconButtonV3View, constraintLayout, switchButtonsLayout, frameLayout2, WidgetSplitShortInfoBinding.bind(d11));
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetNouiAddressEditMapBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.widget_noui_address_edit_map, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
