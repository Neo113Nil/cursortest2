package v7;

import a10.AbstractC4920h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.res.g;
import i7.C7017a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f102452a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102453b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102454c;

    /* renamed from: d, reason: collision with root package name */
    public final int f102455d;

    /* renamed from: e, reason: collision with root package name */
    public final float f102456e;

    /* renamed from: f, reason: collision with root package name */
    public final float f102457f;

    /* renamed from: g, reason: collision with root package name */
    public final float f102458g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f102459h;

    /* renamed from: i, reason: collision with root package name */
    public final float f102460i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f102461j;

    /* renamed from: k, reason: collision with root package name */
    private float f102462k;

    /* renamed from: l, reason: collision with root package name */
    private final int f102463l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f102464m = false;

    /* renamed from: n, reason: collision with root package name */
    private Typeface f102465n;

    final class a extends g.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4920h f102466a;

        a(AbstractC4920h abstractC4920h) {
            this.f102466a = abstractC4920h;
        }

        @Override // androidx.core.content.res.g.e
        public final void b(int i11) {
            d.this.f102464m = true;
            this.f102466a.a(i11);
        }

        @Override // androidx.core.content.res.g.e
        public final void c(@NonNull Typeface typeface) {
            d dVar = d.this;
            dVar.f102465n = Typeface.create(typeface, dVar.f102454c);
            dVar.f102464m = true;
            this.f102466a.b(dVar.f102465n, false);
        }
    }

    public d(@NonNull Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, C7017a.f65931O);
        this.f102462k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f102461j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f102454c = obtainStyledAttributes.getInt(2, 0);
        this.f102455d = obtainStyledAttributes.getInt(1, 1);
        int i12 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f102463l = obtainStyledAttributes.getResourceId(i12, 0);
        this.f102453b = obtainStyledAttributes.getString(i12);
        obtainStyledAttributes.getBoolean(14, false);
        this.f102452a = c.a(context, obtainStyledAttributes, 6);
        this.f102456e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f102457f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f102458g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i11, C7017a.f65919C);
        this.f102459h = obtainStyledAttributes2.hasValue(0);
        this.f102460i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        Typeface typeface = this.f102465n;
        int i11 = this.f102454c;
        if (typeface == null && (str = this.f102453b) != null) {
            this.f102465n = Typeface.create(str, i11);
        }
        if (this.f102465n == null) {
            int i12 = this.f102455d;
            if (i12 == 1) {
                this.f102465n = Typeface.SANS_SERIF;
            } else if (i12 == 2) {
                this.f102465n = Typeface.SERIF;
            } else if (i12 != 3) {
                this.f102465n = Typeface.DEFAULT;
            } else {
                this.f102465n = Typeface.MONOSPACE;
            }
            this.f102465n = Typeface.create(this.f102465n, i11);
        }
    }

    public final Typeface e() {
        d();
        return this.f102465n;
    }

    @NonNull
    public final Typeface f(@NonNull Context context) {
        if (this.f102464m) {
            return this.f102465n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface e11 = androidx.core.content.res.g.e(this.f102463l, context);
                this.f102465n = e11;
                if (e11 != null) {
                    this.f102465n = Typeface.create(e11, this.f102454c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e12) {
                Log.d("TextAppearance", "Error loading font " + this.f102453b, e12);
            }
        }
        d();
        this.f102464m = true;
        return this.f102465n;
    }

    public final void g(@NonNull Context context, @NonNull AbstractC4920h abstractC4920h) {
        int i11 = this.f102463l;
        if ((i11 != 0 ? androidx.core.content.res.g.a(i11, context) : null) != null) {
            f(context);
        } else {
            d();
        }
        if (i11 == 0) {
            this.f102464m = true;
        }
        if (this.f102464m) {
            abstractC4920h.b(this.f102465n, true);
            return;
        }
        try {
            androidx.core.content.res.g.g(context, i11, new a(abstractC4920h));
        } catch (Resources.NotFoundException unused) {
            this.f102464m = true;
            abstractC4920h.a(1);
        } catch (Exception e11) {
            Log.d("TextAppearance", "Error loading font " + this.f102453b, e11);
            this.f102464m = true;
            abstractC4920h.a(-3);
        }
    }

    public final ColorStateList h() {
        return this.f102461j;
    }

    public final float i() {
        return this.f102462k;
    }

    public final void j(float f7) {
        this.f102462k = f7;
    }

    public final void k(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull AbstractC4920h abstractC4920h) {
        l(context, textPaint, abstractC4920h);
        ColorStateList colorStateList = this.f102461j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f102452a;
        textPaint.setShadowLayer(this.f102458g, this.f102456e, this.f102457f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void l(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull AbstractC4920h abstractC4920h) {
        int i11 = this.f102463l;
        if ((i11 != 0 ? androidx.core.content.res.g.a(i11, context) : null) != null) {
            m(context, textPaint, f(context));
            return;
        }
        d();
        m(context, textPaint, this.f102465n);
        g(context, new e(this, context, textPaint, abstractC4920h));
    }

    public final void m(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface a11 = g.a(context.getResources().getConfiguration(), typeface);
        if (a11 != null) {
            typeface = a11;
        }
        textPaint.setTypeface(typeface);
        int i11 = (~typeface.getStyle()) & this.f102454c;
        textPaint.setFakeBoldText((i11 & 1) != 0);
        textPaint.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f102462k);
        if (this.f102459h) {
            textPaint.setLetterSpacing(this.f102460i);
        }
    }
}
