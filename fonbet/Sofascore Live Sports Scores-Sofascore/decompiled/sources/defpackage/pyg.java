package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lpyg;", "Lynb;", "Lgyg;", "Lnxg;", "Luxg;", "lyg", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class pyg extends ynb {
    public final e73 l;
    public final String m;
    public final boolean n;
    public final int o;
    public final Integer p;
    public final LinkedHashMap q;
    public final LinkedHashMap r;
    public g9i s;
    public int t;
    public final f73 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyg(Application application, wve wveVar, j0j j0jVar, fqg fqgVar) {
        super(application, tnb.a);
        f73 xmeVar;
        wveVar.getClass();
        j0jVar.getClass();
        fqgVar.getClass();
        Object a = fqgVar.a("ENTITY_TYPE");
        if (a == null) {
            a70.p("Required value was null.");
            throw null;
        }
        e73 e73Var = (e73) a;
        this.l = e73Var;
        String str = (String) fqgVar.a("SPORT");
        str = str == null ? "" : str;
        this.m = str;
        boolean z = e73Var == e73.a || wyh.e(str);
        this.n = z;
        this.o = z ? R.drawable.player_photo_placeholder : R.drawable.team_logo_placeholder;
        this.p = z ? null : Integer.valueOf(R.color.neutral_default);
        this.q = new LinkedHashMap();
        this.r = new LinkedHashMap();
        int ordinal = e73Var.ordinal();
        if (ordinal == 0) {
            xmeVar = new xme(i(), wveVar, str);
        } else {
            if (ordinal != 1) {
                zzl.b();
                throw null;
            }
            xmeVar = new xui(j0jVar, i(), str);
        }
        this.u = xmeVar;
        Integer num = (Integer) fqgVar.a("ENTITY_ID_1");
        Integer num2 = (Integer) fqgVar.a("ENTITY_ID_2");
        ComparisonSeasonInfo comparisonSeasonInfo = (ComparisonSeasonInfo) fqgVar.a("PRESELECTED_SEASON_INFO");
        ComparisonSeasonInfo comparisonSeasonInfo2 = (ComparisonSeasonInfo) fqgVar.a("PRESELECTED_SEASON_INFO_2");
        ComparisonSeasonInfo comparisonSeasonInfo3 = comparisonSeasonInfo2 == null ? comparisonSeasonInfo : comparisonSeasonInfo2;
        List<e93> L0 = CollectionsKt.L0(e93.d, 2);
        for (e93 e93Var : L0) {
            LinkedHashMap linkedHashMap = this.q;
            int i = this.t;
            this.t = i + 1;
            linkedHashMap.put(e93Var, new lyg(i, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
        }
        o(new gk(this, ((Boolean) tz4.e.b.invoke(i())).booleanValue(), L0, 12));
        if (num != null) {
            int i2 = ((lyg) tub.e(e93.a, this.q)).a;
            w(i2, new kyg(this, i2, num, comparisonSeasonInfo, null, 0));
        }
        if (num2 != null) {
            int i3 = ((lyg) tub.e(e93.b, this.q)).a;
            w(i3, new kyg(this, i3, num2, comparisonSeasonInfo3, null, 1));
        }
    }

    public static tee u(Map map, e93 e93Var) {
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((e93) obj) != e93Var) {
                arrayList.add(obj);
            }
        }
        List H0 = CollectionsKt.H0(arrayList, new laf(17));
        ArrayList Y0 = CollectionsKt.Y0(H0, CollectionsKt.L0(e93.d, H0.size()));
        int c = sub.c(k13.r(Y0, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        Iterator it = Y0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put((e93) pair.b, rub.a((e93) pair.a, map));
        }
        return l6g.b0(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A() {
        int i;
        g9i g9iVar;
        LinkedHashMap linkedHashMap = this.q;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((lyg) entry.getValue()).b);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(sub.c(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), ((lyg) entry2.getValue()).c);
        }
        tee b0 = l6g.b0(linkedHashMap3);
        Context i2 = i();
        int i3 = kb0.b;
        if (i3 != 1) {
            i = i3 == 2 ? 32 : 16;
            Context context = i2;
            g9iVar = this.s;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            this.s = xw3.L(un0.z(this), null, null, new cce(this, context, linkedHashMap2, b0, null, 13), 3);
        }
        if ((i2.getResources().getConfiguration().uiMode & 48) != i) {
            Configuration configuration = new Configuration(i2.getResources().getConfiguration());
            configuration.uiMode = i | (configuration.uiMode & (-49));
            i2 = i2.createConfigurationContext(configuration);
            i2.getClass();
        }
        Context context2 = i2;
        g9iVar = this.s;
        if (g9iVar != null) {
        }
        this.s = xw3.L(un0.z(this), null, null, new cce(this, context2, linkedHashMap2, b0, null, 13), 3);
    }

    public final q9k B(e93 e93Var) {
        return new q9k(this.n ? R.string.comparison_player_number : R.string.comparison_team_number, l6g.K(Integer.valueOf(e93Var.ordinal() + 1)));
    }

    public final void C() {
        gv9 gv9Var;
        String str;
        tee teeVar;
        gyg gygVar = (gyg) l().a();
        Collection collection = (gygVar == null || (teeVar = gygVar.d) == null) ? null : (wv9) teeVar.keySet();
        if (collection == null) {
            collection = rm5.a;
        }
        boolean isEmpty = collection.isEmpty();
        LinkedHashMap linkedHashMap = this.q;
        if (!isEmpty) {
            Collection collection2 = collection;
            if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    lyg lygVar = (lyg) linkedHashMap.get((e93) it.next());
                    if ((lygVar != null ? lygVar.e : null) != null) {
                    }
                }
            }
            Iterator it2 = linkedHashMap.values().iterator();
            while (true) {
                if (it2.hasNext()) {
                    gv9Var = ((lyg) it2.next()).g;
                    if (gv9Var != null) {
                        break;
                    }
                } else {
                    gv9Var = null;
                    break;
                }
            }
            if (gv9Var == null) {
                gv9Var = rlh.b;
            }
            gyg gygVar2 = (gyg) l().a();
            if (gygVar2 == null || (str = gygVar2.h) == null) {
                vt2 vt2Var = (vt2) CollectionsKt.firstOrNull(gv9Var);
                str = vt2Var != null ? (String) vt2Var.a : null;
            }
            n(null, new aaf(15, gv9Var, str));
            return;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            e93 e93Var = (e93) entry.getKey();
            lyg lygVar2 = (lyg) entry.getValue();
            d73 d73Var = lygVar2.f;
            if (d73Var != null) {
                linkedHashMap.put(e93Var, lyg.a(lygVar2, c73.a(lygVar2.b, null, d73Var, 3), null, null, null, null, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
            }
        }
        n(null, new vqg(26));
    }

    public final gv9 t(ComparisonSeasonInfo comparisonSeasonInfo, y83 y83Var, gv9 gv9Var) {
        List list = gv9Var;
        if (comparisonSeasonInfo instanceof ComparisonSeasonInfo.TennisYearInfo) {
            if (gv9Var == null) {
                list = km5.a;
            }
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((y83) it.next()).d;
                arrayList.add(new l73(str, new m9k(str)));
            }
            return l6g.W(arrayList);
        }
        String str2 = this.m;
        if (!Intrinsics.c(str2, Sports.BASKETBALL)) {
            return rlh.b;
        }
        Iterable<Season.SubSeasonType> iterable = y83Var != null ? y83Var.b : null;
        if (iterable == null) {
            iterable = km5.a;
        }
        ArrayList arrayList2 = new ArrayList(k13.r(iterable, 10));
        for (Season.SubSeasonType subSeasonType : iterable) {
            String label = subSeasonType.getLabel();
            Set set = f5k.a;
            arrayList2.add(new l73(label, f5k.c(subSeasonType.getLabel(), str2)));
        }
        return l6g.W(arrayList2);
    }

    public final e93 v(int i) {
        Object obj;
        Iterator it = this.q.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((lyg) ((Map.Entry) obj).getValue()).a == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (e93) entry.getKey();
        }
        return null;
    }

    public final void w(int i, Function1 function1) {
        hlh hlhVar = new hlh(i);
        LinkedHashMap linkedHashMap = this.r;
        yda ydaVar = (yda) linkedHashMap.get(hlhVar);
        rq3 rq3Var = null;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        linkedHashMap.put(new hlh(i), xw3.L(un0.z(this), null, null, new e7b(function1, rq3Var, 1), 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0169, code lost:
    
        if (y(r13, r1, r16, r8) == r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016b, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0085, code lost:
    
        if (r3 == r9) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(int i, int i2, ComparisonSeasonInfo comparisonSeasonInfo, sq3 sq3Var) {
        nyg nygVar;
        int i3;
        int i4;
        ComparisonSeasonInfo comparisonSeasonInfo2;
        Object a;
        x63 x63Var;
        Object obj;
        y83 y83Var;
        m93 m93Var;
        e93 v;
        Object obj2;
        int i5 = i2;
        if (sq3Var instanceof nyg) {
            nygVar = (nyg) sq3Var;
            int i6 = nygVar.w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                nygVar.w = i6 - Integer.MIN_VALUE;
                nyg nygVar2 = nygVar;
                Object obj3 = nygVar2.u;
                Object obj4 = lu3.a;
                i3 = nygVar2.w;
                LinkedHashMap linkedHashMap = this.q;
                int i7 = 2;
                if (i3 != 0) {
                    y6a.M(obj3);
                    e93 v2 = v(i);
                    if (v2 == null) {
                        return Unit.a;
                    }
                    i4 = i;
                    linkedHashMap.put(v2, new lyg(i4, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
                    n(null, new ayg(v2, new jyg(this, v2, i7)));
                    A();
                    comparisonSeasonInfo2 = comparisonSeasonInfo;
                    nygVar2.t = comparisonSeasonInfo2;
                    nygVar2.r = i4;
                    nygVar2.s = i5;
                    nygVar2.w = 1;
                    a = this.u.a(i5, nygVar2);
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            y6a.M(obj3);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = nygVar2.s;
                    int i8 = nygVar2.r;
                    ComparisonSeasonInfo comparisonSeasonInfo3 = nygVar2.t;
                    y6a.M(obj3);
                    i4 = i8;
                    a = obj3;
                    comparisonSeasonInfo2 = comparisonSeasonInfo3;
                }
                x63Var = (x63) a;
                if (x63Var != null) {
                    return Unit.a;
                }
                gv9 gv9Var = x63Var.b;
                if (comparisonSeasonInfo2 != null) {
                    y83 a2 = qyg.a(comparisonSeasonInfo2, gv9Var);
                    if (a2 != null) {
                        if (!(comparisonSeasonInfo2 instanceof ComparisonSeasonInfo.TennisYearInfo)) {
                            if (!(comparisonSeasonInfo2 instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo)) {
                                zzl.b();
                                return null;
                            }
                            ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo = (ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo2;
                            comparisonSeasonInfo2 = ComparisonSeasonInfo.UniqueTournamentSeasonInfo.a(uniqueTournamentSeasonInfo, qyg.c(uniqueTournamentSeasonInfo.c, a2.b));
                        }
                        if (comparisonSeasonInfo2 == null) {
                            String str = qyg.a;
                            Iterator<E> it = gv9Var.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (qyg.b((m93) obj2, comparisonSeasonInfo2)) {
                                    break;
                                }
                            }
                            m93Var = (m93) obj2;
                        } else {
                            m93Var = null;
                        }
                        y83 a3 = comparisonSeasonInfo2 == null ? qyg.a(comparisonSeasonInfo2, gv9Var) : null;
                        v = v(i4);
                        if (v != null) {
                            return Unit.a;
                        }
                        ComparisonSeasonInfo comparisonSeasonInfo4 = comparisonSeasonInfo2;
                        linkedHashMap.put(v, new lyg(i4, new c73(x63Var.a, 6), x63Var.b, comparisonSeasonInfo4, 112));
                        int i9 = i5;
                        n(null, new ayg(v, new yx1(x63Var, this, v, m93Var, comparisonSeasonInfo4, a3, 5)));
                        if (comparisonSeasonInfo4 == null) {
                            A();
                            return Unit.a;
                        }
                        nygVar2.t = null;
                        nygVar2.r = i4;
                        nygVar2.s = i9;
                        nygVar2.w = 2;
                    }
                } else {
                    String str2 = qyg.a;
                }
                Iterator<E> it2 = gv9Var.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (!((m93) obj).c.isEmpty()) {
                        break;
                    }
                }
                m93 m93Var2 = (m93) obj;
                if (m93Var2 == null || (y83Var = (y83) CollectionsKt.firstOrNull(m93Var2.c)) == null) {
                    comparisonSeasonInfo2 = null;
                } else {
                    ComparisonSeasonInfo comparisonSeasonInfo5 = y83Var.c;
                    if (comparisonSeasonInfo5 instanceof ComparisonSeasonInfo.TennisYearInfo) {
                        comparisonSeasonInfo2 = comparisonSeasonInfo5;
                    } else {
                        if (!(comparisonSeasonInfo5 instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo)) {
                            zzl.b();
                            return null;
                        }
                        comparisonSeasonInfo2 = ComparisonSeasonInfo.UniqueTournamentSeasonInfo.a((ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo5, qyg.c(null, y83Var.b));
                    }
                }
                if (comparisonSeasonInfo2 == null) {
                }
                if (comparisonSeasonInfo2 == null) {
                }
                v = v(i4);
                if (v != null) {
                }
            }
        }
        nygVar = new nyg(this, sq3Var);
        nyg nygVar22 = nygVar;
        Object obj32 = nygVar22.u;
        Object obj42 = lu3.a;
        i3 = nygVar22.w;
        LinkedHashMap linkedHashMap2 = this.q;
        int i72 = 2;
        if (i3 != 0) {
        }
        x63Var = (x63) a;
        if (x63Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(int i, int i2, ComparisonSeasonInfo comparisonSeasonInfo, sq3 sq3Var) {
        oyg oygVar;
        int i3;
        lyg lygVar;
        ComparisonSeasonInfo comparisonSeasonInfo2;
        int i4;
        lyg lygVar2;
        i93 i93Var;
        LinkedHashMap linkedHashMap;
        d73 d73Var;
        gv9 gv9Var;
        d73 d73Var2;
        if (sq3Var instanceof oyg) {
            oygVar = (oyg) sq3Var;
            int i5 = oygVar.w;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oygVar.w = i5 - Integer.MIN_VALUE;
                Object obj = oygVar.u;
                lu3 lu3Var = lu3.a;
                i3 = oygVar.w;
                LinkedHashMap linkedHashMap2 = this.q;
                if (i3 != 0) {
                    y6a.M(obj);
                    e93 v = v(i);
                    if (v == null || (lygVar = (lyg) linkedHashMap2.get(v)) == null) {
                        return Unit.a;
                    }
                    qo2 qo2Var = lygVar.b.a;
                    if (qo2Var == null) {
                        return Unit.a;
                    }
                    oygVar.s = comparisonSeasonInfo;
                    oygVar.t = lygVar;
                    oygVar.r = i;
                    oygVar.w = 1;
                    Object c = this.u.c(i2, qo2Var, comparisonSeasonInfo, oygVar);
                    if (c == lu3Var) {
                        return lu3Var;
                    }
                    comparisonSeasonInfo2 = comparisonSeasonInfo;
                    i4 = i;
                    lygVar2 = lygVar;
                    obj = c;
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = oygVar.r;
                    lyg lygVar3 = oygVar.t;
                    comparisonSeasonInfo2 = oygVar.s;
                    y6a.M(obj);
                    lygVar2 = lygVar3;
                }
                i93Var = (i93) obj;
                if (i93Var != null) {
                    return Unit.a;
                }
                y83 a = qyg.a(comparisonSeasonInfo2, lygVar2.c);
                Season season = a != null ? a.a : null;
                if (i93Var instanceof g93) {
                    gyg gygVar = (gyg) l().a();
                    String str = gygVar != null ? gygVar.h : null;
                    g93 g93Var = (g93) i93Var;
                    d73 d73Var3 = g93Var.a;
                    LinkedHashMap linkedHashMap3 = g93Var.b;
                    d73Var2 = (d73) linkedHashMap3.get(str);
                    if (d73Var2 == null) {
                        d73Var2 = d73Var3;
                    }
                    gv9Var = g93Var.c;
                    d73Var = d73Var3;
                    linkedHashMap = linkedHashMap3;
                } else {
                    if (!(i93Var instanceof h93)) {
                        zzl.b();
                        return null;
                    }
                    linkedHashMap = null;
                    d73Var = null;
                    gv9Var = null;
                    d73Var2 = ((h93) i93Var).a;
                }
                e93 v2 = v(i4);
                if (v2 == null) {
                    return Unit.a;
                }
                linkedHashMap2.put(v2, lyg.a(lygVar2, c73.a(lygVar2.b, season, d73Var2, 1), null, linkedHashMap, d73Var, gv9Var, 13));
                C();
                A();
                return Unit.a;
            }
        }
        oygVar = new oyg(this, sq3Var);
        Object obj2 = oygVar.u;
        lu3 lu3Var2 = lu3.a;
        i3 = oygVar.w;
        LinkedHashMap linkedHashMap22 = this.q;
        if (i3 != 0) {
        }
        i93Var = (i93) obj2;
        if (i93Var != null) {
        }
    }

    public final void z(nxg nxgVar) {
        ComparisonSeasonInfo comparisonSeasonInfo;
        qo2 qo2Var;
        Object obj;
        y83 y83Var;
        gv9 gv9Var;
        Object obj2;
        Object obj3;
        Object next;
        lyg lygVar;
        nxg nxgVar2 = nxgVar;
        if (nxgVar2 instanceof exg) {
            gyg gygVar = (gyg) l().a();
            if (gygVar == null) {
                return;
            }
            k(new sxg(((exg) nxgVar2).a, gygVar.a, gygVar.b));
            return;
        }
        boolean z = nxgVar2 instanceof fxg;
        LinkedHashMap linkedHashMap = this.q;
        Object obj4 = null;
        r6 = null;
        ComparisonSeasonInfo comparisonSeasonInfo2 = null;
        if (z) {
            e93 e93Var = ((fxg) nxgVar2).a;
            gyg gygVar2 = (gyg) l().a();
            if (gygVar2 != null && !gygVar2.d.containsKey(e93Var)) {
                int i = this.t;
                this.t = i + 1;
                linkedHashMap.put(e93Var, new lyg(i, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
                n(null, new jyg(e93Var, this));
                A();
            }
            lyg lygVar2 = (lyg) linkedHashMap.get(e93Var);
            if (lygVar2 != null) {
                int i2 = lygVar2.a;
                Set entrySet = linkedHashMap.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : entrySet) {
                    Map.Entry entry = (Map.Entry) obj5;
                    e93 e93Var2 = (e93) entry.getKey();
                    lyg lygVar3 = (lyg) entry.getValue();
                    if (e93Var2 != e93Var && lygVar3.d != null) {
                        arrayList.add(obj5);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int ordinal = ((e93) ((Map.Entry) next).getKey()).ordinal();
                        while (true) {
                            Object next2 = it.next();
                            int ordinal2 = ((e93) ((Map.Entry) next2).getKey()).ordinal();
                            if (ordinal > ordinal2) {
                                next = next2;
                                ordinal = ordinal2;
                            }
                            if (!it.hasNext()) {
                                break;
                            }
                            i2 = i2;
                            nxgVar2 = nxgVar2;
                        }
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null && (lygVar = (lyg) entry2.getValue()) != null) {
                    comparisonSeasonInfo2 = lygVar.d;
                }
                int i3 = i2;
                w(i3, new bs2(this, i3, nxgVar2, comparisonSeasonInfo2, null, 7));
                return;
            }
            return;
        }
        if (nxgVar2 instanceof jxg) {
            e93 e93Var3 = ((jxg) nxgVar2).a;
            lyg lygVar4 = (lyg) linkedHashMap.get(e93Var3);
            if (lygVar4 == null) {
                return;
            }
            ComparisonSeasonInfo comparisonSeasonInfo3 = lygVar4.d;
            ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo = comparisonSeasonInfo3 instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo ? (ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo3 : null;
            k(new txg(e93Var3, uniqueTournamentSeasonInfo != null ? Integer.valueOf(uniqueTournamentSeasonInfo.a) : null));
            return;
        }
        if (nxgVar2 instanceof kxg) {
            kxg kxgVar = (kxg) nxgVar2;
            e93 e93Var4 = kxgVar.a;
            ComparisonSeasonInfo comparisonSeasonInfo4 = kxgVar.b;
            lyg lygVar5 = (lyg) linkedHashMap.get(e93Var4);
            if (lygVar5 == null) {
                return;
            }
            gv9 gv9Var2 = lygVar5.c;
            if (!(comparisonSeasonInfo4 instanceof ComparisonSeasonInfo.TennisYearInfo)) {
                if (!(comparisonSeasonInfo4 instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo)) {
                    zzl.b();
                    return;
                }
                Iterator<E> it2 = gv9Var2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    Integer num = ((m93) obj).a;
                    int i4 = ((ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo4).a;
                    if (num != null && num.intValue() == i4) {
                        break;
                    }
                }
                m93 m93Var = (m93) obj;
                if (m93Var == null || (gv9Var = m93Var.c) == null) {
                    y83Var = null;
                } else {
                    Iterator<E> it3 = gv9Var.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (((y83) obj2).a.getId() == ((ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo4).b) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    y83Var = (y83) obj2;
                }
                ComparisonSeasonInfo comparisonSeasonInfo5 = lygVar5.d;
                ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo2 = comparisonSeasonInfo5 instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo ? (ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo5 : null;
                String str = uniqueTournamentSeasonInfo2 != null ? uniqueTournamentSeasonInfo2.c : null;
                List list = y83Var != null ? y83Var.b : null;
                if (list == null) {
                    list = km5.a;
                }
                comparisonSeasonInfo4 = ComparisonSeasonInfo.UniqueTournamentSeasonInfo.a((ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo4, qyg.c(str, list));
            }
            ComparisonSeasonInfo comparisonSeasonInfo6 = comparisonSeasonInfo4;
            linkedHashMap.put(e93Var4, lyg.a(lygVar5, null, comparisonSeasonInfo6, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
            String str2 = qyg.a;
            Iterator<E> it4 = gv9Var2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    obj3 = it4.next();
                    if (qyg.b((m93) obj3, comparisonSeasonInfo6)) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            n(null, new ayg(e93Var4, new lwc((m93) obj3, this, comparisonSeasonInfo6, qyg.a(comparisonSeasonInfo6, gv9Var2), 7)));
            qo2 qo2Var2 = lygVar5.b.a;
            if (qo2Var2 != null) {
                int i5 = qo2Var2.a;
                int i6 = lygVar5.a;
                w(i6, new myg(this, i6, i5, comparisonSeasonInfo6, null, 0));
                return;
            }
            return;
        }
        if (nxgVar2 instanceof lxg) {
            lxg lxgVar = (lxg) nxgVar2;
            e93 e93Var5 = lxgVar.a;
            String str3 = lxgVar.b;
            lyg lygVar6 = (lyg) linkedHashMap.get(e93Var5);
            if (lygVar6 == null || (comparisonSeasonInfo = lygVar6.d) == null || (qo2Var = lygVar6.b.a) == null) {
                return;
            }
            int i7 = qo2Var.a;
            ComparisonSeasonInfo b = this.u.b(comparisonSeasonInfo, str3);
            linkedHashMap.put(e93Var5, lyg.a(lygVar6, null, b, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
            n(null, new ayg(e93Var5, new jp1(str3, 27)));
            int i8 = lygVar6.a;
            w(i8, new myg(this, i8, i7, b, null, 1));
            return;
        }
        if (nxgVar2 instanceof gxg) {
            String str4 = ((gxg) nxgVar2).a;
            n(null, new jp1(str4, 26));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                e93 e93Var6 = (e93) entry3.getKey();
                lyg lygVar7 = (lyg) entry3.getValue();
                Map map = lygVar7.e;
                c73 c73Var = lygVar7.b;
                if (map != null) {
                    d73 d73Var = (d73) map.get(str4);
                    if (d73Var == null) {
                        d73Var = c73Var.c;
                    }
                    linkedHashMap.put(e93Var6, lyg.a(lygVar7, c73.a(c73Var, null, d73Var, 3), null, null, null, null, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
                }
            }
            A();
            return;
        }
        if (nxgVar2 instanceof cxg) {
            gyg gygVar3 = (gyg) l().a();
            if (gygVar3 == null) {
                return;
            }
            Iterator<E> it5 = e93.d.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next3 = it5.next();
                i73 i73Var = (i73) gygVar3.d.get((e93) next3);
                if ((i73Var != null ? i73Var.a : null) == null) {
                    obj4 = next3;
                    break;
                }
            }
            e93 e93Var7 = (e93) obj4;
            if (e93Var7 == null) {
                return;
            }
            k(new sxg(e93Var7, gygVar3.a, gygVar3.b));
            return;
        }
        if (!(nxgVar2 instanceof ixg)) {
            if ((nxgVar2 instanceof dxg) || (nxgVar2 instanceof mxg) || (nxgVar2 instanceof hxg)) {
                return;
            }
            zzl.b();
            return;
        }
        e93 e93Var8 = ((ixg) nxgVar2).a;
        gyg gygVar4 = (gyg) l().a();
        if (gygVar4 != null && gygVar4.d.size() > 2) {
            lyg lygVar8 = (lyg) linkedHashMap.get(e93Var8);
            if (lygVar8 != null) {
                yda ydaVar = (yda) this.r.remove(new hlh(lygVar8.a));
                if (ydaVar != null) {
                    ydaVar.e(null);
                }
            }
            tee u = u(linkedHashMap, e93Var8);
            linkedHashMap.clear();
            linkedHashMap.putAll(u);
            n(null, new jyg(this, e93Var8, 0));
            C();
            A();
        }
    }
}
