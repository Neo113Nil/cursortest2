package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Trace;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandingTournament;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.service.ShortcutWorker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class c30 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c30(boolean z, Function0 function0, Function0 function02, Function1 function1) {
        this.a = 4;
        this.b = z;
        this.c = function0;
        this.d = function02;
        this.e = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String w;
        Integer valueOf;
        UniqueTournament uniqueTournament;
        Object obj2;
        Object obj3;
        String x;
        z46 z46Var;
        x0f b;
        UniqueTournament uniqueTournament2;
        int id;
        String x2;
        String secondaryColorHex;
        GradientDrawable gradientDrawable;
        d4j d4jVar;
        d4j d4jVar2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        int i = this.a;
        int i2 = 0;
        int i3 = 10;
        gv9 gv9Var = null;
        boolean z = this.b;
        int i4 = 1;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                a10 a10Var = (a10) obj5;
                ay1 ay1Var = (ay1) obj4;
                yma ymaVar = (yma) obj;
                ymaVar.a();
                wj2 wj2Var = ymaVar.a;
                if (!((Boolean) ((Function0) obj6).invoke()).booleanValue()) {
                    return Unit.a;
                }
                if (z) {
                    long O0 = wj2Var.O0();
                    sx2 sx2Var = wj2Var.b;
                    long D = sx2Var.D();
                    sx2Var.t().o();
                    try {
                        ((hpo) sx2Var.a).G(-1.0f, 1.0f, O0);
                        ha5.x(ymaVar, a10Var, 0L, ay1Var, 46);
                    } finally {
                        mz1.v(sx2Var, D);
                    }
                } else {
                    ha5.x(ymaVar, a10Var, 0L, ay1Var, 46);
                }
                return Unit.a;
            case 1:
                gv9 gv9Var2 = (gv9) obj6;
                gv9 gv9Var3 = (gv9) obj5;
                gv9 gv9Var4 = (gv9) obj4;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                if (!gv9Var2.isEmpty()) {
                    fqj.E(esaVar, "batters", R.string.baseball_batting_order, gv9Var2);
                }
                if (!gv9Var3.isEmpty()) {
                    fqj.E(esaVar, "pitchers", z ? R.string.baseball_starting_pitchers : R.string.probable_pitchers, gv9Var3);
                }
                if (!gv9Var4.isEmpty()) {
                    fqj.E(esaVar, "injuries", R.string.injuries_and_suspensions, gv9Var4);
                }
                return Unit.a;
            case 2:
                LeagueActivity leagueActivity = (LeagueActivity) obj6;
                mqi mqiVar = leagueActivity.M;
                Brand brand = (Brand) obj5;
                BrandingTournament brandingTournament = (BrandingTournament) obj4;
                Pair pair = (Pair) obj;
                a99 a99Var = LeagueActivity.h0;
                Tournament tournament = (Tournament) pair.a;
                List list = (List) pair.b;
                UniqueTournament uniqueTournament3 = tournament.getUniqueTournament();
                Intent intent = leagueActivity.getIntent();
                intent.getClass();
                nv.f0(leagueActivity, uniqueTournament3, intent);
                Pair pair2 = new Pair("ACTION", "ADD_TOURNAMENT");
                Pair pair3 = new Pair("TOURNAMENT_ID", Integer.valueOf(tournament.getId()));
                UniqueTournament uniqueTournament4 = tournament.getUniqueTournament();
                Pair pair4 = new Pair("TOURNAMENT_UNIQUE_ID", Integer.valueOf(uniqueTournament4 != null ? uniqueTournament4.getId() : 0));
                UniqueTournament uniqueTournament5 = tournament.getUniqueTournament();
                if (uniqueTournament5 == null || (w = tba.x(uniqueTournament5)) == null) {
                    w = tba.w(tournament);
                }
                Pair[] pairArr = {pair2, pair3, pair4, new Pair("TOURNAMENT_NAME", w)};
                hpo hpoVar = new hpo(18);
                for (int i5 = 0; i5 < 4; i5++) {
                    Pair pair5 = pairArr[i5];
                    hpoVar.B(pair5.b, (String) pair5.a);
                }
                md4 l = hpoVar.l();
                ktd g = vxd.g(ShortcutWorker.class, l);
                Context applicationContext = leagueActivity.getApplicationContext();
                applicationContext.getClass();
                xbl d = xbl.d(applicationContext);
                d.getClass();
                d.b("ShortcutWorker-".concat(mha.o(l)), nf6.a, (ltd) g.a());
                if (z) {
                    LinearLayout linearLayout = leagueActivity.S().c;
                    f32 f32Var = new f32(leagueActivity, 1);
                    f32.a(f32Var, brand, Integer.valueOf(leagueActivity.T()), null, brandingTournament.getTakeoverImageHeight(), BrandLocation.LeagueScreen, 4);
                    Context context = f32Var.getContext();
                    context.getClass();
                    c1g L = tz9.L(context, brandingTournament.getBackgroundColor(), brandingTournament.getBackgroundGradientColor());
                    if (L == null) {
                        gradientDrawable = null;
                    } else {
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                        int i6 = L.a;
                        gradientDrawable = new GradientDrawable(orientation, new int[]{i6, L.b, i6});
                    }
                    f32Var.setBackground(gradientDrawable);
                    linearLayout.removeAllViews();
                    linearLayout.addView(f32Var);
                    linearLayout.setVisibility(0);
                } else {
                    AdBannerView adBannerView = leagueActivity.S().b;
                    ltb ltbVar = new ltb();
                    String m = leagueActivity.R().m();
                    if (m != null) {
                        ltbVar.put(SearchResponseKt.SPORT_ENTITY, m);
                    }
                    ltbVar.put("unique_tournament_id", String.valueOf(leagueActivity.T()));
                    ltbVar.put("page", "tournament");
                    leagueActivity.I(adBannerView, ltbVar.d());
                }
                yta R = leagueActivity.R();
                UniqueTournament uniqueTournament6 = tournament.getUniqueTournament();
                if (uniqueTournament6 != null && (secondaryColorHex = uniqueTournament6.getSecondaryColorHex()) != null) {
                    if (secondaryColorHex.length() <= 0) {
                        secondaryColorHex = null;
                    }
                    if (secondaryColorHex != null) {
                        valueOf = Integer.valueOf(k53.f0(Color.parseColor(secondaryColorHex), leagueActivity));
                        R.n = valueOf;
                        leagueActivity.S().m.setRefreshing(false);
                        leagueActivity.S().m.setEnabled(false);
                        int i7 = 8;
                        ((TextView) leagueActivity.S().g.g).setVisibility(8);
                        as9.q((ImageView) leagueActivity.S().g.d, Integer.valueOf(leagueActivity.T()), ((Number) leagueActivity.K.getValue()).intValue(), null);
                        ((ImageView) leagueActivity.S().g.d).setBackground(leagueActivity.getDrawable(R.drawable.rounded_surface_level_4));
                        ((Spinner) leagueActivity.S().g.k).setVisibility(0);
                        uniqueTournament = tournament.getUniqueTournament();
                        if (uniqueTournament != null) {
                            iz8.D(leagueActivity.S().g, uniqueTournament, false);
                        }
                        String str = "";
                        if (list.isEmpty()) {
                            obj2 = null;
                            if (leagueActivity.c0 == null) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        int id2 = ((Season) obj3).getId();
                                        Integer num = (Integer) mqiVar.getValue();
                                        if (num != null && id2 == num.intValue()) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                Season season = (Season) obj3;
                                if (season == null) {
                                    season = (Season) list.get(0);
                                }
                                int size = list.size();
                                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((Season) it2.next()).getYear());
                                }
                                boolean z2 = size > CollectionsKt.W0(arrayList).size();
                                leagueActivity.a0 = z2;
                                if (z2) {
                                    leagueActivity.b0 = true;
                                    leagueActivity.Q(season);
                                }
                                TextView textView = (TextView) leagueActivity.S().g.i;
                                String w2 = tba.w(tournament);
                                if (w2.length() == 0) {
                                    UniqueTournament uniqueTournament7 = tournament.getUniqueTournament();
                                    if (uniqueTournament7 != null && (x = tba.x(uniqueTournament7)) != null) {
                                        str = x;
                                    }
                                    w2 = str;
                                }
                                textView.setText(w2);
                                lza lzaVar = new lza(leagueActivity, leagueActivity.R().m(), list);
                                ((Spinner) leagueActivity.S().g.k).setAdapter((SpinnerAdapter) lzaVar);
                                Integer num2 = leagueActivity.Y;
                                if (num2 != null) {
                                    ((Spinner) leagueActivity.S().g.k).setSelection(num2.intValue());
                                } else {
                                    Integer num3 = (Integer) mqiVar.getValue();
                                    if (num3 != null) {
                                        int intValue = num3.intValue();
                                        Spinner spinner = (Spinner) leagueActivity.S().g.k;
                                        int size2 = lzaVar.b.size();
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= size2) {
                                                i8 = 0;
                                            } else if (((Season) lzaVar.b.get(i8)).getId() != intValue) {
                                                i8++;
                                            }
                                        }
                                        spinner.setSelection(i8);
                                    }
                                }
                                leagueActivity.c0 = lzaVar;
                                if (leagueActivity.a0) {
                                    Spinner spinner2 = (Spinner) leagueActivity.S().g.k;
                                    spinner2.setClickable(false);
                                    spinner2.setFocusable(false);
                                    spinner2.setOnTouchListener(new z93(i4, leagueActivity, list));
                                    ((LinearLayout) leagueActivity.S().g.f).setOnClickListener(new au7(13, leagueActivity, list));
                                } else {
                                    Spinner spinner3 = (Spinner) leagueActivity.S().g.k;
                                    spinner3.setOnItemSelectedListener(new vu1(spinner3, new jw5(leagueActivity, i7), 1));
                                }
                            }
                        } else {
                            if (leagueActivity.T() != 0) {
                                yta R2 = leagueActivity.R();
                                String m2 = leagueActivity.R().m();
                                if (m2 == null) {
                                    m2 = "";
                                }
                                obj2 = null;
                                xw3.L(un0.z(R2), null, null, new xta(null, R2, null, m2), 3);
                            } else {
                                obj2 = null;
                                leagueActivity.U().x(a.c(y4b.d));
                            }
                            leagueActivity.S().l.c(0, false);
                            leagueActivity.W();
                            TextView textView2 = (TextView) leagueActivity.S().g.g;
                            String w3 = tba.w(tournament);
                            if (w3.length() == 0) {
                                UniqueTournament uniqueTournament8 = tournament.getUniqueTournament();
                                if (uniqueTournament8 != null && (x2 = tba.x(uniqueTournament8)) != null) {
                                    str = x2;
                                }
                                w3 = str;
                            }
                            textView2.setText(w3);
                            ((TextView) leagueActivity.S().g.i).setVisibility(8);
                            ((TextView) leagueActivity.S().g.g).setVisibility(0);
                            ((Spinner) leagueActivity.S().g.k).setVisibility(8);
                        }
                        leagueActivity.V(tournament.getUniqueTournament());
                        yea yeaVar = j58.a;
                        if (fn0.B("featured_tournament_chat_active") && (uniqueTournament2 = tournament.getUniqueTournament()) != null) {
                            id = uniqueTournament2.getId();
                            rv7.c.getClass();
                            if (id == 270) {
                                pco.G(leagueActivity.S().f, new l97(12, leagueActivity, tournament, (Season) CollectionsKt.firstOrNull(list)));
                                if (leagueActivity.R().m) {
                                    leagueActivity.S().f.y(0);
                                } else {
                                    leagueActivity.S().i.a(new kta(leagueActivity, 0));
                                }
                            }
                        }
                        z46Var = (z46) leagueActivity.R().E.a.d();
                        if (z46Var != null) {
                            obj2 = z46Var.a;
                        }
                        if (Intrinsics.c((Boolean) obj2, Boolean.FALSE) && !leagueActivity.R().s) {
                            Set set = aef.a;
                            b = aef.b(leagueActivity, tournament, fv.LEAGUE_SCREEN);
                            if (b != null && leagueActivity.z().a(b)) {
                                aef.c(leagueActivity.A(), b.i);
                            }
                        }
                        return Unit.a;
                    }
                }
                valueOf = Integer.valueOf(leagueActivity.getColor(R.color.primary_default));
                R.n = valueOf;
                leagueActivity.S().m.setRefreshing(false);
                leagueActivity.S().m.setEnabled(false);
                int i72 = 8;
                ((TextView) leagueActivity.S().g.g).setVisibility(8);
                as9.q((ImageView) leagueActivity.S().g.d, Integer.valueOf(leagueActivity.T()), ((Number) leagueActivity.K.getValue()).intValue(), null);
                ((ImageView) leagueActivity.S().g.d).setBackground(leagueActivity.getDrawable(R.drawable.rounded_surface_level_4));
                ((Spinner) leagueActivity.S().g.k).setVisibility(0);
                uniqueTournament = tournament.getUniqueTournament();
                if (uniqueTournament != null) {
                }
                String str2 = "";
                if (list.isEmpty()) {
                }
                leagueActivity.V(tournament.getUniqueTournament());
                yea yeaVar2 = j58.a;
                if (fn0.B("featured_tournament_chat_active")) {
                    id = uniqueTournament2.getId();
                    rv7.c.getClass();
                    if (id == 270) {
                    }
                }
                z46Var = (z46) leagueActivity.R().E.a.d();
                if (z46Var != null) {
                }
                if (Intrinsics.c((Boolean) obj2, Boolean.FALSE)) {
                    Set set2 = aef.a;
                    b = aef.b(leagueActivity, tournament, fv.LEAGUE_SCREEN);
                    if (b != null) {
                        aef.c(leagueActivity.A(), b.i);
                    }
                }
                return Unit.a;
            case 3:
                osa osaVar = (osa) obj6;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                esa.d(esaVar2, null, null, new tc3(-986745465, new l4b(z, (vnb) obj5, (Function1) obj4, 5), true), 3);
                if (osaVar.c() == 0) {
                    esa.d(esaVar2, null, null, lz.e, 3);
                } else {
                    esa.e(esaVar2, osaVar.c(), null, new isa(18), new tc3(-433123526, new j4b(osaVar, i2), true), 2);
                }
                return Unit.a;
            case 4:
                return new dfh(this.b, (Function0) obj6, (Function0) obj5, (efh) obj, (Function1) obj4);
            case 5:
                List list2 = (List) obj6;
                Function1 function1 = (Function1) obj5;
                e1d e1dVar = (e1d) obj4;
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                List L0 = CollectionsKt.L0(list2, 4);
                wqg wqgVar = new wqg(14);
                int size3 = L0.size();
                wsd wsdVar = new wsd(i3, wqgVar, L0);
                dyg dygVar = new dyg(L0, 2);
                boolean z3 = this.b;
                esaVar3.a(size3, wsdVar, dygVar, new tc3(2039820996, new yzh(L0, z3, function1, e1dVar, 0), true));
                esa.d(esaVar3, "pinned_divider", null, l6g.d, 2);
                List S = CollectionsKt.S(list2, 4);
                esaVar3.a(S.size(), new wsd(11, new wqg(15), S), new dyg(S, 3), new tc3(2039820996, new yzh(S, z3, function1, e1dVar, 1), true));
                return Unit.a;
            case 6:
                j4j j4jVar = (j4j) obj6;
                j4j j4jVar2 = (j4j) obj5;
                l4j l4jVar = (l4j) obj4;
                i4j i4jVar = (i4j) obj;
                i4jVar.getClass();
                e4j t = j4jVar != null ? l4j.t(j4jVar) : i4jVar.a;
                e4j t2 = j4jVar2 != null ? l4j.t(j4jVar2) : i4jVar.b;
                Boolean valueOf2 = t != null ? Boolean.valueOf(t.a.c) : null;
                Boolean valueOf3 = t2 != null ? Boolean.valueOf(t2.a.c) : null;
                boolean z4 = this.b;
                if (valueOf2 == null || valueOf3 == null || valueOf2.equals(valueOf3)) {
                    if (yid.m(t2 != null ? Integer.valueOf(t2.b) : null) + yid.m(t != null ? Integer.valueOf(t.b) : null) != 0) {
                        if (z4) {
                            if (yid.m(t2 != null ? Integer.valueOf(t2.c) : null) + yid.m(t != null ? Integer.valueOf(t.c) : null) == 0) {
                                d4jVar2 = d4j.NoMajorTrophies;
                            }
                        }
                        d4jVar = null;
                        if (d4jVar == null) {
                            j4j j4jVar3 = l4jVar.m;
                            if (j4jVar3 != null) {
                                ArrayList u = l4j.u(j4jVar3, z4);
                                linkedHashMap = new LinkedHashMap();
                                Iterator it3 = u.iterator();
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    wk2 wk2Var = ((h4j) next).a;
                                    Object obj7 = linkedHashMap.get(wk2Var);
                                    if (obj7 == null) {
                                        obj7 = new ArrayList();
                                        linkedHashMap.put(wk2Var, obj7);
                                    }
                                    ((List) obj7).add(next);
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            j4j j4jVar4 = l4jVar.n;
                            if (j4jVar4 != null) {
                                ArrayList u2 = l4j.u(j4jVar4, z4);
                                linkedHashMap2 = new LinkedHashMap();
                                Iterator it4 = u2.iterator();
                                while (it4.hasNext()) {
                                    Object next2 = it4.next();
                                    wk2 wk2Var2 = ((h4j) next2).a;
                                    Object obj8 = linkedHashMap2.get(wk2Var2);
                                    if (obj8 == null) {
                                        obj8 = new ArrayList();
                                        linkedHashMap2.put(wk2Var2, obj8);
                                    }
                                    ((List) obj8).add(next2);
                                }
                            } else {
                                linkedHashMap2 = null;
                            }
                            Set keySet = linkedHashMap != null ? linkedHashMap.keySet() : null;
                            if (keySet == null) {
                                keySet = rm5.a;
                            }
                            Set keySet2 = linkedHashMap2 != null ? linkedHashMap2.keySet() : null;
                            if (keySet2 == null) {
                                keySet2 = rm5.a;
                            }
                            List<wk2> G0 = CollectionsKt.G0(y9h.f(keySet, keySet2));
                            ArrayList arrayList2 = new ArrayList(k13.r(G0, 10));
                            for (wk2 wk2Var3 : G0) {
                                List list3 = linkedHashMap != null ? (List) linkedHashMap.get(wk2Var3) : null;
                                if (list3 == null) {
                                    list3 = km5.a;
                                }
                                List list4 = linkedHashMap2 != null ? (List) linkedHashMap2.get(wk2Var3) : null;
                                if (list4 == null) {
                                    list4 = km5.a;
                                }
                                arrayList2.add(new g4j(wk2Var3, l6g.W(yso.M(list3, list4))));
                            }
                            gv9Var = l6g.W(arrayList2);
                        }
                        return new i4j(t, t2, gv9Var, z4, d4jVar);
                    }
                    d4jVar2 = d4j.NoTrophies;
                } else {
                    d4jVar2 = d4j.DifferentTeamTypes;
                }
                d4jVar = d4jVar2;
                if (d4jVar == null) {
                }
                return new i4j(t, t2, gv9Var, z4, d4jVar);
            default:
                kdb kdbVar = (kdb) obj6;
                String str3 = (String) obj5;
                gdl gdlVar = (gdl) obj4;
                Throwable th = (Throwable) obj;
                if (th instanceof wcl) {
                    kdbVar.stop(((wcl) th).a);
                }
                if (z && str3 != null) {
                    int hashCode = gdlVar.a.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        yrj.b(h5a.U(str3), hashCode);
                    } else {
                        String U = h5a.U(str3);
                        try {
                            Method method = h5a.h;
                            if (method == null) {
                                method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                                h5a.h = method;
                            }
                            method.invoke(null, Long.valueOf(h5a.e), U, Integer.valueOf(hashCode));
                        } catch (Exception e) {
                            h5a.L(e);
                        }
                    }
                }
                return Unit.a;
        }
    }

    public /* synthetic */ c30(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ c30(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
