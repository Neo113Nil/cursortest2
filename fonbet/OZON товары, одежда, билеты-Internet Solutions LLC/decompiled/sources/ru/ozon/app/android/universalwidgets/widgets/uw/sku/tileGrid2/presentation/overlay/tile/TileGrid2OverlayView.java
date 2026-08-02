package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.tile;

import Bi.b;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.ConstraintLayoutExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundMode;
import ru.ozon.app.android.universalwidgets.widgets.uw.utils.RoundedOutlineProvider;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u0018H\u0014R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/tile/TileGrid2OverlayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/TileOverlayView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iconId", "descriptionId", "iconIv", "Landroidx/appcompat/widget/AppCompatImageView;", "descriptionTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "roundedOutlineProvider", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundedOutlineProvider;", "overlayAnimation", "Landroid/view/ViewPropertyAnimator;", "overlayItem", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "bind", "", "roundMode", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "topOffset", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;Ljava/lang/Integer;)V", "setVisible", "visible", "", "setVisibleAnimated", "onDetachedFromWindow", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2OverlayView extends ConstraintLayout implements TileOverlayView {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int cornerRadius = ResourceExtKt.toPx(16);
    private final int descriptionId;

    @NotNull
    private final TextAtomV2View descriptionTv;
    private final int iconId;

    @NotNull
    private final AppCompatImageView iconIv;
    private ViewPropertyAnimator overlayAnimation;
    private TileGrid2DTO.OverlayItem overlayItem;

    @NotNull
    private final RoundedOutlineProvider roundedOutlineProvider;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/overlay/tile/TileGrid2OverlayView$Companion;", "", "<init>", "()V", "", "LOCATOR", "Ljava/lang/String;", "", "OVERLAY_ELEVATION", "F", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TileGrid2OverlayView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.overlay.TileOverlayView
    public void bind(TileGrid2DTO.OverlayItem overlayItem, @NotNull RoundMode roundMode, Integer topOffset) {
        Intrinsics.checkNotNullParameter(roundMode, "roundMode");
        this.overlayItem = overlayItem;
        if (overlayItem == null) {
            setVisibility(8);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CommonAtomIconDTO icon = overlayItem.getIcon();
        Integer iconResByToken = TokensExtKt.getIconResByToken(context, icon != null ? icon.getIcon() : null);
        if (iconResByToken != null) {
            this.iconIv.setImageResource(iconResByToken.intValue());
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CommonAtomIconDTO icon2 = overlayItem.getIcon();
        Integer mapColor = styleParser.mapColor(context2, icon2 != null ? icon2.getTintColor() : null);
        if (mapColor != null) {
            int intValue = mapColor.intValue();
            AppCompatImageView appCompatImageView = this.iconIv;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            appCompatImageView.setColorFilter(ResourceExtKt.color(context3, intValue), PorterDuff.Mode.SRC_IN);
        }
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        Integer mapColor2 = styleParser.mapColor(context4, overlayItem.getBackgroundColor());
        if (mapColor2 != null) {
            int intValue2 = mapColor2.intValue();
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            setBackgroundColor(ResourceExtKt.color(context5, intValue2));
        }
        TextHolderKt.bindOrGone$default(this.descriptionTv, overlayItem.getText(), null, 2, null);
        Float alpha = overlayItem.getAlpha();
        setAlpha(alpha != null ? alpha.floatValue() : 1.0f);
        this.roundedOutlineProvider.setRoundMode(roundMode);
        if (topOffset != null) {
            ViewExtKt.updatePadding$default(this, 0, topOffset.intValue(), 0, 0, 13, null);
        }
        setVisibility(0);
    }

    public ViewPropertyAnimator fadeIn(@NotNull View view, long j11, float f7) {
        return TileOverlayView.DefaultImpls.fadeIn(this, view, j11, f7);
    }

    public ViewPropertyAnimator fadeOut(@NotNull View view, long j11) {
        return TileOverlayView.DefaultImpls.fadeOut(this, view, j11);
    }

    @Override // android.view.ViewGroup, android.view.View
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
        Float alpha;
        if (visible) {
            TileGrid2DTO.OverlayItem overlayItem = this.overlayItem;
            fadeOut = fadeIn(this, 300L, (overlayItem == null || (alpha = overlayItem.getAlpha()) == null) ? 1.0f : alpha.floatValue());
        } else {
            fadeOut = fadeOut(this, 300L);
        }
        this.overlayAnimation = fadeOut;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2OverlayView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int generateViewId = View.generateViewId();
        this.iconId = generateViewId;
        int generateViewId2 = View.generateViewId();
        this.descriptionId = generateViewId2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(generateViewId);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41640k = generateViewId2;
        appCompatImageView.setLayoutParams(bVar);
        addView(appCompatImageView);
        this.iconIv = appCompatImageView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, generateViewId2, -2, -2);
        d11.f41656t = 0;
        d11.f41658v = 0;
        d11.f41638j = generateViewId;
        d11.f41642l = 0;
        textAtomV2View.setLayoutParams(d11);
        addView(textAtomV2View);
        this.descriptionTv = textAtomV2View;
        RoundedOutlineProvider roundedOutlineProvider = new RoundedOutlineProvider(cornerRadius, false);
        this.roundedOutlineProvider = roundedOutlineProvider;
        setBackgroundColor(-1);
        ConstraintLayoutExtKt.createVerticalChain$default(this, 0, 0, new View[]{appCompatImageView, textAtomV2View}, null, 11, null);
        setOutlineProvider(roundedOutlineProvider);
        setZ(10.0f);
        setClipToOutline(true);
        setEnabled(false);
        setContentDescription("TileGrid2Overlay");
        setFocusable(true);
        setClickable(true);
    }
}
