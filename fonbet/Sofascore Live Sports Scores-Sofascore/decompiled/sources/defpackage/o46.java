package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Sports;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.EventManagersResponse;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.model.newNetwork.mediaposts.MediaType;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMLMediaResponse;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMediaPost;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.sofascore.results.onboarding.follow.model.d;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o46 extends hoi implements Function2 {
    public Object A;
    public final /* synthetic */ int r = 3;
    public Object s;
    public int t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o46(kqf kqfVar, af0 af0Var, fdi fdiVar, Context context, eyf eyfVar, zij zijVar, uij uijVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = kqfVar;
        this.w = af0Var;
        this.x = fdiVar;
        this.y = context;
        this.z = eyfVar;
        this.A = zijVar;
        this.s = uijVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                o46 o46Var = new o46((p46) this.z, (Event) this.A, (String) this.s, rq3Var);
                o46Var.u = obj;
                return o46Var;
            case 1:
                o46 o46Var2 = new o46((k6c) this.y, (u8c) this.z, (Set) this.A, rq3Var);
                o46Var2.u = obj;
                return o46Var2;
            case 2:
                o46 o46Var3 = new o46((OnboardingViewModel) this.s, rq3Var);
                o46Var3.u = obj;
                return o46Var3;
            case 3:
                return new o46((b8h) this.A, (x7h) this.s, rq3Var);
            case 4:
                o46 o46Var4 = new o46((kqf) this.v, (af0) this.w, (fdi) this.x, (Context) this.y, (eyf) this.z, (zij) this.A, (uij) this.s, rq3Var);
                o46Var4.u = obj;
                return o46Var4;
            default:
                return new o46((p3l) this.x, (Event) this.y, (String) this.s, (Vote) this.u, (WhoWillWinOptions) this.z, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((o46) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x0540, code lost:
    
        if (r0 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0544, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x054c, code lost:
    
        if (r0 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0750, code lost:
    
        if (r3 == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x073b, code lost:
    
        if (r1 == r4) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01fd, code lost:
    
        if (r1 == r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e8, code lost:
    
        if (r1 == r2) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025d  */
    /* JADX WARN: Type inference failed for: r2v5, types: [km5] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rq3 rq3Var;
        Object w;
        zu4 zu4Var;
        av4 av4Var;
        EventManagersResponse eventManagersResponse;
        Object T;
        EventIncidentsResponse eventIncidentsResponse;
        Object T2;
        String str;
        String str2;
        Object d;
        String str3;
        String str4;
        String str5;
        PersonalizedMLMediaResponse personalizedMLMediaResponse;
        ?? r2;
        u8c u8cVar;
        Object obj2;
        Object u;
        List list;
        String str6;
        List<PersonalizedMediaPost> posts;
        ArrayList s;
        Object d2;
        List list2;
        List<PersonalizedMediaPost> list3;
        av4 t;
        Context i;
        Object w2;
        zu4 zu4Var2;
        d dVar;
        Object obj3;
        Object T3;
        List list4;
        zu4 zu4Var3;
        d dVar2;
        List list5;
        Object T4;
        d dVar3;
        Context context;
        Iterator it;
        Iterator it2;
        ArrayList arrayList;
        Iterator it3;
        Integer num;
        Object a;
        Object q;
        z7h z7hVar;
        a9h a9hVar;
        Object b;
        r38 r38Var;
        n5a n5aVar;
        x7h x7hVar;
        Object a2;
        x2g x2gVar;
        lu3 lu3Var;
        w3f w3fVar;
        yzc yzcVar;
        p3l p3lVar;
        Event event;
        o46 o46Var = this;
        int i2 = 0;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        switch (o46Var.r) {
            case 0:
                Event event2 = (Event) o46Var.A;
                p46 p46Var = (p46) o46Var.z;
                ku3 ku3Var = (ku3) o46Var.u;
                lu3 lu3Var2 = lu3.a;
                int i6 = o46Var.t;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                eventIncidentsResponse = (EventIncidentsResponse) o46Var.y;
                                EventManagersResponse eventManagersResponse2 = (EventManagersResponse) o46Var.x;
                                y6a.M(obj);
                                eventManagersResponse = eventManagersResponse2;
                                T2 = obj;
                                LineupsResponse lineupsResponse = (LineupsResponse) T2;
                                if (lineupsResponse != null) {
                                    String str7 = (String) o46Var.s;
                                    p46Var.v(event2, lineupsResponse);
                                    if (eventIncidentsResponse != null) {
                                        dab.a(lineupsResponse, eventIncidentsResponse.getIncidents());
                                    }
                                    boolean w3 = ufa.w(event2, lineupsResponse);
                                    boolean z = w3 && Intrinsics.c(str7, Sports.RUGBY);
                                    Lineups homeLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null);
                                    Lineups awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null);
                                    gv9 p = oea.p(p46Var.i(), homeLineups$default.getPlayers(), homeLineups$default.getMissingPlayers(), eventManagersResponse != null ? EventManagersResponse.getHomeManager$default(eventManagersResponse, null, 1, null) : null, w3, str7, Event.getHomeTeam$default(event2, null, 1, null).getGender());
                                    p.getClass();
                                    p46Var.m = p;
                                    gv9 p2 = oea.p(p46Var.i(), awayLineups$default.getPlayers(), awayLineups$default.getMissingPlayers(), eventManagersResponse != null ? EventManagersResponse.getAwayManager$default(eventManagersResponse, null, 1, null) : null, w3, str7, Event.getAwayTeam$default(event2, null, 1, null).getGender());
                                    p2.getClass();
                                    p46Var.n = p2;
                                    p46Var.n(new m46(new e9b(), null, false), new b05(p46Var, event2, z, homeLineups$default, awayLineups$default, 1));
                                    break;
                                }
                            } else {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            EventManagersResponse eventManagersResponse3 = (EventManagersResponse) o46Var.x;
                            zu4Var = (zu4) o46Var.v;
                            y6a.M(obj);
                            eventManagersResponse = eventManagersResponse3;
                            rq3Var = null;
                            T = obj;
                            eventIncidentsResponse = (EventIncidentsResponse) T;
                            o46Var.u = rq3Var;
                            o46Var.v = rq3Var;
                            o46Var.w = rq3Var;
                            o46Var.x = eventManagersResponse;
                            o46Var.y = eventIncidentsResponse;
                            o46Var.t = 3;
                            T2 = zu4Var.T(o46Var);
                            break;
                        }
                    } else {
                        av4Var = (av4) o46Var.w;
                        zu4Var = (zu4) o46Var.v;
                        y6a.M(obj);
                        w = obj;
                        rq3Var = null;
                    }
                } else {
                    y6a.M(obj);
                    rq3Var = null;
                    av4 t2 = xw3.t(ku3Var, null, new n46(p46Var, event2, rq3Var, i4), 3);
                    av4 t3 = xw3.t(ku3Var, null, new n46(p46Var, event2, rq3Var, i5), 3);
                    av4 t4 = xw3.t(ku3Var, null, new n46(p46Var, event2, rq3Var, i2), 3);
                    o46Var.u = null;
                    o46Var.v = t2;
                    o46Var.w = t4;
                    o46Var.t = 1;
                    w = t3.w(o46Var);
                    if (w != lu3Var2) {
                        zu4Var = t2;
                        av4Var = t4;
                    }
                    break;
                }
                eventManagersResponse = (EventManagersResponse) w;
                o46Var.u = rq3Var;
                o46Var.v = zu4Var;
                o46Var.w = rq3Var;
                o46Var.x = eventManagersResponse;
                o46Var.t = 2;
                T = av4Var.T(o46Var);
                break;
            case 1:
                k6c k6cVar = (k6c) o46Var.y;
                u8c u8cVar2 = (u8c) o46Var.z;
                ku3 ku3Var2 = (ku3) o46Var.u;
                lu3 lu3Var3 = lu3.a;
                int i7 = o46Var.t;
                rq3 rq3Var2 = null;
                if (i7 == 0) {
                    y6a.M(obj);
                    int ordinal = k6cVar.ordinal();
                    if (ordinal != 0) {
                        str = "XX";
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                str5 = u8cVar2.m;
                                break;
                            } else {
                                zzl.b();
                                break;
                            }
                        } else {
                            str5 = u8cVar2.l;
                            break;
                        }
                        String str8 = (k6cVar != k6c.d || k6cVar == k6c.e) ? "similar" : "fixed";
                        m7c m7cVar = u8cVar2.b;
                        List j = b.j(MediaType.ExternalVideo, MediaType.YTShortVideo, MediaType.NewsArticle, MediaType.InfluencerVideo);
                        o46Var.u = ku3Var2;
                        o46Var.s = str2;
                        o46Var.v = str8;
                        o46Var.t = 1;
                        d = m7c.d(m7cVar, str8, str2, null, j, o46Var, 4);
                        if (d != lu3Var3) {
                            str3 = str8;
                            str4 = str2;
                            personalizedMLMediaResponse = (PersonalizedMLMediaResponse) d;
                            if (personalizedMLMediaResponse != null) {
                            }
                            r2 = km5.a;
                            u8cVar = u8cVar2;
                            String str9 = str4;
                            obj2 = null;
                            List x = ph0.x(new zu4[]{xw3.t(ku3Var2, null, new i8c(u8cVar2, str3, str4, rq3Var2, 3), 3), xw3.t(ku3Var2, null, new i8c(u8cVar2, str3, str4, rq3Var2, 2), 3), xw3.t(ku3Var2, null, new i8c(u8cVar2, str3, str4, rq3Var2, 1), 3), xw3.t(ku3Var2, null, new i8c(u8cVar2, str3, str4, rq3Var2, 0), 3)});
                            o46Var.u = null;
                            o46Var.s = str9;
                            o46Var.v = null;
                            o46Var.w = r2;
                            o46Var.t = 2;
                            u = m6k.u(x, o46Var);
                            if (u != lu3Var3) {
                            }
                        }
                    } else {
                        str = u8cVar2.k;
                    }
                    str2 = str;
                    String str82 = (k6cVar != k6c.d || k6cVar == k6c.e) ? "similar" : "fixed";
                    m7c m7cVar2 = u8cVar2.b;
                    List j2 = b.j(MediaType.ExternalVideo, MediaType.YTShortVideo, MediaType.NewsArticle, MediaType.InfluencerVideo);
                    o46Var.u = ku3Var2;
                    o46Var.s = str2;
                    o46Var.v = str82;
                    o46Var.t = 1;
                    d = m7c.d(m7cVar2, str82, str2, null, j2, o46Var, 4);
                    if (d != lu3Var3) {
                    }
                } else if (i7 == 1) {
                    String str10 = (String) o46Var.v;
                    String str11 = (String) o46Var.s;
                    y6a.M(obj);
                    str3 = str10;
                    str4 = str11;
                    d = obj;
                    personalizedMLMediaResponse = (PersonalizedMLMediaResponse) d;
                    if (personalizedMLMediaResponse != null || (posts = personalizedMLMediaResponse.getPosts()) == null) {
                        r2 = km5.a;
                    } else {
                        Set set = (Set) o46Var.A;
                        r2 = new ArrayList();
                        for (Object obj4 : posts) {
                            if (!set.contains(new Integer(((PersonalizedMediaPost) obj4).getId()))) {
                                r2.add(obj4);
                            }
                        }
                    }
                    u8cVar = u8cVar2;
                    String str92 = str4;
                    obj2 = null;
                    List x2 = ph0.x(new zu4[]{xw3.t(ku3Var2, null, new i8c(u8cVar2, str3, str4, rq3Var2, 3), 3), xw3.t(ku3Var2, null, new i8c(u8cVar2, str3, str4, rq3Var2, 2), 3), xw3.t(ku3Var2, null, new i8c(u8cVar2, str3, str4, rq3Var2, 1), 3), xw3.t(ku3Var2, null, new i8c(u8cVar2, str3, str4, rq3Var2, 0), 3)});
                    o46Var.u = null;
                    o46Var.s = str92;
                    o46Var.v = null;
                    o46Var.w = r2;
                    o46Var.t = 2;
                    u = m6k.u(x2, o46Var);
                    if (u != lu3Var3) {
                        list = r2;
                        str6 = str92;
                        s = k13.s(CollectionsKt.W((Iterable) u));
                        if (h8c.a[k6cVar.ordinal()] != 2) {
                        }
                    }
                } else if (i7 == 2) {
                    List list6 = (List) o46Var.w;
                    String str12 = (String) o46Var.s;
                    y6a.M(obj);
                    list = list6;
                    str6 = str12;
                    u8cVar = u8cVar2;
                    obj2 = null;
                    u = obj;
                    s = k13.s(CollectionsKt.W((Iterable) u));
                    if (h8c.a[k6cVar.ordinal()] != 2) {
                        m7c m7cVar3 = u8cVar.b;
                        List j3 = b.j(MediaType.Custom, MediaType.Announcement);
                        o46Var.u = obj2;
                        o46Var.s = obj2;
                        o46Var.v = obj2;
                        o46Var.w = list;
                        o46Var.x = s;
                        o46Var.t = 3;
                        d2 = m7c.d(m7cVar3, "specific", str6, j3, null, o46Var, 8);
                        if (d2 != lu3Var3) {
                            list2 = list;
                        }
                        break;
                    } else {
                        break;
                    }
                } else if (i7 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ArrayList arrayList2 = (ArrayList) o46Var.x;
                    list2 = (List) o46Var.w;
                    y6a.M(obj);
                    s = arrayList2;
                    d2 = obj;
                }
                PersonalizedMLMediaResponse personalizedMLMediaResponse2 = (PersonalizedMLMediaResponse) d2;
                if (personalizedMLMediaResponse2 == null || (list3 = personalizedMLMediaResponse2.getPosts()) == null) {
                    list3 = km5.a;
                }
                ArrayList w0 = CollectionsKt.w0(list3, list2);
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = w0.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    if (hashSet.add(new Integer(((PersonalizedMediaPost) next).getId()))) {
                        arrayList3.add(next);
                    }
                }
                break;
            case 2:
                OnboardingViewModel onboardingViewModel = (OnboardingViewModel) o46Var.s;
                boolean z2 = onboardingViewModel.r;
                ku3 ku3Var3 = (ku3) o46Var.u;
                lu3 lu3Var4 = lu3.a;
                int i8 = o46Var.t;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 == 3) {
                                List list7 = (List) o46Var.A;
                                list4 = (List) o46Var.z;
                                context = (Context) o46Var.y;
                                dVar3 = (d) o46Var.x;
                                y6a.M(obj);
                                list5 = list7;
                                T4 = obj;
                                List list8 = (List) T4;
                                dVar3.getClass();
                                context.getClass();
                                list4.getClass();
                                list5.getClass();
                                list8.getClass();
                                int[] iArr = {list4.size(), list5.size(), list8.size()};
                                int i9 = iArr[0];
                                while (i5 < 3) {
                                    int i10 = iArr[i5];
                                    if (i10 > i9) {
                                        i9 = i10;
                                    }
                                    i5++;
                                }
                                ArrayList Q = CollectionsKt.Q(2, yso.F(i9, null, list4));
                                ArrayList Y0 = CollectionsKt.Y0(CollectionsKt.Q(2, yso.F(i9, null, list5)), CollectionsKt.Q(2, yso.F(i9, null, list8)));
                                it = Q.iterator();
                                it2 = Y0.iterator();
                                arrayList = new ArrayList(Math.min(k13.r(Q, 10), k13.r(Y0, 10)));
                                while (it.hasNext() && it2.hasNext()) {
                                    Object next2 = it.next();
                                    Pair pair = (Pair) it2.next();
                                    arrayList.add(a.d(CollectionsKt.w0((List) pair.b, CollectionsKt.w0((List) pair.a, (List) next2))));
                                }
                                ArrayList W = CollectionsKt.W(k13.s(arrayList));
                                ArrayList arrayList4 = new ArrayList();
                                it3 = W.iterator();
                                while (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    OnboardingItemUiModel c = next3 instanceof Team ? d.c(context, (Team) next3) : next3 instanceof Player ? d.b((Player) next3) : next3 instanceof UniqueTournament ? d.a(context, (UniqueTournament) next3) : null;
                                    if (c != null) {
                                        arrayList4.add(c);
                                    }
                                }
                                gv9<OnboardingItemUiModel> W2 = l6g.W(arrayList4);
                                fsf fsfVar = new fsf();
                                fsf fsfVar2 = new fsf();
                                if (z2) {
                                    for (OnboardingItemUiModel onboardingItemUiModel : W2) {
                                        srd srdVar = onboardingItemUiModel.b;
                                        int i11 = onboardingItemUiModel.a;
                                        if (srdVar == srd.c && i11 == 16) {
                                            fsfVar.a = onboardingItemUiModel;
                                        }
                                        if (srdVar == srd.a) {
                                            if (Boolean.valueOf(z2).equals(Boolean.TRUE)) {
                                                vel velVar = vel.a;
                                                num = (Integer) vel.a().get(onboardingViewModel.q);
                                            } else {
                                                num = null;
                                            }
                                            if (num != null && i11 == num.intValue()) {
                                                fsfVar2.a = onboardingItemUiModel;
                                            }
                                        }
                                    }
                                }
                                onboardingViewModel.n(null, new lwc(fsfVar2, fsfVar, W2, onboardingViewModel, 3));
                                xw3.L(un0.z(onboardingViewModel), null, null, new ftd(onboardingViewModel, null, i3), 3);
                                break;
                            } else {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            List list9 = (List) o46Var.z;
                            Context context2 = (Context) o46Var.y;
                            dVar2 = (d) o46Var.x;
                            zu4 zu4Var4 = (zu4) o46Var.v;
                            y6a.M(obj);
                            i = context2;
                            obj3 = null;
                            list4 = list9;
                            zu4Var3 = zu4Var4;
                            T3 = obj;
                            list5 = (List) T3;
                            o46Var.u = obj3;
                            o46Var.w = obj3;
                            o46Var.v = obj3;
                            o46Var.x = dVar2;
                            o46Var.y = i;
                            o46Var.z = list4;
                            o46Var.A = list5;
                            o46Var.t = 3;
                            T4 = zu4Var3.T(o46Var);
                            if (T4 != lu3Var4) {
                                dVar3 = dVar2;
                                context = i;
                                List list82 = (List) T4;
                                dVar3.getClass();
                                context.getClass();
                                list4.getClass();
                                list5.getClass();
                                list82.getClass();
                                int[] iArr2 = {list4.size(), list5.size(), list82.size()};
                                int i92 = iArr2[0];
                                while (i5 < 3) {
                                }
                                ArrayList Q2 = CollectionsKt.Q(2, yso.F(i92, null, list4));
                                ArrayList Y02 = CollectionsKt.Y0(CollectionsKt.Q(2, yso.F(i92, null, list5)), CollectionsKt.Q(2, yso.F(i92, null, list82)));
                                it = Q2.iterator();
                                it2 = Y02.iterator();
                                arrayList = new ArrayList(Math.min(k13.r(Q2, 10), k13.r(Y02, 10)));
                                while (it.hasNext()) {
                                    Object next22 = it.next();
                                    Pair pair2 = (Pair) it2.next();
                                    arrayList.add(a.d(CollectionsKt.w0((List) pair2.b, CollectionsKt.w0((List) pair2.a, (List) next22))));
                                }
                                ArrayList W3 = CollectionsKt.W(k13.s(arrayList));
                                ArrayList arrayList42 = new ArrayList();
                                it3 = W3.iterator();
                                while (it3.hasNext()) {
                                }
                                gv9<OnboardingItemUiModel> W22 = l6g.W(arrayList42);
                                fsf fsfVar3 = new fsf();
                                fsf fsfVar22 = new fsf();
                                if (z2) {
                                }
                                onboardingViewModel.n(null, new lwc(fsfVar22, fsfVar3, W22, onboardingViewModel, 3));
                                xw3.L(un0.z(onboardingViewModel), null, null, new ftd(onboardingViewModel, null, i3), 3);
                            }
                            break;
                        }
                    } else {
                        Context context3 = (Context) o46Var.y;
                        dVar = (d) o46Var.x;
                        zu4Var2 = (zu4) o46Var.v;
                        t = (av4) o46Var.w;
                        y6a.M(obj);
                        i = context3;
                        w2 = obj;
                    }
                } else {
                    y6a.M(obj);
                    rq3 rq3Var3 = null;
                    av4 t5 = xw3.t(ku3Var3, null, new ftd(onboardingViewModel, rq3Var3, i4), 3);
                    t = xw3.t(ku3Var3, null, new ftd(onboardingViewModel, rq3Var3, i5), 3);
                    av4 t6 = xw3.t(ku3Var3, null, new ftd(onboardingViewModel, rq3Var3, i2), 3);
                    i = onboardingViewModel.i();
                    o46Var.u = null;
                    o46Var.w = t;
                    o46Var.v = t6;
                    d dVar4 = d.a;
                    o46Var.x = dVar4;
                    o46Var.y = i;
                    o46Var.t = 1;
                    w2 = t5.w(o46Var);
                    if (w2 != lu3Var4) {
                        zu4Var2 = t6;
                        dVar = dVar4;
                    }
                }
                List list10 = (List) w2;
                obj3 = null;
                o46Var.u = null;
                o46Var.w = null;
                o46Var.v = zu4Var2;
                o46Var.x = dVar;
                o46Var.y = i;
                o46Var.z = list10;
                o46Var.t = 2;
                T3 = t.T(o46Var);
                if (T3 != lu3Var4) {
                    d dVar5 = dVar;
                    list4 = list10;
                    zu4Var3 = zu4Var2;
                    dVar2 = dVar5;
                    list5 = (List) T3;
                    o46Var.u = obj3;
                    o46Var.w = obj3;
                    o46Var.v = obj3;
                    o46Var.x = dVar2;
                    o46Var.y = i;
                    o46Var.z = list4;
                    o46Var.A = list5;
                    o46Var.t = 3;
                    T4 = zu4Var3.T(o46Var);
                    if (T4 != lu3Var4) {
                    }
                }
                break;
            case 3:
                b8h b8hVar = (b8h) o46Var.A;
                lu3 lu3Var5 = lu3.a;
                int i12 = o46Var.t;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                a9h a9hVar2 = (a9h) o46Var.z;
                                x7hVar = (x7h) o46Var.u;
                                r38Var = (r38) o46Var.y;
                                z7hVar = (z7h) o46Var.x;
                                b8h b8hVar2 = (b8h) o46Var.w;
                                n5a n5aVar2 = (n5a) o46Var.v;
                                y6a.M(obj);
                                a9hVar = a9hVar2;
                                b8hVar = b8hVar2;
                                n5aVar = n5aVar2;
                                b = obj;
                                Map map = (Map) b;
                                String str13 = n5aVar.a;
                                String str14 = n5aVar.b;
                                z7hVar.getClass();
                                r38Var.getClass();
                                x7hVar.getClass();
                                a9hVar.getClass();
                                map.getClass();
                                str14.getClass();
                                pc6 pc6Var = pc6.SESSION_START;
                                String str15 = x7hVar.a;
                                String str16 = x7hVar.b;
                                int i13 = x7hVar.c;
                                long j4 = x7hVar.d;
                                ew3 ew3Var = (ew3) map.get(r8h.b);
                                ud4 ud4Var = ew3Var != null ? ud4.COLLECTION_SDK_NOT_INSTALLED : ew3Var.a.i() ? ud4.COLLECTION_ENABLED : ud4.COLLECTION_DISABLED;
                                ew3 ew3Var2 = (ew3) map.get(r8h.a);
                                y7h y7hVar = new y7h(new e8h(str15, str16, i13, j4, new vd4(ud4Var, ew3Var2 != null ? ud4.COLLECTION_SDK_NOT_INSTALLED : ew3Var2.a.i() ? ud4.COLLECTION_ENABLED : ud4.COLLECTION_DISABLED, a9hVar.a()), str13, str14), z7h.a(r38Var));
                                int i14 = b8h.g;
                                b8hVar.getClass();
                                try {
                                    b8hVar.d.a(y7hVar);
                                } catch (RuntimeException unused) {
                                }
                                break;
                            } else {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            y6a.M(obj);
                            q = obj;
                            n5a n5aVar3 = (n5a) q;
                            z7hVar = z7h.a;
                            r38 r38Var2 = b8hVar.a;
                            x7h x7hVar2 = (x7h) o46Var.s;
                            a9hVar = b8hVar.c;
                            v58 v58Var = v58.a;
                            o46Var.v = n5aVar3;
                            o46Var.w = b8hVar;
                            o46Var.x = z7hVar;
                            o46Var.y = r38Var2;
                            o46Var.u = x7hVar2;
                            o46Var.z = a9hVar;
                            o46Var.t = 3;
                            b = v58Var.b(o46Var);
                            if (b != lu3Var5) {
                                r38Var = r38Var2;
                                n5aVar = n5aVar3;
                                x7hVar = x7hVar2;
                                Map map2 = (Map) b;
                                String str132 = n5aVar.a;
                                String str142 = n5aVar.b;
                                z7hVar.getClass();
                                r38Var.getClass();
                                x7hVar.getClass();
                                a9hVar.getClass();
                                map2.getClass();
                                str142.getClass();
                                pc6 pc6Var2 = pc6.SESSION_START;
                                String str152 = x7hVar.a;
                                String str162 = x7hVar.b;
                                int i132 = x7hVar.c;
                                long j42 = x7hVar.d;
                                ew3 ew3Var3 = (ew3) map2.get(r8h.b);
                                if (ew3Var3 != null) {
                                }
                                ew3 ew3Var22 = (ew3) map2.get(r8h.a);
                                y7h y7hVar2 = new y7h(new e8h(str152, str162, i132, j42, new vd4(ud4Var, ew3Var22 != null ? ud4.COLLECTION_SDK_NOT_INSTALLED : ew3Var22.a.i() ? ud4.COLLECTION_ENABLED : ud4.COLLECTION_DISABLED, a9hVar.a()), str132, str142), z7h.a(r38Var));
                                int i142 = b8h.g;
                                b8hVar.getClass();
                                b8hVar.d.a(y7hVar2);
                            }
                            break;
                        }
                    } else {
                        y6a.M(obj);
                        a = obj;
                    }
                } else {
                    y6a.M(obj);
                    o46Var.t = 1;
                    int i15 = b8h.g;
                    a = b8hVar.a(o46Var);
                    break;
                }
                if (((Boolean) a).booleanValue()) {
                    l48 l48Var = b8hVar.b;
                    o46Var.t = 2;
                    q = n5a.c.q(l48Var, o46Var);
                    break;
                }
            case 4:
                lu3 lu3Var6 = lu3.a;
                int i16 = o46Var.t;
                if (i16 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var4 = (ku3) o46Var.u;
                    esf esfVar = new esf();
                    kqf kqfVar = (kqf) o46Var.v;
                    esfVar.a = kqfVar.a;
                    fdi fdiVar = kqfVar.v;
                    mz5 mz5Var = new mz5((af0) o46Var.w, kqfVar, esfVar, (fdi) o46Var.x, (Context) o46Var.y, (eyf) o46Var.z, (zij) o46Var.A, (uij) o46Var.s, ku3Var4, null);
                    o46Var.t = 1;
                    if (fcp.c0(fdiVar, mz5Var, o46Var) == lu3Var6) {
                        break;
                    }
                } else if (i16 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                String str17 = (String) o46Var.s;
                Event event3 = (Event) o46Var.y;
                p3l p3lVar2 = (p3l) o46Var.x;
                yzc yzcVar2 = p3lVar2.o;
                lu3 lu3Var7 = lu3.a;
                int i17 = o46Var.t;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            event = (Event) o46Var.A;
                            p3lVar = (p3l) o46Var.w;
                            x2gVar = (v2g) o46Var.v;
                            y6a.M(obj);
                            yzcVar = yzcVar2;
                            nv.C0(event.getId(), 1, lv.WEEKLY_CHALLENGE, p3lVar.i(), "who_will_win_daily_10x");
                            if (x2gVar instanceof t2g) {
                                yzcVar.j(Boolean.FALSE);
                            } else if (!(x2gVar instanceof v2g)) {
                                zzl.b();
                                break;
                            }
                            break;
                        } else {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        y6a.M(obj);
                        a2 = obj;
                    }
                } else {
                    y6a.M(obj);
                    fyk fykVar = p3lVar2.h;
                    int id = event3.getId();
                    long startTimestamp = event3.getStartTimestamp();
                    VoteType voteType = VoteType.WHO_WILL_WIN;
                    Boolean bool = Boolean.TRUE;
                    o46Var.t = 1;
                    a2 = fykVar.a(id, str17, startTimestamp, voteType, bool, o46Var);
                    o46Var = o46Var;
                    if (a2 == lu3Var7) {
                        break;
                    }
                }
                x2gVar = (x2g) a2;
                Vote vote = (Vote) o46Var.u;
                WhoWillWinOptions whoWillWinOptions = (WhoWillWinOptions) o46Var.z;
                if (x2gVar instanceof t2g) {
                    yzcVar = yzcVar2;
                    if (x2gVar instanceof t2g) {
                    }
                } else if (!(x2gVar instanceof v2g)) {
                    zzl.b();
                    break;
                } else {
                    v2g v2gVar = (v2g) x2gVar;
                    VotesResponseKt.addVote(vote, whoWillWinOptions);
                    fdi fdiVar2 = p3lVar2.m;
                    w3f w3fVar2 = (w3f) fdiVar2.getValue();
                    if (w3fVar2 != null) {
                        lu3Var = lu3Var7;
                        w3fVar = w3f.a(w3fVar2, vote, null, null, str17, false, null, false, 255927);
                    } else {
                        lu3Var = lu3Var7;
                        w3fVar = null;
                    }
                    fdiVar2.l(w3fVar);
                    SharedPreferences.Editor edit = p3lVar2.i.edit();
                    edit.getClass();
                    edit.putInt("PREF_DAILY_BONUS_EVENT_ID", event3.getId());
                    edit.apply();
                    yzcVar2.j(Boolean.TRUE);
                    ZoneOffset zoneOffset = ZoneOffset.UTC;
                    long epochSecond = LocalDateTime.now(zoneOffset).toEpochSecond(zoneOffset);
                    bfk bfkVar = p3lVar2.e;
                    Long l = new Long(epochSecond);
                    o46Var.v = v2gVar;
                    o46Var.w = p3lVar2;
                    o46Var.A = event3;
                    o46Var.t = 2;
                    lu3 lu3Var8 = lu3Var;
                    yzcVar = yzcVar2;
                    if (bfk.e(bfkVar, null, null, null, null, null, null, null, null, l, this, 4095) != lu3Var8) {
                        p3lVar = p3lVar2;
                        event = event3;
                        x2gVar = x2gVar;
                        nv.C0(event.getId(), 1, lv.WEEKLY_CHALLENGE, p3lVar.i(), "who_will_win_daily_10x");
                        if (x2gVar instanceof t2g) {
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o46(k6c k6cVar, u8c u8cVar, Set set, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = k6cVar;
        this.z = u8cVar;
        this.A = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o46(p46 p46Var, Event event, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = p46Var;
        this.A = event;
        this.s = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o46(b8h b8hVar, x7h x7hVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = b8hVar;
        this.s = x7hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o46(p3l p3lVar, Event event, String str, Vote vote, WhoWillWinOptions whoWillWinOptions, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = p3lVar;
        this.y = event;
        this.s = str;
        this.u = vote;
        this.z = whoWillWinOptions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o46(OnboardingViewModel onboardingViewModel, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = onboardingViewModel;
    }
}
