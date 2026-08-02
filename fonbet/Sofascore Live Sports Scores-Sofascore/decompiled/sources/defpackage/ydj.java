package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ydj {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public j12 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final s7b[] n;
    public final Rect o = new Rect();
    public p03 p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ydj(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, lma lmaVar) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout u;
        boolean z2;
        int i10;
        s7b[] s7bVarArr;
        int i11;
        int i12;
        int i13;
        long j;
        int i14;
        long j2;
        char c;
        int i15;
        long j3;
        long a;
        int i16;
        int i17;
        Layout layout;
        int i18;
        Paint.FontMetricsInt fontMetricsInt;
        boolean z3;
        int i19;
        s7b s7bVar;
        s7b s7bVar2;
        int i20;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic b = dej.b(i2);
        Layout.Alignment alignment = q7j.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : q7j.b : q7j.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, tn1.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a2 = lmaVar.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a2 == null || lmaVar.c() > f || z4) {
                i9 = i3;
                textDirectionHeuristic = b;
                u = waa.u(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (ceil < 0) {
                    s3a.a("negative width");
                }
                if (ceil < 0) {
                    s3a.a("negative ellipsized width");
                }
                u = Build.VERSION.SDK_INT >= 33 ? rz1.a(charSequence, textPaint, ceil, alignment2, a2, z, truncateAt, ceil) : new BoringLayout(charSequence, textPaint, ceil, alignment2, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a2, z, truncateAt, ceil);
                i9 = i3;
                textDirectionHeuristic = b;
                z2 = true;
            }
            this.f = u;
            Trace.endSection();
            int min = Math.min(u.getLineCount(), i9);
            this.g = min;
            int i21 = min - 1;
            this.d = min >= i9 && (u.getEllipsisCount(i21) > 0 || u.getLineEnd(i21) != charSequence.length());
            if (u.getText() instanceof Spanned) {
                CharSequence text = u.getText();
                text.getClass();
                if (wca.z((Spanned) text, s7b.class) || u.getText().length() <= 0) {
                    CharSequence text2 = u.getText();
                    text2.getClass();
                    i10 = 0;
                    s7bVarArr = (s7b[]) ((Spanned) text2).getSpans(0, u.getText().length(), s7b.class);
                    this.n = s7bVarArr;
                    if (s7bVarArr != null || (s7bVar2 = (s7b) ph0.A(s7bVarArr)) == null) {
                        i11 = 2;
                        i12 = i10;
                    } else {
                        if (s7bVar2.c) {
                            i11 = 2;
                            if (s7bVar2.f == 2) {
                                i20 = 1;
                                i12 = i20;
                            }
                        } else {
                            i11 = 2;
                        }
                        i20 = i10;
                        i12 = i20;
                    }
                    i13 = (s7bVarArr == null && (s7bVar = (s7b) ph0.A(s7bVarArr)) != null && s7bVar.d && s7bVar.f == i11) ? 1 : i10;
                    if (i12 != 0 || i13 == 0) {
                        j = dej.b;
                        if (!z) {
                            i14 = 33;
                        } else if (z2) {
                            BoringLayout boringLayout = (BoringLayout) u;
                            i14 = 33;
                            if (Build.VERSION.SDK_INT >= 33) {
                                i16 = z9.s(boringLayout);
                                if (i16 == 0) {
                                    TextPaint paint = u.getPaint();
                                    CharSequence text3 = u.getText();
                                    c = ' ';
                                    Rect s = v8a.s(paint, text3, u.getLineStart(i10), u.getLineEnd(i10));
                                    int lineAscent = u.getLineAscent(i10);
                                    j2 = 4294967295L;
                                    int i22 = s.top;
                                    int topPadding = i22 < lineAscent ? lineAscent - i22 : u.getTopPadding();
                                    i15 = 1;
                                    s = min != 1 ? v8a.s(paint, text3, u.getLineStart(i21), u.getLineEnd(i21)) : s;
                                    int lineDescent = u.getLineDescent(i21);
                                    int i23 = s.bottom;
                                    int bottomPadding = i23 > lineDescent ? i23 - lineDescent : u.getBottomPadding();
                                    if (topPadding != 0 || bottomPadding != 0) {
                                        j3 = dej.a(topPadding, bottomPadding);
                                        a = dej.a(i12 == 0 ? i10 : (int) (j3 >> c), i13 == 0 ? i10 : (int) (j3 & j2));
                                    }
                                    j3 = j;
                                    a = dej.a(i12 == 0 ? i10 : (int) (j3 >> c), i13 == 0 ? i10 : (int) (j3 & j2));
                                }
                            }
                            i16 = i10;
                            if (i16 == 0) {
                            }
                        } else {
                            i14 = 33;
                            StaticLayout staticLayout = (StaticLayout) u;
                            int i24 = Build.VERSION.SDK_INT;
                            if (i24 >= 33) {
                                i16 = z9.t(staticLayout);
                            } else {
                                if (i24 >= 28) {
                                    i16 = 1;
                                }
                                i16 = i10;
                            }
                            if (i16 == 0) {
                            }
                        }
                        c = ' ';
                        j2 = 4294967295L;
                        i15 = 1;
                        j3 = j;
                        a = dej.a(i12 == 0 ? i10 : (int) (j3 >> c), i13 == 0 ? i10 : (int) (j3 & j2));
                    } else {
                        a = dej.b;
                        j = a;
                        c = ' ';
                        j2 = 4294967295L;
                        i15 = 1;
                        i14 = 33;
                    }
                    if (s7bVarArr != null) {
                        int length2 = s7bVarArr.length;
                        int i25 = i10;
                        int i26 = i25;
                        for (int i27 = i26; i27 < length2; i27++) {
                            s7b s7bVar3 = s7bVarArr[i27];
                            int i28 = s7bVar3.k;
                            i25 = i28 < 0 ? Math.max(i25, Math.abs(i28)) : i25;
                            int i29 = s7bVar3.l;
                            if (i29 < 0) {
                                i26 = Math.max(i25, Math.abs(i29));
                            }
                        }
                        j = (i25 == 0 && i26 == 0) ? dej.b : dej.a(i25, i26);
                    }
                    this.h = Math.max((int) (a >> c), (int) (j >> c));
                    this.i = Math.max((int) (a & j2), (int) (j & j2));
                    TextPaint textPaint2 = this.a;
                    s7b[] s7bVarArr2 = this.n;
                    i17 = this.g - i15;
                    layout = this.f;
                    if (layout.getLineStart(i17) == layout.getLineEnd(i17) || s7bVarArr2 == null || s7bVarArr2.length == 0) {
                        i18 = i10;
                        fontMetricsInt = null;
                    } else {
                        SpannableString spannableString = new SpannableString("\u200b");
                        s7b s7bVar4 = (s7b) ph0.z(s7bVarArr2);
                        int length3 = spannableString.length();
                        if (i17 == 0 || !(z3 = s7bVar4.d)) {
                            boolean z5 = s7bVar4.d;
                            z3 = z5 ? 1 : 0;
                            i19 = z5;
                        } else {
                            i19 = i10;
                        }
                        spannableString.setSpan(new s7b(s7bVar4.a, length3, i19, z3, s7bVar4.e, s7bVar4.f), i10, spannableString.length(), i14);
                        i18 = i10;
                        StaticLayout u2 = waa.u(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, ama.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                        fontMetricsInt = new Paint.FontMetricsInt();
                        fontMetricsInt.ascent = u2.getLineAscent(i18);
                        fontMetricsInt.descent = u2.getLineDescent(i18);
                        fontMetricsInt.top = u2.getLineTop(i18);
                        fontMetricsInt.bottom = u2.getLineBottom(i18);
                    }
                    this.m = fontMetricsInt == null ? fontMetricsInt.bottom - ((int) (e(i21) - h(i21))) : i18;
                    this.l = fontMetricsInt;
                    Layout layout2 = this.f;
                    this.j = u0a.u(layout2, i21, layout2.getPaint());
                    Layout layout3 = this.f;
                    this.k = u0a.v(layout3, i21, layout3.getPaint());
                }
            }
            s7bVarArr = null;
            i10 = 0;
            this.n = s7bVarArr;
            if (s7bVarArr != null) {
            }
            i11 = 2;
            i12 = i10;
            if (s7bVarArr == null) {
            }
            if (i12 != 0) {
            }
            j = dej.b;
            if (!z) {
            }
            c = ' ';
            j2 = 4294967295L;
            i15 = 1;
            j3 = j;
            a = dej.a(i12 == 0 ? i10 : (int) (j3 >> c), i13 == 0 ? i10 : (int) (j3 & j2));
            if (s7bVarArr != null) {
            }
            this.h = Math.max((int) (a >> c), (int) (j >> c));
            this.i = Math.max((int) (a & j2), (int) (j & j2));
            TextPaint textPaint22 = this.a;
            s7b[] s7bVarArr22 = this.n;
            i17 = this.g - i15;
            layout = this.f;
            if (layout.getLineStart(i17) == layout.getLineEnd(i17)) {
            }
            i18 = i10;
            fontMetricsInt = null;
            this.m = fontMetricsInt == null ? fontMetricsInt.bottom - ((int) (e(i21) - h(i21))) : i18;
            this.l = fontMetricsInt;
            Layout layout22 = this.f;
            this.j = u0a.u(layout22, i21, layout22.getPaint());
            Layout layout32 = this.f;
            this.k = u0a.v(layout32, i21, layout32.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.m;
    }

    public final float b(int i) {
        return i == this.g + (-1) ? this.j + this.k : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final p03 c() {
        p03 p03Var = this.p;
        if (p03Var != null) {
            return p03Var;
        }
        p03 p03Var2 = new p03(this.f);
        this.p = p03Var2;
        return p03Var2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.l) == null) ? this.f.getLineBaseline(i) : h(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = dej.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int g(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float h(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float i(int i, boolean z) {
        return b(g(i)) + c().j(i, true, z);
    }

    public final float j(int i, boolean z) {
        return b(g(i)) + c().j(i, false, z);
    }

    public final j12 k() {
        j12 j12Var = this.e;
        if (j12Var != null) {
            return j12Var;
        }
        Layout layout = this.f;
        j12 j12Var2 = new j12(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = j12Var2;
        return j12Var2;
    }
}
