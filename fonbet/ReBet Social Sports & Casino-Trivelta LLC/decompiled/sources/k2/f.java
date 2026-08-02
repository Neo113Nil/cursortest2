package k2;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import d1.AbstractC3992h;
import d1.C3989e;
import d1.C3991g;
import d1.C3993i;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f {
    public static void a(Spannable spannable, int i10, int i11, g gVar, C5148c c5148c, Map map, int i12) {
        C5148c e10;
        g f10;
        int i13;
        if (gVar.n() != -1) {
            spannable.setSpan(new StyleSpan(gVar.n()), i10, i11, 33);
        }
        if (gVar.u()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.v()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.s()) {
            AbstractC3992h.b(spannable, new ForegroundColorSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.r()) {
            AbstractC3992h.b(spannable, new BackgroundColorSpan(gVar.b()), i10, i11, 33);
        }
        if (gVar.e() != null) {
            AbstractC3992h.b(spannable, new TypefaceSpan(gVar.e()), i10, i11, 33);
        }
        if (gVar.q() != null) {
            C5147b c5147b = (C5147b) AbstractC4134a.e(gVar.q());
            int i14 = c5147b.f54137a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = c5147b.f54138b;
            }
            int i15 = c5147b.f54139c;
            if (i15 == -2) {
                i15 = 1;
            }
            AbstractC3992h.b(spannable, new C3993i(i14, i13, i15), i10, i11, 33);
        }
        int l10 = gVar.l();
        if (l10 == 2) {
            C5148c d10 = d(c5148c, map);
            if (d10 != null && (e10 = e(d10, map)) != null) {
                if (e10.g() != 1 || e10.f(0).f54141b == null) {
                    AbstractC4156x.g("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) Z.i(e10.f(0).f54141b);
                    g f11 = f(e10.f54145f, e10.l(), map);
                    int k10 = f11 != null ? f11.k() : -1;
                    if (k10 == -1 && (f10 = f(d10.f54145f, d10.l(), map)) != null) {
                        k10 = f10.k();
                    }
                    spannable.setSpan(new C3991g(str, k10), i10, i11, 33);
                }
            }
        } else if (l10 == 3 || l10 == 4) {
            spannable.setSpan(new C5146a(), i10, i11, 33);
        }
        if (gVar.p()) {
            AbstractC3992h.b(spannable, new C3989e(), i10, i11, 33);
        }
        int g10 = gVar.g();
        if (g10 == 1) {
            AbstractC3992h.b(spannable, new AbsoluteSizeSpan((int) gVar.f(), true), i10, i11, 33);
        } else if (g10 == 2) {
            AbstractC3992h.b(spannable, new RelativeSizeSpan(gVar.f()), i10, i11, 33);
        } else {
            if (g10 != 3) {
                return;
            }
            AbstractC3992h.a(spannable, gVar.f() / 100.0f, i10, i11, 33);
        }
    }

    public static String b(String str) {
        return str.replaceAll("\r\n", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll(" *\n *", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static C5148c d(C5148c c5148c, Map map) {
        while (c5148c != null) {
            g f10 = f(c5148c.f54145f, c5148c.l(), map);
            if (f10 != null && f10.l() == 1) {
                return c5148c;
            }
            c5148c = c5148c.f54148i;
        }
        return null;
    }

    public static C5148c e(C5148c c5148c, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c5148c);
        while (!arrayDeque.isEmpty()) {
            C5148c c5148c2 = (C5148c) arrayDeque.pop();
            g f10 = f(c5148c2.f54145f, c5148c2.l(), map);
            if (f10 != null && f10.l() == 3) {
                return c5148c2;
            }
            for (int g10 = c5148c2.g() - 1; g10 >= 0; g10--) {
                arrayDeque.push(c5148c2.f(g10));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a((g) map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a((g) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a((g) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}
