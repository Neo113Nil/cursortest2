package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t9 extends r9 {
    public static t9 d;
    public static final d1g e = d1g.b;
    public static final d1g f = d1g.a;
    public aej c;

    public final int G(int i, d1g d1gVar) {
        aej aejVar = this.c;
        if (aejVar == null) {
            Intrinsics.i("layoutResult");
            throw null;
        }
        int h = aejVar.h(i);
        aej aejVar2 = this.c;
        if (aejVar2 == null) {
            Intrinsics.i("layoutResult");
            throw null;
        }
        d1g i2 = aejVar2.i(h);
        aej aejVar3 = this.c;
        if (d1gVar != i2) {
            if (aejVar3 != null) {
                return aejVar3.h(i);
            }
            Intrinsics.i("layoutResult");
            throw null;
        }
        if (aejVar3 != null) {
            return aejVar3.b.c(i, false) - 1;
        }
        Intrinsics.i("layoutResult");
        throw null;
    }

    @Override // defpackage.r9
    public final int[] g(int i) {
        int i2;
        if (p().length() > 0 && i < p().length()) {
            aej aejVar = this.c;
            d1g d1gVar = e;
            if (i < 0) {
                if (aejVar == null) {
                    Intrinsics.i("layoutResult");
                    throw null;
                }
                i2 = aejVar.b.d(0);
            } else {
                if (aejVar == null) {
                    Intrinsics.i("layoutResult");
                    throw null;
                }
                int d2 = aejVar.b.d(i);
                i2 = G(d2, d1gVar) == i ? d2 : d2 + 1;
            }
            aej aejVar2 = this.c;
            if (aejVar2 == null) {
                Intrinsics.i("layoutResult");
                throw null;
            }
            if (i2 < aejVar2.b.f) {
                return l(G(i2, d1gVar), G(i2, f) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.r9
    public final int[] y(int i) {
        int i2;
        if (p().length() > 0 && i > 0) {
            int length = p().length();
            aej aejVar = this.c;
            d1g d1gVar = f;
            if (i > length) {
                if (aejVar == null) {
                    Intrinsics.i("layoutResult");
                    throw null;
                }
                i2 = aejVar.b.d(p().length());
            } else {
                if (aejVar == null) {
                    Intrinsics.i("layoutResult");
                    throw null;
                }
                int d2 = aejVar.b.d(i);
                i2 = G(d2, d1gVar) + 1 == i ? d2 : d2 - 1;
            }
            if (i2 >= 0) {
                return l(G(i2, e), G(i2, d1gVar) + 1);
            }
        }
        return null;
    }
}
