package defpackage;

import android.app.Activity;
import android.webkit.WebView;
import com.facebook.appevents.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class rc3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ rc3(xxi xxiVar, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, xtc xtcVar, int i, int i2) {
        this.a = 3;
        this.c = xxiVar;
        this.d = function1;
        this.e = function12;
        this.f = function0;
        this.g = function02;
        this.h = function03;
        this.i = xtcVar;
        this.b = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int e0;
        int e02;
        int i2;
        uif uifVar;
        Integer num;
        int intValue;
        int e03;
        int c;
        int i3 = this.a;
        int i4 = this.b;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                ((tc3) obj9).i(this.d, this.e, this.f, this.g, this.h, this.i, (of3) obj, aba.K(i4) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                r4a.d((asg) obj9, (o8d) obj8, (xtc) obj7, (io) obj6, (Function1) obj5, (Function1) obj4, (Function2) obj3, (of3) obj, aba.K(i4 | 1));
                break;
            case 2:
                final w8l w8lVar = (w8l) obj9;
                Function2 function2 = (Function2) obj5;
                frg frgVar = (frg) obj4;
                Function2 function22 = (Function2) obj3;
                final yji yjiVar = (yji) obj;
                an3 an3Var = (an3) obj2;
                final int h = an3.h(an3Var.a);
                final int g = an3.g(an3Var.a);
                long a = an3.a(an3Var.a, 0, 0, 0, 0, 10);
                int d = w8lVar.d(yjiVar, yjiVar.getLayoutDirection());
                int b = w8lVar.b(yjiVar, yjiVar.getLayoutDirection());
                boolean z = true;
                int c2 = w8lVar.c(yjiVar);
                final qhe J = ((g1c) CollectionsKt.Y(yjiVar.t(grg.a, (Function2) obj8))).J(a);
                int i5 = (-d) - b;
                int i6 = -c2;
                final qhe J2 = ((g1c) CollectionsKt.Y(yjiVar.t(grg.c, (Function2) obj7))).J(cn3.i(i5, i6, a));
                final qhe J3 = ((g1c) CollectionsKt.Y(yjiVar.t(grg.d, (Function2) obj6))).J(cn3.i(i5, i6, a));
                int i7 = J3.a;
                if (i7 == 0 && J3.b == 0) {
                    uifVar = null;
                } else {
                    int i8 = J3.b;
                    if (i4 == 0) {
                        i = d;
                        if (yjiVar.getLayoutDirection() == ema.a) {
                            e0 = yjiVar.e0(16.0f);
                            i2 = e0 + i;
                        } else {
                            e02 = yjiVar.e0(16.0f);
                            i2 = ((h - e02) - i7) - b;
                        }
                    } else {
                        i = d;
                        if (i4 != 2 && i4 != 3) {
                            i2 = (((h - i7) + i) - b) / 2;
                        } else if (yjiVar.getLayoutDirection() == ema.a) {
                            e02 = yjiVar.e0(16.0f);
                            i2 = ((h - e02) - i7) - b;
                        } else {
                            e0 = yjiVar.e0(16.0f);
                            i2 = e0 + i;
                        }
                    }
                    uifVar = new uif(i2, i8, 3);
                }
                final qhe J4 = ((g1c) CollectionsKt.Y(yjiVar.t(grg.e, function2))).J(a);
                int i9 = 0;
                if (J4.a != 0 || J4.b != 0) {
                    z = false;
                }
                if (uifVar != null) {
                    int i10 = uifVar.c;
                    if (z || i4 == 3) {
                        e03 = yjiVar.e0(16.0f) + i10;
                        c = w8lVar.c(yjiVar);
                    } else {
                        e03 = J4.b + i10;
                        c = yjiVar.e0(16.0f);
                    }
                    num = Integer.valueOf(c + e03);
                } else {
                    num = null;
                }
                int i11 = J2.b;
                if (i11 != 0) {
                    if (num != null) {
                        intValue = num.intValue();
                    } else {
                        Integer valueOf = !z ? Integer.valueOf(J4.b) : null;
                        intValue = valueOf != null ? valueOf.intValue() : w8lVar.c(yjiVar);
                    }
                    i9 = intValue + i11;
                }
                final int i12 = i9;
                d5a d5aVar = new d5a(w8lVar, yjiVar);
                ((eoh) frgVar.a).setValue(new t3e(l98.L(d5aVar, yjiVar.getLayoutDirection()), (J.a == 0 && J.b == 0) ? d5aVar.d() : yjiVar.C0(J.b), l98.K(d5aVar, yjiVar.getLayoutDirection()), z ? d5aVar.a() : yjiVar.C0(J4.b)));
                final qhe J5 = ((g1c) CollectionsKt.Y(yjiVar.t(grg.b, function22))).J(a);
                final Integer num2 = num;
                final uif uifVar2 = uifVar;
                break;
            case 3:
                ((Integer) obj2).getClass();
                aik.p((xxi) obj9, (Function1) obj8, (Function1) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1), this.b);
                break;
            case 4:
                ((Integer) obj2).getClass();
                xzj.c((yyj) obj9, (tee) obj8, (h4d) obj7, (wla) obj6, (Function0) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(i4 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                j.g((Activity) obj9, (WebView) obj8, this.b, (Function1) obj7, (Function0) obj6, (ns8) obj5, (t) obj4, (Function0) obj3, (of3) obj, 12582913);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rc3(w8l w8lVar, Function2 function2, Function2 function22, Function2 function23, int i, Function2 function24, frg frgVar, Function2 function25) {
        this.a = 2;
        this.c = w8lVar;
        this.d = function2;
        this.e = function22;
        this.f = function23;
        this.b = i;
        this.g = function24;
        this.h = frgVar;
        this.i = function25;
    }

    public /* synthetic */ rc3(Activity activity, WebView webView, int i, Function1 function1, Function0 function0, ns8 ns8Var, t tVar, Function0 function02, int i2) {
        this.a = 5;
        this.c = activity;
        this.d = webView;
        this.b = i;
        this.e = function1;
        this.f = function0;
        this.g = ns8Var;
        this.h = tVar;
        this.i = function02;
    }

    public /* synthetic */ rc3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.b = i;
    }
}
