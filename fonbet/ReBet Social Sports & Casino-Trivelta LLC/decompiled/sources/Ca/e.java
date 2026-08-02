package Ca;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Xml;
import androidx.core.content.res.k;
import ia.m;
import l.j;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1542a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f1543b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1544c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1545d;

    /* renamed from: e, reason: collision with root package name */
    public String f1546e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1547f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1548g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1549h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1550i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1551j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1552k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1553l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1554m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f1555n;

    /* renamed from: o, reason: collision with root package name */
    public float f1556o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1557p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1558q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1559r = false;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f1560s;

    public class a extends k.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f1561a;

        public a(g gVar) {
            this.f1561a = gVar;
        }

        @Override // androidx.core.content.res.k.e
        public void f(int i10) {
            e.this.f1558q = true;
            this.f1561a.a(i10);
        }

        @Override // androidx.core.content.res.k.e
        public void g(Typeface typeface) {
            e eVar = e.this;
            eVar.f1560s = Typeface.create(typeface, eVar.f1547f);
            e.this.f1558q = true;
            this.f1561a.b(e.this.f1560s, false);
        }
    }

    public class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1563a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextPaint f1564b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f1565c;

        public b(Context context, TextPaint textPaint, g gVar) {
            this.f1563a = context;
            this.f1564b = textPaint;
            this.f1565c = gVar;
        }

        @Override // Ca.g
        public void a(int i10) {
            this.f1565c.a(i10);
        }

        @Override // Ca.g
        public void b(Typeface typeface, boolean z10) {
            e.this.r(this.f1563a, this.f1564b, typeface);
            this.f1565c.b(typeface, z10);
        }
    }

    public e(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, j.TextAppearance);
        o(obtainStyledAttributes.getDimension(j.f55348p2, 0.0f));
        n(c.a(context, obtainStyledAttributes, j.f55361s2));
        this.f1542a = c.a(context, obtainStyledAttributes, j.f55365t2);
        this.f1543b = c.a(context, obtainStyledAttributes, j.f55369u2);
        this.f1547f = obtainStyledAttributes.getInt(j.f55357r2, 0);
        this.f1548g = obtainStyledAttributes.getInt(j.f55353q2, 1);
        int g10 = c.g(obtainStyledAttributes, j.f55173B2, j.f55389z2);
        this.f1557p = obtainStyledAttributes.getResourceId(g10, 0);
        this.f1545d = obtainStyledAttributes.getString(g10);
        this.f1549h = obtainStyledAttributes.getBoolean(j.f55181D2, false);
        this.f1544c = c.a(context, obtainStyledAttributes, j.f55373v2);
        this.f1550i = obtainStyledAttributes.getFloat(j.f55377w2, 0.0f);
        this.f1551j = obtainStyledAttributes.getFloat(j.f55381x2, 0.0f);
        this.f1552k = obtainStyledAttributes.getFloat(j.f55385y2, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, m.MaterialTextAppearance);
        this.f1553l = obtainStyledAttributes2.hasValue(m.f49015r4);
        this.f1554m = obtainStyledAttributes2.getFloat(m.f49015r4, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1546e = obtainStyledAttributes2.getString(c.g(obtainStyledAttributes2, m.f49045u4, m.f49025s4));
        }
        obtainStyledAttributes2.recycle();
    }

    public static String m(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 0 && resources.getResourceTypeName(i10).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), k0.d.FontFamily);
                        String string = obtainAttributes.getString(k0.d.f54083m);
                        obtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final void d() {
        String str;
        if (this.f1560s == null && (str = this.f1545d) != null) {
            this.f1560s = Typeface.create(str, this.f1547f);
        }
        if (this.f1560s == null) {
            int i10 = this.f1548g;
            if (i10 == 1) {
                this.f1560s = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f1560s = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f1560s = Typeface.DEFAULT;
            } else {
                this.f1560s = Typeface.MONOSPACE;
            }
            this.f1560s = Typeface.create(this.f1560s, this.f1547f);
        }
    }

    public Typeface e() {
        d();
        return this.f1560s;
    }

    public Typeface f(Context context) {
        if (this.f1558q) {
            return this.f1560s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface h10 = k.h(context, this.f1557p);
                this.f1560s = h10;
                if (h10 != null) {
                    this.f1560s = Typeface.create(h10, this.f1547f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        d();
        this.f1558q = true;
        return this.f1560s;
    }

    public void g(Context context, g gVar) {
        if (!l(context)) {
            d();
        }
        int i10 = this.f1557p;
        if (i10 == 0) {
            this.f1558q = true;
        }
        if (this.f1558q) {
            gVar.b(this.f1560s, true);
            return;
        }
        try {
            k.j(context, i10, new a(gVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f1558q = true;
            gVar.a(1);
        } catch (Exception unused2) {
            this.f1558q = true;
            gVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, g gVar) {
        r(context, textPaint, e());
        g(context, new b(context, textPaint, gVar));
    }

    public final Typeface i(Context context) {
        Typeface create;
        if (this.f1559r) {
            return null;
        }
        this.f1559r = true;
        String m10 = m(context, this.f1557p);
        if (m10 == null || (create = Typeface.create(m10, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(create, this.f1547f);
    }

    public ColorStateList j() {
        return this.f1555n;
    }

    public float k() {
        return this.f1556o;
    }

    public final boolean l(Context context) {
        if (f.a()) {
            f(context);
            return true;
        }
        if (this.f1558q) {
            return true;
        }
        int i10 = this.f1557p;
        if (i10 == 0) {
            return false;
        }
        Typeface c10 = k.c(context, i10);
        if (c10 != null) {
            this.f1560s = c10;
            this.f1558q = true;
            return true;
        }
        Typeface i11 = i(context);
        if (i11 == null) {
            return false;
        }
        this.f1560s = i11;
        this.f1558q = true;
        return true;
    }

    public void n(ColorStateList colorStateList) {
        this.f1555n = colorStateList;
    }

    public void o(float f10) {
        this.f1556o = f10;
    }

    public void p(Context context, TextPaint textPaint, g gVar) {
        q(context, textPaint, gVar);
        ColorStateList colorStateList = this.f1555n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f1552k;
        float f11 = this.f1550i;
        float f12 = this.f1551j;
        ColorStateList colorStateList2 = this.f1544c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void q(Context context, TextPaint textPaint, g gVar) {
        Typeface typeface;
        if (l(context) && this.f1558q && (typeface = this.f1560s) != null) {
            r(context, textPaint, typeface);
        } else {
            h(context, textPaint, gVar);
        }
    }

    public void r(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = i.a(context, typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f1547f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1556o);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f1546e);
        }
        if (this.f1553l) {
            textPaint.setLetterSpacing(this.f1554m);
        }
    }
}
