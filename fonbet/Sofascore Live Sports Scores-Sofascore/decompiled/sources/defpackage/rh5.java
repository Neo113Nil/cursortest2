package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.SearchTeamsResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rh5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ sh5 t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh5(sh5 sh5Var, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = sh5Var;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        sh5 sh5Var = this.t;
        switch (i) {
            case 0:
                return new rh5(sh5Var, str, rq3Var, 0);
            default:
                return new rh5(sh5Var, str, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((rh5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r15 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002d, code lost:
    
        if (defpackage.n4o.y(100, r14) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
    
        if (r15 == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0098, code lost:
    
        if (defpackage.n4o.y(100, r14) == r0) goto L52;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Team team;
        Sport sport;
        List<Team> list;
        Team team2;
        Sport sport2;
        List<Team> list2;
        int i = this.r;
        sh5 sh5Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                } else if (i2 == 1) {
                    y6a.M(obj);
                } else if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    yzc yzcVar = sh5Var.i;
                    SearchTeamsResponse searchTeamsResponse = (SearchTeamsResponse) yaa.x((x2g) obj);
                    if (searchTeamsResponse == null || (list = searchTeamsResponse.getTeams()) == null) {
                        list = km5.a;
                    }
                    yzcVar.j(list);
                    break;
                }
                Player player = sh5Var.m;
                String slug = (player == null || (team = player.getTeam()) == null || (sport = team.getSport()) == null) ? null : sport.getSlug();
                e64 e64Var = sh5Var.f;
                this.s = 2;
                e64Var.getClass();
                obj = yaa.P(new yw(e64Var, slug, this.u, null, 4), this);
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                } else if (i3 == 1) {
                    y6a.M(obj);
                } else if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    yzc yzcVar2 = sh5Var.k;
                    SearchTeamsResponse searchTeamsResponse2 = (SearchTeamsResponse) yaa.x((x2g) obj);
                    if (searchTeamsResponse2 == null || (list2 = searchTeamsResponse2.getTeams()) == null) {
                        list2 = km5.a;
                    }
                    yzcVar2.j(list2);
                    break;
                }
                Player player2 = sh5Var.m;
                String slug2 = (player2 == null || (team2 = player2.getTeam()) == null || (sport2 = team2.getSport()) == null) ? null : sport2.getSlug();
                e64 e64Var2 = sh5Var.f;
                this.s = 2;
                e64Var2.getClass();
                obj = yaa.P(new yw(e64Var2, slug2, this.u, null, 4), this);
                break;
        }
        return Unit.a;
    }
}
