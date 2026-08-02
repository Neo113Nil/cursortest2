package ru.ozon.app.android.ads.presentation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import ed.InterfaceC6346b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.Q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 .2\u00020\u0001:\u0003./0B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u00162\b\b\u0001\u0010 \u001a\u00020\fJ\u0015\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lru/ozon/app/android/ads/presentation/CustomRoundViewCornersDelegate;", "", "context", "Landroid/content/Context;", "defaultTopRightRadius", "", "defaultTopLeftRadius", "defaultBottomRightRadius", "defaultBottomLeftRadius", "<init>", "(Landroid/content/Context;FFFF)V", "defaultCornerColor", "", "corners", "", "roundedCornersPath", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "backgroundRectF", "Landroid/graphics/RectF;", "init", "", "view", "Landroid/view/View;", "setupBackgroundRect", "width", "height", "drawRoundCorners", "canvas", "Landroid/graphics/Canvas;", "setCornerColor", "cornerColor", "setCornerRadius", "Lru/ozon/app/android/ads/presentation/CustomRoundViewCornersDelegate$RadiusChanged;", "cornerRadius", "Lru/ozon/app/android/ads/presentation/CustomRoundViewCornersDelegate$CornerRadius;", "setCornerRadius-wt40F6U", "(Lru/ozon/app/android/ads/presentation/CustomRoundViewCornersDelegate$CornerRadius;)Z", "isRadiusEquals", "", "newRadius", "indexes", "Lkotlin/ranges/IntRange;", "setRadiusByIndex", "radius", "Companion", "CornerRadius", "RadiusChanged", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomRoundViewCornersDelegate {

    @NotNull
    private final RectF backgroundRectF;

    @NotNull
    private final float[] corners;
    private final float defaultBottomLeftRadius;
    private final float defaultBottomRightRadius;
    private int defaultCornerColor;
    private final float defaultTopLeftRadius;
    private final float defaultTopRightRadius;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path roundedCornersPath;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final IntRange topLeftRadiusCornersArrayIndexes = new IntRange(0, 1, 1);

    @NotNull
    private static final IntRange topRightRadiusCornersArrayIndexes = new IntRange(2, 3, 1);

    @NotNull
    private static final IntRange bottomRightRadiusCornersArrayIndexes = new IntRange(4, 5, 1);

    @NotNull
    private static final IntRange bottomLeftRadiusCornersArrayIndexes = new IntRange(6, 7, 1);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ads/presentation/CustomRoundViewCornersDelegate$Companion;", "", "<init>", "()V", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ads/presentation/CustomRoundViewCornersDelegate$RadiusChanged;", "", "", "isChanged", "constructor-impl", "(Z)Z", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RadiusChanged {
        /* renamed from: constructor-impl, reason: not valid java name */
        public static boolean m485constructorimpl(boolean z11) {
            return z11;
        }
    }

    public CustomRoundViewCornersDelegate(@NotNull Context context, float f7, float f11, float f12, float f13) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultTopRightRadius = f7;
        this.defaultTopLeftRadius = f11;
        this.defaultBottomRightRadius = f12;
        this.defaultBottomLeftRadius = f13;
        this.defaultCornerColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.corners = new float[]{f11, f11, f7, f7, f12, f12, f13, f13};
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        this.roundedCornersPath = path;
        Paint paint = new Paint(1);
        paint.setColor(this.defaultCornerColor);
        this.paint = paint;
        this.backgroundRectF = new RectF();
    }

    private final boolean isRadiusEquals(float newRadius, IntRange indexes) {
        float[] fArr = this.corners;
        int f71842a = indexes.getF71842a();
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return !Intrinsics.b((f71842a < 0 || f71842a >= fArr.length) ? null : Float.valueOf(fArr[f71842a]), newRadius);
    }

    private final void setRadiusByIndex(IntRange indexes, float radius) {
        Iterator<Integer> it = indexes.iterator();
        while (it.hasNext()) {
            this.corners[((Q) it).b()] = radius;
        }
    }

    public final void drawRoundCorners(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.roundedCornersPath.reset();
        this.roundedCornersPath.addRoundRect(this.backgroundRectF, this.corners, Path.Direction.CW);
        canvas.drawPath(this.roundedCornersPath, this.paint);
    }

    public final void init(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLayerType(1, null);
    }

    public final void setCornerColor(int cornerColor) {
        this.paint.setColor(cornerColor);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: setCornerRadius-wt40F6U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m484setCornerRadiuswt40F6U(@NotNull CornerRadius cornerRadius) {
        boolean z11;
        Float topRightRadius;
        Float bottomLeftRadius;
        Float bottomRightRadius;
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Float topLeftRadius = cornerRadius.getTopLeftRadius();
        boolean z12 = true;
        if (topLeftRadius != null) {
            float floatValue = topLeftRadius.floatValue();
            IntRange intRange = topLeftRadiusCornersArrayIndexes;
            if (isRadiusEquals(floatValue, intRange)) {
                setRadiusByIndex(intRange, topLeftRadius.floatValue());
                z11 = true;
                topRightRadius = cornerRadius.getTopRightRadius();
                if (topRightRadius != null) {
                    float floatValue2 = topRightRadius.floatValue();
                    IntRange intRange2 = topRightRadiusCornersArrayIndexes;
                    if (isRadiusEquals(floatValue2, intRange2)) {
                        setRadiusByIndex(intRange2, topRightRadius.floatValue());
                        z11 = true;
                    }
                }
                bottomLeftRadius = cornerRadius.getBottomLeftRadius();
                if (bottomLeftRadius != null) {
                    float floatValue3 = bottomLeftRadius.floatValue();
                    IntRange intRange3 = bottomLeftRadiusCornersArrayIndexes;
                    if (isRadiusEquals(floatValue3, intRange3)) {
                        setRadiusByIndex(intRange3, bottomLeftRadius.floatValue());
                        z11 = true;
                    }
                }
                bottomRightRadius = cornerRadius.getBottomRightRadius();
                if (bottomRightRadius != null) {
                    float floatValue4 = bottomRightRadius.floatValue();
                    IntRange intRange4 = bottomRightRadiusCornersArrayIndexes;
                    if (isRadiusEquals(floatValue4, intRange4)) {
                        setRadiusByIndex(intRange4, bottomRightRadius.floatValue());
                        return RadiusChanged.m485constructorimpl(z12);
                    }
                }
                z12 = z11;
                return RadiusChanged.m485constructorimpl(z12);
            }
        }
        z11 = false;
        topRightRadius = cornerRadius.getTopRightRadius();
        if (topRightRadius != null) {
        }
        bottomLeftRadius = cornerRadius.getBottomLeftRadius();
        if (bottomLeftRadius != null) {
        }
        bottomRightRadius = cornerRadius.getBottomRightRadius();
        if (bottomRightRadius != null) {
        }
        z12 = z11;
        return RadiusChanged.m485constructorimpl(z12);
    }

    public final void setupBackgroundRect(int width, int height) {
        this.backgroundRectF.set(0.0f, 0.0f, width, height);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ads/presentation/CustomRoundViewCornersDelegate$CornerRadius;", "", "topRightRadius", "", "topLeftRadius", "bottomRightRadius", "bottomLeftRadius", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "topRadius", "bottomRadius", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getTopRightRadius", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTopLeftRadius", "getBottomRightRadius", "getBottomLeftRadius", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CornerRadius {
        private final Float bottomLeftRadius;
        private final Float bottomRightRadius;
        private final Float topLeftRadius;
        private final Float topRightRadius;

        public CornerRadius(Float f7, Float f11, Float f12, Float f13) {
            this.topRightRadius = f7;
            this.topLeftRadius = f11;
            this.bottomRightRadius = f12;
            this.bottomLeftRadius = f13;
        }

        public final Float getBottomLeftRadius() {
            return this.bottomLeftRadius;
        }

        public final Float getBottomRightRadius() {
            return this.bottomRightRadius;
        }

        public final Float getTopLeftRadius() {
            return this.topLeftRadius;
        }

        public final Float getTopRightRadius() {
            return this.topRightRadius;
        }

        public CornerRadius(Float f7, Float f11) {
            this(f7, f7, f11, f11);
        }
    }
}
