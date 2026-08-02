package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.a;
import com.google.android.material.shape.b;
import com.google.android.material.shape.d;
import com.unity3d.services.UnityAdsConstants;
import java.util.BitSet;
import java.util.Objects;
import xsna.g6j0;
import xsna.ibp;
import xsna.jl10;
import xsna.l6j0;
import xsna.ot0;
import xsna.rqi;
import xsna.tko;
import xsna.uuj;
import xsna.xsf0;

/* loaded from: classes.dex */
public class MaterialShapeDrawable extends Drawable implements l6j0 {
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    private static final float SHADOW_OFFSET_MULTIPLIER = 0.25f;
    private static final float SHADOW_RADIUS_MULTIPLIER = 0.75f;
    private static final String TAG = "MaterialShapeDrawable";
    private static final Paint clearPaint;
    private final BitSet containsIncompatibleShadowOp;
    private final d.g[] cornerShadowOperation;
    private c drawableState;
    private final d.g[] edgeShadowOperation;
    private final Paint fillPaint;
    private final RectF insetRectF;
    private final Matrix matrix;
    private final Path path;

    @NonNull
    private final RectF pathBounds;
    private boolean pathDirty;
    private final Path pathInsetByStroke;
    private final com.google.android.material.shape.b pathProvider;

    @NonNull
    private final b.InterfaceC0124b pathShadowListener;
    private final RectF rectF;
    private int resolvedTintColor;
    private final Region scratchRegion;
    private boolean shadowBitmapDrawingEnable;
    private final ShadowRenderer shadowRenderer;
    private final Paint strokePaint;
    private com.google.android.material.shape.a strokeShapeAppearance;

    @Nullable
    private PorterDuffColorFilter strokeTintFilter;

    @Nullable
    private PorterDuffColorFilter tintFilter;
    private final Region transparentRegion;

    public class a implements b.InterfaceC0124b {
        public a() {
        }
    }

    /* loaded from: classes13.dex */
    public class b implements a.b {
        public final /* synthetic */ float b;

        public b(float f) {
            this.b = f;
        }

        @Override // com.google.android.material.shape.a.b
        @NonNull
        public final uuj a(@NonNull uuj uujVar) {
            return uujVar instanceof xsf0 ? uujVar : new ot0(this.b, uujVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        clearPaint = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new com.google.android.material.shape.a());
    }

    @Nullable
    private PorterDuffColorFilter calculatePaintColorTintFilter(@NonNull Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int compositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(color);
        this.resolvedTintColor = compositeElevationOverlayIfNeeded;
        if (compositeElevationOverlayIfNeeded != color) {
            return new PorterDuffColorFilter(compositeElevationOverlayIfNeeded, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void calculatePath(@NonNull RectF rectF, @NonNull Path path) {
        calculatePathForSize(rectF, path);
        if (this.drawableState.i != 1.0f) {
            this.matrix.reset();
            Matrix matrix = this.matrix;
            float f = this.drawableState.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.matrix);
        }
        path.computeBounds(this.pathBounds, true);
    }

    private void calculateStrokePath() {
        com.google.android.material.shape.a g = getShapeAppearanceModel().g(new b(-getStrokeInsetLength()));
        this.strokeShapeAppearance = g;
        this.pathProvider.a(g, this.drawableState.j, getBoundsInsetByStroke(), null, this.pathInsetByStroke);
    }

    @NonNull
    private PorterDuffColorFilter calculateTintColorTintFilter(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = compositeElevationOverlayIfNeeded(colorForState);
        }
        this.resolvedTintColor = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @NonNull
    private PorterDuffColorFilter calculateTintFilter(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? calculatePaintColorTintFilter(paint, z) : calculateTintColorTintFilter(colorStateList, mode, z);
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    private void drawCompatShadow(@NonNull Canvas canvas) {
        this.containsIncompatibleShadowOp.cardinality();
        if (this.drawableState.r != 0) {
            canvas.drawPath(this.path, this.shadowRenderer.getShadowPaint());
        }
        for (int i = 0; i < 4; i++) {
            d.g gVar = this.cornerShadowOperation[i];
            ShadowRenderer shadowRenderer = this.shadowRenderer;
            int i2 = this.drawableState.q;
            Matrix matrix = d.g.b;
            gVar.a(matrix, shadowRenderer, i2, canvas);
            this.edgeShadowOperation[i].a(matrix, this.shadowRenderer, this.drawableState.q, canvas);
        }
        if (this.shadowBitmapDrawingEnable) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(this.path, clearPaint);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    private void drawFillShape(@NonNull Canvas canvas) {
        drawShape(canvas, this.fillPaint, this.path, this.drawableState.a, getBoundsAsRectF());
    }

    @NonNull
    private RectF getBoundsInsetByStroke() {
        this.insetRectF.set(getBoundsAsRectF());
        float strokeInsetLength = getStrokeInsetLength();
        this.insetRectF.inset(strokeInsetLength, strokeInsetLength);
        return this.insetRectF;
    }

    private float getStrokeInsetLength() {
        return hasStroke() ? this.strokePaint.getStrokeWidth() / 2.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private boolean hasCompatShadow() {
        c cVar = this.drawableState;
        int i = cVar.p;
        if (i == 1 || cVar.q <= 0) {
            return false;
        }
        return i == 2 || requiresCompatShadow();
    }

    private boolean hasFill() {
        Paint.Style style = this.drawableState.u;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean hasStroke() {
        Paint.Style style = this.drawableState.u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.strokePaint.getStrokeWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private void invalidateSelfIgnoreShape() {
        super.invalidateSelf();
    }

    private void maybeDrawCompatShadow(@NonNull Canvas canvas) {
        if (hasCompatShadow()) {
            canvas.save();
            prepareCanvasForShadow(canvas);
            if (!this.shadowBitmapDrawingEnable) {
                drawCompatShadow(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.pathBounds.width() - getBounds().width());
            int height = (int) (this.pathBounds.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(rqi.a(this.drawableState.q, 2, (int) this.pathBounds.width(), width), rqi.a(this.drawableState.q, 2, (int) this.pathBounds.height(), height), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.drawableState.q) - width;
            float f2 = (getBounds().top - this.drawableState.q) - height;
            canvas2.translate(-f, -f2);
            drawCompatShadow(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int modulateAlpha(int i, int i2) {
        return ((i2 + (i2 >>> 7)) * i) >>> 8;
    }

    private void prepareCanvasForShadow(@NonNull Canvas canvas) {
        canvas.translate(getShadowOffsetX(), getShadowOffsetY());
    }

    private boolean updateColorsForState(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.drawableState.c == null || color2 == (colorForState2 = this.drawableState.c.getColorForState(iArr, (color2 = this.fillPaint.getColor())))) {
            z = false;
        } else {
            this.fillPaint.setColor(colorForState2);
            z = true;
        }
        if (this.drawableState.d == null || color == (colorForState = this.drawableState.d.getColorForState(iArr, (color = this.strokePaint.getColor())))) {
            return z;
        }
        this.strokePaint.setColor(colorForState);
        return true;
    }

    private boolean updateTintFilter() {
        PorterDuffColorFilter porterDuffColorFilter = this.tintFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.strokeTintFilter;
        c cVar = this.drawableState;
        this.tintFilter = calculateTintFilter(cVar.f, cVar.g, this.fillPaint, true);
        c cVar2 = this.drawableState;
        this.strokeTintFilter = calculateTintFilter(cVar2.e, cVar2.g, this.strokePaint, false);
        c cVar3 = this.drawableState;
        if (cVar3.t) {
            this.shadowRenderer.setShadowColor(cVar3.f.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.tintFilter) && Objects.equals(porterDuffColorFilter2, this.strokeTintFilter)) ? false : true;
    }

    private void updateZ() {
        float z = getZ();
        this.drawableState.q = (int) Math.ceil(0.75f * z);
        this.drawableState.r = (int) Math.ceil(z * SHADOW_OFFSET_MULTIPLIER);
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    public void a() {
        invalidateSelf();
    }

    public final void calculatePathForSize(@NonNull RectF rectF, @NonNull Path path) {
        com.google.android.material.shape.b bVar = this.pathProvider;
        c cVar = this.drawableState;
        bVar.a(cVar.a, cVar.j, rectF, this.pathShadowListener, path);
    }

    public int compositeElevationOverlayIfNeeded(int i) {
        float parentAbsoluteElevation = getParentAbsoluteElevation() + getZ();
        ibp ibpVar = this.drawableState.b;
        return ibpVar != null ? ibpVar.a(parentAbsoluteElevation, i) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.fillPaint.setColorFilter(this.tintFilter);
        int alpha = this.fillPaint.getAlpha();
        this.fillPaint.setAlpha(modulateAlpha(alpha, this.drawableState.l));
        this.strokePaint.setColorFilter(this.strokeTintFilter);
        this.strokePaint.setStrokeWidth(this.drawableState.k);
        int alpha2 = this.strokePaint.getAlpha();
        this.strokePaint.setAlpha(modulateAlpha(alpha2, this.drawableState.l));
        if (this.pathDirty) {
            calculateStrokePath();
            calculatePath(getBoundsAsRectF(), this.path);
            this.pathDirty = false;
        }
        maybeDrawCompatShadow(canvas);
        if (hasFill()) {
            drawFillShape(canvas);
        }
        if (hasStroke()) {
            drawStrokeShape(canvas);
        }
        this.fillPaint.setAlpha(alpha);
        this.strokePaint.setAlpha(alpha2);
    }

    public void drawShape(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        drawShape(canvas, paint, path, this.drawableState.a, rectF);
    }

    public void drawStrokeShape(@NonNull Canvas canvas) {
        drawShape(canvas, this.strokePaint, this.pathInsetByStroke, this.strokeShapeAppearance, getBoundsInsetByStroke());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.drawableState.l;
    }

    public float getBottomLeftCornerResolvedSize() {
        return this.drawableState.a.h.a(getBoundsAsRectF());
    }

    public float getBottomRightCornerResolvedSize() {
        return this.drawableState.a.g.a(getBoundsAsRectF());
    }

    @NonNull
    public RectF getBoundsAsRectF() {
        this.rectF.set(getBounds());
        return this.rectF;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    public float getElevation() {
        return this.drawableState.n;
    }

    @Nullable
    public ColorStateList getFillColor() {
        return this.drawableState.c;
    }

    public float getInterpolation() {
        return this.drawableState.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.drawableState.p == 2) {
            return;
        }
        if (isRoundRect()) {
            outline.setRoundRect(getBounds(), getTopLeftCornerResolvedSize() * this.drawableState.j);
        } else {
            calculatePath(getBoundsAsRectF(), this.path);
            tko.e(outline, this.path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.drawableState.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Paint.Style getPaintStyle() {
        return this.drawableState.u;
    }

    public float getParentAbsoluteElevation() {
        return this.drawableState.m;
    }

    @Deprecated
    public void getPathForSize(int i, int i2, @NonNull Path path) {
        calculatePathForSize(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2), path);
    }

    public int getResolvedTintColor() {
        return this.resolvedTintColor;
    }

    public float getScale() {
        return this.drawableState.i;
    }

    public int getShadowCompatRotation() {
        return this.drawableState.s;
    }

    public int getShadowCompatibilityMode() {
        return this.drawableState.p;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        c cVar = this.drawableState;
        return (int) (Math.sin(Math.toRadians(cVar.s)) * cVar.r);
    }

    public int getShadowOffsetY() {
        c cVar = this.drawableState;
        return (int) (Math.cos(Math.toRadians(cVar.s)) * cVar.r);
    }

    public int getShadowRadius() {
        return this.drawableState.q;
    }

    public int getShadowVerticalOffset() {
        return this.drawableState.r;
    }

    @Override // xsna.l6j0
    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.drawableState.a;
    }

    @Nullable
    @Deprecated
    public g6j0 getShapedViewModel() {
        com.google.android.material.shape.a shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof g6j0) {
            return (g6j0) shapeAppearanceModel;
        }
        return null;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.drawableState.d;
    }

    @Nullable
    public ColorStateList getStrokeTintList() {
        return this.drawableState.e;
    }

    public float getStrokeWidth() {
        return this.drawableState.k;
    }

    @Nullable
    public ColorStateList getTintList() {
        return this.drawableState.f;
    }

    public float getTopLeftCornerResolvedSize() {
        return this.drawableState.a.e.a(getBoundsAsRectF());
    }

    public float getTopRightCornerResolvedSize() {
        return this.drawableState.a.f.a(getBoundsAsRectF());
    }

    public float getTranslationZ() {
        return this.drawableState.o;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.transparentRegion.set(getBounds());
        calculatePath(getBoundsAsRectF(), this.path);
        this.scratchRegion.setPath(this.path, this.transparentRegion);
        this.transparentRegion.op(this.scratchRegion, Region.Op.DIFFERENCE);
        return this.transparentRegion;
    }

    public float getZ() {
        return getTranslationZ() + getElevation();
    }

    public void initializeElevationOverlay(Context context) {
        this.drawableState.b = new ibp(context);
        updateZ();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.pathDirty = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        ibp ibpVar = this.drawableState.b;
        return ibpVar != null && ibpVar.a;
    }

    public boolean isElevationOverlayInitialized() {
        return this.drawableState.b != null;
    }

    public boolean isPointInTransparentRegion(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    public boolean isRoundRect() {
        return this.drawableState.a.e(getBoundsAsRectF());
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i = this.drawableState.p;
        return i == 0 || i == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.drawableState.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.drawableState.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.drawableState.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.drawableState.c;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.drawableState = new c(this.drawableState);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.pathDirty = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, xsna.beo0.b
    public boolean onStateChange(int[] iArr) {
        boolean z = updateColorsForState(iArr) || updateTintFilter();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public boolean requiresCompatShadow() {
        return (isRoundRect() || this.path.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.drawableState;
        if (cVar.l != i) {
            cVar.l = i;
            invalidateSelfIgnoreShape();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.drawableState.getClass();
        invalidateSelfIgnoreShape();
    }

    public void setCornerSize(float f) {
        setShapeAppearanceModel(this.drawableState.a.f(f));
    }

    public void setEdgeIntersectionCheckEnable(boolean z) {
        this.pathProvider.l = z;
    }

    public void setElevation(float f) {
        c cVar = this.drawableState;
        if (cVar.n != f) {
            cVar.n = f;
            updateZ();
        }
    }

    public void setFillColor(@Nullable ColorStateList colorStateList) {
        c cVar = this.drawableState;
        if (cVar.c != colorStateList) {
            cVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f) {
        c cVar = this.drawableState;
        if (cVar.j != f) {
            cVar.j = f;
            this.pathDirty = true;
            invalidateSelf();
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        c cVar = this.drawableState;
        if (cVar.h == null) {
            cVar.h = new Rect();
        }
        this.drawableState.h.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.drawableState.u = style;
        invalidateSelfIgnoreShape();
    }

    public void setParentAbsoluteElevation(float f) {
        c cVar = this.drawableState;
        if (cVar.m != f) {
            cVar.m = f;
            updateZ();
        }
    }

    public void setScale(float f) {
        c cVar = this.drawableState;
        if (cVar.i != f) {
            cVar.i = f;
            invalidateSelf();
        }
    }

    public void setShadowBitmapDrawingEnable(boolean z) {
        this.shadowBitmapDrawingEnable = z;
    }

    public void setShadowColor(int i) {
        this.shadowRenderer.setShadowColor(i);
        this.drawableState.t = false;
        invalidateSelfIgnoreShape();
    }

    public void setShadowCompatRotation(int i) {
        c cVar = this.drawableState;
        if (cVar.s != i) {
            cVar.s = i;
            invalidateSelfIgnoreShape();
        }
    }

    public void setShadowCompatibilityMode(int i) {
        c cVar = this.drawableState;
        if (cVar.p != i) {
            cVar.p = i;
            invalidateSelfIgnoreShape();
        }
    }

    @Deprecated
    public void setShadowElevation(int i) {
        setElevation(i);
    }

    @Deprecated
    public void setShadowEnabled(boolean z) {
        setShadowCompatibilityMode(!z ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i) {
        this.drawableState.q = i;
    }

    public void setShadowVerticalOffset(int i) {
        c cVar = this.drawableState;
        if (cVar.r != i) {
            cVar.r = i;
            invalidateSelfIgnoreShape();
        }
    }

    @Override // xsna.l6j0
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        this.drawableState.a = aVar;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(@NonNull g6j0 g6j0Var) {
        setShapeAppearanceModel(g6j0Var);
    }

    public void setStroke(float f, int i) {
        setStrokeWidth(f);
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        c cVar = this.drawableState;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.drawableState.e = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    public void setStrokeWidth(float f) {
        this.drawableState.k = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.drawableState.f = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        c cVar = this.drawableState;
        if (cVar.g != mode) {
            cVar.g = mode;
            updateTintFilter();
            invalidateSelfIgnoreShape();
        }
    }

    public void setTranslationZ(float f) {
        c cVar = this.drawableState;
        if (cVar.o != f) {
            cVar.o = f;
            updateZ();
        }
    }

    public void setUseTintColorForShadow(boolean z) {
        c cVar = this.drawableState;
        if (cVar.t != z) {
            cVar.t = z;
            invalidateSelf();
        }
    }

    public void setZ(float f) {
        setTranslationZ(f - getElevation());
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        this(com.google.android.material.shape.a.c(context, attributeSet, i, i2).a());
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context, float f) {
        return createWithElevationOverlay(context, f, null);
    }

    private void drawShape(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull com.google.android.material.shape.a aVar, @NonNull RectF rectF) {
        if (!aVar.e(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = aVar.f.a(rectF) * this.drawableState.j;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    public void setCornerSize(@NonNull uuj uujVar) {
        com.google.android.material.shape.a aVar = this.drawableState.a;
        aVar.getClass();
        a.C0123a c0123a = new a.C0123a(aVar);
        c0123a.d(uujVar);
        setShapeAppearanceModel(c0123a.a());
    }

    @Deprecated
    public MaterialShapeDrawable(@NonNull g6j0 g6j0Var) {
        this((com.google.android.material.shape.a) g6j0Var);
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context, float f, @Nullable ColorStateList colorStateList) {
        int i;
        if (colorStateList == null) {
            TypedValue c2 = jl10.c(context, R$attr.colorSurface, TAG);
            int i2 = c2.resourceId;
            if (i2 != 0) {
                i = context.getColor(i2);
            } else {
                i = c2.data;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setElevation(f);
        return materialShapeDrawable;
    }

    public void setStroke(float f, @Nullable ColorStateList colorStateList) {
        setStrokeWidth(f);
        setStrokeColor(colorStateList);
    }

    public MaterialShapeDrawable(@NonNull com.google.android.material.shape.a aVar) {
        this(new c(aVar));
    }

    public void setStrokeTint(int i) {
        setStrokeTint(ColorStateList.valueOf(i));
    }

    public MaterialShapeDrawable(@NonNull c cVar) {
        com.google.android.material.shape.b bVar;
        this.cornerShadowOperation = new d.g[4];
        this.edgeShadowOperation = new d.g[4];
        this.containsIncompatibleShadowOp = new BitSet(8);
        this.matrix = new Matrix();
        this.path = new Path();
        this.pathInsetByStroke = new Path();
        this.rectF = new RectF();
        this.insetRectF = new RectF();
        this.transparentRegion = new Region();
        this.scratchRegion = new Region();
        Paint paint = new Paint(1);
        this.fillPaint = paint;
        Paint paint2 = new Paint(1);
        this.strokePaint = paint2;
        this.shadowRenderer = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            bVar = b.a.a;
        } else {
            bVar = new com.google.android.material.shape.b();
        }
        this.pathProvider = bVar;
        this.pathBounds = new RectF();
        this.shadowBitmapDrawingEnable = true;
        this.drawableState = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        updateTintFilter();
        updateColorsForState(getState());
        this.pathShadowListener = new a();
    }

    public static class c extends Drawable.ConstantState {

        @NonNull
        public com.google.android.material.shape.a a;

        @Nullable
        public ibp b;

        @Nullable
        public ColorStateList c;

        @Nullable
        public ColorStateList d;

        @Nullable
        public ColorStateList e;

        @Nullable
        public ColorStateList f;

        @Nullable
        public PorterDuff.Mode g;

        @Nullable
        public Rect h;
        public float i;
        public float j;
        public float k;
        public int l;
        public float m;
        public float n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public boolean t;
        public Paint.Style u;

        public c(@NonNull com.google.android.material.shape.a aVar) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.i = 1.0f;
            this.j = 1.0f;
            this.l = 255;
            this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.a = aVar;
            this.b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.pathDirty = true;
            return materialShapeDrawable;
        }

        public c(@NonNull c cVar) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = PorterDuff.Mode.SRC_IN;
            this.h = null;
            this.i = 1.0f;
            this.j = 1.0f;
            this.l = 255;
            this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.b = cVar.b;
            this.k = cVar.k;
            this.c = cVar.c;
            this.d = cVar.d;
            this.g = cVar.g;
            this.f = cVar.f;
            this.l = cVar.l;
            this.i = cVar.i;
            this.r = cVar.r;
            this.p = cVar.p;
            this.t = cVar.t;
            this.j = cVar.j;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.q = cVar.q;
            this.s = cVar.s;
            this.e = cVar.e;
            this.u = cVar.u;
            if (cVar.h != null) {
                this.h = new Rect(cVar.h);
            }
        }
    }
}
