package defpackage;

import com.sofascore.model.fantasy.FantasyLeague;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserLeague;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xv6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public yv6 s;
    public int t;
    public final /* synthetic */ yv6 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv6(yv6 yv6Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = yv6Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        yv6 yv6Var = this.u;
        switch (i) {
            case 0:
                return new xv6(yv6Var, rq3Var, 0);
            default:
                return new xv6(yv6Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((xv6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r10.emit(r2, r9) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0111, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L70;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yv6 yv6Var;
        Object obj2;
        yv6 yv6Var2;
        FantasyLeague league;
        int i = this.r;
        yv6 yv6Var3 = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.t;
                if (i2 == 0) {
                    y6a.M(obj);
                    ia0 ia0Var = ia0.q;
                    String e = fc6.e();
                    wi7 wi7Var = yv6Var3.e;
                    this.s = yv6Var3;
                    this.t = 1;
                    obj = wi7Var.Q(e, this);
                    if (obj != lu3Var) {
                        yv6Var = yv6Var3;
                    }
                    return lu3Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yv6Var = this.s;
                y6a.M(obj);
                Iterator it = ((Iterable) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        int id = ((FantasyUserCompetition) obj2).getFantasyCompetition().getId();
                        pv6 pv6Var = yv6Var3.h;
                        if (pv6Var == null) {
                            Intrinsics.i("deepLinkData");
                            throw null;
                        }
                        if (id == pv6Var.a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                FantasyUserCompetition fantasyUserCompetition = (FantasyUserCompetition) obj2;
                yv6Var.i = fantasyUserCompetition != null ? fkf.O(fantasyUserCompetition, yv6Var3.i()) : null;
                aeh aehVar = yv6Var3.f;
                Object obj3 = yv6Var3.i != null ? qv6.a : tv6.a;
                this.s = null;
                this.t = 2;
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.t;
                if (i3 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = yv6Var3.e;
                    pv6 pv6Var2 = yv6Var3.h;
                    if (pv6Var2 == null) {
                        Intrinsics.i("deepLinkData");
                        throw null;
                    }
                    String str = pv6Var2.b;
                    this.s = yv6Var3;
                    this.t = 1;
                    wi7Var2.getClass();
                    obj = yaa.P(new ug7(wi7Var2, str, null, 6), this);
                    if (obj != lu3Var2) {
                        yv6Var2 = yv6Var3;
                    }
                    return lu3Var2;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    return Unit.a;
                }
                yv6Var2 = this.s;
                y6a.M(obj);
                FantasyUserLeague fantasyUserLeague = (FantasyUserLeague) yaa.x((x2g) obj);
                yv6Var2.k = (fantasyUserLeague == null || (league = fantasyUserLeague.getLeague()) == null) ? null : iz8.w(league);
                j67 j67Var = yv6Var3.k;
                Integer num = j67Var != null ? new Integer(j67Var.a) : null;
                aeh aehVar2 = yv6Var3.f;
                Object sv6Var = num != null ? new sv6(num.intValue()) : rv6.a;
                this.s = null;
                this.t = 2;
                break;
        }
    }
}
