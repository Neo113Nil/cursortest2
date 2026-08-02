package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.FilterHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0005H\u0017J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0002J\n\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u001f\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/facebook/react/uimanager/drawable/InsetBoxShadowDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", ViewProps.SHADOW_COLOR, "", "offsetX", "", "offsetY", "blurRadius", "spread", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderInsets;", ViewProps.BORDER_RADIUS, "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "<init>", "(Landroid/content/Context;IFFFFLcom/facebook/react/uimanager/style/BorderInsets;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "shadowPaint", "Landroid/graphics/Paint;", "setAlpha", "", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "draw", "canvas", "Landroid/graphics/Canvas;", "computeBorderRadii", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "computeBorderInsets", "Landroid/graphics/RectF;", "innerRadius", "radius", "borderInset", "(FLjava/lang/Float;)F", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInsetBoxShadowDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InsetBoxShadowDrawable.kt\ncom/facebook/react/uimanager/drawable/InsetBoxShadowDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n1#2:197\n11278#3:198\n11613#3,3:199\n*S KotlinDebug\n*F\n+ 1 InsetBoxShadowDrawable.kt\ncom/facebook/react/uimanager/drawable/InsetBoxShadowDrawable\n*L\n139#1:198\n139#1:199,3\n*E\n"})
/* loaded from: classes2.dex */
public final class InsetBoxShadowDrawable extends Drawable {
    private final float blurRadius;

    @Nullable
    private BorderInsets borderInsets;

    @Nullable
    private BorderRadiusStyle borderRadius;

    @NotNull
    private final Context context;
    private final float offsetX;
    private final float offsetY;
    private final int shadowColor;

    @NotNull
    private final Paint shadowPaint;
    private final float spread;

    public /* synthetic */ InsetBoxShadowDrawable(Context context, int i10, float f10, float f11, float f12, float f13, BorderInsets borderInsets, BorderRadiusStyle borderRadiusStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i10, f10, f11, f12, f13, (i11 & 64) != 0 ? null : borderInsets, (i11 & 128) != 0 ? null : borderRadiusStyle);
    }

    private final RectF computeBorderInsets() {
        RectF resolve;
        BorderInsets borderInsets = this.borderInsets;
        if (borderInsets == null || (resolve = borderInsets.resolve(getLayoutDirection(), this.context)) == null) {
            return null;
        }
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        return new RectF(pixelUtil.dpToPx(resolve.left), pixelUtil.dpToPx(resolve.top), pixelUtil.dpToPx(resolve.right), pixelUtil.dpToPx(resolve.bottom));
    }

    private final ComputedBorderRadius computeBorderRadii() {
        ComputedBorderRadius computedBorderRadius;
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.context;
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            computedBorderRadius = borderRadiusStyle.resolve(layoutDirection, context, pixelUtil.pxToDp(getBounds().width()), pixelUtil.pxToDp(getBounds().height()));
        } else {
            computedBorderRadius = null;
        }
        if (computedBorderRadius == null || !computedBorderRadius.hasRoundedBorders()) {
            return null;
        }
        PixelUtil pixelUtil2 = PixelUtil.INSTANCE;
        return new ComputedBorderRadius(new CornerRadii(pixelUtil2.dpToPx(computedBorderRadius.getTopLeft().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadius.getTopLeft().getVertical())), new CornerRadii(pixelUtil2.dpToPx(computedBorderRadius.getTopRight().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadius.getTopRight().getVertical())), new CornerRadii(pixelUtil2.dpToPx(computedBorderRadius.getBottomLeft().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadius.getBottomLeft().getVertical())), new CornerRadii(pixelUtil2.dpToPx(computedBorderRadius.getBottomRight().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadius.getBottomRight().getVertical())));
    }

    private final float innerRadius(float radius, Float borderInset) {
        return RangesKt.coerceAtLeast(radius - (borderInset != null ? borderInset.floatValue() : 0.0f), 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Canvas canvas2;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ComputedBorderRadius computeBorderRadii = computeBorderRadii();
        RectF computeBorderInsets = computeBorderInsets();
        RectF rectF = new RectF(getBounds().left + (computeBorderInsets != null ? computeBorderInsets.left : 0.0f), getBounds().top + (computeBorderInsets != null ? computeBorderInsets.top : 0.0f), getBounds().right - (computeBorderInsets != null ? computeBorderInsets.right : 0.0f), getBounds().bottom - (computeBorderInsets != null ? computeBorderInsets.bottom : 0.0f));
        float[] fArr4 = computeBorderRadii != null ? new float[]{innerRadius(computeBorderRadii.getTopLeft().getHorizontal(), computeBorderInsets != null ? Float.valueOf(computeBorderInsets.left) : null), innerRadius(computeBorderRadii.getTopLeft().getVertical(), computeBorderInsets != null ? Float.valueOf(computeBorderInsets.top) : null), innerRadius(computeBorderRadii.getTopRight().getHorizontal(), computeBorderInsets != null ? Float.valueOf(computeBorderInsets.right) : null), innerRadius(computeBorderRadii.getTopRight().getVertical(), computeBorderInsets != null ? Float.valueOf(computeBorderInsets.top) : null), innerRadius(computeBorderRadii.getBottomRight().getHorizontal(), computeBorderInsets != null ? Float.valueOf(computeBorderInsets.right) : null), innerRadius(computeBorderRadii.getBottomRight().getVertical(), computeBorderInsets != null ? Float.valueOf(computeBorderInsets.bottom) : null), innerRadius(computeBorderRadii.getBottomLeft().getHorizontal(), computeBorderInsets != null ? Float.valueOf(computeBorderInsets.left) : null), innerRadius(computeBorderRadii.getBottomLeft().getVertical(), computeBorderInsets != null ? Float.valueOf(computeBorderInsets.bottom) : null)} : null;
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        float dpToPx = pixelUtil.dpToPx(this.offsetX);
        float dpToPx2 = pixelUtil.dpToPx(this.offsetY);
        float dpToPx3 = pixelUtil.dpToPx(this.spread);
        RectF rectF2 = new RectF(rectF);
        if (2 * dpToPx3 > rectF.width()) {
            rectF2.setEmpty();
        } else {
            rectF2.inset(dpToPx3, dpToPx3);
        }
        rectF2.offset(dpToPx, dpToPx2);
        float sigmaToRadius$ReactAndroid_release = FilterHelper.INSTANCE.sigmaToRadius$ReactAndroid_release(this.blurRadius);
        RectF rectF3 = new RectF(rectF2);
        rectF3.set(rectF);
        float f10 = -sigmaToRadius$ReactAndroid_release;
        rectF3.inset(f10, f10);
        rectF3.union(new RectF(rectF2));
        int save = canvas.save();
        if (fArr4 != null) {
            Path path = new Path();
            path.addRoundRect(rectF, fArr4, Path.Direction.CW);
            canvas.clipPath(path);
            ArrayList arrayList = new ArrayList(fArr4.length);
            for (float f11 : fArr4) {
                arrayList.add(Float.valueOf(BoxShadowBorderRadiusKt.adjustRadiusForSpread(f11, -dpToPx3)));
            }
            float[] floatArray = CollectionsKt.toFloatArray(arrayList);
            fArr3 = InsetBoxShadowDrawableKt.ZERO_RADII;
            canvas2 = canvas;
            canvas2.drawDoubleRoundRect(rectF3, fArr3, rectF2, floatArray, this.shadowPaint);
        } else {
            canvas2 = canvas;
            canvas2.clipRect(rectF);
            fArr = InsetBoxShadowDrawableKt.ZERO_RADII;
            fArr2 = InsetBoxShadowDrawableKt.ZERO_RADII;
            canvas2.drawDoubleRoundRect(rectF3, fArr, rectF2, fArr2, this.shadowPaint);
        }
        canvas2.restoreToCount(save);
    }

    @Nullable
    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    @Nullable
    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        int alpha = this.shadowPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.shadowPaint.setAlpha(MathKt.roundToInt((alpha / 255.0f) * (Color.alpha(this.shadowColor) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public final void setBorderInsets(@Nullable BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(@Nullable BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.shadowPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public InsetBoxShadowDrawable(@NotNull Context context, int i10, float f10, float f11, float f12, float f13, @Nullable BorderInsets borderInsets, @Nullable BorderRadiusStyle borderRadiusStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.shadowColor = i10;
        this.offsetX = f10;
        this.offsetY = f11;
        this.blurRadius = f12;
        this.spread = f13;
        this.borderInsets = borderInsets;
        this.borderRadius = borderRadiusStyle;
        Paint paint = new Paint();
        paint.setColor(i10);
        float sigmaToRadius$ReactAndroid_release = FilterHelper.INSTANCE.sigmaToRadius$ReactAndroid_release(f12 * 0.5f);
        if (sigmaToRadius$ReactAndroid_release > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(sigmaToRadius$ReactAndroid_release, BlurMaskFilter.Blur.NORMAL));
        }
        this.shadowPaint = paint;
    }
}
