package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z7j {
    public final ColorStateList a;
    public final String b;
    public String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public ColorStateList k;
    public float l;
    public final int m;
    public boolean n = false;
    public boolean o = false;
    public Typeface p;

    public z7j(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, dkf.y);
        this.l = obtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.k = w3a.x(context, obtainStyledAttributes, 3);
        w3a.x(context, obtainStyledAttributes, 4);
        w3a.x(context, obtainStyledAttributes, 5);
        this.d = obtainStyledAttributes.getInt(2, 0);
        this.e = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.m = obtainStyledAttributes.getResourceId(i2, 0);
        this.b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = w3a.x(context, obtainStyledAttributes, 6);
        this.f = obtainStyledAttributes.getFloat(7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.g = obtainStyledAttributes.getFloat(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.h = obtainStyledAttributes.getFloat(9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, pjf.G);
        this.i = obtainStyledAttributes2.hasValue(0);
        this.j = obtainStyledAttributes2.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.c = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        Typeface typeface;
        String str;
        Typeface typeface2 = this.p;
        int i = this.d;
        if (typeface2 == null && (str = this.b) != null) {
            typeface2 = Typeface.create(str, i);
            this.p = typeface2;
        }
        if (typeface2 == null) {
            int i2 = this.e;
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
                this.p = typeface;
            } else if (i2 == 2) {
                typeface = Typeface.SERIF;
                this.p = typeface;
            } else if (i2 != 3) {
                typeface = Typeface.DEFAULT;
                this.p = typeface;
            } else {
                typeface = Typeface.MONOSPACE;
                this.p = typeface;
            }
            this.p = Typeface.create(typeface, i);
        }
    }

    public final void b(Context context, pea peaVar) {
        if (!c(context)) {
            a();
        }
        int i = this.m;
        if (i == 0) {
            this.n = true;
        }
        if (this.n) {
            peaVar.A(this.p, true);
            return;
        }
        try {
            x7j x7jVar = new x7j(this, peaVar);
            ThreadLocal threadLocal = z1g.a;
            if (context.isRestricted()) {
                x7jVar.p(-4);
            } else {
                z1g.b(context, i, new TypedValue(), 0, x7jVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            peaVar.z(1);
        } catch (Exception unused2) {
            this.n = true;
            peaVar.z(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface b;
        String str;
        Typeface create;
        if (this.n) {
            return true;
        }
        int i = this.m;
        if (i != 0) {
            ThreadLocal threadLocal = z1g.a;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                b = null;
            } else {
                context2 = context;
                b = z1g.b(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (b != null) {
                this.p = b;
                this.n = true;
                return true;
            }
            if (!this.o) {
                this.o = true;
                Resources resources = context2.getResources();
                int i2 = this.m;
                if (i2 != 0 && resources.getResourceTypeName(i2).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i2);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), xjf.b);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.d);
                }
            }
            if (typeface != null) {
                this.p = typeface;
                this.n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, pea peaVar) {
        e(context, textPaint, peaVar);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.h, this.f, this.g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, pea peaVar) {
        Typeface typeface;
        if (c(context) && this.n && (typeface = this.p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.p);
        b(context, new y7j(this, context, textPaint, peaVar));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface r = qz.r(context.getResources().getConfiguration(), typeface);
        if (r != null) {
            typeface = r;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
