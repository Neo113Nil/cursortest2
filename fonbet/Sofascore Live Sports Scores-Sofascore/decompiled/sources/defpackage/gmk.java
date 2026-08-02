package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gmk extends xlk {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public emk b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public gmk() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        emk emkVar = new emk();
        emkVar.c = null;
        emkVar.d = j;
        emkVar.b = new dmk();
        this.b = emkVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || abs4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(a.o, width);
        int min2 = Math.min(a.o, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        emk emkVar = this.b;
        Bitmap bitmap = emkVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != emkVar.f.getHeight()) {
            emkVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            emkVar.k = true;
        }
        boolean z = this.f;
        emk emkVar2 = this.b;
        if (!z) {
            emkVar2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(emkVar2.f);
            dmk dmkVar = emkVar2.b;
            dmkVar.a(dmkVar.g, dmk.p, canvas2, min, min2);
        } else if (emkVar2.k || emkVar2.g != emkVar2.c || emkVar2.h != emkVar2.d || emkVar2.j != emkVar2.e || emkVar2.i != emkVar2.b.getRootAlpha()) {
            emk emkVar3 = this.b;
            emkVar3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(emkVar3.f);
            dmk dmkVar2 = emkVar3.b;
            dmkVar2.a(dmkVar2.g, dmk.p, canvas3, min, min2);
            emk emkVar4 = this.b;
            emkVar4.g = emkVar4.c;
            emkVar4.h = emkVar4.d;
            emkVar4.i = emkVar4.b.getRootAlpha();
            emkVar4.j = emkVar4.e;
            emkVar4.k = false;
        }
        emk emkVar5 = this.b;
        if (emkVar5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (emkVar5.l == null) {
                Paint paint2 = new Paint();
                emkVar5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            emkVar5.l.setAlpha(emkVar5.b.getRootAlpha());
            emkVar5.l.setColorFilter(colorFilter);
            paint = emkVar5.l;
        }
        canvas.drawBitmap(emkVar5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new fmk(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        emk emkVar = this.b;
        emkVar.b = new dmk();
        TypedArray D = r4a.D(resources, theme, attributeSet, ao2.a);
        emk emkVar2 = this.b;
        dmk dmkVar = emkVar2.b;
        int i5 = !r4a.z(xmlPullParser, "tintMode") ? -1 : D.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
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
        emkVar2.d = mode;
        ColorStateList x = r4a.x(D, xmlPullParser, theme);
        if (x != null) {
            emkVar2.c = x;
        }
        boolean z = emkVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = D.getBoolean(5, z);
        }
        emkVar2.e = z;
        float f = dmkVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = D.getFloat(7, f);
        }
        dmkVar.j = f;
        float f2 = dmkVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = D.getFloat(8, f2);
        }
        dmkVar.k = f2;
        if (dmkVar.j <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(D.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(D.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        dmkVar.h = D.getDimension(3, dmkVar.h);
        int i7 = 2;
        float dimension = D.getDimension(2, dmkVar.i);
        dmkVar.i = dimension;
        if (dmkVar.h <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(D.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new XmlPullParserException(D.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = dmkVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = D.getFloat(4, alpha);
        }
        dmkVar.setAlpha(alpha);
        String string = D.getString(0);
        if (string != null) {
            dmkVar.m = string;
            dmkVar.o.put(string, dmkVar);
        }
        D.recycle();
        emkVar.a = getChangingConfigurations();
        int i8 = 1;
        emkVar.k = true;
        emk emkVar3 = this.b;
        dmk dmkVar2 = emkVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        amk amkVar = dmkVar2.g;
        dh0 dh0Var = dmkVar2.o;
        arrayDeque.push(amkVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                amk amkVar2 = (amk) arrayDeque.peek();
                if (amkVar2 != null) {
                    ArrayList arrayList = amkVar2.b;
                    i = depth;
                    if ("path".equals(name)) {
                        zlk zlkVar = new zlk();
                        zlkVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        zlkVar.g = 1.0f;
                        zlkVar.h = 1.0f;
                        zlkVar.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        zlkVar.j = 1.0f;
                        zlkVar.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        Paint.Cap cap = Paint.Cap.BUTT;
                        zlkVar.l = cap;
                        Paint.Join join = Paint.Join.MITER;
                        zlkVar.m = join;
                        zlkVar.n = 4.0f;
                        TypedArray D2 = r4a.D(resources, theme, attributeSet, ao2.c);
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            String string2 = D2.getString(0);
                            if (string2 != null) {
                                zlkVar.b = string2;
                            }
                            String string3 = D2.getString(2);
                            if (string3 != null) {
                                zlkVar.a = jca.A(string3);
                            }
                            zlkVar.f = r4a.y(D2, xmlPullParser, theme, "fillColor", 1);
                            float f3 = zlkVar.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                f3 = D2.getFloat(12, f3);
                            }
                            zlkVar.h = f3;
                            int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? D2.getInt(8, -1) : -1;
                            zlkVar.l = i9 != 0 ? i9 != 1 ? i9 != 2 ? zlkVar.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                            int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? D2.getInt(9, -1) : -1;
                            zlkVar.m = i10 != 0 ? i10 != 1 ? i10 != 2 ? zlkVar.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                            float f4 = zlkVar.n;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                f4 = D2.getFloat(10, f4);
                            }
                            zlkVar.n = f4;
                            zlkVar.d = r4a.y(D2, xmlPullParser, theme, "strokeColor", 3);
                            float f5 = zlkVar.g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                f5 = D2.getFloat(11, f5);
                            }
                            zlkVar.g = f5;
                            float f6 = zlkVar.e;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                f6 = D2.getFloat(4, f6);
                            }
                            zlkVar.e = f6;
                            float f7 = zlkVar.j;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                f7 = D2.getFloat(6, f7);
                            }
                            zlkVar.j = f7;
                            float f8 = zlkVar.k;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                f8 = D2.getFloat(7, f8);
                            }
                            zlkVar.k = f8;
                            float f9 = zlkVar.i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                f9 = D2.getFloat(5, f9);
                            }
                            zlkVar.i = f9;
                            int i11 = zlkVar.c;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                i11 = D2.getInt(13, i11);
                            }
                            zlkVar.c = i11;
                        }
                        D2.recycle();
                        arrayList.add(zlkVar);
                        if (zlkVar.getPathName() != null) {
                            dh0Var.put(zlkVar.getPathName(), zlkVar);
                        }
                        emkVar3.a = emkVar3.a;
                        i4 = 1;
                        z2 = false;
                    } else {
                        if ("clip-path".equals(name)) {
                            ylk ylkVar = new ylk();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray D3 = r4a.D(resources, theme, attributeSet, ao2.d);
                                String string4 = D3.getString(0);
                                if (string4 != null) {
                                    ylkVar.b = string4;
                                }
                                String string5 = D3.getString(1);
                                if (string5 != null) {
                                    ylkVar.a = jca.A(string5);
                                }
                                ylkVar.c = !r4a.z(xmlPullParser, "fillType") ? 0 : D3.getInt(2, 0);
                                D3.recycle();
                            }
                            arrayList.add(ylkVar);
                            if (ylkVar.getPathName() != null) {
                                dh0Var.put(ylkVar.getPathName(), ylkVar);
                            }
                            emkVar3.a = emkVar3.a;
                        } else if ("group".equals(name)) {
                            amk amkVar3 = new amk();
                            TypedArray D4 = r4a.D(resources, theme, attributeSet, ao2.b);
                            float f10 = amkVar3.c;
                            if (r4a.z(xmlPullParser, "rotation")) {
                                f10 = D4.getFloat(5, f10);
                            }
                            amkVar3.c = f10;
                            i4 = 1;
                            amkVar3.d = D4.getFloat(1, amkVar3.d);
                            amkVar3.e = D4.getFloat(2, amkVar3.e);
                            float f11 = amkVar3.f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f11 = D4.getFloat(3, f11);
                            }
                            amkVar3.f = f11;
                            float f12 = amkVar3.g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f12 = D4.getFloat(4, f12);
                            }
                            amkVar3.g = f12;
                            float f13 = amkVar3.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f13 = D4.getFloat(6, f13);
                            }
                            amkVar3.h = f13;
                            float f14 = amkVar3.i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f14 = D4.getFloat(7, f14);
                            }
                            amkVar3.i = f14;
                            String string6 = D4.getString(0);
                            if (string6 != null) {
                                amkVar3.k = string6;
                            }
                            amkVar3.c();
                            D4.recycle();
                            arrayList.add(amkVar3);
                            arrayDeque.push(amkVar3);
                            if (amkVar3.getGroupName() != null) {
                                dh0Var.put(amkVar3.getGroupName(), amkVar3);
                            }
                            emkVar3.a = emkVar3.a;
                        }
                        i4 = 1;
                    }
                } else {
                    i = depth;
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i8 = i3;
            depth = i;
            i7 = 2;
        }
        if (z2) {
            pvd.r("no path defined");
        } else {
            this.c = a(emkVar.c, emkVar.d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        emk emkVar = this.b;
        if (emkVar == null) {
            return false;
        }
        dmk dmkVar = emkVar.b;
        Boolean bool = dmkVar.n;
        if (bool == null) {
            bool = Boolean.valueOf(dmkVar.g.a());
            dmkVar.n = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            emk emkVar = this.b;
            emk emkVar2 = new emk();
            emkVar2.c = null;
            emkVar2.d = j;
            if (emkVar != null) {
                emkVar2.a = emkVar.a;
                dmk dmkVar = new dmk(emkVar.b);
                emkVar2.b = dmkVar;
                if (emkVar.b.e != null) {
                    dmkVar.e = new Paint(emkVar.b.e);
                }
                if (emkVar.b.d != null) {
                    emkVar2.b.d = new Paint(emkVar.b.d);
                }
                emkVar2.c = emkVar.c;
                emkVar2.d = emkVar.d;
                emkVar2.e = emkVar.e;
            }
            this.b = emkVar2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        emk emkVar = this.b;
        ColorStateList colorStateList = emkVar.c;
        if (colorStateList == null || (mode = emkVar.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        dmk dmkVar = emkVar.b;
        Boolean bool = dmkVar.n;
        if (bool == null) {
            bool = Boolean.valueOf(dmkVar.g.a());
            dmkVar.n = bool;
        }
        if (bool.booleanValue()) {
            boolean b = emkVar.b.g.b(iArr);
            emkVar.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        emk emkVar = this.b;
        if (emkVar.c != colorStateList) {
            emkVar.c = colorStateList;
            this.c = a(colorStateList, emkVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        emk emkVar = this.b;
        if (emkVar.d != mode) {
            emkVar.d = mode;
            this.c = a(emkVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public gmk(emk emkVar) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = emkVar;
        this.c = a(emkVar.c, emkVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
