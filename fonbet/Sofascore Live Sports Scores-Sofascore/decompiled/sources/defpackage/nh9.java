package defpackage;

import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.playerOfTheSeason.POTSNetworkPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nh9 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nh9(boolean z, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                nh9 nh9Var = new nh9(this.t, rq3Var, 0);
                nh9Var.s = obj;
                return nh9Var;
            default:
                nh9 nh9Var2 = new nh9(this.t, rq3Var, 1);
                nh9Var2.s = obj;
                return nh9Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((nh9) create((yj9) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((nh9) create((POTSNetworkPlayer) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String name;
        int i = this.r;
        boolean z = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                ((yj9) this.s).f.a(sh9.c, new mh9(z, 0));
                return Unit.a;
            default:
                POTSNetworkPlayer pOTSNetworkPlayer = (POTSNetworkPlayer) this.s;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                pOTSNetworkPlayer.getClass();
                int id = pOTSNetworkPlayer.getPlayer().getId();
                String t = tba.t(pOTSNetworkPlayer.getPlayer());
                UniqueTournament uniqueTournament = pOTSNetworkPlayer.getUniqueTournament();
                int id2 = uniqueTournament != null ? uniqueTournament.getId() : -1;
                UniqueTournament uniqueTournament2 = pOTSNetworkPlayer.getUniqueTournament();
                String x = uniqueTournament2 != null ? tba.x(uniqueTournament2) : null;
                if (x == null) {
                    x = "";
                }
                String str = x;
                int id3 = pOTSNetworkPlayer.getTeam().getId();
                FieldTranslations fieldTranslations = pOTSNetworkPlayer.getTeam().getFieldTranslations();
                if (fieldTranslations == null || (name = tba.r(fieldTranslations)) == null) {
                    name = pOTSNetworkPlayer.getTeam().getName();
                }
                return new m1e(id, t, id3, name, id2, str, pOTSNetworkPlayer.getSeason().getId(), z ? String.valueOf(pOTSNetworkPlayer.getYear()) : null, pOTSNetworkPlayer.getRating());
        }
    }
}
