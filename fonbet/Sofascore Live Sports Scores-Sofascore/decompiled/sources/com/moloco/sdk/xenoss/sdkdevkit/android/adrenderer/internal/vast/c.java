package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.av8;
import defpackage.of3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var = (av8) of3Var;
                    if (av8Var.D()) {
                        av8Var.W();
                    }
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.D()) {
                        av8Var2.W();
                    }
                }
                break;
        }
        return Unit.a;
    }
}
