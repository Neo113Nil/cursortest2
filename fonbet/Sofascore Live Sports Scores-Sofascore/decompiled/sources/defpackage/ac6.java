package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.TeamEventShotmapWrapper;
import com.sofascore.model.profile.EditorAggregates;
import com.sofascore.model.profile.EditorEventOpeningsGraphResponse;
import com.sofascore.model.profile.EditorsEventsCountResponse;
import com.sofascore.model.profile.PopularEventWrapper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ac6 extends hoi implements Function2 {
    public /* synthetic */ Object A;
    public Object B;
    public Object C;
    public List D;
    public Object E;
    public Object F;
    public Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int r = 0;
    public zu4 s;
    public zu4 t;
    public zu4 u;
    public av4 v;
    public zu4 w;
    public List x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac6(Event event, bc6 bc6Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.H = event;
        this.G = bc6Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                ac6 ac6Var = new ac6((Event) obj2, (bc6) this.G, rq3Var);
                ac6Var.A = obj;
                return ac6Var;
            default:
                ac6 ac6Var2 = new ac6((q9f) obj2, rq3Var);
                ac6Var2.A = obj;
                return ac6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ac6) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x05d4, code lost:
    
        if (r3 == r5) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x056a, code lost:
    
        if (r9 == r5) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x053c, code lost:
    
        if (r7 == r5) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0344, code lost:
    
        if (r3 != r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02f3, code lost:
    
        if (r2 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0291, code lost:
    
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x064f, code lost:
    
        if (r1.j(r32) != r5) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0191 A[LOOP:2: B:72:0x018d->B:74:0x0191, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d2  */
    /* JADX WARN: Type inference failed for: r14v19, types: [zu4] */
    /* JADX WARN: Type inference failed for: r2v27, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v6, types: [zu4] */
    /* JADX WARN: Type inference failed for: r6v6, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v17, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zu4 t;
        av4 p;
        Object w;
        zu4 zu4Var;
        int i;
        av4 av4Var;
        zu4 zu4Var2;
        EventStatisticsResponse eventStatisticsResponse;
        zu4 zu4Var3;
        zu4 zu4Var4;
        EventStatisticsResponse eventStatisticsResponse2;
        gc6 gc6Var;
        Object T;
        gc6 gc6Var2;
        zu4 zu4Var5;
        EventStatisticsResponse eventStatisticsResponse3;
        List list;
        Object T2;
        EventStatisticsResponse eventStatisticsResponse4;
        gc6 gc6Var3;
        List list2;
        TeamEventShotmapWrapper teamEventShotmapWrapper;
        Object T3;
        zu4 zu4Var6;
        List list3;
        zu4 zu4Var7;
        gc6 gc6Var4;
        TeamEventShotmapWrapper teamEventShotmapWrapper2;
        EventStatisticsResponse eventStatisticsResponse5;
        List list4;
        Object T4;
        Object T5;
        gc6 gc6Var5;
        List list5;
        List list6;
        bc6 bc6Var;
        EventStatisticsResponse eventStatisticsResponse6;
        zu4 t2;
        av4 t3;
        av4 t4;
        zu4 t5;
        Object w2;
        zu4 zu4Var8;
        av4 av4Var2;
        lu3 lu3Var;
        v6a it;
        Object T6;
        List list7;
        zu4 zu4Var9;
        zu4 zu4Var10;
        zu4 zu4Var11;
        int i2;
        Map<Long, Integer> points;
        Collection<Integer> values;
        Integer num;
        List list8;
        q9f q9fVar;
        lu3 lu3Var2;
        av4 av4Var3;
        gv9 gv9Var;
        Object T7;
        zu4 zu4Var12;
        zu4 zu4Var13;
        List<UniqueTournament> list9;
        gv9 gv9Var2;
        Object T8;
        zu4 zu4Var14;
        List list10;
        gv9 gv9Var3;
        gv9 gv9Var4;
        EditorsEventsCountResponse editorsEventsCountResponse;
        Object T9;
        Object T10;
        EditorsEventsCountResponse editorsEventsCountResponse2;
        EditorAggregates editorAggregates;
        zu4 zu4Var15;
        Object T11;
        final EditorAggregates editorAggregates2;
        final EditorsEventsCountResponse editorsEventsCountResponse3;
        final gv9 gv9Var5;
        final List list11;
        int i3 = this.r;
        Object obj2 = this.H;
        int i4 = 2;
        int i5 = 1;
        boolean z = false;
        z = false;
        int i6 = 4;
        av4 av4Var4 = null;
        int i7 = 3;
        switch (i3) {
            case 0:
                Event event = (Event) obj2;
                bc6 bc6Var2 = (bc6) this.G;
                ku3 ku3Var = (ku3) this.A;
                lu3 lu3Var3 = lu3.a;
                switch (this.z) {
                    case 0:
                        y6a.M(obj);
                        String s = ok3.s(event);
                        rq3 rq3Var = null;
                        av4 t6 = xw3.t(ku3Var, null, new xb6(bc6Var2, event, rq3Var, 5), 3);
                        t = xw3.t(ku3Var, null, new xb6(bc6Var2, event, rq3Var, 8), 3);
                        int i8 = (!bc6Var2.i || bc6Var2.j) ? 1 : 0;
                        rq3 rq3Var2 = null;
                        av4 p2 = yaa.p(ku3Var, Intrinsics.c(s, Sports.FOOTBALL), new xb6(bc6Var2, event, rq3Var2, 9));
                        p = yaa.p(ku3Var, Intrinsics.c(s, Sports.FOOTBALL), new xb6(bc6Var2, event, rq3Var2, 6));
                        av4 p3 = yaa.p(ku3Var, i8 != 0 && Intrinsics.c(s, Sports.BASKETBALL), new xb6(bc6Var2, event, rq3Var2, 4));
                        if (i8 != 0 && Intrinsics.c(s, Sports.ICE_HOCKEY)) {
                            z = true;
                        }
                        av4 p4 = yaa.p(ku3Var, z, new xb6(bc6Var2, event, rq3Var2, 7));
                        bc6Var2.i = true;
                        this.A = null;
                        this.s = t;
                        this.v = p2;
                        this.t = p;
                        this.u = p3;
                        this.w = p4;
                        this.y = i8;
                        this.z = 1;
                        w = t6.w(this);
                        if (w != lu3Var3) {
                            zu4Var = p4;
                            i = i8;
                            av4Var = p2;
                            zu4Var2 = p3;
                            eventStatisticsResponse = (EventStatisticsResponse) w;
                            if (av4Var == null) {
                                this.A = null;
                                this.s = t;
                                this.v = null;
                                this.t = p;
                                this.u = zu4Var2;
                                this.w = zu4Var;
                                this.B = eventStatisticsResponse;
                                this.y = i;
                                this.z = 2;
                                T = av4Var.T(this);
                                break;
                            } else {
                                zu4Var3 = zu4Var2;
                                zu4Var4 = zu4Var;
                                eventStatisticsResponse2 = eventStatisticsResponse;
                                gc6Var = null;
                                if (p == null) {
                                    this.A = null;
                                    this.s = t;
                                    this.v = null;
                                    this.t = null;
                                    this.u = zu4Var3;
                                    this.w = zu4Var4;
                                    this.B = eventStatisticsResponse2;
                                    this.C = gc6Var;
                                    this.y = i;
                                    this.z = 3;
                                    T2 = p.T(this);
                                    break;
                                } else {
                                    EventStatisticsResponse eventStatisticsResponse7 = eventStatisticsResponse2;
                                    gc6Var2 = gc6Var;
                                    zu4Var5 = zu4Var4;
                                    eventStatisticsResponse3 = eventStatisticsResponse7;
                                    list = null;
                                    if (zu4Var3 == null) {
                                        this.A = null;
                                        this.s = t;
                                        this.v = null;
                                        this.t = null;
                                        this.u = null;
                                        this.w = zu4Var5;
                                        this.B = eventStatisticsResponse3;
                                        this.C = gc6Var2;
                                        this.x = list;
                                        this.y = i;
                                        this.z = 4;
                                        T3 = zu4Var3.T(this);
                                        if (T3 != lu3Var3) {
                                            zu4 zu4Var16 = t;
                                            zu4Var6 = zu4Var5;
                                            list3 = list;
                                            zu4Var7 = zu4Var16;
                                            gc6 gc6Var6 = gc6Var2;
                                            list2 = list3;
                                            zu4Var5 = zu4Var6;
                                            t = zu4Var7;
                                            teamEventShotmapWrapper = (TeamEventShotmapWrapper) T3;
                                            eventStatisticsResponse4 = eventStatisticsResponse3;
                                            gc6Var3 = gc6Var6;
                                            if (zu4Var5 != null) {
                                                this.A = null;
                                                this.s = t;
                                                this.v = null;
                                                this.t = null;
                                                this.u = null;
                                                this.w = null;
                                                this.B = eventStatisticsResponse4;
                                                this.C = gc6Var3;
                                                this.x = list2;
                                                this.E = teamEventShotmapWrapper;
                                                this.y = i;
                                                this.z = 5;
                                                T4 = zu4Var5.T(this);
                                                break;
                                            } else {
                                                gc6Var4 = gc6Var3;
                                                teamEventShotmapWrapper2 = teamEventShotmapWrapper;
                                                eventStatisticsResponse5 = eventStatisticsResponse4;
                                                list4 = null;
                                                this.A = null;
                                                this.s = null;
                                                this.v = null;
                                                this.t = null;
                                                this.u = null;
                                                this.w = null;
                                                this.B = eventStatisticsResponse5;
                                                this.C = gc6Var4;
                                                this.x = list2;
                                                this.E = teamEventShotmapWrapper2;
                                                this.D = list4;
                                                this.F = bc6Var2;
                                                this.y = i;
                                                this.z = 6;
                                                T5 = t.T(this);
                                                if (T5 != lu3Var3) {
                                                    gc6Var5 = gc6Var4;
                                                    list5 = list2;
                                                    list6 = list4;
                                                    bc6Var = bc6Var2;
                                                    TeamEventShotmapWrapper teamEventShotmapWrapper3 = teamEventShotmapWrapper2;
                                                    bc6Var.k = (LineupsResponse) T5;
                                                    yzc yzcVar = bc6Var2.g;
                                                    eventStatisticsResponse6 = eventStatisticsResponse5;
                                                    if (eventStatisticsResponse6 != null || (r4 = eventStatisticsResponse6.getStatistics()) == null) {
                                                        List<EventStatisticsPeriod> list12 = km5.a;
                                                    }
                                                    yzcVar.k(new qei(list12, gc6Var5, list5, teamEventShotmapWrapper3, list6));
                                                    this.A = null;
                                                    this.s = null;
                                                    this.v = null;
                                                    this.t = null;
                                                    this.u = null;
                                                    this.w = null;
                                                    this.B = null;
                                                    this.C = null;
                                                    this.x = null;
                                                    this.E = null;
                                                    this.D = null;
                                                    this.F = null;
                                                    this.y = i;
                                                    this.z = 7;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        eventStatisticsResponse4 = eventStatisticsResponse3;
                                        gc6Var3 = gc6Var2;
                                        list2 = list;
                                        teamEventShotmapWrapper = null;
                                        if (zu4Var5 != null) {
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        i = this.y;
                        zu4 zu4Var17 = this.w;
                        zu4 zu4Var18 = this.u;
                        ?? r6 = this.t;
                        av4Var = this.v;
                        t = this.s;
                        y6a.M(obj);
                        p = r6;
                        zu4Var2 = zu4Var18;
                        zu4Var = zu4Var17;
                        w = obj;
                        eventStatisticsResponse = (EventStatisticsResponse) w;
                        if (av4Var == null) {
                        }
                        break;
                    case 2:
                        i = this.y;
                        eventStatisticsResponse = (EventStatisticsResponse) this.B;
                        zu4Var = this.w;
                        zu4Var2 = this.u;
                        ?? r7 = this.t;
                        t = this.s;
                        y6a.M(obj);
                        p = r7;
                        T = obj;
                        zu4 zu4Var19 = zu4Var;
                        eventStatisticsResponse2 = eventStatisticsResponse;
                        gc6Var = (gc6) T;
                        zu4Var3 = zu4Var2;
                        zu4Var4 = zu4Var19;
                        if (p == null) {
                        }
                        break;
                    case 3:
                        i = this.y;
                        gc6Var = (gc6) this.C;
                        eventStatisticsResponse2 = (EventStatisticsResponse) this.B;
                        zu4Var4 = this.w;
                        zu4Var3 = this.u;
                        t = this.s;
                        y6a.M(obj);
                        T2 = obj;
                        list = (List) T2;
                        EventStatisticsResponse eventStatisticsResponse8 = eventStatisticsResponse2;
                        gc6Var2 = gc6Var;
                        zu4Var5 = zu4Var4;
                        eventStatisticsResponse3 = eventStatisticsResponse8;
                        if (zu4Var3 == null) {
                        }
                        break;
                    case 4:
                        i = this.y;
                        list3 = this.x;
                        gc6Var2 = (gc6) this.C;
                        eventStatisticsResponse3 = (EventStatisticsResponse) this.B;
                        zu4 zu4Var20 = this.w;
                        zu4 zu4Var21 = this.s;
                        y6a.M(obj);
                        zu4Var7 = zu4Var21;
                        zu4Var6 = zu4Var20;
                        T3 = obj;
                        gc6 gc6Var62 = gc6Var2;
                        list2 = list3;
                        zu4Var5 = zu4Var6;
                        t = zu4Var7;
                        teamEventShotmapWrapper = (TeamEventShotmapWrapper) T3;
                        eventStatisticsResponse4 = eventStatisticsResponse3;
                        gc6Var3 = gc6Var62;
                        if (zu4Var5 != null) {
                        }
                        break;
                    case 5:
                        i = this.y;
                        TeamEventShotmapWrapper teamEventShotmapWrapper4 = (TeamEventShotmapWrapper) this.E;
                        list2 = this.x;
                        gc6Var3 = (gc6) this.C;
                        eventStatisticsResponse4 = (EventStatisticsResponse) this.B;
                        t = this.s;
                        y6a.M(obj);
                        teamEventShotmapWrapper = teamEventShotmapWrapper4;
                        T4 = obj;
                        EventStatisticsResponse eventStatisticsResponse9 = eventStatisticsResponse4;
                        list4 = (List) T4;
                        gc6Var4 = gc6Var3;
                        teamEventShotmapWrapper2 = teamEventShotmapWrapper;
                        eventStatisticsResponse5 = eventStatisticsResponse9;
                        this.A = null;
                        this.s = null;
                        this.v = null;
                        this.t = null;
                        this.u = null;
                        this.w = null;
                        this.B = eventStatisticsResponse5;
                        this.C = gc6Var4;
                        this.x = list2;
                        this.E = teamEventShotmapWrapper2;
                        this.D = list4;
                        this.F = bc6Var2;
                        this.y = i;
                        this.z = 6;
                        T5 = t.T(this);
                        if (T5 != lu3Var3) {
                        }
                        break;
                    case 6:
                        i = this.y;
                        bc6Var = (bc6) this.F;
                        List list13 = this.D;
                        teamEventShotmapWrapper2 = (TeamEventShotmapWrapper) this.E;
                        List list14 = this.x;
                        gc6 gc6Var7 = (gc6) this.C;
                        eventStatisticsResponse5 = (EventStatisticsResponse) this.B;
                        y6a.M(obj);
                        list6 = list13;
                        list5 = list14;
                        gc6Var5 = gc6Var7;
                        T5 = obj;
                        TeamEventShotmapWrapper teamEventShotmapWrapper32 = teamEventShotmapWrapper2;
                        bc6Var.k = (LineupsResponse) T5;
                        yzc yzcVar2 = bc6Var2.g;
                        eventStatisticsResponse6 = eventStatisticsResponse5;
                        if (eventStatisticsResponse6 != null) {
                            break;
                        }
                        List<EventStatisticsPeriod> list122 = km5.a;
                        yzcVar2.k(new qei(list122, gc6Var5, list5, teamEventShotmapWrapper32, list6));
                        this.A = null;
                        this.s = null;
                        this.v = null;
                        this.t = null;
                        this.u = null;
                        this.w = null;
                        this.B = null;
                        this.C = null;
                        this.x = null;
                        this.E = null;
                        this.D = null;
                        this.F = null;
                        this.y = i;
                        this.z = 7;
                        break;
                    case 7:
                        y6a.M(obj);
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
            default:
                q9f q9fVar2 = (q9f) obj2;
                ku3 ku3Var2 = (ku3) this.A;
                lu3 lu3Var4 = lu3.a;
                switch (this.z) {
                    case 0:
                        y6a.M(obj);
                        t2 = xw3.t(ku3Var2, null, new o9f(q9fVar2, av4Var4, z ? 1 : 0), 3);
                        av4 t7 = xw3.t(ku3Var2, null, new o9f(q9fVar2, av4Var4, i6), 3);
                        av4 t8 = xw3.t(ku3Var2, null, new o9f(q9fVar2, av4Var4, i5), 3);
                        t3 = xw3.t(ku3Var2, null, new o9f(q9fVar2, av4Var4, i4), 3);
                        t4 = xw3.t(ku3Var2, null, new o9f(q9fVar2, av4Var4, i7), 3);
                        t5 = xw3.t(ku3Var2, null, new gr5(t4, av4Var4, i7), 3);
                        this.A = null;
                        this.s = t2;
                        this.t = t7;
                        this.u = t8;
                        this.v = t3;
                        this.w = t4;
                        this.B = t5;
                        this.z = 1;
                        w2 = t4.w(this);
                        if (w2 != lu3Var4) {
                            zu4Var8 = t7;
                            av4Var2 = t8;
                            EditorEventOpeningsGraphResponse editorEventOpeningsGraphResponse = (EditorEventOpeningsGraphResponse) w2;
                            int intValue = (editorEventOpeningsGraphResponse != null || (points = editorEventOpeningsGraphResponse.getPoints()) == null || (values = points.values()) == null || (num = (Integer) CollectionsKt.k0(values)) == null) ? 0 : num.intValue();
                            IntRange intRange = new IntRange(0, 3, 1);
                            ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
                            it = intRange.iterator();
                            while (it.c) {
                                ArrayList arrayList2 = arrayList;
                                arrayList2.add(uxf.E(wzb.c((it.nextInt() * intValue) / 3.0d), 62, false));
                                arrayList = arrayList2;
                                it = it;
                                av4Var4 = null;
                            }
                            av4 av4Var5 = av4Var4;
                            ArrayList arrayList3 = arrayList;
                            this.A = av4Var5;
                            this.s = t2;
                            this.t = zu4Var8;
                            this.u = av4Var2;
                            this.v = av4Var5;
                            this.w = t4;
                            this.B = t5;
                            this.x = arrayList3;
                            this.y = intValue;
                            this.z = 2;
                            T6 = t3.T(this);
                            if (T6 != lu3Var4) {
                                list7 = arrayList3;
                                zu4Var9 = t4;
                                zu4Var10 = t5;
                                zu4Var11 = t2;
                                i2 = intValue;
                                list8 = (List) T6;
                                if (list8 == null) {
                                    ArrayList arrayList4 = new ArrayList(k13.r(list8, 10));
                                    Iterator it2 = list8.iterator();
                                    while (it2.hasNext()) {
                                        PopularEventWrapper popularEventWrapper = (PopularEventWrapper) it2.next();
                                        Application application = q9fVar2.b;
                                        application.getClass();
                                        Context applicationContext = application.getApplicationContext();
                                        applicationContext.getClass();
                                        arrayList4.add(new mi5(popularEventWrapper.getEvent().getId(), popularEventWrapper.getEventOpenings(), new ms3(Event.getHomeTeam$default(popularEventWrapper.getEvent(), null, 1, null).getId(), tba.p(applicationContext, Event.getHomeTeam$default(popularEventWrapper.getEvent(), null, 1, null)), Event.getHomeScore$default(popularEventWrapper.getEvent(), null, 1, null).getDisplay(), null), new ms3(Event.getAwayTeam$default(popularEventWrapper.getEvent(), null, 1, null).getId(), tba.p(applicationContext, Event.getAwayTeam$default(popularEventWrapper.getEvent(), null, 1, null)), Event.getAwayScore$default(popularEventWrapper.getEvent(), null, 1, null).getDisplay(), null), Event.getWinnerCode$default(popularEventWrapper.getEvent(), null, 1, null)));
                                        it2 = it2;
                                        q9fVar2 = q9fVar2;
                                        lu3Var4 = lu3Var4;
                                    }
                                    q9fVar = q9fVar2;
                                    lu3Var2 = lu3Var4;
                                    av4Var3 = null;
                                    gv9Var = l6g.W(arrayList4);
                                    break;
                                } else {
                                    q9fVar = q9fVar2;
                                    lu3Var2 = lu3Var4;
                                    av4Var3 = null;
                                }
                                gv9Var = rlh.b;
                                this.A = av4Var3;
                                this.s = zu4Var11;
                                this.t = zu4Var8;
                                this.u = av4Var3;
                                this.v = av4Var3;
                                this.w = zu4Var9;
                                this.B = zu4Var10;
                                this.x = list7;
                                this.C = gv9Var;
                                this.y = i2;
                                this.z = 3;
                                T7 = av4Var2.T(this);
                                lu3Var = lu3Var2;
                                if (T7 != lu3Var) {
                                    zu4Var12 = zu4Var8;
                                    zu4Var13 = zu4Var9;
                                    list9 = (List) T7;
                                    if (list9 != null) {
                                        ArrayList arrayList5 = new ArrayList(k13.r(list9, 10));
                                        for (UniqueTournament uniqueTournament : list9) {
                                            arrayList5.add(new ri5(uniqueTournament.getId(), tba.x(uniqueTournament)));
                                        }
                                        gv9Var2 = l6g.W(arrayList5);
                                        break;
                                    }
                                    gv9Var2 = rlh.b;
                                    this.A = null;
                                    this.s = null;
                                    this.t = zu4Var12;
                                    this.u = null;
                                    this.v = null;
                                    this.w = zu4Var13;
                                    this.B = zu4Var10;
                                    this.x = list7;
                                    this.C = gv9Var;
                                    this.D = gv9Var2;
                                    this.y = i2;
                                    this.z = 4;
                                    T8 = zu4Var11.T(this);
                                    if (T8 != lu3Var) {
                                        zu4Var14 = zu4Var10;
                                        list10 = list7;
                                        gv9Var3 = gv9Var;
                                        gv9Var4 = gv9Var2;
                                        editorsEventsCountResponse = (EditorsEventsCountResponse) T8;
                                        this.A = null;
                                        this.s = null;
                                        this.t = null;
                                        this.u = null;
                                        this.v = null;
                                        this.w = zu4Var13;
                                        this.B = zu4Var14;
                                        this.x = list10;
                                        this.C = gv9Var3;
                                        this.D = gv9Var4;
                                        this.E = editorsEventsCountResponse;
                                        this.y = i2;
                                        this.z = 5;
                                        T9 = zu4Var12.T(this);
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        lu3Var = lu3Var4;
                        break;
                    case 1:
                        t5 = (zu4) this.B;
                        ?? r2 = this.w;
                        av4 av4Var6 = this.v;
                        ?? r5 = this.u;
                        zu4 zu4Var22 = this.t;
                        t2 = this.s;
                        y6a.M(obj);
                        t4 = r2;
                        av4Var2 = r5;
                        t3 = av4Var6;
                        zu4Var8 = zu4Var22;
                        w2 = obj;
                        EditorEventOpeningsGraphResponse editorEventOpeningsGraphResponse2 = (EditorEventOpeningsGraphResponse) w2;
                        if (editorEventOpeningsGraphResponse2 != null) {
                            break;
                        }
                        IntRange intRange2 = new IntRange(0, 3, 1);
                        ArrayList arrayList6 = new ArrayList(k13.r(intRange2, 10));
                        it = intRange2.iterator();
                        while (it.c) {
                        }
                        av4 av4Var52 = av4Var4;
                        ArrayList arrayList32 = arrayList6;
                        this.A = av4Var52;
                        this.s = t2;
                        this.t = zu4Var8;
                        this.u = av4Var2;
                        this.v = av4Var52;
                        this.w = t4;
                        this.B = t5;
                        this.x = arrayList32;
                        this.y = intValue;
                        this.z = 2;
                        T6 = t3.T(this);
                        if (T6 != lu3Var4) {
                        }
                        lu3Var = lu3Var4;
                        break;
                    case 2:
                        i2 = this.y;
                        List list15 = this.x;
                        zu4 zu4Var23 = (zu4) this.B;
                        zu4Var9 = this.w;
                        ?? r14 = this.u;
                        zu4Var8 = this.t;
                        zu4 zu4Var24 = this.s;
                        y6a.M(obj);
                        zu4Var10 = zu4Var23;
                        list7 = list15;
                        av4Var2 = r14;
                        zu4Var11 = zu4Var24;
                        T6 = obj;
                        list8 = (List) T6;
                        if (list8 == null) {
                        }
                        gv9Var = rlh.b;
                        this.A = av4Var3;
                        this.s = zu4Var11;
                        this.t = zu4Var8;
                        this.u = av4Var3;
                        this.v = av4Var3;
                        this.w = zu4Var9;
                        this.B = zu4Var10;
                        this.x = list7;
                        this.C = gv9Var;
                        this.y = i2;
                        this.z = 3;
                        T7 = av4Var2.T(this);
                        lu3Var = lu3Var2;
                        if (T7 != lu3Var) {
                        }
                        break;
                    case 3:
                        i2 = this.y;
                        gv9 gv9Var6 = (gv9) this.C;
                        list7 = this.x;
                        zu4Var10 = (zu4) this.B;
                        zu4Var9 = this.w;
                        zu4Var12 = this.t;
                        zu4Var11 = this.s;
                        y6a.M(obj);
                        q9fVar = q9fVar2;
                        lu3Var = lu3Var4;
                        gv9Var = gv9Var6;
                        T7 = obj;
                        zu4Var13 = zu4Var9;
                        list9 = (List) T7;
                        if (list9 != null) {
                        }
                        gv9Var2 = rlh.b;
                        this.A = null;
                        this.s = null;
                        this.t = zu4Var12;
                        this.u = null;
                        this.v = null;
                        this.w = zu4Var13;
                        this.B = zu4Var10;
                        this.x = list7;
                        this.C = gv9Var;
                        this.D = gv9Var2;
                        this.y = i2;
                        this.z = 4;
                        T8 = zu4Var11.T(this);
                        if (T8 != lu3Var) {
                        }
                        break;
                    case 4:
                        i2 = this.y;
                        gv9Var2 = (gv9) this.D;
                        gv9Var3 = (gv9) this.C;
                        list10 = this.x;
                        zu4Var14 = (zu4) this.B;
                        zu4Var13 = this.w;
                        zu4Var12 = this.t;
                        y6a.M(obj);
                        T8 = obj;
                        q9fVar = q9fVar2;
                        lu3Var = lu3Var4;
                        gv9Var4 = gv9Var2;
                        editorsEventsCountResponse = (EditorsEventsCountResponse) T8;
                        this.A = null;
                        this.s = null;
                        this.t = null;
                        this.u = null;
                        this.v = null;
                        this.w = zu4Var13;
                        this.B = zu4Var14;
                        this.x = list10;
                        this.C = gv9Var3;
                        this.D = gv9Var4;
                        this.E = editorsEventsCountResponse;
                        this.y = i2;
                        this.z = 5;
                        T9 = zu4Var12.T(this);
                        break;
                    case 5:
                        i2 = this.y;
                        editorsEventsCountResponse = (EditorsEventsCountResponse) this.E;
                        gv9Var4 = (gv9) this.D;
                        gv9Var3 = (gv9) this.C;
                        list10 = this.x;
                        zu4Var14 = (zu4) this.B;
                        zu4Var13 = this.w;
                        y6a.M(obj);
                        q9fVar = q9fVar2;
                        lu3Var = lu3Var4;
                        T9 = obj;
                        EditorAggregates editorAggregates3 = (EditorAggregates) T9;
                        this.A = null;
                        this.s = null;
                        this.t = null;
                        this.u = null;
                        this.v = null;
                        this.w = zu4Var13;
                        this.B = null;
                        this.x = list10;
                        this.C = gv9Var3;
                        this.D = gv9Var4;
                        this.E = editorsEventsCountResponse;
                        this.F = editorAggregates3;
                        this.y = i2;
                        this.z = 6;
                        T10 = zu4Var14.T(this);
                        if (T10 != lu3Var) {
                            editorsEventsCountResponse2 = editorsEventsCountResponse;
                            editorAggregates = editorAggregates3;
                            zu4Var15 = zu4Var13;
                            gv9 W = l6g.W((Iterable) T10);
                            this.A = null;
                            this.s = null;
                            this.t = null;
                            this.u = null;
                            this.v = null;
                            this.w = null;
                            this.B = null;
                            this.x = list10;
                            this.C = gv9Var3;
                            this.D = gv9Var4;
                            this.E = editorsEventsCountResponse2;
                            this.F = editorAggregates;
                            this.G = W;
                            this.y = i2;
                            this.z = 7;
                            T11 = zu4Var15.T(this);
                            if (T11 != lu3Var) {
                                editorAggregates2 = editorAggregates;
                                editorsEventsCountResponse3 = editorsEventsCountResponse2;
                                gv9Var5 = W;
                                list11 = list10;
                                final int i9 = i2;
                                final gv9 gv9Var7 = gv9Var4;
                                final gv9 gv9Var8 = gv9Var3;
                                EditorEventOpeningsGraphResponse editorEventOpeningsGraphResponse3 = (EditorEventOpeningsGraphResponse) T11;
                                final int m = yid.m(editorEventOpeningsGraphResponse3 == null ? new Integer(editorEventOpeningsGraphResponse3.getAverage()) : null);
                                rlh rlhVar = rlh.b;
                                final q9f q9fVar3 = q9fVar;
                                q9fVar3.n(new pi5(rlhVar, rlhVar, null, null, false, false), new Function1() { // from class: n9f
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        Integer num2;
                                        pi5 pi5Var = (pi5) obj3;
                                        EditorsEventsCountResponse editorsEventsCountResponse4 = editorsEventsCountResponse3;
                                        String valueOf = String.valueOf(yid.m(editorsEventsCountResponse4 != null ? Integer.valueOf(editorsEventsCountResponse4.getEditedEvents()) : null));
                                        String valueOf2 = String.valueOf(yid.m(editorsEventsCountResponse4 != null ? Integer.valueOf(editorsEventsCountResponse4.getEventOpenings()) : null));
                                        EditorAggregates editorAggregates4 = editorAggregates2;
                                        if (editorAggregates4 == null || (num2 = editorAggregates4.getCurrentRanking()) == null || num2.intValue() <= 0) {
                                            num2 = null;
                                        }
                                        qi5 qi5Var = new qi5(valueOf, valueOf2, yid.j(num2), String.valueOf(yid.m(editorAggregates4 != null ? Integer.valueOf(wzb.b(editorAggregates4.getScore())) : null)));
                                        Calendar calendar = Calendar.getInstance();
                                        calendar.add(2, -5);
                                        calendar.set(5, 1);
                                        si5 si5Var = new si5(gv9Var5, l6g.W(new pg2(calendar, new SimpleDateFormat("MMM", Locale.getDefault()))), l6g.W(CollectionsKt.S0(list11)), i9, m);
                                        q9f q9fVar4 = q9fVar3;
                                        return pi5.a(pi5Var, gv9.this, gv9Var7, qi5Var, si5Var, (q9fVar4.n.getIsEditor() || q9fVar4.p) ? false : true, false, 32);
                                    }
                                });
                                break;
                            }
                        }
                        break;
                    case 6:
                        i2 = this.y;
                        editorAggregates = (EditorAggregates) this.F;
                        EditorsEventsCountResponse editorsEventsCountResponse4 = (EditorsEventsCountResponse) this.E;
                        gv9Var4 = (gv9) this.D;
                        gv9Var3 = (gv9) this.C;
                        list10 = this.x;
                        zu4Var15 = this.w;
                        y6a.M(obj);
                        T10 = obj;
                        q9fVar = q9fVar2;
                        editorsEventsCountResponse2 = editorsEventsCountResponse4;
                        lu3Var = lu3Var4;
                        gv9 W2 = l6g.W((Iterable) T10);
                        this.A = null;
                        this.s = null;
                        this.t = null;
                        this.u = null;
                        this.v = null;
                        this.w = null;
                        this.B = null;
                        this.x = list10;
                        this.C = gv9Var3;
                        this.D = gv9Var4;
                        this.E = editorsEventsCountResponse2;
                        this.F = editorAggregates;
                        this.G = W2;
                        this.y = i2;
                        this.z = 7;
                        T11 = zu4Var15.T(this);
                        if (T11 != lu3Var) {
                        }
                        break;
                    case 7:
                        i2 = this.y;
                        gv9 gv9Var9 = (gv9) this.G;
                        EditorAggregates editorAggregates4 = (EditorAggregates) this.F;
                        EditorsEventsCountResponse editorsEventsCountResponse5 = (EditorsEventsCountResponse) this.E;
                        gv9Var4 = (gv9) this.D;
                        gv9Var3 = (gv9) this.C;
                        List list16 = this.x;
                        y6a.M(obj);
                        list11 = list16;
                        gv9Var5 = gv9Var9;
                        q9fVar = q9fVar2;
                        editorAggregates2 = editorAggregates4;
                        editorsEventsCountResponse3 = editorsEventsCountResponse5;
                        T11 = obj;
                        final int i92 = i2;
                        final gv9 gv9Var72 = gv9Var4;
                        final gv9 gv9Var82 = gv9Var3;
                        EditorEventOpeningsGraphResponse editorEventOpeningsGraphResponse32 = (EditorEventOpeningsGraphResponse) T11;
                        final int m2 = yid.m(editorEventOpeningsGraphResponse32 == null ? new Integer(editorEventOpeningsGraphResponse32.getAverage()) : null);
                        rlh rlhVar2 = rlh.b;
                        final q9f q9fVar32 = q9fVar;
                        q9fVar32.n(new pi5(rlhVar2, rlhVar2, null, null, false, false), new Function1() { // from class: n9f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                Integer num2;
                                pi5 pi5Var = (pi5) obj3;
                                EditorsEventsCountResponse editorsEventsCountResponse42 = editorsEventsCountResponse3;
                                String valueOf = String.valueOf(yid.m(editorsEventsCountResponse42 != null ? Integer.valueOf(editorsEventsCountResponse42.getEditedEvents()) : null));
                                String valueOf2 = String.valueOf(yid.m(editorsEventsCountResponse42 != null ? Integer.valueOf(editorsEventsCountResponse42.getEventOpenings()) : null));
                                EditorAggregates editorAggregates42 = editorAggregates2;
                                if (editorAggregates42 == null || (num2 = editorAggregates42.getCurrentRanking()) == null || num2.intValue() <= 0) {
                                    num2 = null;
                                }
                                qi5 qi5Var = new qi5(valueOf, valueOf2, yid.j(num2), String.valueOf(yid.m(editorAggregates42 != null ? Integer.valueOf(wzb.b(editorAggregates42.getScore())) : null)));
                                Calendar calendar = Calendar.getInstance();
                                calendar.add(2, -5);
                                calendar.set(5, 1);
                                si5 si5Var = new si5(gv9Var5, l6g.W(new pg2(calendar, new SimpleDateFormat("MMM", Locale.getDefault()))), l6g.W(CollectionsKt.S0(list11)), i92, m2);
                                q9f q9fVar4 = q9fVar32;
                                return pi5.a(pi5Var, gv9.this, gv9Var72, qi5Var, si5Var, (q9fVar4.n.getIsEditor() || q9fVar4.p) ? false : true, false, 32);
                            }
                        });
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac6(q9f q9fVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.H = q9fVar;
    }
}
