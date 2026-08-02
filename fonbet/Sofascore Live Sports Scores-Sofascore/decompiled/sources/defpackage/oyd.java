package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Loyd;", "Lbuc;", "Lpyd;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class oyd extends buc {
    public final myd a;

    public oyd(myd mydVar) {
        this.a = mydVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        xv4 a = this.a.a();
        pyd pydVar = new pyd();
        pydVar.q = a;
        return pydVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oyd) {
            return this.a.equals(((oyd) obj).a);
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        pyd pydVar = (pyd) wtcVar;
        xv4 a = this.a.a();
        xv4 xv4Var = pydVar.q;
        if (xv4Var != null) {
            pydVar.l1(xv4Var);
        }
        pydVar.q = a;
        if (a == null || ((wtc) a).a.n) {
            a = null;
        } else {
            pydVar.k1(a);
        }
        pydVar.q = a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
