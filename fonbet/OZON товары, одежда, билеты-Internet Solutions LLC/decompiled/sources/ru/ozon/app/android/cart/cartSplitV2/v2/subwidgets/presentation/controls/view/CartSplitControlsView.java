package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.view;

import D40.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.ControlsVO;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001c\u001a\u00020\u0019H\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartSplitControlsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStileAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "moveButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getMoveButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "favBtn", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "getFavBtn", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "removeButton", "getRemoveButton", "countPickerV", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartCountPickerView;", "getCountPickerV", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartCountPickerView;", "updateQuantityLPForSmallScreen", "", "controlsVO", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO;", "ensureNormalLayout", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitControlsView extends ConstraintLayout {

    @NotNull
    private final CartCountPickerView countPickerV;

    @NotNull
    private final ProductFavoriteMoleculeButtonView favBtn;

    @NotNull
    private final IconButtonV3View moveButton;

    @NotNull
    private final IconButtonV3View removeButton;
    public static final int $stable = 8;
    private static final int DP_8 = UiExtKt.toPx(8);
    private static final int DP_12 = UiExtKt.toPx(12);
    private static final int DP_16 = UiExtKt.toPx(16);
    private static final int DP_32 = UiExtKt.toPx(32);

    public /* synthetic */ CartSplitControlsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void ensureNormalLayout() {
        CartCountPickerView cartCountPickerView = this.countPickerV;
        ViewGroup.LayoutParams layoutParams = cartCountPickerView.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null || bVar.f41658v == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = cartCountPickerView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f41658v = 0;
        bVar2.f41657u = -1;
        bVar2.f41598E = 0.0f;
        int i11 = DP_8;
        int i12 = DP_12;
        bVar2.setMargins(i11, i12, DP_16, i12);
        cartCountPickerView.setLayoutParams(bVar2);
        cartCountPickerView.getInputEt().setMaxWidth(Integer.MAX_VALUE);
    }

    @NotNull
    public final CartCountPickerView getCountPickerV() {
        return this.countPickerV;
    }

    @NotNull
    public final ProductFavoriteMoleculeButtonView getFavBtn() {
        return this.favBtn;
    }

    @NotNull
    public final IconButtonV3View getMoveButton() {
        return this.moveButton;
    }

    @NotNull
    public final IconButtonV3View getRemoveButton() {
        return this.removeButton;
    }

    public final void updateQuantityLPForSmallScreen(ControlsVO controlsVO) {
        if (getResources().getConfiguration().screenWidthDp > 336) {
            ensureNormalLayout();
            return;
        }
        boolean z11 = ((controlsVO != null ? controlsVO.getMoveButton() : null) == null || controlsVO.getBuyInOneClick() == null) ? false : true;
        CartCountPickerView cartCountPickerView = this.countPickerV;
        ViewGroup.LayoutParams layoutParams = cartCountPickerView.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null) {
            return;
        }
        if (!z11) {
            ensureNormalLayout();
            return;
        }
        if (bVar.f41657u == R$id.buyOneClickButtonView) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = cartCountPickerView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f41658v = -1;
        bVar2.f41657u = R$id.buyOneClickButtonView;
        bVar2.f41598E = 0.5f;
        int i11 = DP_12;
        bVar2.setMargins(0, i11, 0, i11);
        cartCountPickerView.setLayoutParams(bVar2);
        cartCountPickerView.getInputEt().setMaxWidth(DP_32);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartSplitControlsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(R$id.moveButton);
        int i12 = DP_32;
        ConstraintLayout.b bVar = new ConstraintLayout.b(i12, i12);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        int i13 = DP_16;
        int i14 = DP_12;
        bVar.setMargins(i13, i14, 0, 0);
        iconButtonV3View.setLayoutParams(bVar);
        int i15 = DP_8;
        iconButtonV3View.setPadding(i15, i15, i15, i15);
        iconButtonV3View.setVisibility(8);
        addView(iconButtonV3View);
        this.moveButton = iconButtonV3View;
        q qVar = q.f64554a;
        View i16 = qVar.i(N.b(ProductFavoriteMoleculeButtonView.class), context);
        i16 = i16 == null ? new ProductFavoriteMoleculeButtonView(context, null, 0, 6, null) : i16;
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = (ProductFavoriteMoleculeButtonView) i16;
        productFavoriteMoleculeButtonView.setId(R$id.favBtn);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, i12);
        bVar2.f41655s = iconButtonV3View.getId();
        bVar2.f41636i = 0;
        bVar2.setMargins(i15, i14, 0, 0);
        bVar2.f41659w = i13;
        productFavoriteMoleculeButtonView.setLayoutParams(bVar2);
        addView(i16);
        this.favBtn = productFavoriteMoleculeButtonView;
        View i17 = qVar.i(N.b(IconButtonV3View.class), context);
        i17 = i17 == null ? new IconButtonV3View(context, null, 0, 0, 14, null) : i17;
        IconButtonV3View iconButtonV3View2 = (IconButtonV3View) i17;
        ConstraintLayout.b c11 = d.c(iconButtonV3View2, R$id.removeButton, i12, i12);
        c11.f41655s = productFavoriteMoleculeButtonView.getId();
        c11.f41636i = 0;
        c11.setMargins(i15, i14, 0, 0);
        iconButtonV3View2.setLayoutParams(c11);
        iconButtonV3View2.setPadding(i15, i15, i15, i15);
        iconButtonV3View2.setVisibility(8);
        addView(i17);
        this.removeButton = iconButtonV3View2;
        View i18 = qVar.i(N.b(CartCountPickerView.class), context);
        i18 = i18 == null ? new CartCountPickerView(context, null, 0, 6, null) : i18;
        CartCountPickerView cartCountPickerView = (CartCountPickerView) i18;
        cartCountPickerView.setId(R$id.countPickerV);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41655s = iconButtonV3View2.getId();
        bVar3.f41658v = 0;
        bVar3.f41636i = 0;
        bVar3.setMargins(i15, i14, i13, i14);
        bVar3.f41598E = 0.0f;
        cartCountPickerView.setLayoutParams(bVar3);
        addView(i18);
        this.countPickerV = cartCountPickerView;
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        ViewExtKt.updatePadding$default(this, 0, 0, 0, i14, 7, null);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }
}
