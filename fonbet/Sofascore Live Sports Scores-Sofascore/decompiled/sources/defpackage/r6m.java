package defpackage;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.ironsource.V2;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r6m implements ct8 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;

    public r6m(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function0 function0;
        Function2 function2;
        boolean z;
        utc utcVar;
        av8 av8Var;
        String str;
        Function2 function22 = (Function2) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        function22.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).i(function22) ? 4 : 2;
        }
        int i = intValue;
        if ((i & 19) == 18) {
            av8 av8Var2 = (av8) of3Var;
            if (av8Var2.D()) {
                av8Var2.W();
                return Unit.a;
            }
        }
        utc utcVar2 = utc.a;
        xtc d = bkh.d(utcVar2, 1.0f);
        lv1 lv1Var = uxf.m;
        String str2 = this.a;
        Function0 function02 = this.b;
        l8g a = k8g.a(ww9.b, lv1Var, of3Var, 48);
        int G = z8e.G(of3Var);
        av8 av8Var3 = (av8) of3Var;
        aee m = av8Var3.m();
        xtc C = fqj.C(of3Var, d);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8Var3.h0();
        if (av8Var3.S) {
            av8Var3.l(zg3Var);
        } else {
            av8Var3.q0();
        }
        f50 f50Var = hf3.g;
        waa.K(of3Var, a, f50Var);
        ff3 ff3Var = hf3.f;
        waa.K(of3Var, m, ff3Var);
        f50 f50Var2 = hf3.j;
        if (av8Var3.S || !Intrinsics.c(av8Var3.O(), Integer.valueOf(G))) {
            mz1.t(G, av8Var3, G, f50Var2);
        }
        f50 f50Var3 = hf3.d;
        waa.K(of3Var, C, f50Var3);
        ImageVector search = SearchKt.getSearch(Icons.INSTANCE.getDefault());
        long j = l3m.g;
        kq9.b(search, null, bkh.l(l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 20.0f), j, of3Var, V2.b.f, 0);
        goa goaVar = new goa(1.0f, true);
        k1c c = e12.c(uxf.f, false);
        int G2 = z8e.G(of3Var);
        aee m2 = av8Var3.m();
        xtc C2 = fqj.C(of3Var, goaVar);
        av8Var3.h0();
        if (av8Var3.S) {
            av8Var3.l(zg3Var);
        } else {
            av8Var3.q0();
        }
        waa.K(of3Var, c, f50Var);
        waa.K(of3Var, m2, ff3Var);
        if (av8Var3.S || !Intrinsics.c(av8Var3.O(), Integer.valueOf(G2))) {
            mz1.t(G2, av8Var3, G2, f50Var2);
        }
        waa.K(of3Var, C2, f50Var3);
        av8Var3.d0(1086716963);
        if (str2.length() == 0) {
            str = str2;
            utcVar = utcVar2;
            function2 = function22;
            z = false;
            function0 = function02;
            av8Var = av8Var3;
            udj.b(oea.v(R.string.blaze_search_hint, of3Var), null, j, v8a.v(14), 0L, 0L, 0, false, 0, 0, null, of3Var, 3456, 0, 131058);
            of3Var = of3Var;
        } else {
            function0 = function02;
            function2 = function22;
            z = false;
            utcVar = utcVar2;
            av8Var = av8Var3;
            str = str2;
        }
        av8Var.s(z);
        function2.invoke(of3Var, Integer.valueOf(i & 14));
        av8Var.s(true);
        av8Var.d0(1782949144);
        if (str.length() > 0) {
            xtc l = bkh.l(utcVar, 32.0f);
            qzl.a.getClass();
            ao2.h(function0, l, false, null, qzl.c, of3Var, 196656);
        }
        av8Var.s(z);
        av8Var.s(true);
        return Unit.a;
    }
}
