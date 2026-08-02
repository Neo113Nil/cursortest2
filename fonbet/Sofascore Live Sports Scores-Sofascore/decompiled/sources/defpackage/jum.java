package defpackage;

import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import defpackage.gim;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jum extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ w3m s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jum(w3m w3mVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = w3mVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new jum(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new jum(this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean j0;
        i iVar;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        w3m w3mVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            long j = w3mVar.L0;
            this.r = 1;
            if (n4o.y(j, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        n4m D = w3mVar.D();
        if (D != null && (iVar = D.i) != null && nq8.s(iVar)) {
            n4m D2 = w3mVar.D();
            gim gimVar = D2 != null ? D2.b : null;
            if (gimVar instanceof gim.e) {
                mzm.b(w3mVar, EventActionName.CTA_DISMISSED, mzm.createVideosPlayerProps$default(w3mVar, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
            }
        }
        fdi fdiVar = w3mVar.H0;
        do {
            value = fdiVar.getValue();
            j0 = w3m.j0(w3mVar);
            ((wpm) value).getClass();
        } while (!fdiVar.k(value, new wpm(false, false, j0)));
        return Unit.a;
    }
}
