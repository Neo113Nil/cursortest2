package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class aej {
    public final zdj a;
    public final eyc b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public aej(zdj zdjVar, eyc eycVar, long j) {
        this.a = zdjVar;
        this.b = eycVar;
        this.c = j;
        ArrayList arrayList = eycVar.h;
        boolean isEmpty = arrayList.isEmpty();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = isEmpty ? 0.0f : ((c8e) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            c8e c8eVar = (c8e) CollectionsKt.h0(arrayList);
            f = c8eVar.a.d.d(r4.g - 1) + c8eVar.f;
        }
        this.e = f;
        this.f = eycVar.g;
    }

    public final d1g a(int i) {
        eyc eycVar = this.b;
        eycVar.l(i);
        int length = ((q80) eycVar.a.b).b.length();
        ArrayList arrayList = eycVar.h;
        c8e c8eVar = (c8e) arrayList.get(i == length ? arrayList.size() - 1 : qha.r(i, arrayList));
        return c8eVar.a.d.f.isRtlCharAt(c8eVar.d(i)) ? d1g.b : d1g.a;
    }

    public final oqf b(int i) {
        float j;
        float j2;
        float i2;
        float i3;
        eyc eycVar = this.b;
        eycVar.k(i);
        ArrayList arrayList = eycVar.h;
        c8e c8eVar = (c8e) arrayList.get(qha.r(i, arrayList));
        x10 x10Var = c8eVar.a;
        int d = c8eVar.d(i);
        CharSequence charSequence = x10Var.e;
        if (d < 0 || d >= charSequence.length()) {
            StringBuilder t = lnb.t(d, "offset(", ") is out of bounds [0,");
            t.append(charSequence.length());
            t.append(')');
            s3a.a(t.toString());
        }
        ydj ydjVar = x10Var.d;
        int g = ydjVar.g(d);
        float h = ydjVar.h(g);
        float e = ydjVar.e(g);
        Layout layout = ydjVar.f;
        boolean z = layout.getParagraphDirection(g) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                i2 = ydjVar.j(d, false);
                i3 = ydjVar.j(d + 1, true);
            } else if (isRtlCharAt) {
                i2 = ydjVar.i(d, false);
                i3 = ydjVar.i(d + 1, true);
            } else {
                j = ydjVar.j(d, false);
                j2 = ydjVar.j(d + 1, true);
            }
            float f = i2;
            j = i3;
            j2 = f;
        } else {
            j = ydjVar.i(d, false);
            j2 = ydjVar.i(d + 1, true);
        }
        RectF rectF = new RectF(j, h, j2, e);
        return c8eVar.a(new oqf(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final oqf c(int i) {
        eyc eycVar = this.b;
        eycVar.l(i);
        int length = ((q80) eycVar.a.b).b.length();
        ArrayList arrayList = eycVar.h;
        c8e c8eVar = (c8e) arrayList.get(i == length ? arrayList.size() - 1 : qha.r(i, arrayList));
        x10 x10Var = c8eVar.a;
        int d = c8eVar.d(i);
        CharSequence charSequence = x10Var.e;
        ydj ydjVar = x10Var.d;
        if (d < 0 || d > charSequence.length()) {
            StringBuilder t = lnb.t(d, "offset(", ") is out of bounds [0,");
            t.append(charSequence.length());
            t.append(']');
            s3a.a(t.toString());
        }
        float i2 = ydjVar.i(d, false);
        int g = ydjVar.g(d);
        return c8eVar.a(new oqf(i2, ydjVar.h(g), i2, ydjVar.e(g)));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        eyc eycVar = this.b;
        return f < eycVar.d || eycVar.c || ((float) ((int) (j & 4294967295L))) < eycVar.e;
    }

    public final float e(int i, boolean z) {
        eyc eycVar = this.b;
        eycVar.l(i);
        int length = ((q80) eycVar.a.b).b.length();
        ArrayList arrayList = eycVar.h;
        c8e c8eVar = (c8e) arrayList.get(i == length ? arrayList.size() - 1 : qha.r(i, arrayList));
        x10 x10Var = c8eVar.a;
        int d = c8eVar.d(i);
        ydj ydjVar = x10Var.d;
        return z ? ydjVar.i(d, false) : ydjVar.j(d, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aej) {
            aej aejVar = (aej) obj;
            if (this.a.equals(aejVar.a) && this.b == aejVar.b && c7a.a(this.c, aejVar.c) && this.d == aejVar.d && this.e == aejVar.e && this.f.equals(aejVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        eyc eycVar = this.b;
        eycVar.m(i);
        ArrayList arrayList = eycVar.h;
        c8e c8eVar = (c8e) arrayList.get(qha.s(i, arrayList));
        x10 x10Var = c8eVar.a;
        int i2 = i - c8eVar.d;
        ydj ydjVar = x10Var.d;
        return ydjVar.f.getLineLeft(i2) + (i2 == ydjVar.g + (-1) ? ydjVar.j : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final float g(int i) {
        eyc eycVar = this.b;
        eycVar.m(i);
        ArrayList arrayList = eycVar.h;
        c8e c8eVar = (c8e) arrayList.get(qha.s(i, arrayList));
        x10 x10Var = c8eVar.a;
        int i2 = i - c8eVar.d;
        ydj ydjVar = x10Var.d;
        return ydjVar.f.getLineRight(i2) + (i2 == ydjVar.g + (-1) ? ydjVar.k : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final int h(int i) {
        eyc eycVar = this.b;
        eycVar.m(i);
        ArrayList arrayList = eycVar.h;
        c8e c8eVar = (c8e) arrayList.get(qha.s(i, arrayList));
        x10 x10Var = c8eVar.a;
        return x10Var.d.f.getLineStart(i - c8eVar.d) + c8eVar.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + fc6.a(this.e, fc6.a(this.d, ljg.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final d1g i(int i) {
        eyc eycVar = this.b;
        eycVar.l(i);
        int length = ((q80) eycVar.a.b).b.length();
        ArrayList arrayList = eycVar.h;
        c8e c8eVar = (c8e) arrayList.get(i == length ? arrayList.size() - 1 : qha.r(i, arrayList));
        x10 x10Var = c8eVar.a;
        int d = c8eVar.d(i);
        ydj ydjVar = x10Var.d;
        return ydjVar.f.getParagraphDirection(ydjVar.g(d)) == 1 ? d1g.a : d1g.b;
    }

    public final b20 j(int i, int i2) {
        eyc eycVar = this.b;
        q80 q80Var = (q80) eycVar.a.b;
        if (i < 0 || i > i2 || i2 > q80Var.b.length()) {
            StringBuilder s = lnb.s(i, i2, "Start(", ") or End(", ") is out of range [0..");
            s.append(q80Var.b.length());
            s.append("), or start > end!");
            s3a.a(s.toString());
        }
        if (i == i2) {
            return e20.a();
        }
        b20 a = e20.a();
        qha.u(eycVar.h, t6a.g(i, i2), new w64(a, i, i2, 2));
        return a;
    }

    public final long k(int i) {
        int N;
        int i2;
        int E;
        eyc eycVar = this.b;
        eycVar.l(i);
        int length = ((q80) eycVar.a.b).b.length();
        ArrayList arrayList = eycVar.h;
        c8e c8eVar = (c8e) arrayList.get(i == length ? arrayList.size() - 1 : qha.r(i, arrayList));
        x10 x10Var = c8eVar.a;
        int d = c8eVar.d(i);
        j12 k = x10Var.d.k();
        if (k.z(k.N(d))) {
            k.i(d);
            N = d;
            while (N != -1 && (!k.z(N) || k.v(N))) {
                N = k.N(N);
            }
        } else {
            k.i(d);
            N = k.y(d) ? (!k.w(d) || k.u(d)) ? k.N(d) : d : k.u(d) ? k.N(d) : -1;
        }
        if (N == -1) {
            N = d;
        }
        if (k.v(k.E(d))) {
            k.i(d);
            i2 = d;
            while (i2 != -1 && (k.z(i2) || !k.v(i2))) {
                i2 = k.E(i2);
            }
        } else {
            k.i(d);
            if (k.u(d)) {
                if (!k.w(d) || k.y(d)) {
                    E = k.E(d);
                    i2 = E;
                } else {
                    i2 = d;
                }
            } else if (k.y(d)) {
                E = k.E(d);
                i2 = E;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            d = i2;
        }
        return c8eVar.b(t6a.g(N, d), false);
    }

    public final boolean l(int i) {
        eyc eycVar = this.b;
        eycVar.m(i);
        ArrayList arrayList = eycVar.h;
        Layout layout = ((c8e) arrayList.get(qha.s(i, arrayList))).a.d.f;
        ThreadLocal threadLocal = dej.a;
        return layout.getEllipsisCount(i) > 0;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) c7a.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
