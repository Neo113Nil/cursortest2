package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class r73 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r73(yil yilVar, boolean z, Function1 function1) {
        this.a = 4;
        this.c = yilVar;
        this.b = z;
        this.d = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        int i2 = 3;
        boolean z = true;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj5;
                xtc xtcVar = (xtc) obj6;
                tee teeVar = (tee) obj2;
                of3 of3Var = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                teeVar.getClass();
                List H0 = CollectionsKt.H0(teeVar.entrySet(), new y73(4));
                ArrayList arrayList = new ArrayList(k13.r(H0, 10));
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    arrayList.add((k83) ((Map.Entry) it.next()).getValue());
                }
                gv9 W = l6g.W(arrayList);
                int size = W.size();
                boolean z2 = this.b;
                if (size > 2) {
                    av8 av8Var = (av8) of3Var;
                    av8Var.d0(2039064684);
                    ml4.F(0, av8Var, W, xtcVar, function1, z2);
                    av8Var.s(false);
                } else {
                    av8 av8Var2 = (av8) of3Var;
                    av8Var2.d0(2039204525);
                    ml4.y(0, av8Var2, W, xtcVar, function1, z2);
                    av8Var2.s(false);
                }
                break;
            case 1:
                b83 b83Var = (b83) obj5;
                xtc xtcVar2 = (xtc) obj6;
                tee teeVar2 = (tee) obj2;
                of3 of3Var2 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                teeVar2.getClass();
                List H02 = CollectionsKt.H0(teeVar2.entrySet(), new qe8(29));
                int size2 = H02.size();
                boolean z3 = this.b;
                if (size2 > 2) {
                    av8 av8Var3 = (av8) of3Var2;
                    av8Var3.d0(1845597170);
                    ml4.D(b83Var, H02, z3, xtcVar2, av8Var3, 0);
                    av8Var3.s(false);
                } else {
                    av8 av8Var4 = (av8) of3Var2;
                    av8Var4.d0(1845735027);
                    ml4.w(b83Var, H02, z3, xtcVar2, av8Var4, 0);
                    av8Var4.s(false);
                }
                break;
            case 2:
                Function0 function0 = (Function0) obj5;
                xtc xtcVar3 = (xtc) obj6;
                tee teeVar3 = (tee) obj2;
                of3 of3Var3 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                teeVar3.getClass();
                List H03 = CollectionsKt.H0(teeVar3.entrySet(), new y73(i2));
                ArrayList arrayList2 = new ArrayList(k13.r(H03, 10));
                Iterator it2 = H03.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((Double) ((Map.Entry) it2.next()).getValue());
                }
                gv9 W2 = l6g.W(arrayList2);
                int size3 = W2.size();
                boolean z4 = this.b;
                if (size3 > 2) {
                    av8 av8Var5 = (av8) of3Var3;
                    av8Var5.d0(2013519693);
                    ml4.E(W2, z4, function0, xtcVar3, av8Var5, 0);
                    av8Var5.s(false);
                } else {
                    av8 av8Var6 = (av8) of3Var3;
                    av8Var6.d0(2013664494);
                    ml4.x(W2, z4, function0, xtcVar3, av8Var6, 0);
                    av8Var6.s(false);
                }
                break;
            case 3:
                plj pljVar = (plj) obj5;
                Function0 function02 = (Function0) obj6;
                int intValue = ((Integer) obj2).intValue();
                of3 of3Var4 = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((u5e) obj).getClass();
                oyn.o((ecd) pljVar.a.get(intValue), intValue, pljVar.d && pljVar.b == intValue, intValue == b.i(pljVar.a), this.b, function02, of3Var4, intValue2 & 112);
                break;
            default:
                yil yilVar = (yil) obj6;
                Function1 function12 = (Function1) obj5;
                gv9 gv9Var = (gv9) obj2;
                of3 of3Var5 = (of3) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                utc utcVar = utc.a;
                if (gv9Var == null || gv9Var.isEmpty()) {
                    av8 av8Var7 = (av8) of3Var5;
                    av8Var7.d0(2104692618);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var7, bkh.e(bkh.d(utcVar, 1.0f), 264.0f));
                    av8Var7.s(false);
                } else {
                    av8 av8Var8 = (av8) of3Var5;
                    av8Var8.d0(2104908316);
                    if ((((intValue3 & 112) ^ 48) <= 32 || !av8Var8.i(gv9Var)) && (intValue3 & 48) != 32) {
                        z = false;
                    }
                    Object O = av8Var8.O();
                    a99 a99Var = nf3.a;
                    if (z || O == a99Var) {
                        O = new b61(5, gv9Var);
                        av8Var8.n0(O);
                    }
                    pr4 b = c6e.b(0, (Function0) O, av8Var8, 6, 2);
                    xil xilVar = yilVar.c;
                    boolean g = av8Var8.g(b);
                    Object O2 = av8Var8.O();
                    if (g || O2 == a99Var) {
                        O2 = new n5e(b, null, i2);
                        av8Var8.n0(O2);
                    }
                    hz8.o(av8Var8, xilVar, (Function2) O2);
                    d7a.m(b.n(), bkh.d(utcVar, 1.0f), l98.C(8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 8.0f, b, yqo.H(725572085, av8Var8, new l4b(gv9Var, this.b, function12, 9)), av8Var8, 200112, 0);
                    av8Var8.s(false);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ r73(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = obj2;
    }

    public /* synthetic */ r73(boolean z, Function0 function0, xtc xtcVar) {
        this.a = 2;
        this.b = z;
        this.d = function0;
        this.c = xtcVar;
    }
}
