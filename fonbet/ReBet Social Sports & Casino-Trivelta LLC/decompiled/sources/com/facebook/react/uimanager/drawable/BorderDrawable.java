package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.Spacing;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BorderColors;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.ColorEdges;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.twilio.voice.EventKeys;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u0002H\u001b0\u0019\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u0002H\u001bH\u0002¢\u0006\u0002\u0010\u001dJ\b\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020KH\u0014J\u0010\u0010L\u001a\u00020H2\u0006\u0010M\u001a\u00020-H\u0016J\u0012\u0010N\u001a\u00020H2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020-H\u0017J\u0010\u0010R\u001a\u00020H2\u0006\u0010S\u001a\u00020TH\u0016J\u0018\u0010U\u001a\u00020/2\u0006\u0010V\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020/H\u0002J\u0016\u0010W\u001a\u00020H2\u0006\u0010X\u001a\u00020-2\u0006\u0010Y\u001a\u00020/J\u0018\u0010\u0012\u001a\u00020H2\u0006\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010]J\u0010\u0010!\u001a\u00020H2\b\u0010^\u001a\u0004\u0018\u00010_J\u001d\u0010`\u001a\u00020H2\u0006\u0010X\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010-¢\u0006\u0002\u0010cJ\u000e\u0010d\u001a\u00020-2\u0006\u0010X\u001a\u00020aJ\u0010\u0010e\u001a\u00020H2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010f\u001a\u00020H2\u0006\u0010S\u001a\u00020TH\u0002JH\u0010g\u001a\u00020-2\u0006\u0010h\u001a\u00020-2\u0006\u0010i\u001a\u00020-2\u0006\u0010j\u001a\u00020-2\u0006\u0010k\u001a\u00020-2\u0006\u0010l\u001a\u00020-2\u0006\u0010m\u001a\u00020-2\u0006\u0010n\u001a\u00020-2\u0006\u0010o\u001a\u00020-H\u0002JX\u0010p\u001a\u00020H2\u0006\u0010S\u001a\u00020T2\u0006\u0010q\u001a\u00020-2\u0006\u0010r\u001a\u00020/2\u0006\u0010s\u001a\u00020/2\u0006\u0010t\u001a\u00020/2\u0006\u0010u\u001a\u00020/2\u0006\u0010v\u001a\u00020/2\u0006\u0010w\u001a\u00020/2\u0006\u0010x\u001a\u00020/2\u0006\u0010y\u001a\u00020/H\u0002J\b\u0010z\u001a\u00020DH\u0002J\b\u0010{\u001a\u00020/H\u0002J\b\u0010|\u001a\u00020HH\u0002J\u0010\u0010|\u001a\u00020H2\u0006\u0010\u0004\u001a\u00020-H\u0002J\u001a\u0010}\u001a\u0004\u0018\u00010~2\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020/H\u0002Ja\u0010\u007f\u001a\u00020H2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\b\u0010\u0083\u0001\u001a\u00030\u0081\u00012\b\u0010\u0084\u0001\u001a\u00030\u0081\u00012\b\u0010\u0085\u0001\u001a\u00030\u0081\u00012\b\u0010\u0086\u0001\u001a\u00030\u0081\u00012\b\u0010\u0087\u0001\u001a\u00030\u0081\u00012\b\u0010\u0088\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0089\u0001\u001a\u00020?H\u0002J\t\u0010\u008a\u0001\u001a\u00020HH\u0002J\u001a\u0010\u008b\u0001\u001a\u00020-2\u0006\u0010b\u001a\u00020-2\u0007\u0010\u008c\u0001\u001a\u00020-H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R/\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0012\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082D¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010;\u001a\u0004\u0018\u0001012\b\u0010:\u001a\u0004\u0018\u000101@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u008d\u0001"}, d2 = {"Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", ViewProps.BORDER_WIDTH, "Lcom/facebook/react/uimanager/Spacing;", ViewProps.BORDER_RADIUS, "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderInsets;", "borderStyle", "Lcom/facebook/react/uimanager/style/BorderStyle;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/Spacing;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;Lcom/facebook/react/uimanager/style/BorderInsets;Lcom/facebook/react/uimanager/style/BorderStyle;)V", "getBorderWidth", "()Lcom/facebook/react/uimanager/Spacing;", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "invalidatingAndPathChange", "Lkotlin/properties/ReadWriteProperty;", "", "T", "initialValue", "(Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "<set-?>", "getBorderStyle", "()Lcom/facebook/react/uimanager/style/BorderStyle;", "setBorderStyle", "(Lcom/facebook/react/uimanager/style/BorderStyle;)V", "borderStyle$delegate", "Lkotlin/properties/ReadWriteProperty;", "borderColors", "Lcom/facebook/react/uimanager/style/BorderColors;", "[Ljava/lang/Integer;", "computedBorderColors", "Lcom/facebook/react/uimanager/style/ColorEdges;", "computedBorderRadius", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "borderAlpha", "", "gapBetweenPaths", "", "pathForBorder", "Landroid/graphics/Path;", "borderPaint", "Landroid/graphics/Paint;", "needUpdatePath", "", "pathForSingleBorder", "pathForOutline", "centerDrawPath", "outerClipPathForBorderRadius", EventKeys.VALUE_KEY, "innerClipPathForBorderRadius", "getInnerClipPathForBorderRadius", "()Landroid/graphics/Path;", "innerBottomLeftCorner", "Landroid/graphics/PointF;", "innerBottomRightCorner", "innerTopLeftCorner", "innerTopRightCorner", "innerClipTempRectForBorderRadius", "Landroid/graphics/RectF;", "outerClipTempRectForBorderRadius", "tempRectForCenterDrawPath", "invalidateSelf", "", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "draw", "canvas", "Landroid/graphics/Canvas;", "getInnerBorderRadius", "computedRadius", "setBorderWidth", ViewProps.POSITION, "width", "property", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "radius", "Lcom/facebook/react/uimanager/LengthPercentage;", "style", "", "setBorderColor", "Lcom/facebook/react/uimanager/style/LogicalEdge;", ViewProps.COLOR, "(Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Integer;)V", "getBorderColor", "drawRectangularBorders", "drawRoundedBorders", "fastBorderCompatibleColorOrZero", "borderLeft", "borderTop", "borderRight", "borderBottom", "colorLeft", "colorTop", "colorRight", "colorBottom", "drawQuadrilateral", "fillColor", "x1", "y1", "x2", "y2", "x3", "y3", "x4", "y4", "computeBorderInsets", "getFullBorderWidth", "updatePathEffect", "getPathEffect", "Landroid/graphics/PathEffect;", "getEllipseIntersectionWithLine", "ellipseBoundsLeft", "", "ellipseBoundsTop", "ellipseBoundsRight", "ellipseBoundsBottom", "lineStartX", "lineStartY", "lineEndX", "lineEndY", "result", "updatePath", "multiplyColorAlpha", "rawAlpha", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBorderDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BorderDrawable.kt\ncom/facebook/react/uimanager/drawable/BorderDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1101:1\n1#2:1102\n*E\n"})
/* loaded from: classes2.dex */
public final class BorderDrawable extends Drawable {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BorderDrawable.class, "borderStyle", "getBorderStyle()Lcom/facebook/react/uimanager/style/BorderStyle;", 0))};
    private int borderAlpha;

    @Nullable
    private Integer[] borderColors;

    @Nullable
    private BorderInsets borderInsets;

    @NotNull
    private final Paint borderPaint;

    @Nullable
    private BorderRadiusStyle borderRadius;

    /* renamed from: borderStyle$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty borderStyle;

    @Nullable
    private final Spacing borderWidth;

    @Nullable
    private Path centerDrawPath;

    @NotNull
    private ColorEdges computedBorderColors;

    @Nullable
    private ComputedBorderRadius computedBorderRadius;

    @NotNull
    private final Context context;
    private final float gapBetweenPaths;

    @Nullable
    private PointF innerBottomLeftCorner;

    @Nullable
    private PointF innerBottomRightCorner;

    @Nullable
    private Path innerClipPathForBorderRadius;

    @Nullable
    private RectF innerClipTempRectForBorderRadius;

    @Nullable
    private PointF innerTopLeftCorner;

    @Nullable
    private PointF innerTopRightCorner;
    private boolean needUpdatePath;

    @Nullable
    private Path outerClipPathForBorderRadius;

    @Nullable
    private RectF outerClipTempRectForBorderRadius;

    @Nullable
    private Path pathForBorder;

    @Nullable
    private Path pathForOutline;

    @Nullable
    private Path pathForSingleBorder;

    @Nullable
    private RectF tempRectForCenterDrawPath;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            try {
                iArr[BorderStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BorderStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BorderStyle.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BorderDrawable(@NotNull Context context, @Nullable Spacing spacing, @Nullable BorderRadiusStyle borderRadiusStyle, @Nullable BorderInsets borderInsets, @Nullable BorderStyle borderStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.borderWidth = spacing;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = borderInsets;
        this.borderStyle = invalidatingAndPathChange(borderStyle);
        this.computedBorderColors = new ColorEdges(0, 0, 0, 0, 15, null);
        this.borderAlpha = 255;
        this.gapBetweenPaths = 0.8f;
        this.borderPaint = new Paint(1);
        this.needUpdatePath = true;
    }

    private final RectF computeBorderInsets() {
        RectF resolve;
        BorderInsets borderInsets = this.borderInsets;
        if (borderInsets == null || (resolve = borderInsets.resolve(getLayoutDirection(), this.context)) == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return new RectF(Float.isNaN(resolve.left) ? 0.0f : PixelUtil.INSTANCE.dpToPx(resolve.left), Float.isNaN(resolve.top) ? 0.0f : PixelUtil.INSTANCE.dpToPx(resolve.top), Float.isNaN(resolve.right) ? 0.0f : PixelUtil.INSTANCE.dpToPx(resolve.right), Float.isNaN(resolve.bottom) ? 0.0f : PixelUtil.INSTANCE.dpToPx(resolve.bottom));
    }

    private final void drawQuadrilateral(Canvas canvas, int fillColor, float x12, float y12, float x22, float y22, float x32, float y32, float x42, float y42) {
        if (fillColor == 0) {
            return;
        }
        if (this.pathForBorder == null) {
            this.pathForBorder = new Path();
        }
        this.borderPaint.setColor(multiplyColorAlpha(fillColor, this.borderAlpha));
        Path path = this.pathForBorder;
        if (path != null) {
            path.reset();
        }
        Path path2 = this.pathForBorder;
        if (path2 != null) {
            path2.moveTo(x12, y12);
        }
        Path path3 = this.pathForBorder;
        if (path3 != null) {
            path3.lineTo(x22, y22);
        }
        Path path4 = this.pathForBorder;
        if (path4 != null) {
            path4.lineTo(x32, y32);
        }
        Path path5 = this.pathForBorder;
        if (path5 != null) {
            path5.lineTo(x42, y42);
        }
        Path path6 = this.pathForBorder;
        if (path6 != null) {
            path6.lineTo(x12, y12);
        }
        Path path7 = this.pathForBorder;
        if (path7 != null) {
            canvas.drawPath(path7, this.borderPaint);
        }
    }

    private final void drawRectangularBorders(Canvas canvas) {
        RectF computeBorderInsets = computeBorderInsets();
        int roundToInt = MathKt.roundToInt(computeBorderInsets.left);
        int roundToInt2 = MathKt.roundToInt(computeBorderInsets.top);
        int roundToInt3 = MathKt.roundToInt(computeBorderInsets.right);
        int roundToInt4 = MathKt.roundToInt(computeBorderInsets.bottom);
        if (roundToInt > 0 || roundToInt3 > 0 || roundToInt2 > 0 || roundToInt4 > 0) {
            Rect bounds = getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            int i10 = bounds.left;
            int i11 = bounds.top;
            int fastBorderCompatibleColorOrZero = fastBorderCompatibleColorOrZero(roundToInt, roundToInt2, roundToInt3, roundToInt4, this.computedBorderColors.getLeft(), this.computedBorderColors.getTop(), this.computedBorderColors.getRight(), this.computedBorderColors.getBottom());
            if (fastBorderCompatibleColorOrZero == 0) {
                this.borderPaint.setAntiAlias(false);
                int width = bounds.width();
                int height = bounds.height();
                if (roundToInt > 0) {
                    float f10 = i10;
                    float f11 = i10 + roundToInt;
                    int left = this.computedBorderColors.getLeft();
                    drawQuadrilateral(canvas, left, f10, i11, f11, i11 + roundToInt2, f11, r1 - roundToInt4, f10, i11 + height);
                }
                if (roundToInt2 > 0) {
                    float f12 = i11;
                    float f13 = i11 + roundToInt2;
                    int top = this.computedBorderColors.getTop();
                    drawQuadrilateral(canvas, top, i10, f12, i10 + roundToInt, f13, r1 - roundToInt3, f13, i10 + width, f12);
                }
                if (roundToInt3 > 0) {
                    int i12 = i10 + width;
                    float f14 = i12;
                    int i13 = i11 + height;
                    float f15 = i12 - roundToInt3;
                    drawQuadrilateral(canvas, this.computedBorderColors.getRight(), f14, i11, f14, i13, f15, i13 - roundToInt4, f15, i11 + roundToInt2);
                }
                if (roundToInt4 > 0) {
                    int i14 = i11 + height;
                    float f16 = i14;
                    float f17 = i14 - roundToInt4;
                    drawQuadrilateral(canvas, this.computedBorderColors.getBottom(), i10, f16, i10 + width, f16, r1 - roundToInt3, f17, i10 + roundToInt, f17);
                }
                this.borderPaint.setAntiAlias(true);
                return;
            }
            if (Color.alpha(fastBorderCompatibleColorOrZero) != 0) {
                int i15 = bounds.right;
                int i16 = bounds.bottom;
                this.borderPaint.setColor(multiplyColorAlpha(fastBorderCompatibleColorOrZero, this.borderAlpha));
                this.borderPaint.setStyle(Paint.Style.STROKE);
                Path path = new Path();
                this.pathForSingleBorder = path;
                if (roundToInt > 0) {
                    path.reset();
                    int roundToInt5 = MathKt.roundToInt(computeBorderInsets.left);
                    updatePathEffect(roundToInt5);
                    this.borderPaint.setStrokeWidth(roundToInt5);
                    Path path2 = this.pathForSingleBorder;
                    if (path2 != null) {
                        path2.moveTo((roundToInt5 / 2) + i10, i11);
                    }
                    Path path3 = this.pathForSingleBorder;
                    if (path3 != null) {
                        path3.lineTo((roundToInt5 / 2) + i10, i16);
                    }
                    Path path4 = this.pathForSingleBorder;
                    if (path4 != null) {
                        canvas.drawPath(path4, this.borderPaint);
                    }
                }
                if (roundToInt2 > 0) {
                    Path path5 = this.pathForSingleBorder;
                    if (path5 != null) {
                        path5.reset();
                    }
                    int roundToInt6 = MathKt.roundToInt(computeBorderInsets.top);
                    updatePathEffect(roundToInt6);
                    this.borderPaint.setStrokeWidth(roundToInt6);
                    Path path6 = this.pathForSingleBorder;
                    if (path6 != null) {
                        path6.moveTo(i10, (roundToInt6 / 2) + i11);
                    }
                    Path path7 = this.pathForSingleBorder;
                    if (path7 != null) {
                        path7.lineTo(i15, (roundToInt6 / 2) + i11);
                    }
                    Path path8 = this.pathForSingleBorder;
                    if (path8 != null) {
                        canvas.drawPath(path8, this.borderPaint);
                    }
                }
                if (roundToInt3 > 0) {
                    Path path9 = this.pathForSingleBorder;
                    if (path9 != null) {
                        path9.reset();
                    }
                    int roundToInt7 = MathKt.roundToInt(computeBorderInsets.right);
                    updatePathEffect(roundToInt7);
                    this.borderPaint.setStrokeWidth(roundToInt7);
                    Path path10 = this.pathForSingleBorder;
                    if (path10 != null) {
                        path10.moveTo(i15 - (roundToInt7 / 2), i11);
                    }
                    Path path11 = this.pathForSingleBorder;
                    if (path11 != null) {
                        path11.lineTo(i15 - (roundToInt7 / 2), i16);
                    }
                    Path path12 = this.pathForSingleBorder;
                    if (path12 != null) {
                        canvas.drawPath(path12, this.borderPaint);
                    }
                }
                if (roundToInt4 > 0) {
                    Path path13 = this.pathForSingleBorder;
                    if (path13 != null) {
                        path13.reset();
                    }
                    int roundToInt8 = MathKt.roundToInt(computeBorderInsets.bottom);
                    updatePathEffect(roundToInt8);
                    this.borderPaint.setStrokeWidth(roundToInt8);
                    Path path14 = this.pathForSingleBorder;
                    if (path14 != null) {
                        path14.moveTo(i10, i16 - (roundToInt8 / 2));
                    }
                    Path path15 = this.pathForSingleBorder;
                    if (path15 != null) {
                        path15.lineTo(i15, i16 - (roundToInt8 / 2));
                    }
                    Path path16 = this.pathForSingleBorder;
                    if (path16 != null) {
                        canvas.drawPath(path16, this.borderPaint);
                    }
                }
            }
        }
    }

    private final void drawRoundedBorders(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        CornerRadii topLeft;
        CornerRadii pixelFromDIP;
        CornerRadii topLeft2;
        CornerRadii pixelFromDIP2;
        updatePath();
        canvas.save();
        Path path = this.outerClipPathForBorderRadius;
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas.clipPath(path);
        RectF computeBorderInsets = computeBorderInsets();
        float f14 = 0.0f;
        if (computeBorderInsets.top > 0.0f || computeBorderInsets.bottom > 0.0f || computeBorderInsets.left > 0.0f || computeBorderInsets.right > 0.0f) {
            float fullBorderWidth = getFullBorderWidth();
            int borderColor = getBorderColor(LogicalEdge.ALL);
            if (computeBorderInsets.top != fullBorderWidth || computeBorderInsets.bottom != fullBorderWidth || computeBorderInsets.left != fullBorderWidth || computeBorderInsets.right != fullBorderWidth || this.computedBorderColors.getLeft() != borderColor || this.computedBorderColors.getTop() != borderColor || this.computedBorderColors.getRight() != borderColor || this.computedBorderColors.getBottom() != borderColor) {
                this.borderPaint.setStyle(Paint.Style.FILL);
                if (Build.VERSION.SDK_INT >= 26) {
                    Path path2 = this.innerClipPathForBorderRadius;
                    if (path2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.clipOutPath(path2);
                } else {
                    Path path3 = this.innerClipPathForBorderRadius;
                    if (path3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.clipPath(path3, Region.Op.DIFFERENCE);
                }
                RectF rectF = this.outerClipTempRectForBorderRadius;
                if (rectF == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                float f15 = rectF.left;
                float f16 = rectF.right;
                float f17 = rectF.top;
                float f18 = rectF.bottom;
                PointF pointF5 = this.innerTopLeftCorner;
                if (pointF5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF6 = this.innerTopRightCorner;
                if (pointF6 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF7 = this.innerBottomLeftCorner;
                if (pointF7 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                PointF pointF8 = this.innerBottomRightCorner;
                if (pointF8 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (computeBorderInsets.left > 0.0f) {
                    float f19 = this.gapBetweenPaths;
                    f10 = 0.0f;
                    float f20 = f19 + f18;
                    f13 = f18;
                    pointF4 = pointF8;
                    f11 = f16;
                    pointF2 = pointF6;
                    f12 = f17;
                    pointF3 = pointF7;
                    pointF = pointF5;
                    drawQuadrilateral(canvas, this.computedBorderColors.getLeft(), f15, f17 - f19, pointF5.x, pointF5.y - f19, pointF7.x, pointF7.y + f19, f15, f20);
                } else {
                    f10 = 0.0f;
                    f11 = f16;
                    f12 = f17;
                    f13 = f18;
                    pointF = pointF5;
                    pointF2 = pointF6;
                    pointF3 = pointF7;
                    pointF4 = pointF8;
                }
                if (computeBorderInsets.top > f10) {
                    float f21 = this.gapBetweenPaths;
                    drawQuadrilateral(canvas, this.computedBorderColors.getTop(), f15 - f21, f12, pointF.x - f21, pointF.y, pointF2.x + f21, pointF2.y, f11 + f21, f12);
                }
                if (computeBorderInsets.right > f10) {
                    float f22 = this.gapBetweenPaths;
                    drawQuadrilateral(canvas, this.computedBorderColors.getRight(), f11, f12 - f22, pointF2.x, pointF2.y - f22, pointF4.x, pointF4.y + f22, f11, f13 + f22);
                }
                if (computeBorderInsets.bottom > f10) {
                    float f23 = this.gapBetweenPaths;
                    drawQuadrilateral(canvas, this.computedBorderColors.getBottom(), f15 - f23, f13, pointF3.x - f23, pointF3.y, pointF4.x + f23, pointF4.y, f11 + f23, f13);
                }
            } else if (fullBorderWidth > 0.0f) {
                this.borderPaint.setColor(multiplyColorAlpha(borderColor, this.borderAlpha));
                this.borderPaint.setStyle(Paint.Style.STROKE);
                this.borderPaint.setStrokeWidth(fullBorderWidth);
                ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
                if (computedBorderRadius == null || !computedBorderRadius.isUniform()) {
                    Path path4 = this.centerDrawPath;
                    if (path4 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path4, this.borderPaint);
                } else {
                    RectF rectF2 = this.tempRectForCenterDrawPath;
                    if (rectF2 != null) {
                        ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
                        float horizontal = ((computedBorderRadius2 == null || (topLeft2 = computedBorderRadius2.getTopLeft()) == null || (pixelFromDIP2 = topLeft2.toPixelFromDIP()) == null) ? 0.0f : pixelFromDIP2.getHorizontal()) - (computeBorderInsets.left * 0.5f);
                        ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
                        if (computedBorderRadius3 != null && (topLeft = computedBorderRadius3.getTopLeft()) != null && (pixelFromDIP = topLeft.toPixelFromDIP()) != null) {
                            f14 = pixelFromDIP.getVertical();
                        }
                        canvas.drawRoundRect(rectF2, horizontal, f14 - (computeBorderInsets.top * 0.5f), this.borderPaint);
                    }
                }
            }
        }
        canvas.restore();
    }

    private final int fastBorderCompatibleColorOrZero(int borderLeft, int borderTop, int borderRight, int borderBottom, int colorLeft, int colorTop, int colorRight, int colorBottom) {
        if (Color.alpha(colorLeft) >= 255 && Color.alpha(colorTop) >= 255 && Color.alpha(colorRight) >= 255 && Color.alpha(colorBottom) >= 255) {
            int i10 = (borderBottom > 0 ? colorBottom : -1) & (borderLeft > 0 ? colorLeft : -1) & (borderTop > 0 ? colorTop : -1) & (borderRight > 0 ? colorRight : -1);
            if (borderLeft <= 0) {
                colorLeft = 0;
            }
            if (borderTop <= 0) {
                colorTop = 0;
            }
            int i11 = colorLeft | colorTop;
            if (borderRight <= 0) {
                colorRight = 0;
            }
            int i12 = i11 | colorRight;
            if (borderBottom <= 0) {
                colorBottom = 0;
            }
            if (i10 == (i12 | colorBottom)) {
                return i10;
            }
        }
        return 0;
    }

    private final void getEllipseIntersectionWithLine(double ellipseBoundsLeft, double ellipseBoundsTop, double ellipseBoundsRight, double ellipseBoundsBottom, double lineStartX, double lineStartY, double lineEndX, double lineEndY, PointF result) {
        double d10 = 2;
        double d11 = (ellipseBoundsLeft + ellipseBoundsRight) / d10;
        double d12 = (ellipseBoundsTop + ellipseBoundsBottom) / d10;
        double d13 = lineStartX - d11;
        double d14 = lineStartY - d12;
        double abs = Math.abs(ellipseBoundsRight - ellipseBoundsLeft) / d10;
        double abs2 = Math.abs(ellipseBoundsBottom - ellipseBoundsTop) / d10;
        double d15 = ((lineEndY - d12) - d14) / ((lineEndX - d11) - d13);
        double d16 = d14 - (d13 * d15);
        double d17 = abs2 * abs2;
        double d18 = abs * abs;
        double d19 = d17 + (d18 * d15 * d15);
        double d20 = d10 * abs * abs * d16 * d15;
        double d21 = d10 * d19;
        double sqrt = ((-d20) / d21) - Math.sqrt(((-(d18 * ((d16 * d16) - d17))) / d19) + Math.pow(d20 / d21, 2.0d));
        double d22 = (d15 * sqrt) + d16;
        double d23 = sqrt + d11;
        double d24 = d22 + d12;
        if (Double.isNaN(d23) || Double.isNaN(d24)) {
            return;
        }
        result.x = (float) d23;
        result.y = (float) d24;
    }

    private final float getFullBorderWidth() {
        Spacing spacing = this.borderWidth;
        float raw = spacing != null ? spacing.getRaw(8) : Float.NaN;
        if (Float.isNaN(raw)) {
            return 0.0f;
        }
        return raw;
    }

    private final float getInnerBorderRadius(float computedRadius, float borderWidth) {
        return RangesKt.coerceAtLeast(computedRadius - borderWidth, 0.0f);
    }

    private final PathEffect getPathEffect(BorderStyle style, float borderWidth) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            float f10 = borderWidth * 3;
            return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
        }
        if (i10 == 3) {
            return new DashPathEffect(new float[]{borderWidth, borderWidth, borderWidth, borderWidth}, 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final <T> ReadWriteProperty<Object, T> invalidatingAndPathChange(final T initialValue) {
        return new ObservableProperty<T>(initialValue) { // from class: com.facebook.react.uimanager.drawable.BorderDrawable$invalidatingAndPathChange$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, T oldValue, T newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                if (Intrinsics.areEqual(oldValue, newValue)) {
                    return;
                }
                this.needUpdatePath = true;
                this.invalidateSelf();
            }
        };
    }

    private final int multiplyColorAlpha(int color, int rawAlpha) {
        if (rawAlpha == 255) {
            return color;
        }
        if (rawAlpha == 0) {
            return color & 16777215;
        }
        return (color & 16777215) | ((((color >>> 24) * ((rawAlpha + (rawAlpha >> 7)) >> 7)) >> 8) << 24);
    }

    private final void updatePath() {
        ComputedBorderRadius computedBorderRadius;
        CornerRadii cornerRadii;
        CornerRadii cornerRadii2;
        CornerRadii cornerRadii3;
        CornerRadii cornerRadii4;
        char c10;
        char c11;
        char c12;
        Path path;
        int i10;
        RectF rectF;
        Path path2;
        Path path3;
        CornerRadii bottomRight;
        CornerRadii bottomLeft;
        CornerRadii topRight;
        CornerRadii topLeft;
        if (this.needUpdatePath) {
            this.needUpdatePath = false;
            Path path4 = this.innerClipPathForBorderRadius;
            if (path4 == null) {
                path4 = new Path();
            }
            this.innerClipPathForBorderRadius = path4;
            Path path5 = this.outerClipPathForBorderRadius;
            if (path5 == null) {
                path5 = new Path();
            }
            this.outerClipPathForBorderRadius = path5;
            this.pathForOutline = new Path();
            RectF rectF2 = this.innerClipTempRectForBorderRadius;
            if (rectF2 == null) {
                rectF2 = new RectF();
            }
            this.innerClipTempRectForBorderRadius = rectF2;
            RectF rectF3 = this.outerClipTempRectForBorderRadius;
            if (rectF3 == null) {
                rectF3 = new RectF();
            }
            this.outerClipTempRectForBorderRadius = rectF3;
            RectF rectF4 = this.tempRectForCenterDrawPath;
            if (rectF4 == null) {
                rectF4 = new RectF();
            }
            this.tempRectForCenterDrawPath = rectF4;
            Path path6 = this.innerClipPathForBorderRadius;
            if (path6 != null) {
                path6.reset();
                Unit unit = Unit.INSTANCE;
            }
            Path path7 = this.outerClipPathForBorderRadius;
            if (path7 != null) {
                path7.reset();
                Unit unit2 = Unit.INSTANCE;
            }
            RectF rectF5 = this.innerClipTempRectForBorderRadius;
            if (rectF5 != null) {
                rectF5.set(getBounds());
                Unit unit3 = Unit.INSTANCE;
            }
            RectF rectF6 = this.outerClipTempRectForBorderRadius;
            if (rectF6 != null) {
                rectF6.set(getBounds());
                Unit unit4 = Unit.INSTANCE;
            }
            RectF rectF7 = this.tempRectForCenterDrawPath;
            if (rectF7 != null) {
                rectF7.set(getBounds());
                Unit unit5 = Unit.INSTANCE;
            }
            RectF computeBorderInsets = computeBorderInsets();
            if (Color.alpha(this.computedBorderColors.getLeft()) != 0 || Color.alpha(this.computedBorderColors.getTop()) != 0 || Color.alpha(this.computedBorderColors.getRight()) != 0 || Color.alpha(this.computedBorderColors.getBottom()) != 0) {
                RectF rectF8 = this.innerClipTempRectForBorderRadius;
                if (rectF8 != null) {
                    rectF8.top = rectF8 != null ? rectF8.top + computeBorderInsets.top : 0.0f;
                    Unit unit6 = Unit.INSTANCE;
                }
                if (rectF8 != null) {
                    rectF8.bottom = rectF8 != null ? rectF8.bottom - computeBorderInsets.bottom : 0.0f;
                    Unit unit7 = Unit.INSTANCE;
                }
                if (rectF8 != null) {
                    rectF8.left = rectF8 != null ? rectF8.left + computeBorderInsets.left : 0.0f;
                    Unit unit8 = Unit.INSTANCE;
                }
                if (rectF8 != null) {
                    rectF8.right = rectF8 != null ? rectF8.right - computeBorderInsets.right : 0.0f;
                    Unit unit9 = Unit.INSTANCE;
                }
            }
            RectF rectF9 = this.tempRectForCenterDrawPath;
            if (rectF9 != null) {
                rectF9.top = rectF9 != null ? rectF9.top + (computeBorderInsets.top * 0.5f) : 0.0f;
                Unit unit10 = Unit.INSTANCE;
            }
            if (rectF9 != null) {
                rectF9.bottom = rectF9 != null ? rectF9.bottom - (computeBorderInsets.bottom * 0.5f) : 0.0f;
                Unit unit11 = Unit.INSTANCE;
            }
            if (rectF9 != null) {
                rectF9.left = rectF9 != null ? rectF9.left + (computeBorderInsets.left * 0.5f) : 0.0f;
                Unit unit12 = Unit.INSTANCE;
            }
            if (rectF9 != null) {
                rectF9.right = rectF9 != null ? rectF9.right - (computeBorderInsets.right * 0.5f) : 0.0f;
                Unit unit13 = Unit.INSTANCE;
            }
            BorderRadiusStyle borderRadiusStyle = this.borderRadius;
            if (borderRadiusStyle != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.context;
                RectF rectF10 = this.outerClipTempRectForBorderRadius;
                float pxToDp = rectF10 != null ? PixelUtil.INSTANCE.pxToDp(rectF10.width()) : 0.0f;
                RectF rectF11 = this.outerClipTempRectForBorderRadius;
                computedBorderRadius = borderRadiusStyle.resolve(layoutDirection, context, pxToDp, rectF11 != null ? PixelUtil.INSTANCE.pxToDp(rectF11.height()) : 0.0f);
            } else {
                computedBorderRadius = null;
            }
            this.computedBorderRadius = computedBorderRadius;
            if (computedBorderRadius == null || (topLeft = computedBorderRadius.getTopLeft()) == null || (cornerRadii = topLeft.toPixelFromDIP()) == null) {
                cornerRadii = new CornerRadii(0.0f, 0.0f);
            }
            ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
            if (computedBorderRadius2 == null || (topRight = computedBorderRadius2.getTopRight()) == null || (cornerRadii2 = topRight.toPixelFromDIP()) == null) {
                cornerRadii2 = new CornerRadii(0.0f, 0.0f);
            }
            ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
            if (computedBorderRadius3 == null || (bottomLeft = computedBorderRadius3.getBottomLeft()) == null || (cornerRadii3 = bottomLeft.toPixelFromDIP()) == null) {
                cornerRadii3 = new CornerRadii(0.0f, 0.0f);
            }
            ComputedBorderRadius computedBorderRadius4 = this.computedBorderRadius;
            if (computedBorderRadius4 == null || (bottomRight = computedBorderRadius4.getBottomRight()) == null || (cornerRadii4 = bottomRight.toPixelFromDIP()) == null) {
                cornerRadii4 = new CornerRadii(0.0f, 0.0f);
            }
            float innerBorderRadius = getInnerBorderRadius(cornerRadii.getHorizontal(), computeBorderInsets.left);
            float innerBorderRadius2 = getInnerBorderRadius(cornerRadii.getVertical(), computeBorderInsets.top);
            float innerBorderRadius3 = getInnerBorderRadius(cornerRadii2.getHorizontal(), computeBorderInsets.right);
            float innerBorderRadius4 = getInnerBorderRadius(cornerRadii2.getVertical(), computeBorderInsets.top);
            float innerBorderRadius5 = getInnerBorderRadius(cornerRadii4.getHorizontal(), computeBorderInsets.right);
            float innerBorderRadius6 = getInnerBorderRadius(cornerRadii4.getVertical(), computeBorderInsets.bottom);
            float innerBorderRadius7 = getInnerBorderRadius(cornerRadii3.getHorizontal(), computeBorderInsets.left);
            float innerBorderRadius8 = getInnerBorderRadius(cornerRadii3.getVertical(), computeBorderInsets.bottom);
            RectF rectF12 = this.innerClipTempRectForBorderRadius;
            if (rectF12 == null || (path3 = this.innerClipPathForBorderRadius) == null) {
                c10 = 6;
                c11 = 7;
            } else {
                c11 = 7;
                c10 = 6;
                path3.addRoundRect(rectF12, new float[]{innerBorderRadius, innerBorderRadius2, innerBorderRadius3, innerBorderRadius4, innerBorderRadius5, innerBorderRadius6, innerBorderRadius7, innerBorderRadius8}, Path.Direction.CW);
                Unit unit14 = Unit.INSTANCE;
            }
            RectF rectF13 = this.outerClipTempRectForBorderRadius;
            if (rectF13 == null || (path2 = this.outerClipPathForBorderRadius) == null) {
                c12 = 5;
            } else {
                float horizontal = cornerRadii.getHorizontal();
                float vertical = cornerRadii.getVertical();
                float horizontal2 = cornerRadii2.getHorizontal();
                float vertical2 = cornerRadii2.getVertical();
                float horizontal3 = cornerRadii4.getHorizontal();
                float vertical3 = cornerRadii4.getVertical();
                float horizontal4 = cornerRadii3.getHorizontal();
                float vertical4 = cornerRadii3.getVertical();
                c12 = 5;
                float[] fArr = new float[8];
                fArr[0] = horizontal;
                fArr[1] = vertical;
                fArr[2] = horizontal2;
                fArr[3] = vertical2;
                fArr[4] = horizontal3;
                fArr[5] = vertical3;
                fArr[c10] = horizontal4;
                fArr[c11] = vertical4;
                path2.addRoundRect(rectF13, fArr, Path.Direction.CW);
                Unit unit15 = Unit.INSTANCE;
            }
            Spacing spacing = this.borderWidth;
            float f10 = spacing != null ? spacing.get(8) / 2.0f : 0.0f;
            Path path8 = this.pathForOutline;
            if (path8 != null) {
                RectF rectF14 = new RectF(getBounds());
                float horizontal5 = cornerRadii.getHorizontal() + f10;
                float vertical5 = cornerRadii.getVertical() + f10;
                float horizontal6 = cornerRadii2.getHorizontal() + f10;
                float vertical6 = cornerRadii2.getVertical() + f10;
                float horizontal7 = cornerRadii4.getHorizontal() + f10;
                float vertical7 = cornerRadii4.getVertical() + f10;
                float horizontal8 = cornerRadii3.getHorizontal() + f10;
                float vertical8 = cornerRadii3.getVertical() + f10;
                float[] fArr2 = new float[8];
                fArr2[0] = horizontal5;
                fArr2[1] = vertical5;
                fArr2[2] = horizontal6;
                fArr2[3] = vertical6;
                fArr2[4] = horizontal7;
                fArr2[c12] = vertical7;
                fArr2[c10] = horizontal8;
                fArr2[c11] = vertical8;
                path8.addRoundRect(rectF14, fArr2, Path.Direction.CW);
                Unit unit16 = Unit.INSTANCE;
            }
            ComputedBorderRadius computedBorderRadius5 = this.computedBorderRadius;
            if (computedBorderRadius5 == null || !computedBorderRadius5.isUniform()) {
                Path path9 = this.centerDrawPath;
                if (path9 == null) {
                    path9 = new Path();
                }
                this.centerDrawPath = path9;
                path9.reset();
                Unit unit17 = Unit.INSTANCE;
                RectF rectF15 = this.tempRectForCenterDrawPath;
                if (rectF15 != null && (path = this.centerDrawPath) != null) {
                    float horizontal9 = cornerRadii.getHorizontal() - (computeBorderInsets.left * 0.5f);
                    float vertical9 = cornerRadii.getVertical() - (computeBorderInsets.top * 0.5f);
                    float horizontal10 = cornerRadii2.getHorizontal() - (computeBorderInsets.right * 0.5f);
                    float vertical10 = cornerRadii2.getVertical() - (computeBorderInsets.top * 0.5f);
                    float horizontal11 = cornerRadii4.getHorizontal() - (computeBorderInsets.right * 0.5f);
                    float vertical11 = cornerRadii4.getVertical() - (computeBorderInsets.bottom * 0.5f);
                    i10 = 2;
                    float horizontal12 = cornerRadii3.getHorizontal() - (computeBorderInsets.left * 0.5f);
                    float vertical12 = cornerRadii3.getVertical() - (computeBorderInsets.bottom * 0.5f);
                    float[] fArr3 = new float[8];
                    fArr3[0] = horizontal9;
                    fArr3[1] = vertical9;
                    fArr3[2] = horizontal10;
                    fArr3[3] = vertical10;
                    fArr3[4] = horizontal11;
                    fArr3[c12] = vertical11;
                    fArr3[c10] = horizontal12;
                    fArr3[c11] = vertical12;
                    path.addRoundRect(rectF15, fArr3, Path.Direction.CW);
                    Unit unit18 = Unit.INSTANCE;
                    rectF = this.innerClipTempRectForBorderRadius;
                    RectF rectF16 = this.outerClipTempRectForBorderRadius;
                    if (rectF != null || rectF16 == null) {
                    }
                    PointF pointF = this.innerTopLeftCorner;
                    if (pointF == null) {
                        pointF = new PointF();
                    }
                    this.innerTopLeftCorner = pointF;
                    pointF.x = rectF.left;
                    Unit unit19 = Unit.INSTANCE;
                    pointF.y = rectF.top;
                    Unit unit20 = Unit.INSTANCE;
                    float f11 = rectF.left;
                    float f12 = rectF.top;
                    float f13 = i10;
                    getEllipseIntersectionWithLine(f11, f12, (innerBorderRadius * f13) + f11, (f13 * innerBorderRadius2) + f12, rectF16.left, rectF16.top, f11, f12, pointF);
                    Unit unit21 = Unit.INSTANCE;
                    PointF pointF2 = this.innerBottomLeftCorner;
                    if (pointF2 == null) {
                        pointF2 = new PointF();
                    }
                    this.innerBottomLeftCorner = pointF2;
                    pointF2.x = rectF.left;
                    Unit unit22 = Unit.INSTANCE;
                    pointF2.y = rectF.bottom;
                    Unit unit23 = Unit.INSTANCE;
                    float f14 = rectF.left;
                    float f15 = rectF.bottom;
                    float f16 = 2;
                    getEllipseIntersectionWithLine(f14, f15 - (innerBorderRadius8 * f16), (f16 * innerBorderRadius7) + f14, f15, rectF16.left, rectF16.bottom, f14, f15, pointF2);
                    Unit unit24 = Unit.INSTANCE;
                    PointF pointF3 = this.innerTopRightCorner;
                    if (pointF3 == null) {
                        pointF3 = new PointF();
                    }
                    this.innerTopRightCorner = pointF3;
                    pointF3.x = rectF.right;
                    Unit unit25 = Unit.INSTANCE;
                    pointF3.y = rectF.top;
                    Unit unit26 = Unit.INSTANCE;
                    float f17 = rectF.right;
                    float f18 = 2;
                    float f19 = rectF.top;
                    getEllipseIntersectionWithLine(f17 - (innerBorderRadius3 * f18), f19, f17, (f18 * innerBorderRadius4) + f19, rectF16.right, rectF16.top, f17, f19, pointF3);
                    Unit unit27 = Unit.INSTANCE;
                    PointF pointF4 = this.innerBottomRightCorner;
                    if (pointF4 == null) {
                        pointF4 = new PointF();
                    }
                    this.innerBottomRightCorner = pointF4;
                    pointF4.x = rectF.right;
                    Unit unit28 = Unit.INSTANCE;
                    pointF4.y = rectF.bottom;
                    Unit unit29 = Unit.INSTANCE;
                    float f20 = rectF.right;
                    float f21 = 2;
                    float f22 = rectF.bottom;
                    getEllipseIntersectionWithLine(f20 - (innerBorderRadius5 * f21), f22 - (f21 * innerBorderRadius6), f20, f22, rectF16.right, rectF16.bottom, f20, f22, pointF4);
                    Unit unit30 = Unit.INSTANCE;
                    return;
                }
            }
            i10 = 2;
            rectF = this.innerClipTempRectForBorderRadius;
            RectF rectF162 = this.outerClipTempRectForBorderRadius;
            if (rectF != null) {
            }
        }
    }

    private final void updatePathEffect() {
        BorderStyle borderStyle = getBorderStyle();
        if (borderStyle != null) {
            this.borderPaint.setPathEffect(getBorderStyle() != null ? getPathEffect(borderStyle, getFullBorderWidth()) : null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        ColorEdges colorEdges;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        updatePathEffect();
        Integer[] numArr = this.borderColors;
        if (numArr == null || (colorEdges = BorderColors.m74resolveimpl(numArr, getLayoutDirection(), this.context)) == null) {
            colorEdges = this.computedBorderColors;
        }
        this.computedBorderColors = colorEdges;
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle == null || !borderRadiusStyle.hasRoundedBorders()) {
            drawRectangularBorders(canvas);
        } else {
            drawRoundedBorders(canvas);
        }
    }

    public final int getBorderColor(@NotNull LogicalEdge position) {
        Integer num;
        Intrinsics.checkNotNullParameter(position, "position");
        Integer[] numArr = this.borderColors;
        if (numArr == null || (num = numArr[position.ordinal()]) == null) {
            return -16777216;
        }
        return num.intValue();
    }

    @Nullable
    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    @Nullable
    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Nullable
    public final BorderStyle getBorderStyle() {
        return (BorderStyle) this.borderStyle.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    public final Spacing getBorderWidth() {
        return this.borderWidth;
    }

    @Nullable
    public final Path getInnerClipPathForBorderRadius() {
        return this.innerClipPathForBorderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        if (ComparisonsKt.maxOf(Color.alpha(multiplyColorAlpha(this.computedBorderColors.getLeft(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getTop(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getRight(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getBottom(), this.borderAlpha))) == 0) {
            return -2;
        }
        return ComparisonsKt.minOf(Color.alpha(multiplyColorAlpha(this.computedBorderColors.getLeft(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getTop(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getRight(), this.borderAlpha)), Color.alpha(multiplyColorAlpha(this.computedBorderColors.getBottom(), this.borderAlpha))) == 255 ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.needUpdatePath = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.needUpdatePath = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.borderAlpha = alpha;
        invalidateSelf();
    }

    public final void setBorderColor(@NotNull LogicalEdge position, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(position, "position");
        Integer[] numArr = this.borderColors;
        if (numArr == null) {
            numArr = BorderColors.m70constructorimpl$default(null, 1, null);
        }
        this.borderColors = numArr;
        if (numArr != null) {
            numArr[position.ordinal()] = color;
        }
        this.needUpdatePath = true;
        invalidateSelf();
    }

    public final void setBorderInsets(@Nullable BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(@Nullable BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    public final void setBorderStyle(@Nullable BorderStyle borderStyle) {
        this.borderStyle.setValue(this, $$delegatedProperties[0], borderStyle);
    }

    public final void setBorderWidth(int position, float width) {
        Spacing spacing = this.borderWidth;
        if (FloatUtil.floatsEqual(spacing != null ? Float.valueOf(spacing.getRaw(position)) : null, Float.valueOf(width))) {
            return;
        }
        Spacing spacing2 = this.borderWidth;
        if (spacing2 != null) {
            spacing2.set(position, width);
        }
        if (position == 0 || position == 1 || position == 2 || position == 3 || position == 4 || position == 5 || position == 8) {
            this.needUpdatePath = true;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void setBorderRadius(@NotNull BorderRadiusProp property, @Nullable LengthPercentage radius) {
        Intrinsics.checkNotNullParameter(property, "property");
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (Intrinsics.areEqual(radius, borderRadiusStyle != null ? borderRadiusStyle.get(property) : null)) {
            return;
        }
        BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
        if (borderRadiusStyle2 != null) {
            borderRadiusStyle2.set(property, radius);
        }
        this.needUpdatePath = true;
        invalidateSelf();
    }

    public final void setBorderStyle(@Nullable String style) {
        BorderStyle valueOf;
        if (style == null) {
            valueOf = null;
        } else {
            String upperCase = style.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            valueOf = BorderStyle.valueOf(upperCase);
        }
        setBorderStyle(valueOf);
        this.needUpdatePath = true;
        invalidateSelf();
    }

    private final void updatePathEffect(int borderWidth) {
        BorderStyle borderStyle = getBorderStyle();
        if (borderStyle != null) {
            this.borderPaint.setPathEffect(getBorderStyle() != null ? getPathEffect(borderStyle, borderWidth) : null);
        }
    }
}
