package com.moloco.sdk.internal;

import defpackage.av8;
import defpackage.ct8;
import defpackage.of3;
import defpackage.xtc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f0 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ f0(String str, String str2, long j, long j2, Function0 function0, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                xtc xtcVar = (xtc) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Number) obj3).intValue();
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
                i0.a(xtcVar, this.b, this.c, this.d, this.e, this.f, of3Var, intValue & 14);
            default:
                xtc xtcVar2 = (xtc) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Number) obj3).intValue();
                xtcVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar2) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.D()) {
                        av8Var2.W();
                        break;
                    }
                }
                i0.a(xtcVar2, this.b, this.c, this.d, this.e, this.f, of3Var2, intValue2 & 14);
        }
        return Unit.a;
    }
}
