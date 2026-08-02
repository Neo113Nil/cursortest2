package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zgh implements fed {
    public final xn1 a;
    public final Set b;

    public zgh(xn1 xn1Var) {
        this.a = xn1Var;
        xbb b = a.b();
        n4o.v(b, xn1Var);
        xbb a = a.a(b);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = a.listIterator(0);
        while (true) {
            hc9 hc9Var = (hc9) listIterator;
            if (!hc9Var.hasNext()) {
                break;
            }
            jnd d = ((oz7) hc9Var.next()).c().d();
            if (d != null) {
                arrayList.add(d);
            }
        }
        Set W0 = CollectionsKt.W0(arrayList);
        this.b = W0;
        if (W0.isEmpty()) {
            a70.p("Signed format must contain at least one field with a sign");
            throw null;
        }
    }

    @Override // defpackage.vm8
    public final wm8 a() {
        this.a.a.a();
        return new ph3();
    }

    @Override // defpackage.vm8
    public final v9e b() {
        return nq8.v(b.j(new v9e(a.c(new ugh(new fvg(this, 9), "sign for " + this.b)), km5.a), this.a.a.b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zgh) {
            return this.a.equals(((zgh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.a + ')';
    }
}
