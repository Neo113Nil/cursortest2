package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dgk implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ l3l b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function0 e;

    public dgk(List list, l3l l3lVar, boolean z, Function1 function1, Function0 function0) {
        this.a = list;
        this.b = l3lVar;
        this.c = z;
        this.d = function1;
        this.e = function0;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        av8 av8Var;
        utc utcVar;
        boolean z;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        l3l l3lVar = this.b;
        gv9 gv9Var = l3lVar.d;
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var2 = (av8) of3Var;
        if (av8Var2.T(i & 1, (i & 147) != 146)) {
            ulf ulfVar = (ulf) this.a.get(intValue);
            av8Var2.d0(-65242647);
            int indexOf = gv9Var.indexOf(ulfVar);
            boolean z2 = this.c;
            boolean z3 = z2 && indexOf == b.i(gv9Var);
            boolean z4 = ulfVar instanceof slf;
            utc utcVar2 = utc.a;
            if (z4) {
                av8Var2.d0(-65008164);
                slf slfVar = (slf) ulfVar;
                boolean z5 = !z2;
                xtc a = xpa.a(xpaVar, utcVar2, 7);
                boolean z6 = this.c;
                utcVar = utcVar2;
                pea.l(a, z5, slfVar, z6 && indexOf == 0, z3, z6, av8Var2, 0);
                z = z3;
                av8Var = av8Var2;
                if (!slfVar.g || l3lVar.g == null || z2) {
                    av8Var.d0(-64122804);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-64488790);
                    xtc a2 = xpa.a(xpaVar, utcVar, 7);
                    boolean z7 = l3lVar.f;
                    Function1 function1 = this.d;
                    boolean g = av8Var.g(function1) | av8Var.i(l3lVar);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = new kmj(2, function1, l3lVar);
                        av8Var.n0(O);
                    }
                    wca.j(0, av8Var, a2, (Function0) O, z7);
                    av8Var.s(false);
                }
                av8Var.s(false);
            } else {
                av8Var = av8Var2;
                utcVar = utcVar2;
                z = z3;
                if (!(ulfVar instanceof tlf)) {
                    throw dmi.h(av8Var, -417741062, false);
                }
                av8Var.d0(-64026022);
                sha.n((tlf) ulfVar, this.e, this.c, xpa.a(xpaVar, utcVar, 7), av8Var, 0);
                av8Var.s(false);
            }
            if (z) {
                av8Var.d0(-63485940);
                av8Var.s(false);
            } else {
                av8Var.d0(-63673335);
                tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 6, 0L, lz.D(R.color.surface_1, av8Var), av8Var, xpa.a(xpaVar, utcVar, 7));
                av8Var.s(false);
            }
            av8Var.s(false);
        } else {
            av8Var2.W();
        }
        return Unit.a;
    }
}
