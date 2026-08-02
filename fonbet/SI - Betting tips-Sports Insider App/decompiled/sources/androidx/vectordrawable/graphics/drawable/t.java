package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends k {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public r f2854b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f2855c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f2856d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2857e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2858f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f2859g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f2860h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f2861i;

    public t() {
        this.f2858f = true;
        this.f2859g = new float[9];
        this.f2860h = new Matrix();
        this.f2861i = new Rect();
        r rVar = new r();
        rVar.f2844c = null;
        rVar.f2845d = j;
        rVar.f2843b = new q();
        this.f2854b = rVar;
    }

    public static t a(Resources resources, int i5, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            t tVar = new t();
            ThreadLocal threadLocal = f0.l.f9293a;
            tVar.f2803a = resources.getDrawable(i5, theme);
            return tVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i5);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            t tVar2 = new t();
            tVar2.inflate(resources, xml, asAttributeSet, theme);
            return tVar2;
        } catch (IOException e7) {
            w0.e("VectorDrawableCompat", "parser error", e7);
            return null;
        } catch (XmlPullParserException e9) {
            w0.e("VectorDrawableCompat", "parser error", e9);
            return null;
        }
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2803a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f2861i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2856d;
        if (colorFilter == null) {
            colorFilter = this.f2855c;
        }
        Matrix matrix = this.f2860h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f2859g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        r rVar = this.f2854b;
        Bitmap bitmap = rVar.f2847f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != rVar.f2847f.getHeight()) {
            rVar.f2847f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            rVar.f2851k = true;
        }
        if (this.f2858f) {
            r rVar2 = this.f2854b;
            if (rVar2.f2851k || rVar2.f2848g != rVar2.f2844c || rVar2.f2849h != rVar2.f2845d || rVar2.j != rVar2.f2846e || rVar2.f2850i != rVar2.f2843b.getRootAlpha()) {
                r rVar3 = this.f2854b;
                rVar3.f2847f.eraseColor(0);
                Canvas canvas2 = new Canvas(rVar3.f2847f);
                q qVar = rVar3.f2843b;
                qVar.a(qVar.f2834g, q.f2827p, canvas2, min, min2);
                r rVar4 = this.f2854b;
                rVar4.f2848g = rVar4.f2844c;
                rVar4.f2849h = rVar4.f2845d;
                rVar4.f2850i = rVar4.f2843b.getRootAlpha();
                rVar4.j = rVar4.f2846e;
                rVar4.f2851k = false;
            }
        } else {
            r rVar5 = this.f2854b;
            rVar5.f2847f.eraseColor(0);
            Canvas canvas3 = new Canvas(rVar5.f2847f);
            q qVar2 = rVar5.f2843b;
            qVar2.a(qVar2.f2834g, q.f2827p, canvas3, min, min2);
        }
        r rVar6 = this.f2854b;
        if (rVar6.f2843b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (rVar6.f2852l == null) {
                Paint paint2 = new Paint();
                rVar6.f2852l = paint2;
                paint2.setFilterBitmap(true);
            }
            rVar6.f2852l.setAlpha(rVar6.f2843b.getRootAlpha());
            rVar6.f2852l.setColorFilter(colorFilter);
            paint = rVar6.f2852l;
        }
        canvas.drawBitmap(rVar6.f2847f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.getAlpha() : this.f2854b.f2843b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2854b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.getColorFilter() : this.f2856d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2803a != null && Build.VERSION.SDK_INT >= 24) {
            return new s(this.f2803a.getConstantState());
        }
        this.f2854b.f2842a = getChangingConfigurations();
        return this.f2854b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2854b.f2843b.f2836i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2854b.f2843b.f2835h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.isAutoMirrored() : this.f2854b.f2846e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        r rVar = this.f2854b;
        if (rVar == null) {
            return false;
        }
        q qVar = rVar.f2843b;
        if (qVar.f2840n == null) {
            qVar.f2840n = Boolean.valueOf(qVar.f2834g.a());
        }
        if (qVar.f2840n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f2854b.f2844c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2857e && super.mutate() == this) {
            r rVar = this.f2854b;
            r rVar2 = new r();
            rVar2.f2844c = null;
            rVar2.f2845d = j;
            if (rVar != null) {
                rVar2.f2842a = rVar.f2842a;
                q qVar = new q(rVar.f2843b);
                rVar2.f2843b = qVar;
                if (rVar.f2843b.f2832e != null) {
                    qVar.f2832e = new Paint(rVar.f2843b.f2832e);
                }
                if (rVar.f2843b.f2831d != null) {
                    rVar2.f2843b.f2831d = new Paint(rVar.f2843b.f2831d);
                }
                rVar2.f2844c = rVar.f2844c;
                rVar2.f2845d = rVar.f2845d;
                rVar2.f2846e = rVar.f2846e;
            }
            this.f2854b = rVar2;
            this.f2857e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z5;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        r rVar = this.f2854b;
        ColorStateList colorStateList = rVar.f2844c;
        if (colorStateList == null || (mode = rVar.f2845d) == null) {
            z5 = false;
        } else {
            this.f2855c = b(colorStateList, mode);
            invalidateSelf();
            z5 = true;
        }
        q qVar = rVar.f2843b;
        if (qVar.f2840n == null) {
            qVar.f2840n = Boolean.valueOf(qVar.f2834g.a());
        }
        if (qVar.f2840n.booleanValue()) {
            boolean b10 = rVar.f2843b.f2834g.b(iArr);
            rVar.f2851k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z5;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setAlpha(i5);
        } else if (this.f2854b.f2843b.getRootAlpha() != i5) {
            this.f2854b.f2843b.setRootAlpha(i5);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setAutoMirrored(z5);
        } else {
            this.f2854b.f2846e = z5;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2856d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i5) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            ci.c.Y(drawable, i5);
        } else {
            setTintList(ColorStateList.valueOf(i5));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        r rVar = this.f2854b;
        if (rVar.f2844c != colorStateList) {
            rVar.f2844c = colorStateList;
            this.f2855c = b(colorStateList, rVar.f2845d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        r rVar = this.f2854b;
        if (rVar.f2845d != mode) {
            rVar.f2845d = mode;
            this.f2855c = b(rVar.f2844c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z7) {
        Drawable drawable = this.f2803a;
        return drawable != null ? drawable.setVisible(z5, z7) : super.setVisible(z5, z7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i5;
        char c2;
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f2803a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        r rVar = this.f2854b;
        rVar.f2843b = new q();
        TypedArray f6 = f0.b.f(resources, theme, attributeSet, a.f2777a);
        r rVar2 = this.f2854b;
        q qVar = rVar2.f2843b;
        int i11 = !f0.b.c(xmlPullParser, "tintMode") ? -1 : f6.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        rVar2.f2845d = mode;
        ColorStateList colorStateList = null;
        int i12 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f6.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i13 >= 28 && i13 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f6.getResources();
                int resourceId = f6.getResourceId(1, 0);
                ThreadLocal threadLocal = f0.c.f9276a;
                try {
                    colorStateList = f0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e7) {
                    w0.e("CSLCompat", "Failed to inflate ColorStateList.", e7);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            rVar2.f2844c = colorStateList2;
        }
        boolean z5 = rVar2.f2846e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z5 = f6.getBoolean(5, z5);
        }
        rVar2.f2846e = z5;
        float f10 = qVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = f6.getFloat(7, f10);
        }
        qVar.j = f10;
        float f11 = qVar.f2837k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = f6.getFloat(8, f11);
        }
        qVar.f2837k = f11;
        if (qVar.j <= 0.0f) {
            throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            qVar.f2835h = f6.getDimension(3, qVar.f2835h);
            float dimension = f6.getDimension(2, qVar.f2836i);
            qVar.f2836i = dimension;
            if (qVar.f2835h <= 0.0f) {
                throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = qVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f6.getFloat(4, alpha);
                }
                qVar.setAlpha(alpha);
                String string = f6.getString(0);
                if (string != null) {
                    qVar.f2839m = string;
                    qVar.f2841o.put(string, qVar);
                }
                f6.recycle();
                rVar.f2842a = getChangingConfigurations();
                rVar.f2851k = true;
                r rVar3 = this.f2854b;
                q qVar2 = rVar3.f2843b;
                ArrayDeque arrayDeque = new ArrayDeque();
                n nVar = qVar2.f2834g;
                s.e eVar = qVar2.f2841o;
                arrayDeque.push(nVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z7 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        n nVar2 = (n) arrayDeque.peek();
                        if (nVar2 != null) {
                            ArrayList arrayList = nVar2.f2815b;
                            i5 = depth;
                            if ("path".equals(name)) {
                                m mVar = new m();
                                mVar.f2805e = 0.0f;
                                mVar.f2807g = 1.0f;
                                mVar.f2808h = 1.0f;
                                mVar.f2809i = 0.0f;
                                mVar.j = 1.0f;
                                mVar.f2810k = 0.0f;
                                Paint.Cap cap2 = Paint.Cap.BUTT;
                                mVar.f2811l = cap2;
                                Paint.Join join2 = Paint.Join.MITER;
                                mVar.f2812m = join2;
                                mVar.f2813n = 4.0f;
                                TypedArray f12 = f0.b.f(resources, theme, attributeSet, a.f2779c);
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    String string2 = f12.getString(0);
                                    if (string2 != null) {
                                        mVar.f2825b = string2;
                                    }
                                    String string3 = f12.getString(2);
                                    if (string3 != null) {
                                        mVar.f2824a = y4.a.p(string3);
                                    }
                                    mVar.f2806f = f0.b.a(f12, xmlPullParser, theme, "fillColor", 1);
                                    float f13 = mVar.f2808h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                        f13 = f12.getFloat(12, f13);
                                    }
                                    mVar.f2808h = f13;
                                    int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f12.getInt(8, -1) : -1;
                                    Paint.Cap cap3 = mVar.f2811l;
                                    if (i14 == 0) {
                                        cap = cap2;
                                    } else if (i14 != 1) {
                                        cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                    mVar.f2811l = cap;
                                    int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f12.getInt(9, -1) : -1;
                                    Paint.Join join3 = mVar.f2812m;
                                    if (i15 == 0) {
                                        join = join2;
                                    } else if (i15 != 1) {
                                        join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                    mVar.f2812m = join;
                                    float f14 = mVar.f2813n;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                        f14 = f12.getFloat(10, f14);
                                    }
                                    mVar.f2813n = f14;
                                    mVar.f2804d = f0.b.a(f12, xmlPullParser, theme, "strokeColor", 3);
                                    float f15 = mVar.f2807g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                        f15 = f12.getFloat(11, f15);
                                    }
                                    mVar.f2807g = f15;
                                    float f16 = mVar.f2805e;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                        f16 = f12.getFloat(4, f16);
                                    }
                                    mVar.f2805e = f16;
                                    float f17 = mVar.j;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                        f17 = f12.getFloat(6, f17);
                                    }
                                    mVar.j = f17;
                                    float f18 = mVar.f2810k;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                        f18 = f12.getFloat(7, f18);
                                    }
                                    mVar.f2810k = f18;
                                    float f19 = mVar.f2809i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                        f19 = f12.getFloat(5, f19);
                                    }
                                    mVar.f2809i = f19;
                                    int i16 = mVar.f2826c;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                        i16 = f12.getInt(13, i16);
                                    }
                                    mVar.f2826c = i16;
                                }
                                f12.recycle();
                                arrayList.add(mVar);
                                if (mVar.getPathName() != null) {
                                    eVar.put(mVar.getPathName(), mVar);
                                }
                                rVar3.f2842a = rVar3.f2842a;
                                z7 = false;
                            } else {
                                c2 = '\b';
                                if ("clip-path".equals(name)) {
                                    l lVar = new l();
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        TypedArray f20 = f0.b.f(resources, theme, attributeSet, a.f2780d);
                                        String string4 = f20.getString(0);
                                        if (string4 != null) {
                                            lVar.f2825b = string4;
                                        }
                                        String string5 = f20.getString(1);
                                        if (string5 != null) {
                                            lVar.f2824a = y4.a.p(string5);
                                        }
                                        lVar.f2826c = !f0.b.c(xmlPullParser, "fillType") ? 0 : f20.getInt(2, 0);
                                        f20.recycle();
                                    }
                                    arrayList.add(lVar);
                                    if (lVar.getPathName() != null) {
                                        eVar.put(lVar.getPathName(), lVar);
                                    }
                                    rVar3.f2842a = rVar3.f2842a;
                                } else if ("group".equals(name)) {
                                    n nVar3 = new n();
                                    TypedArray f21 = f0.b.f(resources, theme, attributeSet, a.f2778b);
                                    float f22 = nVar3.f2816c;
                                    if (f0.b.c(xmlPullParser, "rotation")) {
                                        f22 = f21.getFloat(5, f22);
                                    }
                                    nVar3.f2816c = f22;
                                    nVar3.f2817d = f21.getFloat(1, nVar3.f2817d);
                                    nVar3.f2818e = f21.getFloat(2, nVar3.f2818e);
                                    float f23 = nVar3.f2819f;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                        f23 = f21.getFloat(3, f23);
                                    }
                                    nVar3.f2819f = f23;
                                    float f24 = nVar3.f2820g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                        f24 = f21.getFloat(4, f24);
                                    }
                                    nVar3.f2820g = f24;
                                    float f25 = nVar3.f2821h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                        f25 = f21.getFloat(6, f25);
                                    }
                                    nVar3.f2821h = f25;
                                    float f26 = nVar3.f2822i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                        f26 = f21.getFloat(7, f26);
                                    }
                                    nVar3.f2822i = f26;
                                    String string6 = f21.getString(0);
                                    if (string6 != null) {
                                        nVar3.f2823k = string6;
                                    }
                                    nVar3.c();
                                    f21.recycle();
                                    arrayList.add(nVar3);
                                    arrayDeque.push(nVar3);
                                    if (nVar3.getGroupName() != null) {
                                        eVar.put(nVar3.getGroupName(), nVar3);
                                    }
                                    rVar3.f2842a = rVar3.f2842a;
                                    i10 = 1;
                                }
                                i10 = 1;
                            }
                        } else {
                            i5 = depth;
                        }
                        c2 = '\b';
                        i10 = 1;
                    } else {
                        i5 = depth;
                        c2 = '\b';
                        i10 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    depth = i5;
                }
                if (!z7) {
                    this.f2855c = b(rVar.f2844c, rVar.f2845d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public t(r rVar) {
        this.f2858f = true;
        this.f2859g = new float[9];
        this.f2860h = new Matrix();
        this.f2861i = new Rect();
        this.f2854b = rVar;
        this.f2855c = b(rVar.f2844c, rVar.f2845d);
    }
}
