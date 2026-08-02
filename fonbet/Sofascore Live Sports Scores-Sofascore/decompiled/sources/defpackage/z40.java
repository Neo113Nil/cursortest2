package defpackage;

import com.moloco.sdk.internal.services.analytics.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x0;
import com.sofascore.results.league.service.LeagueWorker;
import com.sofascore.results.player.PlayerWorker;
import com.sofascore.results.team.TeamWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z40 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public long t;
    public /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 9;
        this.t = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new z40((b50) this.u, this.t, rq3Var, 0);
            case 1:
                return new z40(this.t, (lcd) this.u, rq3Var, 1);
            case 2:
                return new z40((LeagueWorker) this.u, this.t, rq3Var, 2);
            case 3:
                return new z40((ypb) this.u, rq3Var, 3);
            case 4:
                return new z40(this.t, (boh) this.u, rq3Var, 4);
            case 5:
                return new z40((PlayerWorker) this.u, this.t, rq3Var, 5);
            case 6:
                return new z40(this.t, (noi) this.u, rq3Var, 6);
            case 7:
                return new z40((TeamWorker) this.u, this.t, rq3Var, 7);
            case 8:
                return new z40((ebj) this.u, this.t, rq3Var, 8);
            case 9:
                z40 z40Var = new z40(this.t, rq3Var);
                z40Var.u = obj;
                return z40Var;
            case 10:
                return new z40((qkl) this.u, rq3Var, 10);
            case 11:
                return new z40((a) this.u, this.t, rq3Var, 11);
            case 12:
                return new z40(this.t, (n) this.u, rq3Var, 12);
            default:
                return new z40(this.t, (x0) this.u, rq3Var, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((z40) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0166 -> B:60:0x016a). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z40.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z40(long j, Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = j;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z40(q8 q8Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = q8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z40(Object obj, long j, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.t = j;
    }
}
