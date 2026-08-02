package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.sofascore.model.Sports;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d40 extends hoi implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int r = 0;
    public int s;
    public /* synthetic */ Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(b1d b1dVar, jwj jwjVar, cej cejVar, z41 z41Var, j20 j20Var, qu9 qu9Var, Function1 function1, Function0 function0, hsk hskVar, Function1 function12, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = b1dVar;
        this.v = jwjVar;
        this.w = cejVar;
        this.x = z41Var;
        this.y = j20Var;
        this.z = qu9Var;
        this.A = function1;
        this.C = function0;
        this.D = hskVar;
        this.B = function12;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.A;
        switch (i) {
            case 0:
                d40 d40Var = new d40((b1d) this.u, (jwj) this.v, (cej) this.w, (z41) this.x, (j20) this.y, (qu9) this.z, (Function1) obj5, (Function0) obj3, (hsk) obj2, (Function1) obj4, rq3Var);
                d40Var.t = obj;
                return d40Var;
            default:
                d40 d40Var2 = new d40((rnj) obj5, (boj) obj4, (koj) obj3, (List) obj2, rq3Var);
                d40Var2.t = obj;
                return d40Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 0:
                ((d40) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                return lu3.a;
            default:
                return ((d40) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cb, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009a, code lost:
    
        if (r3 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0088, code lost:
    
        if (r9 == r5) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013e A[LOOP:0: B:14:0x0138->B:16:0x013e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0180 A[LOOP:1: B:19:0x017a->B:21:0x0180, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01af  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        av4 t;
        Object w;
        List list;
        Object T;
        List<String> list2;
        gv9 y;
        gv9 gv9Var;
        koj kojVar;
        gv9 gv9Var2;
        Object w2;
        gv9 gv9Var3;
        String str;
        int i2 = this.r;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.A;
        Object obj5 = this.B;
        rq3 rq3Var = null;
        switch (i2) {
            case 0:
                jwj jwjVar = (jwj) this.v;
                z41 z41Var = (z41) this.x;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ku3 ku3Var = (ku3) this.t;
                xw3.L(ku3Var, null, nu3.d, new l0(jwjVar, z41Var, rq3Var, 14), 1);
                b1d b1dVar = (b1d) this.u;
                if (b1dVar != null) {
                    xw3.L(ku3Var, null, null, new l0(b1dVar, z41Var, rq3Var, 15), 3);
                }
                final u84 u84Var = new u84(jwjVar, (cej) this.w, z41Var, ku3Var);
                j20 j20Var = (j20) this.y;
                final jwj jwjVar2 = (jwj) this.v;
                final qu9 qu9Var = (qu9) this.z;
                final z41 z41Var2 = (z41) this.x;
                final Function1 function1 = (Function1) obj4;
                final cej cejVar = (cej) this.w;
                final Function0 function0 = (Function0) obj3;
                final hsk hskVar = (hsk) obj2;
                final Function1 function12 = (Function1) obj5;
                nje njeVar = new nje() { // from class: a40
                    @Override // defpackage.nje
                    public final InputConnection a(EditorInfo editorInfo) {
                        jwj jwjVar3 = jwj.this;
                        c40 c40Var = new c40(new fig(jwjVar3), jwjVar3, z41Var2, function1, u84Var, cejVar, function0, hskVar, function12);
                        pd0.L(editorInfo, jwjVar3.d(), jwjVar3.d().d, qu9Var);
                        return new wdi(c40Var, editorInfo);
                    }
                };
                this.s = 1;
                j20Var.a(njeVar, this);
                return lu3Var;
            default:
                boj bojVar = (boj) obj5;
                rnj rnjVar = (rnj) obj4;
                String str2 = rnjVar.c;
                koj kojVar2 = (koj) obj3;
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i4 == 0) {
                    y6a.M(obj);
                    i = 2;
                    t = xw3.t(ku3Var2, null, new h4i((Object) kojVar2, (Object) bojVar, (Object) rnjVar, (rq3) (objArr == true ? 1 : 0), 20), 3);
                    av4 t2 = xw3.t(ku3Var2, null, new eoj(2, null), 3);
                    this.t = ku3Var2;
                    this.u = t;
                    this.s = 1;
                    w = t2.w(this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gv9 gv9Var4 = (gv9) this.z;
                            kojVar = (koj) this.y;
                            gv9Var3 = (gv9) this.x;
                            List list3 = (List) this.w;
                            y6a.M(obj);
                            y = gv9Var4;
                            list2 = list3;
                            w2 = obj;
                            gv9Var2 = (gv9) w2;
                            gv9Var = gv9Var3;
                            gv9 u = kojVar.u(y, gv9Var2, str2);
                            str = (String) CollectionsKt.firstOrNull(list2);
                            if (str == null) {
                                str = "";
                            }
                            String str3 = str;
                            ArrayList arrayList = new ArrayList(k13.r(list2, 10));
                            for (String str4 : list2) {
                                Set set = f5k.a;
                                arrayList.add(new vt2(str4, f5k.b(kojVar2.i(), str4, str2), false, null, null, hrh.m, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
                            }
                            gv9 W = l6g.W(arrayList);
                            List<boj> list4 = (List) obj2;
                            ArrayList arrayList2 = new ArrayList(k13.r(list4, 10));
                            for (boj bojVar2 : list4) {
                                String string = kojVar2.i().getString(bojVar2.a);
                                string.getClass();
                                arrayList2.add(new s1h(bojVar2, string, true));
                            }
                            gv9 W2 = l6g.W(arrayList2);
                            vt2 vt2Var = (vt2) CollectionsKt.firstOrNull(gv9Var);
                            lnj lnjVar = vt2Var != null ? (lnj) vt2Var.a : null;
                            oxh oxhVar = (oxh) CollectionsKt.firstOrNull(u);
                            return new uza(W2, W, gv9Var, lnjVar, u, oxhVar != null ? (pnj) oxhVar.a : null, str3);
                        }
                        List list5 = (List) this.v;
                        y6a.M(obj);
                        list = list5;
                        T = obj;
                        List list6 = (List) T;
                        if (list6 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj6 : list6) {
                                if (list.contains((String) obj6)) {
                                    arrayList3.add(obj6);
                                }
                            }
                            list2 = CollectionsKt.H0(arrayList3, new h31(list, 4));
                            break;
                        }
                        list2 = km5.a;
                        av4 p = yaa.p(ku3Var2, Intrinsics.c(str2, Sports.ICE_HOCKEY) && bojVar == boj.TEAMS, new vki(kojVar2, rnjVar, objArr2 == true ? 1 : 0, 16));
                        gv9 t3 = kojVar2.t(str2, bojVar);
                        y = kojVar2.y(str2, bojVar);
                        if (p == null) {
                            gv9Var = t3;
                            kojVar = kojVar2;
                            gv9Var2 = null;
                            gv9 u2 = kojVar.u(y, gv9Var2, str2);
                            str = (String) CollectionsKt.firstOrNull(list2);
                            if (str == null) {
                            }
                            String str32 = str;
                            ArrayList arrayList4 = new ArrayList(k13.r(list2, 10));
                            while (r3.hasNext()) {
                            }
                            gv9 W3 = l6g.W(arrayList4);
                            List<boj> list42 = (List) obj2;
                            ArrayList arrayList22 = new ArrayList(k13.r(list42, 10));
                            while (r1.hasNext()) {
                            }
                            gv9 W22 = l6g.W(arrayList22);
                            vt2 vt2Var2 = (vt2) CollectionsKt.firstOrNull(gv9Var);
                            if (vt2Var2 != null) {
                            }
                            oxh oxhVar2 = (oxh) CollectionsKt.firstOrNull(u2);
                            return new uza(W22, W3, gv9Var, lnjVar, u2, oxhVar2 != null ? (pnj) oxhVar2.a : null, str32);
                        }
                        this.t = null;
                        this.u = null;
                        this.v = null;
                        this.w = list2;
                        this.x = t3;
                        this.y = kojVar2;
                        this.z = y;
                        this.s = 3;
                        w2 = p.w(this);
                        lu3 lu3Var3 = lu3.a;
                        if (w2 != lu3Var2) {
                            gv9Var3 = t3;
                            kojVar = kojVar2;
                            gv9Var2 = (gv9) w2;
                            gv9Var = gv9Var3;
                            gv9 u22 = kojVar.u(y, gv9Var2, str2);
                            str = (String) CollectionsKt.firstOrNull(list2);
                            if (str == null) {
                            }
                            String str322 = str;
                            ArrayList arrayList42 = new ArrayList(k13.r(list2, 10));
                            while (r3.hasNext()) {
                            }
                            gv9 W32 = l6g.W(arrayList42);
                            List<boj> list422 = (List) obj2;
                            ArrayList arrayList222 = new ArrayList(k13.r(list422, 10));
                            while (r1.hasNext()) {
                            }
                            gv9 W222 = l6g.W(arrayList222);
                            vt2 vt2Var22 = (vt2) CollectionsKt.firstOrNull(gv9Var);
                            if (vt2Var22 != null) {
                            }
                            oxh oxhVar22 = (oxh) CollectionsKt.firstOrNull(u22);
                            return new uza(W222, W32, gv9Var, lnjVar, u22, oxhVar22 != null ? (pnj) oxhVar22.a : null, str322);
                        }
                        return lu3Var2;
                    }
                    av4 av4Var = (av4) this.u;
                    y6a.M(obj);
                    w = obj;
                    t = av4Var;
                    i = 2;
                }
                list = (List) w;
                this.t = ku3Var2;
                this.u = null;
                this.v = list;
                this.s = i;
                T = t.T(this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(rnj rnjVar, boj bojVar, koj kojVar, List list, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = rnjVar;
        this.B = bojVar;
        this.C = kojVar;
        this.D = list;
    }
}
