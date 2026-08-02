package defpackage;

import com.sofascore.model.fantasy.FantasyPlayerPostModel;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasySquadResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class up7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ vp7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up7(vp7 vp7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        switch (i) {
            case 1:
                this.t = vp7Var;
                super(2, rq3Var);
                break;
            default:
                smh smhVar = smh.e;
                this.t = vp7Var;
                break;
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        vp7 vp7Var = this.t;
        switch (i) {
            case 0:
                smh smhVar = smh.e;
                return new up7(vp7Var, rq3Var, 0);
            default:
                return new up7(vp7Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((up7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
    
        if (r2.q(r16, defpackage.lp7.a) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        if (r2 == r1) goto L29;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        int i = this.r;
        vp7 vp7Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    g62 g62Var = vp7Var.l;
                    smh smhVar = smh.e;
                    this.s = 1;
                    if (g62Var.q(this, smhVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                rq3 rq3Var = null;
                if (i3 == 0) {
                    y6a.M(obj);
                    gv9<oz6> gv9Var = vp7Var.k().d;
                    ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                    for (oz6 oz6Var : gv9Var) {
                        arrayList.add(new FantasyPlayerPostModel(oz6Var.getE(), oz6Var.getC(), oz6Var.getC() == oz6Var.getA().f - 1, false));
                    }
                    wi7 wi7Var = vp7Var.e;
                    int i4 = vp7Var.k().a.c;
                    this.s = 1;
                    wi7Var.getClass();
                    P = yaa.P(new c64(wi7Var, i4, arrayList, rq3Var, 9), this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                x2g x2gVar = (x2g) P;
                if (x2gVar instanceof t2g) {
                    ia0 ia0Var = ia0.q;
                    if (ok3.p().e().getDevMod()) {
                        Calendar calendar = ke0.a;
                        ke0.g(vp7Var.i(), "Update-Team: ".concat(yaa.z(((t2g) x2gVar).a)), 0);
                    }
                    g62 g62Var2 = vp7Var.j;
                    this.s = 2;
                    break;
                } else {
                    if (!(x2gVar instanceof v2g)) {
                        zzl.b();
                        return null;
                    }
                    List<FantasyRoundPlayer> players = ((FantasySquadResponse) ((v2g) x2gVar).a).getSquad().getPlayers();
                    ArrayList arrayList2 = new ArrayList(k13.r(players, 10));
                    Iterator<T> it = players.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(hkg.g0((FantasyRoundPlayer) it.next(), vp7Var.i()));
                    }
                    xw3.L(un0.z(vp7Var), null, null, new hs6(vp7Var, arrayList2, rq3Var, 29), 3);
                }
                return Unit.a;
        }
    }
}
