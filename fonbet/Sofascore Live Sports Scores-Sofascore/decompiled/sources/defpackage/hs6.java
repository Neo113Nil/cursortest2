package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import com.sofascore.model.fantasy.FantasyLeagueType;
import com.sofascore.model.fantasy.FantasyPlayerPostModel;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.fantasy.FantasySquadResponse;
import com.sofascore.model.fantasy.FantasyTeamOfTheRoundResponse;
import com.sofascore.model.fantasy.FantasyTopPlayerRoundWrapper;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserLeague;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.EventResponse;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hs6 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs6(d50 d50Var, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = d50Var;
        this.t = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e1, code lost:
    
        if (r2.emit(defpackage.dl7.a, r20) == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x012c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012a, code lost:
    
        if (r2.emit(r5, r20) == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        if (r2 == r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        Object value;
        Object e0;
        Object value2;
        ml7 ml7Var = (ml7) this.u;
        ku3 ku3Var = (ku3) this.t;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            fdi fdiVar = ml7Var.m;
            do {
                value = fdiVar.getValue();
            } while (!fdiVar.k(value, ll7.a((ll7) value, null, null, null, false, false, false, true, 255)));
            gv9<FantasyRoundPlayerUiModel> gv9Var = ((ll7) ml7Var.m.getValue()).c;
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel : gv9Var) {
                arrayList.add(new FantasyPlayerPostModel(fantasyRoundPlayerUiModel.a, fantasyRoundPlayerUiModel.d, fantasyRoundPlayerUiModel.k, fantasyRoundPlayerUiModel.m));
            }
            av4 t = xw3.t(ku3Var, null, new hs6(ml7Var, arrayList, rq3Var, 26), 3);
            wd5 wd5Var = xd5.b;
            long R = wkn.R(400, be5.MILLISECONDS);
            this.t = null;
            this.s = 1;
            e0 = z8e.e0(t, R, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                fdi fdiVar2 = ml7Var.m;
                do {
                    value2 = fdiVar2.getValue();
                } while (!fdiVar2.k(value2, ll7.a((ll7) value2, null, null, null, false, false, false, false, 255)));
                return Unit.a;
            }
            y6a.M(obj);
            e0 = obj;
        }
        x2g x2gVar = (x2g) e0;
        if (x2gVar instanceof t2g) {
            ia0 ia0Var = ia0.q;
            if (ok3.p().e().getDevMod()) {
                Calendar calendar = ke0.a;
                Application application = ml7Var.b;
                application.getClass();
                ke0.g(application, "Substitutions: ".concat(yaa.z(((t2g) x2gVar).a)), 0);
            }
            aeh aehVar = ml7Var.o;
            this.t = null;
            this.s = 2;
        } else {
            if (!(x2gVar instanceof v2g)) {
                zzl.b();
                return null;
            }
            List<FantasyRoundPlayer> players = ((FantasySquadResponse) ((v2g) x2gVar).a).getSquad().getPlayers();
            ArrayList arrayList2 = new ArrayList(k13.r(players, 10));
            Iterator<T> it = players.iterator();
            while (it.hasNext()) {
                arrayList2.add(hkg.g0((FantasyRoundPlayer) it.next(), ml7Var.i()));
            }
            aeh aehVar2 = ml7Var.o;
            el7 el7Var = new el7(arrayList2);
            this.t = null;
            this.s = 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (r2.emit(defpackage.cn7.a, r25) == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x011a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
    
        if (r2.emit(r4, r25) == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        if (r4 == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003c, code lost:
    
        if (r2.emit(defpackage.dn7.a, r25) == r3) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(Object obj) {
        Object P;
        Object value;
        ao7 ao7Var = (ao7) this.t;
        aeh aehVar = ao7Var.p;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            this.s = 1;
        } else if (i == 1) {
            y6a.M(obj);
        } else {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            P = obj;
            x2g x2gVar = (x2g) P;
            if (x2gVar instanceof t2g) {
                ia0 ia0Var = ia0.q;
                if (ok3.p().e().getDevMod()) {
                    Calendar calendar = ke0.a;
                    Application application = ao7Var.b;
                    application.getClass();
                    ke0.g(application, "Transfers: ".concat(yaa.z(((t2g) x2gVar).a)), 0);
                }
                this.s = 3;
            } else {
                if (!(x2gVar instanceof v2g)) {
                    zzl.b();
                    return null;
                }
                List<FantasyRoundPlayer> players = ((FantasySquadResponse) ((v2g) x2gVar).a).getSquad().getPlayers();
                ArrayList arrayList = new ArrayList(k13.r(players, 10));
                Iterator<T> it = players.iterator();
                while (it.hasNext()) {
                    arrayList.add(hkg.g0((FantasyRoundPlayer) it.next(), ao7Var.i()));
                }
                gv9 W = l6g.W(arrayList);
                fdi fdiVar = ao7Var.n;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, vn7.a((vn7) value, null, W, 0.0d, 0, null, null, false, false, false, false, 0, 0, null, null, 15869)));
                bn7 bn7Var = new bn7(W, ao7Var.u());
                this.s = 4;
            }
        }
        wi7 wi7Var = ao7Var.e;
        int i2 = ao7Var.f.a.j;
        ArrayList arrayList2 = (ArrayList) this.u;
        Boolean bool = ao7Var.v;
        Boolean bool2 = ao7Var.u;
        this.s = 2;
        wi7Var.getClass();
        P = yaa.P(new fg7(wi7Var, i2, arrayList2, bool, bool2, (rq3) null, 1), this);
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new hs6((is6) obj2, rq3Var, 0);
            case 1:
                return new hs6((pu6) this.t, (gt6) obj2, rq3Var, 1);
            case 2:
                hs6 hs6Var = new hs6((pu6) obj2, rq3Var, 2);
                hs6Var.t = obj;
                return hs6Var;
            case 3:
                return new hs6((pu6) this.t, (ArrayList) obj2, rq3Var, 3);
            case 4:
                return new hs6((pu6) this.t, (ho7) obj2, rq3Var, 4);
            case 5:
                return new hs6((jz6) this.t, (ev6) obj2, rq3Var, 5);
            case 6:
                return new hs6((jz6) this.t, (FantasyPlayerFixtureUiModel) obj2, rq3Var, 6);
            case 7:
                return new hs6((j07) this.t, (p17) obj2, rq3Var, 7);
            case 8:
                return new hs6((p07) obj2, rq3Var, 8);
            case 9:
                return new hs6((k17) obj2, rq3Var, 9);
            case 10:
                return new hs6((Context) this.t, (b27) obj2, rq3Var, 10);
            case 11:
                return new hs6((d50) obj2, (String) this.t, rq3Var, 11);
            case 12:
                hs6 hs6Var2 = new hs6((n27) obj2, rq3Var, 12);
                hs6Var2.t = obj;
                return hs6Var2;
            case 13:
                hs6 hs6Var3 = new hs6((d47) obj2, rq3Var, 13);
                hs6Var3.t = obj;
                return hs6Var3;
            case 14:
                hs6 hs6Var4 = new hs6((r57) obj2, rq3Var, 14);
                hs6Var4.t = obj;
                return hs6Var4;
            case 15:
                return new hs6((d50) obj2, (String) this.t, rq3Var, 15);
            case 16:
                hs6 hs6Var5 = new hs6((r77) obj2, rq3Var, 16);
                hs6Var5.t = obj;
                return hs6Var5;
            case 17:
                return new hs6((d50) obj2, (String) this.t, rq3Var, 17);
            case 18:
                hs6 hs6Var6 = new hs6((ia7) obj2, rq3Var, 18);
                hs6Var6.t = obj;
                return hs6Var6;
            case 19:
                return new hs6((d50) obj2, (String) this.t, rq3Var, 19);
            case 20:
                return new hs6((wb7) this.t, (do7) obj2, rq3Var, 20);
            case 21:
                return new hs6((ksa) this.t, (e1d) obj2, rq3Var, 21);
            case 22:
                return new hs6((yc7) this.t, (kc7) obj2, rq3Var, 22);
            case 23:
                return new hs6((te7) this.t, (kj7) obj2, rq3Var, 23);
            case 24:
                return new hs6((ksa) this.t, (cdi) obj2, rq3Var, 24);
            case 25:
                return new hs6((ll7) this.t, (ksa) obj2, rq3Var, 25);
            case 26:
                return new hs6((ml7) this.t, (ArrayList) obj2, rq3Var, 26);
            case 27:
                hs6 hs6Var7 = new hs6((ml7) obj2, rq3Var, 27);
                hs6Var7.t = obj;
                return hs6Var7;
            case 28:
                return new hs6((ao7) this.t, (ArrayList) obj2, rq3Var, 28);
            default:
                return new hs6((vp7) this.t, (ArrayList) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((hs6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x032f, code lost:
    
        if (r2.emit(r4, r40) == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x031e, code lost:
    
        if (r2 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0392, code lost:
    
        if (r2.emit(r4, r40) == r1) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0381, code lost:
    
        if (r2 == r1) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04cf, code lost:
    
        if (r1.q(r40, defpackage.l57.a) == r2) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04b8, code lost:
    
        if (r1 == r2) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0571, code lost:
    
        if (r1.q(r40, defpackage.w37.a) == r2) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0542, code lost:
    
        if (r1 == r2) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x05dc, code lost:
    
        if (r1.emit(r2, r40) == r5) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x05c6, code lost:
    
        if (r4 == r5) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0654, code lost:
    
        if (r1.emit(r4, r40) == r2) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0640, code lost:
    
        if (r3 == r2) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x070b, code lost:
    
        if (r0 == r6) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x06e6, code lost:
    
        if (r7 == r6) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x08b8, code lost:
    
        if (r0 == r4) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x07f0, code lost:
    
        if (r5 == r4) goto L342;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0879  */
    /* JADX WARN: Type inference failed for: r13v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r13v22 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String e;
        Object T;
        int i;
        Object d;
        Event event;
        Object K;
        kj7 kj7Var;
        Object P;
        Object obj2;
        Object g;
        FantasyRound fantasyRound;
        Object J;
        Object value;
        Object B;
        Object value2;
        Object value3;
        Object e0;
        Object value4;
        Object e02;
        Object e03;
        Object e04;
        Object B2;
        Object value5;
        ha7 ha7Var;
        Object value6;
        Object e05;
        fdi fdiVar;
        Object value7;
        Object Q;
        Object P2;
        int i2;
        int i3 = this.r;
        int i4 = 23;
        ca7 ca7Var = ca7.a;
        int i5 = 2;
        Object obj3 = this.u;
        int i6 = 1;
        ol7 ol7Var = 0;
        switch (i3) {
            case 0:
                is6 is6Var = (is6) obj3;
                lu3 lu3Var = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    ia0 ia0Var = ia0.q;
                    e = fc6.e();
                    wi7 wi7Var = is6Var.e;
                    int i8 = is6Var.m().c.c;
                    this.t = e;
                    this.s = 1;
                    T = wi7Var.T(i8, e, this);
                    if (T == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = (String) this.t;
                    y6a.M(obj);
                    e = str;
                    T = obj;
                }
                List list = (List) T;
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(c6o.Q((FantasyUserLeague) it.next(), e));
                }
                Pair Q2 = rz8.Q(arrayList, is6Var.i(), new yn6(29));
                List list2 = (List) Q2.a;
                List list3 = (List) Q2.b;
                gs6 l = is6Var.l();
                do7 m = is6Var.m();
                gv9 W = l6g.W(list3);
                gv9 W2 = l6g.W(list2);
                if (arrayList.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it2 = arrayList.iterator();
                    int i9 = 0;
                    while (it2.hasNext()) {
                        if (((fo7) it2.next()).c && (i9 = i9 + 1) < 0) {
                            b.p();
                            throw null;
                        }
                    }
                    i = i9;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        j67 j67Var = ((fo7) it3.next()).a;
                        if ((j67Var != null ? j67Var.j : null) == FantasyLeagueType.RANDOM && (r9 = r9 + 1) < 0) {
                            b.p();
                            throw null;
                        }
                    }
                }
                int i10 = r9;
                l.getClass();
                W2.getClass();
                W.getClass();
                ((eoh) is6Var.g).setValue(new gs6(false, m, W2, W, i, i10));
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((pu6) this.t).m.q(this, (gt6) obj3) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                pu6 pu6Var = (pu6) obj3;
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var3 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    pu6Var.x(hu6.a(pu6Var.l(), null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, true, null, null, null, null, null, 16515071));
                    List j = b.j(xw3.L(ku3Var, null, null, new u41(i5, ol7Var, i5), 3), xw3.L(ku3Var, null, null, new iu6(pu6Var, ol7Var, i6), 3));
                    this.t = null;
                    this.s = 1;
                    if (m6k.V(j, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pu6Var.x(hu6.a(pu6Var.l(), null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, false, false, null, null, null, null, null, 16515071));
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    g62 g62Var = ((pu6) this.t).m;
                    ht6 ht6Var = new ht6((ArrayList) obj3);
                    this.s = 1;
                    if (g62Var.q(this, ht6Var) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                pu6 pu6Var2 = (pu6) this.t;
                wi7 wi7Var2 = pu6Var2.f;
                String str2 = pu6Var2.i;
                int i15 = ((ho7) obj3).a.a;
                this.s = 1;
                Object W3 = wi7Var2.W(i15, str2, this);
                return W3 == lu3Var5 ? lu3Var5 : W3;
            case 5:
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
                wi7 wi7Var3 = ((jz6) this.t).e;
                Integer num = ((ev6) obj3).B;
                r9 = num != null ? num.intValue() : 0;
                this.s = 1;
                Object t = wi7Var3.t(r9, this);
                return t == lu3Var6 ? lu3Var6 : t;
            case 6:
                jz6 jz6Var = (jz6) this.t;
                lu3 lu3Var7 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    s96 s96Var = jz6Var.f;
                    int i18 = ((FantasyPlayerFixtureUiModel) obj3).a;
                    this.s = 1;
                    d = s96Var.d(i18, this);
                    if (d == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    d = obj;
                }
                EventResponse eventResponse = (EventResponse) yaa.x((x2g) d);
                if (eventResponse == null || (event = eventResponse.getEvent()) == null) {
                    return null;
                }
                return gz8.R(jz6Var.i(), event, false);
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((j07) this.t).g.q(this, (p17) obj3) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                p07 p07Var = (p07) obj3;
                int i20 = p07Var.g;
                e1d e1dVar = p07Var.j;
                lu3 lu3Var9 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var4 = p07Var.e;
                    this.s = 1;
                    K = wi7Var4.K(i20, this);
                    break;
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kj7 kj7Var2 = (kj7) this.t;
                        y6a.M(obj);
                        kj7Var = kj7Var2;
                        P = obj;
                        ((eoh) e1dVar).setValue(o07.a((o07) ((eoh) e1dVar).getValue(), kj7Var, l6g.W((List) P), 8));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    K = obj;
                }
                List list4 = (List) K;
                if (list4 != null) {
                    Iterator it4 = list4.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            if (((FantasyTopPlayerRoundWrapper) obj2).getRound().getId() == p07Var.i) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    FantasyTopPlayerRoundWrapper fantasyTopPlayerRoundWrapper = (FantasyTopPlayerRoundWrapper) obj2;
                    if (fantasyTopPlayerRoundWrapper != null) {
                        kj7Var = new kj7(FantasyRoundPlayerUiModel.b(hkg.g0(fantasyTopPlayerRoundWrapper.getPlayer(), p07Var.i()), null, 0, false, false, false, null, null, 534773759), fantasyTopPlayerRoundWrapper.getRound().getId(), f5p.C(p07Var.i(), fantasyTopPlayerRoundWrapper.getRound().getSequence(), fantasyTopPlayerRoundWrapper.getRound().getName()));
                        if (kj7Var == null) {
                            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = kj7Var.a;
                            tj7 tj7Var = p07Var.f;
                            Application application = p07Var.b;
                            application.getClass();
                            Set keySet = fantasyRoundPlayerUiModel.y.keySet();
                            Integer num2 = new Integer(fantasyRoundPlayerUiModel.g.b);
                            Integer num3 = new Integer(i20);
                            String str3 = fantasyRoundPlayerUiModel.b.b;
                            Map map = fantasyRoundPlayerUiModel.y;
                            this.t = kj7Var;
                            this.s = 2;
                            tj7Var.getClass();
                            P = tz9.P(new qj7(keySet, tj7Var, num2, num3, map, application, null, str3, true, null), this);
                            break;
                        } else {
                            ((eoh) e1dVar).setValue(o07.a((o07) ((eoh) e1dVar).getValue(), null, null, 11));
                            return Unit.a;
                        }
                    }
                }
                kj7Var = null;
                if (kj7Var == null) {
                }
            case 9:
                k17 k17Var = (k17) obj3;
                int i22 = k17Var.f;
                wi7 wi7Var5 = k17Var.e;
                e1d e1dVar2 = k17Var.g;
                lu3 lu3Var10 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    g = wi7Var5.g(i22, this);
                    break;
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        FantasyRound fantasyRound2 = (FantasyRound) this.t;
                        y6a.M(obj);
                        fantasyRound = fantasyRound2;
                        J = obj;
                        FantasyTeamOfTheRoundResponse fantasyTeamOfTheRoundResponse = (FantasyTeamOfTheRoundResponse) J;
                        if (fantasyTeamOfTheRoundResponse != null) {
                            int score = fantasyTeamOfTheRoundResponse.getScore();
                            List<FantasyRoundPlayer> players = fantasyTeamOfTheRoundResponse.getPlayers();
                            ArrayList arrayList2 = new ArrayList(k13.r(players, 10));
                            Iterator<T> it5 = players.iterator();
                            while (it5.hasNext()) {
                                arrayList2.add(hkg.g0((FantasyRoundPlayer) it5.next(), k17Var.i()));
                            }
                            ol7Var = new ol7(new fo1(fantasyRound.getId(), fantasyRound.getSequence(), fantasyRound.getName(), fantasyRound.getDeadlineTimestamp()), score, l6g.W(arrayList2), new pl7(fantasyTeamOfTheRoundResponse.getMaxScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse.getMaxScoreTeam().getScore(), fantasyTeamOfTheRoundResponse.getMaxScoreTeam().getNameCode()), new pl7(fantasyTeamOfTheRoundResponse.getMinScoreTeam().getTeamId(), fantasyTeamOfTheRoundResponse.getMinScoreTeam().getScore(), fantasyTeamOfTheRoundResponse.getMinScoreTeam().getNameCode()));
                        }
                        ((eoh) e1dVar2).setValue(j17.a((j17) ((eoh) e1dVar2).getValue(), ol7Var, fantasyRound.getAverageScore(), fantasyRound.getHighScore(), 16));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    g = obj;
                }
                fantasyRound = (FantasyRound) g;
                if (fantasyRound != null) {
                    this.t = fantasyRound;
                    this.s = 2;
                    J = wi7Var5.J(i22, this);
                    break;
                } else {
                    ((eoh) e1dVar2).setValue(j17.a((j17) ((eoh) e1dVar2).getValue(), null, null, null, 23));
                    return Unit.a;
                }
            case 10:
                Context context = (Context) this.t;
                Object obj4 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    nv.A(context, "share", "download");
                    Bitmap bitmap = ((y17) ((b27) obj3)).a;
                    this.s = 1;
                    hs4 hs4Var = z45.a;
                    Object R = xw3.R(hq4.c, new rch(context, bitmap, ol7Var, i6), this);
                    Object obj5 = R;
                    if (R != obj4) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Calendar calendar = ke0.a;
                ke0.f(R.string.save_image_confirmation, context);
                return Unit.a;
            case 11:
                n27 n27Var = (n27) obj3;
                lu3 lu3Var11 = lu3.a;
                int i25 = this.s;
                int i26 = 12;
                if (i25 == 0) {
                    y6a.M(obj);
                    fdi fdiVar2 = n27Var.f;
                    do {
                        value = fdiVar2.getValue();
                    } while (!fdiVar2.k(value, j47.a((j47) value, true, false, false, 12)));
                    wd5 wd5Var = xd5.b;
                    long R2 = wkn.R(400, be5.MILLISECONDS);
                    cl clVar = new cl(n27Var, (String) this.t, ol7Var, i26);
                    this.s = 1;
                    B = z8e.B(R2, clVar, this);
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    B = obj;
                }
                fo7 fo7Var = (fo7) B;
                if (fo7Var != null) {
                    aeh aehVar = n27Var.h;
                    i47 i47Var = new i47(fo7Var);
                    this.s = 2;
                    break;
                } else {
                    fdi fdiVar3 = n27Var.f;
                    do {
                        value2 = fdiVar3.getValue();
                    } while (!fdiVar3.k(value2, j47.a((j47) value2, false, true, false, 12)));
                }
                return Unit.a;
            case 12:
                n27 n27Var2 = (n27) obj3;
                fdi fdiVar4 = n27Var2.f;
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var12 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    do {
                        value3 = fdiVar4.getValue();
                    } while (!fdiVar4.k(value3, j47.a((j47) value3, false, false, true, 11)));
                    av4 t2 = xw3.t(ku3Var2, null, new d17(n27Var2, ol7Var, i6), 3);
                    wd5 wd5Var2 = xd5.b;
                    long R3 = wkn.R(500, be5.MILLISECONDS);
                    this.t = null;
                    this.s = 1;
                    e0 = z8e.e0(t2, R3, this);
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e0 = obj;
                }
                fo7 fo7Var2 = (fo7) e0;
                if (fo7Var2 != null) {
                    aeh aehVar2 = n27Var2.h;
                    i47 i47Var2 = new i47(fo7Var2);
                    this.t = null;
                    this.s = 2;
                    break;
                } else {
                    do {
                        value4 = fdiVar4.getValue();
                    } while (!fdiVar4.k(value4, j47.a((j47) value4, false, false, false, 11)));
                }
                return Unit.a;
            case 13:
                d47 d47Var = (d47) obj3;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var13 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    ((eoh) d47Var.h).setValue(new c47(((c47) ((eoh) d47Var.h).getValue()).a, true));
                    av4 t3 = xw3.t(ku3Var3, null, new d17(d47Var, ol7Var, i5), 3);
                    wd5 wd5Var3 = xd5.b;
                    long R4 = wkn.R(500, be5.MILLISECONDS);
                    this.t = null;
                    this.s = 1;
                    e02 = z8e.e0(t3, R4, this);
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e02 = obj;
                }
                boolean booleanValue = ((Boolean) e02).booleanValue();
                ((eoh) d47Var.h).setValue(new c47(((c47) ((eoh) d47Var.h).getValue()).a, false));
                if (booleanValue) {
                    g62 g62Var2 = d47Var.i;
                    this.t = null;
                    this.s = 2;
                    break;
                }
                return Unit.a;
            case 14:
                r57 r57Var = (r57) obj3;
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var14 = lu3.a;
                int i29 = this.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    ((q57) ((eoh) r57Var.e).getValue()).getClass();
                    ((eoh) r57Var.e).setValue(new q57(true));
                    av4 t4 = xw3.t(ku3Var4, null, new d17(r57Var, ol7Var, 4), 3);
                    wd5 wd5Var4 = xd5.b;
                    long R5 = wkn.R(500, be5.MILLISECONDS);
                    this.t = null;
                    this.s = 1;
                    e03 = z8e.e0(t4, R5, this);
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        ((q57) ((eoh) r57Var.e).getValue()).getClass();
                        ((eoh) r57Var.e).setValue(new q57(false));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    e03 = obj;
                }
                if (((Boolean) e03).booleanValue()) {
                    g62 g62Var3 = r57Var.f;
                    this.t = null;
                    this.s = 2;
                    break;
                }
                ((q57) ((eoh) r57Var.e).getValue()).getClass();
                ((eoh) r57Var.e).setValue(new q57(false));
                return Unit.a;
            case 15:
                lu3 lu3Var15 = lu3.a;
                int i30 = this.s;
                if (i30 != 0) {
                    if (i30 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                r77 r77Var = (r77) obj3;
                wi7 wi7Var6 = r77Var.l;
                int i31 = r77Var.n.a;
                String str4 = (String) this.t;
                this.s = 1;
                wi7Var6.getClass();
                Object P3 = yaa.P(new kg7(wi7Var6, i31, str4, (rq3) null, 0), this);
                return P3 == lu3Var15 ? lu3Var15 : P3;
            case 16:
                r77 r77Var2 = (r77) obj3;
                ku3 ku3Var5 = (ku3) this.t;
                lu3 lu3Var16 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    r77Var2.n(null, new yt6(22));
                    av4 t5 = xw3.t(ku3Var5, null, new o77(r77Var2, ol7Var, r9), 3);
                    wd5 wd5Var5 = xd5.b;
                    long R6 = wkn.R(500, be5.MILLISECONDS);
                    this.t = null;
                    this.s = 1;
                    e04 = z8e.e0(t5, R6, this);
                    if (e04 == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e04 = obj;
                }
                if (((Boolean) e04).booleanValue()) {
                    hkg.p0(r77Var2.n.c.c, r77Var2.i());
                    r77Var2.k(i77.a);
                } else {
                    r77Var2.k(g77.a);
                }
                r77Var2.n(null, new yt6(i4));
                return Unit.a;
            case 17:
                ia7 ia7Var = (ia7) obj3;
                lu3 lu3Var17 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    wd5 wd5Var6 = xd5.b;
                    long R7 = wkn.R(300, be5.MILLISECONDS);
                    cl clVar2 = new cl(ia7Var, (String) this.t, ol7Var, 13);
                    this.s = 1;
                    B2 = z8e.B(R7, clVar2, this);
                    break;
                } else {
                    if (i33 != 1) {
                        if (i33 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    B2 = obj;
                }
                if (((x2g) B2) instanceof v2g) {
                    aeh aehVar3 = ia7Var.i;
                    this.s = 2;
                    break;
                } else {
                    fdi fdiVar5 = ia7Var.g;
                    do {
                        value5 = fdiVar5.getValue();
                        ha7Var = (ha7) value5;
                        aa7 aa7Var = ha7Var.a;
                        if (aa7Var instanceof z97) {
                            ha7Var = ha7.a(ha7Var, z97.a((z97) aa7Var, null, true, false, false, 9), false, 2);
                        }
                    } while (!fdiVar5.k(value5, ha7Var));
                }
                return Unit.a;
            case 18:
                ia7 ia7Var2 = (ia7) obj3;
                ku3 ku3Var6 = (ku3) this.t;
                lu3 lu3Var18 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    fdi fdiVar6 = ia7Var2.g;
                    do {
                        value6 = fdiVar6.getValue();
                    } while (!fdiVar6.k(value6, ha7.a((ha7) value6, null, true, 1)));
                    av4 t6 = xw3.t(ku3Var6, null, new d17(ia7Var2, ol7Var, 7), 3);
                    wd5 wd5Var7 = xd5.b;
                    long R8 = wkn.R(500, be5.MILLISECONDS);
                    this.t = null;
                    this.s = 1;
                    e05 = z8e.e0(t6, R8, this);
                    break;
                } else {
                    if (i34 != 1) {
                        if (i34 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        fdiVar = ia7Var2.g;
                        do {
                            value7 = fdiVar.getValue();
                        } while (!fdiVar.k(value7, ha7.a((ha7) value7, null, false, 1)));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    e05 = obj;
                }
                if (((FantasyUserLeague) e05) != null) {
                    aeh aehVar4 = ia7Var2.i;
                    this.t = null;
                    this.s = 2;
                    break;
                }
                fdiVar = ia7Var2.g;
                do {
                    value7 = fdiVar.getValue();
                } while (!fdiVar.k(value7, ha7.a((ha7) value7, null, false, 1)));
                return Unit.a;
            case 19:
                lu3 lu3Var19 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var7 = ((ob7) obj3).e;
                    String str5 = (String) this.t;
                    this.s = 1;
                    Q = wi7Var7.Q(str5, this);
                    if (Q == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    Q = obj;
                }
                Iterable iterable = (Iterable) Q;
                ArrayList arrayList3 = new ArrayList(k13.r(iterable, 10));
                Iterator it6 = iterable.iterator();
                while (it6.hasNext()) {
                    w1l.A(arrayList3, ((FantasyUserCompetition) it6.next()).getFantasyCompetition().getId());
                }
                return arrayList3;
            case 20:
                lu3 lu3Var20 = lu3.a;
                int i36 = this.s;
                if (i36 == 0) {
                    y6a.M(obj);
                    aeh aehVar5 = ((wb7) this.t).l;
                    ev6 ev6Var = ((do7) obj3).c;
                    u97 u97Var = new u97(ev6Var.c, ev6Var.d);
                    this.s = 1;
                    if (aehVar5.emit(u97Var, this) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i36 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 21:
                lu3 lu3Var21 = lu3.a;
                int i37 = this.s;
                if (i37 == 0) {
                    y6a.M(obj);
                    ((e1d) obj3).setValue(null);
                    ksa ksaVar = (ksa) this.t;
                    this.s = 1;
                    if (ksa.l(0, this, ksaVar) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i37 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 22:
                yc7 yc7Var = (yc7) this.t;
                Object obj6 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    jc7 jc7Var = (jc7) ((kc7) obj3);
                    int i39 = jc7Var.b.a;
                    nc7 nc7Var = jc7Var.a;
                    this.s = 1;
                    yc7Var.getClass();
                    Object r = s9a.r(new jr5(yc7Var, nc7Var, i39, (rq3) null, 2), this);
                    Object obj7 = r;
                    if (r != obj6) {
                        obj7 = Unit.a;
                    }
                    if (obj7 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i38 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                yc7Var.k();
                return Unit.a;
            case 23:
                kj7 kj7Var3 = (kj7) obj3;
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = kj7Var3.a;
                te7 te7Var = (te7) this.t;
                lu3 lu3Var22 = lu3.a;
                int i40 = this.s;
                if (i40 == 0) {
                    y6a.M(obj);
                    tj7 tj7Var2 = te7Var.f;
                    Application application2 = te7Var.b;
                    application2.getClass();
                    Set keySet2 = fantasyRoundPlayerUiModel2.y.keySet();
                    Integer num4 = new Integer(fantasyRoundPlayerUiModel2.g.b);
                    Integer num5 = new Integer(te7Var.g);
                    String str6 = fantasyRoundPlayerUiModel2.b.b;
                    Map map2 = fantasyRoundPlayerUiModel2.y;
                    this.s = 1;
                    tj7Var2.getClass();
                    P2 = tz9.P(new qj7(keySet2, tj7Var2, num4, num5, map2, application2, null, str6, true, null), this);
                    if (P2 == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i40 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                re7 k = te7Var.k();
                LinkedHashMap linkedHashMap = new LinkedHashMap(te7Var.k().c);
                linkedHashMap.put(fc6.g(fantasyRoundPlayerUiModel2.a, kj7Var3.b, "_"), new ki6(l6g.W((List) P2), false));
                Unit unit = Unit.a;
                ((eoh) te7Var.h).setValue(re7.a(k, null, l6g.X(linkedHashMap), 3));
                return Unit.a;
            case 24:
                lu3 lu3Var23 = lu3.a;
                int i41 = this.s;
                if (i41 == 0) {
                    y6a.M(obj);
                    if (((Boolean) ((cdi) obj3).getValue()).booleanValue()) {
                        ksa ksaVar2 = (ksa) this.t;
                        this.s = 1;
                        if (ksa.l(1, this, ksaVar2) == lu3Var23) {
                            return lu3Var23;
                        }
                    }
                } else {
                    if (i41 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 25:
                ll7 ll7Var = (ll7) this.t;
                lu3 lu3Var24 = lu3.a;
                int i42 = this.s;
                if (i42 == 0) {
                    y6a.M(obj);
                    gv9 gv9Var = ll7Var.e;
                    gv9Var.getClass();
                    Iterator it7 = gv9Var.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            r9 = -1;
                        } else if (!((wn1) it7.next()).c()) {
                            r9++;
                        }
                    }
                    Integer valueOf = r9 == -1 ? null : Integer.valueOf(r9);
                    if (valueOf == null) {
                        gv9 gv9Var2 = ll7Var.e;
                        gv9Var2.getClass();
                        ListIterator listIterator = gv9Var2.listIterator(gv9Var2.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i2 = -1;
                            } else if (((wn1) listIterator.previous()).b()) {
                                i2 = listIterator.nextIndex();
                            }
                        }
                        valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                    }
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        this.s = 1;
                        if (n9e.o((ksa) obj3, intValue, this) == lu3Var24) {
                            return lu3Var24;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 26:
                lu3 lu3Var25 = lu3.a;
                int i43 = this.s;
                if (i43 != 0) {
                    if (i43 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ml7 ml7Var = (ml7) this.t;
                wi7 wi7Var8 = ml7Var.e;
                this.s = 1;
                wi7Var8.getClass();
                Object P4 = yaa.P(new bs2(wi7Var8, ml7Var.g.a.a, (ArrayList) obj3, null, null, 4), this);
                return P4 == lu3Var25 ? lu3Var25 : P4;
            case 27:
                return e(obj);
            case 28:
                return f(obj);
            default:
                lu3 lu3Var26 = lu3.a;
                int i44 = this.s;
                if (i44 == 0) {
                    y6a.M(obj);
                    g62 g62Var4 = ((vp7) this.t).j;
                    mp7 mp7Var = new mp7((ArrayList) obj3);
                    this.s = 1;
                    if (g62Var4.q(this, mp7Var) == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i44 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs6(ltk ltkVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = ltkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs6(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }
}
