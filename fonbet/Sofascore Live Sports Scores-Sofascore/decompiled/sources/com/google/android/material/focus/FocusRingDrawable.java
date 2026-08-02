package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.eb;
import defpackage.ge8;
import defpackage.he8;
import defpackage.p7g;
import defpackage.pjf;
import defpackage.q0;
import defpackage.qn2;
import defpackage.qzb;
import defpackage.ug5;
import defpackage.vah;
import defpackage.x2a;
import defpackage.xah;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable p = new ColorDrawable(0);
    public static final int[] q = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator r = new OvershootInterpolator(4.0f);
    public static final ge8 s = new ge8("interpolation");
    public final Paint a;
    public final RectF b;
    public final Rect c;
    public final Path d;
    public final Path e;
    public final Matrix f;
    public final qn2 g;
    public WeakReference h;
    public float i;
    public ObjectAnimator j;
    public float k;
    public boolean l;
    public boolean m;
    public boolean n;
    public he8 o;

    private FocusRingDrawable(@NonNull he8 he8Var, @Nullable Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = qn2.k();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        he8 he8Var2 = new he8(he8Var);
        this.o = he8Var2;
        Drawable.ConstantState constantState = he8Var2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.o.j)) {
            return;
        }
        paint.setStrokeWidth(this.o.j);
    }

    public static FocusRingDrawable c(Drawable drawable) {
        if (drawable instanceof FocusRingDrawable) {
            return (FocusRingDrawable) drawable;
        }
        if (drawable instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable2;
            }
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            Drawable drawable3 = layerDrawable.getDrawable(i);
            if (drawable3 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable3;
            }
        }
        return null;
    }

    public static int d(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static FocusRingDrawable f(Context context, LayerDrawable layerDrawable, qzb qzbVar) {
        if (!x2a.L(context.getTheme(), com.sofascore.results.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, p);
        if (qzbVar != null) {
            focusRingDrawable.h = new WeakReference(qzbVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public static float g(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(RectF rectF) {
        Rect rect = this.o.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.h;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((qzb) this.h.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.c;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        e(theme);
    }

    public final void b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.b;
        a(rectF);
        float f3 = f * 2.0f;
        float width = 1.0f - (f3 / rectF.width());
        float height = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.f;
        matrix.reset();
        matrix.postScale(width, height, rectF.centerX(), rectF.centerY());
        Path path2 = this.d;
        path.transform(matrix, path2);
        float f4 = f2 * this.k;
        Paint paint = this.a;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0046, code lost:
    
        if (r1.isEmpty() == false) goto L9;
     */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        int radius;
        super.draw(canvas);
        he8 he8Var = this.o;
        if (he8Var.c && this.m) {
            float f2 = he8Var.p;
            float f3 = he8Var.j / 2.0f;
            float f4 = this.k;
            float f5 = (f3 * f4) + f2;
            float f6 = ((he8Var.l / 2.0f) * f4) + f2 + he8Var.r;
            Path path = this.e;
            if (path.isEmpty()) {
                WeakReference weakReference = this.h;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((qzb) this.h.get()).i;
                }
                path = null;
            }
            Path path2 = path;
            he8 he8Var2 = this.o;
            if (path2 != null) {
                b(canvas, path2, f6, he8Var2.l, he8Var2.h);
                he8 he8Var3 = this.o;
                b(canvas, path2, f5, he8Var3.j, he8Var3.f);
                return;
            }
            if (Float.isNaN(he8Var2.n)) {
                f = this.i;
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    WeakReference weakReference2 = this.h;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        qzb qzbVar = (qzb) this.h.get();
                        float c = qzbVar.c(qzbVar.i(), qzbVar.b.a.d(), qzbVar.C);
                        if (c >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            c *= qzbVar.b.j;
                        }
                        if (c >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c - (this.o.j / 2.0f));
                        }
                    }
                    Drawable drawable = getDrawable();
                    f = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                }
            } else {
                f = this.o.n;
            }
            float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f - (this.o.j / 2.0f));
            he8 he8Var4 = this.o;
            float f7 = he8Var4.l;
            int i = he8Var4.h;
            RectF rectF = this.b;
            a(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.k;
            Paint paint = this.a;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            he8 he8Var5 = this.o;
            float f9 = he8Var5.j;
            int i2 = he8Var5.f;
            a(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.k);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void e(Resources.Theme theme) {
        TypedValue K;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(pjf.q);
        int i = this.o.d;
        if (i != Integer.MIN_VALUE && (K = x2a.K(theme, i)) != null) {
            he8 he8Var = this.o;
            he8Var.c = K.data != 0;
            he8Var.e = true;
        }
        he8 he8Var2 = this.o;
        if (!he8Var2.e) {
            he8Var2.c = x2a.L(theme, com.sofascore.results.R.attr.focusRingsEnabled, he8Var2.c);
        }
        he8 he8Var3 = this.o;
        if (he8Var3.c) {
            int i2 = he8Var3.f;
            int i3 = he8Var3.g;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, -16777216);
            }
            he8Var3.f = i2;
            he8 he8Var4 = this.o;
            int i4 = he8Var4.h;
            int i5 = he8Var4.i;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            he8Var4.h = i4;
            he8 he8Var5 = this.o;
            he8Var5.j = g(he8Var5.j, theme, he8Var5.k, obtainStyledAttributes, 6, com.sofascore.results.R.dimen.mtrl_focus_ring_outer_stroke_width);
            he8 he8Var6 = this.o;
            he8Var6.l = g(he8Var6.l, theme, he8Var6.m, obtainStyledAttributes, 3, com.sofascore.results.R.dimen.mtrl_focus_ring_inner_stroke_width);
            he8 he8Var7 = this.o;
            he8Var7.n = g(he8Var7.n, theme, he8Var7.o, obtainStyledAttributes, 7, 0);
            he8 he8Var8 = this.o;
            he8Var8.p = g(he8Var8.p, theme, he8Var8.q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.o.p)) {
                this.o.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            he8 he8Var9 = this.o;
            he8Var9.r = g(he8Var9.r, theme, he8Var9.s, obtainStyledAttributes, 2, com.sofascore.results.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            he8 he8Var10 = this.o;
            int i6 = he8Var10.u;
            int[] iArr = pjf.M;
            if (i6 != Integer.MIN_VALUE) {
                he8Var10.t = xah.j(theme.obtainStyledAttributes(i6, iArr), new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).a();
            } else {
                int i7 = he8Var10.v;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = com.sofascore.results.R.attr.focusRingsShapeAppearance;
                }
                TypedValue K2 = x2a.K(theme, i7);
                if (K2 != null) {
                    this.o.t = xah.j(theme.obtainStyledAttributes(K2.resourceId, iArr), new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).a();
                }
            }
        }
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.a;
        paint.setStyle(style);
        if (Float.isNaN(this.o.j)) {
            return;
        }
        paint.setStrokeWidth(this.o.j);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        he8 he8Var = this.o;
        if (he8Var.a == null) {
            return null;
        }
        he8Var.b = getChangingConfigurations();
        return this.o;
    }

    public final void h(vah vahVar) {
        RectF rectF = this.b;
        a(rectF);
        xah b = vahVar.b(q);
        boolean l = b.l(rectF);
        Path path = this.e;
        if (!l) {
            this.g.c(b, null, 1.0f, rectF, null, path);
            this.i = -1.0f;
            return;
        }
        he8 he8Var = this.o;
        float f = ((he8Var.j / 2.0f) * this.k) + he8Var.p;
        rectF.inset(f, f);
        this.i = b.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.o.c;
        } catch (NoSuchMethodError unused) {
            return this.o.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = pjf.q;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.o.d = d(obtainStyledAttributes, 0);
        if (this.o.d == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            he8 he8Var = this.o;
            he8Var.c = obtainStyledAttributes.getBoolean(0, he8Var.c);
            this.o.e = true;
        }
        this.o.g = d(obtainStyledAttributes, 5);
        he8 he8Var2 = this.o;
        if (he8Var2.g == Integer.MIN_VALUE) {
            he8Var2.f = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.o.i = d(obtainStyledAttributes, 1);
        he8 he8Var3 = this.o;
        if (he8Var3.i == Integer.MIN_VALUE) {
            he8Var3.h = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.o.k = d(obtainStyledAttributes, 6);
        he8 he8Var4 = this.o;
        if (he8Var4.k == Integer.MIN_VALUE) {
            he8Var4.j = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.o.m = d(obtainStyledAttributes, 3);
        he8 he8Var5 = this.o;
        if (he8Var5.m == Integer.MIN_VALUE) {
            he8Var5.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.o.m = d(obtainStyledAttributes, 3);
        he8 he8Var6 = this.o;
        if (he8Var6.m == Integer.MIN_VALUE) {
            he8Var6.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.o.o = d(obtainStyledAttributes, 7);
        he8 he8Var7 = this.o;
        if (he8Var7.o == Integer.MIN_VALUE) {
            he8Var7.n = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.o.q = d(obtainStyledAttributes, 4);
        he8 he8Var8 = this.o;
        if (he8Var8.q == Integer.MIN_VALUE) {
            he8Var8.p = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.o.s = d(obtainStyledAttributes, 2);
        he8 he8Var9 = this.o;
        if (he8Var9.s == Integer.MIN_VALUE) {
            he8Var9.r = obtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.o.v = d(obtainStyledAttributes, 8);
        this.o.u = obtainStyledAttributes.getType(8) == 1 ? obtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        obtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
            this.o.a = drawable.getConstantState();
        } else {
            ColorDrawable colorDrawable = p;
            setDrawable(colorDrawable);
            this.o.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.o.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.j;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.j = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.n && super.mutate() == this) {
            this.o = new he8(this.o);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.o.a = drawable.getConstantState();
            }
            this.n = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018c  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBoundsChange(Rect rect) {
        float[] fArr;
        float f;
        xah xahVar;
        super.onBoundsChange(rect);
        he8 he8Var = this.o;
        if (!he8Var.c) {
            return;
        }
        vah vahVar = he8Var.t;
        if (vahVar != null) {
            h(vahVar);
            return;
        }
        Drawable drawable = getDrawable();
        xah xahVar2 = null;
        if (drawable instanceof ShapeDrawable) {
            Outline outline = new Outline();
            ((ShapeDrawable) drawable).getOutline(outline);
            if (outline.getRadius() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                p7g p7gVar = new p7g();
                p7g p7gVar2 = new p7g();
                p7g p7gVar3 = new p7g();
                p7g p7gVar4 = new p7g();
                ug5 ug5Var = new ug5();
                ug5 ug5Var2 = new ug5();
                ug5 ug5Var3 = new ug5();
                ug5 ug5Var4 = new ug5();
                float radius = outline.getRadius();
                q0 q0Var = new q0(radius);
                q0 q0Var2 = new q0(radius);
                q0 q0Var3 = new q0(radius);
                q0 q0Var4 = new q0(radius);
                xahVar = new xah();
                xahVar.a = p7gVar;
                xahVar.b = p7gVar2;
                xahVar.c = p7gVar3;
                xahVar.d = p7gVar4;
                xahVar.e = q0Var;
                xahVar.f = q0Var2;
                xahVar.g = q0Var3;
                xahVar.h = q0Var4;
                xahVar.i = ug5Var;
                xahVar.j = ug5Var2;
                xahVar.k = ug5Var3;
                xahVar.l = ug5Var4;
                xahVar2 = xahVar;
            }
            if (xahVar2 == null) {
                h(xahVar2);
                return;
            } else {
                this.i = -1.0f;
                this.e.reset();
                return;
            }
        }
        if (drawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            try {
                fArr = gradientDrawable.getCornerRadii();
            } catch (NullPointerException unused) {
                fArr = null;
            }
            if (fArr != null) {
                p7g p7gVar5 = new p7g();
                p7g p7gVar6 = new p7g();
                p7g p7gVar7 = new p7g();
                p7g p7gVar8 = new p7g();
                ug5 ug5Var5 = new ug5();
                ug5 ug5Var6 = new ug5();
                ug5 ug5Var7 = new ug5();
                ug5 ug5Var8 = new ug5();
                q0 q0Var5 = new q0(Math.min(fArr[0], fArr[1]));
                q0 q0Var6 = new q0(Math.min(fArr[2], fArr[3]));
                q0 q0Var7 = new q0(Math.min(fArr[4], fArr[5]));
                q0 q0Var8 = new q0(Math.min(fArr[6], fArr[7]));
                xahVar = new xah();
                xahVar.a = p7gVar5;
                xahVar.b = p7gVar6;
                xahVar.c = p7gVar7;
                xahVar.d = p7gVar8;
                xahVar.e = q0Var5;
                xahVar.f = q0Var6;
                xahVar.g = q0Var7;
                xahVar.h = q0Var8;
                xahVar.i = ug5Var5;
                xahVar.j = ug5Var6;
                xahVar.k = ug5Var7;
                xahVar.l = ug5Var8;
                xahVar2 = xahVar;
            } else {
                try {
                    f = gradientDrawable.getCornerRadius();
                } catch (NullPointerException unused2) {
                    f = -1.0f;
                }
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    p7g p7gVar9 = new p7g();
                    p7g p7gVar10 = new p7g();
                    p7g p7gVar11 = new p7g();
                    p7g p7gVar12 = new p7g();
                    ug5 ug5Var9 = new ug5();
                    ug5 ug5Var10 = new ug5();
                    ug5 ug5Var11 = new ug5();
                    ug5 ug5Var12 = new ug5();
                    q0 q0Var9 = new q0(f);
                    q0 q0Var10 = new q0(f);
                    q0 q0Var11 = new q0(f);
                    q0 q0Var12 = new q0(f);
                    xah xahVar3 = new xah();
                    xahVar3.a = p7gVar9;
                    xahVar3.b = p7gVar10;
                    xahVar3.c = p7gVar11;
                    xahVar3.d = p7gVar12;
                    xahVar3.e = q0Var9;
                    xahVar3.f = q0Var10;
                    xahVar3.g = q0Var11;
                    xahVar3.h = q0Var12;
                    xahVar3.i = ug5Var9;
                    xahVar3.j = ug5Var10;
                    xahVar3.k = ug5Var11;
                    xahVar3.l = ug5Var12;
                    xahVar2 = xahVar3;
                }
            }
        }
        if (xahVar2 == null) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        he8 he8Var = this.o;
        if (!he8Var.c) {
            this.m = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(he8Var.x, iArr);
        boolean z = this.m != stateSetMatches;
        this.m = stateSetMatches;
        if (z && iArr.length > 0 && !this.l) {
            ObjectAnimator objectAnimator = this.j;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.j = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(r);
                ofFloat.addListener(new eb(this, 7));
                this.j = ofFloat;
                ofFloat.start();
            } else {
                this.k = 1.0f;
            }
        }
        this.l = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = qn2.k();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        this.o = new he8(null);
    }

    public FocusRingDrawable(@NonNull Context context, @Nullable Drawable drawable) {
        super(drawable);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new Rect();
        this.d = new Path();
        this.e = new Path();
        this.f = new Matrix();
        this.g = qn2.k();
        this.i = -1.0f;
        this.k = 1.0f;
        this.m = false;
        this.n = false;
        he8 he8Var = new he8(null);
        this.o = he8Var;
        if (drawable != null) {
            he8Var.a = drawable.getConstantState();
        }
        e(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(he8 he8Var, Resources resources, ge8 ge8Var) {
        this(he8Var, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
