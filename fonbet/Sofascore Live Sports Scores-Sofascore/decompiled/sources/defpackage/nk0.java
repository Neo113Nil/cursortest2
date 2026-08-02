package defpackage;

import android.os.Build;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.model.Sports;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeasonKt;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.event.matches.EventMatchesFragment;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.league.fragment.details.PopularPlayersModal;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.main.matches.redesign.MatchesRootFragment;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import com.sofascore.results.manager.matches.ManagerEventsFragment;
import com.sofascore.results.mma.fightNight.MmaFightNightFragment;
import com.sofascore.results.mma.fighter.matches.MmaFighterEventsFragment;
import com.sofascore.results.mma.mainScreen.MmaEventsWeekFragment;
import com.sofascore.results.onboarding.OnboardingViewModel;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nk0 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public nk0(u6b u6bVar, Function2 function2, rgh rghVar, ComponentActivity componentActivity) {
        this.a = 24;
        this.b = u6bVar;
        this.c = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0385, code lost:
    
        if (r4 != null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0387, code lost:
    
        r4.scrollToPositionWithOffset(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03af, code lost:
    
        if (r4 != null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        r15.O().u(r0.getPlayer());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x07f6, code lost:
    
        if (r1.emit(r0, r3) != r2) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0839, code lost:
    
        if (r4 != 0) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x083b, code lost:
    
        r4.scrollToPositionWithOffset(0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0863, code lost:
    
        if (r4 != 0) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x08ed, code lost:
    
        if (r0 != null) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x08ef, code lost:
    
        r15.j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x08fb, code lost:
    
        if (r0 != null) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x09e8, code lost:
    
        if (r13.emit(r0, r5) == r2) goto L540;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ad  */
    /* JADX WARN: Type inference failed for: r4v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.recyclerview.widget.LinearLayoutManager] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        mk0 mk0Var;
        lu3 lu3Var;
        int i;
        b98 b98Var;
        p33 p33Var;
        b98 b98Var2;
        jk0 jk0Var;
        p33 p33Var2;
        AdType.Banner banner;
        Fragment fragment;
        n63 n63Var;
        int i2;
        k54 k54Var;
        int i3;
        b98 b98Var3;
        d37 d37Var;
        int i4;
        zs7 zs7Var;
        int i5;
        long startDateTimestamp;
        y98 y98Var;
        int i6;
        ka8 ka8Var;
        Object obj2;
        int i7;
        xxc xxcVar;
        int i8;
        p5d p5dVar;
        int i9;
        htd htdVar;
        int i10;
        PlayerEventStatisticsResponse playerEventStatisticsResponse;
        int i11 = this.a;
        int i12 = 9;
        int i13 = 2;
        Object obj3 = this.c;
        Object obj4 = this.b;
        ?? r4 = 0;
        r4 = null;
        r4 = null;
        fgf fgfVar = null;
        r4 = null;
        LinearLayoutManager linearLayoutManager = null;
        r4 = 0;
        switch (i11) {
            case 0:
                fdi fdiVar = ((pk0) obj3).e;
                if (rq3Var instanceof mk0) {
                    mk0Var = (mk0) rq3Var;
                    int i14 = mk0Var.s;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        mk0Var.s = i14 - Integer.MIN_VALUE;
                        Object obj5 = mk0Var.r;
                        lu3Var = lu3.a;
                        i = mk0Var.s;
                        if (i != 0) {
                            y6a.M(obj5);
                            b98Var = (b98) obj4;
                            p33Var = (p33) obj;
                            if (((Boolean) fdiVar.getValue()).booleanValue()) {
                                mk0Var.u = p33Var;
                                mk0Var.v = b98Var;
                                mk0Var.s = 1;
                                if (cga.U(mk0Var) != lu3Var) {
                                    b98Var2 = b98Var;
                                }
                                return lu3Var;
                            }
                            mk0Var.u = null;
                            mk0Var.v = null;
                            mk0Var.s = 3;
                        } else if (i == 1) {
                            b98Var2 = mk0Var.v;
                            p33 p33Var3 = mk0Var.u;
                            y6a.M(obj5);
                            p33Var = p33Var3;
                        } else {
                            if (i != 2) {
                                if (i == 3) {
                                    y6a.M(obj5);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b98Var2 = mk0Var.v;
                            p33Var2 = mk0Var.u;
                            y6a.M(obj5);
                            b98Var = b98Var2;
                            p33Var = p33Var2;
                            mk0Var.u = null;
                            mk0Var.v = null;
                            mk0Var.s = 3;
                            break;
                        }
                        jk0Var = new jk0(i13, r4, r11);
                        mk0Var.u = p33Var;
                        mk0Var.v = b98Var2;
                        mk0Var.s = 2;
                        if (rd0.B(fdiVar, jk0Var, mk0Var) != lu3Var) {
                            p33Var2 = p33Var;
                            b98Var = b98Var2;
                            p33Var = p33Var2;
                            mk0Var.u = null;
                            mk0Var.v = null;
                            mk0Var.s = 3;
                        }
                        return lu3Var;
                    }
                }
                mk0Var = new mk0(this, rq3Var);
                Object obj52 = mk0Var.r;
                lu3Var = lu3.a;
                i = mk0Var.s;
                if (i != 0) {
                }
                jk0Var = new jk0(i13, r4, r11);
                mk0Var.u = p33Var;
                mk0Var.v = b98Var2;
                mk0Var.s = 2;
                if (rd0.B(fdiVar, jk0Var, mk0Var) != lu3Var) {
                }
                return lu3Var;
            case 1:
                BaseActivity baseActivity = (BaseActivity) obj4;
                List list = ((hal) obj).a;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list) {
                    if (obj6 instanceof g79) {
                        arrayList.add(obj6);
                    }
                }
                g79 g79Var = (g79) CollectionsKt.firstOrNull(arrayList);
                if (g79Var != null) {
                    ue8 ue8Var = g79Var.c;
                    if (ue8Var == ue8.c || ue8Var == ue8.d) {
                        baseActivity.setRequestedOrientation(-1);
                    } else {
                        baseActivity.setRequestedOrientation(1);
                    }
                } else {
                    BaseActivity baseActivity2 = (BaseActivity) obj3;
                    baseActivity.setRequestedOrientation(baseActivity2.getN() ? 0 : baseActivity2.getResources().getBoolean(R.bool.lock_portrait) ? 1 : -1);
                }
                return Unit.a;
            case 2:
                j52 j52Var = (j52) obj;
                u11 u11Var = (u11) obj3;
                if ((j52Var instanceof i42) && (fragment = (Fragment) obj4) != null) {
                    if (Intrinsics.c(fragment.toString(), ((i42) j52Var).a)) {
                        u11Var.i = true;
                        banner = u11Var.t;
                        break;
                    }
                    return Unit.a;
                }
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.FragmentVisible");
                    return null;
                }
                u11Var.i = true;
                banner = u11Var.t;
                break;
                break;
            case 3:
                if (rq3Var instanceof n63) {
                    n63Var = (n63) rq3Var;
                    int i15 = n63Var.s;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        n63Var.s = i15 - Integer.MIN_VALUE;
                        Object obj7 = n63Var.r;
                        lu3 lu3Var2 = lu3.a;
                        i2 = n63Var.s;
                        if (i2 != 0) {
                            y6a.M(obj7);
                            f6e z = g7a.z((f6e) obj, new r1((p63) obj3, r4, i12));
                            f6e f6eVar = new f6e(new v98(z.a, new d11(i13, r4, 6), 4), z.b, z.c, jxa.D);
                            n63Var.s = 1;
                            if (((b98) obj4).emit(f6eVar, n63Var) == lu3Var2) {
                                return lu3Var2;
                            }
                        } else {
                            if (i2 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj7);
                        }
                        return Unit.a;
                    }
                }
                n63Var = new n63(this, rq3Var);
                Object obj72 = n63Var.r;
                lu3 lu3Var22 = lu3.a;
                i2 = n63Var.s;
                if (i2 != 0) {
                }
                return Unit.a;
            case 4:
                j52 j52Var2 = (j52) obj;
                CompetitionsFragment competitionsFragment = (CompetitionsFragment) obj3;
                if (j52Var2 instanceof i42) {
                    if (Intrinsics.c(((CompetitionsFragment) obj4).toString(), ((i42) j52Var2).a)) {
                        krk krkVar = competitionsFragment.l;
                        krkVar.getClass();
                        ((oo8) krkVar).d.stopScroll();
                        krk krkVar2 = competitionsFragment.l;
                        krkVar2.getClass();
                        n layoutManager = ((oo8) krkVar2).d.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            r4 = (LinearLayoutManager) layoutManager;
                            break;
                        }
                    }
                    return Unit.a;
                }
                if (j52Var2 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                    return null;
                }
                krk krkVar3 = competitionsFragment.l;
                krkVar3.getClass();
                ((oo8) krkVar3).d.stopScroll();
                krk krkVar4 = competitionsFragment.l;
                krkVar4.getClass();
                n layoutManager2 = ((oo8) krkVar4).d.getLayoutManager();
                if (layoutManager2 instanceof LinearLayoutManager) {
                    r4 = (LinearLayoutManager) layoutManager2;
                    break;
                }
                break;
            case 5:
                if (rq3Var instanceof k54) {
                    k54Var = (k54) rq3Var;
                    int i16 = k54Var.s;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        k54Var.s = i16 - Integer.MIN_VALUE;
                        Object obj8 = k54Var.r;
                        lu3 lu3Var3 = lu3.a;
                        i3 = k54Var.s;
                        if (i3 != 0) {
                            y6a.M(obj8);
                            b98 b98Var4 = (b98) obj4;
                            k24 k24Var = (k24) obj;
                            fp4 fp4Var = ((q54) obj3).e;
                            h34 h34Var = k24Var.a;
                            int i17 = h34Var.a;
                            int id = h34Var.c.getId();
                            int id2 = k24Var.a.d.getId();
                            k54Var.t = b98Var4;
                            k54Var.u = 0;
                            k54Var.s = 1;
                            Serializable C = fp4Var.C(i17, id, id2, k54Var);
                            if (C != lu3Var3) {
                                b98Var3 = b98Var4;
                                obj8 = C;
                            }
                            return lu3Var3;
                        }
                        if (i3 != 1) {
                            if (i3 == 2) {
                                y6a.M(obj8);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r11 = k54Var.u;
                        b98Var3 = k54Var.t;
                        y6a.M(obj8);
                        k54Var.t = null;
                        k54Var.u = r11;
                        k54Var.s = 2;
                        break;
                    }
                }
                k54Var = new k54(this, rq3Var);
                Object obj82 = k54Var.r;
                lu3 lu3Var32 = lu3.a;
                i3 = k54Var.s;
                if (i3 != 0) {
                }
                k54Var.t = null;
                k54Var.u = r11;
                k54Var.s = 2;
            case 6:
                j52 j52Var3 = (j52) obj;
                EventMatchesFragment eventMatchesFragment = (EventMatchesFragment) obj3;
                if (j52Var3 instanceof i42) {
                    if (Intrinsics.c(((EventMatchesFragment) obj4).toString(), ((i42) j52Var3).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var3 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                eventMatchesFragment.E().U();
                return Unit.a;
            case 7:
                j52 j52Var4 = (j52) obj;
                FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = (FantasyCompetitionFixturesFragment) obj3;
                if (j52Var4 instanceof i42) {
                    if (Intrinsics.c(((FantasyCompetitionFixturesFragment) obj4).toString(), ((i42) j52Var4).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var4 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                fantasyCompetitionFixturesFragment.C().U();
                return Unit.a;
            case 8:
                if (rq3Var instanceof d37) {
                    d37Var = (d37) rq3Var;
                    int i18 = d37Var.s;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        d37Var.s = i18 - Integer.MIN_VALUE;
                        Object obj9 = d37Var.r;
                        lu3 lu3Var4 = lu3.a;
                        i4 = d37Var.s;
                        if (i4 != 0) {
                            y6a.M(obj9);
                            f6e z2 = g7a.z((f6e) obj, new r1((e37) obj3, r4, 27));
                            d37Var.s = 1;
                            if (((b98) obj4).emit(z2, d37Var) == lu3Var4) {
                                return lu3Var4;
                            }
                        } else {
                            if (i4 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj9);
                        }
                        return Unit.a;
                    }
                }
                d37Var = new d37(this, rq3Var);
                Object obj92 = d37Var.r;
                lu3 lu3Var42 = lu3.a;
                i4 = d37Var.s;
                if (i4 != 0) {
                }
                return Unit.a;
            case 9:
                String str = (String) obj3;
                if (rq3Var instanceof zs7) {
                    zs7Var = (zs7) rq3Var;
                    int i19 = zs7Var.s;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        zs7Var.s = i19 - Integer.MIN_VALUE;
                        Object obj10 = zs7Var.r;
                        lu3 lu3Var5 = lu3.a;
                        i5 = zs7Var.s;
                        if (i5 != 0) {
                            y6a.M(obj10);
                            b98 b98Var5 = (b98) obj4;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj11 : (List) obj) {
                                if (obj11 instanceof Event) {
                                    Event event = (Event) obj11;
                                    if (Sports.INSTANCE.getEntries().contains(event.getSportSlug())) {
                                        if ((str.length() > 0 ? str : null) != null && !Intrinsics.c(event.getSportSlug(), str)) {
                                        }
                                        arrayList2.add(obj11);
                                    }
                                } else {
                                    if (obj11 instanceof Stage) {
                                        Stage stage = (Stage) obj11;
                                        if (CollectionsKt.R(Sports.INSTANCE.getEntries(), StageSeasonKt.getSportName(stage.getStageSeason()))) {
                                            if ((str.length() > 0 ? str : null) != null && !Intrinsics.c(StageSeasonKt.getSportName(stage.getStageSeason()), str)) {
                                            }
                                        }
                                    }
                                    arrayList2.add(obj11);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                if (next instanceof Event) {
                                    Event event2 = (Event) next;
                                    startDateTimestamp = event2.getStartTimestamp();
                                    Long endTimestamp = event2.getEndTimestamp();
                                    long longValue = (endTimestamp != null ? endTimestamp.longValue() : 0L) - 1;
                                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                                    if (longValue > 0 && currentTimeMillis >= startDateTimestamp) {
                                        startDateTimestamp = currentTimeMillis > longValue ? longValue : currentTimeMillis;
                                    }
                                } else {
                                    if (!(next instanceof Stage)) {
                                        ilg.c();
                                        return null;
                                    }
                                    startDateTimestamp = ((Stage) next).getStartDateTimestamp();
                                }
                                ZoneId systemDefault = ZoneId.systemDefault();
                                if (Instant.ofEpochSecond(startDateTimestamp).atZone(systemDefault).toLocalDate().isBefore(LocalDate.now(systemDefault))) {
                                    arrayList4.add(next);
                                } else {
                                    arrayList3.add(next);
                                }
                            }
                            ys7 ys7Var = new ys7(arrayList4, arrayList3);
                            zs7Var.s = 1;
                            if (b98Var5.emit(ys7Var, zs7Var) == lu3Var5) {
                                return lu3Var5;
                            }
                        } else {
                            if (i5 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj10);
                        }
                        return Unit.a;
                    }
                }
                zs7Var = new zs7(this, rq3Var);
                Object obj102 = zs7Var.r;
                lu3 lu3Var52 = lu3.a;
                i5 = zs7Var.s;
                if (i5 != 0) {
                }
                return Unit.a;
            case 10:
                j52 j52Var5 = (j52) obj;
                ksa ksaVar = (ksa) obj3;
                if (j52Var5 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                    return null;
                }
                xw3.L((ku3) obj4, null, null, new ck1(i12, r4, ksaVar), 3);
                return Unit.a;
            case 11:
                try {
                    if (rq3Var instanceof y98) {
                        y98Var = (y98) rq3Var;
                        int i20 = y98Var.t;
                        if ((i20 & Integer.MIN_VALUE) != 0) {
                            y98Var.t = i20 - Integer.MIN_VALUE;
                            Object obj12 = y98Var.r;
                            lu3 lu3Var6 = lu3.a;
                            i6 = y98Var.t;
                            if (i6 != 0) {
                                y6a.M(obj12);
                                y98Var.t = 1;
                                if (((b98) obj4).emit(obj, y98Var) == lu3Var6) {
                                    return lu3Var6;
                                }
                            } else {
                                if (i6 != 1) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj12);
                            }
                            return Unit.a;
                        }
                    }
                    if (i6 != 0) {
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    ((fsf) obj3).a = th;
                    throw th;
                }
                y98Var = new y98(this, rq3Var);
                Object obj122 = y98Var.r;
                lu3 lu3Var62 = lu3.a;
                i6 = y98Var.t;
            case 12:
                if (rq3Var instanceof ka8) {
                    ka8Var = (ka8) rq3Var;
                    int i21 = ka8Var.s;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ka8Var.s = i21 - Integer.MIN_VALUE;
                        obj2 = ka8Var.r;
                        lu3 lu3Var7 = lu3.a;
                        i7 = ka8Var.s;
                        if (i7 != 0) {
                            y6a.M(obj2);
                            ka8Var.s = 1;
                            obj2 = ((ct8) obj3).invoke((b98) obj4, obj, ka8Var);
                            if (obj2 == lu3Var7) {
                                return lu3Var7;
                            }
                        } else {
                            if (i7 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            throw new f0(this);
                        }
                        return Unit.a;
                    }
                }
                ka8Var = new ka8(this, rq3Var);
                obj2 = ka8Var.r;
                lu3 lu3Var72 = lu3.a;
                i7 = ka8Var.s;
                if (i7 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            case 13:
                i7a i7aVar = (i7a) obj;
                ArrayList arrayList5 = (ArrayList) obj4;
                if (i7aVar instanceof rd8) {
                    arrayList5.add(i7aVar);
                } else if (i7aVar instanceof sd8) {
                    arrayList5.remove(((sd8) i7aVar).a);
                }
                boolean z3 = !arrayList5.isEmpty();
                m1a m1aVar = (m1a) obj3;
                if (z3 != m1aVar.u) {
                    m1aVar.u = z3;
                    m1aVar.n1();
                }
                return Unit.a;
            case 14:
                j52 j52Var6 = (j52) obj;
                LeagueEventsFragment leagueEventsFragment = (LeagueEventsFragment) obj3;
                if (j52Var6 instanceof i42) {
                    if (Intrinsics.c(((LeagueEventsFragment) obj4).toString(), ((i42) j52Var6).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var6 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                leagueEventsFragment.D().U();
                return Unit.a;
            case 15:
                i7a i7aVar2 = (i7a) obj;
                hbb hbbVar = (hbb) obj3;
                l0d l0dVar = (l0d) obj4;
                if ((i7aVar2 instanceof sf9) || (i7aVar2 instanceof rd8) || (i7aVar2 instanceof l6f)) {
                    l0dVar.a(i7aVar2);
                } else if (i7aVar2 instanceof tf9) {
                    l0dVar.j(((tf9) i7aVar2).a);
                } else if (i7aVar2 instanceof sd8) {
                    l0dVar.j(((sd8) i7aVar2).a);
                } else if (i7aVar2 instanceof m6f) {
                    l0dVar.j(((m6f) i7aVar2).a);
                } else if (i7aVar2 instanceof k6f) {
                    l0dVar.j(((k6f) i7aVar2).a);
                }
                Object[] objArr = l0dVar.a;
                int i22 = l0dVar.b;
                int i23 = 0;
                while (r11 < i22) {
                    i7a i7aVar3 = (i7a) objArr[r11];
                    if (i7aVar3 instanceof sf9) {
                        hbbVar.getClass();
                        i23 |= 2;
                    } else if (i7aVar3 instanceof rd8) {
                        hbbVar.getClass();
                        i23 |= 1;
                    } else if (i7aVar3 instanceof l6f) {
                        hbbVar.getClass();
                        i23 |= 4;
                    }
                    r11++;
                }
                hbbVar.b.i(i23);
                return Unit.a;
            case 16:
                j52 j52Var7 = (j52) obj;
                ManagerEventsFragment managerEventsFragment = (ManagerEventsFragment) obj3;
                if (j52Var7 instanceof i42) {
                    if (Intrinsics.c(((ManagerEventsFragment) obj4).toString(), ((i42) j52Var7).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var7 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                managerEventsFragment.C().U();
                return Unit.a;
            case 17:
                j52 j52Var8 = (j52) obj;
                MatchesRootFragment matchesRootFragment = (MatchesRootFragment) obj3;
                if (j52Var8 instanceof i42) {
                    if (Intrinsics.c(((MatchesRootFragment) obj4).toString(), ((i42) j52Var8).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var8 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                    return null;
                }
                krk krkVar5 = matchesRootFragment.l;
                krkVar5.getClass();
                ((to8) krkVar5).b.g(true, true, true);
                return Unit.a;
            case 18:
                j52 j52Var9 = (j52) obj;
                MmaEventsWeekFragment mmaEventsWeekFragment = (MmaEventsWeekFragment) obj3;
                if (j52Var9 instanceof i42) {
                    if (Intrinsics.c(((MmaEventsWeekFragment) obj4).toString(), ((i42) j52Var9).a)) {
                        krk krkVar6 = mmaEventsWeekFragment.l;
                        krkVar6.getClass();
                        ((rp8) krkVar6).c.stopScroll();
                        krk krkVar7 = mmaEventsWeekFragment.l;
                        krkVar7.getClass();
                        n layoutManager3 = ((rp8) krkVar7).c.getLayoutManager();
                        if (layoutManager3 instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager3;
                            break;
                        }
                    }
                    return Unit.a;
                }
                if (j52Var9 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.ScrollToTop");
                    return null;
                }
                krk krkVar8 = mmaEventsWeekFragment.l;
                krkVar8.getClass();
                ((rp8) krkVar8).c.stopScroll();
                krk krkVar9 = mmaEventsWeekFragment.l;
                krkVar9.getClass();
                n layoutManager4 = ((rp8) krkVar9).c.getLayoutManager();
                if (layoutManager4 instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager4;
                    break;
                }
                break;
            case 19:
                j52 j52Var10 = (j52) obj;
                MmaFightNightFragment mmaFightNightFragment = (MmaFightNightFragment) obj3;
                if (j52Var10 instanceof i42) {
                    if (Intrinsics.c(((MmaFightNightFragment) obj4).toString(), ((i42) j52Var10).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var10 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                mmaFightNightFragment.C().notifyDataSetChanged();
                return Unit.a;
            case 20:
                j52 j52Var11 = (j52) obj;
                MmaFighterEventsFragment mmaFighterEventsFragment = (MmaFighterEventsFragment) obj3;
                if (j52Var11 instanceof i42) {
                    if (Intrinsics.c(((MmaFighterEventsFragment) obj4).toString(), ((i42) j52Var11).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var11 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshFavorites");
                    return null;
                }
                mmaFighterEventsFragment.C().A();
                return Unit.a;
            case 21:
                if (rq3Var instanceof xxc) {
                    xxcVar = (xxc) rq3Var;
                    int i24 = xxcVar.s;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        xxcVar.s = i24 - Integer.MIN_VALUE;
                        Object obj13 = xxcVar.r;
                        lu3 lu3Var8 = lu3.a;
                        i8 = xxcVar.s;
                        if (i8 != 0) {
                            y6a.M(obj13);
                            b98 b98Var6 = (b98) obj4;
                            Set set = (Set) obj;
                            c9h c9hVar = new c9h();
                            String[] strArr = (String[]) obj3;
                            int length = strArr.length;
                            while (r11 < length) {
                                String str2 = strArr[r11];
                                Iterator it2 = set.iterator();
                                while (it2.hasNext()) {
                                    if (c.o(str2, (String) it2.next(), true)) {
                                        c9hVar.add(str2);
                                    }
                                }
                                r11++;
                            }
                            c9h a = w9h.a(c9hVar);
                            c9h c9hVar2 = a.a.isEmpty() ? null : a;
                            if (c9hVar2 != null) {
                                xxcVar.s = 1;
                                if (b98Var6.emit(c9hVar2, xxcVar) == lu3Var8) {
                                    return lu3Var8;
                                }
                            }
                        } else {
                            if (i8 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj13);
                        }
                        return Unit.a;
                    }
                }
                xxcVar = new xxc(this, rq3Var);
                Object obj132 = xxcVar.r;
                lu3 lu3Var82 = lu3.a;
                i8 = xxcVar.s;
                if (i8 != 0) {
                }
                return Unit.a;
            case 22:
                if (rq3Var instanceof p5d) {
                    p5dVar = (p5d) rq3Var;
                    int i25 = p5dVar.s;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        p5dVar.s = i25 - Integer.MIN_VALUE;
                        Object obj14 = p5dVar.r;
                        lu3 lu3Var9 = lu3.a;
                        i9 = p5dVar.s;
                        if (i9 != 0) {
                            y6a.M(obj14);
                            b98 b98Var7 = (b98) obj4;
                            JSONObject jSONObject = (JSONObject) obj;
                            fgf fgfVar2 = (fgf) obj3;
                            jSONObject.getClass();
                            fgfVar2.getClass();
                            int optInt = jSONObject.optInt("id");
                            int i26 = fgfVar2.a;
                            gv9 gv9Var = fgfVar2.e;
                            if (i26 == optInt && !gv9Var.isEmpty()) {
                                ArrayList arrayList6 = new ArrayList(k13.r(gv9Var, 10));
                                int i27 = 0;
                                for (Object obj15 : gv9Var) {
                                    int i28 = i27 + 1;
                                    if (i27 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    dld dldVar = (dld) obj15;
                                    String k = lnb.k(fgfVar2.h ? gv9Var.size() - i27 : i28, "choice", ".fractionalValue");
                                    if (jSONObject.has(k)) {
                                        r11 = 1;
                                        dldVar = new dld(dldVar.a, dldVar.b, dldVar.c, jSONObject.optString(k), dldVar.e, dldVar.f);
                                    }
                                    arrayList6.add(dldVar);
                                    i27 = i28;
                                }
                                if (r11 != 0) {
                                    gv9 W = l6g.W(arrayList6);
                                    int i29 = fgfVar2.a;
                                    r9k r9kVar = fgfVar2.b;
                                    int i30 = fgfVar2.c;
                                    boolean z4 = fgfVar2.d;
                                    ProviderOdds.Type type = fgfVar2.f;
                                    String str3 = fgfVar2.g;
                                    boolean z5 = fgfVar2.h;
                                    W.getClass();
                                    type.getClass();
                                    fgfVar = new fgf(i29, r9kVar, i30, z4, W, type, str3, z5);
                                }
                            }
                            p5dVar.s = 1;
                            if (b98Var7.emit(fgfVar, p5dVar) == lu3Var9) {
                                return lu3Var9;
                            }
                        } else {
                            if (i9 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj14);
                        }
                        return Unit.a;
                    }
                }
                p5dVar = new p5d(this, rq3Var);
                Object obj142 = p5dVar.r;
                lu3 lu3Var92 = lu3.a;
                i9 = p5dVar.s;
                if (i9 != 0) {
                }
                return Unit.a;
            case 23:
                ((e1d) obj4).setValue(Boolean.TRUE);
                ((xnh) obj3).i(((nx0) obj).c);
                return Unit.a;
            case 24:
                j52 j52Var12 = (j52) obj;
                if (j52Var12 instanceof i42) {
                    u6b u6bVar = (u6b) obj4;
                    if (u6bVar instanceof Fragment) {
                        if (!Intrinsics.c(((Fragment) u6bVar).toString(), ((i42) j52Var12).a)) {
                            return Unit.a;
                        }
                        pvd.j();
                        return null;
                    }
                }
                if (j52Var12 != null) {
                    pvd.j();
                    return null;
                }
                yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.SyncFail");
                return null;
            case 25:
                if (rq3Var instanceof htd) {
                    htdVar = (htd) rq3Var;
                    int i31 = htdVar.s;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        htdVar.s = i31 - Integer.MIN_VALUE;
                        Object obj16 = htdVar.r;
                        lu3 lu3Var10 = lu3.a;
                        i10 = htdVar.s;
                        if (i10 != 0) {
                            y6a.M(obj16);
                            f6e f6eVar2 = (f6e) obj;
                            d11 d11Var = new d11(i13, r4, i12);
                            f6eVar2.getClass();
                            v98 v98Var = new v98(f6eVar2.a, d11Var, 4);
                            k9k k9kVar = f6eVar2.b;
                            fb9 fb9Var = f6eVar2.c;
                            k9kVar.getClass();
                            fb9Var.getClass();
                            f6e f6eVar3 = new f6e(new v98(v98Var, new qa7((OnboardingViewModel) obj3, (rq3) r4, 28), 5), k9kVar, fb9Var, jxa.D);
                            htdVar.s = 1;
                            if (((b98) obj4).emit(f6eVar3, htdVar) == lu3Var10) {
                                return lu3Var10;
                            }
                        } else {
                            if (i10 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj16);
                        }
                        return Unit.a;
                    }
                }
                htdVar = new htd(this, rq3Var);
                Object obj162 = htdVar.r;
                lu3 lu3Var102 = lu3.a;
                i10 = htdVar.s;
                if (i10 != 0) {
                }
                return Unit.a;
            case 26:
                Object d = ((x4e) obj4).d((sfb) obj3, (jw8) obj, rq3Var);
                return d == lu3.a ? d : Unit.a;
            case 27:
                e4e e4eVar = (e4e) obj;
                if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                    Objects.toString(e4eVar);
                }
                lk0 lk0Var = (lk0) obj4;
                Object R = xw3.R(lk0Var.a, new j8c(e4eVar, lk0Var, (f6e) obj3, (rq3) null, 22), rq3Var);
                return R == lu3.a ? R : Unit.a;
            case 28:
                j52 j52Var13 = (j52) obj;
                PlayerEventStatisticsModal playerEventStatisticsModal = (PlayerEventStatisticsModal) obj3;
                if (j52Var13 instanceof i42) {
                    if (Intrinsics.c(((PlayerEventStatisticsModal) obj4).toString(), ((i42) j52Var13).a)) {
                        playerEventStatisticsResponse = playerEventStatisticsModal.S;
                        break;
                    }
                    return Unit.a;
                }
                if (j52Var13 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshDetailsBellButton");
                    return null;
                }
                playerEventStatisticsResponse = playerEventStatisticsModal.S;
                break;
            default:
                j52 j52Var14 = (j52) obj;
                joa joaVar = ((PopularPlayersModal) obj3).C;
                if (j52Var14 instanceof i42) {
                    if (Intrinsics.c(((PopularPlayersModal) obj4).toString(), ((i42) j52Var14).a)) {
                    }
                    return Unit.a;
                }
                if (j52Var14 == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.RefreshDetailsBellButton");
                    return null;
                }
                ((u1f) joaVar.getValue()).notifyDataSetChanged();
                return Unit.a;
        }
    }

    public nk0(ku3 ku3Var, BaseActivity baseActivity, BaseActivity baseActivity2) {
        this.a = 1;
        this.b = baseActivity;
        this.c = baseActivity2;
    }

    public /* synthetic */ nk0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj2;
        this.b = obj;
    }

    public nk0(ct8 ct8Var, b98 b98Var) {
        this.a = 12;
        this.c = ct8Var;
        this.b = b98Var;
    }
}
