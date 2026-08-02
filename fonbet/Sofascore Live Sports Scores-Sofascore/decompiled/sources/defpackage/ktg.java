package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ktg implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ otg b;

    public /* synthetic */ ktg(otg otgVar, int i) {
        this.a = i;
        this.b = otgVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String valueOf;
        int i = this.a;
        a99 a99Var = nf3.a;
        final otg otgVar = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    String str2 = otgVar.l;
                    bx7 bx7Var = otgVar.k;
                    l98.r(str2, bx7Var.c, bx7Var.b, bx7Var.d, av8Var, 0);
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
                    bx7 bx7Var2 = otgVar.k;
                    fy7 fy7Var = bx7Var2.g;
                    fy7 fy7Var2 = bx7Var2.h;
                    if (fy7Var != null && fy7Var2 != null) {
                        Integer num = bx7Var2.m;
                        if (num == null || (str = String.valueOf(num.intValue())) == null) {
                            str = "";
                        }
                        Integer num2 = bx7Var2.q;
                        int intValue3 = num2 != null ? num2.intValue() : 0;
                        Integer num3 = bx7Var2.n;
                        String str3 = (num3 == null || (valueOf = String.valueOf(num3.intValue())) == null) ? "" : valueOf;
                        String str4 = bx7Var2.k;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = otgVar.l;
                        boolean z = bx7Var2.r;
                        fy7 fy7Var3 = bx7Var2.g;
                        l98.k(fy7Var, fy7Var2, str, str3, intValue3, str5, fy7Var3 != null ? fy7Var3.h : null, fy7Var2 != null ? fy7Var2.h : null, z, str6, null, bx7Var2.s, null, null, 0L, 0L, av8Var2, 0, 0, 62464);
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
                    boolean i3 = av8Var3.i(otgVar);
                    Object O = av8Var3.O();
                    if (i3 || O == a99Var) {
                        final int i4 = r4 ? 1 : 0;
                        O = new Function1() { // from class: ntg
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i5 = i4;
                                otg otgVar2 = otgVar;
                                Context context = (Context) obj4;
                                switch (i5) {
                                    case 0:
                                        context.getClass();
                                        String str7 = otgVar2.l;
                                        if (!Intrinsics.c(str7, Sports.AMERICAN_FOOTBALL)) {
                                            if (Intrinsics.c(str7, Sports.BASKETBALL)) {
                                                es1 es1Var = new es1(context);
                                                es1Var.j(otgVar2.p, otgVar2.o, otgVar2.n, false, true);
                                                return es1Var;
                                            }
                                            i69 i69Var = new i69(context);
                                            i69Var.j(otgVar2.p, otgVar2.o, otgVar2.n, false, true);
                                            return i69Var;
                                        }
                                        h8l h8lVar = new h8l(context);
                                        js2 js2Var = h8lVar.d;
                                        ((ConstraintLayout) js2Var.j).setBackground(null);
                                        ((SegmentedButtonsView) js2Var.n).setBackgroundColor(0);
                                        Event event = otgVar2.p;
                                        EventGraphResponse eventGraphResponse = otgVar2.o;
                                        List list = otgVar2.n;
                                        if (list == null) {
                                            list = km5.a;
                                        }
                                        h8lVar.j(event, eventGraphResponse, list, false, true);
                                        return h8lVar;
                                    default:
                                        context.getClass();
                                        String str8 = otgVar2.l;
                                        if (Intrinsics.c(str8, Sports.AMERICAN_FOOTBALL)) {
                                            h8l h8lVar2 = new h8l(context);
                                            js2 js2Var2 = h8lVar2.d;
                                            ((ConstraintLayout) js2Var2.j).setBackground(null);
                                            ((SegmentedButtonsView) js2Var2.n).setBackgroundColor(0);
                                            h8lVar2.setTabButtonStyle(x1h.f);
                                            Event event2 = otgVar2.p;
                                            EventGraphResponse eventGraphResponse2 = otgVar2.o;
                                            List list2 = otgVar2.n;
                                            if (list2 == null) {
                                                list2 = km5.a;
                                            }
                                            h8lVar2.j(event2, eventGraphResponse2, list2, false, true);
                                            return h8lVar2;
                                        }
                                        if (Intrinsics.c(str8, Sports.BASKETBALL)) {
                                            es1 es1Var2 = new es1(context);
                                            jy4 jy4Var = es1Var2.d;
                                            jy4Var.a.setBackground(null);
                                            jy4Var.a.setBackgroundTintList(ColorStateList.valueOf(0));
                                            es1Var2.j(otgVar2.p, otgVar2.o, otgVar2.n, false, true);
                                            return es1Var2;
                                        }
                                        i69 i69Var2 = new i69(context);
                                        jy4 jy4Var2 = i69Var2.d;
                                        jy4Var2.a.setBackground(null);
                                        jy4Var2.a.setBackgroundTintList(ColorStateList.valueOf(0));
                                        i69Var2.j(otgVar2.p, otgVar2.o, otgVar2.n, false, true);
                                        return i69Var2;
                                }
                            }
                        };
                        av8Var3.n0(O);
                    }
                    td4.a((Function1) O, null, null, av8Var3, 0, 6);
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
                    boolean i5 = av8Var4.i(otgVar);
                    Object O2 = av8Var4.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new Function1() { // from class: ntg
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i52 = i2;
                                otg otgVar2 = otgVar;
                                Context context = (Context) obj4;
                                switch (i52) {
                                    case 0:
                                        context.getClass();
                                        String str7 = otgVar2.l;
                                        if (!Intrinsics.c(str7, Sports.AMERICAN_FOOTBALL)) {
                                            if (Intrinsics.c(str7, Sports.BASKETBALL)) {
                                                es1 es1Var = new es1(context);
                                                es1Var.j(otgVar2.p, otgVar2.o, otgVar2.n, false, true);
                                                return es1Var;
                                            }
                                            i69 i69Var = new i69(context);
                                            i69Var.j(otgVar2.p, otgVar2.o, otgVar2.n, false, true);
                                            return i69Var;
                                        }
                                        h8l h8lVar = new h8l(context);
                                        js2 js2Var = h8lVar.d;
                                        ((ConstraintLayout) js2Var.j).setBackground(null);
                                        ((SegmentedButtonsView) js2Var.n).setBackgroundColor(0);
                                        Event event = otgVar2.p;
                                        EventGraphResponse eventGraphResponse = otgVar2.o;
                                        List list = otgVar2.n;
                                        if (list == null) {
                                            list = km5.a;
                                        }
                                        h8lVar.j(event, eventGraphResponse, list, false, true);
                                        return h8lVar;
                                    default:
                                        context.getClass();
                                        String str8 = otgVar2.l;
                                        if (Intrinsics.c(str8, Sports.AMERICAN_FOOTBALL)) {
                                            h8l h8lVar2 = new h8l(context);
                                            js2 js2Var2 = h8lVar2.d;
                                            ((ConstraintLayout) js2Var2.j).setBackground(null);
                                            ((SegmentedButtonsView) js2Var2.n).setBackgroundColor(0);
                                            h8lVar2.setTabButtonStyle(x1h.f);
                                            Event event2 = otgVar2.p;
                                            EventGraphResponse eventGraphResponse2 = otgVar2.o;
                                            List list2 = otgVar2.n;
                                            if (list2 == null) {
                                                list2 = km5.a;
                                            }
                                            h8lVar2.j(event2, eventGraphResponse2, list2, false, true);
                                            return h8lVar2;
                                        }
                                        if (Intrinsics.c(str8, Sports.BASKETBALL)) {
                                            es1 es1Var2 = new es1(context);
                                            jy4 jy4Var = es1Var2.d;
                                            jy4Var.a.setBackground(null);
                                            jy4Var.a.setBackgroundTintList(ColorStateList.valueOf(0));
                                            es1Var2.j(otgVar2.p, otgVar2.o, otgVar2.n, false, true);
                                            return es1Var2;
                                        }
                                        i69 i69Var2 = new i69(context);
                                        jy4 jy4Var2 = i69Var2.d;
                                        jy4Var2.a.setBackground(null);
                                        jy4Var2.a.setBackgroundTintList(ColorStateList.valueOf(0));
                                        i69Var2.j(otgVar2.p, otgVar2.o, otgVar2.n, false, true);
                                        return i69Var2;
                                }
                            }
                        };
                        av8Var4.n0(O2);
                    }
                    td4.a((Function1) O2, null, null, av8Var4, 0, 6);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
