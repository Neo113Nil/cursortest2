package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.drawable.BackgroundDrawable;
import com.facebook.react.uimanager.drawable.BackgroundImageDrawable;
import com.facebook.react.uimanager.drawable.BorderDrawable;
import com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable;
import com.facebook.react.uimanager.drawable.InsetBoxShadowDrawable;
import com.facebook.react.uimanager.drawable.OutlineDrawable;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawable;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BackgroundPosition;
import com.facebook.react.uimanager.style.BackgroundRepeat;
import com.facebook.react.uimanager.style.BackgroundSize;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.BoxShadow;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.OutlineStyle;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007J%\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rH\u0001¢\u0006\u0002\b\u0012J%\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\rH\u0001¢\u0006\u0002\b\u0016J%\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\rH\u0001¢\u0006\u0002\b\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0002\u0010\"J\u001f\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010$J)\u0010%\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010&J\u001f\u0010'\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010(J\"\u0010)\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0007J\u001a\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+H\u0007J\u001a\u0010/\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u000101H\u0007J\u0012\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J!\u00103\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u00104\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\nJ\u0017\u00105\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u001cJ\u0018\u00106\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u00107\u001a\u00020!H\u0007J\u0015\u00108\u001a\u0004\u0018\u00010!2\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u00109J\u001a\u0010:\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010;\u001a\u0004\u0018\u00010<H\u0007J\u0010\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010>\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H\u0007J\u0015\u0010?\u001a\u0004\u0018\u00010!2\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u00109J\u001e\u0010@\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\rH\u0007J\u001a\u0010@\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010CH\u0007J\u001a\u0010D\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010FH\u0007J\u0018\u0010G\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010H\u001a\u00020IH\u0007J(\u0010J\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010H\u001a\u00020I2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010LH\u0007J.\u0010M\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010H\u001a\u00020I2\u0006\u0010N\u001a\u00020O2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00050LH\u0002J\u0010\u0010P\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010Q\u001a\u00020R2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010T\u001a\u00020U2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010W\u001a\u00020X2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010Y\u001a\u0004\u0018\u00010X2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010Z\u001a\u0004\u0018\u00010[2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\\\u001a\u00020[2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010]\u001a\u00020^2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J!\u0010`\u001a\u00020!2\b\u0010a\u001a\u0004\u0018\u00010!2\b\u0010b\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010cJ*\u0010d\u001a\u00020O2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010e\u001a\u00020R2\u0006\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010gH\u0002¨\u0006i"}, d2 = {"Lcom/facebook/react/uimanager/BackgroundStyleApplicator;", "", "<init>", "()V", "setBackgroundColor", "", "view", "Landroid/view/View;", ViewProps.COLOR, "", "(Landroid/view/View;Ljava/lang/Integer;)V", "setBackgroundImage", "backgroundImageLayers", "", "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;", "setBackgroundSize", "backgroundSizes", "Lcom/facebook/react/uimanager/style/BackgroundSize;", "setBackgroundSize$ReactAndroid_release", "setBackgroundPosition", "backgroundPositions", "Lcom/facebook/react/uimanager/style/BackgroundPosition;", "setBackgroundPosition$ReactAndroid_release", "setBackgroundRepeat", "backgroundRepeats", "Lcom/facebook/react/uimanager/style/BackgroundRepeat;", "setBackgroundRepeat$ReactAndroid_release", "getBackgroundColor", "(Landroid/view/View;)Ljava/lang/Integer;", "setBorderWidth", EventKeys.EDGE_HOST_REGION, "Lcom/facebook/react/uimanager/style/LogicalEdge;", "width", "", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V", "getBorderWidth", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;)Ljava/lang/Float;", "setBorderColor", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Integer;)V", "getBorderColor", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;)Ljava/lang/Integer;", "setBorderRadius", "corner", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "radius", "Lcom/facebook/react/uimanager/LengthPercentage;", "getBorderRadius", "setBorderStyle", "borderStyle", "Lcom/facebook/react/uimanager/style/BorderStyle;", "getBorderStyle", "setOutlineColor", ViewProps.OUTLINE_COLOR, "getOutlineColor", "setOutlineOffset", ViewProps.OUTLINE_OFFSET, "getOutlineOffset", "(Landroid/view/View;)Ljava/lang/Float;", "setOutlineStyle", ViewProps.OUTLINE_STYLE, "Lcom/facebook/react/uimanager/style/OutlineStyle;", "getOutlineStyle", "setOutlineWidth", "getOutlineWidth", "setBoxShadow", "shadows", "Lcom/facebook/react/uimanager/style/BoxShadow;", "Lcom/facebook/react/bridge/ReadableArray;", "setFeedbackUnderlay", "drawable", "Landroid/graphics/drawable/Drawable;", "clipToPaddingBox", "canvas", "Landroid/graphics/Canvas;", "clipToPaddingBoxWithAntiAliasing", "drawContent", "Lkotlin/Function0;", "clipWithAntiAliasing", "paddingBoxPath", "Landroid/graphics/Path;", "reset", "ensureCompositeBackgroundDrawable", "Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "getCompositeBackgroundDrawable", "ensureBackgroundDrawable", "Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "getBackground", "ensureBackgroundImageDrawable", "Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "getBackgroundImage", "getBorder", "Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "ensureBorderDrawable", "ensureOutlineDrawable", "Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "getOutlineDrawable", "getInnerBorderRadius", "computedRadius", ViewProps.BORDER_WIDTH, "(Ljava/lang/Float;Ljava/lang/Float;)F", "createPaddingBoxPath", "composite", "paddingBoxRect", "Landroid/graphics/RectF;", "computedBorderInsets", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackgroundStyleApplicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundStyleApplicator.kt\ncom/facebook/react/uimanager/BackgroundStyleApplicator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,806:1\n808#2,11:807\n808#2,11:818\n808#2,11:829\n*S KotlinDebug\n*F\n+ 1 BackgroundStyleApplicator.kt\ncom/facebook/react/uimanager/BackgroundStyleApplicator\n*L\n151#1:807,11\n231#1:818,11\n238#1:829,11\n*E\n"})
/* loaded from: classes2.dex */
public final class BackgroundStyleApplicator {

    @NotNull
    public static final BackgroundStyleApplicator INSTANCE = new BackgroundStyleApplicator();

    private BackgroundStyleApplicator() {
    }

    @JvmStatic
    public static final void clipToPaddingBox(@NotNull View view, @NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        clipToPaddingBoxWithAntiAliasing(view, canvas, null);
    }

    @JvmStatic
    public static final void clipToPaddingBoxWithAntiAliasing(@NotNull View view, @NotNull Canvas canvas, @Nullable Function0<Unit> drawContent) {
        RectF rectF;
        float f10;
        float f11;
        float f12;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        CompositeBackgroundDrawable compositeBackgroundDrawable = backgroundStyleApplicator.getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable == null) {
            canvas.clipRect(rect);
            if (drawContent != null) {
                drawContent.invoke();
                return;
            }
            return;
        }
        RectF rectF2 = new RectF();
        BorderInsets borderInsets = compositeBackgroundDrawable.getBorderInsets();
        if (borderInsets != null) {
            int layoutDirection = compositeBackgroundDrawable.getLayoutDirection();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rectF = borderInsets.resolve(layoutDirection, context);
        } else {
            rectF = null;
        }
        float f13 = compositeBackgroundDrawable.getBounds().left;
        float f14 = 0.0f;
        if (rectF != null) {
            f10 = PixelUtil.INSTANCE.dpToPx(rectF.left);
        } else {
            f10 = 0.0f;
        }
        rectF2.left = f13 + f10;
        float f15 = compositeBackgroundDrawable.getBounds().top;
        if (rectF != null) {
            f11 = PixelUtil.INSTANCE.dpToPx(rectF.top);
        } else {
            f11 = 0.0f;
        }
        rectF2.top = f15 + f11;
        float f16 = compositeBackgroundDrawable.getBounds().right;
        if (rectF != null) {
            f12 = PixelUtil.INSTANCE.dpToPx(rectF.right);
        } else {
            f12 = 0.0f;
        }
        rectF2.right = f16 - f12;
        float f17 = compositeBackgroundDrawable.getBounds().bottom;
        if (rectF != null) {
            f14 = PixelUtil.INSTANCE.dpToPx(rectF.bottom);
        }
        rectF2.bottom = f17 - f14;
        BorderRadiusStyle borderRadius = compositeBackgroundDrawable.getBorderRadius();
        if (borderRadius == null || !borderRadius.hasRoundedBorders()) {
            rectF2.offset(rect.left, rect.top);
            canvas.clipRect(rectF2);
            if (drawContent != null) {
                drawContent.invoke();
                return;
            }
            return;
        }
        Path createPaddingBoxPath = backgroundStyleApplicator.createPaddingBoxPath(view, compositeBackgroundDrawable, rectF2, rectF);
        createPaddingBoxPath.offset(rect.left, rect.top);
        if (ReactNativeFeatureFlags.enableAndroidAntialiasedBorderRadiusClipping() && Build.VERSION.SDK_INT <= 28 && view.getWidth() > 0 && view.getHeight() > 0 && drawContent != null) {
            backgroundStyleApplicator.clipWithAntiAliasing(view, canvas, createPaddingBoxPath, drawContent);
            return;
        }
        canvas.clipPath(createPaddingBoxPath);
        if (drawContent != null) {
            drawContent.invoke();
        }
    }

    private final void clipWithAntiAliasing(View view, Canvas canvas, Path paddingBoxPath, Function0<Unit> drawContent) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, view.getWidth(), view.getHeight(), null);
        drawContent.invoke();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT >= 28) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            paint.setColor(0);
            paddingBoxPath.setFillType(Path.FillType.INVERSE_WINDING);
            canvas.drawPath(paddingBoxPath, paint);
        } else {
            Path path = new Path();
            path.addRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), Path.Direction.CW);
            path.addPath(paddingBoxPath);
            path.setFillType(Path.FillType.EVEN_ODD);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            paint.setColor(-16777216);
            canvas.drawPath(path, paint);
        }
        canvas.restoreToCount(saveLayer);
    }

    private final Path createPaddingBoxPath(View view, CompositeBackgroundDrawable composite, RectF paddingBoxRect, RectF computedBorderInsets) {
        ComputedBorderRadius computedBorderRadius;
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        BorderRadiusStyle borderRadius = composite.getBorderRadius();
        if (borderRadius != null) {
            int layoutDirection = composite.getLayoutDirection();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            computedBorderRadius = borderRadius.resolve(layoutDirection, context, PixelUtil.toDIPFromPixel(composite.getBounds().width()), PixelUtil.toDIPFromPixel(composite.getBounds().height()));
        } else {
            computedBorderRadius = null;
        }
        Path path = new Path();
        path.addRoundRect(paddingBoxRect, new float[]{getInnerBorderRadius((computedBorderRadius == null || (topLeft2 = computedBorderRadius.getTopLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.left)) : null), getInnerBorderRadius((computedBorderRadius == null || (topLeft = computedBorderRadius.getTopLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topLeft.getVertical())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.top)) : null), getInnerBorderRadius((computedBorderRadius == null || (topRight2 = computedBorderRadius.getTopRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topRight2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.right)) : null), getInnerBorderRadius((computedBorderRadius == null || (topRight = computedBorderRadius.getTopRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topRight.getVertical())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.top)) : null), getInnerBorderRadius((computedBorderRadius == null || (bottomRight2 = computedBorderRadius.getBottomRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomRight2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.right)) : null), getInnerBorderRadius((computedBorderRadius == null || (bottomRight = computedBorderRadius.getBottomRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomRight.getVertical())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.bottom)) : null), getInnerBorderRadius((computedBorderRadius == null || (bottomLeft2 = computedBorderRadius.getBottomLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomLeft2.getHorizontal())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.left)) : null), getInnerBorderRadius((computedBorderRadius == null || (bottomLeft = computedBorderRadius.getBottomLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomLeft.getVertical())), computedBorderInsets != null ? Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.bottom)) : null)}, Path.Direction.CW);
        return path;
    }

    private final BackgroundDrawable ensureBackgroundDrawable(View view) {
        CompositeBackgroundDrawable ensureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        BackgroundDrawable background = ensureCompositeBackgroundDrawable.getBackground();
        if (background != null) {
            return background;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BackgroundDrawable backgroundDrawable = new BackgroundDrawable(context, ensureCompositeBackgroundDrawable.getBorderRadius(), ensureCompositeBackgroundDrawable.getBorderInsets());
        view.setBackground(ensureCompositeBackgroundDrawable.withNewBackground(backgroundDrawable));
        return backgroundDrawable;
    }

    private final BackgroundImageDrawable ensureBackgroundImageDrawable(View view) {
        CompositeBackgroundDrawable ensureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        BackgroundImageDrawable backgroundImage = ensureCompositeBackgroundDrawable.getBackgroundImage();
        if (backgroundImage != null) {
            return backgroundImage;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BackgroundImageDrawable backgroundImageDrawable = new BackgroundImageDrawable(context, ensureCompositeBackgroundDrawable.getBorderRadius(), ensureCompositeBackgroundDrawable.getBorderInsets());
        view.setBackground(ensureCompositeBackgroundDrawable.withNewBackgroundImage(backgroundImageDrawable));
        return backgroundImageDrawable;
    }

    private final BorderDrawable ensureBorderDrawable(View view) {
        CompositeBackgroundDrawable ensureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        BorderDrawable border = ensureCompositeBackgroundDrawable.getBorder();
        if (border != null) {
            return border;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BorderRadiusStyle borderRadius = ensureCompositeBackgroundDrawable.getBorderRadius();
        BorderDrawable borderDrawable = new BorderDrawable(context, new Spacing(0.0f), borderRadius, ensureCompositeBackgroundDrawable.getBorderInsets(), BorderStyle.SOLID);
        view.setBackground(ensureCompositeBackgroundDrawable.withNewBorder(borderDrawable));
        return borderDrawable;
    }

    private final CompositeBackgroundDrawable ensureCompositeBackgroundDrawable(View view) {
        if (view.getBackground() instanceof CompositeBackgroundDrawable) {
            Drawable background = view.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (CompositeBackgroundDrawable) background;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CompositeBackgroundDrawable compositeBackgroundDrawable = new CompositeBackgroundDrawable(context, view.getBackground(), null, null, null, null, null, null, null, null, null, 2044, null);
        view.setBackground(compositeBackgroundDrawable);
        return compositeBackgroundDrawable;
    }

    private final OutlineDrawable ensureOutlineDrawable(View view) {
        CompositeBackgroundDrawable ensureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        OutlineDrawable outline = ensureCompositeBackgroundDrawable.getOutline();
        if (outline != null) {
            return outline;
        }
        BorderRadiusStyle borderRadius = ensureCompositeBackgroundDrawable.getBorderRadius();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OutlineDrawable outlineDrawable = new OutlineDrawable(context, borderRadius, -16777216, 0.0f, OutlineStyle.SOLID, 0.0f);
        view.setBackground(ensureCompositeBackgroundDrawable.withNewOutline(outlineDrawable));
        return outlineDrawable;
    }

    private final BackgroundDrawable getBackground(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getBackground();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final Integer getBackgroundColor(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundDrawable background = INSTANCE.getBackground(view);
        if (background != null) {
            return Integer.valueOf(background.getBackgroundColor());
        }
        return null;
    }

    private final BackgroundImageDrawable getBackgroundImage(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getBackgroundImage();
        }
        return null;
    }

    private final BorderDrawable getBorder(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getBorder();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final Integer getBorderColor(@NotNull View view, @NotNull LogicalEdge edge) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        BorderDrawable border = INSTANCE.getBorder(view);
        if (border != null) {
            return Integer.valueOf(border.getBorderColor(edge));
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final LengthPercentage getBorderRadius(@NotNull View view, @NotNull BorderRadiusProp corner) {
        BorderRadiusStyle borderRadius;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(corner, "corner");
        CompositeBackgroundDrawable compositeBackgroundDrawable = INSTANCE.getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable == null || (borderRadius = compositeBackgroundDrawable.getBorderRadius()) == null) {
            return null;
        }
        return borderRadius.get(corner);
    }

    @JvmStatic
    @Nullable
    public static final BorderStyle getBorderStyle(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BorderDrawable border = INSTANCE.getBorder(view);
        if (border != null) {
            return border.getBorderStyle();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final Float getBorderWidth(@NotNull View view, @NotNull LogicalEdge edge) {
        Spacing borderWidth;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        BorderDrawable border = INSTANCE.getBorder(view);
        Float valueOf = (border == null || (borderWidth = border.getBorderWidth()) == null) ? null : Float.valueOf(borderWidth.getRaw(edge.toSpacingType()));
        if (valueOf == null || Float.isNaN(valueOf.floatValue())) {
            return null;
        }
        return Float.valueOf(PixelUtil.INSTANCE.pxToDp(valueOf.floatValue()));
    }

    private final CompositeBackgroundDrawable getCompositeBackgroundDrawable(View view) {
        Drawable background = view.getBackground();
        if (background instanceof CompositeBackgroundDrawable) {
            return (CompositeBackgroundDrawable) background;
        }
        return null;
    }

    private final float getInnerBorderRadius(Float computedRadius, Float borderWidth) {
        return RangesKt.coerceAtLeast((computedRadius != null ? computedRadius.floatValue() : 0.0f) - (borderWidth != null ? borderWidth.floatValue() : 0.0f), 0.0f);
    }

    @JvmStatic
    @Nullable
    public static final Integer getOutlineColor(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OutlineDrawable outlineDrawable = INSTANCE.getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return Integer.valueOf(outlineDrawable.getOutlineColor());
        }
        return null;
    }

    private final OutlineDrawable getOutlineDrawable(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getOutline();
        }
        return null;
    }

    @JvmStatic
    public static final void reset(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getBackground() instanceof CompositeBackgroundDrawable) {
            Drawable background = view.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            view.setBackground(((CompositeBackgroundDrawable) background).getOriginalBackground());
        }
    }

    @JvmStatic
    public static final void setBackgroundColor(@NotNull View view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if ((color == null || color.intValue() == 0) && !(view.getBackground() instanceof CompositeBackgroundDrawable)) {
            return;
        }
        INSTANCE.ensureBackgroundDrawable(view).setBackgroundColor(color != null ? color.intValue() : 0);
    }

    @JvmStatic
    public static final void setBackgroundImage(@NotNull View view, @Nullable List<BackgroundImageLayer> backgroundImageLayers) {
        Intrinsics.checkNotNullParameter(view, "view");
        INSTANCE.ensureBackgroundImageDrawable(view).setBackgroundImageLayers(backgroundImageLayers);
    }

    @JvmStatic
    public static final void setBackgroundPosition$ReactAndroid_release(@NotNull View view, @Nullable List<BackgroundPosition> backgroundPositions) {
        Intrinsics.checkNotNullParameter(view, "view");
        INSTANCE.ensureBackgroundImageDrawable(view).setBackgroundPosition(backgroundPositions);
    }

    @JvmStatic
    public static final void setBackgroundRepeat$ReactAndroid_release(@NotNull View view, @Nullable List<BackgroundRepeat> backgroundRepeats) {
        Intrinsics.checkNotNullParameter(view, "view");
        INSTANCE.ensureBackgroundImageDrawable(view).setBackgroundRepeat(backgroundRepeats);
    }

    @JvmStatic
    public static final void setBackgroundSize$ReactAndroid_release(@NotNull View view, @Nullable List<? extends BackgroundSize> backgroundSizes) {
        Intrinsics.checkNotNullParameter(view, "view");
        INSTANCE.ensureBackgroundImageDrawable(view).setBackgroundSize(backgroundSizes);
    }

    @JvmStatic
    public static final void setBorderColor(@NotNull View view, @NotNull LogicalEdge edge, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        INSTANCE.ensureBorderDrawable(view).setBorderColor(edge, color);
    }

    @JvmStatic
    public static final void setBorderRadius(@NotNull View view, @NotNull BorderRadiusProp corner, @Nullable LengthPercentage radius) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(corner, "corner");
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        CompositeBackgroundDrawable ensureCompositeBackgroundDrawable = backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view);
        BorderRadiusStyle borderRadius = ensureCompositeBackgroundDrawable.getBorderRadius();
        if (borderRadius == null) {
            borderRadius = new BorderRadiusStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        ensureCompositeBackgroundDrawable.setBorderRadius(borderRadius);
        BorderRadiusStyle borderRadius2 = ensureCompositeBackgroundDrawable.getBorderRadius();
        if (borderRadius2 != null) {
            borderRadius2.set(corner, radius);
        }
        if (view instanceof ImageView) {
            backgroundStyleApplicator.ensureBackgroundDrawable(view);
        }
        BackgroundDrawable background = ensureCompositeBackgroundDrawable.getBackground();
        if (background != null) {
            background.setBorderRadius(ensureCompositeBackgroundDrawable.getBorderRadius());
        }
        BackgroundImageDrawable backgroundImage = ensureCompositeBackgroundDrawable.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.setBorderRadius(ensureCompositeBackgroundDrawable.getBorderRadius());
        }
        BorderDrawable border = ensureCompositeBackgroundDrawable.getBorder();
        if (border != null) {
            border.setBorderRadius(ensureCompositeBackgroundDrawable.getBorderRadius());
        }
        BackgroundDrawable background2 = ensureCompositeBackgroundDrawable.getBackground();
        if (background2 != null) {
            background2.invalidateSelf();
        }
        BackgroundImageDrawable backgroundImage2 = ensureCompositeBackgroundDrawable.getBackgroundImage();
        if (backgroundImage2 != null) {
            backgroundImage2.invalidateSelf();
        }
        BorderDrawable border2 = ensureCompositeBackgroundDrawable.getBorder();
        if (border2 != null) {
            border2.invalidateSelf();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            List<Drawable> outerShadows = ensureCompositeBackgroundDrawable.getOuterShadows();
            ArrayList arrayList = new ArrayList();
            for (Object obj : outerShadows) {
                if (obj instanceof OutsetBoxShadowDrawable) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OutsetBoxShadowDrawable) it.next()).setBorderRadius(ensureCompositeBackgroundDrawable.getBorderRadius());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List<Drawable> innerShadows = ensureCompositeBackgroundDrawable.getInnerShadows();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : innerShadows) {
                if (obj2 instanceof InsetBoxShadowDrawable) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InsetBoxShadowDrawable) it2.next()).setBorderRadius(ensureCompositeBackgroundDrawable.getBorderRadius());
            }
        }
        OutlineDrawable outline = ensureCompositeBackgroundDrawable.getOutline();
        if (outline != null) {
            outline.setBorderRadius(ensureCompositeBackgroundDrawable.getBorderRadius());
        }
        ensureCompositeBackgroundDrawable.invalidateSelf();
    }

    @JvmStatic
    public static final void setBorderStyle(@NotNull View view, @Nullable BorderStyle borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        INSTANCE.ensureBorderDrawable(view).setBorderStyle(borderStyle);
    }

    @JvmStatic
    public static final void setBorderWidth(@NotNull View view, @NotNull LogicalEdge edge, @Nullable Float width) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        CompositeBackgroundDrawable ensureCompositeBackgroundDrawable = backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view);
        BorderInsets borderInsets = ensureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets == null) {
            borderInsets = new BorderInsets();
        }
        ensureCompositeBackgroundDrawable.setBorderInsets(borderInsets);
        BorderInsets borderInsets2 = ensureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets2 != null) {
            borderInsets2.setBorderWidth(edge, width);
        }
        backgroundStyleApplicator.ensureBorderDrawable(view).setBorderWidth(edge.toSpacingType(), width != null ? PixelUtil.INSTANCE.dpToPx(width.floatValue()) : Float.NaN);
        BackgroundDrawable background = ensureCompositeBackgroundDrawable.getBackground();
        if (background != null) {
            background.setBorderInsets(ensureCompositeBackgroundDrawable.getBorderInsets());
        }
        BackgroundImageDrawable backgroundImage = ensureCompositeBackgroundDrawable.getBackgroundImage();
        if (backgroundImage != null) {
            backgroundImage.setBorderInsets(ensureCompositeBackgroundDrawable.getBorderInsets());
        }
        BorderDrawable border = ensureCompositeBackgroundDrawable.getBorder();
        if (border != null) {
            border.setBorderInsets(ensureCompositeBackgroundDrawable.getBorderInsets());
        }
        BackgroundDrawable background2 = ensureCompositeBackgroundDrawable.getBackground();
        if (background2 != null) {
            background2.invalidateSelf();
        }
        BackgroundImageDrawable backgroundImage2 = ensureCompositeBackgroundDrawable.getBackgroundImage();
        if (backgroundImage2 != null) {
            backgroundImage2.invalidateSelf();
        }
        BorderDrawable border2 = ensureCompositeBackgroundDrawable.getBorder();
        if (border2 != null) {
            border2.invalidateSelf();
        }
        BorderInsets borderInsets3 = ensureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets3 == null) {
            borderInsets3 = new BorderInsets();
        }
        ensureCompositeBackgroundDrawable.setBorderInsets(borderInsets3);
        BorderInsets borderInsets4 = ensureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets4 != null) {
            borderInsets4.setBorderWidth(edge, width);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            List<Drawable> innerShadows = ensureCompositeBackgroundDrawable.getInnerShadows();
            ArrayList arrayList = new ArrayList();
            for (Object obj : innerShadows) {
                if (obj instanceof InsetBoxShadowDrawable) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InsetBoxShadowDrawable) it.next()).setBorderInsets(ensureCompositeBackgroundDrawable.getBorderInsets());
            }
        }
    }

    @JvmStatic
    public static final void setBoxShadow(@NotNull View view, @NotNull List<BoxShadow> shadows) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(shadows, "shadows");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        CompositeBackgroundDrawable ensureCompositeBackgroundDrawable = INSTANCE.ensureCompositeBackgroundDrawable(view);
        BorderInsets borderInsets = ensureCompositeBackgroundDrawable.getBorderInsets();
        BorderRadiusStyle borderRadius = ensureCompositeBackgroundDrawable.getBorderRadius();
        for (BoxShadow boxShadow : shadows) {
            float offsetX = boxShadow.getOffsetX();
            float offsetY = boxShadow.getOffsetY();
            Integer color = boxShadow.getColor();
            int intValue = color != null ? color.intValue() : -16777216;
            Float blurRadius = boxShadow.getBlurRadius();
            float floatValue = blurRadius != null ? blurRadius.floatValue() : 0.0f;
            Float spreadDistance = boxShadow.getSpreadDistance();
            float floatValue2 = spreadDistance != null ? spreadDistance.floatValue() : 0.0f;
            Boolean inset = boxShadow.getInset();
            boolean booleanValue = inset != null ? inset.booleanValue() : false;
            if (booleanValue && Build.VERSION.SDK_INT >= 29) {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                arrayList.add(new InsetBoxShadowDrawable(context, intValue, offsetX, offsetY, floatValue, floatValue2, borderInsets, borderRadius));
            } else if (!booleanValue && Build.VERSION.SDK_INT >= 28) {
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                arrayList2.add(new OutsetBoxShadowDrawable(context2, intValue, offsetX, offsetY, floatValue, floatValue2, borderRadius));
            }
        }
        view.setBackground(INSTANCE.ensureCompositeBackgroundDrawable(view).withNewShadows(arrayList2, arrayList));
    }

    @JvmStatic
    public static final void setFeedbackUnderlay(@NotNull View view, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(INSTANCE.ensureCompositeBackgroundDrawable(view).withNewFeedbackUnderlay(drawable));
    }

    @JvmStatic
    public static final void setOutlineColor(@NotNull View view, @Nullable Integer outlineColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        OutlineDrawable ensureOutlineDrawable = INSTANCE.ensureOutlineDrawable(view);
        if (outlineColor != null) {
            ensureOutlineDrawable.setOutlineColor(outlineColor.intValue());
        }
    }

    @JvmStatic
    public static final void setOutlineOffset(@NotNull View view, float outlineOffset) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        INSTANCE.ensureOutlineDrawable(view).setOutlineOffset(PixelUtil.INSTANCE.dpToPx(outlineOffset));
    }

    @JvmStatic
    public static final void setOutlineStyle(@NotNull View view, @Nullable OutlineStyle outlineStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        OutlineDrawable ensureOutlineDrawable = INSTANCE.ensureOutlineDrawable(view);
        if (outlineStyle != null) {
            ensureOutlineDrawable.setOutlineStyle(outlineStyle);
        }
    }

    @JvmStatic
    public static final void setOutlineWidth(@NotNull View view, float width) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        INSTANCE.ensureOutlineDrawable(view).setOutlineWidth(PixelUtil.INSTANCE.dpToPx(width));
    }

    @Nullable
    public final Float getOutlineOffset(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OutlineDrawable outlineDrawable = getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return Float.valueOf(outlineDrawable.getOutlineOffset());
        }
        return null;
    }

    @Nullable
    public final OutlineStyle getOutlineStyle(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OutlineDrawable outlineDrawable = getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return outlineDrawable.getOutlineStyle();
        }
        return null;
    }

    @Nullable
    public final Float getOutlineWidth(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OutlineDrawable outlineDrawable = getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return Float.valueOf(outlineDrawable.getOutlineOffset());
        }
        return null;
    }

    @JvmStatic
    public static final void setBoxShadow(@NotNull View view, @Nullable ReadableArray shadows) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (shadows == null) {
            setBoxShadow(view, (List<BoxShadow>) CollectionsKt.emptyList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = shadows.size();
        for (int i10 = 0; i10 < size; i10++) {
            BoxShadow.Companion companion = BoxShadow.INSTANCE;
            ReadableMap map = shadows.getMap(i10);
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BoxShadow parse = companion.parse(map, context);
            if (parse == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(parse);
        }
        setBoxShadow(view, arrayList);
    }
}
