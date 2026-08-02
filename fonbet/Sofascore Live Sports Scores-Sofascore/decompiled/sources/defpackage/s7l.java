package defpackage;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7l implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ s7l(g6b g6bVar, ct8 ct8Var, ct8 ct8Var2, ct8 ct8Var3, Function2 function2, u0 u0Var, f0 f0Var, q qVar, boolean z, t0 t0Var, Function0 function0) {
        this.c = g6bVar;
        this.d = ct8Var;
        this.e = ct8Var2;
        this.f = ct8Var3;
        this.g = function2;
        this.h = u0Var;
        this.i = f0Var;
        this.j = qVar;
        this.b = z;
        this.k = t0Var;
        this.l = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        Object obj11 = this.d;
        Object obj12 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                jca.w(this.b, (String) obj12, (jfj) obj7, (jfj) obj6, (String) obj11, (String) obj10, (jfj) obj5, (jfj) obj4, (String) obj9, (String) obj8, (vy8) obj3, (of3) obj, K);
                return Unit.a;
            default:
                Context context = (Context) obj;
                s sVar = (s) obj2;
                context.getClass();
                sVar.getClass();
                return new g1(context, sVar, (g6b) obj12, (ct8) obj11, (ct8) obj10, (ct8) obj9, (Function2) obj8, (ft8) obj7, (f0) obj6, (q) obj5, this.b, (t0) obj4, (Function0) obj3);
        }
    }

    public /* synthetic */ s7l(boolean z, String str, jfj jfjVar, jfj jfjVar2, String str2, String str3, jfj jfjVar3, jfj jfjVar4, String str4, String str5, vy8 vy8Var, int i) {
        this.b = z;
        this.c = str;
        this.h = jfjVar;
        this.i = jfjVar2;
        this.d = str2;
        this.e = str3;
        this.j = jfjVar3;
        this.k = jfjVar4;
        this.f = str4;
        this.g = str5;
        this.l = vy8Var;
    }
}
