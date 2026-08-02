package defpackage;

import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamEdgeState;
import com.blaze.blazesdk.players.BlazeVideoManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z0n extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ BlazeVideoManager s;
    public final /* synthetic */ n4m t;
    public final /* synthetic */ Function2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0n(BlazeVideoManager blazeVideoManager, n4m n4mVar, Function2 function2, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = blazeVideoManager;
        this.t = n4mVar;
        this.u = function2;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new z0n(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((z0n) create((rq3) obj)).invokeSuspend(Unit.a);
        return lu3.a;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        long S;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0 && i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        do {
            n4m n4mVar = this.t;
            BlazeVideoManager blazeVideoManager = this.s;
            boolean e = blazeVideoManager.e(n4mVar);
            Object obj2 = blazeVideoManager.a;
            if (e) {
                if (((vg6) obj2).getDuration() >= 0) {
                    this.u.invoke(new Long(((vg6) obj2).getCurrentPosition()), new Long(((vg6) obj2).getDuration()));
                }
                iyl iylVar = blazeVideoManager.k;
                if (iylVar != null) {
                    g51 g51Var = (g51) obj2;
                    if (g51Var.J()) {
                        kij kijVar = g51Var.a;
                        mij currentTimeline = g51Var.getCurrentTimeline();
                        boolean p = currentTimeline.p();
                        long j = C.TIME_UNSET;
                        if (!p && currentTimeline.m(g51Var.y(), kijVar, 0L).e != C.TIME_UNSET) {
                            j = (nik.D(kijVar.f) - kijVar.e) - g51Var.getContentPosition();
                        }
                        Long valueOf = Long.valueOf(j);
                        if (j < 0) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            iylVar.invoke(valueOf.longValue() <= 5000 ? BlazeLiveStreamEdgeState.AT_LIVE_EDGE : BlazeLiveStreamEdgeState.BEHIND_LIVE);
                        }
                    }
                }
            }
            wd5 wd5Var = xd5.b;
            S = wkn.S(10L, be5.MILLISECONDS);
            this.r = 1;
        } while (n4o.z(S, this) != lu3Var);
        return lu3Var;
    }
}
