package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import androidx.compose.runtime.e;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yaj implements cdi, qdi {
    public jej c;
    public final e1d a = e.e(null, xaj.f);
    public final e1d b = e.e(null, waj.g);
    public vaj d = new vaj();

    @Override // defpackage.qdi
    public final void c(sdi sdiVar) {
        this.d = (vaj) sdiVar;
    }

    @Override // defpackage.qdi
    public final sdi d() {
        return this.d;
    }

    public final aej e(xaj xajVar, waj wajVar) {
        dib c;
        CharSequence charSequence;
        dfj dfjVar;
        m9j d = xajVar.a.d();
        List list = d.a;
        List list2 = d.b;
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            list = null;
        } else if (list == null || list.isEmpty()) {
            list = list2;
        } else if (list2 != null && !list2.isEmpty()) {
            xbb b = a.b();
            b.addAll(list);
            b.addAll(list2);
            list = a.a(b);
        }
        vaj vajVar = (vaj) snh.f(this.d);
        aej aejVar = vajVar.n;
        if (aejVar != null && (charSequence = vajVar.c) != null && c.j(charSequence, d) && Intrinsics.c(vajVar.d, list) && Intrinsics.c(vajVar.e, d.e) && vajVar.g == xajVar.c && vajVar.h == xajVar.d && vajVar.k == wajVar.b && vajVar.i == wajVar.a.j() && vajVar.j == wajVar.a.getFontScale() && an3.b(vajVar.m, wajVar.d) && Intrinsics.c(vajVar.l, wajVar.c) && !aejVar.b.a.a()) {
            dfj dfjVar2 = vajVar.f;
            boolean z = false;
            boolean d2 = dfjVar2 != null ? dfjVar2.d(xajVar.b) : false;
            dfj dfjVar3 = vajVar.f;
            if (dfjVar3 != null && (dfjVar3 == (dfjVar = xajVar.b) || dfjVar3.a.c(dfjVar.a))) {
                z = true;
            }
            if (d2 && z) {
                return aejVar;
            }
            if (d2) {
                zdj zdjVar = aejVar.a;
                return new aej(new zdj(zdjVar.a, xajVar.b, zdjVar.c, zdjVar.d, zdjVar.e, zdjVar.f, zdjVar.g, zdjVar.h, zdjVar.i, zdjVar.j), aejVar.b, aejVar.c);
            }
        }
        jej jejVar = this.c;
        if (jejVar == null) {
            jejVar = new jej(wajVar.c, wajVar.a, wajVar.b, 1);
            this.c = jejVar;
        }
        jej jejVar2 = jejVar;
        boolean z2 = xajVar.e;
        dfj dfjVar4 = xajVar.b;
        if (z2) {
            eib eibVar = dfjVar4.a.k;
            if (eibVar == null || (c = eibVar.c()) == null) {
                c = pie.a.P().c();
            }
            byte J = Build.VERSION.SDK_INT >= 28 ? c90.J(c) : Character.getDirectionality(DecimalFormatSymbols.getInstance(c.a).getZeroDigit());
            dfjVar4 = dfjVar4.e(new dfj(0L, 0L, null, null, 0L, 0, (J == 1 || J == 2) ? 2 : 1, 0L, 16711679));
        }
        aej b2 = jej.b(jejVar2, new q80(d.c.toString(), list == null ? km5.a : list), dfjVar4, xajVar.d, xajVar.c ? 1 : Integer.MAX_VALUE, null, wajVar.d, wajVar.b, wajVar.a, wajVar.c, 1060);
        if (!b2.equals(aejVar)) {
            nnh h = snh.h();
            if (!h.f()) {
                vaj vajVar2 = this.d;
                synchronized (snh.c) {
                    vaj vajVar3 = (vaj) snh.w(vajVar2, this, h);
                    vajVar3.c = d;
                    vajVar3.d = list;
                    vajVar3.e = d.e;
                    vajVar3.g = xajVar.c;
                    vajVar3.h = xajVar.d;
                    vajVar3.f = xajVar.b;
                    vajVar3.k = wajVar.b;
                    vajVar3.i = wajVar.e;
                    vajVar3.j = wajVar.f;
                    vajVar3.m = wajVar.d;
                    vajVar3.l = wajVar.c;
                    vajVar3.n = b2;
                    Unit unit = Unit.a;
                }
                snh.l(h, this);
                return b2;
            }
        }
        return b2;
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        waj wajVar;
        xaj xajVar = (xaj) ((eoh) this.a).getValue();
        if (xajVar == null || (wajVar = (waj) ((eoh) this.b).getValue()) == null) {
            return null;
        }
        return e(xajVar, wajVar);
    }

    @Override // defpackage.qdi
    public final sdi n(sdi sdiVar, sdi sdiVar2, sdi sdiVar3) {
        return sdiVar3;
    }
}
