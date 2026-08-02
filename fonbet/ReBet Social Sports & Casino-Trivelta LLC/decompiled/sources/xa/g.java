package xa;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: o, reason: collision with root package name */
    public static final int f68058o = 1;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f68059a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f68060b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68061c;

    /* renamed from: e, reason: collision with root package name */
    public int f68063e;

    /* renamed from: l, reason: collision with root package name */
    public boolean f68070l;

    /* renamed from: n, reason: collision with root package name */
    public h f68072n;

    /* renamed from: d, reason: collision with root package name */
    public int f68062d = 0;

    /* renamed from: f, reason: collision with root package name */
    public Layout.Alignment f68064f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    public int f68065g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public float f68066h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f68067i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f68068j = f68058o;

    /* renamed from: k, reason: collision with root package name */
    public boolean f68069k = true;

    /* renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f68071m = null;

    public static class a extends Exception {
    }

    public g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f68059a = charSequence;
        this.f68060b = textPaint;
        this.f68061c = i10;
        this.f68063e = charSequence.length();
    }

    public static g b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new g(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f68059a == null) {
            this.f68059a = "";
        }
        int max = Math.max(0, this.f68061c);
        CharSequence charSequence = this.f68059a;
        if (this.f68065g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f68060b, max, this.f68071m);
        }
        int min = Math.min(charSequence.length(), this.f68063e);
        this.f68063e = min;
        if (this.f68070l && this.f68065g == 1) {
            this.f68064f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f68062d, min, this.f68060b, max);
        obtain.setAlignment(this.f68064f);
        obtain.setIncludePad(this.f68069k);
        obtain.setTextDirection(this.f68070l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f68071m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f68065g);
        float f10 = this.f68066h;
        if (f10 != 0.0f || this.f68067i != 1.0f) {
            obtain.setLineSpacing(f10, this.f68067i);
        }
        if (this.f68065g > 1) {
            obtain.setHyphenationFrequency(this.f68068j);
        }
        h hVar = this.f68072n;
        if (hVar != null) {
            hVar.a(obtain);
        }
        return obtain.build();
    }

    public g c(Layout.Alignment alignment) {
        this.f68064f = alignment;
        return this;
    }

    public g d(TextUtils.TruncateAt truncateAt) {
        this.f68071m = truncateAt;
        return this;
    }

    public g e(int i10) {
        this.f68068j = i10;
        return this;
    }

    public g f(boolean z10) {
        this.f68069k = z10;
        return this;
    }

    public g g(boolean z10) {
        this.f68070l = z10;
        return this;
    }

    public g h(float f10, float f11) {
        this.f68066h = f10;
        this.f68067i = f11;
        return this;
    }

    public g i(int i10) {
        this.f68065g = i10;
        return this;
    }

    public g j(h hVar) {
        this.f68072n = hVar;
        return this;
    }
}
