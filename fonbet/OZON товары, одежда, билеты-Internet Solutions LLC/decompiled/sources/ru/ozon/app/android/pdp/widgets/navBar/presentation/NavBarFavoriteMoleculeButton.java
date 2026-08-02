package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import Ck.a;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarFavoriteMoleculeButton;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarVO;
import ru.ozon.app.android.uikit.R$anim;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001XB#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\"J-\u0010/\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020)2\u0006\u0010*\u001a\u00020$2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020)¢\u0006\u0004\b1\u00102JZ\u0010>\u001a\u00020\u00102\u0006\u00103\u001a\u00020\t2\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010\t2\u0006\u00107\u001a\u00020\t2\u0006\u00109\u001a\u0002082\u0006\u0010*\u001a\u00020$2\b\u0010;\u001a\u0004\u0018\u00010:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100<H\u0096\u0001¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b@\u0010\u001cJ*\u0010A\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:H\u0096\u0001¢\u0006\u0004\bA\u0010BJ&\u0010D\u001a\u00020\u00102\u0006\u0010C\u001a\u00020$2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100<H\u0096\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\bF\u0010\"J\u0017\u0010G\u001a\u00020$2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\bG\u0010HR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010IR6\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0010\u0018\u00010J8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR6\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0010\u0018\u00010J8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarFavoriteMoleculeButton;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "Lru/ozon/app/android/pdp/utils/DPS;", "Lru/ozon/app/android/pdp/widgets/navBar/NavBarUtils;", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/ChangeButtonState;", "", "Landroid/content/Context;", "context", "", "", "", "colors", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "item", "bindFavoriteOrGone", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "revertAndRebindViewState", "()V", "shake", "", "newState", "updateState", "(Z)V", "onDetach", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$FavoriteMoleculeButtonWrapper;", "visibleState", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "favDelegate", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "setupFavoriteButton", "(Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$FavoriteMoleculeButtonWrapper;ZLru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "bind", "(Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$FavoriteMoleculeButtonWrapper;)V", "newBackgroundColorToken", "", "newCornerRadius", "newIconTintColorToken", "newIcon", "Landroid/view/View;", "view", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;", "commonBgForIcons", "Lkotlin/Function0;", "onInvalidate", "updateButton", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Landroid/view/View;ZLru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;Lkotlin/jvm/functions/Function0;)V", "onDrawButton", "updateDrawableBounds", "(IILru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;)V", "isVisible", "animateBackgroundVisibility", "(ZLkotlin/jvm/functions/Function0;)V", "cancelAnimation", "onLongClicked", "(Landroid/view/View;)Z", "Ljava/util/Map;", "Lkotlin/Function2;", "onButtonChanged", "Lkotlin/jvm/functions/Function2;", "getOnButtonChanged", "()Lkotlin/jvm/functions/Function2;", "setOnButtonChanged", "(Lkotlin/jvm/functions/Function2;)V", "onLongButtonClick", "getOnLongButtonClick", "setOnLongButtonClick", "currentModel", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$FavoriteMoleculeButtonWrapper;", "currentVisibleState", "Z", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class NavBarFavoriteMoleculeButton extends FavoriteButton implements DPS, NavBarUtils, ChangeButtonState {
    private final /* synthetic */ NavBarButtonDelegateImpl $$delegate_0;

    @NotNull
    private final Map<String, Integer> colors;
    private NavBarVO.Button.FavoriteMoleculeButtonWrapper currentModel;
    private boolean currentVisibleState;
    private Function2<? super FavoriteProductMolecule, ? super View, Unit> onButtonChanged;
    private Function2<? super FavoriteProductMolecule, ? super View, Unit> onLongButtonClick;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarFavoriteMoleculeButton$Companion;", "", "<init>", "()V", "FAVORITE", "", "UNFAVORITE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarFavoriteMoleculeButton(@NotNull Context context, @NotNull Map<String, Integer> colors) {
        super(context, null, 0, false, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.$$delegate_0 = new NavBarButtonDelegateImpl(context, colors);
        this.colors = colors;
        setId(R$id.pdpNavBarFavoriteButton);
        setWillNotDraw(false);
        setOnClickListener(new a(this, 14));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: rE.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean _init_$lambda$2;
                _init_$lambda$2 = NavBarFavoriteMoleculeButton._init_$lambda$2(NavBarFavoriteMoleculeButton.this, view);
                return _init_$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(NavBarFavoriteMoleculeButton navBarFavoriteMoleculeButton, View view) {
        FavoriteProductMolecule favoriteMoleculeButton;
        Function2<FavoriteProductMolecule, View, Unit> onButtonChanged;
        NavBarVO.Button.FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper = navBarFavoriteMoleculeButton.currentModel;
        if (favoriteMoleculeButtonWrapper == null || (favoriteMoleculeButton = favoriteMoleculeButtonWrapper.getFavoriteMoleculeButton()) == null || (onButtonChanged = navBarFavoriteMoleculeButton.getOnButtonChanged()) == null) {
            return;
        }
        onButtonChanged.invoke(favoriteMoleculeButton, navBarFavoriteMoleculeButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(NavBarFavoriteMoleculeButton navBarFavoriteMoleculeButton, View view) {
        Intrinsics.f(view);
        return navBarFavoriteMoleculeButton.onLongClicked(view);
    }

    private final boolean onLongClicked(View view) {
        NavBarVO.Button.FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper = this.currentModel;
        if (favoriteMoleculeButtonWrapper == null) {
            return false;
        }
        Function2<FavoriteProductMolecule, View, Unit> onLongButtonClick = getOnLongButtonClick();
        if (onLongButtonClick == null) {
            return true;
        }
        onLongButtonClick.invoke(favoriteMoleculeButtonWrapper.getFavoriteMoleculeButton(), view);
        return true;
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils
    @NotNull
    public ValueAnimator alphaAnimation(boolean z11, int i11, int i12, long j11, boolean z12, @NotNull Function1<? super Integer, Unit> function1) {
        return NavBarUtils.DefaultImpls.alphaAnimation(this, z11, i11, i12, j11, z12, function1);
    }

    public void animateBackgroundVisibility(boolean isVisible, @NotNull Function0<Unit> onInvalidate) {
        Intrinsics.checkNotNullParameter(onInvalidate, "onInvalidate");
        this.$$delegate_0.animateBackgroundVisibility(isVisible, onInvalidate);
    }

    public final void bind(@NotNull NavBarVO.Button.FavoriteMoleculeButtonWrapper item) {
        Intrinsics.checkNotNullParameter(item, "item");
        updateButton(item.getInvisibleStateButtonBackground(), item.getCornerRadius(), item.getFavoriteMoleculeButton().isFavorite() ? item.getFavoriteMoleculeButton().getUnfavoriteButton().getTintColor() : this.currentVisibleState ? item.getVisibleStateIconTintColor() : item.getInvisibleStateIconTintColor(), item.getFavoriteMoleculeButton().isFavorite() ? item.getFavoriteMoleculeButton().getUnfavoriteButton().getIcon() : item.getFavoriteMoleculeButton().getFavoriteButton().getIcon(), this, this.currentVisibleState, item.getCommonBgForIcons(), new NavBarFavoriteMoleculeButton$bind$1$1(item, this));
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void bindFavoriteOrGone(FavoriteProductMolecule item) {
        NavBarVO.Button.FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper;
        if (item == null) {
            ViewExtKt.gone(this);
            return;
        }
        if (getVisibility() != 0) {
            ViewExtKt.show(this);
        }
        NavBarVO.Button.FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper2 = this.currentModel;
        if (favoriteMoleculeButtonWrapper2 == null || (favoriteMoleculeButtonWrapper = NavBarVO.Button.FavoriteMoleculeButtonWrapper.copy$default(favoriteMoleculeButtonWrapper2, item, 0.0f, null, null, null, null, 62, null)) == null) {
            favoriteMoleculeButtonWrapper = null;
        } else {
            bind(favoriteMoleculeButtonWrapper);
        }
        this.currentModel = favoriteMoleculeButtonWrapper;
    }

    public void cancelAnimation() {
        this.$$delegate_0.cancelAnimation();
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarConstants
    public long getAnimationDuration() {
        return NavBarUtils.DefaultImpls.getAnimationDuration(this);
    }

    public int getDp36() {
        return DPS.DefaultImpls.getDp36(this);
    }

    public Function2<FavoriteProductMolecule, View, Unit> getOnButtonChanged() {
        return this.onButtonChanged;
    }

    public Function2<FavoriteProductMolecule, View, Unit> getOnLongButtonClick() {
        return this.onLongButtonClick;
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.presentation.ChangeButtonState
    public void onDetach() {
        cancelAnimation();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        onDrawButton(canvas);
    }

    public void onDrawButton(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.$$delegate_0.onDrawButton(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int dp36 = getDp36();
        setMeasuredDimension(View.resolveSize(dp36, widthMeasureSpec), View.resolveSize(dp36, heightMeasureSpec));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        NavBarVO.Button.FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper = this.currentModel;
        updateDrawableBounds(width, height, favoriteMoleculeButtonWrapper != null ? favoriteMoleculeButtonWrapper.getCommonBgForIcons() : null);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void revertAndRebindViewState() {
        NavBarVO.Button.FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper;
        NavBarVO.Button.FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper2 = this.currentModel;
        if (favoriteMoleculeButtonWrapper2 != null) {
            favoriteMoleculeButtonWrapper = NavBarVO.Button.FavoriteMoleculeButtonWrapper.copy$default(favoriteMoleculeButtonWrapper2, FavoriteProductMolecule.copy$default(favoriteMoleculeButtonWrapper2.getFavoriteMoleculeButton(), null, 0L, !favoriteMoleculeButtonWrapper2.getFavoriteMoleculeButton().isFavorite(), null, null, null, null, 123, null), 0.0f, null, null, null, null, 62, null);
            bind(favoriteMoleculeButtonWrapper);
        } else {
            favoriteMoleculeButtonWrapper = null;
        }
        this.currentModel = favoriteMoleculeButtonWrapper;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void setOnButtonChanged(Function2<? super FavoriteProductMolecule, ? super View, Unit> function2) {
        this.onButtonChanged = function2;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void setOnLongButtonClick(Function2<? super FavoriteProductMolecule, ? super View, Unit> function2) {
        this.onLongButtonClick = function2;
    }

    public final void setupFavoriteButton(@NotNull NavBarVO.Button.FavoriteMoleculeButtonWrapper item, boolean visibleState, @NotNull FavoriteProductDelegate favDelegate, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(favDelegate, "favDelegate");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.currentModel = item;
        this.currentVisibleState = visibleState;
        bind(item);
        favDelegate.bindFavoriteProductButton(this, item.getFavoriteMoleculeButton(), analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void shake() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), R$anim.shake));
    }

    public void updateButton(@NotNull String newBackgroundColorToken, float newCornerRadius, String newIconTintColorToken, @NotNull String newIcon, @NotNull View view, boolean visibleState, NavBarVO.CommonBgForIcon commonBgForIcons, @NotNull Function0<Unit> onInvalidate) {
        Intrinsics.checkNotNullParameter(newBackgroundColorToken, "newBackgroundColorToken");
        Intrinsics.checkNotNullParameter(newIcon, "newIcon");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onInvalidate, "onInvalidate");
        this.$$delegate_0.updateButton(newBackgroundColorToken, newCornerRadius, newIconTintColorToken, newIcon, view, visibleState, commonBgForIcons, onInvalidate);
    }

    public void updateDrawableBounds(int width, int height, NavBarVO.CommonBgForIcon commonBgForIcons) {
        this.$$delegate_0.updateDrawableBounds(width, height, commonBgForIcons);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.presentation.ChangeButtonState
    public void updateState(boolean newState) {
        if (this.currentVisibleState != newState) {
            this.currentVisibleState = newState;
            NavBarVO.Button.FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper = this.currentModel;
            if (favoriteMoleculeButtonWrapper != null) {
                bind(favoriteMoleculeButtonWrapper);
            }
            animateBackgroundVisibility(!newState, new NavBarFavoriteMoleculeButton$updateState$2(this));
        }
    }
}
