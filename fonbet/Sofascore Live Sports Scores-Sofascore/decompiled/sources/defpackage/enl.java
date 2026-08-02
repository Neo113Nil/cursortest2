package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class enl implements oz7 {
    public final l3 a;
    public final Integer b;
    public final Integer c;
    public final k3e d;

    public enl(k3e k3eVar) {
        lw8 lw8Var = lnl.a;
        Integer valueOf = Integer.valueOf(k3eVar != k3e.b ? 1 : 4);
        Integer num = k3eVar != k3e.c ? null : 4;
        lw8Var.getClass();
        this.a = lw8Var;
        this.b = valueOf;
        this.c = num;
        this.d = k3eVar;
    }

    @Override // defpackage.oz7
    public final wm8 a() {
        int intValue = this.b.intValue();
        ph3 ph3Var = new ph3();
        if (intValue < 0) {
            ogj.h(lnb.k(intValue, "The minimum number of digits (", ") is negative"));
            return null;
        }
        if (intValue <= 9) {
            return this.c != null ? new ph3() : ph3Var;
        }
        ogj.h(lnb.k(intValue, "The minimum number of digits (", ") exceeds the length of an Int"));
        return null;
    }

    @Override // defpackage.oz7
    public final v9e b() {
        l3 l3Var = this.a;
        gef a = l3Var.a();
        String c = l3Var.c();
        a.getClass();
        c.getClass();
        Integer num = this.b;
        Integer num2 = this.c;
        ArrayList l = b.l(tba.M(num, null, num2, a, c, true));
        l.add(tba.M(num, 4, num2, a, c, false));
        List j = b.j(new zhe("+"), new ajd(a.c(new xck(5, null, a, c, false))));
        km5 km5Var = km5.a;
        l.add(new v9e(j, km5Var));
        return new v9e(km5Var, l);
    }

    @Override // defpackage.oz7
    public final l3 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enl) {
            return this.d == ((enl) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.d.hashCode() * 31);
    }
}
