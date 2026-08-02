package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lt8j;", "Lbuc;", "Lu8j;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class t8j extends buc {
    public final kkj a;
    public final r3 b;
    public final obj c;
    public final kt3 d;

    public t8j(kkj kkjVar, r3 r3Var, obj objVar, kt3 kt3Var) {
        this.a = kkjVar;
        this.b = r3Var;
        this.c = objVar;
        this.d = kt3Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new u8j(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8j)) {
            return false;
        }
        t8j t8jVar = (t8j) obj;
        return this.a == t8jVar.a && this.b == t8jVar.b && this.c == t8jVar.c && this.d == t8jVar.d;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        u8j u8jVar = (u8j) wtcVar;
        u8jVar.q.a = null;
        kkj kkjVar = this.a;
        u8jVar.q = kkjVar;
        kkjVar.a = u8jVar;
        kkjVar.b = u8jVar.n ? jkj.c : jkj.b;
        u8jVar.r = this.b;
        u8jVar.s = this.c;
        u8jVar.t = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
