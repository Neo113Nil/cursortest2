package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcqd;", "Lbuc;", "Ldqd;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class cqd extends buc {
    public final Function1 a;

    public cqd(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.buc
    public final wtc c() {
        dqd dqdVar = new dqd();
        dqdVar.o = this.a;
        return dqdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cqd) {
            return this.a == ((cqd) obj).a;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((dqd) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
