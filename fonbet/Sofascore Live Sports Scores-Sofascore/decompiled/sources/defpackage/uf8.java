package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.compose.PagingPlaceholderKey;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.inmobi.media.Ha;
import com.inmobi.media.Vf;
import com.ironsource.U3;
import com.sofascore.model.database.DbHomescreenFilter;
import com.sofascore.model.database.DisplayTypeConverter;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.model.newNetwork.PowerRankingRound;
import com.sofascore.model.newNetwork.UniqueTournamentTeamsResponse;
import com.sofascore.model.newNetwork.WSCGameData;
import com.sofascore.model.newNetwork.WSCStory;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatVoteBottomSheet;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.player.statistics.regular.view.PlayerPenaltyShotView;
import com.sofascore.results.view.graph.networkanimation.PassingNetworkAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class uf8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uf8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0943  */
    /* JADX WARN: Type inference failed for: r5v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r5v64 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Pair pair;
        rq3 rq3Var;
        cdi g6kVar;
        Object invoke;
        Object obj2;
        Typeface f;
        Object obj3;
        Collection collection;
        List<Team> teams;
        int i = 5;
        int i2 = 6;
        String F0 = null;
        DbHomescreenFilter dbHomescreenFilter = null;
        boolean z = true;
        z = true;
        int i3 = 0;
        switch (this.a) {
            case 0:
                vf8 vf8Var = (vf8) this.b;
                f6k f6kVar = (f6k) this.c;
                Function1 function1 = (Function1) obj;
                zf8 zf8Var = vf8Var.d;
                u00 u00Var = vf8Var.a;
                yx7 yx7Var = vf8Var.f;
                tf8 tf8Var = f6kVar.a;
                if (tf8Var instanceof yf8) {
                    List list = ((yf8) tf8Var).f;
                    wg8 wg8Var = f6kVar.b;
                    int i4 = f6kVar.c;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        Object obj4 = list.get(i5);
                        if (Intrinsics.c(((p1g) obj4).b, wg8Var) && i4 == 0) {
                            arrayList.add(obj4);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            Object obj5 = list.get(i6);
                            ((p1g) obj5).getClass();
                            if (i4 == 0) {
                                arrayList2.add(obj5);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list = arrayList2;
                        }
                        int compareTo = wg8Var.compareTo(wg8.b);
                        int i7 = wg8Var.a;
                        if (compareTo < 0) {
                            int size3 = list.size();
                            wg8 wg8Var2 = null;
                            wg8 wg8Var3 = null;
                            int i8 = 0;
                            while (true) {
                                if (i8 < size3) {
                                    wg8 wg8Var4 = ((p1g) list.get(i8)).b;
                                    int i9 = wg8Var4.a;
                                    if (Intrinsics.d(i9, i7) < 0) {
                                        if (wg8Var2 == null || Intrinsics.d(i9, wg8Var2.a) > 0) {
                                            wg8Var2 = wg8Var4;
                                        }
                                    } else if (Intrinsics.d(i9, i7) <= 0) {
                                        wg8Var2 = wg8Var4;
                                        wg8Var3 = wg8Var2;
                                    } else if (wg8Var3 == null || Intrinsics.d(i9, wg8Var3.a) < 0) {
                                        wg8Var3 = wg8Var4;
                                    }
                                    i8++;
                                }
                            }
                            if (wg8Var2 == null) {
                                wg8Var2 = wg8Var3;
                            }
                            ArrayList arrayList3 = new ArrayList(list.size());
                            int size4 = list.size();
                            for (int i10 = 0; i10 < size4; i10++) {
                                Object obj6 = list.get(i10);
                                if (Intrinsics.c(((p1g) obj6).b, wg8Var2)) {
                                    arrayList3.add(obj6);
                                }
                            }
                            arrayList = arrayList3;
                        } else {
                            wg8 wg8Var5 = wg8.c;
                            if (wg8Var.compareTo(wg8Var5) > 0) {
                                int size5 = list.size();
                                int i11 = 0;
                                wg8 wg8Var6 = null;
                                wg8 wg8Var7 = null;
                                while (true) {
                                    if (i11 < size5) {
                                        wg8 wg8Var8 = ((p1g) list.get(i11)).b;
                                        int i12 = wg8Var8.a;
                                        if (Intrinsics.d(i12, i7) < 0) {
                                            if (wg8Var6 == null || Intrinsics.d(i12, wg8Var6.a) > 0) {
                                                wg8Var6 = wg8Var8;
                                            }
                                        } else if (Intrinsics.d(i12, i7) <= 0) {
                                            wg8Var6 = wg8Var8;
                                            wg8Var7 = wg8Var6;
                                        } else if (wg8Var7 == null || Intrinsics.d(i12, wg8Var7.a) < 0) {
                                            wg8Var7 = wg8Var8;
                                        }
                                        i11++;
                                    }
                                }
                                if (wg8Var7 != null) {
                                    wg8Var6 = wg8Var7;
                                }
                                arrayList = new ArrayList(list.size());
                                int size6 = list.size();
                                for (int i13 = 0; i13 < size6; i13++) {
                                    Object obj7 = list.get(i13);
                                    if (Intrinsics.c(((p1g) obj7).b, wg8Var6)) {
                                        arrayList.add(obj7);
                                    }
                                }
                            } else {
                                int size7 = list.size();
                                int i14 = 0;
                                wg8 wg8Var9 = null;
                                wg8 wg8Var10 = null;
                                while (true) {
                                    if (i14 < size7) {
                                        wg8 wg8Var11 = ((p1g) list.get(i14)).b;
                                        if (Intrinsics.d(wg8Var11.a, wg8Var5.a) <= 0) {
                                            int i15 = wg8Var11.a;
                                            if (Intrinsics.d(i15, i7) < 0) {
                                                if (wg8Var9 == null || Intrinsics.d(i15, wg8Var9.a) > 0) {
                                                    wg8Var9 = wg8Var11;
                                                }
                                            } else if (Intrinsics.d(i15, i7) <= 0) {
                                                wg8Var9 = wg8Var11;
                                                wg8Var10 = wg8Var9;
                                            } else if (wg8Var10 == null || Intrinsics.d(i15, wg8Var10.a) < 0) {
                                                wg8Var10 = wg8Var11;
                                            }
                                        }
                                        i14++;
                                    }
                                }
                                if (wg8Var10 != null) {
                                    wg8Var9 = wg8Var10;
                                }
                                arrayList = new ArrayList(list.size());
                                int size8 = list.size();
                                for (int i16 = 0; i16 < size8; i16++) {
                                    Object obj8 = list.get(i16);
                                    if (Intrinsics.c(((p1g) obj8).b, wg8Var9)) {
                                        arrayList.add(obj8);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    wg8 wg8Var12 = wg8.c;
                                    int size9 = list.size();
                                    wg8 wg8Var13 = null;
                                    wg8 wg8Var14 = null;
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < size9) {
                                            wg8 wg8Var15 = ((p1g) list.get(i17)).b;
                                            if (wg8Var12 == null || Intrinsics.d(wg8Var15.a, wg8Var12.a) >= 0) {
                                                int i18 = wg8Var15.a;
                                                if (Intrinsics.d(i18, i7) < 0) {
                                                    if (wg8Var13 == null || Intrinsics.d(i18, wg8Var13.a) > 0) {
                                                        wg8Var13 = wg8Var15;
                                                    }
                                                } else if (Intrinsics.d(i18, i7) <= 0) {
                                                    wg8Var13 = wg8Var15;
                                                    wg8Var14 = wg8Var13;
                                                } else if (wg8Var14 == null || Intrinsics.d(i18, wg8Var14.a) < 0) {
                                                    wg8Var14 = wg8Var15;
                                                }
                                            }
                                            i17++;
                                        }
                                    }
                                    if (wg8Var14 != null) {
                                        wg8Var13 = wg8Var14;
                                    }
                                    arrayList = new ArrayList(list.size());
                                    int size10 = list.size();
                                    for (int i19 = 0; i19 < size10; i19++) {
                                        Object obj9 = list.get(i19);
                                        if (Intrinsics.c(((p1g) obj9).b, wg8Var13)) {
                                            arrayList.add(obj9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    sx2 sx2Var = zf8Var.a;
                    if (arrayList.size() > 0) {
                        p1g p1gVar = (p1g) arrayList.get(0);
                        p1gVar.getClass();
                        synchronized (((ubf) sx2Var.c)) {
                            try {
                                al0 al0Var = new al0(p1gVar);
                                zk0 zk0Var = (zk0) ((zmb) sx2Var.a).c(al0Var);
                                if (zk0Var == null) {
                                    zk0Var = (zk0) ((x0d) sx2Var.b).g(al0Var);
                                }
                                if (zk0Var != null) {
                                    obj2 = zk0Var.a;
                                } else {
                                    Unit unit = Unit.a;
                                    try {
                                        invoke = u00Var.a(p1gVar);
                                    } catch (Exception unused) {
                                        invoke = yx7Var.invoke(f6kVar);
                                    }
                                    sx2Var.getClass();
                                    al0 al0Var2 = new al0(p1gVar);
                                    synchronized (((ubf) sx2Var.c)) {
                                        try {
                                            if (invoke == null) {
                                                ((x0d) sx2Var.b).m(al0Var2, new zk0(null));
                                                Unit unit2 = Unit.a;
                                            } else {
                                                ((zmb) sx2Var.a).d(al0Var2, new zk0(invoke));
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    obj2 = invoke;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (obj2 == null) {
                            obj2 = yx7Var.invoke(f6kVar);
                        }
                        pair = new Pair(null, gvd.M(f6kVar.d, obj2, p1gVar, f6kVar.b, f6kVar.c));
                    } else {
                        pair = new Pair(null, yx7Var.invoke(f6kVar));
                    }
                    List list2 = (List) pair.a;
                    Object obj10 = pair.b;
                    if (list2 == null) {
                        g6kVar = new h6k(obj10, true);
                        rq3Var = null;
                    } else {
                        ej0 ej0Var = new ej0(list2, obj10, f6kVar, zf8Var.a, function1, u00Var);
                        rq3Var = null;
                        xw3.L(zf8Var.b, null, nu3.d, new d17(ej0Var, rq3Var, 23), 1);
                        g6kVar = new g6k(ej0Var);
                    }
                } else {
                    g6kVar = null;
                    rq3Var = null;
                }
                if (g6kVar != null) {
                    return g6kVar;
                }
                vje vjeVar = (vje) vf8Var.e.b;
                tf8 tf8Var2 = f6kVar.a;
                int i20 = f6kVar.c;
                wg8 wg8Var16 = f6kVar.b;
                if (tf8Var2 == null || (tf8Var2 instanceof kp4)) {
                    f = vjeVar.f(i20, wg8Var16);
                } else if (tf8Var2 instanceof mw8) {
                    f = vjeVar.e((mw8) tf8Var2, wg8Var16, i20);
                } else {
                    if (!(tf8Var2 instanceof tfb)) {
                        obj3 = rq3Var;
                        if (obj3 == null) {
                            return obj3;
                        }
                        a70.r("Could not load font");
                        return rq3Var;
                    }
                    f = (Typeface) ((tfb) tf8Var2).f.b;
                }
                obj3 = new h6k(f, true);
                if (obj3 == null) {
                }
                break;
            case 1:
                q09 q09Var = (q09) this.b;
                Context context = (Context) this.c;
                String str = (String) obj;
                str.getClass();
                if (str.equals("ALL")) {
                    String string = q09Var.getResources().getString(R.string.all);
                    string.getClass();
                    return string;
                }
                if (!str.equals("HOME_AWAY")) {
                    ilg.c();
                    return null;
                }
                String string2 = context.getString(R.string.home_away_button);
                string2.getClass();
                return string2;
            case 2:
                return Ha.a((Ha) this.b, (Vf) this.c, (GestureDetectorOnGestureListenerC3889xi) obj);
            case 3:
                ((r69) this.b).c.removeCallbacks((yq5) this.c);
                return Unit.a;
            case 4:
                na9 na9Var = (na9) this.b;
                Context context2 = (Context) this.c;
                f2c f2cVar = (f2c) obj;
                f2cVar.getClass();
                if (f2cVar instanceof x1c) {
                    hx5 hx5Var = na9Var.l;
                    if (hx5Var != null) {
                        hx5Var.invoke();
                    }
                } else if (f2cVar instanceof e2c) {
                    yu yuVar = yu.CLIPS;
                    Integer valueOf = Integer.valueOf(na9Var.n);
                    zu[] zuVarArr = zu.a;
                    nv.g0(context2, yuVar, valueOf, "event", U3.i.I0, "wsc");
                    WSCStory wSCStory = ((e2c) f2cVar).a.a;
                    WSCGameData game = wSCStory.getGame();
                    nv.A0(context2, game != null ? Integer.valueOf(game.getEventId()) : 0, ia9.DETAILS);
                    String storyUrl = wSCStory.getStoryUrl();
                    if (storyUrl != null) {
                        p4h.w(context2, storyUrl);
                    }
                }
                return Unit.a;
            case 5:
                vd9 vd9Var = (vd9) this.b;
                Context context3 = (Context) this.c;
                ((Boolean) obj).getClass();
                String str2 = vd9Var.e ? "open_shotmap" : "close_shotmap";
                kv kvVar = kv.CLICK;
                je9[] je9VarArr = je9.a;
                nv.z0(context3, kvVar, str2, "ice_hockey_play_by_play");
                return Unit.a;
            case 6:
                Function2 function2 = (Function2) this.b;
                ob6 ob6Var = (ob6) this.c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                function2.invoke(bool, ob6Var.invoke());
                return Unit.a;
            case 7:
                String str3 = (String) this.b;
                se9 se9Var = (se9) this.c;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT * FROM homescreen_filter WHERE sportName = ?");
                try {
                    V0.L(1, str3);
                    int r = w1a.r(V0, "sportName");
                    int r2 = w1a.r(V0, "selectedFilters");
                    int r3 = w1a.r(V0, "displayType");
                    if (V0.U0()) {
                        String F02 = V0.F0(r);
                        if (!V0.isNull(r2)) {
                            F0 = V0.F0(r2);
                        }
                        Map z2 = se9Var.c.z(F0);
                        if (z2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                        }
                        dbHomescreenFilter = new DbHomescreenFilter(F02, z2, DisplayTypeConverter.stringToDisplayType(V0.F0(r3)));
                    }
                    V0.close();
                    return dbHomescreenFilter;
                } catch (Throwable th3) {
                    V0.close();
                    throw th3;
                }
            case 8:
                se9 se9Var2 = (se9) this.b;
                DbHomescreenFilter dbHomescreenFilter2 = (DbHomescreenFilter) this.c;
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                se9Var2.b.K(glgVar2, dbHomescreenFilter2);
                return Unit.a;
            case 9:
                kae kaeVar = (kae) this.b;
                e1d e1dVar = (e1d) this.c;
                Context context4 = (Context) obj;
                context4.getClass();
                PassingNetworkAnimationView passingNetworkAnimationView = new PassingNetworkAnimationView(context4, null, 6);
                passingNetworkAnimationView.setPitchHorizontalPadding(ao2.u(28, context4));
                passingNetworkAnimationView.e(kaeVar.a, kaeVar.b, kaeVar.e, kaeVar.f, kaeVar.g, new v30(27, e1dVar));
                return passingNetworkAnimationView;
            case 10:
                PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse = (PlayerPenaltyHistoryResponse) this.b;
                e1d e1dVar2 = (e1d) this.c;
                PlayerPenaltyShotView playerPenaltyShotView = (PlayerPenaltyShotView) obj;
                playerPenaltyShotView.getClass();
                playerPenaltyShotView.f(playerPenaltyHistoryResponse.getPenalties(), ((Boolean) e1dVar2.getValue()).booleanValue() ? que.a : que.b);
                return Unit.a;
            case 11:
                b20 b20Var = (b20) this.b;
                m1a m1aVar = (m1a) this.c;
                yma ymaVar = (yma) obj;
                ymaVar.a();
                q50 q50Var = m1aVar.x;
                q50Var.getClass();
                ha5.D(ymaVar, b20Var, new pvh(((r13) q50Var.d()).a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 60);
                return Unit.a;
            case 12:
                h2a h2aVar = (h2a) this.b;
                f2a f2aVar = (f2a) this.c;
                h2aVar.a.b(f2aVar);
                ((eoh) h2aVar.b).setValue(Boolean.TRUE);
                return new vx0(4, h2aVar, f2aVar);
            case 13:
                gca gcaVar = (gca) this.b;
                u uVar = (u) this.c;
                bq2 bq2Var = (bq2) obj;
                bq2Var.getClass();
                gcaVar.f.invoke(((nr2) uVar).d(), bq2Var);
                return Unit.a;
            case 14:
                q73 q73Var = (q73) this.b;
                Object e = ((osa) this.c).e(((Integer) obj).intValue());
                return e == null ? ccd.e : q73Var.invoke(e);
            case 15:
                Function1 function12 = (Function1) this.b;
                osa osaVar = (osa) this.c;
                int intValue = ((Integer) obj).intValue();
                Object e2 = osaVar.e(intValue);
                return e2 == null ? new PagingPlaceholderKey(intValue) : function12.invoke(e2);
            case 16:
                lpa lpaVar = (lpa) this.b;
                kn4 kn4Var = (kn4) this.c;
                mu4 b = lpaVar.b(((Integer) obj).intValue());
                int i21 = b.a;
                List list3 = b.b;
                ArrayList arrayList4 = new ArrayList(list3.size());
                int size11 = list3.size();
                int i22 = 0;
                while (i3 < size11) {
                    int i23 = (int) ((o39) list3.get(i3)).a;
                    arrayList4.add(new Pair(Integer.valueOf(i21), new an3(kn4Var.a(i22, i23))));
                    i21++;
                    i22 += i23;
                    i3++;
                }
                return arrayList4;
            case 17:
                kn4 kn4Var2 = (kn4) this.b;
                cpa cpaVar = (cpa) this.c;
                int intValue2 = ((Integer) obj).intValue();
                lpa lpaVar2 = (lpa) kn4Var2.e;
                int e3 = lpaVar2.e(intValue2, lpaVar2.i);
                return cpaVar.R(intValue2, 0, e3, cpaVar.e, kn4Var2.a(0, e3));
            case 18:
                ssa ssaVar = (ssa) this.b;
                Object obj11 = this.c;
                ssaVar.c.i(obj11);
                return new vx0(i, ssaVar, obj11);
            case 19:
                return new ssa((spg) this.b, (Map) obj, (mpg) this.c);
            case 20:
                rva rvaVar = (rva) this.b;
                fwa fwaVar = (fwa) this.c;
                xva xvaVar = (xva) obj;
                xvaVar.getClass();
                String str4 = ((qva) rvaVar).a;
                gv9 gv9Var = fwaVar.m;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj12 : gv9Var) {
                    u75 u75Var = (u75) obj12;
                    String str5 = u75Var.b;
                    Locale locale = Locale.ROOT;
                    String lowerCase = str5.toLowerCase(locale);
                    lowerCase.getClass();
                    String lowerCase2 = str4.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (!StringsKt.J(lowerCase, lowerCase2, false)) {
                        String lowerCase3 = u75Var.d.toLowerCase(locale);
                        lowerCase3.getClass();
                        String lowerCase4 = str4.toLowerCase(locale);
                        lowerCase4.getClass();
                        if (StringsKt.J(lowerCase3, lowerCase4, false)) {
                        }
                    }
                    arrayList5.add(obj12);
                }
                return xva.a(xvaVar, null, null, 0, null, null, null, l6g.W(arrayList5), null, null, str4, null, 0, false, 64447);
            case 21:
                LeagueEventsFragment leagueEventsFragment = (LeagueEventsFragment) this.b;
                s6e s6eVar = (s6e) this.c;
                List list4 = (List) obj;
                list4.getClass();
                kda.p(wca.x(leagueEventsFragment.getLifecycle()), new pwa(leagueEventsFragment, list4, r5, z ? 1 : 0), new owa(s6eVar, 0));
                return Unit.a;
            case 22:
                Context context5 = (Context) this.b;
                hp5 hp5Var = new hp5(context5, ((Integer) obj).intValue(), (LeagueGoatVoteBottomSheet) this.c, i2);
                context5.getClass();
                AlertDialog h = lnb.h(R.style.RedesignDialog, context5);
                z82 f2 = z82.f(LayoutInflater.from(context5));
                ((TextView) f2.g).setText(context5.getString(R.string.final_check));
                ((TextView) f2.e).setText(context5.getString(R.string.final_check_goat));
                MaterialButton materialButton = (MaterialButton) f2.f;
                String string3 = context5.getString(R.string.confirm_button);
                string3.getClass();
                Locale locale2 = Locale.ROOT;
                String upperCase = string3.toUpperCase(locale2);
                upperCase.getClass();
                materialButton.setText(upperCase);
                z8e.V(context5.getColor(R.color.primary_default), materialButton);
                materialButton.setOnClickListener(new cn(2, hp5Var, h));
                MaterialButton materialButton2 = (MaterialButton) f2.c;
                String string4 = context5.getString(R.string.button_go_back);
                string4.getClass();
                String upperCase2 = string4.toUpperCase(locale2);
                upperCase2.getClass();
                materialButton2.setText(upperCase2);
                aba.y(materialButton2, 0, 3);
                materialButton2.setOnClickListener(new wn(h, 1));
                h.setView((ConstraintLayout) f2.b);
                h.show();
                return Unit.a;
            case 23:
                gv9 gv9Var2 = (gv9) this.b;
                znh znhVar = (znh) this.c;
                yoa yoaVar = (yoa) obj;
                yoaVar.getClass();
                yoaVar.l(gv9Var2.size(), new j87(24, new isa(i2), gv9Var2), new xo(gv9Var2, 20), new tc3(-1117249557, new aj(10, gv9Var2, znhVar), true));
                return Unit.a;
            case 24:
                ku3 ku3Var = (ku3) this.b;
                ksa ksaVar = (ksa) this.c;
                if (((Boolean) obj).booleanValue()) {
                    xw3.L(ku3Var, null, null, new ck1(11, r5, ksaVar), 3);
                }
                return Unit.a;
            case 25:
                PowerRankingRound powerRankingRound = (PowerRankingRound) this.b;
                gv9 gv9Var3 = (gv9) this.c;
                bza bzaVar = (bza) obj;
                if (gv9Var3 == null || !gv9Var3.isEmpty()) {
                    Iterator<E> it = gv9Var3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((u2f) it.next()).f == null) {
                                z = false;
                            }
                        }
                    }
                }
                return bza.a(bzaVar, powerRankingRound, gv9Var3, z, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE);
            case 26:
                o4b o4bVar = (o4b) this.b;
                UniqueTournamentTeamsResponse uniqueTournamentTeamsResponse = (UniqueTournamentTeamsResponse) this.c;
                m4b m4bVar = (m4b) obj;
                b7 K = l6g.K(new oxh(null, o4bVar.i().getString(R.string.all_teams), null, null, null, false, 252));
                if (uniqueTournamentTeamsResponse == null || (teams = uniqueTournamentTeamsResponse.getTeams()) == null || (collection = CollectionsKt.H0(haa.s(o4bVar.i(), teams), new se7(25))) == null) {
                    collection = rlh.b;
                }
                K.getClass();
                collection.getClass();
                return m4b.a(m4bVar, null, K.c(collection), null, false, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
            case 27:
                phe pheVar = (phe) obj;
                ArrayList x = iz8.x((List) this.b, (Function0) ((rbb) this.c).b);
                if (x != null) {
                    int size12 = x.size();
                    while (i3 < size12) {
                        Pair pair2 = (Pair) x.get(i3);
                        qhe qheVar = (qhe) pair2.a;
                        Function0 function0 = (Function0) pair2.b;
                        phe.g(pheVar, qheVar, function0 != null ? ((r6a) function0.invoke()).a : 0L);
                        i3++;
                    }
                }
                return Unit.a;
            case 28:
                MainActivity mainActivity = (MainActivity) this.b;
                asf asfVar = (asf) this.c;
                Boolean bool2 = (Boolean) obj;
                if (MainActivity.n0 && bool2.booleanValue()) {
                    MainActivity.n0 = false;
                    if (mainActivity.W().l.size() > 0) {
                        mainActivity.Q().j.c(mainActivity.W().D(jqb.m), false);
                    } else {
                        asfVar.a = true;
                    }
                }
                return Unit.a;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ppb ppbVar = (ppb) obj;
                ppbVar.getClass();
                return ppb.a(ppbVar, l6g.W(CollectionsKt.H0(ppbVar.a, new i31(i, linkedHashMap, arrayList6))), null, null, null, null, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
    }
}
