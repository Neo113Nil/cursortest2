package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e;
import com.sofascore.model.mvvm.model.StatusKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class qn6 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ qn6(e eVar, Function0 function0, xtc xtcVar, ht8 ht8Var, ft8 ft8Var, gt8 gt8Var, ht8 ht8Var2, q qVar, Function0 function02, int i) {
        this.b = eVar;
        this.f = function0;
        this.h = xtcVar;
        this.c = ht8Var;
        this.d = ft8Var;
        this.e = gt8Var;
        this.i = ht8Var2;
        this.j = qVar;
        this.g = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.g;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        Object obj9 = this.h;
        Object obj10 = this.f;
        Object obj11 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                tol.e((String) obj11, (String) obj8, (String) obj7, (Function0) obj10, (Function0) obj3, (xtc) obj9, (String) obj6, (xqh) obj5, (xqh) obj4, (of3) obj, aba.K(12582913));
                break;
            case 1:
                String str = (String) obj11;
                jfj jfjVar = (jfj) obj10;
                jfj jfjVar2 = (jfj) obj3;
                String str2 = (String) obj8;
                String str3 = (String) obj7;
                jfj jfjVar3 = (jfj) obj9;
                jfj jfjVar4 = (jfj) obj5;
                String str4 = (String) obj6;
                String str5 = (String) obj4;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    jca.w(Intrinsics.c(str, StatusKt.STATUS_IN_PROGRESS) || Intrinsics.c(str, StatusKt.STATUS_FINISHED), str, jfjVar, jfjVar2, str2, str3, jfjVar3, jfjVar4, str4, str5, null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                s.l((e) obj11, (Function0) obj10, (xtc) obj9, (ht8) obj8, (ft8) obj7, (gt8) obj6, (ht8) obj5, (q) obj4, (Function0) obj3, (of3) obj, 385);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qn6(String str, jfj jfjVar, jfj jfjVar2, String str2, String str3, jfj jfjVar3, jfj jfjVar4, String str4, String str5) {
        this.b = str;
        this.f = jfjVar;
        this.g = jfjVar2;
        this.c = str2;
        this.d = str3;
        this.h = jfjVar3;
        this.i = jfjVar4;
        this.e = str4;
        this.j = str5;
    }

    public /* synthetic */ qn6(String str, String str2, String str3, Function0 function0, Function0 function02, xtc xtcVar, String str4, xqh xqhVar, xqh xqhVar2, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = function0;
        this.g = function02;
        this.h = xtcVar;
        this.e = str4;
        this.i = xqhVar;
        this.j = xqhVar2;
    }
}
