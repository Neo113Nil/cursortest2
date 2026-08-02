package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.results.event.details.view.graph.AttackMomentumGraph;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zg8 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dh8 b;

    public /* synthetic */ zg8(dh8 dh8Var, int i) {
        this.a = i;
        this.b = dh8Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String valueOf;
        String valueOf2;
        int i = this.a;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        final dh8 dh8Var = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String str = dh8Var.l;
                    bx7 bx7Var = dh8Var.k;
                    l98.r(str, bx7Var.c, bx7Var.b, bx7Var.d, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    bx7 bx7Var2 = dh8Var.k;
                    fy7 fy7Var = bx7Var2.g;
                    fy7 fy7Var2 = bx7Var2.h;
                    if (fy7Var != null && fy7Var2 != null) {
                        xtc f0 = l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        Integer num = bx7Var2.m;
                        String str2 = (num == null || (valueOf2 = String.valueOf(num.intValue())) == null) ? "" : valueOf2;
                        Integer num2 = bx7Var2.q;
                        int intValue3 = num2 != null ? num2.intValue() : 0;
                        Integer num3 = bx7Var2.n;
                        String str3 = (num3 == null || (valueOf = String.valueOf(num3.intValue())) == null) ? "" : valueOf;
                        String str4 = bx7Var2.k;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = dh8Var.l;
                        boolean z = bx7Var2.r;
                        fy7 fy7Var3 = bx7Var2.g;
                        l98.k(fy7Var, fy7Var2, str2, str3, intValue3, str5, fy7Var3 != null ? fy7Var3.h : null, fy7Var2 != null ? fy7Var2.h : null, z, str6, f0, bx7Var2.s, null, null, 0L, 0L, av8Var2, 0, 6, 61440);
                    }
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    xtc e = bkh.e(utcVar, 136.0f);
                    boolean i3 = av8Var3.i(dh8Var);
                    Object O = av8Var3.O();
                    if (i3 || O == a99Var) {
                        final int i4 = r6 ? 1 : 0;
                        O = new Function1() { // from class: ch8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int s;
                                int s2;
                                int i5 = i4;
                                dh8 dh8Var2 = dh8Var;
                                switch (i5) {
                                    case 0:
                                        Context context = (Context) obj4;
                                        context.getClass();
                                        AttackMomentumGraph attackMomentumGraph = new AttackMomentumGraph(context, null, 6);
                                        attackMomentumGraph.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                        if (hkg.c0(context)) {
                                            Context context2 = attackMomentumGraph.getContext();
                                            context2.getClass();
                                            s = ao2.s(8, context2);
                                        } else {
                                            Context context3 = attackMomentumGraph.getContext();
                                            context3.getClass();
                                            s = ao2.s(26, context3);
                                        }
                                        Context context4 = attackMomentumGraph.getContext();
                                        context4.getClass();
                                        if (hkg.c0(context4)) {
                                            Context context5 = attackMomentumGraph.getContext();
                                            context5.getClass();
                                            s2 = ao2.s(26, context5);
                                        } else {
                                            Context context6 = attackMomentumGraph.getContext();
                                            context6.getClass();
                                            s2 = ao2.s(8, context6);
                                        }
                                        ViewGroup.LayoutParams layoutParams = attackMomentumGraph.getLayoutParams();
                                        if (layoutParams == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            break;
                                        } else {
                                            Context context7 = attackMomentumGraph.getContext();
                                            context7.getClass();
                                            int s3 = ao2.s(28, context7);
                                            Context context8 = attackMomentumGraph.getContext();
                                            context8.getClass();
                                            attackMomentumGraph.setPadding(s, s3, s2, ao2.s(28, context8));
                                            attackMomentumGraph.setLayoutParams(layoutParams);
                                            Event event = dh8Var2.q;
                                            List list = dh8Var2.o;
                                            if (list == null) {
                                                list = km5.a;
                                            }
                                            attackMomentumGraph.c(event, new EventGraphResponse(list, null, null, null, null), dh8Var2.n, Sports.FOOTBALL, false);
                                            break;
                                        }
                                    default:
                                        Context context9 = (Context) obj4;
                                        context9.getClass();
                                        AttackMomentumGraph attackMomentumGraph2 = new AttackMomentumGraph(context9, null, 6);
                                        attackMomentumGraph2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                        ViewGroup.LayoutParams layoutParams2 = attackMomentumGraph2.getLayoutParams();
                                        if (layoutParams2 == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            break;
                                        } else {
                                            Context context10 = attackMomentumGraph2.getContext();
                                            context10.getClass();
                                            int s4 = ao2.s(26, context10);
                                            Context context11 = attackMomentumGraph2.getContext();
                                            context11.getClass();
                                            int s5 = ao2.s(28, context11);
                                            Context context12 = attackMomentumGraph2.getContext();
                                            context12.getClass();
                                            int s6 = ao2.s(8, context12);
                                            Context context13 = attackMomentumGraph2.getContext();
                                            context13.getClass();
                                            attackMomentumGraph2.setPadding(s4, s5, s6, ao2.s(28, context13));
                                            attackMomentumGraph2.setLayoutParams(layoutParams2);
                                            Event event2 = dh8Var2.q;
                                            List list2 = dh8Var2.o;
                                            if (list2 == null) {
                                                list2 = km5.a;
                                            }
                                            attackMomentumGraph2.c(event2, new EventGraphResponse(list2, null, null, null, null), dh8Var2.n, Sports.FOOTBALL, false);
                                            break;
                                        }
                                }
                                return null;
                            }
                        };
                        av8Var3.n0(O);
                    }
                    td4.a((Function1) O, e, null, av8Var3, 48, 4);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                of3 of3Var4 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    xtc e2 = bkh.e(utcVar, 136.0f);
                    boolean i5 = av8Var4.i(dh8Var);
                    Object O2 = av8Var4.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new Function1() { // from class: ch8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int s;
                                int s2;
                                int i52 = i2;
                                dh8 dh8Var2 = dh8Var;
                                switch (i52) {
                                    case 0:
                                        Context context = (Context) obj4;
                                        context.getClass();
                                        AttackMomentumGraph attackMomentumGraph = new AttackMomentumGraph(context, null, 6);
                                        attackMomentumGraph.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                        if (hkg.c0(context)) {
                                            Context context2 = attackMomentumGraph.getContext();
                                            context2.getClass();
                                            s = ao2.s(8, context2);
                                        } else {
                                            Context context3 = attackMomentumGraph.getContext();
                                            context3.getClass();
                                            s = ao2.s(26, context3);
                                        }
                                        Context context4 = attackMomentumGraph.getContext();
                                        context4.getClass();
                                        if (hkg.c0(context4)) {
                                            Context context5 = attackMomentumGraph.getContext();
                                            context5.getClass();
                                            s2 = ao2.s(26, context5);
                                        } else {
                                            Context context6 = attackMomentumGraph.getContext();
                                            context6.getClass();
                                            s2 = ao2.s(8, context6);
                                        }
                                        ViewGroup.LayoutParams layoutParams = attackMomentumGraph.getLayoutParams();
                                        if (layoutParams == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            break;
                                        } else {
                                            Context context7 = attackMomentumGraph.getContext();
                                            context7.getClass();
                                            int s3 = ao2.s(28, context7);
                                            Context context8 = attackMomentumGraph.getContext();
                                            context8.getClass();
                                            attackMomentumGraph.setPadding(s, s3, s2, ao2.s(28, context8));
                                            attackMomentumGraph.setLayoutParams(layoutParams);
                                            Event event = dh8Var2.q;
                                            List list = dh8Var2.o;
                                            if (list == null) {
                                                list = km5.a;
                                            }
                                            attackMomentumGraph.c(event, new EventGraphResponse(list, null, null, null, null), dh8Var2.n, Sports.FOOTBALL, false);
                                            break;
                                        }
                                    default:
                                        Context context9 = (Context) obj4;
                                        context9.getClass();
                                        AttackMomentumGraph attackMomentumGraph2 = new AttackMomentumGraph(context9, null, 6);
                                        attackMomentumGraph2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                        ViewGroup.LayoutParams layoutParams2 = attackMomentumGraph2.getLayoutParams();
                                        if (layoutParams2 == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            break;
                                        } else {
                                            Context context10 = attackMomentumGraph2.getContext();
                                            context10.getClass();
                                            int s4 = ao2.s(26, context10);
                                            Context context11 = attackMomentumGraph2.getContext();
                                            context11.getClass();
                                            int s5 = ao2.s(28, context11);
                                            Context context12 = attackMomentumGraph2.getContext();
                                            context12.getClass();
                                            int s6 = ao2.s(8, context12);
                                            Context context13 = attackMomentumGraph2.getContext();
                                            context13.getClass();
                                            attackMomentumGraph2.setPadding(s4, s5, s6, ao2.s(28, context13));
                                            attackMomentumGraph2.setLayoutParams(layoutParams2);
                                            Event event2 = dh8Var2.q;
                                            List list2 = dh8Var2.o;
                                            if (list2 == null) {
                                                list2 = km5.a;
                                            }
                                            attackMomentumGraph2.c(event2, new EventGraphResponse(list2, null, null, null, null), dh8Var2.n, Sports.FOOTBALL, false);
                                            break;
                                        }
                                }
                                return null;
                            }
                        };
                        av8Var4.n0(O2);
                    }
                    td4.a((Function1) O2, e2, null, av8Var4, 48, 4);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
