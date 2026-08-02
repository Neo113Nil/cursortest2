package defpackage;

import android.app.Application;
import com.sofascore.model.newNetwork.PowerRanking;
import com.sofascore.model.newNetwork.PowerRankingResponse;
import com.sofascore.model.newNetwork.PowerRankingRound;
import com.sofascore.model.newNetwork.PowerRankingRoundsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Leza;", "Lynb;", "Lbza;", "Lsya;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class eza extends ynb {
    public final w3b l;
    public final cg4 m;
    public int n;
    public int o;
    public String p;
    public String q;
    public String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eza(Application application, w3b w3bVar, cg4 cg4Var) {
        super(application, tnb.a);
        w3bVar.getClass();
        cg4Var.getClass();
        this.l = w3bVar;
        this.m = cg4Var;
        this.q = "";
        this.r = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x005a, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a A[LOOP:0: B:44:0x008a->B:49:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(sq3 sq3Var) {
        dza dzaVar;
        lu3 lu3Var;
        int i;
        List<PowerRankingRound> powerRankingRounds;
        bza bzaVar;
        PowerRankingRound powerRankingRound;
        fdi fdiVar;
        Object value;
        Object a;
        List<PowerRankingRound> list;
        Object b0;
        PowerRankingRound powerRankingRound2;
        List<PowerRankingRound> list2;
        boolean z;
        PowerRankingResponse powerRankingResponse;
        List<PowerRanking> powerRankings;
        if (sq3Var instanceof dza) {
            dzaVar = (dza) sq3Var;
            int i2 = dzaVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dzaVar.x = i2 - Integer.MIN_VALUE;
                Object obj = dzaVar.v;
                lu3Var = lu3.a;
                i = dzaVar.x;
                w3b w3bVar = this.l;
                if (i != 0) {
                    y6a.M(obj);
                    int i3 = this.n;
                    int i4 = this.o;
                    dzaVar.x = 1;
                    obj = w3bVar.c0(i3, i4, dzaVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z2 = dzaVar.u;
                            PowerRankingRound powerRankingRound3 = dzaVar.t;
                            List<PowerRankingRound> list3 = dzaVar.r;
                            y6a.M(obj);
                            z = z2;
                            powerRankingRound2 = powerRankingRound3;
                            list2 = list3;
                            powerRankingResponse = (PowerRankingResponse) obj;
                            if (powerRankingResponse != null || (powerRankings = powerRankingResponse.getPowerRankings()) == null || (r12 = b0a.S(i(), powerRankings)) == null) {
                                gv9 gv9Var = rlh.b;
                            }
                            o(new b05(this, list2, powerRankingRound2, gv9Var, z));
                            return Unit.a;
                        }
                        powerRankingRound = dzaVar.s;
                        list = dzaVar.r;
                        y6a.M(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i5 = this.n;
                        int i6 = this.o;
                        int id = powerRankingRound.getId();
                        dzaVar.r = list;
                        dzaVar.s = null;
                        dzaVar.t = powerRankingRound;
                        dzaVar.u = booleanValue;
                        dzaVar.x = 3;
                        b0 = w3bVar.b0(i5, i6, id, dzaVar);
                        if (b0 != lu3Var) {
                            powerRankingRound2 = powerRankingRound;
                            list2 = list;
                            z = booleanValue;
                            obj = b0;
                            powerRankingResponse = (PowerRankingResponse) obj;
                            if (powerRankingResponse != null) {
                            }
                            gv9 gv9Var2 = rlh.b;
                            o(new b05(this, list2, powerRankingRound2, gv9Var2, z));
                            return Unit.a;
                        }
                        return lu3Var;
                    }
                    y6a.M(obj);
                }
                PowerRankingRoundsResponse powerRankingRoundsResponse = (PowerRankingRoundsResponse) obj;
                powerRankingRounds = powerRankingRoundsResponse == null ? powerRankingRoundsResponse.getPowerRankingRounds() : null;
                bzaVar = (bza) ((vnb) this.f.a.getValue()).a();
                if (bzaVar != null || (powerRankingRound = bzaVar.g) == null) {
                    powerRankingRound = powerRankingRounds == null ? (PowerRankingRound) CollectionsKt.firstOrNull(powerRankingRounds) : null;
                    if (powerRankingRound == null) {
                        do {
                            fdiVar = this.e;
                            value = fdiVar.getValue();
                            ((vnb) value).getClass();
                        } while (!fdiVar.k(value, new snb()));
                        return Unit.a;
                    }
                }
                dzaVar.r = powerRankingRounds;
                dzaVar.s = powerRankingRound;
                dzaVar.x = 2;
                a = this.m.a("PREF_POWER_RANKINGS_INFO_DISMISSED", false, dzaVar);
                if (a != lu3Var) {
                    list = powerRankingRounds;
                    obj = a;
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    int i52 = this.n;
                    int i62 = this.o;
                    int id2 = powerRankingRound.getId();
                    dzaVar.r = list;
                    dzaVar.s = null;
                    dzaVar.t = powerRankingRound;
                    dzaVar.u = booleanValue2;
                    dzaVar.x = 3;
                    b0 = w3bVar.b0(i52, i62, id2, dzaVar);
                    if (b0 != lu3Var) {
                    }
                }
                return lu3Var;
            }
        }
        dzaVar = new dza(this, sq3Var);
        Object obj2 = dzaVar.v;
        lu3Var = lu3.a;
        i = dzaVar.x;
        w3b w3bVar2 = this.l;
        if (i != 0) {
        }
        PowerRankingRoundsResponse powerRankingRoundsResponse2 = (PowerRankingRoundsResponse) obj2;
        if (powerRankingRoundsResponse2 == null) {
        }
        bzaVar = (bza) ((vnb) this.f.a.getValue()).a();
        if (bzaVar != null) {
        }
        if (powerRankingRounds == null) {
        }
        if (powerRankingRound == null) {
        }
        dzaVar.r = powerRankingRounds;
        dzaVar.s = powerRankingRound;
        dzaVar.x = 2;
        a = this.m.a("PREF_POWER_RANKINGS_INFO_DISMISSED", false, dzaVar);
        if (a != lu3Var) {
        }
        return lu3Var;
    }
}
