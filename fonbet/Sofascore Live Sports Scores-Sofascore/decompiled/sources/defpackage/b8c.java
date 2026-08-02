package defpackage;

import android.content.Context;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b8c extends hoi implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ MediaPost C;
    public final /* synthetic */ u8c D;
    public av4 r;
    public List s;
    public UniqueTournament t;
    public List u;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8c(rq3 rq3Var, u8c u8cVar, MediaPost mediaPost) {
        super(2, rq3Var);
        this.C = mediaPost;
        this.D = u8cVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        b8c b8cVar = new b8c(rq3Var, this.D, this.C);
        b8cVar.B = obj;
        return b8cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b8c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x043e  */
    /* JADX WARN: Type inference failed for: r15v10, types: [av4, rq3] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v8, types: [av4] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [rq3] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        boolean a;
        MediaPost mediaPost;
        Context context;
        lu3 lu3Var;
        Object obj2;
        int i;
        CoroutineContext coroutineContext;
        boolean z;
        boolean z2;
        av4 av4Var;
        Object w;
        lu3 lu3Var2;
        int i2;
        boolean z3;
        Object obj3;
        List<Event> events;
        Object T;
        boolean z4;
        List<Event> list;
        boolean z5;
        UniqueTournamentResponse uniqueTournamentResponse;
        UniqueTournament uniqueTournament;
        int i3;
        lu3 lu3Var3;
        List list2;
        Object u;
        String str;
        Sport sport;
        Object obj4;
        Object obj5;
        List list3;
        List list4;
        Object u2;
        UniqueTournament uniqueTournament2;
        String str2;
        Boolean bool;
        Context context2;
        Country country;
        w31 w31Var;
        String str3;
        Round round;
        String string;
        String str4;
        String slug;
        FeaturedOddsWithProvider featuredOddsWithProvider;
        Boolean bool2;
        Object obj6;
        Object obj7;
        boolean z6;
        u8c u8cVar = this.D;
        Context context3 = u8cVar.a;
        ku3 ku3Var = (ku3) this.B;
        lu3 lu3Var4 = lu3.a;
        int i4 = this.A;
        int i5 = 2;
        MediaPost mediaPost2 = this.C;
        rq3 rq3Var = null;
        if (i4 == 0) {
            y6a.M(obj);
            Integer uniqueTournamentId = mediaPost2.getUniqueTournamentId();
            if (uniqueTournamentId == null) {
                return null;
            }
            int intValue = uniqueTournamentId.intValue();
            t = xw3.t(ku3Var, null, new w7c(u8cVar, intValue, rq3Var, i5), 3);
            a = rld.a(ke0.c);
            boolean t2 = rld.t(context3);
            bga bgaVar = xld.a;
            boolean g = xld.g(context3);
            Round round2 = mediaPost2.getRound();
            Integer round3 = round2 != null ? round2.getRound() : null;
            Season season = mediaPost2.getSeason();
            Integer num = season != null ? new Integer(season.getId()) : null;
            if (round3 == null || num == null) {
                mediaPost = mediaPost2;
                context = context3;
                lu3Var = lu3Var4;
                obj2 = Sports.FOOTBALL;
                i = 1;
                coroutineContext = null;
                z = t2;
                z2 = g;
                av4Var = null;
            } else {
                mediaPost = mediaPost2;
                MediaPost mediaPost3 = this.C;
                context = context3;
                obj2 = Sports.FOOTBALL;
                z2 = g;
                z = t2;
                coroutineContext = null;
                lu3Var = lu3Var4;
                i = 1;
                av4Var = xw3.t(ku3Var, null, new gz6(u8cVar, intValue, num.intValue(), mediaPost3, (rq3) null, 4), 3);
            }
            if (av4Var == null) {
                av4Var = xw3.t(ku3Var, coroutineContext, new ok0((Object) u8cVar, intValue, (Object) mediaPost, (rq3) coroutineContext, 29), 3);
            }
            this.B = ku3Var;
            this.r = t;
            this.v = intValue;
            this.x = a;
            this.y = z;
            this.z = z2;
            this.A = i;
            w = av4Var.w(this);
            lu3Var2 = lu3Var;
            if (w != lu3Var2) {
                i2 = intValue;
                z3 = z;
                obj3 = coroutineContext;
            }
            return lu3Var2;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                boolean z7 = this.z;
                boolean z8 = this.y;
                boolean z9 = this.x;
                i2 = this.v;
                list = this.s;
                y6a.M(obj);
                mediaPost = mediaPost2;
                obj3 = 0;
                context = context3;
                obj2 = Sports.FOOTBALL;
                z2 = z7;
                z4 = z8;
                z5 = z9;
                lu3Var2 = lu3Var4;
                i = 1;
                T = obj;
                uniqueTournamentResponse = (UniqueTournamentResponse) T;
                if (uniqueTournamentResponse != null && (uniqueTournament = uniqueTournamentResponse.getUniqueTournament()) != null) {
                    i3 = u8cVar.j.c().size() <= i ? i : 0;
                    if (i3 != 0 && z4 && z2) {
                        if (u8cVar.n == null) {
                            bga bgaVar2 = xld.a;
                            u8cVar.n = xld.d(xld.b(context));
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Event event = (Event) it.next();
                            Iterator it2 = it;
                            lu3 lu3Var5 = lu3Var2;
                            av4 p = yaa.p(ku3Var, (ok3.D(event) && z5) ? false : true, new va8(event, u8cVar, (rq3) obj3, 16));
                            if (p != null) {
                                arrayList.add(p);
                            }
                            it = it2;
                            lu3Var2 = lu3Var5;
                        }
                        lu3 lu3Var6 = lu3Var2;
                        this.B = ku3Var;
                        this.r = obj3;
                        this.s = list;
                        this.t = uniqueTournament;
                        this.v = i2;
                        this.x = z5;
                        this.y = z4;
                        this.z = z2;
                        this.w = i3;
                        this.A = 3;
                        u = m6k.u(arrayList, this);
                        lu3Var3 = lu3Var6;
                        str2 = obj3;
                        if (u == lu3Var3) {
                            return lu3Var3;
                        }
                        list2 = (List) u;
                        str = str2;
                        sport = mediaPost.getSport();
                        obj4 = obj2;
                        if (Intrinsics.c(sport == null ? sport.getSlug() : str, obj4)) {
                        }
                    } else {
                        lu3Var3 = lu3Var2;
                        list2 = obj3;
                        str = obj3;
                        sport = mediaPost.getSport();
                        obj4 = obj2;
                        if (Intrinsics.c(sport == null ? sport.getSlug() : str, obj4)) {
                        }
                    }
                }
                return obj3;
            }
            if (i4 == 3) {
                i3 = this.w;
                boolean z10 = this.z;
                boolean z11 = this.y;
                z5 = this.x;
                int i6 = this.v;
                uniqueTournament = this.t;
                list = this.s;
                y6a.M(obj);
                mediaPost = mediaPost2;
                context = context3;
                obj2 = Sports.FOOTBALL;
                z4 = z11;
                str2 = null;
                z2 = z10;
                lu3Var3 = lu3Var4;
                i2 = i6;
                u = obj;
                list2 = (List) u;
                str = str2;
                sport = mediaPost.getSport();
                obj4 = obj2;
                if (Intrinsics.c(sport == null ? sport.getSlug() : str, obj4)) {
                    obj5 = obj4;
                    list3 = list2;
                    list4 = null;
                    if (list3 != null) {
                    }
                    boolean c = Intrinsics.c(bool, Boolean.TRUE);
                    ArrayList arrayList2 = new ArrayList();
                    List H0 = CollectionsKt.H0(list, new cp(new wpb(6), 21));
                    ArrayList arrayList3 = new ArrayList(k13.r(H0, 10));
                    int i7 = 0;
                    while (r12.hasNext()) {
                    }
                    context2 = context;
                    arrayList2.addAll(arrayList3);
                    country = zu3.d;
                    if (!country.hasMcc(new Integer(ke0.c))) {
                    }
                    int i8 = ke0.c;
                    if (country.hasMcc(Integer.valueOf(i8))) {
                    }
                    arrayList2.add(new bmd((String) r1.a, (String) r1.b, mediaPost.getCreatedAtTimestamp()));
                    w31Var = (w31) CollectionsKt.firstOrNull(arrayList2);
                    if (w31Var != null) {
                    }
                    str3 = "";
                    round = mediaPost.getRound();
                    String b = d7g.b(context2, round, false, str3);
                    if (Intrinsics.c(round != null ? round.getName() : null, "Final")) {
                    }
                    str4 = string;
                    int id = mediaPost.getId();
                    gv9 W = l6g.W(arrayList2);
                    Sport sport2 = mediaPost.getSport();
                    if (sport2 != null) {
                    }
                    uniqueTournament.getClass();
                    return new e49(id, W, null, r27, str4, null, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), new iy7(Integer.valueOf(uniqueTournament.getId()), tba.x(uniqueTournament)), mediaPost.getRound());
                }
                ArrayList arrayList4 = new ArrayList(k13.r(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(xw3.t(ku3Var, null, new zi7((Event) it3.next(), u8cVar, (rq3) null, 29), 3));
                    it3 = it3;
                    obj4 = obj4;
                    lu3Var3 = lu3Var3;
                }
                lu3 lu3Var7 = lu3Var3;
                obj5 = obj4;
                this.B = null;
                this.r = null;
                this.s = list;
                this.t = uniqueTournament;
                this.u = list2;
                this.v = i2;
                this.x = z5;
                this.y = z4;
                this.z = z2;
                this.w = i3;
                this.A = 4;
                u2 = m6k.u(arrayList4, this);
                if (u2 == lu3Var7) {
                    return lu3Var7;
                }
                list3 = list2;
                uniqueTournament2 = uniqueTournament;
                uniqueTournament = uniqueTournament2;
                list4 = (List) u2;
                if (list3 != null) {
                }
                boolean c2 = Intrinsics.c(bool, Boolean.TRUE);
                ArrayList arrayList22 = new ArrayList();
                List H02 = CollectionsKt.H0(list, new cp(new wpb(6), 21));
                ArrayList arrayList32 = new ArrayList(k13.r(H02, 10));
                int i72 = 0;
                while (r12.hasNext()) {
                }
                context2 = context;
                arrayList22.addAll(arrayList32);
                country = zu3.d;
                if (!country.hasMcc(new Integer(ke0.c))) {
                }
                int i82 = ke0.c;
                if (country.hasMcc(Integer.valueOf(i82))) {
                }
                arrayList22.add(new bmd((String) r1.a, (String) r1.b, mediaPost.getCreatedAtTimestamp()));
                w31Var = (w31) CollectionsKt.firstOrNull(arrayList22);
                if (w31Var != null) {
                }
                str3 = "";
                round = mediaPost.getRound();
                String b2 = d7g.b(context2, round, false, str3);
                if (Intrinsics.c(round != null ? round.getName() : null, "Final")) {
                }
                str4 = string;
                int id2 = mediaPost.getId();
                gv9 W2 = l6g.W(arrayList22);
                Sport sport22 = mediaPost.getSport();
                if (sport22 != null) {
                }
                uniqueTournament.getClass();
                return new e49(id2, W2, null, r27, str4, null, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), new iy7(Integer.valueOf(uniqueTournament.getId()), tba.x(uniqueTournament)), mediaPost.getRound());
            }
            if (i4 != 4) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list3 = this.u;
            uniqueTournament2 = this.t;
            List<Event> list5 = this.s;
            y6a.M(obj);
            list = list5;
            mediaPost = mediaPost2;
            context = context3;
            obj5 = Sports.FOOTBALL;
            u2 = obj;
            uniqueTournament = uniqueTournament2;
            list4 = (List) u2;
            if (list3 != null) {
                if (!list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        if (((Pair) it4.next()).b != null) {
                            z6 = true;
                            break;
                        }
                    }
                }
                z6 = false;
                bool = Boolean.valueOf(z6);
            } else {
                bool = null;
            }
            boolean c22 = Intrinsics.c(bool, Boolean.TRUE);
            ArrayList arrayList222 = new ArrayList();
            List H022 = CollectionsKt.H0(list, new cp(new wpb(6), 21));
            ArrayList arrayList322 = new ArrayList(k13.r(H022, 10));
            int i722 = 0;
            for (Object obj8 : H022) {
                int i9 = i722 + 1;
                if (i722 < 0) {
                    b.q();
                    throw null;
                }
                Event event2 = (Event) obj8;
                Team homeTeam$default = Event.getHomeTeam$default(event2, null, 1, null);
                Team awayTeam$default = Event.getAwayTeam$default(event2, null, 1, null);
                int id3 = mediaPost.getId();
                Context context4 = context;
                bx7 F = uxf.F(event2, context4, false, false, null, null, 62);
                long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
                String sportSlug = event2.getSportSlug();
                if (list3 != null) {
                    Iterator it5 = list3.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj7 = null;
                            break;
                        }
                        obj7 = it5.next();
                        if (((Number) ((Pair) obj7).a).intValue() == event2.getId()) {
                            break;
                        }
                    }
                    Pair pair = (Pair) obj7;
                    if (pair != null) {
                        featuredOddsWithProvider = (FeaturedOddsWithProvider) pair.b;
                        boolean z12 = !c22;
                        fy7 J = uxf.J(homeTeam$default, context4, null, false, null, 30);
                        fy7 J2 = uxf.J(awayTeam$default, context4, null, false, null, 30);
                        if (list4 != null) {
                            Iterator it6 = list4.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    obj6 = null;
                                    break;
                                }
                                obj6 = it6.next();
                                if (((Number) ((Pair) obj6).a).intValue() == event2.getId()) {
                                    break;
                                }
                            }
                            Pair pair2 = (Pair) obj6;
                            if (pair2 != null) {
                                bool2 = (Boolean) pair2.b;
                                arrayList322.add(new c3f(id3, F, createdAtTimestamp, sportSlug, J, J2, featuredOddsWithProvider, z12, Intrinsics.c(bool2, Boolean.TRUE)));
                                context = context4;
                                i722 = i9;
                            }
                        }
                        bool2 = null;
                        arrayList322.add(new c3f(id3, F, createdAtTimestamp, sportSlug, J, J2, featuredOddsWithProvider, z12, Intrinsics.c(bool2, Boolean.TRUE)));
                        context = context4;
                        i722 = i9;
                    }
                }
                featuredOddsWithProvider = null;
                boolean z122 = !c22;
                fy7 J3 = uxf.J(homeTeam$default, context4, null, false, null, 30);
                fy7 J22 = uxf.J(awayTeam$default, context4, null, false, null, 30);
                if (list4 != null) {
                }
                bool2 = null;
                arrayList322.add(new c3f(id3, F, createdAtTimestamp, sportSlug, J3, J22, featuredOddsWithProvider, z122, Intrinsics.c(bool2, Boolean.TRUE)));
                context = context4;
                i722 = i9;
            }
            context2 = context;
            arrayList222.addAll(arrayList322);
            country = zu3.d;
            if (!country.hasMcc(new Integer(ke0.c)) || zu3.c.hasMcc(new Integer(ke0.c))) {
                int i822 = ke0.c;
                Pair pair3 = country.hasMcc(Integer.valueOf(i822)) ? new Pair(null, rld.i(context2)) : zu3.c.hasMcc(Integer.valueOf(i822)) ? new Pair(context2.getString(R.string.responsible_gambling_argentina_title), context2.getString(R.string.responsible_gambling_argentina_text)) : new Pair(null, null);
                arrayList222.add(new bmd((String) pair3.a, (String) pair3.b, mediaPost.getCreatedAtTimestamp()));
            }
            w31Var = (w31) CollectionsKt.firstOrNull(arrayList222);
            if (w31Var != null || (str3 = w31Var.j()) == null) {
                str3 = "";
            }
            round = mediaPost.getRound();
            String b22 = d7g.b(context2, round, false, str3);
            if (Intrinsics.c(round != null ? round.getName() : null, "Final")) {
                string = context2.getString(R.string.feed_card_final_contenders);
            } else if (Intrinsics.c(round != null ? round.getName() : null, "Match for 3rd place")) {
                string = context2.getString(R.string.feed_card_third_place);
            } else {
                String name = round != null ? round.getName() : null;
                if (name == null || name.length() == 0) {
                    if ((round != null ? round.getRound() : null) == null) {
                        string = context2.getString(R.string.feed_card_matchups_are_live);
                    }
                }
                if (str3.equals(obj5)) {
                    string = context2.getString(R.string.feed_new_round_announcement_football, b22);
                } else {
                    if (!str3.equals(Sports.BASKETBALL)) {
                        str4 = null;
                        int id22 = mediaPost.getId();
                        gv9 W22 = l6g.W(arrayList222);
                        Sport sport222 = mediaPost.getSport();
                        String str5 = (sport222 != null || (slug = sport222.getSlug()) == null) ? "" : slug;
                        uniqueTournament.getClass();
                        return new e49(id22, W22, null, str5, str4, null, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), new iy7(Integer.valueOf(uniqueTournament.getId()), tba.x(uniqueTournament)), mediaPost.getRound());
                    }
                    string = context2.getString(R.string.feed_new_round_announcement_basketball, b22);
                }
            }
            str4 = string;
            int id222 = mediaPost.getId();
            gv9 W222 = l6g.W(arrayList222);
            Sport sport2222 = mediaPost.getSport();
            if (sport2222 != null) {
            }
            uniqueTournament.getClass();
            return new e49(id222, W222, null, str5, str4, null, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31), new iy7(Integer.valueOf(uniqueTournament.getId()), tba.x(uniqueTournament)), mediaPost.getRound());
        }
        boolean z13 = this.z;
        z3 = this.y;
        boolean z14 = this.x;
        i2 = this.v;
        t = this.r;
        y6a.M(obj);
        a = z14;
        mediaPost = mediaPost2;
        obj3 = 0;
        context = context3;
        lu3Var2 = lu3Var4;
        obj2 = Sports.FOOTBALL;
        i = 1;
        z2 = z13;
        w = obj;
        EventListResponse eventListResponse = (EventListResponse) w;
        if (eventListResponse != null && (events = eventListResponse.getEvents()) != null) {
            if (events.isEmpty()) {
                events = obj3;
            }
            if (events != null) {
                this.B = ku3Var;
                this.r = obj3;
                this.s = events;
                this.v = i2;
                this.x = a;
                this.y = z3;
                this.z = z2;
                this.A = 2;
                T = t.T(this);
                if (T != lu3Var2) {
                    z4 = z3;
                    list = events;
                    z5 = a;
                    obj3 = obj3;
                    uniqueTournamentResponse = (UniqueTournamentResponse) T;
                    if (uniqueTournamentResponse != null) {
                        if (u8cVar.j.c().size() <= i) {
                        }
                        if (i3 != 0) {
                        }
                        lu3Var3 = lu3Var2;
                        list2 = obj3;
                        str = obj3;
                        sport = mediaPost.getSport();
                        obj4 = obj2;
                        if (Intrinsics.c(sport == null ? sport.getSlug() : str, obj4)) {
                        }
                    }
                }
                return lu3Var2;
            }
        }
        return obj3;
    }
}
