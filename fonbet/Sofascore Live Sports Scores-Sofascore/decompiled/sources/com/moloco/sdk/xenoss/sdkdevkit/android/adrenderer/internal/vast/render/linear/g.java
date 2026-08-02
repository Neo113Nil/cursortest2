package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import defpackage.a70;
import defpackage.ad2;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.jof;
import defpackage.jy0;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.x7k;
import defpackage.y6a;
import defpackage.y7k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ jy0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(jy0 jy0Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = jy0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        jy0 jy0Var = this.t;
        switch (i) {
            case 0:
                g gVar = new g(jy0Var, rq3Var, 0);
                gVar.s = ((y7k) obj).a;
                return gVar;
            default:
                return new g(jy0Var, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                y7k y7kVar = (y7k) obj;
                int i = y7kVar.a;
                return ((g) create(y7kVar, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((g) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        jof jofVar;
        int i = this.r;
        jy0 jy0Var = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                int i2 = this.s;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                StringBuilder sb = new StringBuilder("Updating countdown to ");
                x7k x7kVar = y7k.b;
                sb.append((Object) String.valueOf(i2 & 4294967295L));
                MolocoLogger.info$default(molocoLogger, "LinearGoNextActionImpl", sb.toString(), null, false, 12, null);
                jy0Var.a = i2;
                StringBuilder sb2 = new StringBuilder("Propagating state: ");
                Object obj2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c.a;
                sb2.append(i2 == 0 ? obj2 : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d(i2));
                MolocoLogger.info$default(molocoLogger, "LinearGoNextActionImpl", sb2.toString(), null, false, 12, null);
                fdi fdiVar = (fdi) jy0Var.f;
                if (i2 != 0) {
                    obj2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d(i2);
                }
                fdiVar.m(null, obj2);
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    com.facebook.login.i iVar = (com.facebook.login.i) jy0Var.d;
                    int i4 = jy0Var.a;
                    if (iVar == null) {
                        jy0Var.d = new com.facebook.login.i(i4, (ad2) jy0Var.c);
                    } else {
                        fdi fdiVar2 = (fdi) iVar.c;
                        jof a = i0.a(i4, (ad2) iVar.b, null);
                        fdiVar2.getClass();
                        fdiVar2.m(null, a);
                    }
                    com.facebook.login.i iVar2 = (com.facebook.login.i) jy0Var.d;
                    if (iVar2 != null && (jofVar = (jof) iVar2.d) != null) {
                        g gVar = new g(jy0Var, rq3Var, 0);
                        this.s = 1;
                        if (fcp.c0(jofVar, gVar, this) == lu3Var2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
