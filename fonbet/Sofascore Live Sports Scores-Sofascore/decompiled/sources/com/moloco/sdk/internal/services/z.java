package com.moloco.sdk.internal.services;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import defpackage.a70;
import defpackage.aeh;
import defpackage.dmi;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class z {
    public final t0 a;
    public final com.moloco.sdk.internal.services.events.c b;

    public z(t0 t0Var, com.moloco.sdk.internal.services.events.c cVar) {
        t0Var.getClass();
        cVar.getClass();
        this.a = t0Var;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        if (r1.emit(r0, r9) == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n nVar, aeh aehVar, sq3 sq3Var) {
        y yVar;
        int i;
        aeh aehVar2;
        z zVar;
        String str2;
        t0 t0Var;
        if (sq3Var instanceof y) {
            yVar = (y) sq3Var;
            int i2 = yVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.v = i2 - Integer.MIN_VALUE;
                y yVar2 = yVar;
                Object obj = yVar2.t;
                lu3 lu3Var = lu3.a;
                i = yVar2.v;
                if (i != 0) {
                    y6a.M(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e eVar = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.e(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(com.facebook.appevents.n.a(aVar.e), com.facebook.appevents.n.a(aVar.f)), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(com.facebook.appevents.n.a(aVar.a), com.facebook.appevents.n.a(aVar.b)), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h(com.facebook.appevents.n.a(aVar.d), com.facebook.appevents.n.a(aVar.c)), nVar.b());
                    yVar2.r = this;
                    aehVar2 = aehVar;
                    yVar2.s = aehVar2;
                    yVar2.v = 1;
                    obj = this.b.b(currentTimeMillis, eVar, str, yVar2);
                    if (obj != lu3Var) {
                        zVar = this;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aeh aehVar3 = yVar2.s;
                z zVar2 = yVar2.r;
                y6a.M(obj);
                aehVar2 = aehVar3;
                zVar = zVar2;
                str2 = (String) obj;
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ClickthroughService", dmi.q("Launching url: ", str2), false, 4, null);
                t0Var = zVar.a;
                if (str2 == null) {
                    str2 = "";
                }
                if (t0Var.a(str2) || aehVar2 == null) {
                    return Unit.a;
                }
                Unit unit = Unit.a;
                yVar2.r = null;
                yVar2.s = null;
                yVar2.v = 2;
            }
        }
        yVar = new y(this, sq3Var);
        y yVar22 = yVar;
        Object obj2 = yVar22.t;
        lu3 lu3Var2 = lu3.a;
        i = yVar22.v;
        if (i != 0) {
        }
        str2 = (String) obj2;
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ClickthroughService", dmi.q("Launching url: ", str2), false, 4, null);
        t0Var = zVar.a;
        if (str2 == null) {
        }
        if (t0Var.a(str2)) {
        }
        return Unit.a;
    }
}
