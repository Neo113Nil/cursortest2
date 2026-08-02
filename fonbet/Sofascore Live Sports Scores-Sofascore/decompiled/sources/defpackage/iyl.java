package defpackage;

import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamEdgeState;
import defpackage.n4m;
import defpackage.zwm;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class iyl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1m b;

    public /* synthetic */ iyl(c1m c1mVar, int i) {
        this.a = i;
        this.b = c1mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        c1m c1mVar = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    c1mVar.R = 0;
                    c1mVar.S.set(true);
                    c1mVar.B = false;
                }
                c1mVar.z(booleanValue);
                c1mVar.u(qxm.a);
                break;
            case 1:
                htl htlVar = (htl) obj;
                htlVar.getClass();
                n4m D = c1mVar.D();
                if ((D != null ? D.c : null) instanceof n4m.a.b) {
                    c1mVar.F.k(htlVar);
                }
                break;
            case 2:
                ywl ywlVar = (ywl) obj;
                ywlVar.getClass();
                fdi fdiVar = c1mVar.K;
                fdiVar.getClass();
                fdiVar.m(null, ywlVar);
                c1mVar.u(new zwm.a(ywlVar));
                break;
            default:
                BlazeLiveStreamEdgeState blazeLiveStreamEdgeState = (BlazeLiveStreamEdgeState) obj;
                blazeLiveStreamEdgeState.getClass();
                fdi fdiVar2 = c1mVar.r;
                fdiVar2.getClass();
                fdiVar2.m(null, blazeLiveStreamEdgeState);
                break;
        }
        return Unit.a;
    }
}
