package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.DraftPickLotteryProbability;
import com.sofascore.model.newNetwork.DraftProspect;
import com.sofascore.model.newNetwork.LeagueDraftPickItem;
import com.sofascore.model.newNetwork.UniqueTournamentDraftInfoResponse;
import com.sofascore.model.newNetwork.UniqueTournamentDraftPicksResponse;
import com.sofascore.model.newNetwork.UniqueTournamentDraftYear;
import com.sofascore.model.newNetwork.UniqueTournamentLotteryProbabilityResponse;
import com.sofascore.model.newNetwork.UniqueTournamentProspectsResponse;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cwa extends hoi implements Function2 {
    public gv9 A;
    public gv9 B;
    public gv9 C;
    public tee D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ fwa H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ String L;
    public fwa r;
    public Object s;
    public UniqueTournamentDraftInfoResponse t;
    public Object u;
    public UniqueTournamentDraftYear v;
    public zu4 w;
    public Object x;
    public UniqueTournamentDraftPicksResponse y;
    public UniqueTournamentDraftPicksResponse z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwa(fwa fwaVar, int i, int i2, boolean z, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.H = fwaVar;
        this.I = i;
        this.J = i2;
        this.K = z;
        this.L = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        cwa cwaVar = new cwa(this.H, this.I, this.J, this.K, this.L, rq3Var);
        cwaVar.G = obj;
        return cwaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cwa) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0515, code lost:
    
        if (r2 == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x051e, code lost:
    
        if (r25.isEmpty() == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0527, code lost:
    
        if (r20.isEmpty() == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0532, code lost:
    
        if (r2 != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x05e1, code lost:
    
        if (r5 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0623, code lost:
    
        if (r5.contains(r2) != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x063a, code lost:
    
        if (r5.contains(r2) != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x064f, code lost:
    
        if (r5.contains(r2) != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0664, code lost:
    
        if (r5.contains(r2) != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0241, code lost:
    
        if (r13 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0200, code lost:
    
        if (r7 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x00f4, code lost:
    
        if (r3 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0501, code lost:
    
        if (r24.isEmpty() == false) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06e9 A[LOOP:6: B:196:0x06e9->B:202:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0446 A[LOOP:1: B:62:0x043d->B:64:0x0446, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x048e  */
    /* JADX WARN: Type inference failed for: r11v14, types: [com.sofascore.model.newNetwork.UniqueTournamentLotteryProbabilityResponse] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [com.sofascore.model.newNetwork.UniqueTournamentLotteryProbabilityResponse] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.sofascore.model.newNetwork.UniqueTournamentDraftPicksResponse] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v33, types: [zu4] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.sofascore.model.newNetwork.UniqueTournamentDraftPicksResponse] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v36, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v40, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v32, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object c;
        Object value;
        int i;
        av4 av4Var;
        int i2;
        av4 t;
        fwa fwaVar;
        zu4 zu4Var;
        UniqueTournamentDraftInfoResponse uniqueTournamentDraftInfoResponse;
        UniqueTournamentDraftYear uniqueTournamentDraftYear;
        int i3;
        ?? r4;
        Object w;
        UniqueTournamentDraftYear uniqueTournamentDraftYear2;
        av4 av4Var2;
        zu4 zu4Var2;
        String str;
        UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse;
        ?? r42;
        Object T;
        String str2;
        av4 av4Var3;
        UniqueTournamentDraftYear uniqueTournamentDraftYear3;
        UniqueTournamentDraftInfoResponse uniqueTournamentDraftInfoResponse2;
        UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse2;
        UniqueTournamentDraftInfoResponse uniqueTournamentDraftInfoResponse3;
        UniqueTournamentDraftYear uniqueTournamentDraftYear4;
        UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse3;
        av4 av4Var4;
        Object obj3;
        Object T2;
        UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse4;
        gv9 gv9Var;
        lu3 lu3Var;
        tee teeVar;
        gv9 gv9Var2;
        gv9 gv9Var3;
        Integer num;
        Object T3;
        gv9 gv9Var4;
        gv9 gv9Var5;
        List<LeagueDraftPickItem> picks;
        List<LeagueDraftPickItem> picks2;
        List<DraftPickLotteryProbability> draftPickLotteryProbabilities;
        lu3 lu3Var2;
        ?? r14;
        UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse5;
        gv9 gv9Var6;
        gv9 gv9Var7;
        gv9 gv9Var8;
        Iterator it;
        Object value2;
        vnb vnbVar;
        gv9 gv9Var9;
        yva yvaVar;
        Object value3;
        vnb vnbVar2;
        List<Integer> rounds;
        vt2 vt2Var;
        UniqueTournamentProspectsResponse uniqueTournamentProspectsResponse;
        List<DraftProspect> prospects;
        String i4;
        String str3;
        ku3 ku3Var = (ku3) this.G;
        lu3 lu3Var3 = lu3.a;
        int i5 = this.F;
        String str4 = this.L;
        int i6 = this.I;
        fwa fwaVar2 = this.H;
        int i7 = 0;
        av4 av4Var5 = null;
        if (i5 == 0) {
            obj2 = null;
            y6a.M(obj);
            fwaVar2.n = i6;
            int i8 = this.J;
            fwaVar2.o = i8;
            fwaVar2.p = this.K;
            fwaVar2.s = str4;
            w3b w3bVar = fwaVar2.l;
            this.G = ku3Var;
            this.F = 1;
            c = w3bVar.c(i6, i8, this);
        } else if (i5 == 1) {
            obj2 = null;
            y6a.M(obj);
            c = obj;
        } else if (i5 == 2) {
            obj2 = null;
            i3 = this.E;
            ?? r43 = (zu4) this.x;
            ?? r5 = this.w;
            UniqueTournamentDraftYear uniqueTournamentDraftYear5 = this.v;
            zu4 zu4Var3 = (zu4) this.u;
            UniqueTournamentDraftInfoResponse uniqueTournamentDraftInfoResponse4 = this.t;
            String str5 = (String) this.s;
            fwaVar = this.r;
            y6a.M(obj);
            uniqueTournamentDraftInfoResponse = uniqueTournamentDraftInfoResponse4;
            av4Var = null;
            av4Var5 = r5;
            str4 = str5;
            zu4Var2 = zu4Var3;
            uniqueTournamentDraftYear2 = uniqueTournamentDraftYear5;
            w = obj;
            av4Var2 = r43;
            zu4 zu4Var4 = zu4Var2;
            t = av4Var2;
            r4 = (UniqueTournamentDraftPicksResponse) w;
            uniqueTournamentDraftYear = uniqueTournamentDraftYear2;
            zu4Var = zu4Var4;
            if (t != null) {
                this.G = ku3Var;
                this.r = fwaVar;
                this.s = str4;
                this.t = uniqueTournamentDraftInfoResponse;
                this.u = zu4Var;
                this.v = uniqueTournamentDraftYear;
                this.w = av4Var5;
                this.x = av4Var;
                this.y = r4;
                this.E = i3;
                this.F = 3;
                T = t.T(this);
                if (T != lu3Var3) {
                    str2 = str4;
                    av4Var3 = av4Var5;
                    uniqueTournamentDraftPicksResponse4 = r4;
                    UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse6 = (UniqueTournamentDraftPicksResponse) T;
                    av4 av4Var6 = av4Var3;
                    uniqueTournamentDraftPicksResponse = uniqueTournamentDraftPicksResponse4;
                    r42 = uniqueTournamentDraftPicksResponse6;
                    av4Var5 = av4Var6;
                    str = str2;
                    uniqueTournamentDraftYear3 = uniqueTournamentDraftYear;
                    uniqueTournamentDraftInfoResponse2 = uniqueTournamentDraftInfoResponse;
                    if (zu4Var == null) {
                    }
                }
                return lu3Var3;
            }
            str = str4;
            uniqueTournamentDraftPicksResponse = r4;
            r42 = av4Var;
            uniqueTournamentDraftYear3 = uniqueTournamentDraftYear;
            uniqueTournamentDraftInfoResponse2 = uniqueTournamentDraftInfoResponse;
            if (zu4Var == null) {
            }
        } else {
            if (i5 != 3) {
                if (i5 == 4) {
                    obj2 = null;
                    i3 = this.E;
                    UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse7 = this.z;
                    uniqueTournamentDraftPicksResponse = this.y;
                    ?? r7 = this.w;
                    uniqueTournamentDraftYear3 = this.v;
                    uniqueTournamentDraftInfoResponse2 = this.t;
                    str = (String) this.s;
                    fwaVar = this.r;
                    y6a.M(obj);
                    av4Var = null;
                    av4Var5 = r7;
                    T2 = obj;
                    uniqueTournamentDraftPicksResponse5 = uniqueTournamentDraftPicksResponse7;
                    Object obj4 = (UniqueTournamentLotteryProbabilityResponse) T2;
                    uniqueTournamentDraftPicksResponse2 = uniqueTournamentDraftPicksResponse5;
                    uniqueTournamentDraftInfoResponse3 = uniqueTournamentDraftInfoResponse2;
                    uniqueTournamentDraftYear4 = uniqueTournamentDraftYear3;
                    uniqueTournamentDraftPicksResponse3 = uniqueTournamentDraftPicksResponse;
                    av4Var4 = av4Var5;
                    obj3 = obj4;
                    if (obj3 != null) {
                        if (uniqueTournamentDraftInfoResponse3.getHasLotteryDraw()) {
                            ?? picks3 = uniqueTournamentDraftPicksResponse3 != null ? uniqueTournamentDraftPicksResponse3.getPicks() : av4Var;
                            if (picks3 == 0 || picks3.isEmpty()) {
                                r14 = obj3;
                                if (r14 != 0) {
                                    List<DraftPickLotteryProbability> draftPickLotteryProbabilities2 = r14.getDraftPickLotteryProbabilities();
                                    if (draftPickLotteryProbabilities2 != null) {
                                        gv9Var = vha.B(fwaVar.i(), draftPickLotteryProbabilities2);
                                    }
                                }
                            }
                        }
                        r14 = av4Var;
                        if (r14 != 0) {
                        }
                    }
                    gv9Var = rlh.b;
                    if (obj3 != null) {
                        ?? r11 = obj3;
                        if (uniqueTournamentDraftInfoResponse3.getHasLotteryDraw()) {
                            r11 = av4Var;
                        }
                        if (r11 != 0 && (draftPickLotteryProbabilities = r11.getDraftPickLotteryProbabilities()) != null) {
                            Context i9 = fwaVar.i();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it2 = draftPickLotteryProbabilities.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                Integer round = ((DraftPickLotteryProbability) next).getRound();
                                Iterator it3 = it2;
                                Integer valueOf = Integer.valueOf(round != null ? round.intValue() : 0);
                                Object obj5 = linkedHashMap.get(valueOf);
                                if (obj5 == null) {
                                    lu3Var2 = lu3Var3;
                                    ArrayList arrayList = new ArrayList();
                                    linkedHashMap.put(valueOf, arrayList);
                                    obj5 = arrayList;
                                } else {
                                    lu3Var2 = lu3Var3;
                                }
                                ((List) obj5).add(next);
                                it2 = it3;
                                lu3Var3 = lu3Var2;
                            }
                            lu3Var = lu3Var3;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                linkedHashMap2.put(entry.getKey(), vha.B(i9, (List) entry.getValue()));
                            }
                            teeVar = l6g.X(linkedHashMap2);
                            if (uniqueTournamentDraftPicksResponse3 != null || (picks2 = uniqueTournamentDraftPicksResponse3.getPicks()) == null || (gv9Var2 = vha.C(fwaVar.i(), str, picks2)) == null) {
                                gv9Var2 = rlh.b;
                            }
                            if (uniqueTournamentDraftPicksResponse2 != null || (picks = uniqueTournamentDraftPicksResponse2.getPicks()) == null || (gv9Var3 = vha.C(fwaVar.i(), str, picks)) == null) {
                                gv9Var3 = rlh.b;
                            }
                            if (av4Var4 != null) {
                                this.G = ku3Var;
                                this.r = fwaVar;
                                this.s = uniqueTournamentDraftInfoResponse3;
                                num = null;
                                this.t = null;
                                this.u = uniqueTournamentDraftYear4;
                                this.v = null;
                                this.w = null;
                                this.x = uniqueTournamentDraftPicksResponse3;
                                this.y = uniqueTournamentDraftPicksResponse2;
                                this.z = null;
                                this.A = gv9Var;
                                this.B = gv9Var2;
                                this.C = gv9Var3;
                                this.D = teeVar;
                                this.E = i3;
                                this.F = 5;
                                T3 = av4Var4.T(this);
                                lu3 lu3Var4 = lu3Var;
                                if (T3 == lu3Var4) {
                                    return lu3Var4;
                                }
                                gv9Var4 = gv9Var2;
                                gv9Var5 = gv9Var;
                                uniqueTournamentProspectsResponse = (UniqueTournamentProspectsResponse) T3;
                                if (uniqueTournamentProspectsResponse != null) {
                                    ArrayList arrayList2 = new ArrayList(k13.r(prospects, 10));
                                    while (r0.hasNext()) {
                                    }
                                    gv9Var6 = l6g.W(arrayList2);
                                    if (gv9Var6 != null) {
                                    }
                                }
                                gv9Var2 = gv9Var4;
                                gv9Var = gv9Var5;
                            }
                            gv9Var6 = rlh.b;
                            gv9Var7 = gv9Var2;
                            gv9Var8 = gv9Var;
                            tee teeVar2 = teeVar;
                            UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse8 = uniqueTournamentDraftPicksResponse2;
                            gv9 gv9Var10 = gv9Var3;
                            UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse9 = uniqueTournamentDraftPicksResponse3;
                            fwaVar.m = gv9Var6;
                            fdi fdiVar = fwaVar.e;
                            Set keySet = teeVar2.keySet();
                            ArrayList arrayList3 = new ArrayList(k13.r(keySet, 10));
                            it = keySet.iterator();
                            while (it.hasNext()) {
                            }
                            gv9 gv9Var11 = gv9Var6;
                            ft2 ft2Var = new ft2(gv9Var8, teeVar2, l6g.W(arrayList3), gv9Var7, gv9Var10, gv9Var11, uniqueTournamentDraftPicksResponse9, uniqueTournamentDraftPicksResponse8, 2);
                            if (fwaVar.f.a.getValue() instanceof unb) {
                            }
                            return Unit.a;
                        }
                    }
                    lu3Var = lu3Var3;
                    teeVar = uee.g;
                    teeVar.getClass();
                    if (uniqueTournamentDraftPicksResponse3 != null) {
                    }
                    gv9Var2 = rlh.b;
                    if (uniqueTournamentDraftPicksResponse2 != null) {
                    }
                    gv9Var3 = rlh.b;
                    if (av4Var4 != null) {
                    }
                    gv9Var6 = rlh.b;
                    gv9Var7 = gv9Var2;
                    gv9Var8 = gv9Var;
                    tee teeVar22 = teeVar;
                    UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse82 = uniqueTournamentDraftPicksResponse2;
                    gv9 gv9Var102 = gv9Var3;
                    UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse92 = uniqueTournamentDraftPicksResponse3;
                    fwaVar.m = gv9Var6;
                    fdi fdiVar2 = fwaVar.e;
                    Set keySet2 = teeVar22.keySet();
                    ArrayList arrayList32 = new ArrayList(k13.r(keySet2, 10));
                    it = keySet2.iterator();
                    while (it.hasNext()) {
                    }
                    gv9 gv9Var112 = gv9Var6;
                    ft2 ft2Var2 = new ft2(gv9Var8, teeVar22, l6g.W(arrayList32), gv9Var7, gv9Var102, gv9Var112, uniqueTournamentDraftPicksResponse92, uniqueTournamentDraftPicksResponse82, 2);
                    if (fwaVar.f.a.getValue() instanceof unb) {
                    }
                    return Unit.a;
                }
                if (i5 != 5) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tee teeVar3 = this.D;
                gv9 gv9Var12 = this.C;
                gv9Var4 = this.B;
                gv9Var5 = this.A;
                uniqueTournamentDraftPicksResponse2 = this.y;
                uniqueTournamentDraftPicksResponse3 = (UniqueTournamentDraftPicksResponse) this.x;
                UniqueTournamentDraftYear uniqueTournamentDraftYear6 = (UniqueTournamentDraftYear) this.u;
                obj2 = null;
                uniqueTournamentDraftInfoResponse3 = (UniqueTournamentDraftInfoResponse) this.s;
                fwa fwaVar3 = this.r;
                y6a.M(obj);
                gv9Var3 = gv9Var12;
                uniqueTournamentDraftYear4 = uniqueTournamentDraftYear6;
                fwaVar = fwaVar3;
                teeVar = teeVar3;
                num = null;
                T3 = obj;
                uniqueTournamentProspectsResponse = (UniqueTournamentProspectsResponse) T3;
                if (uniqueTournamentProspectsResponse != null && (prospects = uniqueTournamentProspectsResponse.getProspects()) != null) {
                    ArrayList arrayList22 = new ArrayList(k13.r(prospects, 10));
                    for (DraftProspect draftProspect : prospects) {
                        Context i10 = fwaVar.i();
                        draftProspect.getClass();
                        Player player = draftProspect.getPlayer();
                        Integer valueOf2 = player != null ? Integer.valueOf(player.getId()) : num;
                        Player player2 = draftProspect.getPlayer();
                        if (player2 == null || (i4 = tba.t(player2)) == null) {
                            i4 = wv8.i(draftProspect.getFirstName(), " ", draftProspect.getLastName());
                        }
                        String str6 = i4;
                        Team team = draftProspect.getTeam();
                        int id = team != null ? team.getId() : -1;
                        Team team2 = draftProspect.getTeam();
                        if (team2 == null || (str3 = tba.p(i10, team2)) == null) {
                            String teamName = draftProspect.getTeamName();
                            if (teamName == null || teamName.length() <= 0) {
                                teamName = null;
                            }
                            Regex regex = yid.a;
                            str3 = teamName == null ? "-" : teamName;
                        }
                        String str7 = str3;
                        String position = draftProspect.getPosition();
                        Player player3 = draftProspect.getPlayer();
                        Gender gender = player3 != null ? player3.getGender() : null;
                        Team team3 = draftProspect.getTeam();
                        arrayList22.add(new u75(valueOf2, str6, id, str7, position, gender, team3 != null ? team3.getSportSlug() : null));
                        num = null;
                    }
                    gv9Var6 = l6g.W(arrayList22);
                    if (gv9Var6 != null) {
                        gv9Var7 = gv9Var4;
                        gv9Var8 = gv9Var5;
                        tee teeVar222 = teeVar;
                        UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse822 = uniqueTournamentDraftPicksResponse2;
                        gv9 gv9Var1022 = gv9Var3;
                        UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse922 = uniqueTournamentDraftPicksResponse3;
                        fwaVar.m = gv9Var6;
                        fdi fdiVar22 = fwaVar.e;
                        Set keySet22 = teeVar222.keySet();
                        ArrayList arrayList322 = new ArrayList(k13.r(keySet22, 10));
                        it = keySet22.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            Integer num2 = new Integer(intValue);
                            String string = fwaVar.i().getString(R.string.draft_round_number_short, new Integer(intValue));
                            string.getClass();
                            arrayList322.add(new s1h(num2, string, true));
                        }
                        gv9 gv9Var1122 = gv9Var6;
                        ft2 ft2Var22 = new ft2(gv9Var8, teeVar222, l6g.W(arrayList322), gv9Var7, gv9Var1022, gv9Var1122, uniqueTournamentDraftPicksResponse922, uniqueTournamentDraftPicksResponse822, 2);
                        if (fwaVar.f.a.getValue() instanceof unb) {
                            do {
                                value2 = fdiVar22.getValue();
                                vnbVar = (vnb) value2;
                                vnbVar.getClass();
                                if (vnbVar instanceof unb) {
                                    vnbVar = new unb((xva) ft2Var22.invoke((xva) ((unb) vnbVar).a));
                                }
                            } while (!fdiVar22.k(value2, vnbVar));
                        } else {
                            List j = b.j("upcoming", "scheduled");
                            UniqueTournamentDraftYear draft = uniqueTournamentDraftInfoResponse3.getDraft();
                            boolean R = CollectionsKt.R(j, draft != null ? draft.getStatus() : null);
                            wib wibVar = yva.c;
                            boolean hasLotteryDraw = uniqueTournamentDraftInfoResponse3.getHasLotteryDraw();
                            wibVar.getClass();
                            List<yva> j2 = hasLotteryDraw ? b.j(yva.LOTTERY, yva.PROSPECTS, yva.PICKS, yva.PREVIOUS_PICKS) : b.j(yva.DRAFT_ORDER, yva.PICKS, yva.PROSPECTS, yva.PREVIOUS_PICKS);
                            ArrayList arrayList4 = new ArrayList();
                            for (yva yvaVar2 : j2) {
                                int ordinal = yvaVar2.ordinal();
                                if (ordinal == 0) {
                                    if (!teeVar222.isEmpty()) {
                                    }
                                    vt2Var = null;
                                } else if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        if (ordinal == 3) {
                                            if (!gv9Var7.isEmpty()) {
                                                if (!uniqueTournamentDraftInfoResponse3.getHasLotteryDraw()) {
                                                }
                                                String str8 = yvaVar2 == yva.PREVIOUS_PICKS ? fwaVar.r : fwaVar.q;
                                                Function1 function1 = yvaVar2.a;
                                                if (str8 == null) {
                                                    str8 = "";
                                                }
                                                vt2Var = new vt2(yvaVar2, ((r9k) function1.invoke(str8)).b(fwaVar.i()), false, null, null, null, null, 252);
                                            }
                                            vt2Var = null;
                                        } else if (ordinal != 4) {
                                            zzl.b();
                                            return obj2;
                                        }
                                    }
                                }
                                if (vt2Var != null) {
                                    arrayList4.add(vt2Var);
                                }
                            }
                            gv9 W = l6g.W(arrayList4);
                            if (uniqueTournamentDraftYear4 != null && (rounds = uniqueTournamentDraftYear4.getRounds()) != null) {
                                ArrayList arrayList5 = new ArrayList(k13.r(rounds, 10));
                                Iterator it4 = rounds.iterator();
                                while (it4.hasNext()) {
                                    int intValue2 = ((Number) it4.next()).intValue();
                                    Integer num3 = new Integer(intValue2);
                                    String string2 = uniqueTournamentDraftYear4.getRounds().size() <= 2 ? fwaVar.i().getString(R.string.basketball_draft_round, new Integer(intValue2)) : fwaVar.i().getString(R.string.draft_round_number_short, new Integer(intValue2));
                                    string2.getClass();
                                    arrayList5.add(new s1h(num3, string2, true));
                                }
                                gv9Var9 = l6g.W(arrayList5);
                            }
                            gv9Var9 = rlh.b;
                            gv9 gv9Var13 = gv9Var9;
                            ArrayList arrayList6 = new ArrayList(k13.r(W, 10));
                            Iterator it5 = W.iterator();
                            while (it5.hasNext()) {
                                arrayList6.add((yva) ((vt2) it5.next()).a);
                            }
                            if (uniqueTournamentDraftInfoResponse3.getDraft() != null && uniqueTournamentDraftPicksResponse922 != null && (teeVar222.isEmpty() || !R)) {
                                yvaVar = yva.PICKS;
                            }
                            if (uniqueTournamentDraftInfoResponse3.getLotteryYear() != null && !gv9Var8.isEmpty()) {
                                yvaVar = yva.LOTTERY;
                            }
                            if (uniqueTournamentDraftInfoResponse3.getLotteryYear() != null && !teeVar222.isEmpty()) {
                                yvaVar = yva.DRAFT_ORDER;
                            }
                            if (uniqueTournamentDraftInfoResponse3.getProspectsYear() != null && !gv9Var1122.isEmpty()) {
                                yvaVar = yva.PROSPECTS;
                            }
                            yvaVar = yva.PREVIOUS_PICKS;
                            yva yvaVar3 = yvaVar;
                            boolean c2 = Intrinsics.c(uniqueTournamentDraftYear4 != null ? uniqueTournamentDraftYear4.getYear() : null, uniqueTournamentDraftInfoResponse3.getLotteryYear()) ? Intrinsics.c(uniqueTournamentDraftYear4 != null ? Boolean.valueOf(uniqueTournamentDraftYear4.isLotteryComplete()) : null, Boolean.TRUE) : false;
                            rlh rlhVar = rlh.b;
                            uee ueeVar = uee.g;
                            ueeVar.getClass();
                            xva xvaVar = new xva(rlhVar, ueeVar, 1, rlhVar, rlhVar, rlhVar, rlhVar, rlhVar, rlhVar, gv9Var13, "", W, yvaVar3, 1, false, c2);
                            do {
                                value3 = fdiVar22.getValue();
                                vnbVar2 = (vnb) value3;
                                vnbVar2.getClass();
                            } while (!fdiVar22.k(value3, vnbVar2 instanceof unb ? new unb((xva) ft2Var22.invoke((xva) ((unb) vnbVar2).a)) : new unb((xva) ft2Var22.invoke(xvaVar))));
                        }
                        return Unit.a;
                    }
                }
                gv9Var2 = gv9Var4;
                gv9Var = gv9Var5;
                gv9Var6 = rlh.b;
                gv9Var7 = gv9Var2;
                gv9Var8 = gv9Var;
                tee teeVar2222 = teeVar;
                UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse8222 = uniqueTournamentDraftPicksResponse2;
                gv9 gv9Var10222 = gv9Var3;
                UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse9222 = uniqueTournamentDraftPicksResponse3;
                fwaVar.m = gv9Var6;
                fdi fdiVar222 = fwaVar.e;
                Set keySet222 = teeVar2222.keySet();
                ArrayList arrayList3222 = new ArrayList(k13.r(keySet222, 10));
                it = keySet222.iterator();
                while (it.hasNext()) {
                }
                gv9 gv9Var11222 = gv9Var6;
                ft2 ft2Var222 = new ft2(gv9Var8, teeVar2222, l6g.W(arrayList3222), gv9Var7, gv9Var10222, gv9Var11222, uniqueTournamentDraftPicksResponse9222, uniqueTournamentDraftPicksResponse8222, 2);
                if (fwaVar.f.a.getValue() instanceof unb) {
                }
                return Unit.a;
            }
            obj2 = null;
            i3 = this.E;
            UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse10 = this.y;
            ?? r52 = this.w;
            uniqueTournamentDraftYear = this.v;
            zu4Var = (zu4) this.u;
            UniqueTournamentDraftInfoResponse uniqueTournamentDraftInfoResponse5 = this.t;
            str2 = (String) this.s;
            fwaVar = this.r;
            y6a.M(obj);
            uniqueTournamentDraftInfoResponse = uniqueTournamentDraftInfoResponse5;
            av4Var = null;
            T = obj;
            uniqueTournamentDraftPicksResponse4 = uniqueTournamentDraftPicksResponse10;
            av4Var3 = r52;
            UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse62 = (UniqueTournamentDraftPicksResponse) T;
            av4 av4Var62 = av4Var3;
            uniqueTournamentDraftPicksResponse = uniqueTournamentDraftPicksResponse4;
            r42 = uniqueTournamentDraftPicksResponse62;
            av4Var5 = av4Var62;
            str = str2;
            uniqueTournamentDraftYear3 = uniqueTournamentDraftYear;
            uniqueTournamentDraftInfoResponse2 = uniqueTournamentDraftInfoResponse;
            if (zu4Var == null) {
                uniqueTournamentDraftPicksResponse2 = r42;
                uniqueTournamentDraftInfoResponse3 = uniqueTournamentDraftInfoResponse2;
                uniqueTournamentDraftYear4 = uniqueTournamentDraftYear3;
                uniqueTournamentDraftPicksResponse3 = uniqueTournamentDraftPicksResponse;
                av4Var4 = av4Var5;
                obj3 = av4Var;
                if (obj3 != null) {
                }
                gv9Var = rlh.b;
                if (obj3 != null) {
                }
                lu3Var = lu3Var3;
                teeVar = uee.g;
                teeVar.getClass();
                if (uniqueTournamentDraftPicksResponse3 != null) {
                }
                gv9Var2 = rlh.b;
                if (uniqueTournamentDraftPicksResponse2 != null) {
                }
                gv9Var3 = rlh.b;
                if (av4Var4 != null) {
                }
                gv9Var6 = rlh.b;
                gv9Var7 = gv9Var2;
                gv9Var8 = gv9Var;
                tee teeVar22222 = teeVar;
                UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse82222 = uniqueTournamentDraftPicksResponse2;
                gv9 gv9Var102222 = gv9Var3;
                UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse92222 = uniqueTournamentDraftPicksResponse3;
                fwaVar.m = gv9Var6;
                fdi fdiVar2222 = fwaVar.e;
                Set keySet2222 = teeVar22222.keySet();
                ArrayList arrayList32222 = new ArrayList(k13.r(keySet2222, 10));
                it = keySet2222.iterator();
                while (it.hasNext()) {
                }
                gv9 gv9Var112222 = gv9Var6;
                ft2 ft2Var2222 = new ft2(gv9Var8, teeVar22222, l6g.W(arrayList32222), gv9Var7, gv9Var102222, gv9Var112222, uniqueTournamentDraftPicksResponse92222, uniqueTournamentDraftPicksResponse82222, 2);
                if (fwaVar.f.a.getValue() instanceof unb) {
                }
                return Unit.a;
            }
            this.G = ku3Var;
            this.r = fwaVar;
            this.s = str;
            this.t = uniqueTournamentDraftInfoResponse2;
            this.u = av4Var;
            this.v = uniqueTournamentDraftYear3;
            this.w = av4Var5;
            this.x = av4Var;
            this.y = uniqueTournamentDraftPicksResponse;
            this.z = r42;
            this.E = i3;
            this.F = 4;
            T2 = zu4Var.T(this);
            uniqueTournamentDraftPicksResponse5 = r42;
        }
        UniqueTournamentDraftInfoResponse uniqueTournamentDraftInfoResponse6 = (UniqueTournamentDraftInfoResponse) c;
        if (uniqueTournamentDraftInfoResponse6 == null) {
            if (fwaVar2.f.a.getValue() instanceof tnb) {
                fdi fdiVar3 = fwaVar2.e;
                do {
                    value = fdiVar3.getValue();
                } while (!fdiVar3.k(value, new snb()));
            }
            return Unit.a;
        }
        UniqueTournamentDraftYear draft2 = uniqueTournamentDraftInfoResponse6.getDraft();
        if (draft2 == null) {
            draft2 = uniqueTournamentDraftInfoResponse6.getPreviousDraft();
        }
        UniqueTournamentDraftYear draft3 = uniqueTournamentDraftInfoResponse6.getDraft();
        fwaVar2.q = draft3 != null ? draft3.getYear() : null;
        UniqueTournamentDraftYear previousDraft = uniqueTournamentDraftInfoResponse6.getPreviousDraft();
        fwaVar2.r = previousDraft != null ? previousDraft.getYear() : null;
        String lotteryYear = uniqueTournamentDraftInfoResponse6.getLotteryYear();
        av4 t2 = lotteryYear != null ? xw3.t(ku3Var, null, new bwa(fwaVar2, lotteryYear, av4Var5, i7), 3) : null;
        String prospectsYear = uniqueTournamentDraftInfoResponse6.getProspectsYear();
        if (prospectsYear != null) {
            av4Var = null;
            i = 1;
            i2 = 2;
            av4Var5 = yaa.p(ku3Var, fwaVar2.p, new ok0(fwaVar2, prospectsYear, i6, av4Var, 28));
        } else {
            i = 1;
            av4Var = null;
            i2 = 2;
        }
        String str9 = fwaVar2.q;
        av4 p = str9 != null ? yaa.p(ku3Var, fwaVar2.p, new bwa(fwaVar2, str9, av4Var, i)) : av4Var;
        String str10 = fwaVar2.r;
        t = str10 != null ? xw3.t(ku3Var, av4Var, new bwa(fwaVar2, str10, av4Var, i2), 3) : av4Var;
        if (p != null) {
            this.G = ku3Var;
            this.r = fwaVar2;
            this.s = str4;
            this.t = uniqueTournamentDraftInfoResponse6;
            this.u = t2;
            this.v = draft2;
            this.w = av4Var5;
            this.x = t;
            this.E = 0;
            this.F = i2;
            w = p.w(this);
            if (w != lu3Var3) {
                uniqueTournamentDraftYear2 = draft2;
                av4Var2 = t;
                zu4Var2 = t2;
                fwaVar = fwaVar2;
                uniqueTournamentDraftInfoResponse = uniqueTournamentDraftInfoResponse6;
                i3 = 0;
                zu4 zu4Var42 = zu4Var2;
                t = av4Var2;
                r4 = (UniqueTournamentDraftPicksResponse) w;
                uniqueTournamentDraftYear = uniqueTournamentDraftYear2;
                zu4Var = zu4Var42;
                if (t != null) {
                }
            }
            return lu3Var3;
        }
        av4 av4Var7 = t2;
        fwaVar = fwaVar2;
        zu4Var = av4Var7;
        uniqueTournamentDraftInfoResponse = uniqueTournamentDraftInfoResponse6;
        uniqueTournamentDraftYear = draft2;
        i3 = 0;
        r4 = av4Var;
        if (t != null) {
        }
    }
}
