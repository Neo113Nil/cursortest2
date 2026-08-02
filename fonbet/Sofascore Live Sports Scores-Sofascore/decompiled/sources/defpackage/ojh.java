package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lojh;", "Lbuc;", "Lrjh;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ojh extends buc {
    public final j38 a;
    public final mv1 b;
    public final Function2 c;

    public ojh(j38 j38Var, mv1 mv1Var, Function2 function2) {
        this.a = j38Var;
        this.b = mv1Var;
        this.c = function2;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new rjh(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ojh)) {
            return false;
        }
        ojh ojhVar = (ojh) obj;
        return Intrinsics.c(ojhVar.a, this.a) && ojhVar.c == this.c && ojhVar.b.equals(this.b);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        rjh rjhVar = (rjh) wtcVar;
        rjhVar.p = this.a;
        rjhVar.r = this.c;
        rjhVar.q = this.b;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Function2 function2 = this.c;
        return hashCode + (function2 != null ? function2.hashCode() : 0);
    }
}
