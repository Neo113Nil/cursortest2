package defpackage;

import com.sofascore.model.fantasy.FantasyCreateLeagueBody;
import com.sofascore.model.fantasy.FantasyLeagueGameType;
import com.sofascore.model.fantasy.FantasyTransfersPostBody;
import com.sofascore.network.api.FantasyAPI;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fg7 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg7(wi7 wi7Var, int i, Object obj, Object obj2, Object obj3, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = wi7Var;
        this.u = i;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.v;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                return new fg7((wi7) obj4, this.u, (String) obj3, (String) obj2, (FantasyLeagueGameType) obj, rq3Var, 0);
            case 1:
                return new fg7((wi7) obj4, this.u, (List) obj3, (Boolean) obj2, (Boolean) obj, rq3Var, 1);
            case 2:
                return new fg7((uwg) obj4, (String) obj3, (String) obj2, (String) obj, this.u, rq3Var, 2);
            default:
                return new fg7((a3l) obj4, (String) obj3, (String) obj2, (String) obj, this.u, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((fg7) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI = ((wi7) obj5).a;
                FantasyCreateLeagueBody fantasyCreateLeagueBody = new FantasyCreateLeagueBody(i2, (String) obj4, (String) obj3, new Integer(((FantasyLeagueGameType) obj2).getValue()));
                this.s = 1;
                Object createLeague = fantasyAPI.createLeague(fantasyCreateLeagueBody, this);
                return createLeague == lu3Var ? lu3Var : createLeague;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                FantasyAPI fantasyAPI2 = ((wi7) obj5).a;
                FantasyTransfersPostBody fantasyTransfersPostBody = new FantasyTransfersPostBody((List) obj4, (Boolean) obj3, (Boolean) obj2);
                this.s = 1;
                Object postTransfers = fantasyAPI2.postTransfers(i2, fantasyTransfersPostBody, this);
                return postTransfers == lu3Var2 ? lu3Var2 : postTransfers;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object searchByEntityType = ((uwg) obj5).a.searchByEntityType((String) obj4, (String) obj3, (String) obj2, this.u, this);
                    return searchByEntityType == lu3Var3 ? lu3Var3 : searchByEntityType;
                }
                if (i5 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object userWeeklyPredictions = ((a3l) obj5).a.userWeeklyPredictions((String) obj4, (String) obj3, (String) obj2, this.u, this);
                    return userWeeklyPredictions == lu3Var4 ? lu3Var4 : userWeeklyPredictions;
                }
                if (i6 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg7(Object obj, String str, String str2, String str3, int i, rq3 rq3Var, int i2) {
        super(1, rq3Var);
        this.r = i2;
        this.t = obj;
        this.v = str;
        this.w = str2;
        this.x = str3;
        this.u = i;
    }
}
