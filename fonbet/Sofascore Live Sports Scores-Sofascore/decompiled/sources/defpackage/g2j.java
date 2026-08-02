package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.Injury;
import com.sofascore.model.Money;
import com.sofascore.model.PlayerActiveSuspension;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.CricketSupportStaff;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PlayerItem;
import com.sofascore.model.newNetwork.PlayerWithDepthAssignment;
import com.sofascore.model.newNetwork.PlayerWithNationalTeam;
import com.sofascore.model.newNetwork.PlayerWithPreviousTeam;
import com.sofascore.model.newNetwork.TeamPlayersResponse;
import com.sofascore.results.R;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lg2j;", "Lynb;", "Ld2j;", "Lh1j;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g2j extends ynb {
    public final j0j l;
    public final Team m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2j(fqg fqgVar, j0j j0jVar, Application application) {
        super(application, tnb.a);
        j0jVar.getClass();
        fqgVar.getClass();
        this.l = j0jVar;
        Object a = fqgVar.a("TEAM");
        if (a != null) {
            this.m = (Team) a;
        } else {
            a70.p("Required value was null.");
            throw null;
        }
    }

    public static void t(ArrayList arrayList, ArrayList arrayList2, wv9 wv9Var, Function1 function1, Function1 function12) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object invoke = function1.invoke(next);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(next);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            String str2 = (String) function12.invoke(str);
            if (str2 != null) {
                arrayList.add(new v1j(str, str2, wv9Var));
            }
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                b2j b2jVar = (b2j) obj2;
                boolean z = true;
                if (i >= list.size() - 1) {
                    z = false;
                }
                arrayList.add(new u1j(b2jVar, false, z, wv9Var));
                i = i2;
            }
        }
    }

    public static void u(ArrayList arrayList, ArrayList arrayList2, wv9 wv9Var) {
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(new x1j(wv9Var));
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            c2j c2jVar = (c2j) next;
            boolean z = true;
            if (i >= arrayList2.size() - 1) {
                z = false;
            }
            arrayList.add(new w1j(c2jVar, z, wv9Var));
            i = i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x028d, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.HANDBALL) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02a5, code lost:
    
        r3 = 2;
        t(r6, r18, r5, new defpackage.e2j(r16, r3), new defpackage.i1j(10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0297, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.AMERICAN_FOOTBALL) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a1, code lost:
    
        if (r7.equals(com.sofascore.model.Sports.BASEBALL) == false) goto L139;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gv9 v(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, tee teeVar, cq9 cq9Var) {
        String str;
        String str2;
        Throwable th;
        String str3;
        Country country;
        String alpha2;
        com.sofascore.model.Country a;
        kp5 kp5Var = n1j.i;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : kp5Var) {
            if (((n1j) obj) != n1j.c) {
                arrayList4.add(obj);
            }
        }
        wv9 Y = l6g.Y(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        Team team = this.m;
        Manager manager = team.getManager();
        arrayList5.add(new t1j(new a2j(manager != null ? Integer.valueOf(manager.getId()) : null, manager != null ? tba.s(manager) : null, (manager == null || (country = manager.getCountry()) == null || (alpha2 = country.getAlpha2()) == null || (a = dv3.a(alpha2)) == null) ? null : new av3(a.getIso2Alpha(), a.getIoc())), l6g.M(n1j.d)));
        ArrayList arrayList6 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long dateOfBirthTimestamp = ((n0i) it.next()).a.getDateOfBirthTimestamp();
            Integer valueOf = dateOfBirthTimestamp != null ? Integer.valueOf((int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(dateOfBirthTimestamp.longValue() * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v())))) : null;
            if (valueOf != null) {
                arrayList6.add(valueOf);
            }
        }
        if (arrayList6.isEmpty()) {
            arrayList6 = null;
        }
        if (arrayList6 != null) {
            double s = yid.s(CollectionsKt.P(arrayList6), 1);
            str = i().getResources().getQuantityString(R.plurals.years_short, wzb.a(10.0d * s) % 10, String.format(dla.d(), "%.1f", Double.valueOf(s)));
        } else {
            str = null;
        }
        if (str != null) {
            arrayList5.add(new y1j(new q9k(R.string.average_age), str, l6g.M(n1j.e)));
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Integer height = ((n0i) it2.next()).a.getHeight();
            if (height != null) {
                arrayList7.add(height);
            }
        }
        if (arrayList7.isEmpty()) {
            arrayList7 = null;
        }
        String w = arrayList7 != null ? v7a.w(i(), yid.s(CollectionsKt.P(arrayList7), 1) / 100.0d, (r4 & 4) == 0, false) : null;
        if (w != null) {
            arrayList5.add(new y1j(new q9k(R.string.average_height), w, l6g.M(n1j.f)));
        }
        Iterator it3 = arrayList.iterator();
        final int i = 0;
        int i2 = 0;
        while (it3.hasNext()) {
            Money proposedMarketValueRaw = ((n0i) it3.next()).a.getProposedMarketValueRaw();
            i2 += yid.m(proposedMarketValueRaw != null ? Integer.valueOf(proposedMarketValueRaw.getValue()) : null);
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (i2 <= 0) {
            valueOf2 = null;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                str2 = null;
                break;
            }
            Money proposedMarketValueRaw2 = ((n0i) it4.next()).a.getProposedMarketValueRaw();
            str2 = proposedMarketValueRaw2 != null ? proposedMarketValueRaw2.getCurrency() : null;
            if (str2 != null) {
                break;
            }
        }
        if (valueOf2 == null || str2 == null) {
            th = null;
            str3 = null;
        } else {
            int intValue = valueOf2.intValue();
            Set set = o84.a;
            th = null;
            str3 = o84.a(i(), new Money(intValue, str2), 0L, 4);
        }
        if (str3 != null) {
            arrayList5.add(new y1j(new q9k(R.string.total_market_value), str3, l6g.M(n1j.g)));
        }
        String sportSlug = team.getSportSlug();
        if (sportSlug != null) {
            switch (sportSlug.hashCode()) {
                case -2002238939:
                    if (sportSlug.equals(Sports.ICE_HOCKEY)) {
                        final int i3 = 1;
                        t(arrayList5, arrayList2, Y, new Function1(this) { // from class: e2j
                            public final /* synthetic */ g2j b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i4 = i3;
                                g2j g2jVar = this.b;
                                switch (i4) {
                                    case 0:
                                        Context i5 = g2jVar.i();
                                        Team team2 = g2jVar.m;
                                        return vha.t(i5, team2.getGender(), team2.getSportSlug(), (String) obj2, true);
                                    case 1:
                                        b2j b2jVar = (b2j) obj2;
                                        b2jVar.getClass();
                                        Context i6 = g2jVar.i();
                                        Team team3 = g2jVar.m;
                                        return vha.t(i6, team3.getGender(), team3.getSportSlug(), b2jVar.u, true);
                                    case 2:
                                        b2j b2jVar2 = (b2j) obj2;
                                        b2jVar2.getClass();
                                        Context i7 = g2jVar.i();
                                        Team team4 = g2jVar.m;
                                        return vha.t(i7, team4.getGender(), team4.getSportSlug(), b2jVar2.u, true);
                                    default:
                                        String str4 = (String) obj2;
                                        if (str4 != null) {
                                            Context i8 = g2jVar.i();
                                            Team team5 = g2jVar.m;
                                            Sport sport = team5.getSport();
                                            String u = dti.u(i8, team5.getGender(), sport != null ? sport.getSlug() : null, str4, false);
                                            if (u != null) {
                                                return u;
                                            }
                                        }
                                        String string = g2jVar.i().getString(R.string.value_unknown);
                                        string.getClass();
                                        return string;
                                }
                            }
                        }, new i1j(10));
                        if (cq9Var != null) {
                            bfe M = l6g.M(n1j.c);
                            if (!cq9Var.a.isEmpty()) {
                                String string = i().getString(R.string.hockey_forwards);
                                string.getClass();
                                arrayList5.add(new r1j("forwards", string, cq9Var.a, l6g.K(i().getString(R.string.hockey_left_wing_short), i().getString(R.string.hockey_centre_short), i().getString(R.string.hockey_right_wing_short)), M));
                            }
                            if (!cq9Var.b.isEmpty()) {
                                String string2 = i().getString(R.string.hockey_defensive_pairings);
                                string2.getClass();
                                arrayList5.add(new r1j("defenders", string2, cq9Var.b, null, M));
                            }
                            if (!cq9Var.c.isEmpty()) {
                                String string3 = i().getString(R.string.hockey_first_pp_unit);
                                string3.getClass();
                                arrayList5.add(new r1j("powerplay_1", string3, cq9Var.c, null, M));
                            }
                            if (!cq9Var.d.isEmpty()) {
                                String string4 = i().getString(R.string.hockey_second_pp_unit);
                                string4.getClass();
                                arrayList5.add(new r1j("powerplay_2", string4, cq9Var.d, null, M));
                            }
                            if (!cq9Var.e.isEmpty()) {
                                String string5 = i().getString(R.string.hockey_goalies);
                                string5.getClass();
                                arrayList5.add(new r1j("goalies", string5, cq9Var.e, null, M));
                            }
                            if (!cq9Var.f.isEmpty()) {
                                String string6 = i().getString(R.string.injuries_and_suspensions);
                                string6.getClass();
                                arrayList5.add(new r1j("absences", string6, cq9Var.f, null, M));
                            }
                            arrayList5.add(s1j.a);
                        }
                        return l6g.W(arrayList5);
                    }
                    break;
                case -1721090992:
                    break;
                case -83759494:
                    break;
                case 1767150:
                    break;
                case 394668909:
                    if (sportSlug.equals(Sports.FOOTBALL)) {
                        t(arrayList5, arrayList2, Y, new i1j(9), new Function1(this) { // from class: e2j
                            public final /* synthetic */ g2j b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i4 = i;
                                g2j g2jVar = this.b;
                                switch (i4) {
                                    case 0:
                                        Context i5 = g2jVar.i();
                                        Team team2 = g2jVar.m;
                                        return vha.t(i5, team2.getGender(), team2.getSportSlug(), (String) obj2, true);
                                    case 1:
                                        b2j b2jVar = (b2j) obj2;
                                        b2jVar.getClass();
                                        Context i6 = g2jVar.i();
                                        Team team3 = g2jVar.m;
                                        return vha.t(i6, team3.getGender(), team3.getSportSlug(), b2jVar.u, true);
                                    case 2:
                                        b2j b2jVar2 = (b2j) obj2;
                                        b2jVar2.getClass();
                                        Context i7 = g2jVar.i();
                                        Team team4 = g2jVar.m;
                                        return vha.t(i7, team4.getGender(), team4.getSportSlug(), b2jVar2.u, true);
                                    default:
                                        String str4 = (String) obj2;
                                        if (str4 != null) {
                                            Context i8 = g2jVar.i();
                                            Team team5 = g2jVar.m;
                                            Sport sport = team5.getSport();
                                            String u = dti.u(i8, team5.getGender(), sport != null ? sport.getSlug() : null, str4, false);
                                            if (u != null) {
                                                return u;
                                            }
                                        }
                                        String string7 = g2jVar.i().getString(R.string.value_unknown);
                                        string7.getClass();
                                        return string7;
                                }
                            }
                        });
                        return l6g.W(arrayList5);
                    }
                    break;
                case 727149765:
                    if (sportSlug.equals(Sports.BASKETBALL)) {
                        final int i4 = 3;
                        t(arrayList5, arrayList2, Y, new i1j(11), new Function1(this) { // from class: e2j
                            public final /* synthetic */ g2j b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i42 = i4;
                                g2j g2jVar = this.b;
                                switch (i42) {
                                    case 0:
                                        Context i5 = g2jVar.i();
                                        Team team2 = g2jVar.m;
                                        return vha.t(i5, team2.getGender(), team2.getSportSlug(), (String) obj2, true);
                                    case 1:
                                        b2j b2jVar = (b2j) obj2;
                                        b2jVar.getClass();
                                        Context i6 = g2jVar.i();
                                        Team team3 = g2jVar.m;
                                        return vha.t(i6, team3.getGender(), team3.getSportSlug(), b2jVar.u, true);
                                    case 2:
                                        b2j b2jVar2 = (b2j) obj2;
                                        b2jVar2.getClass();
                                        Context i7 = g2jVar.i();
                                        Team team4 = g2jVar.m;
                                        return vha.t(i7, team4.getGender(), team4.getSportSlug(), b2jVar2.u, true);
                                    default:
                                        String str4 = (String) obj2;
                                        if (str4 != null) {
                                            Context i8 = g2jVar.i();
                                            Team team5 = g2jVar.m;
                                            Sport sport = team5.getSport();
                                            String u = dti.u(i8, team5.getGender(), sport != null ? sport.getSlug() : null, str4, false);
                                            if (u != null) {
                                                return u;
                                            }
                                        }
                                        String string7 = g2jVar.i().getString(R.string.value_unknown);
                                        string7.getClass();
                                        return string7;
                                }
                            }
                        });
                        u(arrayList5, arrayList3, Y);
                        if (teeVar != null && !teeVar.isEmpty()) {
                            arrayList5.add(new q1j(teeVar, l6g.M(n1j.c)));
                        }
                        return l6g.W(arrayList5);
                    }
                    break;
            }
        }
        Iterator it5 = arrayList2.iterator();
        int i5 = 0;
        while (it5.hasNext()) {
            Object next = it5.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                b.q();
                throw th;
            }
            arrayList5.add(new u1j((b2j) next, i5 == 0, i5 < arrayList2.size() - 1, Y));
            i5 = i6;
        }
        u(arrayList5, arrayList3, Y);
        return l6g.W(arrayList5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0280, code lost:
    
        if (r1 != null) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0c02  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0bcf  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [com.sofascore.model.mvvm.model.Team] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r16v45 */
    /* JADX WARN: Type inference failed for: r16v46, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r16v47 */
    /* JADX WARN: Type inference failed for: r40v1, types: [java.lang.Object, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(sq3 sq3Var) {
        f2j f2jVar;
        int i;
        TeamPlayersResponse teamPlayersResponse;
        Map map;
        Map map2;
        tee teeVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        gv9 gv9Var;
        cq9 cq9Var;
        tee teeVar2;
        gv9 gv9Var2;
        Object obj;
        boolean z2;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        List<PlayerActiveSuspension> activeSeasonSuspensions;
        Object obj2;
        Object obj3;
        v6a v6aVar;
        Object obj4;
        Iterable iterable;
        Object obj5;
        ArrayList arrayList3;
        Object obj6;
        List<PlayerWithDepthAssignment> teamDepthAssignments;
        sui suiVar;
        av3 av3Var;
        String alpha2;
        com.sofascore.model.Country a;
        ArrayList arrayList4;
        gv9 gv9Var3;
        String u;
        String str;
        String status;
        ArrayList arrayList5;
        q9k q9kVar;
        Long dateOfBirthTimestamp;
        Team team;
        String str2;
        p9k p9kVar;
        Long dateOfBirthTimestamp2;
        Team team2;
        String str3;
        String str4;
        String str5;
        String str6;
        Money proposedMarketValueRaw;
        int i2;
        String str7;
        Money salary;
        q9k q9kVar2;
        Integer num;
        String str8;
        Long l;
        String str9;
        String sportSlug;
        boolean z3;
        Set set;
        String sportSlug2;
        String w;
        r9k r9kVar;
        int i3;
        r9k r9kVar2;
        r9k r9kVar3;
        String str10;
        sui suiVar2;
        if (sq3Var instanceof f2j) {
            f2jVar = (f2j) sq3Var;
            int i4 = f2jVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                f2jVar.t = i4 - Integer.MIN_VALUE;
                Object obj7 = f2jVar.r;
                lu3 lu3Var = lu3.a;
                i = f2jVar.t;
                Team team3 = this.m;
                boolean z4 = true;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj7);
                    int id = team3.getId();
                    f2jVar.t = 1;
                    j0j j0jVar = this.l;
                    j0jVar.getClass();
                    obj7 = yaa.P(new azi(j0jVar, id, rq3Var, 13), f2jVar);
                    if (obj7 == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj7);
                }
                teamPlayersResponse = (TeamPlayersResponse) yaa.x((x2g) obj7);
                if (teamPlayersResponse != null) {
                    List<PlayerWithPreviousTeam> playerPreviousTeam = teamPlayersResponse.getPlayerPreviousTeam();
                    int i5 = 10;
                    if (playerPreviousTeam != null) {
                        int c = sub.c(k13.r(playerPreviousTeam, 10));
                        if (c < 16) {
                            c = 16;
                        }
                        map = new LinkedHashMap(c);
                        for (Object obj8 : playerPreviousTeam) {
                            map.put(new Integer(((PlayerWithPreviousTeam) obj8).getPlayer().getId()), obj8);
                        }
                    } else {
                        map = null;
                    }
                    if (map == null) {
                        map = lm5.a;
                        map.getClass();
                    }
                    List<PlayerWithNationalTeam> nationalTeamPlayerStatistics = teamPlayersResponse.getNationalTeamPlayerStatistics();
                    if (nationalTeamPlayerStatistics != null) {
                        int c2 = sub.c(k13.r(nationalTeamPlayerStatistics, 10));
                        map2 = new LinkedHashMap(c2 >= 16 ? c2 : 16);
                        for (Object obj9 : nationalTeamPlayerStatistics) {
                            map2.put(new Integer(((PlayerWithNationalTeam) obj9).getPlayer().getId()), obj9);
                        }
                    } else {
                        map2 = null;
                    }
                    if (map2 == null) {
                        map2 = lm5.a;
                        map2.getClass();
                    }
                    List<PlayerItem> players = teamPlayersResponse.getPlayers();
                    ArrayList arrayList6 = new ArrayList(k13.r(players, 10));
                    for (PlayerItem playerItem : players) {
                        Player player = playerItem.getPlayer();
                        PlayerWithPreviousTeam playerWithPreviousTeam = (PlayerWithPreviousTeam) map.get(new Integer(playerItem.getPlayer().getId()));
                        ?? previousTeam = playerWithPreviousTeam != null ? playerWithPreviousTeam.getPreviousTeam() : rq3Var;
                        PlayerWithNationalTeam playerWithNationalTeam = (PlayerWithNationalTeam) map2.get(new Integer(playerItem.getPlayer().getId()));
                        ?? appearances = playerWithNationalTeam != null ? playerWithNationalTeam.getAppearances() : rq3Var;
                        rq3 rq3Var2 = rq3Var;
                        PlayerWithNationalTeam playerWithNationalTeam2 = (PlayerWithNationalTeam) map2.get(new Integer(playerItem.getPlayer().getId()));
                        ?? goals = playerWithNationalTeam2 != null ? playerWithNationalTeam2.getGoals() : rq3Var2;
                        PlayerWithNationalTeam playerWithNationalTeam3 = (PlayerWithNationalTeam) map2.get(new Integer(playerItem.getPlayer().getId()));
                        arrayList6.add(new n0i(player, previousTeam, appearances, goals, playerWithNationalTeam3 != null ? playerWithNationalTeam3.getDebutTimestamp() : rq3Var2));
                        rq3Var = rq3Var2;
                    }
                    ?? r40 = rq3Var;
                    ArrayList arrayList7 = new ArrayList(k13.r(arrayList6, 10));
                    Iterator it = arrayList6.iterator();
                    while (it.hasNext()) {
                        n0i n0iVar = (n0i) it.next();
                        Context i6 = i();
                        n0iVar.getClass();
                        team3.getClass();
                        Player player2 = n0iVar.a;
                        Team team4 = n0iVar.b;
                        if (team3.getNational()) {
                            Team team5 = player2.getTeam();
                            if (team5 != null) {
                                if (team5.getNational()) {
                                    team5 = r40;
                                }
                                if (team5 != null) {
                                    suiVar2 = new sui(team5.getId(), tba.p(i6, team5));
                                    av3Var = r40;
                                    suiVar = suiVar2;
                                }
                            }
                            suiVar2 = r40;
                            av3Var = r40;
                            suiVar = suiVar2;
                        } else {
                            Country country = player2.getCountry();
                            suiVar = r40;
                            av3Var = (country == null || (alpha2 = country.getAlpha2()) == null || (a = dv3.a(alpha2)) == null) ? r40 : new av3(a.getIso2Alpha(), a.getIoc());
                        }
                        gv9<hle> b = ele.b(player2, z4);
                        if (b != null) {
                            ArrayList arrayList8 = new ArrayList(k13.r(b, i5));
                            for (hle hleVar : b) {
                                fle fleVar = hleVar.b;
                                r9k r9kVar4 = hleVar.d;
                                ArrayList arrayList9 = arrayList6;
                                r9k r9kVar5 = hleVar.e;
                                int ordinal = fleVar.ordinal();
                                if (ordinal != 0) {
                                    r9kVar = r9kVar5;
                                    i3 = 1;
                                    if (ordinal != 1) {
                                        zzl.b();
                                        return r40;
                                    }
                                    r9kVar2 = r9kVar;
                                } else {
                                    r9kVar = r9kVar5;
                                    i3 = 1;
                                    r9kVar2 = r9kVar4;
                                }
                                int ordinal2 = hleVar.b.ordinal();
                                if (ordinal2 == 0) {
                                    r9kVar3 = r9kVar;
                                } else {
                                    if (ordinal2 != i3) {
                                        zzl.b();
                                        return r40;
                                    }
                                    gle gleVar = hleVar.g;
                                    r9kVar3 = (gleVar == null || (str10 = gleVar.b) == null) ? r40 : new m9k(str10);
                                }
                                arrayList8.add(new o0(hleVar.c, hleVar.i, r9kVar2, r9kVar3, hleVar.j));
                                arrayList6 = arrayList9;
                            }
                            arrayList4 = arrayList6;
                            gv9Var3 = l6g.W(arrayList8);
                        } else {
                            arrayList4 = arrayList6;
                        }
                        gv9Var3 = rlh.b;
                        gv9 gv9Var4 = gv9Var3;
                        List<String> positionsDetailed = player2.getPositionsDetailed();
                        if (positionsDetailed != null) {
                            u = CollectionsKt.f0(positionsDetailed, null, null, null, null, 63);
                        } else {
                            u = dti.u(i6, team3.getGender(), team3.getSportSlug(), player2.getPosition(), Intrinsics.c(team3.getSportSlug(), Sports.FOOTBALL));
                            if (u.length() <= 0) {
                                str = r40;
                                status = player2.getStatus();
                                if (!Intrinsics.c(status, "Ten-Day")) {
                                    q9kVar = new q9k(R.string.contract_10_days);
                                } else if (Intrinsics.c(status, "Two-Way Contract")) {
                                    q9kVar = new q9k(R.string.contract_two_way);
                                } else {
                                    Long contractUntilTimestamp = player2.getContractUntilTimestamp();
                                    arrayList5 = arrayList7;
                                    if (contractUntilTimestamp != null) {
                                        long longValue = contractUntilTimestamp.longValue();
                                        bi4 bi4Var = bi4.PATTERN_Y;
                                        ConcurrentHashMap concurrentHashMap = hk4.a;
                                        q9kVar = new q9k(R.string.contract_expires_year, l6g.K(fc6.i(longValue, hk4.a(bi4Var.d()))));
                                    } else {
                                        q9kVar = r40;
                                    }
                                    q9k q9kVar3 = q9kVar;
                                    int id2 = player2.getId();
                                    String t = tba.t(player2);
                                    String jerseyNumber = team3.getNational() ? r40 : player2.getJerseyNumber();
                                    dateOfBirthTimestamp = player2.getDateOfBirthTimestamp();
                                    if (dateOfBirthTimestamp != null) {
                                        long longValue2 = dateOfBirthTimestamp.longValue() * 1000;
                                        long v = yaa.v();
                                        LocalDate o = vxd.o(Instant.ofEpochMilli(longValue2));
                                        LocalDate o2 = vxd.o(Instant.ofEpochMilli(v));
                                        team = team4;
                                        str2 = jerseyNumber;
                                        int between = (int) ChronoUnit.YEARS.between(o, o2);
                                        p9kVar = new p9k(R.plurals.years_short, between, l6g.K(String.valueOf(between)));
                                    } else {
                                        team = team4;
                                        str2 = jerseyNumber;
                                        p9kVar = r40;
                                    }
                                    dateOfBirthTimestamp2 = player2.getDateOfBirthTimestamp();
                                    if (dateOfBirthTimestamp2 != null) {
                                        long longValue3 = dateOfBirthTimestamp2.longValue();
                                        bi4 bi4Var2 = bi4.PATTERN_DDMMY;
                                        ConcurrentHashMap concurrentHashMap2 = hk4.a;
                                        Team team6 = team;
                                        str3 = fc6.i(longValue3, hk4.a(bi4Var2.d()));
                                        team2 = team6;
                                    } else {
                                        team2 = team;
                                        str3 = r40;
                                    }
                                    if (player2.getHeight() != null) {
                                        str4 = "";
                                        w = v7a.w(i6, r2.intValue() / 100.0d, (r4 & 4) == 0, false);
                                        str5 = str2;
                                        str6 = w;
                                    } else {
                                        str4 = "";
                                        str5 = str2;
                                        str6 = r40;
                                    }
                                    proposedMarketValueRaw = player2.getProposedMarketValueRaw();
                                    if (proposedMarketValueRaw != null) {
                                        Set set2 = o84.a;
                                        i2 = 12;
                                        str7 = o84.a(i6, proposedMarketValueRaw, 0L, 12);
                                    } else {
                                        i2 = 12;
                                        str7 = r40;
                                    }
                                    salary = player2.getSalary();
                                    if (salary != null) {
                                        Set set3 = o84.a;
                                        q9kVar2 = new q9k(R.string.salary_per_year, l6g.K(o84.a(i6, salary, 0L, i2)));
                                        team2 = team2;
                                    } else {
                                        q9kVar2 = r40;
                                    }
                                    if (team2 != null) {
                                        Team team7 = !team2.getNational() ? team2 : r40;
                                        if (team7 != null) {
                                            num = Integer.valueOf(team7.getId());
                                            if (team2 != null) {
                                                if (team2.getNational()) {
                                                    team2 = r40;
                                                }
                                                if (team2 != null) {
                                                    str8 = tba.p(i6, team2);
                                                    String valueOf6 = String.valueOf(yid.m(n0iVar.c));
                                                    String valueOf7 = String.valueOf(yid.m(n0iVar.d));
                                                    l = n0iVar.e;
                                                    if (l != null) {
                                                        long longValue4 = l.longValue();
                                                        bi4 bi4Var3 = bi4.PATTERN_NETWORK_DMY;
                                                        ConcurrentHashMap concurrentHashMap3 = hk4.a;
                                                        str9 = fc6.i(longValue4, hk4.a(bi4Var3.d()));
                                                    } else {
                                                        str9 = r40;
                                                    }
                                                    sportSlug = player2.getSportSlug();
                                                    if (!player2.getDeceased() && !player2.getRetired() && !player2.getDisabled()) {
                                                        set = wyh.z;
                                                        sportSlug2 = player2.getSportSlug();
                                                        if (sportSlug2 != null) {
                                                            sportSlug = sportSlug2;
                                                        }
                                                        if (CollectionsKt.R(set, sportSlug)) {
                                                            z3 = true;
                                                            String sportSlug3 = team3.getSportSlug();
                                                            arrayList7 = arrayList5;
                                                            arrayList7.add(new b2j(id2, t, str5, str, suiVar, av3Var, gv9Var4, p9kVar, str3, str6, str7, q9kVar3, q9kVar2, num, str8, valueOf6, valueOf7, str9, z3, sportSlug3 != null ? str4 : sportSlug3, player2.getPosition(), player2.getPrimaryPosition(), player2));
                                                            arrayList6 = arrayList4;
                                                            i5 = 10;
                                                            z4 = true;
                                                        }
                                                    }
                                                    z3 = false;
                                                    String sportSlug32 = team3.getSportSlug();
                                                    arrayList7 = arrayList5;
                                                    arrayList7.add(new b2j(id2, t, str5, str, suiVar, av3Var, gv9Var4, p9kVar, str3, str6, str7, q9kVar3, q9kVar2, num, str8, valueOf6, valueOf7, str9, z3, sportSlug32 != null ? str4 : sportSlug32, player2.getPosition(), player2.getPrimaryPosition(), player2));
                                                    arrayList6 = arrayList4;
                                                    i5 = 10;
                                                    z4 = true;
                                                }
                                            }
                                            str8 = r40;
                                            String valueOf62 = String.valueOf(yid.m(n0iVar.c));
                                            String valueOf72 = String.valueOf(yid.m(n0iVar.d));
                                            l = n0iVar.e;
                                            if (l != null) {
                                            }
                                            sportSlug = player2.getSportSlug();
                                            if (!player2.getDeceased()) {
                                                set = wyh.z;
                                                sportSlug2 = player2.getSportSlug();
                                                if (sportSlug2 != null) {
                                                }
                                                if (CollectionsKt.R(set, sportSlug)) {
                                                }
                                            }
                                            z3 = false;
                                            String sportSlug322 = team3.getSportSlug();
                                            arrayList7 = arrayList5;
                                            arrayList7.add(new b2j(id2, t, str5, str, suiVar, av3Var, gv9Var4, p9kVar, str3, str6, str7, q9kVar3, q9kVar2, num, str8, valueOf62, valueOf72, str9, z3, sportSlug322 != null ? str4 : sportSlug322, player2.getPosition(), player2.getPrimaryPosition(), player2));
                                            arrayList6 = arrayList4;
                                            i5 = 10;
                                            z4 = true;
                                        }
                                    }
                                    num = r40;
                                    if (team2 != null) {
                                    }
                                    str8 = r40;
                                    String valueOf622 = String.valueOf(yid.m(n0iVar.c));
                                    String valueOf722 = String.valueOf(yid.m(n0iVar.d));
                                    l = n0iVar.e;
                                    if (l != null) {
                                    }
                                    sportSlug = player2.getSportSlug();
                                    if (!player2.getDeceased()) {
                                    }
                                    z3 = false;
                                    String sportSlug3222 = team3.getSportSlug();
                                    arrayList7 = arrayList5;
                                    arrayList7.add(new b2j(id2, t, str5, str, suiVar, av3Var, gv9Var4, p9kVar, str3, str6, str7, q9kVar3, q9kVar2, num, str8, valueOf622, valueOf722, str9, z3, sportSlug3222 != null ? str4 : sportSlug3222, player2.getPosition(), player2.getPrimaryPosition(), player2));
                                    arrayList6 = arrayList4;
                                    i5 = 10;
                                    z4 = true;
                                }
                                arrayList5 = arrayList7;
                                q9k q9kVar32 = q9kVar;
                                int id22 = player2.getId();
                                String t2 = tba.t(player2);
                                if (team3.getNational()) {
                                }
                                dateOfBirthTimestamp = player2.getDateOfBirthTimestamp();
                                if (dateOfBirthTimestamp != null) {
                                }
                                dateOfBirthTimestamp2 = player2.getDateOfBirthTimestamp();
                                if (dateOfBirthTimestamp2 != null) {
                                }
                                if (player2.getHeight() != null) {
                                }
                                proposedMarketValueRaw = player2.getProposedMarketValueRaw();
                                if (proposedMarketValueRaw != null) {
                                }
                                salary = player2.getSalary();
                                if (salary != null) {
                                }
                                if (team2 != null) {
                                }
                                num = r40;
                                if (team2 != null) {
                                }
                                str8 = r40;
                                String valueOf6222 = String.valueOf(yid.m(n0iVar.c));
                                String valueOf7222 = String.valueOf(yid.m(n0iVar.d));
                                l = n0iVar.e;
                                if (l != null) {
                                }
                                sportSlug = player2.getSportSlug();
                                if (!player2.getDeceased()) {
                                }
                                z3 = false;
                                String sportSlug32222 = team3.getSportSlug();
                                arrayList7 = arrayList5;
                                arrayList7.add(new b2j(id22, t2, str5, str, suiVar, av3Var, gv9Var4, p9kVar, str3, str6, str7, q9kVar32, q9kVar2, num, str8, valueOf6222, valueOf7222, str9, z3, sportSlug32222 != null ? str4 : sportSlug32222, player2.getPosition(), player2.getPrimaryPosition(), player2));
                                arrayList6 = arrayList4;
                                i5 = 10;
                                z4 = true;
                            }
                        }
                        str = u;
                        status = player2.getStatus();
                        if (!Intrinsics.c(status, "Ten-Day")) {
                        }
                        arrayList5 = arrayList7;
                        q9k q9kVar322 = q9kVar;
                        int id222 = player2.getId();
                        String t22 = tba.t(player2);
                        if (team3.getNational()) {
                        }
                        dateOfBirthTimestamp = player2.getDateOfBirthTimestamp();
                        if (dateOfBirthTimestamp != null) {
                        }
                        dateOfBirthTimestamp2 = player2.getDateOfBirthTimestamp();
                        if (dateOfBirthTimestamp2 != null) {
                        }
                        if (player2.getHeight() != null) {
                        }
                        proposedMarketValueRaw = player2.getProposedMarketValueRaw();
                        if (proposedMarketValueRaw != null) {
                        }
                        salary = player2.getSalary();
                        if (salary != null) {
                        }
                        if (team2 != null) {
                        }
                        num = r40;
                        if (team2 != null) {
                        }
                        str8 = r40;
                        String valueOf62222 = String.valueOf(yid.m(n0iVar.c));
                        String valueOf72222 = String.valueOf(yid.m(n0iVar.d));
                        l = n0iVar.e;
                        if (l != null) {
                        }
                        sportSlug = player2.getSportSlug();
                        if (!player2.getDeceased()) {
                        }
                        z3 = false;
                        String sportSlug322222 = team3.getSportSlug();
                        arrayList7 = arrayList5;
                        arrayList7.add(new b2j(id222, t22, str5, str, suiVar, av3Var, gv9Var4, p9kVar, str3, str6, str7, q9kVar322, q9kVar2, num, str8, valueOf62222, valueOf72222, str9, z3, sportSlug322222 != null ? str4 : sportSlug322222, player2.getPosition(), player2.getPrimaryPosition(), player2));
                        arrayList6 = arrayList4;
                        i5 = 10;
                        z4 = true;
                    }
                    ArrayList arrayList10 = arrayList6;
                    List<CricketSupportStaff> supportStaff = teamPlayersResponse.getSupportStaff();
                    ArrayList arrayList11 = new ArrayList(k13.r(supportStaff, 10));
                    int i7 = 0;
                    for (Object obj10 : supportStaff) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            b.q();
                            throw r40;
                        }
                        CricketSupportStaff cricketSupportStaff = (CricketSupportStaff) obj10;
                        cricketSupportStaff.getClass();
                        String name = cricketSupportStaff.getName();
                        Map map3 = d14.a;
                        String role = cricketSupportStaff.getRole();
                        role.getClass();
                        Integer num2 = (Integer) d14.a.get(role);
                        arrayList11.add(new c2j(i7, num2 != null ? new q9k(num2.intValue()) : r40, name));
                        i7 = i8;
                    }
                    if (!Boolean.valueOf(Intrinsics.c(team3.getSportSlug(), Sports.BASKETBALL)).equals(Boolean.TRUE) || (teamDepthAssignments = teamPlayersResponse.getTeamDepthAssignments()) == null || teamDepthAssignments.isEmpty()) {
                        teeVar = null;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj11 : teamDepthAssignments) {
                            String position = ((PlayerWithDepthAssignment) obj11).getPosition();
                            Regex regex = yid.a;
                            if (position == null) {
                                position = "-";
                            }
                            Object obj12 = linkedHashMap.get(position);
                            if (obj12 == null) {
                                obj12 = wv8.n(linkedHashMap, position);
                            }
                            ((List) obj12).add(obj11);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
                        String str11 = r40;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            List<PlayerWithDepthAssignment> list = (List) entry.getValue();
                            ArrayList arrayList12 = new ArrayList(k13.r(list, 10));
                            for (PlayerWithDepthAssignment playerWithDepthAssignment : list) {
                                int id3 = playerWithDepthAssignment.getPlayer().getId();
                                String C = tba.C(playerWithDepthAssignment.getPlayer());
                                if (C == null) {
                                    C = tba.t(playerWithDepthAssignment.getPlayer());
                                }
                                String str12 = C;
                                Integer depth = playerWithDepthAssignment.getDepth();
                                int intValue = depth != null ? depth.intValue() : 0;
                                Gender gender = playerWithDepthAssignment.getPlayer().getGender();
                                Injury injury = playerWithDepthAssignment.getPlayer().getInjury();
                                arrayList12.add(new coe(id3, str12, gender, intValue, injury != null ? injury.getStatus() : str11));
                            }
                            linkedHashMap2.put(key, l6g.W(yso.F(5, str11, arrayList12)));
                            str11 = null;
                        }
                        teeVar = l6g.X(linkedHashMap2);
                    }
                    if (Boolean.valueOf(Intrinsics.c(team3.getSportSlug(), Sports.ICE_HOCKEY)).equals(Boolean.TRUE)) {
                        List<PlayerItem> players2 = teamPlayersResponse.getPlayers();
                        ArrayList arrayList13 = new ArrayList(k13.r(players2, 10));
                        Iterator it2 = players2.iterator();
                        while (it2.hasNext()) {
                            arrayList13.add(((PlayerItem) it2.next()).getPlayer());
                        }
                        List<PlayerWithDepthAssignment> teamDepthAssignments2 = teamPlayersResponse.getTeamDepthAssignments();
                        if (teamDepthAssignments2 != null && !teamDepthAssignments2.isEmpty()) {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj13 : teamDepthAssignments2) {
                                String position2 = ((PlayerWithDepthAssignment) obj13).getPosition();
                                if (position2 == null) {
                                    position2 = "";
                                }
                                Object obj14 = linkedHashMap3.get(position2);
                                if (obj14 == null) {
                                    obj14 = wv8.n(linkedHashMap3, position2);
                                }
                                ((List) obj14).add(obj13);
                            }
                            Iterable iterable2 = (List) linkedHashMap3.get("LW");
                            if (iterable2 == null) {
                                iterable2 = km5.a;
                            }
                            Iterable iterable3 = (List) linkedHashMap3.get("C");
                            if (iterable3 == null) {
                                iterable3 = km5.a;
                            }
                            Iterable iterable4 = (List) linkedHashMap3.get("RW");
                            if (iterable4 == null) {
                                iterable4 = km5.a;
                            }
                            Iterable iterable5 = (List) linkedHashMap3.get(PlayerKt.ICE_HOCKEY_RIGHT_DEFENSEMAN);
                            if (iterable5 == null) {
                                iterable5 = km5.a;
                            }
                            Iterable iterable6 = (List) linkedHashMap3.get(PlayerKt.ICE_HOCKEY_LEFT_DEFENSEMAN);
                            if (iterable6 == null) {
                                iterable6 = km5.a;
                            }
                            List list2 = (List) linkedHashMap3.get("PP1");
                            if (list2 == null) {
                                list2 = km5.a;
                            }
                            List list3 = (List) linkedHashMap3.get("PP2");
                            if (list3 == null) {
                                list3 = km5.a;
                            }
                            List list4 = (List) linkedHashMap3.get("G");
                            if (list4 == null) {
                                list4 = km5.a;
                            }
                            Iterator it3 = iterable2.iterator();
                            if (it3.hasNext()) {
                                Integer depth2 = ((PlayerWithDepthAssignment) it3.next()).getDepth();
                                valueOf = Integer.valueOf(depth2 != null ? depth2.intValue() : 0);
                                while (it3.hasNext()) {
                                    Integer depth3 = ((PlayerWithDepthAssignment) it3.next()).getDepth();
                                    Iterable iterable7 = iterable2;
                                    Integer valueOf8 = Integer.valueOf(depth3 != null ? depth3.intValue() : 0);
                                    if (valueOf.compareTo(valueOf8) < 0) {
                                        valueOf = valueOf8;
                                    }
                                    iterable2 = iterable7;
                                }
                            } else {
                                valueOf = null;
                            }
                            Iterable iterable8 = iterable2;
                            int intValue2 = valueOf != null ? valueOf.intValue() : 0;
                            Iterator it4 = iterable3.iterator();
                            if (it4.hasNext()) {
                                Integer depth4 = ((PlayerWithDepthAssignment) it4.next()).getDepth();
                                valueOf2 = Integer.valueOf(depth4 != null ? depth4.intValue() : 0);
                                while (it4.hasNext()) {
                                    Integer depth5 = ((PlayerWithDepthAssignment) it4.next()).getDepth();
                                    ArrayList arrayList14 = arrayList7;
                                    Integer valueOf9 = Integer.valueOf(depth5 != null ? depth5.intValue() : 0);
                                    if (valueOf2.compareTo(valueOf9) < 0) {
                                        valueOf2 = valueOf9;
                                    }
                                    arrayList7 = arrayList14;
                                }
                            } else {
                                valueOf2 = null;
                            }
                            arrayList = arrayList7;
                            int intValue3 = valueOf2 != null ? valueOf2.intValue() : 0;
                            Iterator it5 = iterable4.iterator();
                            if (it5.hasNext()) {
                                Integer depth6 = ((PlayerWithDepthAssignment) it5.next()).getDepth();
                                valueOf3 = Integer.valueOf(depth6 != null ? depth6.intValue() : 0);
                                while (it5.hasNext()) {
                                    Integer depth7 = ((PlayerWithDepthAssignment) it5.next()).getDepth();
                                    ArrayList arrayList15 = arrayList11;
                                    Integer valueOf10 = Integer.valueOf(depth7 != null ? depth7.intValue() : 0);
                                    if (valueOf3.compareTo(valueOf10) < 0) {
                                        valueOf3 = valueOf10;
                                    }
                                    arrayList11 = arrayList15;
                                }
                            } else {
                                valueOf3 = null;
                            }
                            arrayList2 = arrayList11;
                            IntRange intRange = new IntRange(1, Math.max(intValue2, Math.max(intValue3, valueOf3 != null ? valueOf3.intValue() : 0)), 1);
                            ArrayList arrayList16 = new ArrayList(k13.r(intRange, 10));
                            v6a it6 = intRange.iterator();
                            while (it6.c) {
                                int intValue4 = ((Number) it6.next()).intValue();
                                Iterator it7 = iterable8.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        v6aVar = it6;
                                        obj4 = null;
                                        break;
                                    }
                                    obj4 = it7.next();
                                    Integer depth8 = ((PlayerWithDepthAssignment) obj4).getDepth();
                                    v6aVar = it6;
                                    if (depth8 != null && depth8.intValue() == intValue4) {
                                        break;
                                    }
                                    it6 = v6aVar;
                                }
                                PlayerWithDepthAssignment playerWithDepthAssignment2 = (PlayerWithDepthAssignment) obj4;
                                qp9 X = playerWithDepthAssignment2 != null ? gz8.X(playerWithDepthAssignment2) : null;
                                Iterator it8 = iterable3.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        iterable = iterable3;
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = it8.next();
                                    Integer depth9 = ((PlayerWithDepthAssignment) obj5).getDepth();
                                    iterable = iterable3;
                                    if (depth9 != null && depth9.intValue() == intValue4) {
                                        break;
                                    }
                                    iterable3 = iterable;
                                }
                                PlayerWithDepthAssignment playerWithDepthAssignment3 = (PlayerWithDepthAssignment) obj5;
                                qp9 X2 = playerWithDepthAssignment3 != null ? gz8.X(playerWithDepthAssignment3) : null;
                                Iterator it9 = iterable4.iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        arrayList3 = arrayList13;
                                        obj6 = null;
                                        break;
                                    }
                                    obj6 = it9.next();
                                    Integer depth10 = ((PlayerWithDepthAssignment) obj6).getDepth();
                                    arrayList3 = arrayList13;
                                    if (depth10 != null && depth10.intValue() == intValue4) {
                                        break;
                                    }
                                    arrayList13 = arrayList3;
                                }
                                PlayerWithDepthAssignment playerWithDepthAssignment4 = (PlayerWithDepthAssignment) obj6;
                                arrayList16.add(l6g.K(X, X2, playerWithDepthAssignment4 != null ? gz8.X(playerWithDepthAssignment4) : null));
                                it6 = v6aVar;
                                iterable3 = iterable;
                                arrayList13 = arrayList3;
                            }
                            ArrayList arrayList17 = arrayList13;
                            gv9 W = l6g.W(arrayList16);
                            Iterator it10 = iterable6.iterator();
                            if (it10.hasNext()) {
                                Integer depth11 = ((PlayerWithDepthAssignment) it10.next()).getDepth();
                                valueOf4 = Integer.valueOf(depth11 != null ? depth11.intValue() : 0);
                                while (it10.hasNext()) {
                                    Integer depth12 = ((PlayerWithDepthAssignment) it10.next()).getDepth();
                                    Integer valueOf11 = Integer.valueOf(depth12 != null ? depth12.intValue() : 0);
                                    if (valueOf4.compareTo(valueOf11) < 0) {
                                        valueOf4 = valueOf11;
                                    }
                                }
                            } else {
                                valueOf4 = null;
                            }
                            int intValue5 = valueOf4 != null ? valueOf4.intValue() : 0;
                            Iterator it11 = iterable5.iterator();
                            if (it11.hasNext()) {
                                Integer depth13 = ((PlayerWithDepthAssignment) it11.next()).getDepth();
                                valueOf5 = Integer.valueOf(depth13 != null ? depth13.intValue() : 0);
                                while (it11.hasNext()) {
                                    Integer depth14 = ((PlayerWithDepthAssignment) it11.next()).getDepth();
                                    Integer valueOf12 = Integer.valueOf(depth14 != null ? depth14.intValue() : 0);
                                    if (valueOf5.compareTo(valueOf12) < 0) {
                                        valueOf5 = valueOf12;
                                    }
                                }
                            } else {
                                valueOf5 = null;
                            }
                            IntRange intRange2 = new IntRange(1, Math.max(intValue5, valueOf5 != null ? valueOf5.intValue() : 0), 1);
                            ArrayList arrayList18 = new ArrayList(k13.r(intRange2, 10));
                            v6a it12 = intRange2.iterator();
                            while (it12.c) {
                                int nextInt = it12.nextInt();
                                Iterator it13 = iterable6.iterator();
                                while (true) {
                                    if (!it13.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it13.next();
                                    Integer depth15 = ((PlayerWithDepthAssignment) obj2).getDepth();
                                    if (depth15 != null && depth15.intValue() == nextInt) {
                                        break;
                                    }
                                }
                                PlayerWithDepthAssignment playerWithDepthAssignment5 = (PlayerWithDepthAssignment) obj2;
                                qp9 X3 = playerWithDepthAssignment5 != null ? gz8.X(playerWithDepthAssignment5) : null;
                                Iterator it14 = iterable5.iterator();
                                while (true) {
                                    if (!it14.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it14.next();
                                    Integer depth16 = ((PlayerWithDepthAssignment) obj3).getDepth();
                                    if (depth16 != null && depth16.intValue() == nextInt) {
                                        break;
                                    }
                                }
                                PlayerWithDepthAssignment playerWithDepthAssignment6 = (PlayerWithDepthAssignment) obj3;
                                arrayList18.add(l6g.K(X3, playerWithDepthAssignment6 != null ? gz8.X(playerWithDepthAssignment6) : null));
                            }
                            gv9 W2 = l6g.W(arrayList18);
                            gv9 Q = gz8.Q(list2);
                            gv9 Q2 = gz8.Q(list3);
                            List H0 = CollectionsKt.H0(list4, new se7(19));
                            ArrayList arrayList19 = new ArrayList(k13.r(H0, 10));
                            Iterator it15 = H0.iterator();
                            while (it15.hasNext()) {
                                arrayList19.add(gz8.X((PlayerWithDepthAssignment) it15.next()));
                            }
                            int size = list4.size();
                            int i9 = 3;
                            ArrayList Q3 = CollectionsKt.Q(size == 1 ? 1 : size % 2 == 0 ? 2 : 3, arrayList19);
                            ArrayList arrayList20 = new ArrayList(k13.r(Q3, 10));
                            Iterator it16 = Q3.iterator();
                            while (it16.hasNext()) {
                                arrayList20.add(l6g.W((List) it16.next()));
                            }
                            gv9 W3 = l6g.W(arrayList20);
                            ArrayList arrayList21 = new ArrayList();
                            Iterator it17 = arrayList17.iterator();
                            while (it17.hasNext()) {
                                Object next = it17.next();
                                Player player3 = (Player) next;
                                if (player3.getInjury() != null || ((activeSeasonSuspensions = player3.getActiveSeasonSuspensions()) != null && !activeSeasonSuspensions.isEmpty())) {
                                    arrayList21.add(next);
                                }
                            }
                            ArrayList arrayList22 = new ArrayList(k13.r(arrayList21, 10));
                            Iterator it18 = arrayList21.iterator();
                            while (it18.hasNext()) {
                                Player player4 = (Player) it18.next();
                                int id4 = player4.getId();
                                String C2 = tba.C(player4);
                                if (C2 == null) {
                                    C2 = tba.t(player4);
                                }
                                pp9.a.getClass();
                                arrayList22.add(new qp9(id4, C2, null, ccd.x(player4)));
                            }
                            gv9Var = null;
                            int size2 = arrayList21.size();
                            z = true;
                            if (size2 == 1) {
                                i9 = 1;
                            } else if (size2 % 2 == 0) {
                                i9 = 2;
                            }
                            ArrayList Q4 = CollectionsKt.Q(i9, arrayList22);
                            ArrayList arrayList23 = new ArrayList(k13.r(Q4, 10));
                            Iterator it19 = Q4.iterator();
                            while (it19.hasNext()) {
                                arrayList23.add(l6g.W((List) it19.next()));
                            }
                            cq9Var = new cq9(W, W2, Q, Q2, W3, l6g.W(arrayList23));
                            if (this.f.a.getValue() instanceof unb) {
                                kp5 kp5Var = n1j.i;
                                ArrayList arrayList24 = new ArrayList();
                                for (Object obj15 : kp5Var) {
                                    n1j n1jVar = (n1j) obj15;
                                    if (n1jVar == n1j.c) {
                                        if (teeVar == null && cq9Var == null) {
                                        }
                                        arrayList24.add(obj15);
                                        break;
                                    }
                                    if (!arrayList10.isEmpty()) {
                                        Iterator it20 = arrayList10.iterator();
                                        while (it20.hasNext()) {
                                            if (((Boolean) n1jVar.b.invoke(team3, (n0i) it20.next())).booleanValue()) {
                                                arrayList24.add(obj15);
                                                break;
                                            }
                                        }
                                    }
                                }
                                ArrayList arrayList25 = new ArrayList(k13.r(arrayList24, 10));
                                Iterator it21 = arrayList24.iterator();
                                while (it21.hasNext()) {
                                    n1j n1jVar2 = (n1j) it21.next();
                                    String string = i().getString(((Number) n1jVar2.a.invoke(team3.getSportSlug())).intValue());
                                    string.getClass();
                                    arrayList25.add(new vt2(n1jVar2, string, false, null, null, null, null, 252));
                                }
                                teeVar2 = teeVar;
                                gv9Var2 = l6g.W(arrayList25);
                            } else {
                                teeVar2 = teeVar;
                                gv9Var2 = gv9Var;
                            }
                            gv9 v2 = v(arrayList10, arrayList, arrayList2, teeVar2, cq9Var);
                            gv9 gv9Var5 = gv9Var2 != null ? rlh.b : gv9Var2;
                            if (gv9Var2 == null) {
                                if (!gv9Var2.isEmpty()) {
                                    Iterator it22 = gv9Var2.iterator();
                                    while (it22.hasNext()) {
                                        if (((vt2) it22.next()).a == n1j.c) {
                                            z2 = z;
                                            break;
                                        }
                                    }
                                }
                                z2 = false;
                                obj = Boolean.valueOf(z2);
                            } else {
                                obj = gv9Var;
                            }
                            n(new d2j(gv9Var5, !Intrinsics.c(obj, Boolean.TRUE) ? n1j.c : n1j.d, rlh.b), new uo(8, v2));
                        }
                    }
                    arrayList = arrayList7;
                    arrayList2 = arrayList11;
                    z = true;
                    gv9Var = null;
                    cq9Var = null;
                    if (this.f.a.getValue() instanceof unb) {
                    }
                    gv9 v22 = v(arrayList10, arrayList, arrayList2, teeVar2, cq9Var);
                    if (gv9Var2 != null) {
                    }
                    if (gv9Var2 == null) {
                    }
                    n(new d2j(gv9Var5, !Intrinsics.c(obj, Boolean.TRUE) ? n1j.c : n1j.d, rlh.b), new uo(8, v22));
                }
                return Unit.a;
            }
        }
        f2jVar = new f2j(this, sq3Var);
        Object obj72 = f2jVar.r;
        lu3 lu3Var2 = lu3.a;
        i = f2jVar.t;
        Team team32 = this.m;
        boolean z42 = true;
        rq3 rq3Var3 = null;
        if (i != 0) {
        }
        teamPlayersResponse = (TeamPlayersResponse) yaa.x((x2g) obj72);
        if (teamPlayersResponse != null) {
        }
        return Unit.a;
    }
}
