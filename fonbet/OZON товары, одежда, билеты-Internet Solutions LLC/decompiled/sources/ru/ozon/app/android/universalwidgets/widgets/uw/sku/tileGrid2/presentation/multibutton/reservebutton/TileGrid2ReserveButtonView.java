package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.reservebutton;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.button.ButtonOverlayView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/reservebutton/TileGrid2ReserveButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "", "accesibilityTileID", "Ljava/lang/String;", "getAccesibilityTileID", "()Ljava/lang/String;", "setAccesibilityTileID", "(Ljava/lang/String;)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "reserveButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getReserveButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/button/ButtonOverlayView;", "overlayView", "LSc/j;", "getOverlayView", "()LSc/j;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2ReserveButtonView extends FrameLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private String accesibilityTileID;

    @NotNull
    private final InterfaceC4008j<ButtonOverlayView> overlayView;

    @NotNull
    private final ButtonV3View reserveButton;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/reservebutton/TileGrid2ReserveButtonView$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/reservebutton/TileGrid2ReserveButtonView;", "context", "Landroid/content/Context;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TileGrid2ReserveButtonView create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            TileGrid2ReserveButtonView tileGrid2ReserveButtonView = new TileGrid2ReserveButtonView(context, null);
            tileGrid2ReserveButtonView.setId(View.generateViewId());
            tileGrid2ReserveButtonView.setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
            marginLayoutParams.topMargin = -(tileGrid2Constants.getRSV_BTN_MARGIN_BOTTOM() + tileGrid2Constants.getRSV_BTN_HEIGHT());
            marginLayoutParams.bottomMargin = tileGrid2Constants.getRSV_BTN_MARGIN_BOTTOM();
            tileGrid2ReserveButtonView.setLayoutParams(marginLayoutParams);
            return tileGrid2ReserveButtonView;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TileGrid2ReserveButtonView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @NotNull
    public final InterfaceC4008j<ButtonOverlayView> getOverlayView() {
        return this.overlayView;
    }

    @NotNull
    public final ButtonV3View getReserveButton() {
        return this.reserveButton;
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

    private TileGrid2ReserveButtonView(Context context) {
        super(context);
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        layoutParams.setMarginStart(tileGrid2Constants.getRSV_BTN_MARGIN_HORIZONTAL());
        layoutParams.setMarginEnd(tileGrid2Constants.getRSV_BTN_MARGIN_HORIZONTAL());
        buttonV3View.setLayoutParams(layoutParams);
        this.reserveButton = buttonV3View;
        this.overlayView = LazyUtilsKt.unsafeLazy(new TileGrid2ReserveButtonView$overlayView$1(context, this));
        addView(buttonV3View);
    }
}
