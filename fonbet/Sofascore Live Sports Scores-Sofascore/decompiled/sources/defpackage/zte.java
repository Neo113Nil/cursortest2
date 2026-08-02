package defpackage;

import com.sofascore.model.database.DbPlayerOfTheMatchVote;
import com.sofascore.model.newNetwork.UserPlayerOfTheMatchVote;
import com.sofascore.model.newNetwork.UserPlayerOfTheMatchVotesResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zte {
    public final wte a;
    public final NetworkCoroutineAPI b;
    public final NetworkCoroutineAPI c;

    public zte(wte wteVar, NetworkCoroutineAPI networkCoroutineAPI, NetworkCoroutineAPI networkCoroutineAPI2) {
        networkCoroutineAPI.getClass();
        networkCoroutineAPI2.getClass();
        this.a = wteVar;
        this.b = networkCoroutineAPI;
        this.c = networkCoroutineAPI2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r5 != r7) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, long j, sq3 sq3Var) {
        xte xteVar;
        int i3;
        long j2;
        int i4;
        int i5;
        if (sq3Var instanceof xte) {
            xteVar = (xte) sq3Var;
            int i6 = xteVar.w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                xteVar.w = i6 - Integer.MIN_VALUE;
                Object obj = xteVar.u;
                lu3 lu3Var = lu3.a;
                i3 = xteVar.w;
                if (i3 != 0) {
                    y6a.M(obj);
                    DbPlayerOfTheMatchVote dbPlayerOfTheMatchVote = new DbPlayerOfTheMatchVote(i, i2, j);
                    xteVar.r = i;
                    xteVar.s = i2;
                    xteVar.t = j;
                    xteVar.w = 1;
                    wte wteVar = this.a;
                    Object U = gz8.U(xteVar, wteVar.a, false, true, new ord(21, wteVar, dbPlayerOfTheMatchVote));
                    if (U != lu3Var) {
                        U = Unit.a;
                    }
                    if (U != lu3Var) {
                        j2 = j;
                        i4 = i2;
                        i5 = i;
                    }
                    return lu3Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    x2g x2gVar = (x2g) obj;
                    if (x2gVar instanceof v2g) {
                        return new v2g(Unit.a);
                    }
                    if (x2gVar instanceof t2g) {
                        return new q2g(((t2g) x2gVar).a);
                    }
                    zzl.b();
                    return null;
                }
                long j3 = xteVar.t;
                int i7 = xteVar.s;
                int i8 = xteVar.r;
                y6a.M(obj);
                j2 = j3;
                i5 = i8;
                i4 = i7;
                ni5 ni5Var = new ni5(this, i5, i4, null, 2);
                xteVar.r = i5;
                xteVar.s = i4;
                xteVar.t = j2;
                xteVar.w = 2;
                obj = yaa.P(ni5Var, xteVar);
            }
        }
        xteVar = new xte(this, sq3Var);
        Object obj2 = xteVar.u;
        lu3 lu3Var2 = lu3.a;
        i3 = xteVar.w;
        if (i3 != 0) {
        }
        ni5 ni5Var2 = new ni5(this, i5, i4, null, 2);
        xteVar.r = i5;
        xteVar.s = i4;
        xteVar.t = j2;
        xteVar.w = 2;
        obj2 = yaa.P(ni5Var2, xteVar);
    }

    public final Object b(sq3 sq3Var) {
        Object U = gz8.U(sq3Var, this.a.a, false, true, new jie(14));
        lu3 lu3Var = lu3.a;
        if (U != lu3Var) {
            U = Unit.a;
        }
        return U == lu3Var ? U : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0046, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, sq3 sq3Var) {
        yte yteVar;
        int i;
        ArrayList arrayList;
        Map<Integer, UserPlayerOfTheMatchVote> votes;
        if (sq3Var instanceof yte) {
            yteVar = (yte) sq3Var;
            int i2 = yteVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yteVar.t = i2 - Integer.MIN_VALUE;
                Object obj = yteVar.r;
                lu3 lu3Var = lu3.a;
                i = yteVar.t;
                arrayList = null;
                Object[] objArr = 0;
                if (i != 0) {
                    y6a.M(obj);
                    cl clVar = new cl(this, str, objArr == true ? 1 : 0, 23);
                    yteVar.t = 1;
                    obj = yaa.P(clVar, yteVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                UserPlayerOfTheMatchVotesResponse userPlayerOfTheMatchVotesResponse = (UserPlayerOfTheMatchVotesResponse) yaa.x((x2g) obj);
                votes = userPlayerOfTheMatchVotesResponse == null ? userPlayerOfTheMatchVotesResponse.getVotes() : null;
                if (votes != null) {
                    arrayList = new ArrayList(votes.size());
                    for (Map.Entry<Integer, UserPlayerOfTheMatchVote> entry : votes.entrySet()) {
                        arrayList.add(new DbPlayerOfTheMatchVote(entry.getKey().intValue(), entry.getValue().getPlayerId(), entry.getValue().getStartDateTimestamp()));
                    }
                }
                if (arrayList != null || !(!arrayList.isEmpty())) {
                    return Unit.a;
                }
                yteVar.t = 2;
                wte wteVar = this.a;
                Object U = gz8.U(yteVar, wteVar.a, false, true, new ord(20, wteVar, arrayList));
                if (U != lu3.a) {
                    U = Unit.a;
                }
            }
        }
        yteVar = new yte(this, sq3Var);
        Object obj2 = yteVar.r;
        lu3 lu3Var2 = lu3.a;
        i = yteVar.t;
        arrayList = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        UserPlayerOfTheMatchVotesResponse userPlayerOfTheMatchVotesResponse2 = (UserPlayerOfTheMatchVotesResponse) yaa.x((x2g) obj2);
        if (userPlayerOfTheMatchVotesResponse2 == null) {
        }
        if (votes != null) {
        }
        if (arrayList != null) {
        }
        return Unit.a;
    }
}
