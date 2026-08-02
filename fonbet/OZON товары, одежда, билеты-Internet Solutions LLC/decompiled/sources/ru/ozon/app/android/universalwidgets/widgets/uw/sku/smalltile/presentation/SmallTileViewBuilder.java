package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation;

import Nk.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileAdultImageView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u001b\u0010'\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010 ¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileViewBuilder;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/uni/android/atom/badge/BadgeView;", "createAtomBadge", "(Landroid/content/Context;)Lru/ozon/uni/android/atom/badge/BadgeView;", "Landroid/view/ViewGroup;", "container", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImageView;", "buildImageView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImageView;", "Landroidx/recyclerview/widget/RecyclerView;", "buildInfoList", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView;", "buildBadge", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "buildButton", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "Landroidx/appcompat/widget/AppCompatImageView;", "buildAspectRatioImage", "(Landroid/view/ViewGroup;)Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "buildFavoriteButton", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "", "productInfoHorizontalPadding", "I", "getProductInfoHorizontalPadding", "()I", "minWidth", "productInfoTopMargin", "productInfoBottomMargin", "favoriteButtonSize$delegate", "LSc/j;", "getFavoriteButtonSize", "favoriteButtonSize", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallTileViewBuilder {

    @NotNull
    public static final SmallTileViewBuilder INSTANCE = new SmallTileViewBuilder();
    private static final int productInfoHorizontalPadding = ResourceExtKt.toPx(8);
    private static final int minWidth = ResourceExtKt.toPx(96);
    private static final int productInfoTopMargin = ResourceExtKt.toPx(4);
    private static final int productInfoBottomMargin = ResourceExtKt.toPx(6);

    /* renamed from: favoriteButtonSize$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j favoriteButtonSize = LazyUtilsKt.unsafeLazy(SmallTileViewBuilder$favoriteButtonSize$2.INSTANCE);

    private SmallTileViewBuilder() {
    }

    private final BadgeView createAtomBadge(Context context) {
        BadgeView badgeView = (BadgeView) q.f64554a.i(N.b(BadgeView.class), context);
        return badgeView == null ? new BadgeView(context, null, 0, 0, 14, null) : badgeView;
    }

    private final int getFavoriteButtonSize() {
        return ((Number) favoriteButtonSize.getValue()).intValue();
    }

    @NotNull
    public final AppCompatImageView buildAspectRatioImage(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        AppCompatImageView appCompatImageView = new AppCompatImageView(container.getContext());
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setAdjustViewBounds(true);
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatImageView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.bgLightKey));
        container.addView(appCompatImageView, 0, new FrameLayout.LayoutParams(-1, -1));
        return appCompatImageView;
    }

    @NotNull
    public final BadgeView buildBadge(@NotNull ViewGroup container) {
        BadgeView createAtomBadge = createAtomBadge(a.a(container, "container", "getContext(...)"));
        createAtomBadge.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = 0;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = 0;
        bVar.f41598E = 0.0f;
        bVar.f41616W = true;
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        bVar.f41642l = R$id.smalltile_image;
        Unit unit = Unit.f71690a;
        container.addView(createAtomBadge, bVar);
        return createAtomBadge;
    }

    @NotNull
    public final AddToCartButtonView buildButton(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AddToCartButtonView addToCartButtonView = new AddToCartButtonView(context, null, 0, 6, null);
        addToCartButtonView.setId(R$id.smalltile_button);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        Unit unit = Unit.f71690a;
        container.addView(addToCartButtonView, bVar);
        return addToCartButtonView;
    }

    @NotNull
    public final ProductFavoriteMoleculeButtonView buildFavoriteButton(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = (ProductFavoriteMoleculeButtonView) q.f64554a.i(N.b(ProductFavoriteMoleculeButtonView.class), container.getContext());
        if (productFavoriteMoleculeButtonView == null) {
            Context context = container.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            productFavoriteMoleculeButtonView = new ProductFavoriteMoleculeButtonView(context, null, 0, 6, null);
        }
        ConstraintLayout.b bVar = new ConstraintLayout.b(getFavoriteButtonSize(), getFavoriteButtonSize());
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        Unit unit = Unit.f71690a;
        container.addView(productFavoriteMoleculeButtonView, bVar);
        return productFavoriteMoleculeButtonView;
    }

    @NotNull
    public final SmallTileAdultImageView buildImageView(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SmallTileAdultImageView smallTileAdultImageView = new SmallTileAdultImageView(context);
        smallTileAdultImageView.setId(R$id.smalltile_image);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        smallTileAdultImageView.setMinimumWidth(minWidth);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        Unit unit = Unit.f71690a;
        container.addView(smallTileAdultImageView, bVar);
        return smallTileAdultImageView;
    }

    @NotNull
    public final RecyclerView buildInfoList(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        RecyclerView recyclerView = new RecyclerView(container.getContext());
        recyclerView.setId(R$id.smalltile_info_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setNestedScrollingEnabled(false);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41617X = true;
        bVar.f41616W = true;
        bVar.f41638j = R$id.smalltile_image;
        bVar.f41640k = R$id.smalltile_button;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = productInfoBottomMargin;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = productInfoTopMargin;
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        int i11 = productInfoHorizontalPadding;
        recyclerView.setPadding(i11, 0, i11, 0);
        bVar.f41599F = 0.0f;
        bVar.f41598E = 0.0f;
        Unit unit = Unit.f71690a;
        container.addView(recyclerView, bVar);
        return recyclerView;
    }

    public final int getProductInfoHorizontalPadding() {
        return productInfoHorizontalPadding;
    }
}
