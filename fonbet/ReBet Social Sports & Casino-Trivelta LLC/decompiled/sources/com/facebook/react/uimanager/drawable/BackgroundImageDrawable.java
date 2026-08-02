package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BackgroundPosition;
import com.facebook.react.uimanager.style.BackgroundRepeat;
import com.facebook.react.uimanager.style.BackgroundRepeatKeyword;
import com.facebook.react.uimanager.style.BackgroundSize;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u000203H\u0014J\u0010\u00104\u001a\u0002002\u0006\u00105\u001a\u000206H\u0016J\u0012\u00107\u001a\u0002002\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u000206H\u0017J\u0010\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\u0017H\u0002J\u0018\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u0017H\u0002J\b\u0010B\u001a\u000200H\u0002J\u0018\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020DH\u0002JH\u0010H\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D0I2\u0006\u0010J\u001a\u00020D2\u0006\u0010K\u001a\u00020D2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010N\u001a\u0004\u0018\u00010)H\u0002J.\u0010O\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D0I2\u0006\u0010P\u001a\u00020D2\u0006\u0010Q\u001a\u00020D2\b\u0010R\u001a\u0004\u0018\u00010%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R4\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R4\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R4\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", ViewProps.BORDER_RADIUS, "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderInsets;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;Lcom/facebook/react/uimanager/style/BorderInsets;)V", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "needUpdatePath", "", "backgroundImageClipPath", "Landroid/graphics/Path;", "backgroundPositioningArea", "Landroid/graphics/RectF;", "backgroundPaintingArea", EventKeys.VALUE_KEY, "", "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;", "backgroundImageLayers", "getBackgroundImageLayers", "()Ljava/util/List;", "setBackgroundImageLayers", "(Ljava/util/List;)V", "Lcom/facebook/react/uimanager/style/BackgroundSize;", "backgroundSize", "getBackgroundSize", "setBackgroundSize", "Lcom/facebook/react/uimanager/style/BackgroundPosition;", "backgroundPosition", "getBackgroundPosition", "setBackgroundPosition", "Lcom/facebook/react/uimanager/style/BackgroundRepeat;", "backgroundRepeat", "getBackgroundRepeat", "setBackgroundRepeat", "backgroundPaint", "Landroid/graphics/Paint;", "invalidateSelf", "", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "draw", "canvas", "Landroid/graphics/Canvas;", "computeBorderInsets", "hasInvalidDimensions", "positioningArea", "paintingArea", "updatePath", "positionToPixels", "", "lengthPercentage", "Lcom/facebook/react/uimanager/LengthPercentage;", "availableSpace", "calculateBackgroundImageSize", "Lkotlin/Pair;", "containerWidth", "containerHeight", "imageWidth", "imageHeight", "repeat", "calculateBackgroundPosition", "tileWidth", "tileHeight", ViewProps.POSITION, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackgroundImageDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundImageDrawable.kt\ncom/facebook/react/uimanager/drawable/BackgroundImageDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
/* loaded from: classes2.dex */
public final class BackgroundImageDrawable extends Drawable {

    @Nullable
    private Path backgroundImageClipPath;

    @Nullable
    private List<BackgroundImageLayer> backgroundImageLayers;

    @NotNull
    private final Paint backgroundPaint;

    @Nullable
    private RectF backgroundPaintingArea;

    @Nullable
    private List<BackgroundPosition> backgroundPosition;

    @Nullable
    private RectF backgroundPositioningArea;

    @Nullable
    private List<BackgroundRepeat> backgroundRepeat;

    @Nullable
    private List<? extends BackgroundSize> backgroundSize;

    @Nullable
    private BorderInsets borderInsets;

    @Nullable
    private BorderRadiusStyle borderRadius;

    @NotNull
    private final Context context;
    private boolean needUpdatePath;

    public /* synthetic */ BackgroundImageDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : borderRadiusStyle, (i10 & 4) != 0 ? null : borderInsets);
    }

    private final Pair<Float, Float> calculateBackgroundImageSize(float containerWidth, float containerHeight, float imageWidth, float imageHeight, BackgroundSize backgroundSize, BackgroundRepeat repeat) {
        if (backgroundSize instanceof BackgroundSize.LengthPercentageAuto) {
            BackgroundSize.LengthPercentageAuto lengthPercentageAuto = (BackgroundSize.LengthPercentageAuto) backgroundSize;
            LengthPercentage x10 = lengthPercentageAuto.getLengthPercentage().getX();
            LengthPercentage y10 = lengthPercentageAuto.getLengthPercentage().getY();
            if (x10 != null && y10 != null) {
                imageWidth = positionToPixels(x10, containerWidth);
                imageHeight = positionToPixels(y10, containerHeight);
            }
        }
        BackgroundRepeatKeyword x11 = repeat != null ? repeat.getX() : null;
        BackgroundRepeatKeyword backgroundRepeatKeyword = BackgroundRepeatKeyword.Round;
        if (x11 == backgroundRepeatKeyword && imageWidth > 0.0f && !FloatUtil.floatsEqual(containerWidth % imageWidth, 0.0f)) {
            float rint = (float) Math.rint(containerWidth / imageWidth);
            if (rint > 0.0f) {
                imageWidth = containerWidth / rint;
            }
        }
        if ((repeat != null ? repeat.getY() : null) == backgroundRepeatKeyword && imageHeight > 0.0f && !FloatUtil.floatsEqual(containerHeight % imageHeight, 0.0f)) {
            float rint2 = (float) Math.rint(containerHeight / imageHeight);
            if (rint2 > 0.0f) {
                imageHeight = containerHeight / rint2;
            }
        }
        return TuplesKt.to(Float.valueOf(imageWidth), Float.valueOf(imageHeight));
    }

    private final Pair<Float, Float> calculateBackgroundPosition(float tileWidth, float tileHeight, BackgroundPosition position) {
        float positionToPixels;
        float f10 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        RectF rectF = this.backgroundPositioningArea;
        if (rectF == null) {
            return TuplesKt.to(valueOf, valueOf);
        }
        float width = rectF.width() - tileWidth;
        float height = rectF.height() - tileHeight;
        if ((position != null ? position.getLeft() : null) != null) {
            positionToPixels = positionToPixels(position.getLeft(), width);
        } else {
            positionToPixels = (position != null ? position.getRight() : null) != null ? width - positionToPixels(position.getRight(), width) : 0.0f;
        }
        float f11 = positionToPixels + rectF.left;
        if ((position != null ? position.getTop() : null) != null) {
            f10 = positionToPixels(position.getTop(), height);
        } else {
            if ((position != null ? position.getBottom() : null) != null) {
                f10 = height - positionToPixels(position.getBottom(), height);
            }
        }
        return TuplesKt.to(Float.valueOf(f11), Float.valueOf(f10 + rectF.top));
    }

    private final RectF computeBorderInsets() {
        BorderInsets borderInsets = this.borderInsets;
        RectF resolve = borderInsets != null ? borderInsets.resolve(getLayoutDirection(), this.context) : null;
        return new RectF(resolve != null ? PixelUtil.INSTANCE.dpToPx(resolve.left) : 0.0f, resolve != null ? PixelUtil.INSTANCE.dpToPx(resolve.top) : 0.0f, resolve != null ? PixelUtil.INSTANCE.dpToPx(resolve.right) : 0.0f, resolve != null ? PixelUtil.INSTANCE.dpToPx(resolve.bottom) : 0.0f);
    }

    private final boolean hasInvalidDimensions(RectF positioningArea, RectF paintingArea) {
        return FloatUtil.floatsEqual(positioningArea.width(), 0.0f) || positioningArea.width() < 0.0f || FloatUtil.floatsEqual(positioningArea.height(), 0.0f) || positioningArea.height() < 0.0f || FloatUtil.floatsEqual(paintingArea.width(), 0.0f) || paintingArea.width() < 0.0f || FloatUtil.floatsEqual(paintingArea.height(), 0.0f) || paintingArea.height() < 0.0f;
    }

    private final float positionToPixels(LengthPercentage lengthPercentage, float availableSpace) {
        return lengthPercentage.getType() == LengthPercentageType.PERCENT ? lengthPercentage.resolve(availableSpace) : PixelUtil.INSTANCE.dpToPx(lengthPercentage.resolve(availableSpace));
    }

    private final void updatePath() {
        ComputedBorderRadius computedBorderRadius;
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        if (this.needUpdatePath) {
            this.needUpdatePath = false;
            RectF computeBorderInsets = computeBorderInsets();
            this.backgroundPositioningArea = new RectF(getBounds().left + computeBorderInsets.left, getBounds().top + computeBorderInsets.top, getBounds().right - computeBorderInsets.right, getBounds().bottom - computeBorderInsets.bottom);
            this.backgroundPaintingArea = new RectF(getBounds());
            BorderRadiusStyle borderRadiusStyle = this.borderRadius;
            if (borderRadiusStyle != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.context;
                PixelUtil pixelUtil = PixelUtil.INSTANCE;
                computedBorderRadius = borderRadiusStyle.resolve(layoutDirection, context, pixelUtil.pxToDp(getBounds().width()), pixelUtil.pxToDp(getBounds().height()));
            } else {
                computedBorderRadius = null;
            }
            BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
            if (borderRadiusStyle2 == null || !borderRadiusStyle2.hasRoundedBorders()) {
                RectF rectF = this.backgroundPaintingArea;
                if (rectF == null) {
                    return;
                }
                Path path = new Path();
                this.backgroundImageClipPath = path;
                path.addRect(rectF, Path.Direction.CW);
                return;
            }
            RectF rectF2 = this.backgroundPaintingArea;
            if (rectF2 == null) {
                return;
            }
            Path path2 = new Path();
            this.backgroundImageClipPath = path2;
            float f10 = 0.0f;
            float dpToPx = (computedBorderRadius == null || (topLeft2 = computedBorderRadius.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal());
            float dpToPx2 = (computedBorderRadius == null || (topLeft = computedBorderRadius.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft.getVertical());
            float dpToPx3 = (computedBorderRadius == null || (topRight2 = computedBorderRadius.getTopRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topRight2.getHorizontal());
            float dpToPx4 = (computedBorderRadius == null || (topRight = computedBorderRadius.getTopRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topRight.getVertical());
            float dpToPx5 = (computedBorderRadius == null || (bottomRight2 = computedBorderRadius.getBottomRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomRight2.getHorizontal());
            float dpToPx6 = (computedBorderRadius == null || (bottomRight = computedBorderRadius.getBottomRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomRight.getVertical());
            float dpToPx7 = (computedBorderRadius == null || (bottomLeft2 = computedBorderRadius.getBottomLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomLeft2.getHorizontal());
            if (computedBorderRadius != null && (bottomLeft = computedBorderRadius.getBottomLeft()) != null) {
                f10 = PixelUtil.INSTANCE.dpToPx(bottomLeft.getVertical());
            }
            path2.addRoundRect(rectF2, new float[]{dpToPx, dpToPx2, dpToPx3, dpToPx4, dpToPx5, dpToPx6, dpToPx7, f10}, Path.Direction.CW);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(@NotNull Canvas canvas) {
        RectF rectF;
        int size;
        int i10;
        RectF rectF2;
        RectF rectF3;
        BackgroundRepeatKeyword backgroundRepeatKeyword;
        float f10;
        float f11;
        BackgroundRepeat backgroundRepeat;
        float f12;
        int i11;
        int i12;
        float f13;
        BackgroundRepeatKeyword backgroundRepeatKeyword2;
        float f14;
        float f15;
        int i13;
        int i14;
        float f16;
        int i15;
        BackgroundImageDrawable backgroundImageDrawable = this;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        List<BackgroundImageLayer> list = backgroundImageDrawable.backgroundImageLayers;
        if (list != null) {
            int i16 = 1;
            if (list != null && list.isEmpty()) {
                return;
            }
            backgroundImageDrawable.updatePath();
            RectF rectF4 = backgroundImageDrawable.backgroundPaintingArea;
            if (rectF4 != null && (rectF = backgroundImageDrawable.backgroundPositioningArea) != null && !backgroundImageDrawable.hasInvalidDimensions(rectF, rectF4)) {
                canvas2.save();
                Path path = backgroundImageDrawable.backgroundImageClipPath;
                if (path != null) {
                    canvas2.clipPath(path);
                }
                List<BackgroundImageLayer> list2 = backgroundImageDrawable.backgroundImageLayers;
                if (list2 != null && list2.size() - 1 >= 0) {
                    while (true) {
                        int i17 = size - 1;
                        BackgroundImageLayer backgroundImageLayer = list2.get(size);
                        List<? extends BackgroundSize> list3 = backgroundImageDrawable.backgroundSize;
                        BackgroundSize backgroundSize = list3 != null ? (BackgroundSize) CollectionsKt.getOrNull(list3, size % list3.size()) : null;
                        List<BackgroundRepeat> list4 = backgroundImageDrawable.backgroundRepeat;
                        BackgroundRepeat backgroundRepeat2 = list4 != null ? (BackgroundRepeat) CollectionsKt.getOrNull(list4, size % list4.size()) : null;
                        List<BackgroundPosition> list5 = backgroundImageDrawable.backgroundPosition;
                        BackgroundPosition backgroundPosition = list5 != null ? (BackgroundPosition) CollectionsKt.getOrNull(list5, size % list5.size()) : null;
                        Pair<Float, Float> calculateBackgroundImageSize = backgroundImageDrawable.calculateBackgroundImageSize(rectF.width(), rectF.height(), rectF.width(), rectF.height(), backgroundSize, backgroundRepeat2);
                        BackgroundRepeat backgroundRepeat3 = backgroundRepeat2;
                        BackgroundImageDrawable backgroundImageDrawable2 = backgroundImageDrawable;
                        float floatValue = calculateBackgroundImageSize.component1().floatValue();
                        float floatValue2 = calculateBackgroundImageSize.component2().floatValue();
                        if (floatValue <= 0.0f || floatValue2 <= 0.0f) {
                            i10 = i16;
                            rectF2 = rectF4;
                            rectF3 = rectF;
                        } else {
                            backgroundImageDrawable2.backgroundPaint.setShader(backgroundImageLayer.getShader(floatValue, floatValue2));
                            Pair<Float, Float> calculateBackgroundPosition = backgroundImageDrawable2.calculateBackgroundPosition(floatValue, floatValue2, backgroundPosition);
                            float floatValue3 = calculateBackgroundPosition.component1().floatValue();
                            float floatValue4 = calculateBackgroundPosition.component2().floatValue();
                            if (backgroundRepeat3 == null || (backgroundRepeatKeyword = backgroundRepeat3.getX()) == null) {
                                backgroundRepeatKeyword = BackgroundRepeatKeyword.Repeat;
                            }
                            BackgroundRepeatKeyword backgroundRepeatKeyword3 = BackgroundRepeatKeyword.Space;
                            if (backgroundRepeatKeyword == backgroundRepeatKeyword3) {
                                float width = rectF4.width() - (2 * floatValue);
                                i10 = i16;
                                RectF rectF5 = rectF4;
                                if (((float) Math.rint(floatValue)) <= 0.0f || (width <= 0.0f && !FloatUtil.floatsEqual(width, 0.0f))) {
                                    f11 = 0.0f;
                                    f10 = floatValue4;
                                    rectF2 = rectF5;
                                } else {
                                    f10 = floatValue4;
                                    int floor = (int) Math.floor(((float) Math.rint(width)) / r8);
                                    int i18 = floor + 2;
                                    float f17 = (width - (floor * floatValue)) / (floor + 1);
                                    rectF2 = rectF5;
                                    floatValue3 = rectF2.left;
                                    backgroundRepeat = backgroundRepeat3;
                                    f12 = 0.0f;
                                    rectF3 = rectF;
                                    f13 = f17;
                                    i12 = i18;
                                    if (backgroundRepeat != null || (backgroundRepeatKeyword2 = backgroundRepeat.getY()) == null) {
                                        backgroundRepeatKeyword2 = BackgroundRepeatKeyword.Repeat;
                                    }
                                    if (backgroundRepeatKeyword2 == backgroundRepeatKeyword3) {
                                        float height = rectF2.height() - (2 * floatValue2);
                                        if (((float) Math.rint(floatValue2)) > f12 && (height > f12 || FloatUtil.floatsEqual(height, f12))) {
                                            int floor2 = (int) Math.floor(((float) Math.rint(height)) / r1);
                                            f10 = rectF2.top;
                                            f14 = f13;
                                            i14 = floor2 + 2;
                                            f16 = (height - (floor2 * floatValue2)) / (floor2 + 1);
                                            float f18 = floatValue3;
                                            i15 = 0;
                                            while (i15 < i12) {
                                                int i19 = 0;
                                                float f19 = f10;
                                                while (i19 < i14) {
                                                    canvas2.save();
                                                    canvas2.translate(f18, f19);
                                                    canvas2.drawRect(0.0f, 0.0f, floatValue, floatValue2, backgroundImageDrawable2.backgroundPaint);
                                                    canvas.restore();
                                                    f19 += floatValue2 + f16;
                                                    i19++;
                                                    i12 = i12;
                                                    i15 = i15;
                                                    canvas2 = canvas;
                                                }
                                                f18 += floatValue + f14;
                                                i15++;
                                                i12 = i12;
                                                canvas2 = canvas;
                                            }
                                        }
                                    } else if (backgroundRepeatKeyword2 == BackgroundRepeatKeyword.Round || backgroundRepeatKeyword2 == BackgroundRepeatKeyword.Repeat) {
                                        if (((float) Math.rint(floatValue2)) > 0.0f) {
                                            int ceil = (int) Math.ceil(((float) Math.rint(r2)) / r1);
                                            f14 = f13;
                                            int ceil2 = ((int) Math.ceil(((float) Math.rint(rectF2.height() - r2)) / r1)) + ceil;
                                            f15 = f10 - (ceil * floatValue2);
                                            i13 = ceil2;
                                        } else {
                                            f14 = f13;
                                            f15 = f10;
                                            i13 = i10;
                                        }
                                        f10 = f15;
                                        i14 = i13;
                                        f16 = 0.0f;
                                        float f182 = floatValue3;
                                        i15 = 0;
                                        while (i15 < i12) {
                                        }
                                    }
                                    f14 = f13;
                                    i14 = i10;
                                    f16 = 0.0f;
                                    float f1822 = floatValue3;
                                    i15 = 0;
                                    while (i15 < i12) {
                                    }
                                }
                            } else {
                                f10 = floatValue4;
                                i10 = i16;
                                rectF2 = rectF4;
                                f11 = 0.0f;
                                if (backgroundRepeatKeyword == BackgroundRepeatKeyword.Round || backgroundRepeatKeyword == BackgroundRepeatKeyword.Repeat) {
                                    if (((float) Math.rint(floatValue)) > 0.0f) {
                                        rectF3 = rectF;
                                        int ceil3 = (int) Math.ceil(((float) Math.rint(floatValue3)) / r0);
                                        f12 = 0.0f;
                                        backgroundRepeat = backgroundRepeat3;
                                        int ceil4 = ((int) Math.ceil(((float) Math.rint(rectF2.width() - floatValue3)) / r0)) + ceil3;
                                        floatValue3 -= ceil3 * floatValue;
                                        i11 = ceil4;
                                    } else {
                                        backgroundRepeat = backgroundRepeat3;
                                        f12 = 0.0f;
                                        rectF3 = rectF;
                                        i11 = i10;
                                    }
                                    i12 = i11;
                                    f13 = f12;
                                    if (backgroundRepeat != null) {
                                    }
                                    backgroundRepeatKeyword2 = BackgroundRepeatKeyword.Repeat;
                                    if (backgroundRepeatKeyword2 == backgroundRepeatKeyword3) {
                                    }
                                    f14 = f13;
                                    i14 = i10;
                                    f16 = 0.0f;
                                    float f18222 = floatValue3;
                                    i15 = 0;
                                    while (i15 < i12) {
                                    }
                                }
                            }
                            backgroundRepeat = backgroundRepeat3;
                            f12 = f11;
                            rectF3 = rectF;
                            i12 = i10;
                            f13 = f12;
                            if (backgroundRepeat != null) {
                            }
                            backgroundRepeatKeyword2 = BackgroundRepeatKeyword.Repeat;
                            if (backgroundRepeatKeyword2 == backgroundRepeatKeyword3) {
                            }
                            f14 = f13;
                            i14 = i10;
                            f16 = 0.0f;
                            float f182222 = floatValue3;
                            i15 = 0;
                            while (i15 < i12) {
                            }
                        }
                        if (i17 < 0) {
                            break;
                        }
                        canvas2 = canvas;
                        backgroundImageDrawable = backgroundImageDrawable2;
                        rectF4 = rectF2;
                        size = i17;
                        rectF = rectF3;
                        i16 = i10;
                    }
                }
                canvas.restore();
            }
        }
    }

    @Nullable
    public final List<BackgroundImageLayer> getBackgroundImageLayers() {
        return this.backgroundImageLayers;
    }

    @Nullable
    public final List<BackgroundPosition> getBackgroundPosition() {
        return this.backgroundPosition;
    }

    @Nullable
    public final List<BackgroundRepeat> getBackgroundRepeat() {
        return this.backgroundRepeat;
    }

    @Nullable
    public final List<BackgroundSize> getBackgroundSize() {
        return this.backgroundSize;
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
        int alpha = this.backgroundPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
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
        this.backgroundPaint.setAlpha(alpha);
        invalidateSelf();
    }

    public final void setBackgroundImageLayers(@Nullable List<BackgroundImageLayer> list) {
        if (Intrinsics.areEqual(this.backgroundImageLayers, list)) {
            return;
        }
        this.backgroundImageLayers = list;
        invalidateSelf();
    }

    public final void setBackgroundPosition(@Nullable List<BackgroundPosition> list) {
        if (Intrinsics.areEqual(this.backgroundPosition, list)) {
            return;
        }
        this.backgroundPosition = list;
        invalidateSelf();
    }

    public final void setBackgroundRepeat(@Nullable List<BackgroundRepeat> list) {
        if (Intrinsics.areEqual(this.backgroundRepeat, list)) {
            return;
        }
        this.backgroundRepeat = list;
        invalidateSelf();
    }

    public final void setBackgroundSize(@Nullable List<? extends BackgroundSize> list) {
        if (Intrinsics.areEqual(this.backgroundSize, list)) {
            return;
        }
        this.backgroundSize = list;
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
    }

    public BackgroundImageDrawable(@NotNull Context context, @Nullable BorderRadiusStyle borderRadiusStyle, @Nullable BorderInsets borderInsets) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = borderInsets;
        this.needUpdatePath = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
    }
}
