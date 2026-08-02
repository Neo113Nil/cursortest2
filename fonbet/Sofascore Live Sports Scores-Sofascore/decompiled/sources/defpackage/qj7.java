package defpackage;

import android.content.Context;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.fantasy.FantasyUserCompetition;
import com.sofascore.model.fantasy.FantasyUserCompetitionsResponse;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qj7 extends hoi implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int r = 0;
    public boolean s;
    public int t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj7(Set set, tj7 tj7Var, Integer num, Integer num2, Map map, Context context, Map map2, String str, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = set;
        this.v = tj7Var;
        this.w = num;
        this.x = num2;
        this.y = map;
        this.A = context;
        this.z = map2;
        this.B = str;
        this.s = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                return new qj7((Set) this.u, (tj7) this.v, (Integer) this.w, (Integer) this.x, (Map) this.y, (Context) this.A, (Map) this.z, (String) obj2, this.s, rq3Var);
            default:
                qj7 qj7Var = new qj7((ypb) obj2, rq3Var);
                qj7Var.A = obj;
                return qj7Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((qj7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
    
        if (r9 == r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0159, code lost:
    
        if (r7 != r8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00b3, code lost:
    
        if (r2 == r8) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149  */
    /* JADX WARN: Type inference failed for: r12v7, types: [ru6] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [km5] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v19, types: [zu4] */
    /* JADX WARN: Type inference failed for: r9v17, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        av4 t;
        zu4 t2;
        Object w;
        zu4 zu4Var;
        x2g x2gVar;
        FantasyUserCompetitionsResponse fantasyUserCompetitionsResponse;
        ?? r14;
        Object a;
        List<FantasyUserCompetition> competitions;
        Object value;
        gv9 W;
        Object T;
        Object T2;
        zu4 zu4Var2;
        gv9 gv9Var;
        Object T3;
        gv9 gv9Var2;
        gv9 gv9Var3;
        Object a2;
        gv9 gv9Var4;
        gv9 gv9Var5;
        boolean z;
        gv9 gv9Var6;
        gv9 gv9Var7;
        boolean z2;
        boolean z3;
        gv9 gv9Var8;
        FantasyRemoteAnnouncement B;
        ppb ppbVar;
        Object value2;
        ppb ppbVar2;
        int i = this.r;
        Object obj2 = this.B;
        rq3 rq3Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.t;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                hs4 hs4Var = z45.a;
                hq4 hq4Var = hq4.c;
                pj7 pj7Var = new pj7((Set) this.u, (tj7) this.v, (Integer) this.w, (Integer) this.x, (Map) this.y, (Context) this.A, (Map) this.z, (String) obj2, this.s, null);
                this.t = 1;
                Object R = xw3.R(hq4Var, pj7Var, this);
                return R == lu3Var ? lu3Var : R;
            default:
                ypb ypbVar = (ypb) obj2;
                fdi fdiVar = ypbVar.i;
                bfk bfkVar = ypbVar.e;
                ku3 ku3Var = (ku3) this.A;
                lu3 lu3Var2 = lu3.a;
                int i4 = 0;
                int i5 = 3;
                switch (this.t) {
                    case 0:
                        y6a.M(obj);
                        this.A = ku3Var;
                        this.t = 1;
                        c = bfkVar.c(this);
                        break;
                    case 1:
                        y6a.M(obj);
                        c = obj;
                        UserAccount userAccount = (UserAccount) c;
                        av4 t3 = xw3.t(ku3Var, null, new xpb(ypbVar, userAccount, rq3Var, i5), 3);
                        av4 t4 = xw3.t(ku3Var, null, new xpb(ypbVar, userAccount, rq3Var, i4), 3);
                        t = xw3.t(ku3Var, null, new xpb(ypbVar, userAccount, rq3Var, 2), 3);
                        t2 = xw3.t(ku3Var, null, new xpb(ypbVar, userAccount, rq3Var, i2), 3);
                        this.A = null;
                        this.u = t4;
                        this.v = t;
                        this.w = t2;
                        this.t = 2;
                        w = t3.w(this);
                        if (w != lu3Var2) {
                            zu4Var = t4;
                            x2gVar = (x2g) w;
                            if (!(x2gVar instanceof t2g) && !(x2gVar instanceof r2g)) {
                                do {
                                    value = fdiVar.getValue();
                                } while (!fdiVar.k(value, npb.a));
                                return Unit.a;
                            }
                            ?? r12 = ypbVar.g;
                            fantasyUserCompetitionsResponse = (FantasyUserCompetitionsResponse) yaa.x(x2gVar);
                            if (fantasyUserCompetitionsResponse != null || (competitions = fantasyUserCompetitionsResponse.getCompetitions()) == null) {
                                r14 = 0;
                            } else {
                                r14 = new ArrayList(k13.r(competitions, 10));
                                Iterator it = competitions.iterator();
                                while (it.hasNext()) {
                                    r14.add(fkf.O((FantasyUserCompetition) it.next(), ypbVar.i()));
                                }
                            }
                            if (r14 == 0) {
                                r14 = km5.a;
                            }
                            this.A = null;
                            this.u = zu4Var;
                            this.v = t;
                            this.w = t2;
                            this.t = 3;
                            a = r12.a(r14, this);
                            break;
                        }
                        return lu3Var2;
                    case 2:
                        t2 = (zu4) this.w;
                        ?? r7 = (zu4) this.v;
                        zu4Var = (zu4) this.u;
                        y6a.M(obj);
                        t = r7;
                        w = obj;
                        x2gVar = (x2g) w;
                        if (!(x2gVar instanceof t2g)) {
                            break;
                        }
                        ?? r122 = ypbVar.g;
                        fantasyUserCompetitionsResponse = (FantasyUserCompetitionsResponse) yaa.x(x2gVar);
                        if (fantasyUserCompetitionsResponse != null) {
                            break;
                        }
                        r14 = 0;
                        if (r14 == 0) {
                        }
                        this.A = null;
                        this.u = zu4Var;
                        this.v = t;
                        this.w = t2;
                        this.t = 3;
                        a = r122.a(r14, this);
                        break;
                    case 3:
                        t2 = (zu4) this.w;
                        ?? r72 = (zu4) this.v;
                        zu4Var = (zu4) this.u;
                        y6a.M(obj);
                        t = r72;
                        a = obj;
                        W = l6g.W((Iterable) a);
                        this.A = null;
                        this.u = null;
                        this.v = t;
                        this.w = t2;
                        this.x = W;
                        this.t = 4;
                        T = zu4Var.T(this);
                        break;
                    case 4:
                        gv9 gv9Var9 = (gv9) this.x;
                        zu4 zu4Var3 = (zu4) this.w;
                        ?? r9 = (zu4) this.v;
                        y6a.M(obj);
                        W = gv9Var9;
                        t2 = zu4Var3;
                        t = r9;
                        T = obj;
                        gv9 gv9Var10 = (gv9) T;
                        this.A = null;
                        this.u = null;
                        this.v = null;
                        this.w = t2;
                        this.x = W;
                        this.y = gv9Var10;
                        this.t = 5;
                        T2 = t.T(this);
                        if (T2 != lu3Var2) {
                            zu4Var2 = t2;
                            gv9Var = gv9Var10;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : (Iterable) T2) {
                                mp6 mp6Var = (mp6) obj3;
                                if (gv9Var == null || !gv9Var.isEmpty()) {
                                    Iterator it2 = gv9Var.iterator();
                                    while (it2.hasNext()) {
                                        if (((mp6) it2.next()).a == mp6Var.a) {
                                            break;
                                        }
                                    }
                                }
                                arrayList.add(obj3);
                            }
                            gv9 W2 = l6g.W(arrayList);
                            this.A = null;
                            this.u = null;
                            this.v = null;
                            this.w = null;
                            this.x = W;
                            this.y = gv9Var;
                            this.z = W2;
                            this.t = 6;
                            T3 = zu4Var2.T(this);
                            if (T3 != lu3Var2) {
                                gv9Var2 = gv9Var;
                                gv9Var3 = W2;
                                boolean booleanValue = ((Boolean) T3).booleanValue();
                                if (!W.isEmpty()) {
                                    cg4 cg4Var = ypbVar.f;
                                    this.A = null;
                                    this.u = null;
                                    this.v = null;
                                    this.w = null;
                                    this.x = W;
                                    this.y = gv9Var2;
                                    this.z = gv9Var3;
                                    this.s = booleanValue;
                                    this.t = 7;
                                    a2 = cg4Var.a("FANTASY_SHOW_FEEDBACK_BUBBLE", true, this);
                                    if (a2 != lu3Var2) {
                                        gv9Var4 = gv9Var2;
                                        gv9Var5 = gv9Var3;
                                        z = booleanValue;
                                        if (!((Boolean) a2).booleanValue()) {
                                            z2 = z;
                                            gv9Var6 = gv9Var5;
                                            gv9Var7 = gv9Var4;
                                            z3 = true;
                                            gv9Var8 = W;
                                            yea yeaVar = j58.a;
                                            B = rfo.B(j58.e(), FantasyRemoteAnnouncementLocation.CENTER, null, ypbVar.q, bfkVar.b().getId());
                                            rlh rlhVar = rlh.b;
                                            ppbVar = new ppb(rlhVar, rlhVar, rlhVar, upb.MyCompetitions, null, false, false);
                                            do {
                                                value2 = fdiVar.getValue();
                                                tpb tpbVar = (tpb) value2;
                                                ppbVar2 = tpbVar instanceof ppb ? (ppb) tpbVar : null;
                                            } while (!fdiVar.k(value2, ppb.a(ppbVar2 == null ? ppbVar : ppbVar2, gv9Var8, gv9Var7, gv9Var6, null, B, z3, z2, 8)));
                                            return Unit.a;
                                        }
                                        booleanValue = z;
                                        gv9Var3 = gv9Var5;
                                        gv9Var2 = gv9Var4;
                                    }
                                }
                                gv9Var6 = gv9Var3;
                                gv9Var7 = gv9Var2;
                                z2 = booleanValue;
                                z3 = false;
                                gv9Var8 = W;
                                yea yeaVar2 = j58.a;
                                B = rfo.B(j58.e(), FantasyRemoteAnnouncementLocation.CENTER, null, ypbVar.q, bfkVar.b().getId());
                                rlh rlhVar2 = rlh.b;
                                ppbVar = new ppb(rlhVar2, rlhVar2, rlhVar2, upb.MyCompetitions, null, false, false);
                                do {
                                    value2 = fdiVar.getValue();
                                    tpb tpbVar2 = (tpb) value2;
                                    if (tpbVar2 instanceof ppb) {
                                    }
                                } while (!fdiVar.k(value2, ppb.a(ppbVar2 == null ? ppbVar : ppbVar2, gv9Var8, gv9Var7, gv9Var6, null, B, z3, z2, 8)));
                                return Unit.a;
                            }
                        }
                        return lu3Var2;
                    case 5:
                        gv9Var = (gv9) this.y;
                        W = (gv9) this.x;
                        zu4Var2 = (zu4) this.w;
                        y6a.M(obj);
                        T2 = obj;
                        ArrayList arrayList2 = new ArrayList();
                        while (r10.hasNext()) {
                        }
                        gv9 W22 = l6g.W(arrayList2);
                        this.A = null;
                        this.u = null;
                        this.v = null;
                        this.w = null;
                        this.x = W;
                        this.y = gv9Var;
                        this.z = W22;
                        this.t = 6;
                        T3 = zu4Var2.T(this);
                        if (T3 != lu3Var2) {
                        }
                        return lu3Var2;
                    case 6:
                        gv9Var3 = (gv9) this.z;
                        gv9 gv9Var11 = (gv9) this.y;
                        gv9 gv9Var12 = (gv9) this.x;
                        y6a.M(obj);
                        gv9Var2 = gv9Var11;
                        W = gv9Var12;
                        T3 = obj;
                        boolean booleanValue2 = ((Boolean) T3).booleanValue();
                        if (!W.isEmpty()) {
                        }
                        gv9Var6 = gv9Var3;
                        gv9Var7 = gv9Var2;
                        z2 = booleanValue2;
                        z3 = false;
                        gv9Var8 = W;
                        yea yeaVar22 = j58.a;
                        B = rfo.B(j58.e(), FantasyRemoteAnnouncementLocation.CENTER, null, ypbVar.q, bfkVar.b().getId());
                        rlh rlhVar22 = rlh.b;
                        ppbVar = new ppb(rlhVar22, rlhVar22, rlhVar22, upb.MyCompetitions, null, false, false);
                        do {
                            value2 = fdiVar.getValue();
                            tpb tpbVar22 = (tpb) value2;
                            if (tpbVar22 instanceof ppb) {
                            }
                        } while (!fdiVar.k(value2, ppb.a(ppbVar2 == null ? ppbVar : ppbVar2, gv9Var8, gv9Var7, gv9Var6, null, B, z3, z2, 8)));
                        return Unit.a;
                    case 7:
                        z = this.s;
                        gv9 gv9Var13 = (gv9) this.z;
                        gv9Var4 = (gv9) this.y;
                        gv9 gv9Var14 = (gv9) this.x;
                        y6a.M(obj);
                        gv9Var5 = gv9Var13;
                        W = gv9Var14;
                        a2 = obj;
                        if (!((Boolean) a2).booleanValue()) {
                        }
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj7(ypb ypbVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.B = ypbVar;
    }
}
