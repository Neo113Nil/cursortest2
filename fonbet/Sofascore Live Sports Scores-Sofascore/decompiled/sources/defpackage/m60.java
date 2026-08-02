package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Lm60;", PlayerKt.VOLLEYBALL_SETTER, "Lbuc;", "Lp60;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class m60<S> extends buc {
    public final pwj a;
    public final e1d b;
    public final r60 c;

    public m60(pwj pwjVar, e1d e1dVar, r60 r60Var) {
        this.a = pwjVar;
        this.b = e1dVar;
        this.c = r60Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        p60 p60Var = new p60(1);
        p60Var.p = this.a;
        p60Var.q = this.b;
        p60Var.r = this.c;
        p60Var.s = -9223372034707292160L;
        return p60Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m60)) {
            return false;
        }
        m60 m60Var = (m60) obj;
        return Intrinsics.c(m60Var.a, this.a) && m60Var.b.equals(this.b);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        p60 p60Var = (p60) wtcVar;
        p60Var.p = this.a;
        p60Var.q = this.b;
        p60Var.r = this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        pwj pwjVar = this.a;
        return this.b.hashCode() + ((hashCode + (pwjVar != null ? pwjVar.hashCode() : 0)) * 31);
    }
}
