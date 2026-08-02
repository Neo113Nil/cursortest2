package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.internal.publisher.h0;
import defpackage.av8;
import defpackage.et8;
import defpackage.m12;
import defpackage.of3;
import defpackage.xtc;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements et8 {
    public final /* synthetic */ xtc a;
    public final /* synthetic */ Function1 b;

    public c(xtc xtcVar, Function1 function1) {
        this.a = xtcVar;
        this.b = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Function1 function1 = (Function1) obj2;
        of3 of3Var = (of3) obj3;
        int intValue = ((Number) obj4).intValue();
        ((m12) obj).getClass();
        function1.getClass();
        if ((intValue & 48) == 0) {
            intValue |= ((av8) of3Var).g(function1) ? 32 : 16;
        }
        if ((intValue & 145) == 144) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        h0.h((intValue >> 3) & 14, of3Var, this.a, function1, this.b);
        return Unit.a;
    }
}
