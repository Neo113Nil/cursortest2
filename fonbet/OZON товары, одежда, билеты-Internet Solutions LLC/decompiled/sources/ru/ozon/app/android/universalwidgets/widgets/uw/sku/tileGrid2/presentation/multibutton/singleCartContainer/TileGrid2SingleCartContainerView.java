package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartContainer;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.button.ButtonOverlayView;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/singleCartContainer/TileGrid2SingleCartContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "", "accesibilityTileID", "Ljava/lang/String;", "getAccesibilityTileID", "()Ljava/lang/String;", "setAccesibilityTileID", "(Ljava/lang/String;)V", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView;", "addToCartContainerView", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView;", "getAddToCartContainerView", "()Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView;", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/button/ButtonOverlayView;", "overlayView", "LSc/j;", "getOverlayView", "()LSc/j;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2SingleCartContainerView extends FrameLayout {
    private String accesibilityTileID;

    @NotNull
    private final AddToCartContainerView addToCartContainerView;

    @NotNull
    private final InterfaceC4008j<ButtonOverlayView> overlayView;

    public /* synthetic */ TileGrid2SingleCartContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final AddToCartContainerView getAddToCartContainerView() {
        return this.addToCartContainerView;
    }

    @NotNull
    public final InterfaceC4008j<ButtonOverlayView> getOverlayView() {
        return this.overlayView;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (info != null) {
            info.setText(this.accesibilityTileID);
        }
    }

    public final void setAccesibilityTileID(String str) {
        this.accesibilityTileID = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2SingleCartContainerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AddToCartContainerView addToCartContainerView = new AddToCartContainerView(context, null, 0, 6, null);
        addToCartContainerView.setId(R$id.firstButton);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        layoutParams.leftMargin = tileGrid2Constants.getContainerPadding();
        layoutParams.rightMargin = tileGrid2Constants.getContainerPadding();
        layoutParams.bottomMargin = tileGrid2Constants.getContainerPadding();
        addToCartContainerView.setLayoutParams(layoutParams);
        this.addToCartContainerView = addToCartContainerView;
        this.overlayView = LazyUtilsKt.unsafeLazy(new TileGrid2SingleCartContainerView$overlayView$1(context, this));
        addView(addToCartContainerView);
        setTag(ru.ozon.app.android.composer.R$id.skip_composer_default_widget_background, Unit.f71690a);
    }
}
