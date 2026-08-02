package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayView;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundedOutlineProvider;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/button/ButtonOverlayView;", "Landroid/view/View;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "roundedOutlineProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundedOutlineProvider;", "overlayAlpha", "", "Ljava/lang/Float;", "overlayAnimation", "Landroid/view/ViewPropertyAnimator;", "bind", "", "overlayItem", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "roundMode", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "topOffset", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;Ljava/lang/Integer;)V", "setVisible", "visible", "", "setVisibleAnimated", "onDetachedFromWindow", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ButtonOverlayView extends View implements TileOverlayView {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int cornerRadius = ResourceExtKt.toPx(16);
    private Float overlayAlpha;
    private ViewPropertyAnimator overlayAnimation;

    @NotNull
    private final RoundedOutlineProvider roundedOutlineProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/button/ButtonOverlayView$Companion;", "", "<init>", "()V", "", "LOCATOR", "Ljava/lang/String;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ButtonOverlayView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayView
    public void bind(TileGrid2DTO.OverlayItem overlayItem, @NotNull RoundMode roundMode, Integer topOffset) {
        Intrinsics.checkNotNullParameter(roundMode, "roundMode");
        if (overlayItem == null) {
            setVisibility(8);
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, overlayItem.getBackgroundColor());
        if (mapColor != null) {
            int intValue = mapColor.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setBackgroundColor(ResourceExtKt.color(context2, intValue));
        }
        this.overlayAlpha = overlayItem.getAlpha();
        Float alpha = overlayItem.getAlpha();
        setAlpha(alpha != null ? alpha.floatValue() : 1.0f);
        this.roundedOutlineProvider.setRoundMode(roundMode);
        setVisibility(0);
    }

    public ViewPropertyAnimator fadeIn(@NotNull View view, long j11, float f7) {
        return TileOverlayView.DefaultImpls.fadeIn(this, view, j11, f7);
    }

    public ViewPropertyAnimator fadeOut(@NotNull View view, long j11) {
        return TileOverlayView.DefaultImpls.fadeOut(this, view, j11);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.overlayAnimation;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayView
    public void setVisible(boolean visible) {
        setVisibility(visible ? 0 : 8);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayView
    public void setVisibleAnimated(boolean visible) {
        ViewPropertyAnimator fadeOut;
        if (visible) {
            Float f7 = this.overlayAlpha;
            fadeOut = fadeIn(this, 300L, f7 != null ? f7.floatValue() : 1.0f);
        } else {
            fadeOut = fadeOut(this, 300L);
        }
        this.overlayAnimation = fadeOut;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonOverlayView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        RoundedOutlineProvider roundedOutlineProvider = new RoundedOutlineProvider(cornerRadius, false);
        this.roundedOutlineProvider = roundedOutlineProvider;
        setId(View.generateViewId());
        setVisibility(0);
        setOutlineProvider(roundedOutlineProvider);
        setClipToOutline(true);
        setContentDescription("TileGrid2ButtonOverlay");
        setFocusable(true);
        setClickable(true);
    }
}
