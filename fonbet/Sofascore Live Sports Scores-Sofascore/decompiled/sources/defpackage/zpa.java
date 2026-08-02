package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzpa;", "Lbuc;", "Laqa;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class zpa extends buc {
    public final g0i a;
    public final g0i b;
    public final j38 c;

    public zpa(g0i g0iVar, g0i g0iVar2, j38 j38Var) {
        this.a = g0iVar;
        this.b = g0iVar2;
        this.c = j38Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        aqa aqaVar = new aqa();
        aqaVar.o = this.a;
        aqaVar.p = this.b;
        aqaVar.q = this.c;
        return aqaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpa)) {
            return false;
        }
        zpa zpaVar = (zpa) obj;
        return this.a.equals(zpaVar.a) && this.b.equals(zpaVar.b) && Intrinsics.c(this.c, zpaVar.c);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        aqa aqaVar = (aqa) wtcVar;
        aqaVar.o = this.a;
        aqaVar.p = this.b;
        aqaVar.q = this.c;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        j38 j38Var = this.c;
        return hashCode + (j38Var == null ? 0 : j38Var.hashCode());
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.b + ", fadeOutSpec=" + this.c + ')';
    }
}
