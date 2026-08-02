package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pkm implements b98 {
    public final /* synthetic */ sqm a;

    public pkm(sqm sqmVar) {
        this.a = sqmVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        qim qimVar = (qim) obj;
        sqm sqmVar = this.a;
        sqmVar.getClass();
        if (!Intrinsics.c(qimVar.a, sqmVar.H()) && !Intrinsics.c(qimVar.a, sqmVar.j)) {
            return Unit.a;
        }
        if (qimVar == null) {
            zzl.b();
            return null;
        }
        sqmVar.getClass();
        hs4 hs4Var = z45.a;
        Object R = xw3.R(hq4.c, new h3m(sqmVar, qimVar, null), rq3Var);
        return R == lu3.a ? R : Unit.a;
    }
}
