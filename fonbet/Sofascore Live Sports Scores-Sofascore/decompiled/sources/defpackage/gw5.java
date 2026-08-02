package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.BaseballAtBatData;
import com.sofascore.model.newNetwork.commentary.AmFootballDrive;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.model.newNetwork.commentary.CommentaryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gw5 extends hoi implements Function2 {
    public av4 r;
    public zu4 s;
    public hw5 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Event w;
    public final /* synthetic */ hw5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw5(Event event, hw5 hw5Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = event;
        this.x = hw5Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        gw5 gw5Var = new gw5(this.w, this.x, rq3Var);
        gw5Var.v = obj;
        return gw5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gw5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0336, code lost:
    
        if (r11.j(r27) == r2) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0118, code lost:
    
        if (r1 != r2) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0105  */
    /* JADX WARN: Type inference failed for: r21v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v23, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v24, types: [zu4] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [km5] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        int i;
        av4 t2;
        hw5 hw5Var;
        Object w;
        av4 av4Var;
        av4 av4Var2;
        hw5 hw5Var2;
        LinkedHashMap linkedHashMap;
        Object T;
        hw5 hw5Var3;
        av4 av4Var3;
        Object T2;
        Integer awayScore$default;
        Integer homeScore$default;
        Integer errors;
        Integer hits;
        Integer runs;
        ?? r4;
        ku3 ku3Var = (ku3) this.v;
        lu3 lu3Var = lu3.a;
        int i2 = this.u;
        Event event = this.w;
        hw5 hw5Var4 = this.x;
        if (i2 == 0) {
            y6a.M(obj);
            String a = dla.a();
            if (Intrinsics.c(ok3.s(event), Sports.BASEBALL) && !dla.c.contains(a)) {
                a = "en";
            }
            String str = a;
            t = xw3.t(ku3Var, null, new fw5(hw5Var4, event, null, 0), 3);
            i = 0;
            t2 = xw3.t(ku3Var, null, new rh4((q8) hw5Var4, event, str, (rq3) null, 9), 3);
            av4 p = yaa.p(ku3Var, Intrinsics.c(ok3.s(event), Sports.BASEBALL), new fw5(hw5Var4, event, null, 1));
            if (p != null) {
                this.v = null;
                this.r = t;
                this.s = t2;
                this.t = hw5Var4;
                this.u = 1;
                w = p.w(this);
                if (w != lu3Var) {
                    av4Var = t;
                    av4Var2 = t2;
                    hw5Var2 = hw5Var4;
                }
                return lu3Var;
            }
            hw5Var = hw5Var4;
            av4Var = t;
            av4Var2 = t2;
            linkedHashMap = null;
            hw5Var2 = hw5Var;
            hw5Var2.j = linkedHashMap;
            this.v = null;
            this.r = null;
            this.s = av4Var2;
            this.t = hw5Var4;
            this.u = 2;
            T = av4Var.T(this);
            if (T != lu3Var) {
                hw5Var3 = hw5Var4;
                av4Var3 = av4Var2;
                hw5Var3.i = (LineupsResponse) T;
                this.v = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = 3;
                T2 = av4Var3.T(this);
            }
            return lu3Var;
        }
        if (i2 == 1) {
            hw5 hw5Var5 = this.t;
            ?? r3 = this.s;
            av4Var = this.r;
            y6a.M(obj);
            i = 0;
            hw5Var2 = hw5Var5;
            w = obj;
            av4Var2 = r3;
        } else if (i2 == 2) {
            hw5 hw5Var6 = this.t;
            ?? r32 = this.s;
            y6a.M(obj);
            hw5Var3 = hw5Var6;
            i = 0;
            T = obj;
            av4Var3 = r32;
            hw5Var3.i = (LineupsResponse) T;
            this.v = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = 3;
            T2 = av4Var3.T(this);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            T2 = obj;
            i = 0;
            CommentaryResponse commentaryResponse = (CommentaryResponse) T2;
            if (commentaryResponse != null) {
                if (Intrinsics.c(ok3.s(event), Sports.AMERICAN_FOOTBALL)) {
                    List<AmFootballDrive> drives = commentaryResponse.getDrives();
                    if (drives != null) {
                        r4 = new ArrayList(k13.r(drives, 10));
                        for (AmFootballDrive amFootballDrive : drives) {
                            gp.Companion.getClass();
                            amFootballDrive.getClass();
                            r4.add(new gp(amFootballDrive.getId(), amFootballDrive.getTeamId(), amFootballDrive.getPlayCount(), amFootballDrive.getDurationSeconds(), amFootballDrive.getNetDriveYards(), amFootballDrive.getEndReason()));
                        }
                    } else {
                        r4 = km5.a;
                    }
                    hw5Var4.h = r4;
                } else if (Intrinsics.c(ok3.s(event), Sports.BASEBALL)) {
                    List<Comment> comments = commentaryResponse.getComments();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj2 : comments) {
                        Comment comment = (Comment) obj2;
                        BaseballInningInfo inningInfo = comment.getInningInfo();
                        BaseballInningInfo.InningHalf inningHalf = inningInfo != null ? inningInfo.getInningHalf() : null;
                        BaseballInningInfo inningInfo2 = comment.getInningInfo();
                        Pair pair = new Pair(inningHalf, inningInfo2 != null ? new Integer(inningInfo2.getInning()) : null);
                        Object obj3 = linkedHashMap2.get(pair);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap2.put(pair, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        Pair pair2 = (Pair) entry.getKey();
                        List list = (List) entry.getValue();
                        BaseballInningInfo.InningHalf inningHalf2 = (BaseballInningInfo.InningHalf) pair2.a;
                        Integer num = (Integer) pair2.b;
                        BaseballInningInfo.InningHalf inningHalf3 = BaseballInningInfo.InningHalf.Top;
                        int id = inningHalf2 == inningHalf3 ? event.getAwayTeam(TeamSides.ORIGINAL).getId() : event.getHomeTeam(TeamSides.ORIGINAL).getId();
                        int intValue = num != null ? num.intValue() : i;
                        BaseballInningInfo.InningHalf inningHalf4 = inningHalf2 == null ? inningHalf3 : inningHalf2;
                        Iterator it = list.iterator();
                        int i3 = i;
                        while (it.hasNext()) {
                            BaseballInningInfo inningInfo3 = ((Comment) it.next()).getInningInfo();
                            i3 += (inningInfo3 == null || (runs = inningInfo3.getRuns()) == null) ? i : runs.intValue();
                        }
                        Integer num2 = new Integer(i3);
                        Iterator it2 = list.iterator();
                        int i4 = i;
                        while (it2.hasNext()) {
                            BaseballInningInfo inningInfo4 = ((Comment) it2.next()).getInningInfo();
                            i4 += (inningInfo4 == null || (hits = inningInfo4.getHits()) == null) ? i : hits.intValue();
                        }
                        Integer num3 = new Integer(i4);
                        Iterator it3 = list.iterator();
                        int i5 = i;
                        while (it3.hasNext()) {
                            BaseballInningInfo inningInfo5 = ((Comment) it3.next()).getInningInfo();
                            i5 += (inningInfo5 == null || (errors = inningInfo5.getErrors()) == null) ? i : errors.intValue();
                        }
                        BaseballInningInfo baseballInningInfo = new BaseballInningInfo(intValue, inningHalf4, num2, num3, new Integer(i5));
                        int i6 = (ok3.D(event) && Intrinsics.c(CollectionsKt.j0(commentaryResponse.getComments()), CollectionsKt.j0(list))) ? 1 : i;
                        Comment comment2 = (Comment) CollectionsKt.j0(list);
                        int intValue2 = (comment2 == null || (homeScore$default = Comment.getHomeScore$default(comment2, null, 1, null)) == null) ? i : homeScore$default.intValue();
                        Comment comment3 = (Comment) CollectionsKt.j0(list);
                        arrayList.add(new b91(id, i6, baseballInningInfo, intValue2, (comment3 == null || (awayScore$default = Comment.getAwayScore$default(comment3, null, 1, null)) == null) ? i : awayScore$default.intValue()));
                    }
                    hw5Var4.h = arrayList;
                }
                hw5Var4.f.j(commentaryResponse);
            }
            this.v = null;
            this.r = null;
            this.s = null;
            this.u = 4;
        }
        List list2 = (List) w;
        if (list2 == null) {
            hw5Var = hw5Var2;
            t2 = av4Var2;
            t = av4Var;
            av4Var = t;
            av4Var2 = t2;
            linkedHashMap = null;
            hw5Var2 = hw5Var;
            hw5Var2.j = linkedHashMap;
            this.v = null;
            this.r = null;
            this.s = av4Var2;
            this.t = hw5Var4;
            this.u = 2;
            T = av4Var.T(this);
            if (T != lu3Var) {
            }
            return lu3Var;
        }
        int c = sub.c(k13.r(list2, 10));
        if (c < 16) {
            c = 16;
        }
        linkedHashMap = new LinkedHashMap(c);
        for (Object obj4 : list2) {
            linkedHashMap.put(new Integer(((BaseballAtBatData) obj4).getId()), obj4);
        }
        hw5Var2.j = linkedHashMap;
        this.v = null;
        this.r = null;
        this.s = av4Var2;
        this.t = hw5Var4;
        this.u = 2;
        T = av4Var.T(this);
        if (T != lu3Var) {
        }
        return lu3Var;
    }
}
