package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview;

import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeKt;
import ru.ozon.app.android.favorites.ui.R$id;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.uikit.R$anim;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000e*\u00020\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0018R6\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R6\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010$8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u0017\u0010.\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R,\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010:\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<\"\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindDataOrGone", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "view", "", "onLongClicked", "(Landroid/view/View;)Z", "initFavTextView", "()V", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "setContentDescription", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "", "radius", "setCornerRadius", "(Landroid/view/View;F)V", "bindFavoriteOrGone", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "revertAndRebindViewState", "shake", "Lkotlin/Function2;", "onButtonChanged", "Lkotlin/jvm/functions/Function2;", "getOnButtonChanged", "()Lkotlin/jvm/functions/Function2;", "setOnButtonChanged", "(Lkotlin/jvm/functions/Function2;)V", "onLongButtonClick", "getOnLongButtonClick", "setOnLongButtonClick", "favIcon", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "getFavIcon", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "Lkotlin/Function0;", "onClick", "Lkotlin/jvm/functions/Function0;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isSelectApp", "Z", "()Z", "setSelectApp", "(Z)V", "Landroidx/appcompat/widget/AppCompatTextView;", "favTv", "Landroidx/appcompat/widget/AppCompatTextView;", "currentModel", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lkotlin/jvm/functions/Function1;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductFavoriteMoleculeButtonView extends FavoriteButton {
    private Function1<? super AtomAction, Unit> actionHandler;
    private FavoriteProductMolecule currentModel;

    @NotNull
    private final SmallIconButtonView favIcon;
    private AppCompatTextView favTv;
    private boolean isSelectApp;
    private Function2<? super FavoriteProductMolecule, ? super View, Unit> onButtonChanged;
    private Function0<Unit> onClick;
    private Function2<? super FavoriteProductMolecule, ? super View, Unit> onLongButtonClick;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float SELECT_CORNER_RADIUS = ResourceExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView$Companion;", "", "<init>", "()V", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductFavoriteMoleculeButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView, View view) {
        productFavoriteMoleculeButtonView.favIcon.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView, View view) {
        Intrinsics.f(view);
        return productFavoriteMoleculeButtonView.onLongClicked(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$3(ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView, View view) {
        Intrinsics.f(view);
        return productFavoriteMoleculeButtonView.onLongClicked(view);
    }

    private final void bindDataOrGone(FavoriteProductMolecule item, Function1<? super AtomAction, Unit> actionHandler) {
        SmallIconButtonView smallIconButtonView = this.favIcon;
        WrappedIconButtonHolderKt.bindOrGone(smallIconButtonView, item != null ? FavoriteProductMoleculeKt.getButton(item) : null, actionHandler);
        setContentDescription(smallIconButtonView, item);
        if ((item != null ? item.getTheme() : null) == FavoriteProductMolecule.ThemeType.THEME_TYPE_ICON_SMALL_WITH_TEXT) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int px = ResourceExtKt.toPx(40, context);
            SmallIconButtonView smallIconButtonView2 = this.favIcon;
            ViewGroup.LayoutParams layoutParams = smallIconButtonView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = px;
            layoutParams2.height = px;
            smallIconButtonView2.setLayoutParams(layoutParams2);
            if (this.favTv == null) {
                initFavTextView();
            }
            AppCompatTextView appCompatTextView = this.favTv;
            if (appCompatTextView != null) {
                ViewExtKt.show(appCompatTextView);
            }
            AppCompatTextView appCompatTextView2 = this.favTv;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(item.isFavorite() ? R$string.favorites_favorite_product_molecule_remove_android : R$string.favorites_favorite_product_molecule_add_android);
            }
        } else {
            SmallIconButtonView smallIconButtonView3 = this.favIcon;
            ViewGroup.LayoutParams layoutParams3 = smallIconButtonView3.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = -1;
            layoutParams4.height = -1;
            smallIconButtonView3.setLayoutParams(layoutParams4);
            AppCompatTextView appCompatTextView3 = this.favTv;
            if (appCompatTextView3 != null) {
                ViewExtKt.gone(appCompatTextView3);
            }
        }
        setSelected(item != null ? item.isFavorite() : false);
    }

    private final void initFavTextView() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R$id.favTv);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L);
        addView(appCompatTextView);
        this.favTv = appCompatTextView;
    }

    private final boolean onLongClicked(View view) {
        FavoriteProductMolecule favoriteProductMolecule = this.currentModel;
        if (favoriteProductMolecule == null) {
            return false;
        }
        Function2<FavoriteProductMolecule, View, Unit> onLongButtonClick = getOnLongButtonClick();
        if (onLongButtonClick == null) {
            return true;
        }
        onLongButtonClick.invoke(favoriteProductMolecule, view);
        return true;
    }

    private final void setContentDescription(SmallIconButtonView smallIconButtonView, FavoriteProductMolecule favoriteProductMolecule) {
        String str;
        if (favoriteProductMolecule != null) {
            TestInfo testInfo = FavoriteProductMoleculeKt.getButton(favoriteProductMolecule).getTestInfo();
            if (testInfo == null || (str = testInfo.getAutomatizationId()) == null) {
                str = favoriteProductMolecule.isFavorite() ? "favorite" : "not-favorite";
            }
        } else {
            str = null;
        }
        smallIconButtonView.setContentDescription(str);
    }

    private final void setCornerRadius(View view, final float f7) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView$setCornerRadius$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view2, "view", outline, "outline"), view2.getHeight(), f7);
            }
        });
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void bindFavoriteOrGone(FavoriteProductMolecule item) {
        this.currentModel = item;
        ProductFavoriteMoleculeButtonView$bindFavoriteOrGone$1 productFavoriteMoleculeButtonView$bindFavoriteOrGone$1 = new ProductFavoriteMoleculeButtonView$bindFavoriteOrGone$1(this);
        this.actionHandler = productFavoriteMoleculeButtonView$bindFavoriteOrGone$1;
        bindDataOrGone(item, productFavoriteMoleculeButtonView$bindFavoriteOrGone$1);
    }

    @NotNull
    public final SmallIconButtonView getFavIcon() {
        return this.favIcon;
    }

    public Function2<FavoriteProductMolecule, View, Unit> getOnButtonChanged() {
        return this.onButtonChanged;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public Function2<FavoriteProductMolecule, View, Unit> getOnLongButtonClick() {
        return this.onLongButtonClick;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void revertAndRebindViewState() {
        FavoriteProductMolecule favoriteProductMolecule;
        FavoriteProductMolecule favoriteProductMolecule2 = this.currentModel;
        if (favoriteProductMolecule2 != null) {
            favoriteProductMolecule = FavoriteProductMolecule.copy$default(favoriteProductMolecule2, null, 0L, !favoriteProductMolecule2.isFavorite(), null, null, null, null, 123, null);
            bindDataOrGone(favoriteProductMolecule, this.actionHandler);
        } else {
            favoriteProductMolecule = null;
        }
        this.currentModel = favoriteProductMolecule;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void setOnButtonChanged(Function2<? super FavoriteProductMolecule, ? super View, Unit> function2) {
        this.onButtonChanged = function2;
    }

    public final void setOnClick(Function0<Unit> function0) {
        this.onClick = function0;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void setOnLongButtonClick(Function2<? super FavoriteProductMolecule, ? super View, Unit> function2) {
        this.onLongButtonClick = function2;
    }

    public final void setSelectApp(boolean z11) {
        if (z11 != this.isSelectApp) {
            this.isSelectApp = z11;
            if (z11) {
                setCornerRadius(this.favIcon, SELECT_CORNER_RADIUS);
            }
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void shake() {
        this.favIcon.startAnimation(AnimationUtils.loadAnimation(getContext(), R$anim.shake));
    }

    public /* synthetic */ ProductFavoriteMoleculeButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFavoriteMoleculeButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) q.f64554a.g(N.b(SmallIconButtonView.class), context);
        smallIconButtonView.setId(R$id.favIcon);
        setGravity(17);
        addView(smallIconButtonView, new LinearLayout.LayoutParams(-1, -1));
        this.favIcon = smallIconButtonView;
        setOnClickListener(new View.OnClickListener() { // from class: yt.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductFavoriteMoleculeButtonView._init_$lambda$1(ProductFavoriteMoleculeButtonView.this, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: yt.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean _init_$lambda$2;
                _init_$lambda$2 = ProductFavoriteMoleculeButtonView._init_$lambda$2(ProductFavoriteMoleculeButtonView.this, view);
                return _init_$lambda$2;
            }
        });
        smallIconButtonView.setOnLongClickListener(new View.OnLongClickListener() { // from class: yt.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean _init_$lambda$3;
                _init_$lambda$3 = ProductFavoriteMoleculeButtonView._init_$lambda$3(ProductFavoriteMoleculeButtonView.this, view);
                return _init_$lambda$3;
            }
        });
    }
}
