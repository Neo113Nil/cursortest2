package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import defpackage.av8;
import defpackage.d7e;
import defpackage.e1d;
import defpackage.fz8;
import defpackage.ht8;
import defpackage.io;
import defpackage.l98;
import defpackage.ml4;
import defpackage.n12;
import defpackage.nf3;
import defpackage.of3;
import defpackage.p3e;
import defpackage.uah;
import defpackage.utc;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b1 implements ht8 {
    public final /* synthetic */ io a;
    public final /* synthetic */ p3e b;
    public final /* synthetic */ d7e c;
    public final /* synthetic */ d7e d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ uah h;
    public final /* synthetic */ long i;

    public b1(io ioVar, p3e p3eVar, d7e d7eVar, d7e d7eVar2, long j, long j2, long j3, uah uahVar, long j4) {
        this.a = ioVar;
        this.b = p3eVar;
        this.c = d7eVar;
        this.d = d7eVar2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = uahVar;
        this.i = j4;
    }

    @Override // defpackage.ht8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        Function2 function2 = (Function2) obj4;
        Function1 function1 = (Function1) obj5;
        of3 of3Var = (of3) obj6;
        int intValue = ((Number) obj7).intValue();
        function2.getClass();
        function1.getClass();
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
            i |= ((av8) of3Var).h(booleanValue2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= ((av8) of3Var).g(function2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= ((av8) of3Var).g(function1) ? 16384 : 8192;
        }
        int i3 = i;
        if ((i3 & 74899) == 74898) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.e0(-1304207447);
        Object O = av8Var2.O();
        if (O == nf3.a) {
            O = androidx.compose.runtime.e.f(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.d, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
            av8Var2.n0(O);
        }
        av8Var2.s(false);
        fz8.e(booleanValue, l98.a0(ml4.R(n12Var.a(utc.a, this.a)), this.b), null, null, null, yqo.y(-2071462974, av8Var2, new a1(booleanValue2, this.c, this.d, (e1d) O, function2, function1, booleanValue, this.e, this.f, this.g, this.h, this.i)), av8Var2, ((i3 >> 3) & 14) | 196608, 28);
        return Unit.a;
    }
}
