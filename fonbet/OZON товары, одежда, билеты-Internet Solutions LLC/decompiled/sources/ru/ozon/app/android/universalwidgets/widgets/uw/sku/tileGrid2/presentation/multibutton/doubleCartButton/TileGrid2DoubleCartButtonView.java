package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.doubleCartButton;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.button.ButtonOverlayView;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/doubleCartButton/TileGrid2DoubleCartButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "", "accesibilityTileID", "Ljava/lang/String;", "getAccesibilityTileID", "()Ljava/lang/String;", "setAccesibilityTileID", "(Ljava/lang/String;)V", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "firstButton", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "getFirstButton", "()Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "secondButton", "getSecondButton", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/button/ButtonOverlayView;", "overlayViewLazy", "LSc/j;", "getOverlayViewLazy", "()LSc/j;", "", "containerHeight", "I", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2DoubleCartButtonView extends ConstraintLayout {
    private String accesibilityTileID;
    private final int containerHeight;

    @NotNull
    private final AddToCartButtonView firstButton;

    @NotNull
    private final InterfaceC4008j<ButtonOverlayView> overlayViewLazy;

    @NotNull
    private final AddToCartButtonView secondButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2DoubleCartButtonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AddToCartButtonView addToCartButtonView = new AddToCartButtonView(context, null, 0, 6, null);
        addToCartButtonView.setId(R$id.firstButton);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        bVar.setMarginStart(tileGrid2Constants.getContainerPadding());
        bVar.setMarginEnd(tileGrid2Constants.getContainerPadding());
        addToCartButtonView.setLayoutParams(bVar);
        this.firstButton = addToCartButtonView;
        AddToCartButtonView addToCartButtonView2 = new AddToCartButtonView(context, null, 0, 6, null);
        addToCartButtonView2.setId(R$id.secondButton);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41638j = addToCartButtonView.getId();
        bVar2.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = tileGrid2Constants.getBUTTON_MARGIN();
        bVar2.setMarginStart(tileGrid2Constants.getContainerPadding());
        bVar2.setMarginEnd(tileGrid2Constants.getContainerPadding());
        addToCartButtonView2.setLayoutParams(bVar2);
        this.secondButton = addToCartButtonView2;
        this.overlayViewLazy = LazyUtilsKt.unsafeLazy(new TileGrid2DoubleCartButtonView$overlayViewLazy$1(context, this));
        int containerPadding = tileGrid2Constants.getContainerPadding() + (addToCartButtonView.getButtonHeight() * 2);
        this.containerHeight = containerPadding;
        setId(R$id.cartButtonsRoot);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, containerPadding);
        marginLayoutParams.topMargin = -containerPadding;
        setLayoutParams(marginLayoutParams);
        addView(addToCartButtonView);
        addView(addToCartButtonView2);
        setTag(ru.ozon.app.android.composer.R$id.skip_composer_default_widget_background, Unit.f71690a);
    }

    @NotNull
    public final AddToCartButtonView getFirstButton() {
        return this.firstButton;
    }

    @NotNull
    public final InterfaceC4008j<ButtonOverlayView> getOverlayViewLazy() {
        return this.overlayViewLazy;
    }

    @NotNull
    public final AddToCartButtonView getSecondButton() {
        return this.secondButton;
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
}
