package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.inmobi.media.Ek;
import com.inmobi.media.N2;
import com.sofascore.model.AnalystOfferRemoteConfig;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.fragment.DroppingOddsFragment;
import com.sofascore.results.event.aiInsights.EventAiInsightsFragment;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView;
import com.sofascore.results.event.graphs.EventGraphsFragment;
import com.sofascore.results.event.graphs.view.CricketBowlerView;
import com.sofascore.results.event.lineups.football.EventFootballLineupsFragment;
import com.sofascore.results.event.overs.view.CricketOverDialog;
import com.sofascore.results.main.navigation.DynamicBottomNavigation;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.settings.deleteAccount.DeleteAccountActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class kz3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kz3(vg5 vg5Var, fp4 fp4Var) {
        this.a = 16;
        this.b = vg5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07d7  */
    /* JADX WARN: Type inference failed for: r0v37, types: [t1d] */
    /* JADX WARN: Type inference failed for: r0v39, types: [vm7] */
    /* JADX WARN: Type inference failed for: r16v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        int i;
        i04 i04Var;
        Integer over;
        int i2;
        int i3;
        int i4;
        boolean z;
        rq3 rq3Var;
        Object value;
        String concat;
        StringBuilder sb;
        int i5;
        List<Point2D> heatmap;
        int i6 = this.a;
        int i7 = 4;
        int i8 = 5;
        int i9 = 7;
        int i10 = 8;
        rq3 rq3Var2 = null;
        r9 = null;
        rle rleVar = null;
        y12 y12Var = null;
        final int i11 = 0;
        r10 = false;
        boolean z2 = false;
        r10 = false;
        boolean z3 = false;
        r10 = false;
        boolean z4 = false;
        final int i12 = 1;
        Object obj3 = this.b;
        switch (i6) {
            case 0:
                return CricketBowlerView.p((CricketBowlerView) obj3, (Player) obj);
            case 1:
                CricketOverDialog cricketOverDialog = (CricketOverDialog) obj3;
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        q04 q04Var = (q04) obj2;
                        if (q04Var.a != ((Number) cricketOverDialog.E.getValue()).intValue() || q04Var.b != ((Number) cricketOverDialog.F.getValue()).intValue()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                q04 q04Var2 = (q04) obj2;
                if (q04Var2 != null) {
                    List list2 = q04Var2.c;
                    ayd aydVar = (ayd) cricketOverDialog.G.getValue();
                    int i13 = aydVar.n;
                    Event event = aydVar.l;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list2) {
                        Incident.CricketIncident cricketIncident = (Incident.CricketIncident) obj4;
                        if (cricketIncident.getBatsman() != null || cricketIncident.getBowler() != null) {
                            arrayList.add(obj4);
                        }
                    }
                    Incident.CricketIncident cricketIncident2 = (Incident.CricketIncident) CollectionsKt.j0(arrayList);
                    if (cricketIncident2 != null) {
                        ?? r8 = cricketIncident2.getBattingTeamId() == Event.getHomeTeam$default(event, null, 1, null).getId();
                        Team homeTeam$default = r8 != false ? Event.getHomeTeam$default(event, null, 1, null) : Event.getAwayTeam$default(event, null, 1, null);
                        Team awayTeam$default = r8 != false ? Event.getAwayTeam$default(event, null, 1, null) : Event.getHomeTeam$default(event, null, 1, null);
                        boolean z5 = cricketIncident2.getSuperOver() != null;
                        Integer superOver = cricketIncident2.getSuperOver();
                        int intValue = (superOver == null && (superOver = cricketIncident2.getOver()) == null) ? 0 : superOver.intValue();
                        Iterator it2 = arrayList.iterator();
                        int i14 = 0;
                        while (it2.hasNext()) {
                            Integer totalRuns = ((Incident.CricketIncident) it2.next()).getTotalRuns();
                            i14 += totalRuns != null ? totalRuns.intValue() : 0;
                        }
                        if (arrayList.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it3 = arrayList.iterator();
                            int i15 = 0;
                            while (it3.hasNext()) {
                                if (Intrinsics.c(((Incident.CricketIncident) it3.next()).getWicket(), Boolean.TRUE) && (i15 = i15 + 1) < 0) {
                                    b.p();
                                    throw null;
                                }
                            }
                            i = i15;
                        }
                        String score = cricketIncident2.getScore();
                        dyd dydVar = new dyd(score == null ? "" : score, tba.A(aydVar.b, homeTeam$default), z5, intValue, i14, i, homeTeam$default.getId());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            Player batsman = ((Incident.CricketIncident) next).getBatsman();
                            rq3 valueOf = batsman != null ? Integer.valueOf(batsman.getId()) : rq3Var2;
                            Object obj5 = linkedHashMap.get(valueOf);
                            if (obj5 == null) {
                                rq3Var = rq3Var2;
                                ArrayList arrayList2 = new ArrayList();
                                linkedHashMap.put(valueOf, arrayList2);
                                obj5 = arrayList2;
                            } else {
                                rq3Var = rq3Var2;
                            }
                            ((List) obj5).add(next);
                            rq3Var2 = rq3Var;
                        }
                        ?? r18 = rq3Var2;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it5 = linkedHashMap.entrySet().iterator();
                        while (it5.hasNext()) {
                            List list3 = (List) ((Map.Entry) it5.next()).getValue();
                            Player batsman2 = ((Incident.CricketIncident) CollectionsKt.Y(list3)).getBatsman();
                            int m = yid.m(batsman2 != null ? Integer.valueOf(batsman2.getId()) : r18);
                            Iterator it6 = list3.iterator();
                            int i16 = i11;
                            while (it6.hasNext()) {
                                i16 = yid.m(((Incident.CricketIncident) it6.next()).getRuns()) + i16;
                            }
                            String valueOf2 = String.valueOf(i16);
                            String valueOf3 = String.valueOf(list3.size());
                            if (list3.isEmpty()) {
                                i2 = 0;
                            } else {
                                Iterator it7 = list3.iterator();
                                i2 = 0;
                                while (it7.hasNext()) {
                                    Integer runs = ((Incident.CricketIncident) it7.next()).getRuns();
                                    List list4 = list2;
                                    if (runs != null && runs.intValue() == i7 && (i2 = i2 + 1) < 0) {
                                        b.p();
                                        throw r18;
                                    }
                                    list2 = list4;
                                }
                            }
                            List list5 = list2;
                            String valueOf4 = String.valueOf(i2);
                            if (list3.isEmpty()) {
                                i3 = 0;
                            } else {
                                Iterator it8 = list3.iterator();
                                i3 = 0;
                                while (it8.hasNext()) {
                                    Integer runs2 = ((Incident.CricketIncident) it8.next()).getRuns();
                                    if (runs2 == null) {
                                        i4 = i13;
                                    } else {
                                        i4 = i13;
                                        if (runs2.intValue() == 6 && (i3 = i3 + 1) < 0) {
                                            b.p();
                                            throw r18;
                                        }
                                    }
                                    i13 = i4;
                                }
                            }
                            int i17 = i13;
                            Team team = awayTeam$default;
                            List j = b.j(dmi.r(valueOf2, " (", valueOf3, "b)"), valueOf4, String.valueOf(i3));
                            String C = batsman2 != null ? tba.C(batsman2) : r18;
                            String str = C == null ? "" : C;
                            int id = homeTeam$default.getId();
                            if (!list3.isEmpty()) {
                                Iterator it9 = list3.iterator();
                                while (it9.hasNext()) {
                                    Player dismissedBatsman = ((Incident.CricketIncident) it9.next()).getDismissedBatsman();
                                    if ((dismissedBatsman != null ? dismissedBatsman.getId() : -1) == m) {
                                        z = true;
                                        arrayList3.add(new cyd(m, str, id, z, j, new a14(0), batsman2 == null ? batsman2.getGender() : r18));
                                        list2 = list5;
                                        awayTeam$default = team;
                                        i13 = i17;
                                        i7 = 4;
                                        i11 = 0;
                                    }
                                }
                            }
                            z = false;
                            arrayList3.add(new cyd(m, str, id, z, j, new a14(0), batsman2 == null ? batsman2.getGender() : r18));
                            list2 = list5;
                            awayTeam$default = team;
                            i13 = i17;
                            i7 = 4;
                            i11 = 0;
                        }
                        List<Incident.CricketIncident> list6 = list2;
                        int i18 = i13;
                        Team team2 = awayTeam$default;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it10 = arrayList.iterator();
                        while (it10.hasNext()) {
                            Object next2 = it10.next();
                            Player bowler = ((Incident.CricketIncident) next2).getBowler();
                            Integer valueOf5 = bowler != null ? Integer.valueOf(bowler.getId()) : r18;
                            ?? r6 = linkedHashMap2.get(valueOf5);
                            if (r6 == null) {
                                r6 = new ArrayList();
                                linkedHashMap2.put(valueOf5, r6);
                            }
                            ((List) r6).add(next2);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it11 = linkedHashMap2.entrySet().iterator();
                        while (it11.hasNext()) {
                            List<Incident.CricketIncident> list7 = (List) ((Map.Entry) it11.next()).getValue();
                            Player bowler2 = ((Incident.CricketIncident) CollectionsKt.Y(list7)).getBowler();
                            int m2 = yid.m(bowler2 != null ? Integer.valueOf(bowler2.getId()) : r18);
                            Iterator it12 = list7.iterator();
                            int i19 = 0;
                            while (it12.hasNext()) {
                                i19 += yid.m(((Incident.CricketIncident) it12.next()).getRuns());
                            }
                            String valueOf6 = String.valueOf(i19);
                            int i20 = 0;
                            for (Incident.CricketIncident cricketIncident3 : list7) {
                                i20 += yid.m(cricketIncident3.getTotalRuns()) - yid.m(cricketIncident3.getRuns());
                            }
                            List j2 = b.j(valueOf6, String.valueOf(i20));
                            String C2 = bowler2 != null ? tba.C(bowler2) : r18;
                            arrayList4.add(new cyd(m2, C2 == null ? "" : C2, team2.getId(), false, j2, new a14(1), bowler2 != null ? bowler2.getGender() : r18));
                        }
                        xbb b = a.b();
                        b.add(new CustomizableDivider(false, 0, true, null, 10, null));
                        b.add(dydVar);
                        b.add(new CustomizableDivider(true, 1, false, Integer.valueOf(i18), 4, null));
                        b.add(new a14(0));
                        b.addAll(arrayList3);
                        b.add(new CustomizableDivider(true, 0, false, Integer.valueOf(i18), 6, null));
                        b.add(new a14(1));
                        b.addAll(arrayList4);
                        b.add(6);
                        xbb b2 = a.b();
                        ArrayList arrayList5 = new ArrayList();
                        int i21 = 1;
                        for (Incident.CricketIncident cricketIncident4 : list6) {
                            String commentary = cricketIncident4.getCommentary();
                            if (commentary == null || (over = cricketIncident4.getOver()) == null) {
                                i04Var = r18;
                            } else {
                                i04Var = new i04(over.intValue() - 1, i21, commentary, cricketIncident4.getSuperOver() != null);
                                if (!cricketIncident4.getWillBeRepeated()) {
                                    i21++;
                                }
                            }
                            if (i04Var != null) {
                                arrayList5.add(i04Var);
                            }
                        }
                        ArrayList arrayList6 = !arrayList5.isEmpty() ? arrayList5 : r18;
                        if (arrayList6 != null) {
                            b2.add(new CustomizableDivider(false, 0, true, null, 10, null));
                            b2.add(new q9k(R.string.commentary));
                            b2.addAll(CollectionsKt.B0(arrayList6));
                        }
                        b.addAll(a.a(b2));
                        aydVar.F(a.a(b));
                    }
                }
                return Unit.a;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                Context context = ((w04) obj3).getContext();
                Integer intOrNull = StringsKt.toIntOrNull(str2);
                if (intOrNull != null) {
                    str2 = yid.p(intOrNull.intValue());
                }
                String string = context.getString(R.string.cricket_innings_series_ordinal_template, str2);
                string.getClass();
                return string;
            case 3:
                return CricketWagonWheelView.o((CricketWagonWheelView) obj3, (Player) obj);
            case 4:
                qf4 qf4Var = (qf4) obj3;
                mqi mqiVar = qf4Var.j;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    qf4Var.h.B(new e38(th));
                }
                if (mqiVar.isInitialized()) {
                    ((lfi) mqiVar.getValue()).close();
                }
                return Unit.a;
            case 5:
                y3h.e((b4h) obj, (String) ((Pair) obj3).a);
                return Unit.a;
            case 6:
                as4 as4Var = (as4) obj;
                as4Var.getClass();
                ((com.moloco.sdk.internal.http.a) obj3).invoke(as4Var);
                return Unit.a;
            case 7:
                ((aea) obj3).j0();
                return Unit.a;
            case 8:
                DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) obj3;
                j52 j52Var = (j52) obj;
                int i22 = DeleteAccountActivity.N;
                j52Var.getClass();
                su suVar = deleteAccountActivity.x;
                ww4 ww4Var = deleteAccountActivity.M;
                suVar.b = ww4Var != null ? ww4Var.a : null;
                xw3.L(wca.x(deleteAccountActivity.getLifecycle()), null, null, new ce4(j52Var, deleteAccountActivity, rq3Var2, i9), 3);
                return Unit.a;
            case 9:
                q05 q05Var = (q05) obj3;
                String str3 = (String) obj;
                q05Var.l = str3;
                fdi fdiVar = q05Var.m;
                do {
                    value = fdiVar.getValue();
                    str3.getClass();
                } while (!fdiVar.k(value, j05.a((j05) value, str3, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, 268435447)));
                return Unit.a;
            case 10:
                ((IOException) obj).getClass();
                TimeZone timeZone = yol.a;
                ((l45) obj3).k = true;
                return Unit.a;
            case 11:
                ((j45) obj3).l = true;
                return Unit.a;
            case 12:
                mze mzeVar = (mze) obj;
                ((t1d) obj3).invoke(mzeVar, new dnd(qea.E(mzeVar, false)));
                mzeVar.a();
                return Unit.a;
            case 13:
                mze mzeVar2 = (mze) obj;
                ((vm7) obj3).invoke(mzeVar2, Float.valueOf(Float.intBitsToFloat((int) (qea.E(mzeVar2, false) >> 32))));
                mzeVar2.a();
                return Unit.a;
            case 14:
                ((DroppingOddsFragment) obj3).I();
                return Unit.a;
            case 15:
                return DynamicBottomNavigation.l((DynamicBottomNavigation) obj3, ((Integer) obj).intValue());
            case 16:
                vg5 vg5Var = (vg5) obj;
                String str4 = ((vg5) obj3) == vg5Var ? " > " : "   ";
                if (vg5Var instanceof t43) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    t43 t43Var = (t43) vg5Var;
                    sb.append(t43Var.a.b.length());
                    sb.append(", newCursorPosition=");
                    i5 = t43Var.b;
                } else {
                    if (!(vg5Var instanceof e9h)) {
                        if (vg5Var instanceof d9h) {
                            concat = ((d9h) vg5Var).toString();
                        } else if (vg5Var instanceof zw4) {
                            concat = ((zw4) vg5Var).toString();
                        } else if (vg5Var instanceof ax4) {
                            concat = ((ax4) vg5Var).toString();
                        } else if (vg5Var instanceof p9h) {
                            concat = ((p9h) vg5Var).toString();
                        } else if (vg5Var instanceof i38) {
                            concat = "FinishComposingTextCommand()";
                        } else if (vg5Var instanceof yw4) {
                            concat = "DeleteAllCommand()";
                        } else {
                            String simpleName = duf.a.getOrCreateKotlinClass(vg5Var.getClass()).getSimpleName();
                            if (simpleName == null) {
                                simpleName = "{anonymous EditCommand}";
                            }
                            concat = "Unknown EditCommand: ".concat(simpleName);
                        }
                        return str4.concat(concat);
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    e9h e9hVar = (e9h) vg5Var;
                    sb.append(e9hVar.a.b.length());
                    sb.append(", newCursorPosition=");
                    i5 = e9hVar.b;
                }
                concat = wv8.j(sb, i5, ')');
                return str4.concat(concat);
            case 17:
                return Ek.a((Ek) obj3, (N2) obj);
            case 18:
                EventAiInsightsFragment eventAiInsightsFragment = (EventAiInsightsFragment) obj3;
                cu cuVar = (cu) obj;
                Context requireContext = eventAiInsightsFragment.requireContext();
                requireContext.getClass();
                int i23 = cuVar == null ? -1 : wr5.a[cuVar.ordinal()];
                jv jvVar = (i23 == 1 || i23 == 2) ? jv.AI_FREE_TRIAL : i23 != 3 ? i23 != 4 ? i23 != 5 ? jv.AI_INSIGHTS : jv.WORLD_CUP_OFFER : jv.FEATURED_OFFER : jv.AI_PROMO_3_MONTHS;
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putString("type", jvVar.a);
                nv.N(requireContext, firebaseBundle, "start_subscription");
                bli bliVar = eventAiInsightsFragment.E().n;
                FragmentActivity requireActivity = eventAiInsightsFragment.requireActivity();
                requireActivity.getClass();
                bliVar.l(requireActivity, s5k.b);
                return Unit.a;
            case 19:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                AnalystOfferRemoteConfig analystOfferRemoteConfig = ((im) obj3).h;
                return Long.valueOf(sharedPreferences.getLong(lnb.o("PREF_ANALYST_PROMOTION_MODAL_TIMESTAMP", analystOfferRemoteConfig != null ? analystOfferRemoteConfig.getStartDate() : null, analystOfferRemoteConfig != null ? analystOfferRemoteConfig.getOfferId() : null), 0L));
            case 20:
                x12 x12Var = (x12) obj3;
                i22 i22Var = (i22) obj;
                i22Var.getClass();
                Iterator it13 = i22Var.u.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        ?? next3 = it13.next();
                        if (Intrinsics.c((y12) next3, x12Var)) {
                            y12Var = next3;
                        }
                    }
                }
                y12 y12Var2 = y12Var;
                return Double.valueOf(-(y12Var2 != null ? y12Var2.j : 0.0d));
            case 21:
                z33 z33Var = (z33) obj3;
                obj.getClass();
                if ((obj instanceof z33) && ((z33) obj).a.getId() == z33Var.a.getId()) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 22:
                b46 b46Var = (b46) obj;
                b46Var.getClass();
                ((ksc) obj3).setStatisticData(b46Var);
                return Unit.a;
            case 23:
                List list8 = (List) obj;
                list8.getClass();
                ((qzh) ((g7) obj3)).F(list8);
                return Unit.a;
            case 24:
                fz9 fz9Var = (fz9) obj3;
                iz9 iz9Var = (iz9) obj;
                iz9Var.getClass();
                if ((iz9Var instanceof fz9) && Intrinsics.c(((fz9) iz9Var).c, fz9Var.c)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 25:
                aze azeVar = (aze) obj3;
                cze czeVar = (cze) obj;
                czeVar.getClass();
                if ((czeVar instanceof aze) && ((aze) czeVar).a == azeVar.a) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 26:
                EventFootballLineupsFragment eventFootballLineupsFragment = (EventFootballLineupsFragment) obj3;
                final zz5 zz5Var = (zz5) obj;
                zz5Var.getClass();
                rq3 rq3Var3 = null;
                if (zz5Var.equals(uz5.a)) {
                    Context requireContext2 = eventFootballLineupsFragment.requireContext();
                    requireContext2.getClass();
                    nv.A(requireContext2, "open_fantasy", "event_lineups");
                    Integer F = o3a.F(eventFootballLineupsFragment.B().getTournament());
                    if (F != null) {
                        int intValue2 = F.intValue();
                        e87 e87Var = new e87(i12);
                        FragmentActivity requireActivity2 = eventFootballLineupsFragment.requireActivity();
                        requireActivity2.getClass();
                        xw3.L(wca.x(requireActivity2.getLifecycle()), null, null, new ok0(e87Var, intValue2, requireActivity2, rq3Var3, 20), 3);
                    } else {
                        v9g.H(eventFootballLineupsFragment, null, 3);
                    }
                } else if (zz5Var instanceof sz5) {
                    int i24 = ManagerActivity.R;
                    Context requireContext3 = eventFootballLineupsFragment.requireContext();
                    requireContext3.getClass();
                    bea.M(((sz5) zz5Var).a, requireContext3);
                    Unit unit = Unit.a;
                } else {
                    p06 p06Var = (p06) eventFootballLineupsFragment.s.getValue();
                    if (zz5Var instanceof wz5) {
                        p06Var.n(null, new Function1() { // from class: g06
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i25 = i11;
                                zz5 zz5Var2 = zz5Var;
                                switch (i25) {
                                    case 0:
                                        f06 f06Var = (f06) obj6;
                                        f06Var.getClass();
                                        return f06.a(f06Var, null, null, null, ((wz5) zz5Var2).a, null, null, null, false, 247);
                                    default:
                                        f06 f06Var2 = (f06) obj6;
                                        f06Var2.getClass();
                                        return f06.a(f06Var2, null, null, null, null, ((xz5) zz5Var2).a, null, null, false, 239);
                                }
                            }
                        });
                    } else if (zz5Var instanceof xz5) {
                        p06Var.n(null, new Function1() { // from class: g06
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i25 = i12;
                                zz5 zz5Var2 = zz5Var;
                                switch (i25) {
                                    case 0:
                                        f06 f06Var = (f06) obj6;
                                        f06Var.getClass();
                                        return f06.a(f06Var, null, null, null, ((wz5) zz5Var2).a, null, null, null, false, 247);
                                    default:
                                        f06 f06Var2 = (f06) obj6;
                                        f06Var2.getClass();
                                        return f06.a(f06Var2, null, null, null, null, ((xz5) zz5Var2).a, null, null, false, 239);
                                }
                            }
                        });
                    } else if (zz5Var instanceof tz5) {
                        f06 f06Var = (f06) p06Var.l().a();
                        if (f06Var != null) {
                            p06Var.w(((tz5) zz5Var).a, f06Var.d, f06Var.e);
                        }
                    } else if (zz5Var instanceof yz5) {
                        p06Var.n(null, new xw5(i8, zz5Var, p06Var));
                    } else if (zz5Var instanceof rz5) {
                        Integer num = p06Var.u;
                        if (num != null) {
                            xw3.L(un0.z(p06Var), null, null, new ok0(p06Var, num.intValue(), zz5Var, rq3Var3, 15), 3);
                        }
                    } else if (zz5Var.equals(vz5.a)) {
                        p06Var.n(null, new au5(i10));
                    }
                    Unit unit2 = Unit.a;
                }
                return Unit.a;
            case 27:
                f06 f06Var2 = (f06) obj3;
                pye pyeVar = (pye) obj;
                pyeVar.getClass();
                gye gyeVar = f06Var2.f;
                gyeVar.getClass();
                boolean z6 = gyeVar.a;
                j22 j22Var = pyeVar.d;
                FrameLayout frameLayout = (FrameLayout) j22Var.p;
                ConstraintLayout constraintLayout = j22Var.b;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) j22Var.h;
                frameLayout.getClass();
                frameLayout.setVisibility(z6 ? 0 : 8);
                if (z6 && gyeVar.b) {
                    pyeVar.e = gyeVar;
                    if (pyeVar.E) {
                        ((HorizontalScrollView) j22Var.k).setOnScrollChangeListener(new hye(pyeVar, i11));
                        ((RelativeLayout) j22Var.g).setOnClickListener(new jye(1, pyeVar));
                    }
                    Pair pair = gyeVar.o;
                    ArrayList arrayList7 = pyeVar.n;
                    ArrayList arrayList8 = pyeVar.m;
                    constraintLayout2.setVisibility(8);
                    constraintLayout.setVisibility(0);
                    if (pair != null) {
                        arrayList8.clear();
                        arrayList7.clear();
                        arrayList8.addAll((Collection) pair.a);
                        arrayList7.addAll((Collection) pair.b);
                    }
                    if (!pyeVar.isLaidOut() || pyeVar.isLayoutRequested()) {
                        pyeVar.addOnLayoutChangeListener(new b2(pyeVar, 10));
                    } else {
                        pyeVar.post(new kac(pyeVar, i9));
                    }
                } else if (z6) {
                    constraintLayout2.setVisibility(0);
                    constraintLayout.setVisibility(8);
                }
                rle rleVar2 = f06Var2.g;
                gv9 gv9Var = rleVar2 != null ? rleVar2.a : null;
                if (gv9Var != null) {
                    pyeVar.r(gv9Var, true);
                }
                return Unit.a;
            case 28:
                PlayerHeatmapResponse playerHeatmapResponse = (PlayerHeatmapResponse) obj3;
                f06 f06Var3 = (f06) obj;
                if (playerHeatmapResponse != null && (heatmap = playerHeatmapResponse.getHeatmap()) != null) {
                    rleVar = new rle(l6g.W(heatmap));
                }
                return f06.a(f06Var3, null, null, null, null, null, null, rleVar, false, 191);
            default:
                EventGraphsFragment eventGraphsFragment = (EventGraphsFragment) obj3;
                List list9 = (List) obj;
                krk krkVar = eventGraphsFragment.l;
                krkVar.getClass();
                CricketBowlerView cricketBowlerView = ((mo8) krkVar).b;
                CricketEvent C3 = eventGraphsFragment.C();
                list9.getClass();
                cricketBowlerView.q(C3, list9);
                krk krkVar2 = eventGraphsFragment.l;
                krkVar2.getClass();
                ((mo8) krkVar2).d.p(eventGraphsFragment.C(), list9);
                eventGraphsFragment.n();
                return Unit.a;
        }
    }

    public /* synthetic */ kz3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
