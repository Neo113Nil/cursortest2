package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcri;", "Lbuc;", "Ldri;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class cri extends buc {
    public final Function1 a;

    public cri(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.buc
    public final wtc c() {
        dri driVar = new dri(xw3.k);
        driVar.r = this.a;
        return driVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cri) {
            return this.a == ((cri) obj).a;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        dri driVar = (dri) wtcVar;
        Function1 function1 = driVar.r;
        Function1 function12 = this.a;
        if (function1 != function12) {
            driVar.r = function12;
            cal calVar = driVar.s;
            if (calVar != null) {
                w8l w8lVar = (w8l) function12.invoke(calVar);
                if (Intrinsics.c(w8lVar, driVar.q)) {
                    return;
                }
                driVar.q = w8lVar;
                driVar.l1();
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
