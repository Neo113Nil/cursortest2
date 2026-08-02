package ru.ozon.app.android.storefront.widgets.navbarApparel.view;

import Vg.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import d20.AbstractC6065b;
import gk0.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.storefront.widgets.navbarApparel.presentation.NavBarApparelVO;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0001\u0018\u0000 I2\u00020\u0001:\u0001IB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0012\u001a\u00020\u00102\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00062\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010%J7\u0010+\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100JY\u0010:\u001a\u00020\u00102\u0006\u00102\u001a\u0002012\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00104\u001a\u0002032\f\u00106\u001a\b\u0012\u0004\u0012\u000201052\n\u00109\u001a\u000607j\u0002`82\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0004\b:\u0010;R$\u0010>\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u0010\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020-0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010G¨\u0006J"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "rightButtons", "Lkotlin/Function2;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "", "onFavBind", "bindRightViews", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "dto", "index", "bindIconDTO", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;I)V", "bindFavDTO", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;ILkotlin/jvm/functions/Function2;)V", "backButton", "", "isRootScreen", "bindBackButtonView", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Z)V", "widthMeasureSpec", "heightMeasureSpec", "measureChild", "(II)I", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/View;", "view", "removeView", "(Landroid/view/View;)V", "Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelVO;", "item", "Ll10/i;", "container", "Ld20/b;", "vh", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "bind", "(Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelVO;ZLl10/i;Ld20/b;LVg/d;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "backButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "", "rightViews", "Ljava/util/List;", "backButtonWidth", "I", "rightViewsWidth", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavBarApparelView extends ViewGroup {
    private Function1<? super AtomAction, Unit> actionHandler;
    private IconButtonV3View backButtonView;
    private int backButtonWidth;

    @NotNull
    private final List<View> rightViews;
    private int rightViewsWidth;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int intermediateMargin = UiExtKt.toPx(4);
    private static final int viewPaddingHorizontal = UiExtKt.toPx(12);
    private static final int viewPaddingTop = UiExtKt.toPx(8);
    private static final int viewPaddingBottom = UiExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelView$Companion;", "", "<init>", "()V", "", "BUTTON_LOCATOR", "Ljava/lang/String;", "BUTTON_LOCATOR_TEMPLATE", "BUTTON_BACK_LOCATOR", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ NavBarApparelView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBackButtonView(IconButtonV3DTO backButton, boolean isRootScreen) {
        if (backButton == null || isRootScreen) {
            removeView(this.backButtonView);
            return;
        }
        if (this.backButtonView == null) {
            IconButtonV3View iconButtonV3View = (IconButtonV3View) q.f64554a.i(N.b(IconButtonV3View.class), getContext());
            if (iconButtonV3View == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
            }
            this.backButtonView = iconButtonV3View;
        }
        IconButtonV3View iconButtonV3View2 = this.backButtonView;
        if (iconButtonV3View2 != null) {
            iconButtonV3View2.setContentDescription("Apparel button back");
            IconButtonV3HolderKt.bind$default(iconButtonV3View2, backButton, null, 2, null);
            ViewExtKt.setOnClickListenerThrottle$default(iconButtonV3View2, 0L, new NavBarApparelView$bindBackButtonView$1$1(iconButtonV3View2), 1, null);
            addView(iconButtonV3View2);
        }
    }

    private final void bindFavDTO(FavoriteProductMolecule dto, int index, Function2<? super ProductFavoriteMoleculeButtonView, ? super FavoriteProductMolecule, Unit> onFavBind) {
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = (ProductFavoriteMoleculeButtonView) q.f64554a.i(N.b(ProductFavoriteMoleculeButtonView.class), getContext());
        if (productFavoriteMoleculeButtonView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            productFavoriteMoleculeButtonView = new ProductFavoriteMoleculeButtonView(context, null, 0, 6, null);
        }
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{"Apparel button", Integer.valueOf(index)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        productFavoriteMoleculeButtonView.setContentDescription(format);
        onFavBind.invoke(productFavoriteMoleculeButtonView, dto);
        this.rightViews.add(productFavoriteMoleculeButtonView);
        addView(productFavoriteMoleculeButtonView);
    }

    private final void bindIconDTO(IconButtonV3DTO dto, int index) {
        IconButtonV3View iconButtonV3View = (IconButtonV3View) q.f64554a.i(N.b(IconButtonV3View.class), getContext());
        if (iconButtonV3View == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        }
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{"Apparel button", Integer.valueOf(index)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        iconButtonV3View.setContentDescription(format);
        IconButtonV3HolderKt.bind(iconButtonV3View, dto, this.actionHandler);
        this.rightViews.add(iconButtonV3View);
        addView(iconButtonV3View);
    }

    private final void bindRightViews(List<? extends Object> rightButtons, Function2<? super ProductFavoriteMoleculeButtonView, ? super FavoriteProductMolecule, Unit> onFavBind) {
        this.rightViews.clear();
        List<? extends Object> list = rightButtons;
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        for (Object obj : rightButtons) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (obj instanceof IconButtonV3DTO) {
                bindIconDTO((IconButtonV3DTO) obj, i11);
            } else if (obj instanceof FavoriteProductMolecule) {
                bindFavDTO((FavoriteProductMolecule) obj, i11, onFavBind);
            }
            i11 = i12;
        }
    }

    private final int measureChild(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(widthMeasureSpec) - (viewPaddingHorizontal * 2);
        IconButtonV3View iconButtonV3View = this.backButtonView;
        int i13 = 0;
        if (iconButtonV3View != null) {
            measureChild(iconButtonV3View, widthMeasureSpec, heightMeasureSpec);
            i12 = Math.max(0, iconButtonV3View.getMeasuredHeight());
            i11 = iconButtonV3View.getMeasuredWidth() + intermediateMargin;
        } else {
            i11 = 0;
            i12 = 0;
        }
        this.backButtonWidth = i11;
        int i14 = size - i11;
        for (View view : C7714v.v(this.rightViews)) {
            measureChild(view, widthMeasureSpec, heightMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = intermediateMargin;
            if (measuredWidth + i15 > i14) {
                ViewExtKt.gone(view);
            } else {
                ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(view);
            }
            i14 -= view.getMeasuredHeight() + i15;
            i12 = Math.max(i12, view.getMeasuredHeight());
            i13 += view.getMeasuredWidth();
        }
        this.rightViewsWidth = i13;
        return i12;
    }

    public final void bind(@NotNull NavBarApparelVO item, boolean isRootScreen, @NotNull i container, @NotNull AbstractC6065b<NavBarApparelVO> vh2, @NotNull d customActionHandlersStoreFactory, @NotNull Function2<? super ProductFavoriteMoleculeButtonView, ? super FavoriteProductMolecule, Unit> onFavBind) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(onFavBind, "onFavBind");
        this.actionHandler = new ActionHandler.Builder(container, vh2).customActionHandlers(new NavBarApparelView$bind$1(customActionHandlersStoreFactory)).buildHandler();
        removeAllViews();
        bindBackButtonView(item.getBackButton(), isRootScreen);
        bindRightViews(item.getRightButtons(), onFavBind);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        IconButtonV3View iconButtonV3View = this.backButtonView;
        if (iconButtonV3View != null) {
            LayoutExtKt.layoutLeftTop(iconButtonV3View, getPaddingLeft(), getPaddingTop());
        }
        List<View> v11 = C7714v.v(this.rightViews);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        for (View view : v11) {
            LayoutExtKt.layoutLeftTop(view, measuredWidth - view.getMeasuredWidth(), getPaddingTop());
            measuredWidth = (measuredWidth - view.getMeasuredWidth()) - intermediateMargin;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + measureChild(widthMeasureSpec, heightMeasureSpec), 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Intrinsics.d(this.backButtonView, view)) {
            this.backButtonView = null;
            return;
        }
        for (View view2 : C7714v.v(this.rightViews)) {
            if (Intrinsics.d(view2, view)) {
                this.rightViews.remove(view2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarApparelView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rightViews = new ArrayList();
        int i12 = viewPaddingHorizontal;
        setPadding(i12, viewPaddingTop, i12, viewPaddingBottom);
    }
}
