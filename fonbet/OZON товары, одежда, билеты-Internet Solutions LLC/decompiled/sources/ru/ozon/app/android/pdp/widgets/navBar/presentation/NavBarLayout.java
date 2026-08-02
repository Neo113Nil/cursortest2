package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import Sc.o;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarLayout;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00180\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u001c\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180'J\u0006\u0010(\u001a\u00020\u0018JB\u0010)\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00180\u001cH\u0002JD\u00100\u001a\u00020\u00182\u000e\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u00152\u0006\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00180\u001cH\u0002J\u0018\u00105\u001a\u00020\u00182\u000e\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u0015H\u0002J\u0010\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000fH\u0002J$\u00108\u001a\u00020\u0018*\u00020\u00162\u0006\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020#H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarLayout;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/utils/DPS;", "Lru/ozon/app/android/pdp/widgets/navBar/NavBarUtils;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "centerNestedWidgetContainer", "Landroid/widget/FrameLayout;", "getCenterNestedWidgetContainer", "()Landroid/widget/FrameLayout;", "initializeDefaultColor", "", "", "", "animator", "Landroid/animation/ValueAnimator;", "backButton", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarIconButton;", "rightButtons", "", "Landroid/view/View;", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "analyticData", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "favoriteProductDelegate", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "isVisible", "", "updateState", "isVisibleState", "onShownSubWidget", "Lkotlin/Function0;", "onDetach", "animation", "minAlpha", "", "maxAlpha", "time", "", "newAlpha", "bindRightButtons", "rightButtonsItem", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button;", "visibleState", "favDelegate", "sortRightButtonsIfNeeded", "getRightButtonId", "index", "updateButtonMargins", "isFirstButton", "isLastButton", "hasCommonBg", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavBarLayout extends LinearLayout implements DPS, NavBarUtils {
    private ValueAnimator animator;

    @NotNull
    private final NavBarIconButton backButton;

    @NotNull
    private final FrameLayout centerNestedWidgetContainer;

    @NotNull
    private Map<String, Integer> initializeDefaultColor;

    @NotNull
    private List<? extends View> rightButtons;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = getDp16();
        layoutParams.gravity = 16;
        layoutParams.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams);
        this.centerNestedWidgetContainer = frameLayout;
        LinkedHashMap l11 = U.l(new Pair(getInvisibleButtonBackground(), Integer.valueOf(getColorIntByToken(context, getInvisibleButtonBackground()))), new Pair(getInvisibleIconTintColor(), Integer.valueOf(getColorIntByToken(context, getInvisibleIconTintColor()))), new Pair(getVisibleIconTintColor(), Integer.valueOf(getColorIntByToken(context, getVisibleIconTintColor()))));
        this.initializeDefaultColor = l11;
        NavBarIconButton navBarIconButton = new NavBarIconButton(context, l11);
        navBarIconButton.setId(R$id.pdpNavBarBackButton);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(navBarIconButton.getDp36(), navBarIconButton.getDp36());
        layoutParams2.leftMargin = navBarIconButton.getDp8();
        layoutParams2.topMargin = navBarIconButton.getDp8();
        layoutParams2.bottomMargin = navBarIconButton.getDp8();
        navBarIconButton.setLayoutParams(layoutParams2);
        this.backButton = navBarIconButton;
        NavBarIconButton navBarIconButton2 = new NavBarIconButton(context, this.initializeDefaultColor);
        navBarIconButton2.setId(getRightButtonId(0));
        Unit unit = Unit.f71690a;
        NavBarIconButton navBarIconButton3 = new NavBarIconButton(context, this.initializeDefaultColor);
        navBarIconButton3.setId(getRightButtonId(1));
        this.rightButtons = C7714v.b0(navBarIconButton2, navBarIconButton3, new NavBarFavoriteMoleculeButton(context, this.initializeDefaultColor));
        setId(R$id.pdpNavBar);
        setLayoutParams(new ViewGroup.LayoutParams(-1, getDp52()));
        setOrientation(0);
        addView(navBarIconButton);
        addView(frameLayout);
        Iterator<T> it = this.rightButtons.iterator();
        while (it.hasNext()) {
            addView((View) it.next());
        }
    }

    private final ValueAnimator animation(boolean isVisible, float minAlpha, float maxAlpha, long time, final Function1<? super Float, Unit> newAlpha) {
        float f7 = isVisible ? minAlpha : maxAlpha;
        if (isVisible) {
            minAlpha = maxAlpha;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, minAlpha);
        ofFloat.setDuration(time);
        if (!isVisible) {
            ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rE.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NavBarLayout.animation$lambda$10$lambda$9(Function1.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animation$lambda$10$lambda$9(Function1 function1, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Float f7 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f7 != null) {
            function1.invoke(Float.valueOf(f7.floatValue()));
        }
    }

    private final void bindRightButtons(List<? extends NavBarVO.Button> rightButtonsItem, boolean visibleState, FavoriteProductDelegate favDelegate, AnalyticData analyticData, Function1<? super AtomAction, Unit> actionHandler) {
        sortRightButtonsIfNeeded(rightButtonsItem);
        if (rightButtonsItem == null) {
            Iterator<T> it = this.rightButtons.iterator();
            while (it.hasNext()) {
                ViewExtKt.gone((View) it.next());
            }
            return;
        }
        int i11 = 0;
        for (Object obj : rightButtonsItem) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            NavBarVO.Button button = (NavBarVO.Button) obj;
            if (button instanceof NavBarVO.Button.NavBarButton) {
                View view = (View) C7714v.Q(i11, this.rightButtons);
                if (view instanceof NavBarIconButton) {
                    ViewExtKt.show(view);
                    NavBarVO.Button.NavBarButton navBarButton = (NavBarVO.Button.NavBarButton) button;
                    updateButtonMargins(view, i11 == 0, rightButtonsItem.size() - 1 == i11, navBarButton.getCommonBgForIcons() != null);
                    ((NavBarIconButton) view).bind(navBarButton, visibleState, actionHandler);
                }
            } else {
                if (!(button instanceof NavBarVO.Button.FavoriteMoleculeButtonWrapper)) {
                    throw new o();
                }
                View view2 = this.rightButtons.get(i11);
                NavBarFavoriteMoleculeButton navBarFavoriteMoleculeButton = view2 instanceof NavBarFavoriteMoleculeButton ? (NavBarFavoriteMoleculeButton) view2 : null;
                if (navBarFavoriteMoleculeButton != null) {
                    ViewExtKt.show(navBarFavoriteMoleculeButton);
                    NavBarVO.Button.FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper = (NavBarVO.Button.FavoriteMoleculeButtonWrapper) button;
                    updateButtonMargins(navBarFavoriteMoleculeButton, i11 == 0, rightButtonsItem.size() - 1 == i11, favoriteMoleculeButtonWrapper.getCommonBgForIcons() != null);
                    navBarFavoriteMoleculeButton.setupFavoriteButton(favoriteMoleculeButtonWrapper, visibleState, favDelegate, analyticData);
                }
            }
            i11 = i12;
        }
    }

    private final int getRightButtonId(int index) {
        return index != 0 ? index != 1 ? R$id.pdpNavBarButton : R$id.pdpNavBarSecondRightButton : R$id.pdpNavBarFirstRightButton;
    }

    private final void sortRightButtonsIfNeeded(List<? extends NavBarVO.Button> rightButtonsItem) {
        View navBarFavoriteMoleculeButton;
        if (rightButtonsItem != null) {
            if ((C7714v.M(rightButtonsItem) instanceof NavBarVO.Button.NavBarButton) && (C7714v.Q(1, rightButtonsItem) instanceof NavBarVO.Button.NavBarButton) && (C7714v.Q(2, rightButtonsItem) instanceof NavBarVO.Button.FavoriteMoleculeButtonWrapper) && rightButtonsItem.size() == this.rightButtons.size()) {
                return;
            }
            List<? extends NavBarVO.Button> list = rightButtonsItem;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                if (((NavBarVO.Button) obj) instanceof NavBarVO.Button.NavBarButton) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    navBarFavoriteMoleculeButton = new NavBarIconButton(context, this.initializeDefaultColor);
                    navBarFavoriteMoleculeButton.setId(getRightButtonId(i11));
                } else {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    navBarFavoriteMoleculeButton = new NavBarFavoriteMoleculeButton(context2, this.initializeDefaultColor);
                }
                arrayList.add(navBarFavoriteMoleculeButton);
                i11 = i12;
            }
            this.rightButtons = arrayList;
            removeAllViews();
            addView(this.backButton);
            addView(this.centerNestedWidgetContainer);
            Iterator<T> it = this.rightButtons.iterator();
            while (it.hasNext()) {
                addView((View) it.next());
            }
        }
    }

    private final void updateButtonMargins(View view, boolean z11, boolean z12, boolean z13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i11 = marginLayoutParams.leftMargin;
        int i12 = marginLayoutParams.topMargin;
        int i13 = marginLayoutParams.rightMargin;
        int i14 = marginLayoutParams.bottomMargin;
        marginLayoutParams.topMargin = getDp8();
        marginLayoutParams.bottomMargin = getDp8();
        marginLayoutParams.leftMargin = (z11 || z13) ? 0 : getDp4();
        marginLayoutParams.rightMargin = z12 ? getDp8() : 0;
        if (i11 == marginLayoutParams.leftMargin) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils
    @NotNull
    public ValueAnimator alphaAnimation(boolean z11, int i11, int i12, long j11, boolean z12, @NotNull Function1<? super Integer, Unit> function1) {
        return NavBarUtils.DefaultImpls.alphaAnimation(this, z11, i11, i12, j11, z12, function1);
    }

    public final void bind(@NotNull NavBarVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AnalyticData analyticData, @NotNull FavoriteProductDelegate favoriteProductDelegate, boolean isVisible) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        Intrinsics.checkNotNullParameter(favoriteProductDelegate, "favoriteProductDelegate");
        View first = ViewGroupExtKt.first(this.centerNestedWidgetContainer);
        if (first != null) {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(first, Boolean.valueOf(isVisible));
        }
        this.backButton.bind(item.getBackButton(), isVisible, actionHandler);
        bindRightButtons(item.getRightButtons(), isVisible, favoriteProductDelegate, analyticData, actionHandler);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarConstants
    public long getAnimationDuration() {
        return NavBarUtils.DefaultImpls.getAnimationDuration(this);
    }

    @NotNull
    public final FrameLayout getCenterNestedWidgetContainer() {
        return this.centerNestedWidgetContainer;
    }

    public int getColorIntByToken(@NotNull Context context, @NotNull String str) {
        return NavBarUtils.DefaultImpls.getColorIntByToken(this, context, str);
    }

    public int getDp16() {
        return DPS.DefaultImpls.getDp16(this);
    }

    public int getDp4() {
        return DPS.DefaultImpls.getDp4(this);
    }

    public int getDp52() {
        return DPS.DefaultImpls.getDp52(this);
    }

    public int getDp8() {
        return DPS.DefaultImpls.getDp8(this);
    }

    @NotNull
    public String getInvisibleButtonBackground() {
        return NavBarUtils.DefaultImpls.getInvisibleButtonBackground(this);
    }

    @NotNull
    public String getInvisibleIconTintColor() {
        return NavBarUtils.DefaultImpls.getInvisibleIconTintColor(this);
    }

    @NotNull
    public String getVisibleIconTintColor() {
        return NavBarUtils.DefaultImpls.getVisibleIconTintColor(this);
    }

    public final void onDetach() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
        this.backButton.onDetach();
        for (KeyEvent.Callback callback : this.rightButtons) {
            if (callback instanceof ChangeButtonState) {
                ((ChangeButtonState) callback).onDetach();
            }
        }
    }

    public final void updateState(boolean isVisibleState, @NotNull Function0<Unit> onShownSubWidget) {
        Intrinsics.checkNotNullParameter(onShownSubWidget, "onShownSubWidget");
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
        this.backButton.updateState(isVisibleState);
        for (KeyEvent.Callback callback : this.rightButtons) {
            if (callback instanceof ChangeButtonState) {
                ((ChangeButtonState) callback).updateState(isVisibleState);
            }
        }
        ValueAnimator animation = animation(isVisibleState, 0.0f, 1.0f, getAnimationDuration(), new NavBarLayout$updateState$2(this, isVisibleState, onShownSubWidget));
        this.animator = animation;
        if (animation != null) {
            animation.start();
        }
    }
}
