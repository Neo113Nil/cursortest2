package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bxl implements ct8 {
    public final /* synthetic */ float a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function1 d;

    public bxl(float f, Function0 function0, List list, Function1 function1) {
        this.a = f;
        this.b = function0;
        this.c = list;
        this.d = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        ((v23) obj).getClass();
        if ((intValue & 17) == 16) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        av8 av8Var2 = (av8) of3Var;
        ViewParent parent = ((View) av8Var2.k(nz.f)).getParent();
        e25 e25Var = parent instanceof e25 ? (e25) parent : null;
        if (e25Var != null) {
            Window window = e25Var.getWindow();
            bka bkaVar = new bka(e25Var.getWindow().getDecorView());
            int i = Build.VERSION.SDK_INT;
            pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
            aalVar.C(false);
            aalVar.B(false);
        }
        p4h p4hVar = ww9.d;
        kv1 kv1Var = uxf.p;
        xtc g = bkh.g(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.a, 1);
        u23 a = t23.a(p4hVar, kv1Var, av8Var2, 54);
        int G = z8e.G(av8Var2);
        aee m = av8Var2.m();
        xtc C = fqj.C(av8Var2, g);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8Var2.h0();
        if (av8Var2.S) {
            av8Var2.l(zg3Var);
        } else {
            av8Var2.q0();
        }
        waa.K(av8Var2, a, hf3.g);
        waa.K(av8Var2, m, hf3.f);
        f50 f50Var = hf3.j;
        if (av8Var2.S || !Intrinsics.c(av8Var2.O(), Integer.valueOf(G))) {
            mz1.t(G, av8Var2, G, f50Var);
        }
        waa.K(av8Var2, C, hf3.d);
        s7m.c(6, av8Var2, null, this.b);
        s7m.b(0, av8Var2, bkh.d(new goa(1.0f, false), 1.0f), this.c, this.d);
        av8Var2.s(true);
        return Unit.a;
    }
}
