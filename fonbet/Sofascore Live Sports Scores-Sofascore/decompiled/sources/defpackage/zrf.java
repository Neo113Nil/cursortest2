package defpackage;

import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zrf implements oz7 {
    public final l3 a;

    public zrf() {
        lw8 lw8Var = lnl.a;
        lw8Var.getClass();
        this.a = lw8Var;
    }

    @Override // defpackage.oz7
    public final wm8 a() {
        return new ph3();
    }

    @Override // defpackage.oz7
    public final v9e b() {
        l3 l3Var = this.a;
        gef a = l3Var.a();
        String c = l3Var.c();
        a.getClass();
        c.getClass();
        km5 km5Var = km5.a;
        return new v9e(km5Var, b.j(new v9e(a.c(new ajd(a.c(new yrf(a, c)))), km5Var), new v9e(b.j(new zhe("+"), new ajd(a.c(new xck(null, null, a, c, false)))), km5Var), new v9e(b.j(new zhe("-"), new ajd(a.c(new xck(null, null, a, c, true)))), km5Var)));
    }

    @Override // defpackage.oz7
    public final l3 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof zrf;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(1970) * 31);
    }
}
