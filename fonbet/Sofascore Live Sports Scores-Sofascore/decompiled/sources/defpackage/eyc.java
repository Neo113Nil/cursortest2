package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eyc {
    public final p03 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public eyc(p03 p03Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int g;
        int i5;
        this.a = p03Var;
        this.b = i;
        if (an3.j(j) != 0 || an3.i(j) != 0) {
            s3a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) p03Var.f;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            d8e d8eVar = (d8e) arrayList2.get(i6);
            a20 a20Var = d8eVar.a;
            int h = an3.h(j);
            if (an3.c(j)) {
                i4 = i6;
                g = an3.g(j) - ((int) Math.ceil(f));
                if (g < 0) {
                    g = 0;
                }
            } else {
                i4 = i6;
                g = an3.g(j);
            }
            i3 = 0;
            x10 x10Var = new x10(a20Var, this.b - i7, i2, cn3.b(0, h, 0, g, 5));
            float b = x10Var.b() + f;
            ydj ydjVar = x10Var.d;
            int i8 = i7 + ydjVar.g;
            arrayList.add(new c8e(x10Var, d8eVar.b, d8eVar.c, i7, i8, f, b));
            if (!ydjVar.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != b.i((ArrayList) this.a.f)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = b;
            }
            z = true;
            i7 = i8;
            f = b;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = an3.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            c8e c8eVar = (c8e) arrayList.get(i9);
            List list = c8eVar.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                oqf oqfVar = (oqf) list.get(i10);
                arrayList4.add(oqfVar != null ? c8eVar.a(oqfVar) : null);
            }
            o13.v(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.c).size()) {
            int size4 = ((List) this.a.c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = CollectionsKt.w0(arrayList5, arrayList3);
        }
        this.g = arrayList3;
    }

    public static void j(eyc eycVar, uj2 uj2Var, long j, qah qahVar, v8j v8jVar, ja5 ja5Var, int i) {
        if ((i & 2) != 0) {
            j = r13.i;
        }
        eycVar.i(uj2Var, j, (i & 4) != 0 ? null : qahVar, (i & 8) != 0 ? null : v8jVar, (i & 16) != 0 ? null : ja5Var, 3);
    }

    public final void a(long j, float[] fArr) {
        k(pej.g(j));
        l(pej.f(j));
        dsf dsfVar = new dsf();
        dsfVar.a = 0;
        qha.u(this.h, j, new lz1(j, fArr, dsfVar, new csf()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        c8e c8eVar = (c8e) arrayList.get(qha.s(i, arrayList));
        x10 x10Var = c8eVar.a;
        return x10Var.d.e(i - c8eVar.d) + c8eVar.f;
    }

    public final int c(int i, boolean z) {
        int f;
        m(i);
        ArrayList arrayList = this.h;
        c8e c8eVar = (c8e) arrayList.get(qha.s(i, arrayList));
        x10 x10Var = c8eVar.a;
        int i2 = i - c8eVar.d;
        ydj ydjVar = x10Var.d;
        if (z) {
            Layout layout = ydjVar.f;
            ThreadLocal threadLocal = dej.a;
            if (layout.getEllipsisCount(i2) <= 0 || ydjVar.b != TextUtils.TruncateAt.END) {
                p03 c = ydjVar.c();
                Layout layout2 = (Layout) c.b;
                f = c.o(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            f = ydjVar.f(i2);
        }
        return f + c8eVar.b;
    }

    public final int d(int i) {
        int length = ((q80) this.a.b).b.length();
        ArrayList arrayList = this.h;
        c8e c8eVar = (c8e) arrayList.get(i >= length ? arrayList.size() - 1 : i < 0 ? 0 : qha.r(i, arrayList));
        return c8eVar.a.d.g(c8eVar.d(i)) + c8eVar.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        c8e c8eVar = (c8e) arrayList.get(qha.t(f, arrayList));
        int i = c8eVar.c - c8eVar.b;
        int i2 = c8eVar.d;
        if (i == 0) {
            return i2;
        }
        x10 x10Var = c8eVar.a;
        float f2 = f - c8eVar.f;
        ydj ydjVar = x10Var.d;
        int i3 = (int) f2;
        int i4 = ydjVar.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = ydjVar.f.getLineForVertical(i3 - ydjVar.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        c8e c8eVar = (c8e) arrayList.get(qha.s(i, arrayList));
        x10 x10Var = c8eVar.a;
        return x10Var.d.h(i - c8eVar.d) + c8eVar.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        c8e c8eVar = (c8e) arrayList.get(qha.t(intBitsToFloat, arrayList));
        int i2 = c8eVar.c;
        int i3 = c8eVar.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        x10 x10Var = c8eVar.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - c8eVar.f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        ydj ydjVar = x10Var.d;
        int intBitsToFloat4 = (int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
        Layout layout = ydjVar.f;
        int lineForVertical = layout.getLineForVertical(intBitsToFloat4 - ydjVar.h);
        if (lineForVertical >= ydjVar.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (ydjVar.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(oqf oqfVar, int i, ilg ilgVar) {
        long j;
        long j2;
        float f = oqfVar.b;
        ArrayList arrayList = this.h;
        int t = qha.t(f, arrayList);
        float f2 = ((c8e) arrayList.get(t)).g;
        float f3 = oqfVar.d;
        if (f2 >= f3 || t == arrayList.size() - 1) {
            c8e c8eVar = (c8e) arrayList.get(t);
            return c8eVar.b(c8eVar.a.c(c8eVar.c(oqfVar), i, ilgVar), true);
        }
        int t2 = qha.t(f3, arrayList);
        long j3 = pej.b;
        while (true) {
            j = pej.b;
            if (!pej.c(j3, j) || t > t2) {
                break;
            }
            c8e c8eVar2 = (c8e) arrayList.get(t);
            j3 = c8eVar2.b(c8eVar2.a.c(c8eVar2.c(oqfVar), i, ilgVar), true);
            t++;
        }
        if (pej.c(j3, j)) {
            return j;
        }
        while (true) {
            j2 = pej.b;
            if (!pej.c(j, j2) || t > t2) {
                break;
            }
            c8e c8eVar3 = (c8e) arrayList.get(t2);
            j = c8eVar3.b(c8eVar3.a.c(c8eVar3.c(oqfVar), i, ilgVar), true);
            t2--;
        }
        return pej.c(j, j2) ? j3 : t6a.g((int) (j3 >> 32), (int) (4294967295L & j));
    }

    public final void i(uj2 uj2Var, long j, qah qahVar, v8j v8jVar, ja5 ja5Var, int i) {
        uj2Var.o();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c8e c8eVar = (c8e) arrayList.get(i2);
            c8eVar.a.f(uj2Var, j, qahVar, v8jVar, ja5Var, i);
            uj2Var.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c8eVar.a.b());
        }
        uj2Var.h();
    }

    public final void k(int i) {
        q80 q80Var = (q80) this.a.b;
        if (i < 0 || i >= q80Var.b.length()) {
            StringBuilder t = lnb.t(i, "offset(", ") is out of bounds [0, ");
            t.append(q80Var.b.length());
            t.append(')');
            s3a.a(t.toString());
        }
    }

    public final void l(int i) {
        q80 q80Var = (q80) this.a.b;
        if (i < 0 || i > q80Var.b.length()) {
            StringBuilder t = lnb.t(i, "offset(", ") is out of bounds [0, ");
            t.append(q80Var.b.length());
            t.append(']');
            s3a.a(t.toString());
        }
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        s3a.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
