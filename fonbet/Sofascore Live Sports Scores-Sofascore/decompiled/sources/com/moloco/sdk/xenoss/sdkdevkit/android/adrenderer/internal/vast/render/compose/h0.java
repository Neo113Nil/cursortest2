package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.av8;
import defpackage.ft8;
import defpackage.ht8;
import defpackage.n12;
import defpackage.nf3;
import defpackage.of3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h0 implements ht8 {
    public final /* synthetic */ ft8 a;

    public h0(ft8 ft8Var) {
        this.a = ft8Var;
    }

    @Override // defpackage.ht8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i;
        Boolean bool = (Boolean) obj2;
        boolean booleanValue = bool.booleanValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj3;
        Function1 function1 = (Function1) obj4;
        Function0 function0 = (Function0) obj5;
        of3 of3Var = (of3) obj6;
        int intValue = ((Number) obj7).intValue();
        oVar.getClass();
        function1.getClass();
        function0.getClass();
        int i2 = intValue & 6;
        n12 n12Var = n12.a;
        if (i2 == 0) {
            i = (((av8) of3Var).g(n12Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((av8) of3Var).h(booleanValue) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= ((av8) of3Var).g(oVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= ((av8) of3Var).g(function1) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= ((av8) of3Var).g(function0) ? 16384 : 8192;
        }
        if ((74899 & i) == 74898) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.e0(263793858);
        boolean g = av8Var2.g(oVar) | av8Var2.g(function0) | av8Var2.g(function1) | av8Var2.h(booleanValue);
        Object O = av8Var2.O();
        if (g || O == nf3.a) {
            O = new g0(oVar, function0, function1, booleanValue);
            av8Var2.n0(O);
        }
        av8Var2.s(false);
        this.a.invoke(n12Var, bool, (Function0) O, av8Var2, Integer.valueOf(i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
        return Unit.a;
    }
}
