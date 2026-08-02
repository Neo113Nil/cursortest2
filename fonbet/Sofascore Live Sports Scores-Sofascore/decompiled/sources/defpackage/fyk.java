package defpackage;

import com.sofascore.model.database.DbVote;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.EventVoteBody;
import com.sofascore.model.newNetwork.FirstTeamToScoreOptions;
import com.sofascore.model.newNetwork.PredictedEvent;
import com.sofascore.model.newNetwork.UserPrediction;
import com.sofascore.model.newNetwork.UserPredictionsResponse;
import com.sofascore.model.newNetwork.UserPredictionsResponseKt;
import com.sofascore.model.newNetwork.UserPredictionsVotesResponse;
import com.sofascore.model.newNetwork.Vote;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.model.newNetwork.WillBothTeamsScoreOptions;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fyk {
    public final zxk a;
    public final NetworkCoroutineAPI b;
    public final NetworkCoroutineAPI c;

    public fyk(zxk zxkVar, NetworkCoroutineAPI networkCoroutineAPI, NetworkCoroutineAPI networkCoroutineAPI2) {
        networkCoroutineAPI.getClass();
        networkCoroutineAPI2.getClass();
        this.a = zxkVar;
        this.b = networkCoroutineAPI;
        this.c = networkCoroutineAPI2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f8, code lost:
    
        if (g(r4, true, r2) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
    
        if (r4 == r3) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.sofascore.model.database.VoteType, java.lang.Boolean, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, long j, VoteType voteType, Boolean bool, sq3 sq3Var) {
        ayk aykVar;
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        String str2;
        VoteType voteType2;
        Boolean bool2;
        int i3;
        long j2;
        int i4;
        ?? r5;
        long j3;
        x2g x2gVar;
        Throwable th;
        Throwable th2;
        if (sq3Var instanceof ayk) {
            aykVar = (ayk) sq3Var;
            int i5 = aykVar.z;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aykVar.z = i5 - Integer.MIN_VALUE;
                obj = aykVar.x;
                obj2 = lu3.a;
                i2 = aykVar.z;
                if (i2 != 0) {
                    obj3 = null;
                    y6a.M(obj);
                    DbVote dbVote = new DbVote(i, str, j, false, voteType);
                    str2 = str;
                    aykVar.s = str2;
                    voteType2 = voteType;
                    aykVar.t = voteType2;
                    bool2 = bool;
                    aykVar.u = bool2;
                    i3 = i;
                    aykVar.r = i3;
                    j2 = j;
                    aykVar.w = j2;
                    aykVar.z = 1;
                    zxk zxkVar = this.a;
                    Object U = gz8.U(aykVar, zxkVar.a, false, true, new mwj(25, zxkVar, dbVote));
                    if (U != obj2) {
                        U = Unit.a;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                y6a.M(obj);
                                return new v2g(Unit.a);
                            }
                            if (i2 != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th2 = aykVar.v;
                            y6a.M(obj);
                            th = th2;
                            return new q2g(th);
                        }
                        j3 = aykVar.w;
                        i4 = aykVar.r;
                        y6a.M(obj);
                        obj3 = null;
                        r5 = 0;
                        x2gVar = (x2g) obj;
                        if (x2gVar instanceof v2g) {
                            if (!(x2gVar instanceof t2g)) {
                                zzl.b();
                                return obj3;
                            }
                            th = ((t2g) x2gVar).a;
                            if (th instanceof wi9) {
                                wi9 wi9Var = (wi9) th;
                                boolean z = wi9Var.a == 403;
                                aykVar.s = r5;
                                aykVar.t = r5;
                                aykVar.u = r5;
                                aykVar.v = wi9Var;
                                aykVar.r = i4;
                                aykVar.w = j3;
                                aykVar.z = 4;
                                if (g(i4, z, aykVar) != obj2) {
                                    th2 = th;
                                    th = th2;
                                }
                            }
                            return new q2g(th);
                        }
                        aykVar.s = r5;
                        aykVar.t = r5;
                        aykVar.u = r5;
                        aykVar.r = i4;
                        aykVar.w = j3;
                        aykVar.z = 3;
                        return obj2;
                    }
                    long j4 = aykVar.w;
                    int i6 = aykVar.r;
                    Boolean bool3 = aykVar.u;
                    VoteType voteType3 = aykVar.t;
                    obj3 = null;
                    String str3 = aykVar.s;
                    y6a.M(obj);
                    str2 = str3;
                    voteType2 = voteType3;
                    i3 = i6;
                    bool2 = bool3;
                    j2 = j4;
                }
                int i7 = i3;
                c64 c64Var = new c64(this, i7, new EventVoteBody(str2, voteType2.getSerializedValue(), bool2), (rq3) null, 21);
                i4 = i7;
                r5 = 0;
                aykVar.s = null;
                aykVar.t = null;
                aykVar.u = null;
                aykVar.r = i4;
                aykVar.w = j2;
                aykVar.z = 2;
                obj = yaa.P(c64Var, aykVar);
                if (obj != obj2) {
                    j3 = j2;
                    x2gVar = (x2g) obj;
                    if (x2gVar instanceof v2g) {
                    }
                }
                return obj2;
            }
        }
        aykVar = new ayk(this, sq3Var);
        obj = aykVar.x;
        obj2 = lu3.a;
        i2 = aykVar.z;
        if (i2 != 0) {
        }
        int i72 = i3;
        c64 c64Var2 = new c64(this, i72, new EventVoteBody(str2, voteType2.getSerializedValue(), bool2), (rq3) null, 21);
        i4 = i72;
        r5 = 0;
        aykVar.s = null;
        aykVar.t = null;
        aykVar.u = null;
        aykVar.r = i4;
        aykVar.w = j2;
        aykVar.z = 2;
        obj = yaa.P(c64Var2, aykVar);
        if (obj != obj2) {
        }
        return obj2;
    }

    public final Object b(sq3 sq3Var) {
        Object U = gz8.U(sq3Var, this.a.a, false, true, new nxk(1));
        lu3 lu3Var = lu3.a;
        if (U != lu3Var) {
            U = Unit.a;
        }
        return U == lu3Var ? U : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[LOOP:0: B:14:0x005f->B:16:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(sq3 sq3Var) {
        byk bykVar;
        int i;
        int c;
        if (sq3Var instanceof byk) {
            bykVar = (byk) sq3Var;
            int i2 = bykVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bykVar.t = i2 - Integer.MIN_VALUE;
                Object obj = bykVar.r;
                lu3 lu3Var = lu3.a;
                i = bykVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    bykVar.t = 1;
                    obj = gz8.U(bykVar, this.a.a, true, false, new nxk(2));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable<DbVote> iterable = (Iterable) obj;
                c = sub.c(k13.r(iterable, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (DbVote dbVote : iterable) {
                    linkedHashMap.put(fc6.g(dbVote.getId(), dbVote.getVoteType().getSerializedValue(), "_"), dbVote.getUserChoice());
                }
                return new LinkedHashMap(linkedHashMap);
            }
        }
        bykVar = new byk(this, sq3Var);
        Object obj2 = bykVar.r;
        lu3 lu3Var2 = lu3.a;
        i = bykVar.t;
        if (i != 0) {
        }
        Iterable<DbVote> iterable2 = (Iterable) obj2;
        c = sub.c(k13.r(iterable2, 10));
        if (c < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c);
        while (r4.hasNext()) {
        }
        return new LinkedHashMap(linkedHashMap2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r15v0, types: [km5] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r15v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r24v0, types: [fyk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, int i, boolean z, sq3 sq3Var) {
        cyk cykVar;
        int i2;
        boolean z2;
        int i3;
        UserPredictionsResponse userPredictionsResponse;
        List<PredictedEvent> list;
        List<PredictedEvent> list2;
        boolean z3;
        Object U;
        Object obj;
        ?? r15;
        if (sq3Var instanceof cyk) {
            cykVar = (cyk) sq3Var;
            int i4 = cykVar.x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cykVar.x = i4 - Integer.MIN_VALUE;
                cyk cykVar2 = cykVar;
                Object obj2 = cykVar2.v;
                Object obj3 = lu3.a;
                i2 = cykVar2.x;
                if (i2 != 0) {
                    y6a.M(obj2);
                    cykVar2.t = i;
                    z2 = z;
                    cykVar2.u = z2;
                    cykVar2.x = 1;
                    obj2 = yaa.P(new bs2((fyk) this, str, str2, i, (rq3) null), cykVar2);
                    if (obj2 != obj3) {
                        i3 = i;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list3 = cykVar2.s;
                        y6a.M(obj2);
                        return list3;
                    }
                    z3 = cykVar2.u;
                    i3 = cykVar2.t;
                    list = cykVar2.s;
                    list2 = cykVar2.r;
                    y6a.M(obj2);
                    List<PredictedEvent> mapMyPredictions = UserPredictionsResponseKt.mapMyPredictions(list, (Map) obj2, xe6.c().b().longValue());
                    long longValue = xe6.c().b().longValue();
                    ArrayList arrayList = new ArrayList();
                    for (PredictedEvent predictedEvent : list2) {
                        if (predictedEvent.getStartDateTimestamp() >= longValue || Intrinsics.c(predictedEvent.getStatus().getType(), StatusKt.STATUS_NOT_STARTED)) {
                            r15 = km5.a;
                        } else {
                            List<Vote> votes = predictedEvent.getVotes();
                            if (votes != null) {
                                r15 = new ArrayList();
                                for (Vote vote : votes) {
                                    VoteType voteType = vote.getVoteType();
                                    DbVote dbVote = voteType != null ? new DbVote(predictedEvent.getId(), vote.getVote(), predictedEvent.getStartDateTimestamp(), true, voteType) : null;
                                    if (dbVote != null) {
                                        r15.add(dbVote);
                                    }
                                }
                            } else {
                                r15 = km5.a;
                            }
                        }
                        o13.v(r15, arrayList);
                    }
                    cykVar2.r = null;
                    cykVar2.s = mapMyPredictions;
                    cykVar2.t = i3;
                    cykVar2.u = z3;
                    cykVar2.x = 3;
                    zxk zxkVar = this.a;
                    U = gz8.U(cykVar2, zxkVar.a, false, true, new mwj(24, zxkVar, arrayList));
                    obj = lu3.a;
                    if (U != obj) {
                        U = Unit.a;
                    }
                    if (U != obj) {
                        U = Unit.a;
                    }
                    return U != obj3 ? obj3 : mapMyPredictions;
                }
                boolean z4 = cykVar2.u;
                i3 = cykVar2.t;
                y6a.M(obj2);
                z2 = z4;
                userPredictionsResponse = (UserPredictionsResponse) yaa.x((x2g) obj2);
                if (userPredictionsResponse != null || (r0 = userPredictionsResponse.getPredictions()) == null) {
                    List<PredictedEvent> list4 = km5.a;
                }
                list = list4;
                if (z2) {
                    return list;
                }
                cykVar2.r = list;
                cykVar2.s = list;
                cykVar2.t = i3;
                cykVar2.u = z2;
                cykVar2.x = 2;
                obj2 = c(cykVar2);
                if (obj2 != obj3) {
                    list2 = list;
                    z3 = z2;
                    List<PredictedEvent> mapMyPredictions2 = UserPredictionsResponseKt.mapMyPredictions(list, (Map) obj2, xe6.c().b().longValue());
                    long longValue2 = xe6.c().b().longValue();
                    ArrayList arrayList2 = new ArrayList();
                    while (r5.hasNext()) {
                    }
                    cykVar2.r = null;
                    cykVar2.s = mapMyPredictions2;
                    cykVar2.t = i3;
                    cykVar2.u = z3;
                    cykVar2.x = 3;
                    zxk zxkVar2 = this.a;
                    U = gz8.U(cykVar2, zxkVar2.a, false, true, new mwj(24, zxkVar2, arrayList2));
                    obj = lu3.a;
                    if (U != obj) {
                    }
                    if (U != obj) {
                    }
                    if (U != obj3) {
                    }
                }
            }
        }
        cykVar = new cyk(this, sq3Var);
        cyk cykVar22 = cykVar;
        Object obj22 = cykVar22.v;
        Object obj32 = lu3.a;
        i2 = cykVar22.x;
        if (i2 != 0) {
        }
        userPredictionsResponse = (UserPredictionsResponse) yaa.x((x2g) obj22);
        if (userPredictionsResponse != null) {
        }
        List<PredictedEvent> list42 = km5.a;
        list = list42;
        if (z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[LOOP:0: B:14:0x0060->B:16:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(int i, sq3 sq3Var) {
        dyk dykVar;
        int i2;
        int c;
        if (sq3Var instanceof dyk) {
            dykVar = (dyk) sq3Var;
            int i3 = dykVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dykVar.t = i3 - Integer.MIN_VALUE;
                Object obj = dykVar.r;
                lu3 lu3Var = lu3.a;
                i2 = dykVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    dykVar.t = 1;
                    obj = gz8.U(dykVar, this.a.a, true, false, new kwi(i, 12));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable<DbVote> iterable = (Iterable) obj;
                c = sub.c(k13.r(iterable, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (DbVote dbVote : iterable) {
                    linkedHashMap.put(dbVote.getVoteType(), dbVote.getUserChoice());
                }
                return linkedHashMap;
            }
        }
        dykVar = new dyk(this, sq3Var);
        Object obj2 = dykVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = dykVar.t;
        if (i2 != 0) {
        }
        Iterable<DbVote> iterable2 = (Iterable) obj2;
        c = sub.c(k13.r(iterable2, 10));
        if (c < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c);
        while (r4.hasNext()) {
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        if (r0 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        if (r1 == r3) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, sq3 sq3Var) {
        eyk eykVar;
        int i;
        ArrayList arrayList;
        List<UserPrediction> predictions;
        if (sq3Var instanceof eyk) {
            eykVar = (eyk) sq3Var;
            int i2 = eykVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eykVar.t = i2 - Integer.MIN_VALUE;
                Object obj = eykVar.r;
                lu3 lu3Var = lu3.a;
                i = eykVar.t;
                arrayList = null;
                Object[] objArr = 0;
                if (i != 0) {
                    y6a.M(obj);
                    fzh fzhVar = new fzh(this, str, objArr == true ? 1 : 0, 13);
                    eykVar.t = 1;
                    obj = yaa.P(fzhVar, eykVar);
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
                UserPredictionsVotesResponse userPredictionsVotesResponse = (UserPredictionsVotesResponse) yaa.x((x2g) obj);
                predictions = userPredictionsVotesResponse == null ? userPredictionsVotesResponse.getPredictions() : null;
                if (predictions != null) {
                    ArrayList arrayList2 = new ArrayList(k13.r(predictions, 10));
                    for (UserPrediction userPrediction : predictions) {
                        WhoWillWinOptions fullTime = userPrediction.getVotes().getFullTime();
                        DbVote dbVote = fullTime != null ? new DbVote(userPrediction.getEventId(), fullTime.getChoice(), userPrediction.getEventStartTimestamp(), true, VoteType.WHO_WILL_WIN) : null;
                        WillBothTeamsScoreOptions bothTeamsToScore = userPrediction.getVotes().getBothTeamsToScore();
                        DbVote dbVote2 = bothTeamsToScore != null ? new DbVote(userPrediction.getEventId(), bothTeamsToScore.getChoice(), userPrediction.getEventStartTimestamp(), true, VoteType.WILL_BOTH_TEAMS_SCORE) : null;
                        FirstTeamToScoreOptions firstTeamToScore = userPrediction.getVotes().getFirstTeamToScore();
                        arrayList2.add(ph0.x(new DbVote[]{dbVote, dbVote2, firstTeamToScore != null ? new DbVote(userPrediction.getEventId(), firstTeamToScore.getChoice(), userPrediction.getEventStartTimestamp(), true, VoteType.FIRST_TEAM_TO_SCORE) : null}));
                    }
                    arrayList = k13.s(arrayList2);
                }
                if (arrayList != null || !(!arrayList.isEmpty())) {
                    return Unit.a;
                }
                eykVar.t = 2;
                zxk zxkVar = this.a;
                Object U = gz8.U(eykVar, zxkVar.a, false, true, new mwj(24, zxkVar, arrayList));
                if (U != lu3.a) {
                    U = Unit.a;
                }
            }
        }
        eykVar = new eyk(this, sq3Var);
        Object obj2 = eykVar.r;
        lu3 lu3Var2 = lu3.a;
        i = eykVar.t;
        arrayList = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        UserPredictionsVotesResponse userPredictionsVotesResponse2 = (UserPredictionsVotesResponse) yaa.x((x2g) obj2);
        if (userPredictionsVotesResponse2 == null) {
        }
        if (predictions != null) {
        }
        if (arrayList != null) {
        }
        return Unit.a;
    }

    public final Object g(int i, boolean z, sq3 sq3Var) {
        Object U = gz8.U(sq3Var, this.a.a, false, true, new yt5(z, i, 1));
        lu3 lu3Var = lu3.a;
        if (U != lu3Var) {
            U = Unit.a;
        }
        return U == lu3Var ? U : Unit.a;
    }
}
