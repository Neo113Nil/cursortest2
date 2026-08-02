package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.core.app.NotificationCompat;
import defpackage.av8;
import defpackage.bkh;
import defpackage.ft8;
import defpackage.fz8;
import defpackage.io;
import defpackage.l98;
import defpackage.m12;
import defpackage.of3;
import defpackage.ohf;
import defpackage.p3e;
import defpackage.utc;
import defpackage.yqo;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c1 implements ft8 {
    public final /* synthetic */ io a;
    public final /* synthetic */ p3e b;
    public final /* synthetic */ long c;

    public c1(io ioVar, p3e p3eVar, long j) {
        this.a = ioVar;
        this.b = p3eVar;
        this.c = j;
    }

    @Override // defpackage.ft8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        m12 m12Var = (m12) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj3;
        of3 of3Var = (of3) obj4;
        int intValue = ((Number) obj5).intValue();
        m12Var.getClass();
        oVar.getClass();
        if ((intValue & 6) == 0) {
            i = (((av8) of3Var).g(m12Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((av8) of3Var).h(booleanValue) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= ((av8) of3Var).g(oVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 1171) == 1170) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        fz8.e(booleanValue || ((oVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m) && ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m) oVar).a > 0), l98.a0(m12Var.a(bkh.d(utc.a, 1.0f), this.a), this.b), null, null, null, yqo.y(-1435522410, of3Var, new ohf(booleanValue, oVar, this.c)), of3Var, 196608, 28);
        return Unit.a;
    }
}
