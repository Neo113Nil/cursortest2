package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.core.app.NotificationCompat;
import defpackage.av8;
import defpackage.ft8;
import defpackage.l98;
import defpackage.m12;
import defpackage.of3;
import defpackage.utc;
import defpackage.uxf;
import defpackage.wnn;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l implements ft8 {
    public static final l a = new l();

    @Override // defpackage.ft8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        m12 m12Var = (m12) obj;
        Boolean bool = (Boolean) obj2;
        boolean booleanValue = bool.booleanValue();
        Function0 function0 = (Function0) obj3;
        of3 of3Var = (of3) obj4;
        int intValue = ((Number) obj5).intValue();
        m12Var.getClass();
        function0.getClass();
        if ((intValue & 6) == 0) {
            i = (((av8) of3Var).g(m12Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((av8) of3Var).h(booleanValue) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= ((av8) of3Var).g(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 1171) == 1170) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        wnn.c(bool, l98.b0(m12Var.a(utc.a, uxf.j), 4.0f), null, yqo.y(170935244, of3Var, new k(function0)), of3Var, ((i >> 3) & 14) | 3072, 4);
        return Unit.a;
    }
}
