package defpackage;

import androidx.activity.ComponentActivity;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ub7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ub7(rxb rxbVar, boolean z, Integer num, r13 r13Var, String str, String str2, Function1 function1, xtc xtcVar, wla wlaVar, int i) {
        this.e = rxbVar;
        this.b = z;
        this.f = num;
        this.g = r13Var;
        this.c = str;
        this.h = str2;
        this.d = function1;
        this.i = xtcVar;
        this.j = wlaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                e1d e1dVar = (e1d) obj8;
                e1d e1dVar2 = (e1d) obj7;
                wb7 wb7Var = (wb7) obj5;
                k7d k7dVar = (k7d) obj4;
                ComponentActivity componentActivity = (ComponentActivity) obj3;
                e1d e1dVar3 = (e1d) obj6;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    int i2 = ((pb7) e1dVar.getValue()).c;
                    int i3 = ((pb7) e1dVar.getValue()).d;
                    ev6 ev6Var = ((pb7) e1dVar.getValue()).f;
                    boolean z = this.b;
                    i9a.f(i2, i3, yqo.H(-1371787070, av8Var, new o87(this.c, z, e1dVar, wb7Var, k7dVar, componentActivity)), yqo.H(1858212995, av8Var, new ff7(e1dVar, this.d, wb7Var, componentActivity, e1dVar3, 8)), null, 0L, false, ev6Var != null || z, false, ((Boolean) e1dVar2.getValue()).booleanValue() ? 8.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, av8Var, 3456, 3440);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                l98.y((rxb) obj8, this.b, (Integer) obj7, (r13) obj6, this.c, (String) obj5, this.d, (xtc) obj4, (wla) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ub7(boolean z, e1d e1dVar, e1d e1dVar2, String str, wb7 wb7Var, k7d k7dVar, ComponentActivity componentActivity, Function1 function1, e1d e1dVar3) {
        this.b = z;
        this.e = e1dVar;
        this.f = e1dVar2;
        this.c = str;
        this.h = wb7Var;
        this.i = k7dVar;
        this.j = componentActivity;
        this.d = function1;
        this.g = e1dVar3;
    }
}
