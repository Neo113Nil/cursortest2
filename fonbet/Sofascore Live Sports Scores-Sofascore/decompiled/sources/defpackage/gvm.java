package defpackage;

import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import defpackage.gim;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gvm extends hoi implements Function1 {
    public final /* synthetic */ w3m r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvm(w3m w3mVar, boolean z, rq3 rq3Var) {
        super(1, rq3Var);
        this.r = w3mVar;
        this.s = z;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new gvm(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new gvm(this.r, this.s, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean j0;
        boolean z;
        fam famVar;
        n4m D;
        i iVar;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        w3m w3mVar = this.r;
        boolean z2 = ((wpm) w3mVar.H0.getValue()).a;
        fdi fdiVar = w3mVar.H0;
        do {
            value = fdiVar.getValue();
            j0 = w3m.j0(w3mVar);
            ((wpm) value).getClass();
        } while (!fdiVar.k(value, new wpm(true, true, j0)));
        if (this.s && !z2 && (D = w3mVar.D()) != null && (iVar = D.i) != null && nq8.s(iVar)) {
            n4m D2 = w3mVar.D();
            gim gimVar = D2 != null ? D2.b : null;
            if (gimVar instanceof gim.e) {
                gim.e eVar = (gim.e) gimVar;
                z = true;
                mzm.b(w3mVar, EventActionName.CTA_VISIBLE, mzm.createVideosPlayerProps$default(w3mVar, eVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
                famVar = w3mVar.e;
                if (famVar != null && famVar.isPlaying() == z) {
                    w3mVar.h0(b7m.a);
                }
                return Unit.a;
            }
        }
        z = true;
        famVar = w3mVar.e;
        if (famVar != null) {
            w3mVar.h0(b7m.a);
        }
        return Unit.a;
    }
}
