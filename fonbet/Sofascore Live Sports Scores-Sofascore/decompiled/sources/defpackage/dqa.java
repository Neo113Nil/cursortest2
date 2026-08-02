package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldqa;", "Lbuc;", "Lgqa;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class dqa extends buc {
    public final hqa a;
    public final cqa b;
    public final ewd c;

    public dqa(hqa hqaVar, cqa cqaVar, ewd ewdVar) {
        this.a = hqaVar;
        this.b = cqaVar;
        this.c = ewdVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        gqa gqaVar = new gqa();
        gqaVar.o = this.a;
        gqaVar.p = this.b;
        gqaVar.q = this.c;
        return gqaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqa)) {
            return false;
        }
        dqa dqaVar = (dqa) obj;
        return Intrinsics.c(this.a, dqaVar.a) && Intrinsics.c(this.b, dqaVar.b) && this.c == dqaVar.c;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        gqa gqaVar = (gqa) wtcVar;
        gqaVar.o = this.a;
        gqaVar.p = this.b;
        gqaVar.q = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
