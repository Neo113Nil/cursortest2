package defpackage;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s;
import com.sofascore.model.Country;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyCreateTeamResponse;
import com.sofascore.model.fantasy.FantasyPlayerPostModel;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.bettingtips.EventBetBoost;
import com.sofascore.model.network.response.EventBetBoostsResponse;
import com.sofascore.model.network.response.bettingtips.BetBoostsResponse;
import com.sofascore.model.newNetwork.StageRaceResult;
import com.sofascore.model.newNetwork.StageRacesResponse;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.StageStandingsResponse;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ru1 extends hoi implements Function2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int r = 2;
    public int s;
    public Object t;
    public int u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru1(int i, koh kohVar, gv9 gv9Var, e1d e1dVar, znh znhVar, Function2 function2, Function2 function22, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = i;
        this.x = kohVar;
        this.y = gv9Var;
        this.z = e1dVar;
        this.v = znhVar;
        this.A = function2;
        this.B = function22;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                ru1 ru1Var = new ru1((String) this.v, (String) this.A, this.u, (su1) obj2, rq3Var);
                ru1Var.t = obj;
                return ru1Var;
            case 1:
                ru1 ru1Var2 = new ru1((wb7) this.x, this.u, (ev6) this.y, (Boolean) this.z, (String) this.v, (Integer) this.A, (Integer) obj2, rq3Var);
                ru1Var2.t = obj;
                return ru1Var2;
            case 2:
                ru1 ru1Var3 = new ru1(this.u, (koh) this.x, (gv9) this.y, (e1d) this.z, (znh) this.v, (Function2) this.A, (Function2) obj2, rq3Var);
                ru1Var3.t = obj;
                return ru1Var3;
            case 3:
                return new ru1((q3i) obj2, this.u, rq3Var);
            default:
                ru1 ru1Var4 = new ru1((XmlPullParser) this.w, rq3Var, (fsf) this.x, (fsf) this.y, (fsf) this.v, (ArrayList) this.z, (ArrayList) this.A, (ArrayList) obj2);
                ru1Var4.t = obj;
                return ru1Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ru1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02c3, code lost:
    
        if (r2 == r0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x025a, code lost:
    
        if (r4 == r0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x045e, code lost:
    
        if (r4.f(r44, r5) == r8) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0444, code lost:
    
        if (r4.f(r44, r9) == r8) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r8 == r7) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x07af, code lost:
    
        if (r4 != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x07c5, code lost:
    
        if (r1.equals(com.sofascore.model.mvvm.model.Season.YEAR_ALL_TIME) != false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0732, code lost:
    
        if (r4 == r6) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        if (r8 == r7) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        if (r8 == r7) goto L76;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06ce A[LOOP:3: B:255:0x067b->B:257:0x06ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a7  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v13, types: [km5] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v70, types: [km5] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0094 -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009e -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a4 -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00aa -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b5 -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c9 -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00cb -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00da -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ed -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ef -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00fe -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x011d -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x013c -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0149 -> B:11:0x014d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x018a -> B:12:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x019d -> B:12:0x01a2). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        Object w;
        x2g x2gVar;
        List<EventBetBoost> list;
        ArrayList arrayList;
        Object T;
        List list2;
        EventBetBoostsResponse eventBetBoostsResponse;
        ?? r2;
        boolean z;
        EventBetBoost betBoost;
        Object e0;
        lu3 lu3Var;
        wb7 wb7Var;
        x2g x2gVar2;
        Object value;
        do7 O;
        fdi fdiVar;
        Object value2;
        do7 do7Var;
        Iterator it;
        Object r;
        q3i q3iVar;
        Object r3;
        zu4 zu4Var;
        Object r4;
        zu4 zu4Var2;
        zu4 zu4Var3;
        zu4 zu4Var4;
        Object r5;
        zu4 zu4Var5;
        zu4 zu4Var6;
        Object T2;
        List<StageStandingsItem> list3;
        Object T3;
        zu4 zu4Var7;
        List<StageStandingsItem> list4;
        StageStandingsResponse stageStandingsResponse;
        List<StageStandingsItem> list5;
        Object T4;
        zu4 zu4Var8;
        List<StageStandingsItem> list6;
        x2g x2gVar3;
        StageStandingsResponse stageStandingsResponse2;
        List<StageRaceResult> list7;
        Object T5;
        List<StageRaceResult> list8;
        StageRacesResponse stageRacesResponse;
        List<StageRaceResult> list9;
        ?? r1;
        StageRacesResponse stageRacesResponse2;
        int depth;
        Object obj2;
        Object obj3;
        String text;
        String name;
        Object x;
        int i = this.r;
        Object obj4 = this.B;
        rq3 rq3Var = null;
        ?? r14 = 0;
        rq3Var = null;
        rq3Var = null;
        switch (i) {
            case 0:
                int i2 = this.u;
                String str = (String) this.v;
                su1 su1Var = (su1) obj4;
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    av4 t2 = xw3.t(ku3Var, null, new l0(su1Var, str, rq3Var, 29), 3);
                    t = xw3.t(ku3Var, null, new qu1(i2, su1Var, rq3Var, 0), 3);
                    this.t = null;
                    this.w = t;
                    this.s = 1;
                    w = t2.w(this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ArrayList arrayList2 = (ArrayList) this.z;
                        list2 = (List) this.y;
                        x2gVar = (x2g) this.x;
                        y6a.M(obj);
                        arrayList = arrayList2;
                        T = obj;
                        eventBetBoostsResponse = (EventBetBoostsResponse) T;
                        if (eventBetBoostsResponse != null && (betBoost = eventBetBoostsResponse.getBetBoost()) != null) {
                            boolean R = CollectionsKt.R(list2, ok3.v(betBoost.getEvent()));
                            r2 = betBoost;
                            break;
                        }
                        r2 = null;
                        if (!str.equals((String) this.A)) {
                            zu1 zu1Var = zu1.c;
                            break;
                        }
                        if (i2 != 0) {
                            if (arrayList == null || !arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (((EventBetBoost) it2.next()).getEvent().getId() == i2) {
                                    }
                                }
                            }
                            rq3Var = r2;
                        }
                        ArrayList w0 = CollectionsKt.w0(arrayList, b.k(rq3Var));
                        x2gVar.getClass();
                        z = x2gVar instanceof v2g;
                        yzc yzcVar = su1Var.g;
                        if (z) {
                            yzcVar.j(x2gVar);
                        } else {
                            yzcVar.j(new v2g(new BetBoostsResponse(w0)));
                        }
                        return Unit.a;
                    }
                    t = (av4) this.w;
                    y6a.M(obj);
                    w = obj;
                }
                x2gVar = (x2g) w;
                BetBoostsResponse betBoostsResponse = (BetBoostsResponse) yaa.x(x2gVar);
                if (betBoostsResponse == null || (list = betBoostsResponse.getBetBoosts()) == null) {
                    list = km5.a;
                }
                yea yeaVar = j58.a;
                Country e = dv3.e();
                List f = j58.f(e != null ? e.getIso2Alpha() : null);
                arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (!CollectionsKt.R(f, ok3.v(((EventBetBoost) obj5).getEvent()))) {
                        arrayList.add(obj5);
                    }
                }
                this.t = null;
                this.w = null;
                this.x = x2gVar;
                this.y = f;
                this.z = arrayList;
                this.s = 2;
                T = t.T(this);
                if (T != lu3Var2) {
                    list2 = f;
                    eventBetBoostsResponse = (EventBetBoostsResponse) T;
                    if (eventBetBoostsResponse != null) {
                        boolean R2 = CollectionsKt.R(list2, ok3.v(betBoost.getEvent()));
                        r2 = betBoost;
                    }
                    r2 = null;
                    if (!str.equals((String) this.A)) {
                    }
                    if (i2 != 0) {
                    }
                    ArrayList w02 = CollectionsKt.w0(arrayList, b.k(rq3Var));
                    x2gVar.getClass();
                    z = x2gVar instanceof v2g;
                    yzc yzcVar2 = su1Var.g;
                    if (z) {
                    }
                    return Unit.a;
                }
                return lu3Var2;
            case 1:
                int i4 = this.u;
                wb7 wb7Var2 = (wb7) this.x;
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    gv9 gv9Var = ((pb7) wb7Var2.k.a.getValue()).j;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : gv9Var) {
                        if (obj6 instanceof FantasyRoundPlayerUiModel) {
                            arrayList3.add(obj6);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) it3.next();
                        arrayList4.add(new FantasyPlayerPostModel(fantasyRoundPlayerUiModel.a, fantasyRoundPlayerUiModel.d, fantasyRoundPlayerUiModel.k, fantasyRoundPlayerUiModel.m));
                    }
                    av4 t3 = xw3.t(ku3Var2, null, new ts2((wb7) this.x, (ev6) this.y, (Boolean) this.z, arrayList4, (String) this.v, (Integer) this.A, (Integer) obj4, null), 3);
                    wd5 wd5Var = xd5.b;
                    long R3 = wkn.R(400, be5.MILLISECONDS);
                    this.t = null;
                    this.s = 1;
                    e0 = z8e.e0(t3, R3, this);
                    if (e0 == lu3Var3) {
                        lu3Var = lu3Var3;
                        return lu3Var;
                    }
                } else if (i5 == 1) {
                    y6a.M(obj);
                    e0 = obj;
                } else {
                    if (i5 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x2gVar2 = (v2g) this.w;
                    y6a.M(obj);
                    wb7Var = wb7Var2;
                    if (((ev6) this.y).d == FantasyCompetitionType.WEEKLY) {
                        int i6 = wb7.o;
                        n9e.u(wb7Var.i(), new we7(i4, yaa.w(), 0));
                    }
                    FantasyUserCompetition squad = ((FantasyCreateTeamResponse) ((v2g) x2gVar2).a).getSquad();
                    int i7 = wb7.o;
                    O = fkf.O(squad, wb7Var.i());
                    wb7 wb7Var3 = wb7Var;
                    fdiVar = wb7Var3.j;
                    while (true) {
                        value2 = fdiVar.getValue();
                        do7Var = O;
                        if (!fdiVar.k(value2, pb7.a((pb7) value2, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, O, null, 5898239))) {
                            xw3.L(un0.z(wb7Var3), null, null, new hs6(wb7Var3, do7Var, rq3Var, 20), 3);
                            return Unit.a;
                        }
                        O = do7Var;
                    }
                }
                x2g x2gVar4 = (x2g) e0;
                if (x2gVar4 instanceof t2g) {
                    ia0 ia0Var = ia0.q;
                    if (ok3.p().e().getDevMod()) {
                        Calendar calendar = ke0.a;
                        int i8 = wb7.o;
                        ke0.g(wb7Var2.i(), "Create-Team: ".concat(yaa.z(((t2g) x2gVar4).a)), 0);
                    }
                    fdi fdiVar2 = wb7Var2.j;
                    do {
                        value = fdiVar2.getValue();
                    } while (!fdiVar2.k(value, pb7.a((pb7) value, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, ox6.c, false, null, null, 7733247)));
                    return Unit.a;
                }
                if (!(x2gVar4 instanceof v2g)) {
                    zzl.b();
                    return null;
                }
                int i9 = wb7.o;
                hkg.r(i4, wb7Var2.i());
                Context i10 = wb7Var2.i();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putInt("id", i4);
                nv.N(i10, firebaseBundle, "fantasy_create_team");
                nv.O(i10, "fantasy_create_team", null);
                bfk bfkVar = wb7Var2.e;
                this.t = null;
                this.w = (v2g) x2gVar4;
                this.s = 2;
                wb7Var = wb7Var2;
                lu3Var = lu3Var3;
                if (bfk.e(bfkVar, null, null, null, null, null, null, null, null, null, this, 6143) != lu3Var) {
                    x2gVar2 = x2gVar4;
                    if (((ev6) this.y).d == FantasyCompetitionType.WEEKLY) {
                    }
                    FantasyUserCompetition squad2 = ((FantasyCreateTeamResponse) ((v2g) x2gVar2).a).getSquad();
                    int i72 = wb7.o;
                    O = fkf.O(squad2, wb7Var.i());
                    wb7 wb7Var32 = wb7Var;
                    fdiVar = wb7Var32.j;
                    while (true) {
                        value2 = fdiVar.getValue();
                        do7Var = O;
                        if (!fdiVar.k(value2, pb7.a((pb7) value2, null, null, 0, 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, O, null, 5898239))) {
                        }
                        O = do7Var;
                    }
                }
                return lu3Var;
            case 2:
                koh kohVar = (koh) this.x;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var4 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    if (this.u > 0) {
                        ((e1d) this.z).setValue(Boolean.FALSE);
                        ((znh) this.v).i(0);
                        q50 q50Var = (q50) kohVar.get("path_clip_progress");
                        if (q50Var != null) {
                            Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            this.t = ku3Var3;
                            this.s = 1;
                            break;
                        }
                    }
                    return Unit.a;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        y6a.M(obj);
                        it = ((gv9) this.y).iterator();
                        while (it.hasNext()) {
                        }
                        xw3.L(ku3Var3, null, null, new p4f((Function2) this.A, null, 4), 3);
                        xw3.L(ku3Var3, null, null, new p4f((Function2) obj4, null, 5), 3);
                        return Unit.a;
                    }
                    if (i11 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) this.w;
                    y6a.M(obj);
                    while (it.hasNext()) {
                        q50 q50Var2 = (q50) kohVar.get("number_circle_alpha_" + ((RaceFlowModels$RaceEntrant) it.next()).a);
                        if (q50Var2 != null) {
                            Float f3 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            this.t = ku3Var3;
                            this.w = it;
                            this.s = 3;
                            if (q50Var2.f(this, f3) == lu3Var4) {
                                return lu3Var4;
                            }
                        }
                    }
                    xw3.L(ku3Var3, null, null, new p4f((Function2) this.A, null, 4), 3);
                    xw3.L(ku3Var3, null, null, new p4f((Function2) obj4, null, 5), 3);
                    return Unit.a;
                }
                y6a.M(obj);
                q50 q50Var3 = (q50) kohVar.get("live_line_alpha");
                if (q50Var3 != null) {
                    Float f4 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.t = ku3Var3;
                    this.s = 2;
                    break;
                }
                it = ((gv9) this.y).iterator();
                while (it.hasNext()) {
                }
                xw3.L(ku3Var3, null, null, new p4f((Function2) this.A, null, 4), 3);
                xw3.L(ku3Var3, null, null, new p4f((Function2) obj4, null, 5), 3);
                return Unit.a;
            case 3:
                int i12 = this.u;
                q3i q3iVar2 = (q3i) obj4;
                lu3 lu3Var5 = lu3.a;
                switch (this.s) {
                    case 0:
                        y6a.M(obj);
                        j5i j5iVar = j5i.b;
                        this.s = 1;
                        r = s9a.r(new v1f(q3iVar2, j5iVar, i12, (rq3) null), this);
                        break;
                    case 1:
                        y6a.M(obj);
                        r = obj;
                        zu4 zu4Var9 = (zu4) r;
                        UniqueStage uniqueStage = q3iVar2.h;
                        j5i j5iVar2 = j5i.b;
                        this.w = zu4Var9;
                        this.s = 2;
                        q3iVar = q3iVar2;
                        r3 = s9a.r(new cce(uniqueStage, q3iVar, j5iVar2, i12, (rq3) null), this);
                        if (r3 != lu3Var5) {
                            zu4Var = zu4Var9;
                            zu4 zu4Var10 = (zu4) r3;
                            j5i j5iVar3 = j5i.c;
                            this.w = zu4Var;
                            this.x = zu4Var10;
                            this.s = 3;
                            r4 = s9a.r(new v1f(q3iVar, j5iVar3, i12, (rq3) null), this);
                            if (r4 != lu3Var5) {
                                zu4Var2 = zu4Var10;
                                zu4Var3 = zu4Var;
                                zu4Var4 = (zu4) r4;
                                UniqueStage uniqueStage2 = q3iVar.h;
                                j5i j5iVar4 = j5i.c;
                                this.w = zu4Var3;
                                this.x = zu4Var2;
                                this.z = zu4Var4;
                                this.s = 4;
                                r5 = s9a.r(new cce(uniqueStage2, q3iVar, j5iVar4, i12, (rq3) null), this);
                                if (r5 != lu3Var5) {
                                    zu4Var5 = zu4Var2;
                                    zu4Var6 = (zu4) r5;
                                    if (zu4Var3 != null) {
                                        this.w = null;
                                        this.x = zu4Var5;
                                        this.z = zu4Var4;
                                        this.t = zu4Var6;
                                        this.s = 5;
                                        T2 = zu4Var3.T(this);
                                        break;
                                    }
                                    list3 = null;
                                    if (list3 == null) {
                                        list3 = km5.a;
                                    }
                                    if (zu4Var4 != null) {
                                        this.w = null;
                                        this.x = zu4Var5;
                                        this.z = null;
                                        this.t = zu4Var6;
                                        this.y = list3;
                                        this.s = 6;
                                        T3 = zu4Var4.T(this);
                                        if (T3 != lu3Var5) {
                                            List<StageStandingsItem> list10 = list3;
                                            zu4Var7 = zu4Var6;
                                            list4 = list10;
                                            x2gVar3 = (x2g) T3;
                                            if (x2gVar3 == null && (stageStandingsResponse2 = (StageStandingsResponse) yaa.x(x2gVar3)) != null) {
                                                list5 = stageStandingsResponse2.getStandings();
                                                zu4 zu4Var11 = zu4Var7;
                                                list3 = list4;
                                                zu4Var6 = zu4Var11;
                                                if (list5 == null) {
                                                    list5 = km5.a;
                                                }
                                                if (zu4Var5 != null) {
                                                    this.w = null;
                                                    this.x = null;
                                                    this.z = null;
                                                    this.t = zu4Var6;
                                                    this.y = list3;
                                                    this.v = list5;
                                                    this.s = 7;
                                                    T4 = zu4Var5.T(this);
                                                    if (T4 != lu3Var5) {
                                                        List<StageStandingsItem> list11 = list5;
                                                        zu4Var8 = zu4Var6;
                                                        list6 = list11;
                                                        stageRacesResponse = (StageRacesResponse) T4;
                                                        if (stageRacesResponse == null) {
                                                            list7 = stageRacesResponse.getRaces();
                                                            if (zu4Var8 != null) {
                                                                this.w = null;
                                                                this.x = null;
                                                                this.z = null;
                                                                this.t = null;
                                                                this.y = list3;
                                                                this.v = list6;
                                                                this.A = list7;
                                                                this.s = 8;
                                                                T5 = zu4Var8.T(this);
                                                                if (T5 != lu3Var5) {
                                                                    list8 = list7;
                                                                    stageRacesResponse2 = (StageRacesResponse) T5;
                                                                    if (stageRacesResponse2 == null) {
                                                                        list9 = stageRacesResponse2.getRaces();
                                                                        ArrayList l = q3i.l(list3, list8 != null ? km5.a : list8);
                                                                        ArrayList l2 = q3i.l(list6, list9 != null ? km5.a : list9);
                                                                        if (list3.isEmpty() || !list6.isEmpty()) {
                                                                            if (list8 == null) {
                                                                                r1 = new ArrayList();
                                                                                Iterator it4 = list8.iterator();
                                                                                while (it4.hasNext()) {
                                                                                    Stage stage = ((StageRaceResult) it4.next()).getStage();
                                                                                    if (stage != null) {
                                                                                        r1.add(stage);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                r1 = 0;
                                                                            }
                                                                            if (r1 == 0) {
                                                                                r1 = km5.a;
                                                                            }
                                                                            if (list9 != null) {
                                                                                r14 = new ArrayList();
                                                                                Iterator it5 = list9.iterator();
                                                                                while (it5.hasNext()) {
                                                                                    Stage stage2 = ((StageRaceResult) it5.next()).getStage();
                                                                                    if (stage2 != null) {
                                                                                        r14.add(stage2);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (r14 == 0) {
                                                                                r14 = km5.a;
                                                                            }
                                                                            q3iVar.n = new m3i(l, l2, r1, r14);
                                                                            q3iVar.m();
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                    list7 = list8;
                                                                }
                                                            }
                                                            list8 = list7;
                                                            list9 = null;
                                                            ArrayList l3 = q3i.l(list3, list8 != null ? km5.a : list8);
                                                            ArrayList l22 = q3i.l(list6, list9 != null ? km5.a : list9);
                                                            if (list3.isEmpty()) {
                                                            }
                                                            if (list8 == null) {
                                                            }
                                                            if (r1 == 0) {
                                                            }
                                                            if (list9 != null) {
                                                            }
                                                            if (r14 == 0) {
                                                            }
                                                            q3iVar.n = new m3i(l3, l22, r1, r14);
                                                            q3iVar.m();
                                                            return Unit.a;
                                                        }
                                                        zu4 zu4Var12 = zu4Var8;
                                                        list5 = list6;
                                                        zu4Var6 = zu4Var12;
                                                    }
                                                }
                                                List<StageStandingsItem> list12 = list5;
                                                zu4Var8 = zu4Var6;
                                                list6 = list12;
                                                list7 = null;
                                                if (zu4Var8 != null) {
                                                }
                                                list8 = list7;
                                                list9 = null;
                                                ArrayList l32 = q3i.l(list3, list8 != null ? km5.a : list8);
                                                ArrayList l222 = q3i.l(list6, list9 != null ? km5.a : list9);
                                                if (list3.isEmpty()) {
                                                }
                                                if (list8 == null) {
                                                }
                                                if (r1 == 0) {
                                                }
                                                if (list9 != null) {
                                                }
                                                if (r14 == 0) {
                                                }
                                                q3iVar.n = new m3i(l32, l222, r1, r14);
                                                q3iVar.m();
                                                return Unit.a;
                                            }
                                            zu4 zu4Var13 = zu4Var7;
                                            list3 = list4;
                                            zu4Var6 = zu4Var13;
                                        }
                                    }
                                    list5 = null;
                                    if (list5 == null) {
                                    }
                                    if (zu4Var5 != null) {
                                    }
                                    List<StageStandingsItem> list122 = list5;
                                    zu4Var8 = zu4Var6;
                                    list6 = list122;
                                    list7 = null;
                                    if (zu4Var8 != null) {
                                    }
                                    list8 = list7;
                                    list9 = null;
                                    ArrayList l322 = q3i.l(list3, list8 != null ? km5.a : list8);
                                    ArrayList l2222 = q3i.l(list6, list9 != null ? km5.a : list9);
                                    if (list3.isEmpty()) {
                                    }
                                    if (list8 == null) {
                                    }
                                    if (r1 == 0) {
                                    }
                                    if (list9 != null) {
                                    }
                                    if (r14 == 0) {
                                    }
                                    q3iVar.n = new m3i(l322, l2222, r1, r14);
                                    q3iVar.m();
                                    return Unit.a;
                                }
                            }
                        }
                        return lu3Var5;
                    case 2:
                        zu4Var = (zu4) this.w;
                        y6a.M(obj);
                        q3iVar = q3iVar2;
                        r3 = obj;
                        zu4 zu4Var102 = (zu4) r3;
                        j5i j5iVar32 = j5i.c;
                        this.w = zu4Var;
                        this.x = zu4Var102;
                        this.s = 3;
                        r4 = s9a.r(new v1f(q3iVar, j5iVar32, i12, (rq3) null), this);
                        if (r4 != lu3Var5) {
                        }
                        return lu3Var5;
                    case 3:
                        zu4 zu4Var14 = (zu4) this.x;
                        zu4 zu4Var15 = (zu4) this.w;
                        y6a.M(obj);
                        r4 = obj;
                        zu4Var2 = zu4Var14;
                        zu4Var3 = zu4Var15;
                        q3iVar = q3iVar2;
                        zu4Var4 = (zu4) r4;
                        UniqueStage uniqueStage22 = q3iVar.h;
                        j5i j5iVar42 = j5i.c;
                        this.w = zu4Var3;
                        this.x = zu4Var2;
                        this.z = zu4Var4;
                        this.s = 4;
                        r5 = s9a.r(new cce(uniqueStage22, q3iVar, j5iVar42, i12, (rq3) null), this);
                        if (r5 != lu3Var5) {
                        }
                        return lu3Var5;
                    case 4:
                        zu4 zu4Var16 = (zu4) this.z;
                        zu4Var5 = (zu4) this.x;
                        zu4 zu4Var17 = (zu4) this.w;
                        y6a.M(obj);
                        zu4Var4 = zu4Var16;
                        zu4Var3 = zu4Var17;
                        r5 = obj;
                        q3iVar = q3iVar2;
                        zu4Var6 = (zu4) r5;
                        if (zu4Var3 != null) {
                        }
                        list3 = null;
                        if (list3 == null) {
                        }
                        if (zu4Var4 != null) {
                        }
                        list5 = null;
                        if (list5 == null) {
                        }
                        if (zu4Var5 != null) {
                        }
                        List<StageStandingsItem> list1222 = list5;
                        zu4Var8 = zu4Var6;
                        list6 = list1222;
                        list7 = null;
                        if (zu4Var8 != null) {
                        }
                        list8 = list7;
                        list9 = null;
                        ArrayList l3222 = q3i.l(list3, list8 != null ? km5.a : list8);
                        ArrayList l22222 = q3i.l(list6, list9 != null ? km5.a : list9);
                        if (list3.isEmpty()) {
                        }
                        if (list8 == null) {
                        }
                        if (r1 == 0) {
                        }
                        if (list9 != null) {
                        }
                        if (r14 == 0) {
                        }
                        q3iVar.n = new m3i(l3222, l22222, r1, r14);
                        q3iVar.m();
                        return Unit.a;
                    case 5:
                        zu4Var6 = (zu4) this.t;
                        zu4 zu4Var18 = (zu4) this.z;
                        zu4Var5 = (zu4) this.x;
                        y6a.M(obj);
                        zu4Var4 = zu4Var18;
                        q3iVar = q3iVar2;
                        T2 = obj;
                        x2g x2gVar5 = (x2g) T2;
                        if (x2gVar5 != null && (stageStandingsResponse = (StageStandingsResponse) yaa.x(x2gVar5)) != null) {
                            list3 = stageStandingsResponse.getStandings();
                            if (list3 == null) {
                            }
                            if (zu4Var4 != null) {
                            }
                            list5 = null;
                            if (list5 == null) {
                            }
                            if (zu4Var5 != null) {
                            }
                            List<StageStandingsItem> list12222 = list5;
                            zu4Var8 = zu4Var6;
                            list6 = list12222;
                            list7 = null;
                            if (zu4Var8 != null) {
                            }
                            list8 = list7;
                            list9 = null;
                            ArrayList l32222 = q3i.l(list3, list8 != null ? km5.a : list8);
                            ArrayList l222222 = q3i.l(list6, list9 != null ? km5.a : list9);
                            if (list3.isEmpty()) {
                            }
                            if (list8 == null) {
                            }
                            if (r1 == 0) {
                            }
                            if (list9 != null) {
                            }
                            if (r14 == 0) {
                            }
                            q3iVar.n = new m3i(l32222, l222222, r1, r14);
                            q3iVar.m();
                            return Unit.a;
                        }
                        list3 = null;
                        if (list3 == null) {
                        }
                        if (zu4Var4 != null) {
                        }
                        list5 = null;
                        if (list5 == null) {
                        }
                        if (zu4Var5 != null) {
                        }
                        List<StageStandingsItem> list122222 = list5;
                        zu4Var8 = zu4Var6;
                        list6 = list122222;
                        list7 = null;
                        if (zu4Var8 != null) {
                        }
                        list8 = list7;
                        list9 = null;
                        ArrayList l322222 = q3i.l(list3, list8 != null ? km5.a : list8);
                        ArrayList l2222222 = q3i.l(list6, list9 != null ? km5.a : list9);
                        if (list3.isEmpty()) {
                        }
                        if (list8 == null) {
                        }
                        if (r1 == 0) {
                        }
                        if (list9 != null) {
                        }
                        if (r14 == 0) {
                        }
                        q3iVar.n = new m3i(l322222, l2222222, r1, r14);
                        q3iVar.m();
                        return Unit.a;
                    case 6:
                        list4 = (List) this.y;
                        zu4Var7 = (zu4) this.t;
                        zu4Var5 = (zu4) this.x;
                        y6a.M(obj);
                        q3iVar = q3iVar2;
                        T3 = obj;
                        x2gVar3 = (x2g) T3;
                        if (x2gVar3 == null) {
                            break;
                        }
                        zu4 zu4Var132 = zu4Var7;
                        list3 = list4;
                        zu4Var6 = zu4Var132;
                        list5 = null;
                        if (list5 == null) {
                        }
                        if (zu4Var5 != null) {
                        }
                        List<StageStandingsItem> list1222222 = list5;
                        zu4Var8 = zu4Var6;
                        list6 = list1222222;
                        list7 = null;
                        if (zu4Var8 != null) {
                        }
                        list8 = list7;
                        list9 = null;
                        ArrayList l3222222 = q3i.l(list3, list8 != null ? km5.a : list8);
                        ArrayList l22222222 = q3i.l(list6, list9 != null ? km5.a : list9);
                        if (list3.isEmpty()) {
                        }
                        if (list8 == null) {
                        }
                        if (r1 == 0) {
                        }
                        if (list9 != null) {
                        }
                        if (r14 == 0) {
                        }
                        q3iVar.n = new m3i(l3222222, l22222222, r1, r14);
                        q3iVar.m();
                        return Unit.a;
                    case 7:
                        list6 = (List) this.v;
                        list3 = (List) this.y;
                        zu4 zu4Var19 = (zu4) this.t;
                        y6a.M(obj);
                        q3iVar = q3iVar2;
                        zu4Var8 = zu4Var19;
                        T4 = obj;
                        stageRacesResponse = (StageRacesResponse) T4;
                        if (stageRacesResponse == null) {
                        }
                        break;
                    case 8:
                        list8 = (List) this.A;
                        list6 = (List) this.v;
                        list3 = (List) this.y;
                        y6a.M(obj);
                        q3iVar = q3iVar2;
                        T5 = obj;
                        stageRacesResponse2 = (StageRacesResponse) T5;
                        if (stageRacesResponse2 == null) {
                        }
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            default:
                XmlPullParser xmlPullParser = (XmlPullParser) this.w;
                lu3 lu3Var6 = lu3.a;
                int i13 = this.u;
                if (i13 != 0) {
                    if (i13 == 1) {
                        depth = this.s;
                        fsf fsfVar = (fsf) this.t;
                        y6a.M(obj);
                        fsfVar.a = obj;
                    } else if (i13 == 2) {
                        depth = this.s;
                        fsf fsfVar2 = (fsf) this.t;
                        y6a.M(obj);
                        fsfVar2.a = obj;
                    } else if (i13 == 3) {
                        depth = this.s;
                        y6a.M(obj);
                        obj3 = obj;
                        s sVar = (s) obj3;
                        if (sVar != null) {
                            ((ArrayList) this.z).add(sVar);
                        }
                    } else if (i13 == 4) {
                        depth = this.s;
                        y6a.M(obj);
                        obj2 = obj;
                        String str2 = (String) obj2;
                        if (str2 != null) {
                            ((ArrayList) this.A).add(str2);
                        }
                    } else {
                        if (i13 != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        depth = this.s;
                        y6a.M(obj);
                        x = obj;
                        ((ArrayList) obj4).addAll((List) x);
                    }
                    xmlPullParser.next();
                    if (xmlPullParser.getDepth() < depth) {
                        return Unit.a;
                    }
                    int depth2 = xmlPullParser.getDepth() - depth;
                    if (depth2 == 0) {
                        mqi mqiVar = d1.a;
                        if (xmlPullParser.getEventType() == 2) {
                            fsf fsfVar3 = (fsf) this.x;
                            String u = d1.u(xmlPullParser, "followAdditionalWrappers");
                            if (u != null) {
                                fsfVar3.a = Boolean.valueOf(Boolean.parseBoolean(u));
                            } else {
                                fsfVar3.a = null;
                            }
                        } else if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                            String text2 = xmlPullParser.getText();
                            text2.getClass();
                            StringsKt.l0(text2).toString();
                        } else if (xmlPullParser.getEventType() == 3) {
                            return Unit.a;
                        }
                    } else if (depth2 == 1) {
                        mqi mqiVar2 = d1.a;
                        if (xmlPullParser.getEventType() == 2 && (name = xmlPullParser.getName()) != null) {
                            switch (name.hashCode()) {
                                case -1692490108:
                                    if (name.equals("Creatives")) {
                                        this.t = null;
                                        this.s = depth;
                                        this.u = 5;
                                        x = d1.x(xmlPullParser, false, this);
                                        break;
                                    }
                                    break;
                                case -1633884078:
                                    if (name.equals("AdSystem")) {
                                        fsf fsfVar4 = (fsf) this.v;
                                        this.t = fsfVar4;
                                        this.s = depth;
                                        this.u = 2;
                                        Object E = d1.E(xmlPullParser, this);
                                        if (E != lu3Var6) {
                                            fsfVar4.a = E;
                                            break;
                                        }
                                        return lu3Var6;
                                    }
                                    break;
                                case -587420703:
                                    if (name.equals("VASTAdTagURI")) {
                                        fsf fsfVar5 = (fsf) this.y;
                                        this.t = fsfVar5;
                                        this.s = depth;
                                        this.u = 1;
                                        Object o = d1.o(xmlPullParser, this);
                                        if (o != lu3Var6) {
                                            fsfVar5.a = o;
                                            break;
                                        }
                                        return lu3Var6;
                                    }
                                    break;
                                case 67232232:
                                    if (name.equals("Error")) {
                                        this.t = null;
                                        this.s = depth;
                                        this.u = 4;
                                        obj2 = d1.o(xmlPullParser, this);
                                        break;
                                    }
                                    break;
                                case 2114088489:
                                    if (name.equals("Impression")) {
                                        this.t = null;
                                        this.s = depth;
                                        this.u = 3;
                                        obj3 = d1.i(xmlPullParser, this);
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                    xmlPullParser.next();
                    if (xmlPullParser.getDepth() < depth) {
                    }
                } else {
                    y6a.M(obj);
                    s9a.t((ku3) this.t);
                    if (d1.B(xmlPullParser)) {
                        xmlPullParser.nextTag();
                    }
                    if (xmlPullParser.getEventType() == 1) {
                        return Unit.a;
                    }
                    if (xmlPullParser.getEventType() != 2) {
                        pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                        return null;
                    }
                    depth = xmlPullParser.getDepth();
                    if (xmlPullParser.getDepth() < depth) {
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru1(wb7 wb7Var, int i, ev6 ev6Var, Boolean bool, String str, Integer num, Integer num2, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = wb7Var;
        this.u = i;
        this.y = ev6Var;
        this.z = bool;
        this.v = str;
        this.A = num;
        this.B = num2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru1(q3i q3iVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.B = q3iVar;
        this.u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru1(String str, String str2, int i, su1 su1Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = str;
        this.A = str2;
        this.u = i;
        this.B = su1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru1(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, fsf fsfVar2, fsf fsfVar3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(2, rq3Var);
        this.w = xmlPullParser;
        this.x = fsfVar;
        this.y = fsfVar2;
        this.v = fsfVar3;
        this.z = arrayList;
        this.A = arrayList2;
        this.B = arrayList3;
    }
}
