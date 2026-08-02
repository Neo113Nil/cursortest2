package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import CG.b;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.search.databinding.FragmentSearchSuggestionsBinding;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.StaticNavBarModel;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.search.widgets.utils.SelectUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 G2\u00020\u0001:\u0001GB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u000fJ\u001b\u0010\u001f\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\u000fJ\u001b\u0010#\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b#\u0010 J\u001b\u0010$\u001a\u00020\r2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b$\u0010 J\u0015\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\r¢\u0006\u0004\b)\u0010\u000fJ\r\u0010*\u001a\u00020\r¢\u0006\u0004\b*\u0010\u000fJ\r\u0010+\u001a\u00020\r¢\u0006\u0004\b+\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0014\u00106\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00107\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102R\u0014\u00108\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00102R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00102R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010.R\u0014\u0010F\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/NavBarViewDelegate;", "", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/search/databinding/FragmentSearchSuggestionsBinding;", "binding", "", "isRedesigned", "Lkotlin/Function0;", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "modelProvider", "<init>", "(Landroidx/fragment/app/m;Lru/ozon/app/android/search/databinding/FragmentSearchSuggestionsBinding;ZLkotlin/jvm/functions/Function0;)V", "", "setupNavBar", "()V", "bindBackButton", "goToInitialNavBarState", "setNavBarColors", "isBgColorDark", "setStatusBarFlags", "(Z)V", "setupInitialActionImages", "isVisible", "showOrGoneActions", "setSearchBarGoneStartMargin", "setConstraintsAndMarginsForBackButtonState", "isActiveSearch", "setConstraintsAndMarginsForState", "animateForward", "callback", "animateReverse", "(Lkotlin/jvm/functions/Function0;)V", "stopAnimations", "onClick", "setCancelButtonClickListener", "setBackButtonClickListener", "", "searchHint", "setSearchHint", "(Ljava/lang/String;)V", "goToFinalNavBarState", "bindRoundCorners", "bindColorCancelButton", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/search/databinding/FragmentSearchSuggestionsBinding;", "Z", "Lkotlin/jvm/functions/Function0;", "", "dp0", "I", "dp8", "dp12", "dp16", "startMarginForBX", "startMarginForSelect", "endSearchMargin", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/NavBarColors;", "colors", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/NavBarColors;", "tintColor", "Landroid/graphics/PorterDuffColorFilter;", "backButtonColorFilter$delegate", "LSc/j;", "getBackButtonColorFilter", "()Landroid/graphics/PorterDuffColorFilter;", "backButtonColorFilter", "showBackButton", "getModel", "()Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticNavBarModel;", "model", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavBarViewDelegate {

    /* renamed from: backButtonColorFilter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backButtonColorFilter;

    @NotNull
    private final FragmentSearchSuggestionsBinding binding;

    @NotNull
    private final NavBarColors colors;
    private final int dp0;
    private final int dp12;
    private final int dp16;
    private final int dp8;
    private final int endSearchMargin;

    @NotNull
    private final ComponentCallbacksC5392m fragment;
    private final boolean isRedesigned;

    @NotNull
    private final Function0<StaticNavBarModel> modelProvider;
    private final boolean showBackButton;
    private final int startMarginForBX;
    private final int startMarginForSelect;
    private final int tintColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/NavBarViewDelegate$Companion;", "", "<init>", "()V", "FORWARD_FADE_ANIMATION_DURATION", "", "FORWARD_CHANGE_BOUNDS_ANIMATION_DURATION", "REVERSE_FADE_ANIMATION_DURATION", "REVERSE_CHANGE_BOUNDS_ANIMATION_DURATION", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NavBarViewDelegate(@NotNull ComponentCallbacksC5392m fragment, @NotNull FragmentSearchSuggestionsBinding binding, boolean z11, @NotNull Function0<StaticNavBarModel> modelProvider) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(modelProvider, "modelProvider");
        this.fragment = fragment;
        this.binding = binding;
        this.isRedesigned = z11;
        this.modelProvider = modelProvider;
        int px = ResourceExtKt.toPx(8);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(12);
        this.dp12 = px2;
        int px3 = ResourceExtKt.toPx(16);
        this.dp16 = px3;
        this.startMarginForBX = z11 ? px : px2;
        this.startMarginForSelect = z11 ? px : px3;
        this.endSearchMargin = z11 ? px : px2;
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.colors = new NavBarColors(context);
        this.tintColor = binding.getConstraintLayout().getContext().getColor(UniColors.GRAPHIC_TERTIARY.getResId());
        this.backButtonColorFilter = k.b(new NavBarViewDelegate$backButtonColorFilter$2(this));
        this.showBackButton = getModel().getNavBarInfo().getShowBackButton();
        setupNavBar();
    }

    private final void bindBackButton() {
        if (this.showBackButton) {
            ImageButton imageButton = this.binding.backButton;
            Intrinsics.f(imageButton);
            ImageViewExtKt.clearResource(imageButton);
            imageButton.setImageResource(R$drawable.ic_m_disclosure_back_filled);
            imageButton.setColorFilter(getBackButtonColorFilter());
        }
    }

    private final PorterDuffColorFilter getBackButtonColorFilter() {
        return (PorterDuffColorFilter) this.backButtonColorFilter.getValue();
    }

    private final StaticNavBarModel getModel() {
        return this.modelProvider.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToInitialNavBarState() {
        showOrGoneActions(true);
        setSearchBarGoneStartMargin();
        if (this.showBackButton) {
            setConstraintsAndMarginsForBackButtonState();
        } else {
            setConstraintsAndMarginsForState(false);
        }
        StaticSearchBarView staticSearchBarView = this.binding.searchBarView;
        if (this.isRedesigned) {
            staticSearchBarView.applyRedesign();
        }
        staticSearchBarView.getClearSearchView().setVisibility(8);
        staticSearchBarView.showOrGoneScanItIcon(getModel().getShowScanItIcon());
        staticSearchBarView.showOrGonePhotoSearchIcon(getModel().getShowPhotoSearchIcon());
        staticSearchBarView.showOrGoneSearchCompoundDraw(getModel().getShowSearchCompoundDrawable());
        StaticNavBarModel.SearchButton searchButton = getModel().getSearchButton();
        staticSearchBarView.showOrGonePdpSearchIcon(searchButton != null ? new SearchBarVO.SearchButton(searchButton.getIcon(), null, searchButton.getTestInfo()) : null);
        staticSearchBarView.setBackgroundColor(getModel().getSearchBarBackgroundColor());
    }

    private final void setConstraintsAndMarginsForBackButtonState() {
        FragmentSearchSuggestionsBinding fragmentSearchSuggestionsBinding = this.binding;
        StaticSearchBarView searchBarView = fragmentSearchSuggestionsBinding.searchBarView;
        Intrinsics.checkNotNullExpressionValue(searchBarView, "searchBarView");
        ViewGroup.LayoutParams layoutParams = searchBarView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(this.dp8);
        marginLayoutParams.setMarginEnd(this.dp16);
        searchBarView.setLayoutParams(marginLayoutParams);
        ConstraintLayout constraintLayout = fragmentSearchSuggestionsBinding.navBar;
        d d11 = Tl.a.d(constraintLayout, "navBar", constraintLayout);
        StaticSearchBarView searchBarView2 = fragmentSearchSuggestionsBinding.searchBarView;
        Intrinsics.checkNotNullExpressionValue(searchBarView2, "searchBarView");
        ImageButton backButton = fragmentSearchSuggestionsBinding.backButton;
        Intrinsics.checkNotNullExpressionValue(backButton, "backButton");
        ConstraintSetExtKt.layoutConstraintStartToEndOf(d11, searchBarView2, backButton);
        StaticSearchBarView searchBarView3 = fragmentSearchSuggestionsBinding.searchBarView;
        Intrinsics.checkNotNullExpressionValue(searchBarView3, "searchBarView");
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(d11, searchBarView3);
        d11.f(constraintLayout);
    }

    private final void setConstraintsAndMarginsForState(boolean isActiveSearch) {
        int i11;
        FragmentSearchSuggestionsBinding fragmentSearchSuggestionsBinding = this.binding;
        StaticSearchBarView searchBarView = fragmentSearchSuggestionsBinding.searchBarView;
        Intrinsics.checkNotNullExpressionValue(searchBarView, "searchBarView");
        ViewGroup.LayoutParams layoutParams = searchBarView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        StaticNavBarModel.NavBarInfo navBarInfo = getModel().getNavBarInfo();
        marginLayoutParams.setMarginStart((isActiveSearch || (navBarInfo.getSnapshots().getLeft() == null && !navBarInfo.getShowBackButton())) ? this.dp12 : this.dp0);
        if (isActiveSearch || navBarInfo.getSnapshots().getRight() == null) {
            Context context = fragmentSearchSuggestionsBinding.searchBarView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i11 = SelectUtilsKt.isSelect(context) ? this.dp8 : this.dp12;
        } else {
            i11 = this.dp0;
        }
        marginLayoutParams.setMarginEnd(i11);
        searchBarView.setLayoutParams(marginLayoutParams);
        ConstraintLayout constraintLayout = fragmentSearchSuggestionsBinding.navBar;
        d d11 = Tl.a.d(constraintLayout, "navBar", constraintLayout);
        if (isActiveSearch) {
            StaticSearchBarView searchBarView2 = fragmentSearchSuggestionsBinding.searchBarView;
            Intrinsics.checkNotNullExpressionValue(searchBarView2, "searchBarView");
            FrameLayout cancelButtonContainer = fragmentSearchSuggestionsBinding.cancelButtonContainer;
            Intrinsics.checkNotNullExpressionValue(cancelButtonContainer, "cancelButtonContainer");
            ConstraintSetExtKt.layoutConstraintEndToStartOf(d11, searchBarView2, cancelButtonContainer);
        } else {
            StaticSearchBarView searchBarView3 = fragmentSearchSuggestionsBinding.searchBarView;
            Intrinsics.checkNotNullExpressionValue(searchBarView3, "searchBarView");
            ImageView navBarRightActions = fragmentSearchSuggestionsBinding.navBarRightActions;
            Intrinsics.checkNotNullExpressionValue(navBarRightActions, "navBarRightActions");
            ConstraintSetExtKt.layoutConstraintEndToStartOf(d11, searchBarView3, navBarRightActions);
        }
        d11.f(constraintLayout);
        fragmentSearchSuggestionsBinding.searchBarView.setIconBackgroundColor(isActiveSearch);
    }

    private final void setNavBarColors() {
        Window window;
        ru.ozon.app.android.storefront.navBar.NavBarColors colors = getModel().getNavBarInfo().getColors();
        r activity = this.fragment.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setStatusBarColor(colors.getStatusBarColor());
        }
        setStatusBarFlags(colors.getIsBgColorDark());
        this.binding.navBar.setBackgroundColor(colors.getBackgroundColor());
    }

    private final void setSearchBarGoneStartMargin() {
        FragmentSearchSuggestionsBinding fragmentSearchSuggestionsBinding = this.binding;
        StaticSearchBarView searchBarView = fragmentSearchSuggestionsBinding.searchBarView;
        Intrinsics.checkNotNullExpressionValue(searchBarView, "searchBarView");
        ViewGroup.LayoutParams layoutParams = searchBarView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        Context context = fragmentSearchSuggestionsBinding.searchBarView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        bVar.f41594A = SelectUtilsKt.isSelect(context) ? this.startMarginForSelect : this.startMarginForBX;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = this.endSearchMargin;
        searchBarView.setLayoutParams(bVar);
    }

    private final void setStatusBarFlags(boolean isBgColorDark) {
        Window window;
        r activity = this.fragment.getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (isBgColorDark) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        }
        window.clearFlags(67108864);
        window.addFlags(LinearLayoutManager.INVALID_OFFSET);
    }

    private final void setupInitialActionImages() {
        StaticNavBarModel.NavBarInfo navBarInfo = getModel().getNavBarInfo();
        Bitmap left = navBarInfo.getSnapshots().getLeft();
        if (left != null) {
            this.binding.navBarLeftActions.setImageBitmap(left);
        }
        Bitmap right = navBarInfo.getSnapshots().getRight();
        if (right != null) {
            this.binding.navBarRightActions.setImageBitmap(right);
        }
    }

    private final void setupNavBar() {
        goToInitialNavBarState();
        setupInitialActionImages();
        setNavBarColors();
        bindBackButton();
    }

    private final void showOrGoneActions(boolean isVisible) {
        FragmentSearchSuggestionsBinding fragmentSearchSuggestionsBinding = this.binding;
        ImageView navBarLeftActions = fragmentSearchSuggestionsBinding.navBarLeftActions;
        Intrinsics.checkNotNullExpressionValue(navBarLeftActions, "navBarLeftActions");
        navBarLeftActions.setVisibility(isVisible && !this.showBackButton ? 0 : 8);
        ImageView navBarRightActions = fragmentSearchSuggestionsBinding.navBarRightActions;
        Intrinsics.checkNotNullExpressionValue(navBarRightActions, "navBarRightActions");
        navBarRightActions.setVisibility(isVisible && !this.showBackButton ? 0 : 8);
        ImageButton backButton = fragmentSearchSuggestionsBinding.backButton;
        Intrinsics.checkNotNullExpressionValue(backButton, "backButton");
        backButton.setVisibility(!isVisible && this.showBackButton ? 0 : 8);
        FrameLayout cancelButtonContainer = fragmentSearchSuggestionsBinding.cancelButtonContainer;
        Intrinsics.checkNotNullExpressionValue(cancelButtonContainer, "cancelButtonContainer");
        cancelButtonContainer.setVisibility((isVisible || this.showBackButton) ? false : true ? 0 : 8);
    }

    public final void animateForward() {
        TransitionAnimator transitionAnimator = TransitionAnimator.INSTANCE;
        ConstraintLayout navBar = this.binding.navBar;
        Intrinsics.checkNotNullExpressionValue(navBar, "navBar");
        TransitionAnimator.animate$default(transitionAnimator, navBar, new NavBarViewDelegate$animateForward$1(this), null, 40L, 40L, new DecelerateInterpolator(), false, 68, null);
    }

    public final void animateReverse(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        TransitionAnimator transitionAnimator = TransitionAnimator.INSTANCE;
        ConstraintLayout navBar = this.binding.navBar;
        Intrinsics.checkNotNullExpressionValue(navBar, "navBar");
        transitionAnimator.animate(navBar, new NavBarViewDelegate$animateReverse$1(this), callback, 40L, 40L, new AccelerateInterpolator(), true);
    }

    public final void bindColorCancelButton() {
        this.binding.cancelButton.setTextColor(this.colors.getTextCancelButton());
    }

    public final void bindRoundCorners() {
        this.binding.searchBarView.setRoundCorners(getModel().getSearchBarVo().getCornerRadius());
    }

    public final void goToFinalNavBarState() {
        showOrGoneActions(false);
        if (!this.showBackButton) {
            setConstraintsAndMarginsForState(true);
        }
        StaticSearchBarView staticSearchBarView = this.binding.searchBarView;
        SmallIconButtonView clearSearchView = staticSearchBarView.getClearSearchView();
        Editable text = staticSearchBarView.getSearchEditText().getText();
        clearSearchView.setVisibility(!(text == null || text.length() == 0) ? 0 : 8);
        Editable text2 = staticSearchBarView.getSearchEditText().getText();
        staticSearchBarView.showOrGonePhotoSearchIcon((text2 == null || text2.length() == 0) && getModel().getShowPhotoSearchIcon());
        staticSearchBarView.showOrGoneScanItIcon(false);
        staticSearchBarView.showOrGoneSearchCompoundDraw(true);
        staticSearchBarView.showOrGonePdpSearchIcon(null);
        staticSearchBarView.setBackgroundColor(getModel().getSearchBarBackgroundColor());
    }

    public final void setBackButtonClickListener(@NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.binding.backButton.setOnClickListener(new b(onClick, 17));
    }

    public final void setCancelButtonClickListener(@NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.binding.cancelButton.setOnClickListener(new Eq.a(onClick, 1));
    }

    public final void setSearchHint(@NotNull String searchHint) {
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        this.binding.searchBarView.setSearchHint(searchHint);
    }

    public final void stopAnimations() {
        TransitionAnimator transitionAnimator = TransitionAnimator.INSTANCE;
        ConstraintLayout navBar = this.binding.navBar;
        Intrinsics.checkNotNullExpressionValue(navBar, "navBar");
        transitionAnimator.stopAnimation(navBar);
    }
}
