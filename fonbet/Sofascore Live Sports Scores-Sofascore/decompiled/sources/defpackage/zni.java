package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.Question;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.Survey;
import com.sofascore.model.newNetwork.SurveyResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zni extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ int t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zni(q8 q8Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = q8Var;
        this.t = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new zni((aoi) obj2, this.t, rq3Var, 0);
            case 1:
                return new zni((y0j) obj2, this.t, rq3Var, 1);
            case 2:
                return new zni((l2j) obj2, this.t, rq3Var, 2);
            case 3:
                zni zniVar = new zni((r9j) obj2, rq3Var);
                zniVar.t = ((Number) obj).intValue();
                return zniVar;
            case 4:
                return new zni((qlj) obj2, this.t, rq3Var, 4);
            case 5:
                return new zni((muj) obj2, this.t, rq3Var, 5);
            default:
                return new zni((dnk) obj2, this.t, rq3Var, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 3:
                break;
        }
        return ((zni) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.sofascore.model.newNetwork.Question] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        w84 w84Var;
        zni zniVar;
        int i = this.r;
        Object obj2 = this.u;
        Question question = 0;
        question = 0;
        switch (i) {
            case 0:
                aoi aoiVar = (aoi) obj2;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    yni yniVar = aoiVar.e;
                    int i3 = this.t;
                    this.s = 1;
                    yniVar.getClass();
                    obj = yaa.P(new xr2(yniVar, i3, question, 5), this);
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
                SurveyResponse surveyResponse = (SurveyResponse) yaa.x((x2g) obj);
                yzc yzcVar = aoiVar.f;
                if (surveyResponse != null) {
                    if (surveyResponse.getSurvey().getQuestions().isEmpty()) {
                        surveyResponse = null;
                    }
                    if (surveyResponse != null) {
                        Survey survey = surveyResponse.getSurvey();
                        aoiVar.h = survey;
                        if (survey == null) {
                            Intrinsics.i("survey");
                            throw null;
                        }
                        question = survey.getQuestions().get(0);
                    }
                }
                yzcVar.j(question);
                return Unit.a;
            case 1:
                y0j y0jVar = (y0j) obj2;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = y0jVar.e;
                    int i5 = this.t;
                    this.s = 1;
                    obj = j0jVar.t(i5, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                StatisticsSeasonsResponse statisticsSeasonsResponse = (StatisticsSeasonsResponse) obj;
                if (statisticsSeasonsResponse != null) {
                    List J = jca.J(statisticsSeasonsResponse);
                    J.getClass();
                    y0jVar.n = J;
                    y0jVar.g.j(statisticsSeasonsResponse);
                }
                return Unit.a;
            case 2:
                l2j l2jVar = (l2j) obj2;
                yzc yzcVar2 = l2jVar.o;
                lu3 lu3Var3 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    j0j j0jVar2 = l2jVar.n;
                    int i7 = this.t;
                    this.s = 1;
                    j0jVar2.getClass();
                    obj = yaa.P(new azi(j0jVar2, i7, null, 14), this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                if (x2gVar instanceof v2g) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (UniqueTournamentSeasons uniqueTournamentSeasons : ((StatisticsSeasonsResponse) ((v2g) x2gVar).a).getUniqueTournamentSeasons()) {
                        UniqueTournament uniqueTournament = uniqueTournamentSeasons.getUniqueTournament();
                        Object obj3 = linkedHashMap.get(uniqueTournament);
                        Object obj4 = obj3;
                        if (obj3 == null) {
                            obj4 = new LinkedHashMap();
                        }
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj4;
                        for (Season season : uniqueTournamentSeasons.getSeasons()) {
                            Object obj5 = linkedHashMap2.get(season);
                            if (obj5 == null) {
                                obj5 = new ArrayList();
                            }
                            List list = (List) obj5;
                            Tournament tournament = new Tournament(-1, season.getName(), uniqueTournament.getCategory(), uniqueTournament, uniqueTournament.getFieldTranslations());
                            tournament.setSeason(season);
                            list.add(tournament);
                            linkedHashMap2.put(season, list);
                        }
                        linkedHashMap.put(uniqueTournament, linkedHashMap2);
                    }
                    yzcVar2.k(linkedHashMap);
                } else {
                    Object obj6 = lm5.a;
                    obj6.getClass();
                    yzcVar2.k(obj6);
                }
                return Unit.a;
            case 3:
                Object obj7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    if (Math.abs(this.t) == 1 && (w84Var = ((r9j) obj2).B) != null) {
                        this.s = 1;
                        Object r = s9a.r(new r1(w84Var, question, 12), this);
                        Object obj8 = r;
                        if (r != obj7) {
                            obj8 = Unit.a;
                        }
                        if (obj8 == obj7) {
                            return obj7;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var4 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                u8c u8cVar = ((qlj) obj2).e;
                int i10 = this.t;
                this.s = 1;
                Object a = u8cVar.a(i10, this);
                return a == lu3Var4 ? lu3Var4 : a;
            case 5:
                lu3 lu3Var5 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    muj mujVar = (muj) obj2;
                    vtj vtjVar = mujVar.l;
                    int i12 = mujVar.m;
                    int i13 = mujVar.n;
                    int i14 = this.t;
                    Context i15 = mujVar.i();
                    this.s = 1;
                    zniVar = this;
                    obj = vtjVar.f(i12, i13, i14, i15, zniVar);
                    if (obj == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    zniVar = this;
                }
                return new Pair(new Integer(zniVar.t), (xtj) obj);
            default:
                lu3 lu3Var6 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                unk unkVar = ((dnk) obj2).e;
                int i17 = this.t;
                this.s = 1;
                Object a2 = unkVar.a(i17, this);
                return a2 == lu3Var6 ? lu3Var6 : a2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zni(r9j r9jVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.u = r9jVar;
    }
}
