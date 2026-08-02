package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.playerOfTheSeason.POTSNetworkPlayer;
import com.sofascore.model.newNetwork.CareerHistory;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMediaPost;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.model.notifications.NotificationSettingKt;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.helper.SofaBackupAgent;
import com.sofascore.results.manager.details.view.ManagerHistoryChartGraph;
import com.sofascore.results.profile.LoginScreenActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gjb extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gjb(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return new gjb((LoginScreenActivity) this.t, (String) obj2, rq3Var, 0);
            case 1:
                return new gjb((ynb) this.t, obj2, rq3Var, 1);
            case 2:
                return new gjb((ypb) this.t, (do7) obj2, rq3Var, 2);
            case 3:
                return new gjb((ypb) this.t, (ArrayList) obj2, rq3Var, 3);
            case 4:
                return new gjb((zqb) this.t, (hwg) obj2, rq3Var, 4);
            case 5:
                return new gjb((ManagerHistoryChartGraph) this.t, (CareerHistory) obj2, rq3Var, 5);
            case 6:
                return new gjb((yda) this.t, (gvb) obj2, rq3Var, 6);
            case 7:
                return new gjb((r1c) this.t, (Uri) obj2, rq3Var, 7);
            case 8:
                return new gjb((u8c) this.t, (EventBestPlayer) obj2, rq3Var, 8);
            case 9:
                return new gjb((u8c) this.t, (PersonalizedMediaPost) obj2, rq3Var, 9);
            case 10:
                gjb gjbVar = new gjb((eqc) obj2, rq3Var, 10);
                gjbVar.t = obj;
                return gjbVar;
            case 11:
                return new gjb((u6b) this.t, (eqc) obj2, rq3Var, 11);
            case 12:
                return new gjb((ddi) this.t, (qvc) obj2, rq3Var, 12);
            case 13:
                gjb gjbVar2 = new gjb((qwc) obj2, rq3Var, 13);
                gjbVar2.t = obj;
                return gjbVar2;
            case 14:
                gjb gjbVar3 = new gjb((ead) obj2, rq3Var, 14);
                gjbVar3.t = obj;
                return gjbVar3;
            case 15:
                return new gjb((oad) this.t, (k8f) obj2, rq3Var, 15);
            case 16:
                return new gjb((ccc) this.t, (Function2) obj2, rq3Var, 16);
            case 17:
                gjb gjbVar4 = new gjb((g62) obj2, rq3Var, 17);
                gjbVar4.t = obj;
                return gjbVar4;
            case 18:
                return new gjb((yfd) obj2, rq3Var, 18);
            case 19:
                return new gjb((yfd) this.t, (gv9) obj2, rq3Var, 19);
            case 20:
                return new gjb((Context) this.t, (LinkedHashMap) obj2, rq3Var, 20);
            case 21:
                return new gjb((umd) this.t, (OddsCountryProvider) obj2, rq3Var, 21);
            case 22:
                return new gjb((qpa) this.t, (mvh) obj2, rq3Var, 22);
            case 23:
                gjb gjbVar5 = new gjb((b1e) obj2, rq3Var, 23);
                gjbVar5.t = obj;
                return gjbVar5;
            case 24:
                return new gjb((lue) this.t, (y1e) obj2, rq3Var, 24);
            case 25:
                return new gjb((lue) this.t, (r2e) obj2, rq3Var, 25);
            case 26:
                gjb gjbVar6 = new gjb((k4e) obj2, rq3Var, 26);
                gjbVar6.t = obj;
                return gjbVar6;
            case 27:
                return new gjb((x4e) this.t, (nhh) obj2, rq3Var, 27);
            case 28:
                return new gjb((x4e) this.t, (g62) obj2, rq3Var, 28);
            default:
                return new gjb((Function2) this.t, (pae) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 12:
                ((gjb) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((gjb) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x042b, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0878, code lost:
    
        if (r1 == r0) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0856, code lost:
    
        if (r1.Z(r4) == r0) goto L406;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06d4  */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v146 */
    /* JADX WARN: Type inference failed for: r1v33, types: [com.sofascore.results.manager.details.view.ManagerHistoryChartGraph] */
    /* JADX WARN: Type inference failed for: r1v83, types: [int] */
    /* JADX WARN: Type inference failed for: r1v84, types: [yda] */
    /* JADX WARN: Type inference failed for: r1v88, types: [yda] */
    /* JADX WARN: Type inference failed for: r9v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:301:0x06d4 -> B:291:0x0690). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object obj2;
        ku3 ku3Var;
        Object obj3;
        float H0;
        float H02;
        svg svgVar;
        gjb gjbVar;
        Object g;
        Object f;
        Object U;
        yfd yfdVar;
        boolean enabled;
        Object u2gVar;
        SharedPreferences d;
        SharedPreferences d2;
        Object e;
        Object d3;
        Object c;
        String name;
        Object e2;
        String name2;
        gjb gjbVar2 = this;
        int i = 0;
        int i2 = 3;
        int i3 = 10;
        int i4 = 2;
        int i5 = 1;
        ?? r9 = 0;
        switch (gjbVar2.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i6 = gjbVar2.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    rgh rghVar = ((LoginScreenActivity) gjbVar2.t).L;
                    i19 i19Var = new i19((String) gjbVar2.u, null);
                    gjbVar2.s = 1;
                    if (rghVar.d(i19Var, gjbVar2) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i7 = gjbVar2.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    aeh aehVar = ((ynb) gjbVar2.t).g;
                    Object obj4 = gjbVar2.u;
                    gjbVar2.s = 1;
                    if (aehVar.emit(obj4, gjbVar2) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                ypb ypbVar = (ypb) gjbVar2.t;
                fdi fdiVar = ypbVar.i;
                lu3 lu3Var3 = lu3.a;
                int i8 = gjbVar2.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    if (!(fdiVar.getValue() instanceof qpb)) {
                        do {
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, opb.a));
                        gjbVar2.s = 1;
                        if (ypbVar.l(gjbVar2) == lu3Var3) {
                            return lu3Var3;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ypb.m(ypbVar, new ida((do7) gjbVar2.u, 19));
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i9 = gjbVar2.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    ru6 ru6Var = ((ypb) gjbVar2.t).g;
                    ArrayList arrayList = (ArrayList) gjbVar2.u;
                    gjbVar2.s = 1;
                    cg4 cg4Var = ru6Var.a;
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.valueOf(((Number) it.next()).intValue()));
                    }
                    Object x = o6a.x(cg4Var.a, new zf4(arrayList2, r9, i), gjbVar2);
                    lu3 lu3Var5 = lu3.a;
                    Object obj5 = x;
                    if (x != lu3Var5) {
                        obj5 = Unit.a;
                    }
                    if (obj5 != lu3Var5) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var6 = lu3.a;
                int i10 = gjbVar2.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    aeh aehVar2 = ((zqb) gjbVar2.t).V;
                    hwg hwgVar = (hwg) gjbVar2.u;
                    gjbVar2.s = 1;
                    if (aehVar2.emit(hwgVar, gjbVar2) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var7 = lu3.a;
                int i11 = gjbVar2.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ?? r1 = (ManagerHistoryChartGraph) gjbVar2.t;
                Team team = ((CareerHistory) gjbVar2.u).getTeam();
                r9 = team != null ? new Integer(team.getId()) : 0;
                gjbVar2.s = 1;
                int i12 = ManagerHistoryChartGraph.A;
                Object a = r1.a(r9, gjbVar2);
                return a == lu3Var7 ? lu3Var7 : a;
            case 6:
                Object obj6 = lu3.a;
                int i13 = gjbVar2.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    yda ydaVar = (yda) gjbVar2.t;
                    if (ydaVar != null) {
                        gjbVar2.s = 1;
                        break;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                gvb gvbVar = (gvb) gjbVar2.u;
                gjbVar2.s = 2;
                if (gvbVar.o <= 0) {
                    obj2 = Unit.a;
                    break;
                } else {
                    Object R = xw3.R(k68.a, new ppa(gvbVar, r9, 9), gjbVar2);
                    obj2 = R;
                    if (R != obj6) {
                        obj2 = Unit.a;
                        break;
                    }
                }
                break;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i14 = gjbVar2.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    v7a v7aVar = ((r1c) gjbVar2.t).a;
                    Uri uri = (Uri) gjbVar2.u;
                    gjbVar2.s = 1;
                    if (v7aVar.C(uri, gjbVar2) == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i15 = gjbVar2.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar = ((u8c) gjbVar2.t).g;
                int id = ((EventBestPlayer) gjbVar2.u).getPlayer().getId();
                gjbVar2.s = 1;
                Object i16 = wveVar.i(id, gjbVar2);
                return i16 == lu3Var9 ? lu3Var9 : i16;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i17 = gjbVar2.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                u8c u8cVar = (u8c) gjbVar2.t;
                int id2 = ((PersonalizedMediaPost) gjbVar2.u).getId();
                gjbVar2.s = 1;
                Object a2 = u8cVar.a(id2, gjbVar2);
                return a2 == lu3Var10 ? lu3Var10 : a2;
            case 10:
                eqc eqcVar = (eqc) gjbVar2.u;
                ku3 ku3Var2 = (ku3) gjbVar2.t;
                lu3 lu3Var11 = lu3.a;
                int i18 = gjbVar2.s;
                if (i18 != 0 && i18 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                while (s9a.w(ku3Var2)) {
                    if (eqcVar.f != 0) {
                        if (eqcVar.g != null) {
                            return Unit.a;
                        }
                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                        if (currentTimeMillis - eqcVar.e >= 30) {
                            eqcVar.e = currentTimeMillis;
                            Context context = eqcVar.getContext();
                            context.getClass();
                            nv.T(context, "event_details", eqcVar.f, 1);
                        }
                    }
                    wd5 wd5Var = xd5.b;
                    long R2 = wkn.R(2, be5.SECONDS);
                    gjbVar2.t = ku3Var2;
                    gjbVar2.s = 1;
                    if (n4o.z(R2, gjbVar2) == lu3Var11) {
                        return lu3Var11;
                    }
                }
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i19 = gjbVar2.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    u6b u6bVar = (u6b) gjbVar2.t;
                    e6b e6bVar = e6b.e;
                    gjb gjbVar3 = new gjb((eqc) gjbVar2.u, r9, i3);
                    gjbVar2.s = 1;
                    if (b6a.A(u6bVar, e6bVar, gjbVar3, gjbVar2) == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i19 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i20 = gjbVar2.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    ddi ddiVar = (ddi) gjbVar2.t;
                    f10 f10Var = new f10((qvc) gjbVar2.u, 13);
                    gjbVar2.s = 1;
                    if (ddiVar.collect(f10Var, gjbVar2) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i20 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 13:
                qwc qwcVar = (qwc) gjbVar2.u;
                lu3 lu3Var14 = lu3.a;
                int i21 = gjbVar2.s;
                try {
                    if (i21 == 0) {
                        y6a.M(obj);
                        ku3Var = (ku3) gjbVar2.t;
                    } else {
                        if (i21 == 1) {
                            ku3Var = (ku3) gjbVar2.t;
                            y6a.M(obj);
                            obj3 = obj;
                            ku3 ku3Var3 = ku3Var;
                            H0 = ((kx4) qwcVar.d).H0(6.0f);
                            H02 = ((kx4) qwcVar.d).H0(1.0f);
                            svgVar = (svg) qwcVar.b;
                            gjbVar2.t = ku3Var3;
                            gjbVar2.s = 2;
                            gjbVar = gjbVar2;
                            gjbVar2 = gjbVar;
                            if (qwcVar.l(svgVar, (mwc) obj3, H0, H02, gjbVar) != lu3Var14) {
                                ku3Var = ku3Var3;
                            }
                            return lu3Var14;
                        }
                        if (i21 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ku3Var = (ku3) gjbVar2.t;
                        y6a.M(obj);
                    }
                    if (!bea.B(ku3Var.getCoroutineContext())) {
                        qwcVar.h = null;
                        return Unit.a;
                    }
                    g62 g62Var = qwcVar.g;
                    gjbVar2.t = ku3Var;
                    gjbVar2.s = 1;
                    obj3 = g62Var.f(gjbVar2);
                    if (obj3 == lu3Var14) {
                        return lu3Var14;
                    }
                    ku3 ku3Var32 = ku3Var;
                    H0 = ((kx4) qwcVar.d).H0(6.0f);
                    H02 = ((kx4) qwcVar.d).H0(1.0f);
                    svgVar = (svg) qwcVar.b;
                    gjbVar2.t = ku3Var32;
                    gjbVar2.s = 2;
                    gjbVar = gjbVar2;
                    gjbVar2 = gjbVar;
                    if (qwcVar.l(svgVar, (mwc) obj3, H0, H02, gjbVar) != lu3Var14) {
                    }
                    return lu3Var14;
                } catch (Throwable th) {
                    qwcVar.h = null;
                    throw th;
                }
            case 14:
                ead eadVar = (ead) gjbVar2.u;
                zad zadVar = (zad) gjbVar2.t;
                lu3 lu3Var15 = lu3.a;
                int i22 = gjbVar2.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    mwh mwhVar = zadVar.e;
                    if (mwhVar == null) {
                        a70.r("body == null");
                        return null;
                    }
                    gjbVar2.t = zadVar;
                    gjbVar2.s = 1;
                    g = eadVar.g(mwhVar, gjbVar2);
                    if (g == lu3Var15) {
                        return lu3Var15;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    g = obj;
                }
                return new fwh((yt9) g, ead.d(eadVar.a, zadVar.d.a("Content-Type")), pe4.d);
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i23 = gjbVar2.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    gjbVar2.s = 1;
                    if (n4o.y(1000L, gjbVar2) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i23 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                rik o = rik.o();
                int i24 = kbl.a;
                o.getClass();
                ((j8f) ((k8f) gjbVar2.u)).d(new in3(7));
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                int i25 = gjbVar2.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    svg svgVar2 = (svg) ((ccc) gjbVar2.t).b;
                    m1d m1dVar = m1d.b;
                    Function2 function2 = (Function2) gjbVar2.u;
                    gjbVar2.s = 1;
                    if (svgVar2.f(m1dVar, function2, gjbVar2) == lu3Var17) {
                        return lu3Var17;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 17:
                lu3 lu3Var18 = lu3.a;
                ?? r12 = gjbVar2.s;
                try {
                    if (r12 == 0) {
                        y6a.M(obj);
                        g9i L = xw3.L((ku3) gjbVar2.t, null, null, new i58(i4, r9, i4), 3);
                        g62 g62Var2 = (g62) gjbVar2.u;
                        gjbVar2.t = L;
                        gjbVar2.s = 1;
                        f = g62Var2.f(gjbVar2);
                        r12 = L;
                        if (f == lu3Var18) {
                            return lu3Var18;
                        }
                    } else {
                        if (r12 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        yda ydaVar2 = (yda) gjbVar2.t;
                        y6a.M(obj);
                        f = obj;
                        r12 = ydaVar2;
                    }
                    r12.e(null);
                    r9 = f;
                    return r9;
                } catch (Throwable th2) {
                    r12.e(r9);
                    throw th2;
                }
            case 18:
                yfd yfdVar2 = (yfd) gjbVar2.u;
                lu3 lu3Var19 = lu3.a;
                int i26 = gjbVar2.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    yhd yhdVar = yfdVar2.l;
                    String str = yfdVar2.m;
                    gjbVar2.t = yfdVar2;
                    gjbVar2.s = 1;
                    U = gz8.U(gjbVar2, yhdVar.a.a, true, false, new jp1(str, 24));
                    if (U == lu3Var19) {
                        return lu3Var19;
                    }
                    yfdVar = yfdVar2;
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yfdVar = (yfd) gjbVar2.t;
                    y6a.M(obj);
                    U = obj;
                }
                yfdVar.n = (List) U;
                yfdVar2.n(new vfd(null, 31), new wfd(yfdVar2, wxf.i(yfdVar2.i()), i5));
                return Unit.a;
            case 19:
                lu3 lu3Var20 = lu3.a;
                int i27 = gjbVar2.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    yfd yfdVar3 = (yfd) gjbVar2.t;
                    gv9 gv9Var = (gv9) gjbVar2.u;
                    gjbVar2.s = 1;
                    if (yfdVar3.v(gv9Var, gjbVar2) == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i28 = gjbVar2.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    Map map = SofaBackupAgent.b;
                    Context context2 = (Context) gjbVar2.t;
                    context2.getClass();
                    Map map2 = SofaBackupAgent.b;
                    if (map2 == null) {
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = context2.getApplicationContext();
                            synchronized (uic.i) {
                                d = a5f.d(applicationContext);
                                uic.j = d;
                            }
                            d.getClass();
                            sharedPreferences = d;
                        }
                        String string = sharedPreferences.getString("PREF_NOTIFICATION_SETTINGS", null);
                        if (string != null) {
                            bga bgaVar = vga.a;
                            if (string.length() != 0) {
                                try {
                                    p2g p2gVar = w2g.b;
                                    bgaVar.getClass();
                                    u2gVar = bgaVar.b(l98.W(new q79(uhi.a, gz1.a, 1)), string);
                                } catch (Throwable th3) {
                                    p2g p2gVar2 = w2g.b;
                                    u2gVar = new u2g(th3);
                                }
                                Throwable a3 = w2g.a(u2gVar);
                                if (a3 != null) {
                                    s38.a().c(a3);
                                }
                                break;
                            }
                            u2gVar = null;
                            map2 = (Map) u2gVar;
                        } else {
                            map2 = null;
                        }
                        SofaBackupAgent.b = map2;
                    }
                    List<NotificationSetting> a4 = ir4.a();
                    LinkedHashMap linkedHashMap = (LinkedHashMap) gjbVar2.u;
                    ArrayList arrayList3 = new ArrayList(k13.r(a4, 10));
                    for (NotificationSetting notificationSetting : a4) {
                        Boolean bool = (Boolean) linkedHashMap.get(NotificationSettingKt.getBackendChannelName(notificationSetting));
                        if (bool == null) {
                            bool = map2 != null ? (Boolean) map2.get(NotificationSettingKt.getBackendChannelName(notificationSetting)) : null;
                            if (bool == null) {
                                enabled = notificationSetting.getEnabled();
                                arrayList3.add(NotificationSetting.copy$default(notificationSetting, null, null, enabled, null, null, 27, null));
                            }
                        }
                        enabled = bool.booleanValue();
                        arrayList3.add(NotificationSetting.copy$default(notificationSetting, null, null, enabled, null, null, 27, null));
                    }
                    jgd jgdVar = jgd.a;
                    yhd yhdVar2 = (yhd) jgd.b.getValue();
                    Context context3 = (Context) gjbVar2.t;
                    gjbVar2.s = 1;
                    if (yhdVar2.b(context3, arrayList3, gjbVar2) == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i28 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Map map3 = SofaBackupAgent.b;
                Context context4 = (Context) gjbVar2.t;
                context4.getClass();
                SofaBackupAgent.b = null;
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext2 = context4.getApplicationContext();
                    synchronized (uic.i) {
                        d2 = a5f.d(applicationContext2);
                        uic.j = d2;
                    }
                    d2.getClass();
                    sharedPreferences2 = d2;
                }
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.getClass();
                edit.remove("PREF_NOTIFICATION_SETTINGS");
                Unit unit = Unit.a;
                edit.apply();
                return Unit.a;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i29 = gjbVar2.s;
                if (i29 == 0) {
                    y6a.M(obj);
                    umd umdVar = (umd) gjbVar2.t;
                    OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) gjbVar2.u;
                    smd smdVar = new smd(umdVar, null);
                    gjbVar2.s = 1;
                    e = umd.e(umdVar, oddsCountryProvider, null, smdVar, gjbVar2, 6);
                    if (e == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i29 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e = obj;
                }
                return Boolean.valueOf(Intrinsics.c(e, Boolean.TRUE));
            case 22:
                lu3 lu3Var23 = lu3.a;
                int i30 = gjbVar2.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    z88 H = hkg.H(sea.y(new vcb((qpa) gjbVar2.t, i5)));
                    f10 f10Var2 = new f10((mvh) gjbVar2.u, 15);
                    gjbVar2.s = 1;
                    Object collect = H.collect(new vj0(f10Var2, 28), gjbVar2);
                    if (collect != lu3Var23) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var23) {
                        return lu3Var23;
                    }
                } else {
                    if (i30 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 23:
                b1e b1eVar = (b1e) gjbVar2.u;
                String str2 = (String) gjbVar2.t;
                lu3 lu3Var24 = lu3.a;
                int i31 = gjbVar2.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    uwg uwgVar = b1eVar.l;
                    hwg hwgVar2 = hwg.c;
                    String str3 = Sports.FOOTBALL;
                    gjbVar2.t = null;
                    gjbVar2.s = 1;
                    uwgVar.getClass();
                    d3 = uwgVar.d(new fg7(uwgVar, "teams", str2, str3, 0, (rq3) null, 2), gjbVar2);
                    if (d3 == lu3Var24) {
                        return lu3Var24;
                    }
                } else {
                    if (i31 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    d3 = obj;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj7 : (List) d3) {
                    if (obj7 instanceof Team) {
                        arrayList4.add(obj7);
                    }
                }
                ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    Team team2 = (Team) it2.next();
                    arrayList5.add(new d1e(team2.getId(), tba.p(b1eVar.i(), team2)));
                }
                b1eVar.n(null, new uo(6, l6g.W(arrayList5)));
                return Unit.a;
            case 24:
                y1e y1eVar = (y1e) gjbVar2.u;
                lu3 lu3Var25 = lu3.a;
                int i32 = gjbVar2.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    lue lueVar = (lue) gjbVar2.t;
                    int i33 = y1eVar.g;
                    gjbVar2.s = 1;
                    c = lueVar.c(i33, gjbVar2);
                    if (c == lu3Var25) {
                        return lu3Var25;
                    }
                } else {
                    if (i32 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    c = obj;
                }
                List list = (List) c;
                if (list != null) {
                    fdi fdiVar2 = y1eVar.e;
                    ArrayList arrayList6 = new ArrayList(k13.r(list, 10));
                    int i34 = 0;
                    for (Object obj8 : list) {
                        int i35 = i34 + 1;
                        if (i34 < 0) {
                            b.q();
                            throw null;
                        }
                        POTSNetworkPlayer pOTSNetworkPlayer = (POTSNetworkPlayer) obj8;
                        int i36 = y1eVar.g;
                        boolean z = i34 == list.size() - 1;
                        pOTSNetworkPlayer.getClass();
                        int id3 = pOTSNetworkPlayer.getPlayer().getId();
                        String t = tba.t(pOTSNetworkPlayer.getPlayer());
                        int id4 = pOTSNetworkPlayer.getSeason().getId();
                        String year = pOTSNetworkPlayer.getSeason().getYear();
                        int id5 = pOTSNetworkPlayer.getTeam().getId();
                        FieldTranslations fieldTranslations = pOTSNetworkPlayer.getTeam().getFieldTranslations();
                        if (fieldTranslations == null || (name = tba.r(fieldTranslations)) == null) {
                            name = pOTSNetworkPlayer.getTeam().getName();
                        }
                        arrayList6.add(new z2e(id3, t, id4, year, id5, name, i36, pOTSNetworkPlayer.getRating(), z));
                        i34 = i35;
                    }
                    fdiVar2.l(l6g.W(arrayList6));
                }
                return Unit.a;
            case 25:
                r2e r2eVar = (r2e) gjbVar2.u;
                lu3 lu3Var26 = lu3.a;
                int i37 = gjbVar2.s;
                if (i37 == 0) {
                    y6a.M(obj);
                    lue lueVar2 = (lue) gjbVar2.t;
                    int i38 = r2eVar.g;
                    gjbVar2.s = 1;
                    e2 = lueVar2.e(i38, gjbVar2);
                    if (e2 == lu3Var26) {
                        return lu3Var26;
                    }
                } else {
                    if (i37 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    e2 = obj;
                }
                List<POTSNetworkPlayer> list2 = (List) e2;
                if (list2 != null) {
                    fdi fdiVar3 = r2eVar.e;
                    ArrayList arrayList7 = new ArrayList(k13.r(list2, 10));
                    for (POTSNetworkPlayer pOTSNetworkPlayer2 : list2) {
                        pOTSNetworkPlayer2.getClass();
                        UniqueTournament uniqueTournament = pOTSNetworkPlayer2.getUniqueTournament();
                        int id6 = uniqueTournament != null ? uniqueTournament.getId() : -1;
                        UniqueTournament uniqueTournament2 = pOTSNetworkPlayer2.getUniqueTournament();
                        String x2 = uniqueTournament2 != null ? tba.x(uniqueTournament2) : null;
                        if (x2 == null) {
                            x2 = "";
                        }
                        String str4 = x2;
                        int id7 = pOTSNetworkPlayer2.getTeam().getId();
                        FieldTranslations fieldTranslations2 = pOTSNetworkPlayer2.getTeam().getFieldTranslations();
                        if (fieldTranslations2 == null || (name2 = tba.r(fieldTranslations2)) == null) {
                            name2 = pOTSNetworkPlayer2.getTeam().getName();
                        }
                        arrayList7.add(new n2e(id6, str4, id7, name2, pOTSNetworkPlayer2.getSeason().getId(), pOTSNetworkPlayer2.getSeason().getYear(), pOTSNetworkPlayer2.getRating()));
                    }
                    fdiVar3.l(l6g.W(arrayList7));
                }
                return Unit.a;
            case 26:
                k4e k4eVar = (k4e) gjbVar2.u;
                lu3 lu3Var27 = lu3.a;
                int i39 = gjbVar2.s;
                if (i39 == 0) {
                    y6a.M(obj);
                    nhh nhhVar = (nhh) gjbVar2.t;
                    z88 K = y6a.K(new j98(hkg.H(new wj0(new pog(new u1(new v98(new i58(i4, r9, i2), (sj3) k4eVar.c.c), new g61(k4eVar, null), (rq3) r9, 27)), i2)), new tl((rq3) r9, k4eVar, 20), r9, i5));
                    tj0 tj0Var = new tj0(nhhVar, i4);
                    gjbVar2.s = 1;
                    if (K.collect(tj0Var, gjbVar2) == lu3Var27) {
                        return lu3Var27;
                    }
                } else {
                    if (i39 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 27:
                lu3 lu3Var28 = lu3.a;
                int i40 = gjbVar2.s;
                if (i40 == 0) {
                    y6a.M(obj);
                    nn2 x3 = f5p.x(((x4e) gjbVar2.t).h);
                    f10 f10Var3 = new f10((nhh) gjbVar2.u, 16);
                    gjbVar2.s = 1;
                    if (x3.collect(f10Var3, gjbVar2) == lu3Var28) {
                        return lu3Var28;
                    }
                } else {
                    if (i40 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 28:
                lu3 lu3Var29 = lu3.a;
                int i41 = gjbVar2.s;
                if (i41 != 0) {
                    if (i41 == 1) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                sj3 sj3Var = ((x4e) gjbVar2.t).d;
                f10 f10Var4 = new f10((g62) gjbVar2.u, 17);
                gjbVar2.s = 1;
                sj3Var.collect(f10Var4, gjbVar2);
                return lu3Var29;
            default:
                lu3 lu3Var30 = lu3.a;
                int i42 = gjbVar2.s;
                if (i42 != 0) {
                    if (i42 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                Function2 function22 = (Function2) gjbVar2.t;
                pae paeVar = (pae) gjbVar2.u;
                gjbVar2.s = 1;
                Object invoke = function22.invoke(paeVar, gjbVar2);
                return invoke == lu3Var30 ? lu3Var30 : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gjb(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
    }
}
