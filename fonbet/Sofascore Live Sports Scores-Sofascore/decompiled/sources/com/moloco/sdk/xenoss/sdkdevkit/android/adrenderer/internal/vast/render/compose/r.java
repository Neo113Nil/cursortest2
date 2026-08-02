package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.core.app.NotificationCompat;
import defpackage.av8;
import defpackage.fz8;
import defpackage.gt8;
import defpackage.io;
import defpackage.l98;
import defpackage.m12;
import defpackage.of3;
import defpackage.p3e;
import defpackage.utc;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class r implements gt8 {
    public final /* synthetic */ io a;
    public final /* synthetic */ p3e b;

    public r(io ioVar, p3e p3eVar) {
        this.a = ioVar;
        this.b = p3eVar;
    }

    @Override // defpackage.gt8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        m12 m12Var = (m12) obj;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) obj2;
        Function0 function0 = (Function0) obj3;
        Function0 function02 = (Function0) obj4;
        of3 of3Var = (of3) obj5;
        int intValue = ((Number) obj6).intValue();
        m12Var.getClass();
        function0.getClass();
        function02.getClass();
        if ((intValue & 6) == 0) {
            i = (((av8) of3Var).g(m12Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((av8) of3Var).g(rVar) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= ((av8) of3Var).g(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= ((av8) of3Var).g(function02) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i & 9363) == 9362) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        fz8.e(rVar != null, l98.a0(m12Var.a(utc.a, this.a), this.b), null, null, null, yqo.y(989733896, of3Var, new q(rVar, function0, function02)), of3Var, 196608, 28);
        return Unit.a;
    }
}
