package com.moloco.sdk.internal.publisher.nativead.ui;

import defpackage.av8;
import defpackage.bkh;
import defpackage.h5a;
import defpackage.of3;
import defpackage.tc3;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc3 b;

    public /* synthetic */ d(tc3 tc3Var, int i) {
        this.a = i;
        this.b = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 0;
        tc3 tc3Var = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var = (av8) of3Var;
                    if (av8Var.D()) {
                        av8Var.W();
                        break;
                    }
                }
                tc3Var.invoke(bkh.c, of3Var, 6);
            case 1:
                of3 of3Var2 = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.D()) {
                        av8Var2.W();
                        break;
                    }
                }
                h5a.n(null, null, null, yqo.y(-964093233, of3Var2, new d(tc3Var, i2)), of3Var2, 3072, 7);
            default:
                of3 of3Var3 = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var3 = (av8) of3Var3;
                    if (av8Var3.D()) {
                        av8Var3.W();
                        break;
                    }
                }
                tc3Var.invoke(of3Var3, 0);
        }
        return Unit.a;
    }
}
