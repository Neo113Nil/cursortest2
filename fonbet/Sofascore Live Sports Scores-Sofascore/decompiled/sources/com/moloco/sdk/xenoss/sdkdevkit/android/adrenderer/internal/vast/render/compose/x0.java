package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.a99;
import defpackage.av8;
import defpackage.b7k;
import defpackage.ct8;
import defpackage.e7k;
import defpackage.lfj;
import defpackage.n8g;
import defpackage.nf3;
import defpackage.of3;
import defpackage.v8a;
import defpackage.vdj;
import defpackage.wg8;
import defpackage.xtc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x0 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public x0(String str, Integer num, long j) {
        this.a = 2;
        this.b = str;
        this.d = num;
        this.c = j;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a99 a99Var = nf3.a;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                xtc xtcVar = (xtc) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Number) obj3).intValue();
                Function0 function0 = (Function0) obj4;
                xtcVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    av8 av8Var = (av8) of3Var;
                    if (av8Var.D()) {
                        av8Var.W();
                        break;
                    }
                }
                av8 av8Var2 = (av8) of3Var;
                av8Var2.e0(-1483951655);
                boolean g = av8Var2.g(function0) | av8Var2.g(null);
                Object O = av8Var2.O();
                if (g || O == a99Var) {
                    O = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f(1, function0);
                    av8Var2.n0(O);
                }
                av8Var2.s(false);
                com.facebook.appevents.g.d(xtcVar, this.b, this.c, (Function0) O, av8Var2, intValue & 14);
            case 1:
                xtc xtcVar2 = (xtc) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Function0 function02 = (Function0) obj4;
                xtcVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar2) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.D()) {
                        av8Var3.W();
                        break;
                    }
                }
                av8 av8Var4 = (av8) of3Var2;
                av8Var4.e0(-1483932583);
                boolean g2 = av8Var4.g(function02) | av8Var4.g(null);
                Object O2 = av8Var4.O();
                if (g2 || O2 == a99Var) {
                    O2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f(2, function02);
                    av8Var4.n0(O2);
                }
                av8Var4.s(false);
                com.facebook.appevents.g.d(xtcVar2, this.b, this.c, (Function0) O2, av8Var4, intValue2 & 14);
            default:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Number) obj3).intValue();
                ((n8g) obj).getClass();
                if ((intValue3 & 17) == 16) {
                    av8 av8Var5 = (av8) of3Var3;
                    if (av8Var5.D()) {
                        av8Var5.W();
                        break;
                    }
                }
                Integer num = (Integer) obj4;
                lfj lfjVar = num != null ? new lfj(v8a.v(num.intValue())) : null;
                av8 av8Var6 = (av8) of3Var3;
                av8Var6.e0(-1245056940);
                long j = lfjVar == null ? ((b7k) av8Var6.k(e7k.b)).k.a.b : lfjVar.a;
                av8Var6.s(false);
                vdj.c(this.b, null, this.c, j, wg8.j, null, 0L, null, 0L, 2, false, 1, null, null, av8Var6, 196608, 3120, 55250);
        }
        return Unit.a;
    }

    public /* synthetic */ x0(String str, long j, Function0 function0, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = function0;
    }
}
