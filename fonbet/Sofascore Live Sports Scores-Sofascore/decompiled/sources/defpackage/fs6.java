package defpackage;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class fs6 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs6 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ fs6(gs6 gs6Var, Function1 function1, int i) {
        this.a = i;
        this.b = gs6Var;
        this.c = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        eo7 eo7Var;
        int i = this.a;
        utc utcVar = utc.a;
        Function1 function1 = this.c;
        gs6 gs6Var = this.b;
        a99 a99Var = nf3.a;
        int i2 = 7;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    av8Var.W();
                } else if (booleanValue) {
                    av8Var.d0(1818686038);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var, bkh.c);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1818907781);
                    Context context = (Context) av8Var.k(nz.b);
                    gs6 gs6Var2 = this.b;
                    boolean g = av8Var.g(gs6Var2.d);
                    Object O = av8Var.O();
                    if (g || O == a99Var) {
                        Iterator<E> it = gs6Var2.d.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                j67 j67Var = ((fo7) next).a;
                                if (j67Var != null && j67Var.d()) {
                                    obj4 = next;
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        fo7 fo7Var = (fo7) obj4;
                        O = Integer.valueOf((fo7Var == null || (eo7Var = fo7Var.b) == null) ? 0 : eo7Var.d());
                        av8Var.n0(O);
                    }
                    int intValue2 = ((Number) O).intValue();
                    png pngVar = new png(8.0f, uxf.l);
                    WeakHashMap weakHashMap = cal.w;
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, xw3.s(qea.p(av8Var).e, av8Var).a() + 48.0f, 7);
                    boolean g2 = av8Var.g(gs6Var2) | av8Var.e(intValue2) | av8Var.i(context);
                    Function1 function12 = this.c;
                    boolean g3 = g2 | av8Var.g(function12);
                    Object O2 = av8Var.O();
                    if (g3 || O2 == a99Var) {
                        O2 = new yx4(gs6Var2, intValue2, context, function12, 2);
                        av8Var.n0(O2);
                    }
                    v8a.a(null, null, C, pngVar, null, null, false, null, (Function1) O2, av8Var, 24576, 491);
                    av8Var.s(false);
                }
                break;
            case 1:
                xpa xpaVar = (xpa) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var2).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    gv9 gv9Var = gs6Var.d;
                    boolean g4 = av8Var2.g(function1);
                    Object O3 = av8Var2.O();
                    if (g4 || O3 == a99Var) {
                        O3 = new k46(8, function1);
                        av8Var2.n0(O3);
                    }
                    ok3.c(0, av8Var2, gv9Var, l98.d0(xpa.a(xpaVar, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), (Function1) O3);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var3).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    gv9 gv9Var2 = gs6Var.c;
                    int i3 = gs6Var.e;
                    boolean z = i3 < 3;
                    do7 do7Var = gs6Var.b;
                    boolean c = Intrinsics.c(do7Var != null ? Boolean.valueOf(do7Var.c.w) : null, Boolean.TRUE);
                    xtc d0 = l98.d0(xpa.a(xpaVar2, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    boolean g5 = av8Var3.g(function1);
                    Object O4 = av8Var3.O();
                    if (g5 || O4 == a99Var) {
                        O4 = new is5(27, function1);
                        av8Var3.n0(O4);
                    }
                    Function0 function0 = (Function0) O4;
                    boolean g6 = av8Var3.g(function1);
                    Object O5 = av8Var3.O();
                    if (g6 || O5 == a99Var) {
                        O5 = new is5(28, function1);
                        av8Var3.n0(O5);
                    }
                    Function0 function02 = (Function0) O5;
                    boolean g7 = av8Var3.g(function1);
                    Object O6 = av8Var3.O();
                    if (g7 || O6 == a99Var) {
                        O6 = new is5(29, function1);
                        av8Var3.n0(O6);
                    }
                    Function0 function03 = (Function0) O6;
                    boolean g8 = av8Var3.g(function1);
                    Object O7 = av8Var3.O();
                    if (g8 || O7 == a99Var) {
                        O7 = new k46(i2, function1);
                        av8Var3.n0(O7);
                    }
                    ok3.b(gv9Var2, i3, function0, function02, function03, (Function1) O7, c, z, d0, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
