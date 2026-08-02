package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.fantasy.FantasyLeague;
import com.sofascore.model.fantasy.FantasyLeagueType;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.fantasy.FantasyUserRoundSquadResponse;
import com.sofascore.model.fantasy.FantasyUserSquad;
import com.sofascore.model.mvvm.model.Batsman;
import com.sofascore.model.mvvm.model.Bowler;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Inning;
import com.sofascore.model.mvvm.model.Partnership;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.network.response.EventInningsResponse;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.EsportsGamesResponse;
import com.sofascore.model.newNetwork.LiveCategoriesResponse;
import com.sofascore.model.newNetwork.TvChannelsResponse;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.results.R;
import com.sofascore.results.settings.deleteAccount.DeleteAccountActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ce4 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce4(ksa ksaVar, int i, pj5 pj5Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 8;
        this.t = ksaVar;
        this.s = i;
        this.u = pj5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.q(r5, r2) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r6.q(r5, r2) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        hp6 hp6Var = (hp6) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            g62 g62Var = hp6Var.l;
            ip6 ip6Var = ip6.c;
            this.s = 1;
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
        Integer num = (Integer) this.u;
        g62 g62Var2 = hp6Var.r;
        fp6 fp6Var = new fp6(num.intValue());
        this.s = 2;
    }

    private final Object f(Object obj) {
        cq6 cq6Var = (cq6) this.u;
        gy6 gy6Var = (gy6) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            if (gy6Var == gy6.b && cq6Var.l.a.getValue() == null) {
                this.t = null;
                this.s = 1;
                if (cq6Var.l(this) == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }

    private final Object g(Object obj) {
        nr6 nr6Var = (nr6) this.u;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        int i2 = 1;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            nr6Var.n(hr6.a(nr6Var.k(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, true, 524287));
            List j = b.j(xw3.L(ku3Var, null, null, new u41(2, rq3Var, i2), 3), xw3.L(ku3Var, null, null, new ip1(nr6Var, rq3Var, 14), 3));
            this.t = null;
            this.s = 1;
            if (m6k.V(j, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        nr6Var.n(hr6.a(nr6Var.k(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, 524287));
        return Unit.a;
    }

    private final Object h(Object obj) {
        FantasyUserSquad squad;
        List<FantasyRoundPlayer> players;
        nr6 nr6Var = (nr6) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            wi7 wi7Var = nr6Var.e;
            String str = nr6Var.i;
            int i2 = ((mj7) this.u).a;
            this.s = 1;
            obj = wi7Var.W(i2, str, this);
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
        FantasyUserRoundSquadResponse fantasyUserRoundSquadResponse = (FantasyUserRoundSquadResponse) obj;
        if (fantasyUserRoundSquadResponse == null || (squad = fantasyUserRoundSquadResponse.getSquad()) == null || (players = squad.getPlayers()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(k13.r(players, 10));
        Iterator<T> it = players.iterator();
        while (it.hasNext()) {
            arrayList.add(hkg.g0((FantasyRoundPlayer) it.next(), nr6Var.i()));
        }
        return arrayList;
    }

    private final Object j(Object obj) {
        FantasyUserSquad squad;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            nr6 nr6Var = (nr6) this.t;
            wi7 wi7Var = nr6Var.e;
            String str = nr6Var.i;
            int i2 = ((ho7) this.u).a.a;
            this.s = 1;
            obj = wi7Var.W(i2, str, this);
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
        FantasyUserRoundSquadResponse fantasyUserRoundSquadResponse = (FantasyUserRoundSquadResponse) obj;
        if (fantasyUserRoundSquadResponse == null || (squad = fantasyUserRoundSquadResponse.getSquad()) == null) {
            return null;
        }
        return squad.getPlayers();
    }

    private final Object k(Object obj) {
        SharedPreferences d;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            wd5 wd5Var = xd5.b;
            long R = wkn.R(2, be5.SECONDS);
            this.s = 1;
            if (n4o.z(R, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        Context i2 = ((nr6) this.t).i();
        String str = (String) this.u;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = i2.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putLong(str, yaa.w());
        Unit unit = Unit.a;
        edit.apply();
        nr6 nr6Var = (nr6) this.t;
        nr6Var.n(hr6.a(nr6Var.k(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, 950271));
        return Unit.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ce4 ce4Var = new ce4((List) obj2, rq3Var, 0);
                ce4Var.t = obj;
                return ce4Var;
            case 1:
                return new ce4((qf4) this.t, (rgc) obj2, rq3Var, 1);
            case 2:
                return new ce4((Function2) this.t, (od4) obj2, rq3Var, 2);
            case 3:
                ce4 ce4Var2 = new ce4((qf4) obj2, rq3Var, 3);
                ce4Var2.t = obj;
                return ce4Var2;
            case 4:
                ce4 ce4Var3 = new ce4(this.s, (String) obj2, rq3Var);
                ce4Var3.t = obj;
                return ce4Var3;
            case 5:
                return new ce4((ai4) this.t, (String) obj2, rq3Var, 5);
            case 6:
                return new ce4((ai4) this.t, (ArrayList) obj2, rq3Var, 6);
            case 7:
                return new ce4((j52) this.t, (DeleteAccountActivity) obj2, rq3Var, 7);
            case 8:
                return new ce4((ksa) this.t, this.s, (pj5) obj2, rq3Var);
            case 9:
                return new ce4((mr5) obj2, rq3Var, 9);
            case 10:
                return new ce4((xs5) this.t, (Event) obj2, rq3Var, 10);
            case 11:
                return new ce4((ct5) this.t, (Event) obj2, rq3Var, 11);
            case 12:
                return new ce4((b1d) this.t, (j52) obj2, rq3Var, 12);
            case 13:
                return new ce4((nz5) this.t, (Event) obj2, rq3Var, 13);
            case 14:
                return new ce4((n16) this.t, (Event) obj2, rq3Var, 14);
            case 15:
                return new ce4((u16) this.t, (List) obj2, rq3Var, 15);
            case 16:
                return new ce4((d46) this.t, (Event) obj2, rq3Var, 16);
            case 17:
                return new ce4((b66) this.t, (Event) obj2, rq3Var, 17);
            case 18:
                return new ce4((w66) this.t, (Event) obj2, rq3Var, 18);
            case 19:
                return new ce4((mc6) this.t, (String) obj2, rq3Var, 19);
            case 20:
                return new ce4((lo6) this.t, (j67) obj2, rq3Var, 20);
            case 21:
                ce4 ce4Var4 = new ce4((lo6) obj2, rq3Var, 21);
                ce4Var4.t = obj;
                return ce4Var4;
            case 22:
                return new ce4((hp6) this.t, (Integer) obj2, rq3Var, 22);
            case 23:
                return new ce4((hp6) this.t, (anh) obj2, rq3Var, 23);
            case 24:
                ce4 ce4Var5 = new ce4((cq6) obj2, rq3Var, 24);
                ce4Var5.t = obj;
                return ce4Var5;
            case 25:
                ce4 ce4Var6 = new ce4((nr6) obj2, rq3Var, 25);
                ce4Var6.t = obj;
                return ce4Var6;
            case 26:
                return new ce4((nr6) this.t, (mj7) obj2, rq3Var, 26);
            case 27:
                return new ce4((nr6) this.t, (ho7) obj2, rq3Var, 27);
            case 28:
                return new ce4((nr6) this.t, (String) obj2, rq3Var, 28);
            default:
                return new ce4((wi7) this.t, (qr6) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((ce4) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:428:0x07e7, code lost:
    
        if (r2 == r1) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x07c8, code lost:
    
        if (r2 == r1) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x08e2, code lost:
    
        if (r0.j(r31) != r1) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x087d, code lost:
    
        if (r2 == r1) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0a9d, code lost:
    
        if (r1.t(r2, (com.sofascore.model.mvvm.model.Event) r10, r4, true, r31) == r6) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0ad3, code lost:
    
        if (r1.t(r2, (com.sofascore.model.mvvm.model.Event) r10, null, false, r31) == r6) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0a4c, code lost:
    
        if (r2 == r6) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0b1c, code lost:
    
        if (r0 == r1) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0b07, code lost:
    
        if (r0.j(r31) == r1) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0d06, code lost:
    
        if (r1 == r0) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0cbe, code lost:
    
        if (r1 == r0) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x0cee, code lost:
    
        if (r12.f(r31) == r0) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        if (r1 == r12) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00f8, code lost:
    
        if (r8 == r12) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:480:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0ac6  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        rq3 rq3Var;
        Object P;
        Object f;
        im imVar;
        Object f2;
        Object value;
        Object p;
        TeamSides teamSides;
        Iterable iterable;
        xbb M;
        Object value2;
        Object j;
        Object u;
        Map map;
        List B0;
        Object r;
        Object value3;
        Object s;
        List<EventStatisticsPeriod> list;
        boolean z;
        Object R;
        Object P2;
        w66 w66Var;
        lu3 lu3Var;
        int i;
        w66 w66Var2;
        lu3 lu3Var2;
        Iterator it;
        char c;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z2;
        List list2;
        Iterator it2;
        String str;
        Batsman batsman;
        String str2;
        String str3;
        double doubleValue;
        Object obj5;
        Object P3;
        List<TvChannel> list3;
        Object s2;
        Object T;
        Object u2;
        Object T2;
        FantasyLeague league;
        int i2 = this.r;
        int i3 = 9;
        Object obj6 = this.u;
        Object obj7 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i2) {
            case 0:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    cf4 cf4Var = (cf4) this.t;
                    this.s = 1;
                    if (o02.e.B((List) obj6, cf4Var, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                rgc rgcVar = (rgc) obj6;
                qf4 qf4Var = (qf4) this.t;
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                rq3 rq3Var2 = null;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            y6a.M(obj);
                        } else if (i5 != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    y6a.M(obj);
                    return obj;
                }
                y6a.M(obj);
                adi t = qf4Var.h.t();
                if (!(t instanceof od4)) {
                    if (!(t instanceof wnf) && !(t instanceof t9k)) {
                        if (t instanceof e38) {
                            throw ((e38) t).b;
                        }
                        if (t instanceof mdd) {
                            a70.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        zzl.b();
                        return null;
                    }
                    if (t != rgcVar.c) {
                        throw ((wnf) t).b;
                    }
                    this.s = 2;
                    break;
                } else {
                    Function2 function2 = rgcVar.a;
                    CoroutineContext coroutineContext = rgcVar.d;
                    this.s = 1;
                    e = qf4Var.c().e(new as2(qf4Var, coroutineContext, function2, rq3Var2, 2), this);
                    break;
                }
                return lu3Var4;
                Function2 function22 = rgcVar.a;
                CoroutineContext coroutineContext2 = rgcVar.d;
                this.s = 3;
                e = qf4Var.c().e(new as2(qf4Var, coroutineContext2, function22, rq3Var2, 2), this);
                break;
            case 2:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Function2 function23 = (Function2) this.t;
                Object obj8 = ((od4) obj6).b;
                this.s = 1;
                Object invoke = function23.invoke(obj8, this);
                return invoke == lu3Var5 ? lu3Var5 : invoke;
            case 3:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    rgc rgcVar2 = (rgc) this.t;
                    this.s = 1;
                    if (((qf4) obj6).d(rgcVar2, this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                p0d p0dVar = (p0d) this.t;
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                e5f e5fVar = new e5f((String) obj6);
                Integer num = new Integer(this.s);
                p0dVar.getClass();
                p0dVar.f(e5fVar, num);
                return Unit.a;
            case 5:
                lu3 lu3Var8 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    vyh vyhVar = ((ai4) this.t).e;
                    this.s = 1;
                    vyhVar.getClass();
                    rq3Var = null;
                    P = yaa.P(new uyh(vyhVar, (String) obj6, rq3Var, 0), this);
                    if (P == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P = obj;
                    rq3Var = null;
                }
                LiveCategoriesResponse liveCategoriesResponse = (LiveCategoriesResponse) yaa.x((x2g) P);
                return liveCategoriesResponse != null ? liveCategoriesResponse.getLiveCategories() : rq3Var;
            case 6:
                lu3 lu3Var9 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    ai4 ai4Var = (ai4) this.t;
                    this.s = 1;
                    if (s9a.r(new th4((ArrayList) obj6, ai4Var, (rq3) null), this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) obj6;
                lu3 lu3Var10 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    if (((j52) this.t) instanceof f42) {
                        bfk bfkVar = deleteAccountActivity.K;
                        if (bfkVar == null) {
                            Intrinsics.i("userAccountManager");
                            throw null;
                        }
                        this.s = 1;
                        if (bfkVar.d(this) == lu3Var10) {
                            return lu3Var10;
                        }
                    }
                    return Unit.a;
                }
                if (i10 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                deleteAccountActivity.setResult(-1);
                deleteAccountActivity.finish();
                return Unit.a;
            case 8:
                znh znhVar = ((pj5) obj6).n;
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                if (!((ksa) this.t).j.b() && this.s == znhVar.h()) {
                    znhVar.i(-1);
                }
                return Unit.a;
            case 9:
                mr5 mr5Var = (mr5) obj6;
                bli bliVar = mr5Var.o;
                lu3 lu3Var12 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mr5Var = (mr5) this.t;
                        y6a.M(obj);
                        f = obj;
                        mr5Var.F = (im) f;
                        mr5Var.k();
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                if (mr5Var.F == null) {
                    this.t = mr5Var;
                    this.s = 2;
                    LinkedHashMap linkedHashMap = bli.s;
                    f = bliVar.f(false, s5k.b, this);
                    break;
                }
                return Unit.a;
            case 10:
                Event event = (Event) obj6;
                xs5 xs5Var = (xs5) this.t;
                lu3 lu3Var13 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    imVar = xs5Var.o;
                    if (imVar == null) {
                        bli bliVar2 = xs5Var.n;
                        this.s = 1;
                        LinkedHashMap linkedHashMap2 = bli.s;
                        f2 = bliVar2.f(true, s5k.b, this);
                        break;
                    }
                    xs5Var.o = imVar;
                    String string = xs5Var.m.getString("PR_XAIST", null);
                    if (Intrinsics.c(event.getStatusType(), StatusKt.STATUS_FINISHED)) {
                        if (string != null && string.length() != 0) {
                            if (xs5Var.r) {
                                this.s = 2;
                                break;
                            }
                        } else {
                            fdi fdiVar = xs5Var.e;
                            do {
                                value = fdiVar.getValue();
                            } while (!fdiVar.k(value, new unb(new ms5(imVar, m6k.H(xs5Var.i(), imVar, event.getSportSlug())))));
                        }
                        return Unit.a;
                    }
                    this.s = 3;
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2 || i12 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    f2 = obj;
                }
                imVar = (im) f2;
                if (imVar == null) {
                    imVar = new im(null, null, null, null, null, null, null, PsExtractor.AUDIO_STREAM);
                }
                xs5Var.o = imVar;
                String string2 = xs5Var.m.getString("PR_XAIST", null);
                if (Intrinsics.c(event.getStatusType(), StatusKt.STATUS_FINISHED)) {
                }
                break;
            case 11:
                ct5 ct5Var = (ct5) this.t;
                lu3 lu3Var14 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    p = ct5Var.e.p((Event) obj6, this);
                    if (p == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    p = obj;
                }
                LineupsResponse lineupsResponse = (LineupsResponse) p;
                if (lineupsResponse != null) {
                    if (lineupsResponse.getConfirmed()) {
                        teamSides = null;
                        iterable = yso.M(c5n.z(LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)), c5n.z(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)));
                        M = yso.M(c5n.F(LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)), c5n.F(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)));
                    } else {
                        teamSides = null;
                        iterable = km5.a;
                        M = yso.M(c5n.G(LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null)), c5n.G(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null)));
                    }
                    xbb M2 = yso.M(c5n.H(LineupsResponse.getHomeLineups$default(lineupsResponse, teamSides, 1, teamSides), ct5Var.i()), c5n.H(LineupsResponse.getAwayLineups$default(lineupsResponse, teamSides, 1, teamSides), ct5Var.i()));
                    fdi fdiVar2 = ct5Var.f;
                    do {
                        value2 = fdiVar2.getValue();
                    } while (!fdiVar2.k(value2, new vk1(l6g.W(iterable), l6g.W(M), l6g.W(M2), lineupsResponse.getConfirmed())));
                }
                return Unit.a;
            case 12:
                lu3 lu3Var15 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((b1d) this.t).emit((j52) obj6, this) == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 13:
                nz5 nz5Var = (nz5) this.t;
                lu3 lu3Var16 = lu3.a;
                int i15 = this.s;
                if (i15 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    j = nz5Var.f.j((Event) obj6, this);
                    if (j == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i15 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    j = obj;
                }
                EsportsGamesResponse esportsGamesResponse = (EsportsGamesResponse) j;
                yzc yzcVar = nz5Var.g;
                if (esportsGamesResponse != null) {
                    yzcVar.k(esportsGamesResponse.getGames());
                } else {
                    Object obj9 = (List) yzcVar.d();
                    if (obj9 == null) {
                        obj9 = km5.a;
                    }
                    yzcVar.k(obj9);
                }
                return Unit.a;
            case 14:
                n16 n16Var = (n16) this.t;
                lu3 lu3Var17 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    u = n16Var.e.u((Event) obj6, this);
                    break;
                } else {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u = obj;
                }
                List list4 = (List) u;
                if (list4 != null) {
                    d38 g = i5h.g(new oh0(list4, 1), new au5(9));
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    c38 c38Var = new c38(g);
                    while (c38Var.hasNext()) {
                        Object next = c38Var.next();
                        String periodName = ((HockeyIncident) next).getPeriodName();
                        periodName.getClass();
                        Object obj10 = linkedHashMap3.get(periodName);
                        if (obj10 == null) {
                            obj10 = wv8.n(linkedHashMap3, periodName);
                        }
                        ((List) obj10).add(next);
                    }
                    List r2 = vub.r(linkedHashMap3);
                    if (r2 != null && (B0 = CollectionsKt.B0(r2)) != null) {
                        map = tub.o(B0);
                        if (map != null) {
                            n16Var.f.j(map);
                        }
                        this.s = 2;
                        break;
                    }
                }
                map = null;
                if (map != null) {
                }
                this.s = 2;
                break;
            case 15:
                u16 u16Var = (u16) this.t;
                lu3 lu3Var18 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    r = s9a.r(new rh4((List) obj6, u16Var, (rq3) null, 13), this);
                    if (r == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r = obj;
                }
                ArrayList u3 = mx9.u(u16Var.i(), (List) r, null, null, false, false, false, false, null, 8172);
                fdi fdiVar3 = u16Var.f;
                do {
                    value3 = fdiVar3.getValue();
                } while (!fdiVar3.k(value3, u3));
                return Unit.a;
            case 16:
                d46 d46Var = (d46) this.t;
                lu3 lu3Var19 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    s96 s96Var = d46Var.e;
                    int id = ((Event) obj6).getId();
                    this.s = 1;
                    s = s96Var.s(id, null, this);
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        R = obj;
                        z = true;
                        d46Var.g.j(new b46((Map) R, z, z));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    s = obj;
                }
                EventStatisticsResponse eventStatisticsResponse = (EventStatisticsResponse) s;
                if (eventStatisticsResponse == null || (list = eventStatisticsResponse.getStatistics()) == null) {
                    list = km5.a;
                }
                hs4 hs4Var = z45.a;
                z = true;
                k36 k36Var = new k36(1 == true ? 1 : 0, list, null);
                this.s = 2;
                R = xw3.R(hs4Var, k36Var, this);
                break;
            case 17:
                lu3 lu3Var20 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object p2 = ((b66) this.t).e.p((Event) obj6, this);
                    return p2 == lu3Var20 ? lu3Var20 : p2;
                }
                if (i19 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                Event event2 = (Event) obj6;
                w66 w66Var3 = (w66) this.t;
                lu3 lu3Var21 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    s96 s96Var2 = w66Var3.e;
                    int id2 = event2.getId();
                    this.s = 1;
                    s96Var2.getClass();
                    P2 = yaa.P(new a86(s96Var2, id2, objArr == true ? 1 : 0, 6), this);
                    if (P2 == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                x2g x2gVar = (x2g) P2;
                if (x2gVar instanceof v2g) {
                    List<Inning> innings = ((EventInningsResponse) ((v2g) x2gVar).a).getInnings();
                    ArrayList arrayList = new ArrayList(k13.r(innings, 10));
                    Iterator it3 = innings.iterator();
                    while (it3.hasNext()) {
                        Inning inning = (Inning) it3.next();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        List<Batsman> battingLine = inning.getBattingLine();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj11 : battingLine) {
                            Integer wicketTypeId = ((Batsman) obj11).getWicketTypeId();
                            if (wicketTypeId == null || wicketTypeId.intValue() != i3) {
                                arrayList5.add(obj11);
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            w66Var2 = w66Var3;
                            lu3Var2 = lu3Var21;
                            it = it3;
                        } else {
                            int size = arrayList2.size();
                            arrayList2.add(new x04());
                            Iterator it4 = arrayList5.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    Batsman batsman2 = (Batsman) it4.next();
                                    Player currentBatsman = inning.getCurrentBatsman();
                                    boolean z3 = currentBatsman != null && batsman2.getPlayer().getId() == currentBatsman.getId();
                                    Team battingTeam = inning.getBattingTeam();
                                    Iterator it5 = it3;
                                    Iterator it6 = it4;
                                    arrayList2.add(new lt1(z3, battingTeam != null && Event.getHomeTeam$default(event2, null, 1, null).getId() == battingTeam.getId(), batsman2));
                                    Double fowOver = batsman2.getFowOver();
                                    doubleValue = fowOver != null ? fowOver.doubleValue() : 0.0d;
                                    if (!Double.isNaN(doubleValue) && doubleValue > 0.001d) {
                                        arrayList3.add(batsman2);
                                    }
                                    it3 = it5;
                                    it4 = it6;
                                } else {
                                    it = it3;
                                    int size2 = arrayList2.size() - 1;
                                    Integer extra = inning.getExtra();
                                    int intValue = extra != null ? extra.intValue() : 0;
                                    Integer wide = inning.getWide();
                                    int intValue2 = wide != null ? wide.intValue() : 0;
                                    Integer noBall = inning.getNoBall();
                                    int intValue3 = noBall != null ? noBall.intValue() : 0;
                                    Integer bye = inning.getBye();
                                    int intValue4 = bye != null ? bye.intValue() : 0;
                                    Integer legBye = inning.getLegBye();
                                    int intValue5 = legBye != null ? legBye.intValue() : 0;
                                    Integer penalty = inning.getPenalty();
                                    arrayList2.add(new it1(intValue, intValue2, intValue3, intValue4, intValue5, penalty != null ? penalty.intValue() : 0));
                                    Integer score = inning.getScore();
                                    int intValue6 = score != null ? score.intValue() : 0;
                                    Integer wickets = inning.getWickets();
                                    int intValue7 = wickets != null ? wickets.intValue() : 0;
                                    Double overs = inning.getOvers();
                                    doubleValue = overs != null ? overs.doubleValue() : 0.0d;
                                    w66Var2 = w66Var3;
                                    lu3Var2 = lu3Var21;
                                    arrayList2.add(new pt1(intValue6, intValue7, doubleValue));
                                    arrayList4.add(new qtg(new x04(), size, size2));
                                    ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            obj5 = listIterator.previous();
                                            if (obj5 instanceof zi5) {
                                            }
                                        } else {
                                            obj5 = null;
                                        }
                                    }
                                    zi5 zi5Var = obj5 instanceof zi5 ? (zi5) obj5 : null;
                                    if (zi5Var != null) {
                                        zi5Var.d();
                                    }
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            List<Batsman> battingLine2 = inning.getBattingLine();
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj12 : battingLine2) {
                                Integer wicketTypeId2 = ((Batsman) obj12).getWicketTypeId();
                                if (wicketTypeId2 != null && wicketTypeId2.intValue() == 9) {
                                    arrayList6.add(obj12);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                ArrayList arrayList7 = new ArrayList(k13.r(arrayList6, 10));
                                Iterator it7 = arrayList6.iterator();
                                while (it7.hasNext()) {
                                    arrayList7.add(((Batsman) it7.next()).getPlayerName());
                                }
                                arrayList2.add(new vej(new q9k(R.string.cricket_did_not_bat), CollectionsKt.f0(arrayList7, ", ", null, null, null, 62)));
                            }
                            List H0 = CollectionsKt.H0(arrayList3, new y73(29));
                            Iterator it8 = H0.iterator();
                            String str4 = "";
                            String str5 = "";
                            int i21 = 0;
                            while (it8.hasNext()) {
                                Object next2 = it8.next();
                                int i22 = i21 + 1;
                                if (i21 < 0) {
                                    b.q();
                                    throw null;
                                }
                                Batsman batsman3 = (Batsman) next2;
                                Integer fowScore = batsman3.getFowScore();
                                if (fowScore != null) {
                                    int intValue8 = fowScore.intValue();
                                    list2 = H0;
                                    Locale d = dla.d();
                                    it2 = it8;
                                    str = str4;
                                    String string3 = w66Var2.i().getString(R.string.fow_format_score);
                                    string3.getClass();
                                    Integer valueOf = Integer.valueOf(intValue8);
                                    batsman = batsman3;
                                    str2 = String.format(d, string3, Arrays.copyOf(new Object[]{valueOf, Integer.valueOf(i22)}, 2));
                                } else {
                                    list2 = H0;
                                    it2 = it8;
                                    str = str4;
                                    batsman = batsman3;
                                    str2 = null;
                                }
                                Double fowOver2 = batsman.getFowOver();
                                if (fowOver2 == null || (str3 = String.valueOf(fowOver2.doubleValue())) == null) {
                                    str3 = "-";
                                }
                                Context i23 = w66Var2.i();
                                if (str2 == null) {
                                    str2 = str;
                                }
                                String playerName = batsman.getPlayerName();
                                if (playerName == null) {
                                    playerName = tba.t(batsman.getPlayer());
                                }
                                String str6 = ((Object) str5) + i23.getString(R.string.fow_format_full, str2, playerName, str3);
                                if (i21 < list2.size() - 1) {
                                    str6 = ((Object) str6) + ", ";
                                }
                                str5 = str6;
                                i21 = i22;
                                H0 = list2;
                                it8 = it2;
                                str4 = str;
                            }
                            arrayList2.add(new vej(new q9k(R.string.cricket_fall_of_wickets_colon), str5));
                        }
                        if (!inning.getBowlingLine().isEmpty()) {
                            int size3 = arrayList2.size();
                            arrayList2.add(new y04());
                            Iterator it9 = inning.getBowlingLine().iterator();
                            while (it9.hasNext()) {
                                Bowler bowler = (Bowler) it9.next();
                                Player currentBowler = inning.getCurrentBowler();
                                boolean z4 = currentBowler != null && bowler.getPlayer().getId() == currentBowler.getId();
                                Team bowlingTeam = inning.getBowlingTeam();
                                Iterator it10 = it9;
                                if (bowlingTeam != null && Event.getHomeTeam$default(event2, null, 1, null).getId() == bowlingTeam.getId()) {
                                    z2 = true;
                                    arrayList2.add(new y02(z4, z2, bowler));
                                    it9 = it10;
                                }
                                z2 = false;
                                arrayList2.add(new y02(z4, z2, bowler));
                                it9 = it10;
                            }
                            arrayList4.add(new qtg(new y04(), size3, arrayList2.size() - 1));
                            ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                            while (true) {
                                if (listIterator2.hasPrevious()) {
                                    obj4 = listIterator2.previous();
                                    if (obj4 instanceof zi5) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            zi5 zi5Var2 = obj4 instanceof zi5 ? (zi5) obj4 : null;
                            if (zi5Var2 != null) {
                                zi5Var2.d();
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            c = '\n';
                        } else {
                            int size4 = arrayList2.size();
                            arrayList2.add(new z04());
                            List H02 = CollectionsKt.H0(arrayList3, new v66(0));
                            c = '\n';
                            ArrayList arrayList8 = new ArrayList(k13.r(H02, 10));
                            int i24 = 0;
                            for (Object obj13 : H02) {
                                int i25 = i24 + 1;
                                if (i24 < 0) {
                                    b.q();
                                    throw null;
                                }
                                arrayList8.add(new c6l(i25, (Batsman) obj13));
                                i24 = i25;
                            }
                            arrayList2.addAll(arrayList8);
                            arrayList4.add(new qtg(new z04(), size4, arrayList2.size() - 1));
                            ListIterator listIterator3 = arrayList2.listIterator(arrayList2.size());
                            while (true) {
                                if (listIterator3.hasPrevious()) {
                                    obj3 = listIterator3.previous();
                                    if (obj3 instanceof zi5) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            zi5 zi5Var3 = obj3 instanceof zi5 ? (zi5) obj3 : null;
                            if (zi5Var3 != null) {
                                zi5Var3.d();
                            }
                        }
                        if (!inning.getPartnerships().isEmpty()) {
                            int size5 = arrayList2.size();
                            arrayList2.add(new b14());
                            int i26 = 0;
                            for (Object obj14 : inning.getPartnerships()) {
                                int i27 = i26 + 1;
                                if (i26 < 0) {
                                    b.q();
                                    throw null;
                                }
                                arrayList2.add(new fae(i27, (Partnership) obj14));
                                i26 = i27;
                            }
                            arrayList4.add(new qtg(new b14(), size5, arrayList2.size() - 1));
                            ListIterator listIterator4 = arrayList2.listIterator(arrayList2.size());
                            while (true) {
                                if (listIterator4.hasPrevious()) {
                                    obj2 = listIterator4.previous();
                                    if (obj2 instanceof zi5) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            zi5 zi5Var4 = obj2 instanceof zi5 ? (zi5) obj2 : null;
                            if (zi5Var4 != null) {
                                zi5Var4.d();
                            }
                        }
                        arrayList.add(new q16(inning, arrayList2, arrayList4));
                        w66Var3 = w66Var2;
                        lu3Var21 = lu3Var2;
                        i3 = 9;
                        it3 = it;
                    }
                    w66Var = w66Var3;
                    lu3Var = lu3Var21;
                    w66Var.f.j(arrayList);
                    i = 2;
                } else {
                    w66Var = w66Var3;
                    lu3Var = lu3Var21;
                    i = 2;
                }
                this.s = i;
                if (w66Var.j(this) == lu3Var) {
                    return lu3Var;
                }
                return Unit.a;
            case 19:
                mc6 mc6Var = (mc6) this.t;
                lu3 lu3Var22 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    z3k z3kVar = mc6Var.e;
                    this.s = 1;
                    z3kVar.getClass();
                    P3 = yaa.P(new fzh(z3kVar, (String) obj6, objArr2 == true ? 1 : 0, i3), this);
                    if (P3 == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P3 = obj;
                }
                yzc yzcVar2 = mc6Var.f;
                TvChannelsResponse tvChannelsResponse = (TvChannelsResponse) yaa.x((x2g) P3);
                if (tvChannelsResponse == null || (list3 = tvChannelsResponse.getChannels()) == null) {
                    list3 = km5.a;
                }
                yzcVar2.j(list3);
                return Unit.a;
            case 20:
                lo6 lo6Var = (lo6) this.t;
                j67 j67Var = (j67) obj6;
                lu3 lu3Var23 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = lo6Var.e;
                    int i30 = j67Var.a;
                    this.s = 1;
                    s2 = wi7Var.s(i30, this);
                    if (s2 == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    s2 = obj;
                }
                Long l = (Long) s2;
                long longValue = l != null ? l.longValue() : 0L;
                SharedPreferences sharedPreferences = lo6Var.f;
                int i31 = j67Var.a;
                StringBuilder sb = new StringBuilder("preferenceFantasyMessage");
                sb.append(i31);
                return new s37(j67Var, sharedPreferences.getLong(sb.toString(), 0L) < longValue);
            case 21:
                lo6 lo6Var2 = (lo6) obj6;
                e1d e1dVar = lo6Var2.i;
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var24 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var2 = lo6Var2.e;
                    int i33 = lo6Var2.g.c;
                    String str7 = lo6Var2.h;
                    this.t = ku3Var;
                    this.s = 1;
                    T = wi7Var2.T(i33, str7, this);
                    break;
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        u2 = obj;
                        Pair Q = rz8.Q((List) u2, lo6Var2.i(), new yn6(9));
                        List list5 = (List) Q.a;
                        List list6 = (List) Q.b;
                        ko6 ko6Var = (ko6) ((eoh) e1dVar).getValue();
                        gv9 W = l6g.W(list6);
                        gv9 W2 = l6g.W(list5);
                        ko6Var.getClass();
                        W.getClass();
                        W2.getClass();
                        ((eoh) e1dVar).setValue(new ko6(W, W2, false));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    T = obj;
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it11 = ((Iterable) T).iterator();
                while (it11.hasNext()) {
                    FantasyLeague league2 = ((FantasyUserLeague) it11.next()).getLeague();
                    j67 w = league2 != null ? iz8.w(league2) : null;
                    if (w != null) {
                        arrayList9.add(w);
                    }
                }
                ArrayList arrayList10 = new ArrayList(k13.r(arrayList9, 10));
                Iterator it12 = arrayList9.iterator();
                while (it12.hasNext()) {
                    arrayList10.add(xw3.t(ku3Var, null, new ce4((Object) lo6Var2, it12.next(), (rq3) (objArr3 == true ? 1 : 0), 20), 3));
                }
                this.t = null;
                this.s = 2;
                u2 = m6k.u(arrayList10, this);
                break;
            case 22:
                return e(obj);
            case 23:
                lu3 lu3Var25 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((hp6) this.t).t.q(this, (anh) obj6) == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 24:
                return f(obj);
            case 25:
                return g(obj);
            case 26:
                return h(obj);
            case 27:
                return j(obj);
            case 28:
                return k(obj);
            default:
                qr6 qr6Var = (qr6) obj6;
                ev6 ev6Var = qr6Var.k;
                lu3 lu3Var26 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var3 = (wi7) this.t;
                    int i36 = ev6Var.c;
                    String str8 = qr6Var.f;
                    this.s = 1;
                    T2 = wi7Var3.T(i36, str8, this);
                    if (T2 == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    T2 = obj;
                }
                Iterator it13 = ((Iterable) T2).iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next3 = it13.next();
                        FantasyLeague league3 = ((FantasyUserLeague) next3).getLeague();
                        if ((league3 != null ? league3.getType() : null) == FantasyLeagueType.GLOBAL) {
                            obj7 = next3;
                        }
                    }
                }
                FantasyUserLeague fantasyUserLeague = (FantasyUserLeague) obj7;
                if (fantasyUserLeague == null || (league = fantasyUserLeague.getLeague()) == null) {
                    return Unit.a;
                }
                qr6Var.m(ev6Var, iz8.w(league));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce4(int i, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 4;
        this.u = str;
        this.s = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce4(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce4(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }
}
