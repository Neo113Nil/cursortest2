package com.inmobi.media;

import defpackage.b98;
import defpackage.ku3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.yda;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Xn implements b98 {
    public final /* synthetic */ ku3 a;
    public final /* synthetic */ C3300ao b;

    public Xn(ku3 ku3Var, C3300ao c3300ao) {
        this.b = c3300ao;
        this.a = ku3Var;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        ku3 ku3Var = this.a;
        EnumC3610mo enumC3610mo = (EnumC3610mo) obj;
        EnumC3610mo enumC3610mo2 = EnumC3610mo.VISIBLE;
        C3300ao c3300ao = this.b;
        if (enumC3610mo == enumC3610mo2) {
            C3326bo c3326bo = c3300ao.d;
            if (!c3326bo.b) {
                yda ydaVar = c3326bo.a;
                if (!(ydaVar != null ? ydaVar.isActive() : false)) {
                    C3300ao c3300ao2 = this.b;
                    c3300ao2.d.a = xw3.L(ku3Var, null, null, new Zn(c3300ao2, null), 3);
                }
            }
        } else {
            yda ydaVar2 = c3300ao.d.a;
            if (ydaVar2 != null) {
                ydaVar2.e(null);
            }
            c3300ao.d.a = null;
        }
        return Unit.a;
    }
}
