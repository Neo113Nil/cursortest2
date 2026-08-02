package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class srh implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ lrh c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public srh(List list, Object obj, lrh lrhVar, Function1 function1, boolean z, boolean z2) {
        this.a = list;
        this.b = obj;
        this.c = lrhVar;
        this.d = function1;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            vt2 vt2Var = (vt2) this.a.get(intValue);
            av8Var.d0(-791410537);
            String str = vt2Var.b;
            boolean c = Intrinsics.c(vt2Var.a, this.b);
            boolean z = vt2Var.c;
            lrh lrhVar = vt2Var.f;
            if (lrhVar == null) {
                lrhVar = this.c;
            }
            lrh lrhVar2 = lrhVar;
            ct8 ct8Var = vt2Var.d;
            ct8 ct8Var2 = vt2Var.e;
            tt2 tt2Var = vt2Var.g;
            boolean g = av8Var.g(vt2Var);
            Function1 function1 = this.d;
            boolean g2 = g | av8Var.g(function1);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                O = new pi(29, vt2Var, function1);
                av8Var.n0(O);
            }
            qha.f(str, c, lrhVar2, (Function0) O, null, z, ct8Var, ct8Var2, this.e, this.f, null, tt2Var, av8Var, 0, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
