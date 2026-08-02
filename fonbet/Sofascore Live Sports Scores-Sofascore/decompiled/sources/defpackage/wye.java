package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.DartsEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.newNetwork.GamePP;
import com.sofascore.model.newNetwork.LegPP;
import com.sofascore.model.newNetwork.PointPP;
import com.sofascore.model.newNetwork.ScorePP;
import com.sofascore.model.newNetwork.SetPP;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wye extends g7 {
    public Event l;
    public List m;

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0354, code lost:
    
        if (r4 != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04a6, code lost:
    
        if (r30 != null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x05f8, code lost:
    
        if (r0 != null) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x06f4, code lost:
    
        if (r4.intValue() == 2) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x07da, code lost:
    
        if (r4 == null) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0808, code lost:
    
        if (r2 != null) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0172, code lost:
    
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ab A[LOOP:7: B:117:0x03a5->B:119:0x03ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x08ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031e  */
    /* JADX WARN: Type inference failed for: r3v10, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(Event event, List list) {
        ?? r3;
        String C;
        Long periodTime;
        String str;
        List list2;
        boolean z;
        ArrayList arrayList;
        Iterator it;
        int i;
        char c;
        Pair pair;
        String valueOf;
        String str2;
        Integer homeScore$default;
        String valueOf2;
        String str3;
        Integer awayScore$default;
        List<PointPP> points;
        ArrayList arrayList2;
        Pair pair2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List H0;
        TeamSides teamSides;
        int i2;
        boolean z2;
        Integer scoring$default;
        List<LegPP> list3;
        String str4;
        Integer homeScore$default2;
        String valueOf3;
        String str5;
        Integer awayScore$default2;
        Iterator it2;
        ScorePP score;
        int i3;
        Integer throwing$default;
        Integer throwing$default2;
        Integer throwing$default3;
        Integer throwing$default4;
        String str6;
        List list4;
        Pair pair3;
        ArrayList arrayList5;
        List<GamePP> list5;
        Iterator it3;
        ArrayList arrayList6;
        boolean z3;
        Iterator it4;
        boolean z4;
        Iterator it5;
        Object obj;
        Integer scoring$default2;
        boolean z5;
        String str7;
        Integer homeScore$default3;
        String valueOf4;
        String str8;
        Integer awayScore$default3;
        Iterator it6;
        ScorePP score2;
        int i4;
        Integer serving$default;
        int i5;
        Integer serving$default2;
        Integer serving$default3;
        Integer serving$default4;
        Integer scoring$default3;
        Integer scoring$default4;
        Integer serving$default5;
        String str9;
        Iterator it7;
        ScorePP score3;
        Integer scoring$default5;
        Integer scoring$default6;
        event.getClass();
        list.getClass();
        List<SetPP> H02 = CollectionsKt.H0(list, new wpb(18));
        List list6 = this.m;
        if (list6 != null) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj2 : list6) {
                if (((SetPP) obj2).getExpanded()) {
                    arrayList7.add(obj2);
                }
            }
            r3 = new ArrayList(k13.r(arrayList7, 10));
            Iterator it8 = arrayList7.iterator();
            while (it8.hasNext()) {
                r3.add(Integer.valueOf(((SetPP) it8.next()).getSet()));
            }
        } else {
            r3 = 0;
        }
        if (r3 == 0) {
            r3 = km5.a;
        }
        LinkedHashSet V0 = CollectionsKt.V0(r3);
        if (V0.isEmpty() && this.i.isEmpty() && !H02.isEmpty()) {
            V0.add(Integer.valueOf(((SetPP) CollectionsKt.Y(H02)).getSet()));
        }
        this.l = event;
        for (SetPP setPP : H02) {
            setPP.setExpanded(V0.contains(Integer.valueOf(setPP.getSet())));
        }
        this.m = H02;
        if (H02.isEmpty()) {
            return;
        }
        Set set = yye.a;
        Context context = this.b;
        context.getClass();
        boolean D = ok3.D(event);
        List H03 = CollectionsKt.H0(H02, new wpb(19));
        ArrayList arrayList8 = new ArrayList(k13.r(H03, 10));
        Iterator it9 = H03.iterator();
        while (it9.hasNext()) {
            arrayList8.add("period" + ((SetPP) it9.next()).getSet());
        }
        xbb b = a.b();
        Iterator it10 = H02.iterator();
        int i6 = 0;
        while (it10.hasNext()) {
            Object next = it10.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                b.q();
                throw null;
            }
            SetPP setPP2 = (SetPP) next;
            Set set2 = yye.a;
            if (!set2.contains(ok3.s(event))) {
                if (D && event.getCurrentPeriodStartTimestamp() != null && i6 == 0 && setPP2.getSet() == arrayList8.indexOf(event.getLastPeriod()) + 1) {
                    C = ug5.C(yaa.w() - yid.n(event.getCurrentPeriodStartTimestamp()));
                } else {
                    Time time = event.getTime();
                    C = (time == null || (periodTime = time.getPeriodTime(setPP2.getSet())) == null) ? null : ug5.C(periodTime.longValue());
                }
                str = C;
                if ((event instanceof DartsEvent) || ok3.B(event)) {
                    b.add(new aze(setPP2.getSet(), str, !D && i6 == 0, setPP2.getExpanded(), i6 == 0, b.isEmpty(), (i6 == H02.size() - 1 || setPP2.getExpanded()) ? false : true));
                }
                if (setPP2.getExpanded()) {
                    list2 = H02;
                    z = D;
                    arrayList = arrayList8;
                    it = it10;
                    i = i7;
                    c = '\n';
                } else {
                    String s = ok3.s(event);
                    if (Intrinsics.c(s, Sports.TENNIS)) {
                        List<GamePP> games = setPP2.getGames();
                        int size = H02.size() - 1;
                        TennisEvent tennisEvent = (TennisEvent) event;
                        if (Boolean.valueOf(D).equals(Boolean.TRUE)) {
                            list2 = H02;
                            Integer scoreByPeriodName = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(tennisEvent.getLastPeriod());
                            String valueOf5 = scoreByPeriodName != null ? String.valueOf(scoreByPeriodName.intValue()) : null;
                            z = D;
                            Integer scoreByPeriodName2 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(tennisEvent.getLastPeriod());
                            pair3 = new Pair(valueOf5, scoreByPeriodName2 != null ? String.valueOf(scoreByPeriodName2.intValue()) : null);
                        } else {
                            list2 = H02;
                            z = D;
                            pair3 = null;
                        }
                        if (games != null) {
                            arrayList5 = new ArrayList(k13.r(games, 10));
                            Iterator it11 = games.iterator();
                            int i8 = 0;
                            while (it11.hasNext()) {
                                Object next2 = it11.next();
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    b.q();
                                    throw null;
                                }
                                GamePP gamePP = (GamePP) next2;
                                if (i6 == 0 && i8 == 0 && z) {
                                    list5 = games;
                                    ScorePP score4 = gamePP.getScore();
                                    it3 = it11;
                                    arrayList6 = arrayList8;
                                    if ((score4 == null || (scoring$default6 = ScorePP.getScoring$default(score4, null, 1, null)) == null || scoring$default6.intValue() != 1) && ((score3 = gamePP.getScore()) == null || (scoring$default5 = ScorePP.getScoring$default(score3, null, 1, null)) == null || scoring$default5.intValue() != 2)) {
                                        z3 = true;
                                        it4 = gamePP.getPoints().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                z4 = z3;
                                                it5 = it10;
                                                obj = null;
                                                break;
                                            }
                                            Object next3 = it4.next();
                                            z4 = z3;
                                            PointPP pointPP = (PointPP) next3;
                                            it7 = it4;
                                            obj = next3;
                                            it5 = it10;
                                            IntRange intRange = new IntRange(1, 14, 1);
                                            Integer intOrNull = StringsKt.toIntOrNull(PointPP.getHomePoint$default(pointPP, null, 1, null));
                                            if (intOrNull != null && intRange.d(intOrNull.intValue())) {
                                                break;
                                            }
                                            IntRange intRange2 = new IntRange(1, 14, 1);
                                            Integer intOrNull2 = StringsKt.toIntOrNull(PointPP.getAwayPoint$default(pointPP, null, 1, null));
                                            if (intOrNull2 != null && intRange2.d(intOrNull2.intValue())) {
                                                break;
                                            }
                                            z3 = z4;
                                            it4 = it7;
                                            it10 = it5;
                                        }
                                        boolean z6 = obj == null;
                                        if (z4) {
                                            ScorePP score5 = gamePP.getScore();
                                            scoring$default2 = score5 != null ? ScorePP.getScoring$default(score5, null, 1, null) : null;
                                        } else {
                                            scoring$default2 = ServableEvent.getFirstToServe$default((ServableEvent) event, null, 1, null);
                                        }
                                        if (pair3 != null && (str9 = (String) pair3.a) != null) {
                                            if (!z4) {
                                                str9 = null;
                                            }
                                            if (str9 != null) {
                                                z5 = z6;
                                                str7 = str9;
                                                if (pair3 != null && (valueOf4 = (String) pair3.b) != null) {
                                                    if (!z4) {
                                                        valueOf4 = null;
                                                    }
                                                }
                                                ScorePP score6 = gamePP.getScore();
                                                valueOf4 = (score6 != null || (awayScore$default3 = ScorePP.getAwayScore$default(score6, null, 1, null)) == null) ? null : String.valueOf(awayScore$default3.intValue());
                                                if (valueOf4 == null) {
                                                    str8 = "";
                                                    ScorePP score7 = gamePP.getScore();
                                                    boolean z7 = score7 == null && (serving$default5 = ScorePP.getServing$default(score7, null, 1, null)) != null && serving$default5.intValue() == 1;
                                                    List<PointPP> points2 = gamePP.getPoints();
                                                    Pair pair4 = pair3;
                                                    ArrayList arrayList9 = new ArrayList(k13.r(points2, 10));
                                                    it6 = points2.iterator();
                                                    while (it6.hasNext()) {
                                                        PointPP pointPP2 = (PointPP) it6.next();
                                                        arrayList9.add(new eze(PointPP.getHomePoint$default(pointPP2, null, 1, null), PointPP.getAwayPoint$default(pointPP2, null, 1, null), yye.d(PointPP.getHomePointType$default(pointPP2, null, 1, null)), yye.d(PointPP.getAwayPointType$default(pointPP2, null, 1, null))));
                                                        gamePP = gamePP;
                                                        it6 = it6;
                                                        i7 = i7;
                                                        i9 = i9;
                                                    }
                                                    int i10 = i7;
                                                    int i11 = i9;
                                                    gv9 W = l6g.W(arrayList9);
                                                    gv9 c2 = yye.c(context, event, scoring$default2);
                                                    score2 = gamePP.getScore();
                                                    if (score2 != null) {
                                                        if (z4) {
                                                        }
                                                        i4 = -1;
                                                    } else if (z5 && (scoring$default4 = ScorePP.getScoring$default(score2, null, 1, null)) != null && scoring$default4.intValue() == 1) {
                                                        i4 = 5;
                                                    } else if (z5 && (scoring$default3 = ScorePP.getScoring$default(score2, null, 1, null)) != null && scoring$default3.intValue() == 2) {
                                                        i4 = 6;
                                                    } else {
                                                        if (!z4 || pair4 == null) {
                                                            Integer scoring$default7 = ScorePP.getScoring$default(score2, null, 1, null);
                                                            if (scoring$default7 != null && scoring$default7.intValue() == 1 && (serving$default4 = ScorePP.getServing$default(score2, null, 1, null)) != null && serving$default4.intValue() == 1) {
                                                                i4 = 0;
                                                            } else {
                                                                Integer scoring$default8 = ScorePP.getScoring$default(score2, null, 1, null);
                                                                if (scoring$default8 == null || scoring$default8.intValue() != 1 || (serving$default = ScorePP.getServing$default(score2, null, 1, null)) == null) {
                                                                    i5 = 2;
                                                                } else {
                                                                    i5 = 2;
                                                                    if (serving$default.intValue() == 2) {
                                                                        i4 = 1;
                                                                    }
                                                                }
                                                                Integer scoring$default9 = ScorePP.getScoring$default(score2, null, 1, null);
                                                                if (scoring$default9 != null && scoring$default9.intValue() == i5 && (serving$default3 = ScorePP.getServing$default(score2, null, 1, null)) != null && serving$default3.intValue() == i5) {
                                                                    i4 = i5;
                                                                } else {
                                                                    Integer scoring$default10 = ScorePP.getScoring$default(score2, null, 1, null);
                                                                    if (scoring$default10 != null && scoring$default10.intValue() == i5 && (serving$default2 = ScorePP.getServing$default(score2, null, 1, null)) != null && serving$default2.intValue() == 1) {
                                                                        i4 = 3;
                                                                    }
                                                                    i4 = -1;
                                                                }
                                                            }
                                                        }
                                                        i4 = 4;
                                                    }
                                                    arrayList5.add(new zye(str7, str8, z7, W, c2, i4, R.drawable.ic_ball_tennis, i6 != size && i8 == list5.size() + (-1), yye.a(event, scoring$default2)));
                                                    games = list5;
                                                    it11 = it3;
                                                    arrayList8 = arrayList6;
                                                    pair3 = pair4;
                                                    it10 = it5;
                                                    i7 = i10;
                                                    i8 = i11;
                                                }
                                                str8 = valueOf4;
                                                ScorePP score72 = gamePP.getScore();
                                                if (score72 == null) {
                                                }
                                                List<PointPP> points22 = gamePP.getPoints();
                                                Pair pair42 = pair3;
                                                ArrayList arrayList92 = new ArrayList(k13.r(points22, 10));
                                                it6 = points22.iterator();
                                                while (it6.hasNext()) {
                                                }
                                                int i102 = i7;
                                                int i112 = i9;
                                                gv9 W2 = l6g.W(arrayList92);
                                                gv9 c22 = yye.c(context, event, scoring$default2);
                                                score2 = gamePP.getScore();
                                                if (score2 != null) {
                                                }
                                                arrayList5.add(new zye(str7, str8, z7, W2, c22, i4, R.drawable.ic_ball_tennis, i6 != size && i8 == list5.size() + (-1), yye.a(event, scoring$default2)));
                                                games = list5;
                                                it11 = it3;
                                                arrayList8 = arrayList6;
                                                pair3 = pair42;
                                                it10 = it5;
                                                i7 = i102;
                                                i8 = i112;
                                            }
                                        }
                                        ScorePP score8 = gamePP.getScore();
                                        z5 = z6;
                                        String valueOf6 = (score8 != null || (homeScore$default3 = ScorePP.getHomeScore$default(score8, null, 1, null)) == null) ? null : String.valueOf(homeScore$default3.intValue());
                                        str7 = valueOf6 != null ? "" : valueOf6;
                                        if (pair3 != null) {
                                            if (!z4) {
                                            }
                                        }
                                        ScorePP score62 = gamePP.getScore();
                                        if (score62 != null) {
                                        }
                                        if (valueOf4 == null) {
                                        }
                                        str8 = valueOf4;
                                        ScorePP score722 = gamePP.getScore();
                                        if (score722 == null) {
                                        }
                                        List<PointPP> points222 = gamePP.getPoints();
                                        Pair pair422 = pair3;
                                        ArrayList arrayList922 = new ArrayList(k13.r(points222, 10));
                                        it6 = points222.iterator();
                                        while (it6.hasNext()) {
                                        }
                                        int i1022 = i7;
                                        int i1122 = i9;
                                        gv9 W22 = l6g.W(arrayList922);
                                        gv9 c222 = yye.c(context, event, scoring$default2);
                                        score2 = gamePP.getScore();
                                        if (score2 != null) {
                                        }
                                        arrayList5.add(new zye(str7, str8, z7, W22, c222, i4, R.drawable.ic_ball_tennis, i6 != size && i8 == list5.size() + (-1), yye.a(event, scoring$default2)));
                                        games = list5;
                                        it11 = it3;
                                        arrayList8 = arrayList6;
                                        pair3 = pair422;
                                        it10 = it5;
                                        i7 = i1022;
                                        i8 = i1122;
                                    }
                                } else {
                                    list5 = games;
                                    it3 = it11;
                                    arrayList6 = arrayList8;
                                }
                                z3 = false;
                                it4 = gamePP.getPoints().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                    }
                                    z3 = z4;
                                    it4 = it7;
                                    it10 = it5;
                                }
                                if (obj == null) {
                                }
                                if (z4) {
                                }
                                if (pair3 != null) {
                                    if (!z4) {
                                    }
                                    if (str9 != null) {
                                    }
                                }
                                ScorePP score82 = gamePP.getScore();
                                z5 = z6;
                                if (score82 != null) {
                                }
                                if (valueOf6 != null) {
                                }
                                if (pair3 != null) {
                                }
                                ScorePP score622 = gamePP.getScore();
                                if (score622 != null) {
                                }
                                if (valueOf4 == null) {
                                }
                                str8 = valueOf4;
                                ScorePP score7222 = gamePP.getScore();
                                if (score7222 == null) {
                                }
                                List<PointPP> points2222 = gamePP.getPoints();
                                Pair pair4222 = pair3;
                                ArrayList arrayList9222 = new ArrayList(k13.r(points2222, 10));
                                it6 = points2222.iterator();
                                while (it6.hasNext()) {
                                }
                                int i10222 = i7;
                                int i11222 = i9;
                                gv9 W222 = l6g.W(arrayList9222);
                                gv9 c2222 = yye.c(context, event, scoring$default2);
                                score2 = gamePP.getScore();
                                if (score2 != null) {
                                }
                                arrayList5.add(new zye(str7, str8, z7, W222, c2222, i4, R.drawable.ic_ball_tennis, i6 != size && i8 == list5.size() + (-1), yye.a(event, scoring$default2)));
                                games = list5;
                                it11 = it3;
                                arrayList8 = arrayList6;
                                pair3 = pair4222;
                                it10 = it5;
                                i7 = i10222;
                                i8 = i11222;
                            }
                        } else {
                            arrayList5 = null;
                        }
                        arrayList = arrayList8;
                        it = it10;
                        i = i7;
                        arrayList4 = arrayList5;
                    } else {
                        list2 = H02;
                        z = D;
                        arrayList = arrayList8;
                        it = it10;
                        i = i7;
                        if (Intrinsics.c(s, Sports.DARTS)) {
                            List<LegPP> legs = setPP2.getLegs();
                            int size2 = list2.size() - 1;
                            DartsEvent dartsEvent = (DartsEvent) event;
                            if (Boolean.valueOf(z).equals(Boolean.TRUE)) {
                                Integer scoreByPeriodName3 = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(dartsEvent.getLastPeriod());
                                String valueOf7 = scoreByPeriodName3 != null ? String.valueOf(scoreByPeriodName3.intValue()) : null;
                                Integer scoreByPeriodName4 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(dartsEvent.getLastPeriod());
                                pair2 = new Pair(valueOf7, scoreByPeriodName4 != null ? String.valueOf(scoreByPeriodName4.intValue()) : null);
                            } else {
                                pair2 = null;
                            }
                            if (legs == null || (H0 = CollectionsKt.H0(legs, new wpb(20))) == null) {
                                arrayList3 = null;
                            } else {
                                arrayList3 = new ArrayList(k13.r(H0, 10));
                                Iterator it12 = H0.iterator();
                                int i12 = 0;
                                while (it12.hasNext()) {
                                    Object next4 = it12.next();
                                    int i13 = i12 + 1;
                                    if (i12 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    LegPP legPP = (LegPP) next4;
                                    if (i6 == 0 && i12 == 0) {
                                        ScorePP score9 = legPP.getScore();
                                        teamSides = null;
                                        i2 = 1;
                                        if ((score9 != null ? ScorePP.getScoring$default(score9, null, 1, null) : null) == null) {
                                            z2 = true;
                                            if (z2) {
                                                ScorePP score10 = legPP.getScore();
                                                scoring$default = score10 != null ? ScorePP.getScoring$default(score10, teamSides, i2, teamSides) : null;
                                            } else {
                                                scoring$default = ServableEvent.getFirstToServe$default((ServableEvent) event, teamSides, i2, teamSides);
                                            }
                                            if (pair2 != null && (str6 = (String) pair2.a) != null) {
                                                if (!z2) {
                                                    str6 = null;
                                                }
                                                if (str6 != null) {
                                                    list3 = legs;
                                                    str4 = str6;
                                                    if (pair2 != null && (valueOf3 = (String) pair2.b) != null) {
                                                        if (!z2) {
                                                            valueOf3 = null;
                                                        }
                                                    }
                                                    ScorePP score11 = legPP.getScore();
                                                    valueOf3 = (score11 != null || (awayScore$default2 = ScorePP.getAwayScore$default(score11, null, 1, null)) == null) ? null : String.valueOf(awayScore$default2.intValue());
                                                    if (valueOf3 == null) {
                                                        str5 = "";
                                                        ScorePP score12 = legPP.getScore();
                                                        boolean z8 = score12 == null && (throwing$default4 = ScorePP.getThrowing$default(score12, null, 1, null)) != null && throwing$default4.intValue() == 1;
                                                        List<PointPP> points3 = legPP.getPoints();
                                                        Iterator it13 = it12;
                                                        ArrayList arrayList10 = new ArrayList(k13.r(points3, 10));
                                                        it2 = points3.iterator();
                                                        while (it2.hasNext()) {
                                                            PointPP pointPP3 = (PointPP) it2.next();
                                                            Iterator it14 = it2;
                                                            Pair pair5 = pair2;
                                                            LegPP legPP2 = legPP;
                                                            String homePoint$default = PointPP.getHomePoint$default(pointPP3, null, 1, null);
                                                            int i14 = i13;
                                                            String awayPoint$default = PointPP.getAwayPoint$default(pointPP3, null, 1, null);
                                                            Boolean isHome = pointPP3.isHome();
                                                            Boolean bool = Boolean.TRUE;
                                                            arrayList10.add(new eze(homePoint$default, awayPoint$default, Intrinsics.c(isHome, bool) ? R.color.n_lv_1 : R.color.n_lv_3, Intrinsics.c(pointPP3.isHome(), bool) ? R.color.n_lv_3 : R.color.n_lv_1));
                                                            it2 = it14;
                                                            pair2 = pair5;
                                                            legPP = legPP2;
                                                            i13 = i14;
                                                        }
                                                        Pair pair6 = pair2;
                                                        int i15 = i13;
                                                        gv9 W3 = l6g.W(arrayList10);
                                                        gv9 c3 = yye.c(context, event, scoring$default);
                                                        score = legPP.getScore();
                                                        if (score != null) {
                                                            if (z2 && pair6 != null) {
                                                                i3 = 4;
                                                            }
                                                            i3 = -1;
                                                        } else if (!z2 || pair6 == null) {
                                                            i3 = 1;
                                                            Integer scoring$default11 = ScorePP.getScoring$default(score, null, 1, null);
                                                            if (scoring$default11 != null && scoring$default11.intValue() == 1 && (throwing$default3 = ScorePP.getThrowing$default(score, null, 1, null)) != null && throwing$default3.intValue() == 1) {
                                                                i3 = 0;
                                                            } else {
                                                                Integer scoring$default12 = ScorePP.getScoring$default(score, null, 1, null);
                                                                int i16 = (scoring$default12 == null || scoring$default12.intValue() != 1 || (r4 = ScorePP.getThrowing$default(score, null, 1, null)) == null) ? 2 : 2;
                                                                Integer scoring$default13 = ScorePP.getScoring$default(score, null, 1, null);
                                                                if (scoring$default13 != null && scoring$default13.intValue() == i16 && (throwing$default2 = ScorePP.getThrowing$default(score, null, 1, null)) != null && throwing$default2.intValue() == i16) {
                                                                    i3 = i16;
                                                                } else {
                                                                    Integer scoring$default14 = ScorePP.getScoring$default(score, null, 1, null);
                                                                    if (scoring$default14 != null && scoring$default14.intValue() == i16 && (throwing$default = ScorePP.getThrowing$default(score, null, 1, null)) != null && throwing$default.intValue() == 1) {
                                                                        i3 = 3;
                                                                    }
                                                                    i3 = -1;
                                                                }
                                                            }
                                                        } else {
                                                            i3 = 4;
                                                        }
                                                        arrayList3.add(new zye(str4, str5, z8, W3, c3, i3, R.drawable.ic_dart_16, i6 != size2 && i12 == list3.size() + (-1), yye.a(event, scoring$default)));
                                                        legs = list3;
                                                        it12 = it13;
                                                        pair2 = pair6;
                                                        i12 = i15;
                                                    }
                                                    str5 = valueOf3;
                                                    ScorePP score122 = legPP.getScore();
                                                    if (score122 == null) {
                                                    }
                                                    List<PointPP> points32 = legPP.getPoints();
                                                    Iterator it132 = it12;
                                                    ArrayList arrayList102 = new ArrayList(k13.r(points32, 10));
                                                    it2 = points32.iterator();
                                                    while (it2.hasNext()) {
                                                    }
                                                    Pair pair62 = pair2;
                                                    int i152 = i13;
                                                    gv9 W32 = l6g.W(arrayList102);
                                                    gv9 c32 = yye.c(context, event, scoring$default);
                                                    score = legPP.getScore();
                                                    if (score != null) {
                                                    }
                                                    arrayList3.add(new zye(str4, str5, z8, W32, c32, i3, R.drawable.ic_dart_16, i6 != size2 && i12 == list3.size() + (-1), yye.a(event, scoring$default)));
                                                    legs = list3;
                                                    it12 = it132;
                                                    pair2 = pair62;
                                                    i12 = i152;
                                                }
                                            }
                                            ScorePP score13 = legPP.getScore();
                                            list3 = legs;
                                            String valueOf8 = (score13 != null || (homeScore$default2 = ScorePP.getHomeScore$default(score13, null, 1, null)) == null) ? null : String.valueOf(homeScore$default2.intValue());
                                            str4 = valueOf8 != null ? "" : valueOf8;
                                            if (pair2 != null) {
                                                if (!z2) {
                                                }
                                            }
                                            ScorePP score112 = legPP.getScore();
                                            if (score112 != null) {
                                            }
                                            if (valueOf3 == null) {
                                            }
                                            str5 = valueOf3;
                                            ScorePP score1222 = legPP.getScore();
                                            if (score1222 == null) {
                                            }
                                            List<PointPP> points322 = legPP.getPoints();
                                            Iterator it1322 = it12;
                                            ArrayList arrayList1022 = new ArrayList(k13.r(points322, 10));
                                            it2 = points322.iterator();
                                            while (it2.hasNext()) {
                                            }
                                            Pair pair622 = pair2;
                                            int i1522 = i13;
                                            gv9 W322 = l6g.W(arrayList1022);
                                            gv9 c322 = yye.c(context, event, scoring$default);
                                            score = legPP.getScore();
                                            if (score != null) {
                                            }
                                            arrayList3.add(new zye(str4, str5, z8, W322, c322, i3, R.drawable.ic_dart_16, i6 != size2 && i12 == list3.size() + (-1), yye.a(event, scoring$default)));
                                            legs = list3;
                                            it12 = it1322;
                                            pair2 = pair622;
                                            i12 = i1522;
                                        }
                                    } else {
                                        teamSides = null;
                                        i2 = 1;
                                    }
                                    z2 = false;
                                    if (z2) {
                                    }
                                    if (pair2 != null) {
                                        if (!z2) {
                                        }
                                        if (str6 != null) {
                                        }
                                    }
                                    ScorePP score132 = legPP.getScore();
                                    list3 = legs;
                                    if (score132 != null) {
                                    }
                                    if (valueOf8 != null) {
                                    }
                                    if (pair2 != null) {
                                    }
                                    ScorePP score1122 = legPP.getScore();
                                    if (score1122 != null) {
                                    }
                                    if (valueOf3 == null) {
                                    }
                                    str5 = valueOf3;
                                    ScorePP score12222 = legPP.getScore();
                                    if (score12222 == null) {
                                    }
                                    List<PointPP> points3222 = legPP.getPoints();
                                    Iterator it13222 = it12;
                                    ArrayList arrayList10222 = new ArrayList(k13.r(points3222, 10));
                                    it2 = points3222.iterator();
                                    while (it2.hasNext()) {
                                    }
                                    Pair pair6222 = pair2;
                                    int i15222 = i13;
                                    gv9 W3222 = l6g.W(arrayList10222);
                                    gv9 c3222 = yye.c(context, event, scoring$default);
                                    score = legPP.getScore();
                                    if (score != null) {
                                    }
                                    arrayList3.add(new zye(str4, str5, z8, W3222, c3222, i3, R.drawable.ic_dart_16, i6 != size2 && i12 == list3.size() + (-1), yye.a(event, scoring$default)));
                                    legs = list3;
                                    it12 = it13222;
                                    pair2 = pair6222;
                                    i12 = i15222;
                                }
                            }
                            arrayList4 = arrayList3;
                        } else {
                            if (!set2.contains(s)) {
                                a70.p(lnb.o("Sport ", ok3.s(event), " is not supported for point by point adapter."));
                                return;
                            }
                            int size3 = list2.size() - 1;
                            if (Boolean.valueOf(z).equals(Boolean.TRUE)) {
                                Integer scoreByPeriodName5 = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(event.getLastPeriod());
                                String valueOf9 = scoreByPeriodName5 != null ? String.valueOf(scoreByPeriodName5.intValue()) : null;
                                Integer scoreByPeriodName6 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(event.getLastPeriod());
                                pair = new Pair(valueOf9, scoreByPeriodName6 != null ? String.valueOf(scoreByPeriodName6.intValue()) : null);
                            } else {
                                pair = null;
                            }
                            boolean z9 = z && i6 == 0;
                            if (pair != null && (valueOf = (String) pair.a) != null) {
                                if (!z9) {
                                    valueOf = null;
                                }
                            }
                            ScorePP score14 = setPP2.getScore();
                            valueOf = (score14 == null || (homeScore$default = ScorePP.getHomeScore$default(score14, null, 1, null)) == null) ? null : String.valueOf(homeScore$default.intValue());
                            if (valueOf == null) {
                                str2 = "";
                                if (pair != null && (valueOf2 = (String) pair.b) != null) {
                                    if (!z9) {
                                        valueOf2 = null;
                                    }
                                }
                                ScorePP score15 = setPP2.getScore();
                                valueOf2 = (score15 != null || (awayScore$default = ScorePP.getAwayScore$default(score15, null, 1, null)) == null) ? null : String.valueOf(awayScore$default.intValue());
                                if (valueOf2 == null) {
                                    str3 = "";
                                    points = setPP2.getPoints();
                                    if (points != null) {
                                        c = '\n';
                                        arrayList2 = new ArrayList(k13.r(points, 10));
                                        for (PointPP pointPP4 : points) {
                                            arrayList2.add(new eze(PointPP.getHomePoint$default(pointPP4, null, 1, null), PointPP.getAwayPoint$default(pointPP4, null, 1, null), yye.b(PointPP.getHomePointType$default(pointPP4, null, 1, null)), yye.b(PointPP.getAwayPointType$default(pointPP4, null, 1, null))));
                                        }
                                    } else {
                                        c = '\n';
                                        arrayList2 = null;
                                    }
                                    List list7 = arrayList2;
                                    if (arrayList2 == null) {
                                        list7 = km5.a;
                                    }
                                    list4 = a.c(new bze(l6g.W(list7), str2, str3, z9, i6 == size3));
                                    if (list4 == null) {
                                        b.addAll(list4);
                                    }
                                }
                                str3 = valueOf2;
                                points = setPP2.getPoints();
                                if (points != null) {
                                }
                                List list72 = arrayList2;
                                if (arrayList2 == null) {
                                }
                                list4 = a.c(new bze(l6g.W(list72), str2, str3, z9, i6 == size3));
                                if (list4 == null) {
                                }
                            }
                            str2 = valueOf;
                            if (pair != null) {
                                if (!z9) {
                                }
                            }
                            ScorePP score152 = setPP2.getScore();
                            if (score152 != null) {
                            }
                            if (valueOf2 == null) {
                            }
                            str3 = valueOf2;
                            points = setPP2.getPoints();
                            if (points != null) {
                            }
                            List list722 = arrayList2;
                            if (arrayList2 == null) {
                            }
                            list4 = a.c(new bze(l6g.W(list722), str2, str3, z9, i6 == size3));
                            if (list4 == null) {
                            }
                        }
                    }
                    c = '\n';
                    list4 = arrayList4;
                    if (list4 == null) {
                    }
                }
                H02 = list2;
                D = z;
                arrayList8 = arrayList;
                it10 = it;
                i6 = i;
            }
            str = "";
            if (event instanceof DartsEvent) {
            }
            b.add(new aze(setPP2.getSet(), str, !D && i6 == 0, setPP2.getExpanded(), i6 == 0, b.isEmpty(), (i6 == H02.size() - 1 || setPP2.getExpanded()) ? false : true));
            if (setPP2.getExpanded()) {
            }
            H02 = list2;
            D = z;
            arrayList8 = arrayList;
            it10 = it;
            i6 = i;
        }
        F(a.a(b));
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return ((cze) obj) instanceof aze;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 5);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        cze czeVar = (cze) obj;
        czeVar.getClass();
        if (czeVar instanceof aze) {
            vye[] vyeVarArr = vye.a;
            return 0;
        }
        if (czeVar instanceof zye) {
            vye[] vyeVarArr2 = vye.a;
            return 1;
        }
        if (czeVar instanceof bze) {
            vye[] vyeVarArr3 = vye.a;
            return 2;
        }
        zzl.b();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        Object obj;
        viewGroup.getClass();
        Iterator<E> it = vye.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((vye) obj).ordinal() == i) {
                break;
            }
        }
        vye vyeVar = (vye) obj;
        if (vyeVar == null) {
            ilg.c();
            return null;
        }
        int ordinal = vyeVar.ordinal();
        Context context = this.b;
        if (ordinal == 0) {
            return new m34(esk.b(LayoutInflater.from(context), viewGroup), 2);
        }
        if (ordinal == 1) {
            return new m34(esk.b(LayoutInflater.from(context), viewGroup), 1);
        }
        if (ordinal == 2) {
            return new m34(esk.b(LayoutInflater.from(context), viewGroup), 3);
        }
        zzl.b();
        return null;
    }
}
