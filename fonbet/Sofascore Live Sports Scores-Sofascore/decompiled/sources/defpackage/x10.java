package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x10 {
    public final a20 a;
    public final int b;
    public final long c;
    public final ydj d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:110:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c6 A[EDGE_INSN: B:160:0x01c6->B:75:0x01c6 BREAK  A[LOOP:0: B:69:0x01b6->B:72:0x01c3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x10(a20 a20Var, int i, int i2, long j) {
        int i3;
        CharSequence charSequence;
        int i4;
        char c;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        CharSequence charSequence2;
        int i11;
        CharSequence charSequence3;
        int i12;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        int i13;
        ydj a;
        TextUtils.TruncateAt truncateAt3;
        int i14;
        x10 x10Var;
        int i15;
        TextUtils.TruncateAt truncateAt4;
        int i16;
        Layout layout;
        pah[] pahVarArr;
        CharSequence charSequence4;
        List list;
        boolean z;
        oqf oqfVar;
        float j2;
        int c2;
        float i17;
        int c3;
        float d;
        int b;
        float h;
        float f;
        float d2;
        int i18;
        int i19;
        CharSequence charSequence5 = a20Var.h;
        this.a = a20Var;
        this.b = i;
        this.c = j;
        if (an3.i(j) != 0 || an3.j(j) != 0) {
            s3a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            s3a.a("maxLines should be greater than 0");
        }
        dfj dfjVar = a20Var.b;
        if (i2 == 2) {
            i3 = 0;
            if (!lfj.a(dfjVar.a.h, v8a.v(0)) && !lfj.a(dfjVar.a.h, lfj.c) && (i19 = dfjVar.b.a) != 0 && i19 != 5 && i19 != 4 && charSequence5.length() != 0) {
                Spannable spannable = charSequence5 instanceof Spannable ? (Spannable) charSequence5 : null;
                spannable = spannable == null ? new SpannableString(charSequence5) : spannable;
                if (!wca.z(spannable, s0a.class)) {
                    spannable.setSpan(new s0a(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence5 = spannable;
            }
        } else {
            i3 = 0;
        }
        this.e = charSequence5;
        g8e g8eVar = dfjVar.b;
        int i20 = g8eVar.a;
        if (i20 == 1) {
            charSequence = charSequence5;
            i4 = 3;
        } else if (i20 == 2) {
            charSequence = charSequence5;
            i4 = 4;
        } else if (i20 == 3) {
            charSequence = charSequence5;
            i4 = 2;
        } else if (i20 != 5 && i20 == 6) {
            charSequence = charSequence5;
            i4 = 1;
        } else {
            charSequence = charSequence5;
            i4 = i3;
        }
        int i21 = i20 == 4 ? 1 : i3;
        int i22 = g8eVar.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i23 = g8eVar.g;
        int i24 = i23 & 255;
        if (i24 != 1) {
            if (i24 == 2) {
                c = ' ';
                i5 = i21;
                i6 = 1;
            } else if (i24 == 3) {
                c = ' ';
                i5 = i21;
                i6 = 2;
            }
            i7 = (i23 >> 8) & 255;
            if (i7 != 1) {
                if (i7 == 2) {
                    i8 = 1;
                } else if (i7 == 3) {
                    i8 = 2;
                } else if (i7 == 4) {
                    i8 = 3;
                }
                i9 = (i23 >> 16) & 255;
                if (i9 == 1) {
                    charSequence2 = charSequence;
                    i11 = i3;
                    i10 = 2;
                } else {
                    i10 = 2;
                    if (i9 == 2) {
                        charSequence2 = charSequence;
                        i11 = 1;
                    } else {
                        charSequence2 = charSequence;
                        i11 = i3;
                    }
                }
                if (i2 != i10) {
                    if (i2 == 5) {
                        truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                    } else if (i2 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        charSequence3 = charSequence2;
                        i12 = 1;
                        truncateAt = null;
                    }
                    charSequence3 = charSequence2;
                    i13 = i22;
                    truncateAt = truncateAt2;
                    i12 = 1;
                    a = a(i4, i5, truncateAt, i, i13, i6, i8, i11, charSequence3);
                    truncateAt3 = truncateAt;
                    CharSequence charSequence6 = charSequence3;
                    Layout layout2 = a.f;
                    if (Build.VERSION.SDK_INT < 35 || a20Var.g.getLetterSpacing() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        i14 = 2;
                        x10Var = this;
                        i15 = i;
                        truncateAt4 = truncateAt3;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                        CharSequence subSequence = charSequence6.subSequence(0, ellipsisStart);
                        CharSequence subSequence2 = charSequence6.subSequence(ellipsisCount, charSequence6.length());
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = subSequence;
                        charSequenceArr[i12] = "…";
                        i14 = 2;
                        charSequenceArr[2] = subSequence2;
                        CharSequence concat = TextUtils.concat(charSequenceArr);
                        x10Var = this;
                        i15 = i;
                        truncateAt4 = truncateAt3;
                        a = x10Var.a(i4, i5, truncateAt4, i15, i13, i6, i8, i11, concat);
                    }
                    i16 = a.g;
                    if (i2 == i14 && a.a() > an3.g(j) && i15 > i12) {
                        int g = an3.g(j);
                        i18 = 0;
                        while (true) {
                            if (i18 >= i16) {
                                break;
                            }
                            if (a.e(i18) > g) {
                                i16 = i18;
                                break;
                            }
                            i18++;
                        }
                        if (i16 >= 0 && i16 != x10Var.b) {
                            a = x10Var.a(i4, i5, truncateAt4, i16 >= 1 ? 1 : i16, i13, i6, i8, i11, x10Var.e);
                        }
                        x10Var.d = a;
                        x10Var.a.g.c(dfjVar.b(), (Float.floatToRawIntBits(x10Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x10Var.d()) << c), dfjVar.a.a.a());
                        layout = a.f;
                        if (layout.getText() instanceof Spanned) {
                            CharSequence text = layout.getText();
                            text.getClass();
                            Spanned spanned = (Spanned) text;
                            if (spanned.nextSpanTransition(-1, spanned.length(), pah.class) != spanned.length()) {
                                CharSequence text2 = layout.getText();
                                text2.getClass();
                                pahVarArr = (pah[]) ((Spanned) text2).getSpans(0, layout.getText().length(), pah.class);
                                if (pahVarArr != null) {
                                    for (pah pahVar : pahVarArr) {
                                        ((eoh) pahVar.c).setValue(new njh((Float.floatToRawIntBits(x10Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x10Var.d()) << c)));
                                    }
                                }
                                charSequence4 = x10Var.e;
                                if (charSequence4 instanceof Spanned) {
                                    Spanned spanned2 = (Spanned) charSequence4;
                                    Object[] spans = spanned2.getSpans(0, charSequence4.length(), xhe.class);
                                    ArrayList arrayList = new ArrayList(spans.length);
                                    for (Object obj : spans) {
                                        xhe xheVar = (xhe) obj;
                                        int spanStart = spanned2.getSpanStart(xheVar);
                                        int spanEnd = spanned2.getSpanEnd(xheVar);
                                        int g2 = x10Var.d.g(spanStart);
                                        boolean z2 = g2 >= x10Var.b;
                                        if (x10Var.d.f.getEllipsisCount(g2) > 0) {
                                            if (spanEnd > x10Var.d.f.getEllipsisStart(g2) + x10Var.d.f.getLineStart(g2)) {
                                                z = true;
                                                boolean z3 = spanEnd <= x10Var.d.f(g2);
                                                if (!z || z3 || z2) {
                                                    oqfVar = null;
                                                } else {
                                                    boolean z4 = x10Var.d.f.getParagraphDirection(g2) == 1;
                                                    boolean isRtlCharAt = x10Var.d.f.isRtlCharAt(spanStart);
                                                    if (!z4 || isRtlCharAt) {
                                                        if (z4 && isRtlCharAt) {
                                                            i17 = x10Var.d.j(spanStart, false);
                                                            c3 = xheVar.c();
                                                        } else {
                                                            ydj ydjVar = x10Var.d;
                                                            if (isRtlCharAt) {
                                                                i17 = ydjVar.i(spanStart, false);
                                                                c3 = xheVar.c();
                                                            } else {
                                                                j2 = ydjVar.j(spanStart, false);
                                                                c2 = xheVar.c();
                                                            }
                                                        }
                                                        j2 = i17 - c3;
                                                        ydj ydjVar2 = x10Var.d;
                                                        switch (xheVar.g) {
                                                            case 0:
                                                                d = ydjVar2.d(g2);
                                                                b = xheVar.b();
                                                                h = d - b;
                                                                oqfVar = new oqf(j2, h, i17, xheVar.b() + h);
                                                                break;
                                                            case 1:
                                                                h = ydjVar2.h(g2);
                                                                oqfVar = new oqf(j2, h, i17, xheVar.b() + h);
                                                                break;
                                                            case 2:
                                                                d = ydjVar2.e(g2);
                                                                b = xheVar.b();
                                                                h = d - b;
                                                                oqfVar = new oqf(j2, h, i17, xheVar.b() + h);
                                                                break;
                                                            case 3:
                                                                h = ((ydjVar2.e(g2) + ydjVar2.h(g2)) - xheVar.b()) / 2.0f;
                                                                oqfVar = new oqf(j2, h, i17, xheVar.b() + h);
                                                                break;
                                                            case 4:
                                                                f = xheVar.a().ascent;
                                                                d2 = ydjVar2.d(g2);
                                                                h = d2 + f;
                                                                oqfVar = new oqf(j2, h, i17, xheVar.b() + h);
                                                                break;
                                                            case 5:
                                                                d = ydjVar2.d(g2) + xheVar.a().descent;
                                                                b = xheVar.b();
                                                                h = d - b;
                                                                oqfVar = new oqf(j2, h, i17, xheVar.b() + h);
                                                                break;
                                                            case 6:
                                                                Paint.FontMetricsInt a2 = xheVar.a();
                                                                f = ((a2.ascent + a2.descent) - xheVar.b()) / 2;
                                                                d2 = ydjVar2.d(g2);
                                                                h = d2 + f;
                                                                oqfVar = new oqf(j2, h, i17, xheVar.b() + h);
                                                                break;
                                                            default:
                                                                a70.r("unexpected verticalAlignment");
                                                                throw null;
                                                        }
                                                    } else {
                                                        j2 = x10Var.d.i(spanStart, false);
                                                        c2 = xheVar.c();
                                                    }
                                                    i17 = c2 + j2;
                                                    ydj ydjVar22 = x10Var.d;
                                                    switch (xheVar.g) {
                                                    }
                                                }
                                                arrayList.add(oqfVar);
                                            }
                                        }
                                        z = false;
                                        if (spanEnd <= x10Var.d.f(g2)) {
                                        }
                                        if (z) {
                                        }
                                        oqfVar = null;
                                        arrayList.add(oqfVar);
                                    }
                                    list = arrayList;
                                } else {
                                    list = km5.a;
                                }
                                x10Var.f = list;
                            }
                        }
                        pahVarArr = null;
                        if (pahVarArr != null) {
                        }
                        charSequence4 = x10Var.e;
                        if (charSequence4 instanceof Spanned) {
                        }
                        x10Var.f = list;
                    }
                    x10Var.d = a;
                    x10Var.a.g.c(dfjVar.b(), (Float.floatToRawIntBits(x10Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x10Var.d()) << c), dfjVar.a.a.a());
                    layout = a.f;
                    if (layout.getText() instanceof Spanned) {
                    }
                    pahVarArr = null;
                    if (pahVarArr != null) {
                    }
                    charSequence4 = x10Var.e;
                    if (charSequence4 instanceof Spanned) {
                    }
                    x10Var.f = list;
                }
                charSequence3 = charSequence2;
                truncateAt = TextUtils.TruncateAt.END;
                i12 = 1;
                i13 = i22;
                a = a(i4, i5, truncateAt, i, i13, i6, i8, i11, charSequence3);
                truncateAt3 = truncateAt;
                CharSequence charSequence62 = charSequence3;
                Layout layout22 = a.f;
                if (Build.VERSION.SDK_INT < 35) {
                }
                i14 = 2;
                x10Var = this;
                i15 = i;
                truncateAt4 = truncateAt3;
                i16 = a.g;
                if (i2 == i14) {
                    int g3 = an3.g(j);
                    i18 = 0;
                    while (true) {
                        if (i18 >= i16) {
                        }
                        i18++;
                    }
                    if (i16 >= 0) {
                        a = x10Var.a(i4, i5, truncateAt4, i16 >= 1 ? 1 : i16, i13, i6, i8, i11, x10Var.e);
                    }
                    x10Var.d = a;
                    x10Var.a.g.c(dfjVar.b(), (Float.floatToRawIntBits(x10Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x10Var.d()) << c), dfjVar.a.a.a());
                    layout = a.f;
                    if (layout.getText() instanceof Spanned) {
                    }
                    pahVarArr = null;
                    if (pahVarArr != null) {
                    }
                    charSequence4 = x10Var.e;
                    if (charSequence4 instanceof Spanned) {
                    }
                    x10Var.f = list;
                }
                x10Var.d = a;
                x10Var.a.g.c(dfjVar.b(), (Float.floatToRawIntBits(x10Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x10Var.d()) << c), dfjVar.a.a.a());
                layout = a.f;
                if (layout.getText() instanceof Spanned) {
                }
                pahVarArr = null;
                if (pahVarArr != null) {
                }
                charSequence4 = x10Var.e;
                if (charSequence4 instanceof Spanned) {
                }
                x10Var.f = list;
            }
            i8 = i3;
            i9 = (i23 >> 16) & 255;
            if (i9 == 1) {
            }
            if (i2 != i10) {
            }
            i13 = i22;
            a = a(i4, i5, truncateAt, i, i13, i6, i8, i11, charSequence3);
            truncateAt3 = truncateAt;
            CharSequence charSequence622 = charSequence3;
            Layout layout222 = a.f;
            if (Build.VERSION.SDK_INT < 35) {
            }
            i14 = 2;
            x10Var = this;
            i15 = i;
            truncateAt4 = truncateAt3;
            i16 = a.g;
            if (i2 == i14) {
            }
            x10Var.d = a;
            x10Var.a.g.c(dfjVar.b(), (Float.floatToRawIntBits(x10Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x10Var.d()) << c), dfjVar.a.a.a());
            layout = a.f;
            if (layout.getText() instanceof Spanned) {
            }
            pahVarArr = null;
            if (pahVarArr != null) {
            }
            charSequence4 = x10Var.e;
            if (charSequence4 instanceof Spanned) {
            }
            x10Var.f = list;
        }
        c = ' ';
        i5 = i21;
        i6 = i3;
        i7 = (i23 >> 8) & 255;
        if (i7 != 1) {
        }
        i8 = i3;
        i9 = (i23 >> 16) & 255;
        if (i9 == 1) {
        }
        if (i2 != i10) {
        }
        i13 = i22;
        a = a(i4, i5, truncateAt, i, i13, i6, i8, i11, charSequence3);
        truncateAt3 = truncateAt;
        CharSequence charSequence6222 = charSequence3;
        Layout layout2222 = a.f;
        if (Build.VERSION.SDK_INT < 35) {
        }
        i14 = 2;
        x10Var = this;
        i15 = i;
        truncateAt4 = truncateAt3;
        i16 = a.g;
        if (i2 == i14) {
        }
        x10Var.d = a;
        x10Var.a.g.c(dfjVar.b(), (Float.floatToRawIntBits(x10Var.b()) & 4294967295L) | (Float.floatToRawIntBits(x10Var.d()) << c), dfjVar.a.a.a());
        layout = a.f;
        if (layout.getText() instanceof Spanned) {
        }
        pahVarArr = null;
        if (pahVarArr != null) {
        }
        charSequence4 = x10Var.e;
        if (charSequence4 instanceof Spanned) {
        }
        x10Var.f = list;
    }

    public final ydj a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        aje ajeVar;
        float d = d();
        a20 a20Var = this.a;
        f40 f40Var = a20Var.g;
        int i8 = a20Var.l;
        lma lmaVar = a20Var.i;
        dfj dfjVar = a20Var.b;
        y10 y10Var = z10.a;
        tje tjeVar = dfjVar.c;
        return new ydj(charSequence, d, f40Var, i, truncateAt, i8, (tjeVar == null || (ajeVar = tjeVar.b) == null) ? false : ajeVar.a, i3, i5, i6, i7, i4, i2, lmaVar);
    }

    public final float b() {
        return this.d.a();
    }

    public final long c(oqf oqfVar, int i, ilg ilgVar) {
        j1h h29Var;
        int i2;
        int[] iArr;
        RectF N = wba.N(oqfVar);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        t21 t21Var = new t21(ilgVar, 8);
        ydj ydjVar = this.d;
        Layout layout = ydjVar.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArr = q9.n(ydjVar, N, i3, t21Var);
        } else {
            p03 c = ydjVar.c();
            if (i3 == 1) {
                h29Var = new c0l(3, layout.getText(), ydjVar.k());
            } else {
                CharSequence text = layout.getText();
                h29Var = i4 >= 29 ? new h29(text, ydjVar.a) : new i29(text);
            }
            j1h j1hVar = h29Var;
            int lineForVertical = layout.getLineForVertical((int) N.top);
            if (N.top <= ydjVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < ydjVar.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) N.bottom);
                if (lineForVertical2 != 0 || N.bottom >= ydjVar.h(0)) {
                    int B = w3a.B(ydjVar, layout, c, i5, N, j1hVar, t21Var, true);
                    while (true) {
                        i2 = i5;
                        if (B != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        B = w3a.B(ydjVar, layout, c, i5, N, j1hVar, t21Var, true);
                    }
                    if (B != -1) {
                        int i6 = lineForVertical2;
                        int B2 = w3a.B(ydjVar, layout, c, i6, N, j1hVar, t21Var, false);
                        while (B2 == -1 && i2 < i6) {
                            i6--;
                            B2 = w3a.B(ydjVar, layout, c, i6, N, j1hVar, t21Var, false);
                        }
                        if (B2 != -1) {
                            iArr = new int[]{j1hVar.e(B + 1), j1hVar.f(B2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? pej.b : t6a.g(iArr[0], iArr[1]);
    }

    public final float d() {
        return an3.h(this.c);
    }

    public final void e(uj2 uj2Var) {
        Canvas b = xx.b(uj2Var);
        ydj ydjVar = this.d;
        if (ydjVar.d) {
            b.save();
            b.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d(), b());
        }
        int i = ydjVar.h;
        if (b.getClipBounds(ydjVar.o)) {
            if (i != 0) {
                b.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i);
            }
            ThreadLocal threadLocal = dej.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new r7j();
                threadLocal.set(obj);
            }
            r7j r7jVar = (r7j) obj;
            r7jVar.a = b;
            try {
                ydjVar.f.draw(r7jVar);
                if (i != 0) {
                    b.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-1.0f) * i);
                }
            } finally {
                r7jVar.a = null;
            }
        }
        if (ydjVar.d) {
            b.restore();
        }
    }

    public final void f(uj2 uj2Var, long j, qah qahVar, v8j v8jVar, ja5 ja5Var, int i) {
        f40 f40Var = this.a.g;
        int i2 = f40Var.c;
        f40Var.d(j);
        f40Var.f(qahVar);
        f40Var.g(v8jVar);
        f40Var.e(ja5Var);
        f40Var.b(i);
        e(uj2Var);
        f40Var.b(i2);
    }

    public final void g(uj2 uj2Var, n52 n52Var, float f, qah qahVar, v8j v8jVar, ja5 ja5Var) {
        f40 f40Var = this.a.g;
        int i = f40Var.c;
        float d = d();
        float b = b();
        f40Var.c(n52Var, (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(d) << 32), f);
        f40Var.f(qahVar);
        f40Var.g(v8jVar);
        f40Var.e(ja5Var);
        f40Var.b(3);
        e(uj2Var);
        f40Var.b(i);
    }
}
