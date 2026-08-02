package ru.ozon.app.android.geo.map.presentation.mapicons;

import B3.D;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.databinding.ClusterPinIconContainerBinding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.utils.UtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bJ\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/ClusterPinIconView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/geo/map/presentation/mapicons/PinIcon;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/geo/databinding/ClusterPinIconContainerBinding;", "clusterFormBackground", "Landroid/graphics/drawable/ShapeDrawable;", "pinsCountBackground", "Landroid/graphics/drawable/GradientDrawable;", "bind", "", "mapObject", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "onBitmapReadyCallback", "Lru/ozon/app/android/geo/map/presentation/mapicons/OnBitmapReadyCallback;", "getAnchor", "Landroid/graphics/PointF;", "bindAndGetBitmap", "Landroid/graphics/Bitmap;", "count", "getDefaultSize", "pinsCountLength", "getSize", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClusterPinIconView extends FrameLayout implements PinIcon {

    @NotNull
    private final ClusterPinIconContainerBinding binding;

    @NotNull
    private final ShapeDrawable clusterFormBackground;

    @NotNull
    private final GradientDrawable pinsCountBackground;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float SHADOW_DY = UiExtKt.toPxF(2);
    private static final float SHADOW_RADIUS = UiExtKt.toPxF(2);

    @NotNull
    private static final InterfaceC4008j<Integer> DP_46$delegate = k.b(ClusterPinIconView$Companion$DP_46$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j<Integer> DP_50$delegate = k.b(ClusterPinIconView$Companion$DP_50$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j<Integer> DP_54$delegate = k.b(ClusterPinIconView$Companion$DP_54$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j<Integer> DP_58$delegate = k.b(ClusterPinIconView$Companion$DP_58$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j<Integer> SIZE_FOR_PIN_LENGTH_1_NEW_FONT$delegate = k.b(ClusterPinIconView$Companion$SIZE_FOR_PIN_LENGTH_1_NEW_FONT$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j<Integer> SIZE_FOR_PIN_LENGTH_2_NEW_FONT$delegate = k.b(ClusterPinIconView$Companion$SIZE_FOR_PIN_LENGTH_2_NEW_FONT$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j<Integer> SIZE_FOR_PIN_LENGTH_3_NEW_FONT$delegate = k.b(ClusterPinIconView$Companion$SIZE_FOR_PIN_LENGTH_3_NEW_FONT$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j<Integer> SIZE_FOR_PIN_LENGTH_4_NEW_FONT$delegate = k.b(ClusterPinIconView$Companion$SIZE_FOR_PIN_LENGTH_4_NEW_FONT$2.INSTANCE);

    @NotNull
    private static final PointF ANCHOR = new PointF(0.5f, 0.5f);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0018\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001b\u0010\u001b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001b\u0010\u001e\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0014\u0010 \u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/mapicons/ClusterPinIconView$Companion;", "", "<init>", "()V", "", "DP_46$delegate", "LSc/j;", "getDP_46", "()I", "DP_46", "DP_50$delegate", "getDP_50", "DP_50", "DP_54$delegate", "getDP_54", "DP_54", "DP_58$delegate", "getDP_58", "DP_58", "SIZE_FOR_PIN_LENGTH_1_NEW_FONT$delegate", "getSIZE_FOR_PIN_LENGTH_1_NEW_FONT", "SIZE_FOR_PIN_LENGTH_1_NEW_FONT", "SIZE_FOR_PIN_LENGTH_2_NEW_FONT$delegate", "getSIZE_FOR_PIN_LENGTH_2_NEW_FONT", "SIZE_FOR_PIN_LENGTH_2_NEW_FONT", "SIZE_FOR_PIN_LENGTH_3_NEW_FONT$delegate", "getSIZE_FOR_PIN_LENGTH_3_NEW_FONT", "SIZE_FOR_PIN_LENGTH_3_NEW_FONT", "SIZE_FOR_PIN_LENGTH_4_NEW_FONT$delegate", "getSIZE_FOR_PIN_LENGTH_4_NEW_FONT", "SIZE_FOR_PIN_LENGTH_4_NEW_FONT", "", "SHADOW_DX", "F", "MAX_PINS_COUNT", "I", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_46() {
            return ((Number) ClusterPinIconView.DP_46$delegate.getValue()).intValue();
        }

        public final int getDP_50() {
            return ((Number) ClusterPinIconView.DP_50$delegate.getValue()).intValue();
        }

        public final int getDP_54() {
            return ((Number) ClusterPinIconView.DP_54$delegate.getValue()).intValue();
        }

        public final int getDP_58() {
            return ((Number) ClusterPinIconView.DP_58$delegate.getValue()).intValue();
        }

        public final int getSIZE_FOR_PIN_LENGTH_1_NEW_FONT() {
            return ((Number) ClusterPinIconView.SIZE_FOR_PIN_LENGTH_1_NEW_FONT$delegate.getValue()).intValue();
        }

        public final int getSIZE_FOR_PIN_LENGTH_2_NEW_FONT() {
            return ((Number) ClusterPinIconView.SIZE_FOR_PIN_LENGTH_2_NEW_FONT$delegate.getValue()).intValue();
        }

        public final int getSIZE_FOR_PIN_LENGTH_3_NEW_FONT() {
            return ((Number) ClusterPinIconView.SIZE_FOR_PIN_LENGTH_3_NEW_FONT$delegate.getValue()).intValue();
        }

        public final int getSIZE_FOR_PIN_LENGTH_4_NEW_FONT() {
            return ((Number) ClusterPinIconView.SIZE_FOR_PIN_LENGTH_4_NEW_FONT$delegate.getValue()).intValue();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClusterPinIconView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final int getDefaultSize(int pinsCountLength) {
        return pinsCountLength != 1 ? pinsCountLength != 2 ? pinsCountLength != 3 ? Companion.getDP_58() : Companion.getDP_54() : Companion.getDP_50() : Companion.getDP_46();
    }

    private final int getSize(int pinsCountLength) {
        return pinsCountLength != 1 ? pinsCountLength != 2 ? pinsCountLength != 3 ? Companion.getSIZE_FOR_PIN_LENGTH_4_NEW_FONT() : Companion.getSIZE_FOR_PIN_LENGTH_3_NEW_FONT() : Companion.getSIZE_FOR_PIN_LENGTH_2_NEW_FONT() : Companion.getSIZE_FOR_PIN_LENGTH_1_NEW_FONT();
    }

    @Override // ru.ozon.app.android.geo.map.presentation.mapicons.PinIcon
    public void bind(@NotNull AddressEditMapVO.MapObject mapObject, OnBitmapReadyCallback onBitmapReadyCallback) {
        Intrinsics.checkNotNullParameter(mapObject, "mapObject");
        String pinsCount = mapObject.getPinsCount();
        if (pinsCount == null) {
            return;
        }
        int size = getSize(pinsCount.length());
        FrameLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = size;
        layoutParams2.height = size;
        root.setLayoutParams(layoutParams2);
        this.binding.pinsCount.setText(pinsCount);
        String pinsCountColor = mapObject.getPinsCountColor();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(context, pinsCountColor);
        if (parseColor != null) {
            this.binding.pinsCount.setTextColor(parseColor.intValue());
        }
        String tintColor = mapObject.getTintColor();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, tintColor);
        if (parseColor2 != null) {
            this.pinsCountBackground.setTint(parseColor2.intValue());
        }
        String borderColor = mapObject.getBorderColor();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor3 = styleParser.parseColor(context3, borderColor);
        if (parseColor3 != null) {
            this.clusterFormBackground.getPaint().setColor(parseColor3.intValue());
        }
        if (onBitmapReadyCallback != null) {
            View rootView = getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
            onBitmapReadyCallback.onBitmapReady(UtilsKt.getBitmap(rootView));
        }
    }

    @NotNull
    public final Bitmap bindAndGetBitmap(int count) {
        String valueOf = count > 9999 ? "9999+" : String.valueOf(count);
        this.binding.pinsCount.setText(valueOf);
        int defaultSize = getDefaultSize(valueOf.length());
        FrameLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = defaultSize;
        layoutParams2.height = defaultSize;
        root.setLayoutParams(layoutParams2);
        View rootView = getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        return UtilsKt.getBitmap(rootView);
    }

    @Override // ru.ozon.app.android.geo.map.presentation.mapicons.PinIcon
    @NotNull
    public PointF getAnchor() {
        return ANCHOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClusterPinIconView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ClusterPinIconContainerBinding inflate = ClusterPinIconContainerBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(context.getColor(R$color.bg_light_key));
        shapeDrawable.getPaint().setShadowLayer(SHADOW_DY, 0.0f, SHADOW_RADIUS, -3355444);
        this.clusterFormBackground = shapeDrawable;
        GradientDrawable b11 = D.b(1);
        b11.setColor(context.getColor(R$color.bg_action_primary));
        this.pinsCountBackground = b11;
        inflate.clusterForm.setBackground(shapeDrawable);
        inflate.pinsCount.setBackground(b11);
    }
}
