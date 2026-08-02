package ru.ozon.app.android.favorites.favoriteproduct.v2.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.favoriteproduct.v2.ui.vo.FavoriteProductV2VO;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/view/FavoriteProductV2View;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "moleculeView", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "getMoleculeView", "()Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "setMargins", "", "margins", "Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/vo/FavoriteProductV2VO$Margins;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteProductV2View extends FrameLayout {

    @NotNull
    private final ProductFavoriteMoleculeV4ButtonView moleculeView;

    public /* synthetic */ FavoriteProductV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final ProductFavoriteMoleculeV4ButtonView getMoleculeView() {
        return this.moleculeView;
    }

    public final void setMargins(@NotNull FavoriteProductV2VO.Margins margins) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = this.moleculeView;
        ViewGroup.LayoutParams layoutParams = productFavoriteMoleculeV4ButtonView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = margins.getTop();
        marginLayoutParams.bottomMargin = margins.getBottom();
        marginLayoutParams.leftMargin = margins.getLeft();
        marginLayoutParams.rightMargin = margins.getRight();
        productFavoriteMoleculeV4ButtonView.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteProductV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = new ProductFavoriteMoleculeV4ButtonView(context, null, 0, 6, null);
        productFavoriteMoleculeV4ButtonView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(productFavoriteMoleculeV4ButtonView);
        this.moleculeView = productFavoriteMoleculeV4ButtonView;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }
}
