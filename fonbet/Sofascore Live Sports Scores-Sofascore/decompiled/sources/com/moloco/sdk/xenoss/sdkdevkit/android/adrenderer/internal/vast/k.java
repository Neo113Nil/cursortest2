package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.a70;
import defpackage.b98;
import defpackage.fsf;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k implements b98 {
    public final /* synthetic */ b98 a;
    public final /* synthetic */ u b;
    public final /* synthetic */ f c;
    public final /* synthetic */ double d;
    public final /* synthetic */ com.moloco.sdk.common_adapter_internal.a e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ fsf h;

    public k(b98 b98Var, u uVar, f fVar, double d, com.moloco.sdk.common_adapter_internal.a aVar, boolean z, String str, fsf fsfVar) {
        this.a = b98Var;
        this.b = uVar;
        this.c = fVar;
        this.d = d;
        this.e = aVar;
        this.f = z;
        this.g = str;
        this.h = fsfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x010b, code lost:
    
        if (r14.emit(r0, r11) == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        if (r1 == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        if (r1 == r2) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        j jVar;
        int i;
        b98 b98Var;
        com.moloco.sdk.internal.l0 l0Var;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
        k kVar = this;
        if (rq3Var instanceof j) {
            jVar = (j) rq3Var;
            int i2 = jVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.s = i2 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj2 = jVar2.r;
                lu3 lu3Var = lu3.a;
                i = jVar2.s;
                if (i != 0) {
                    y6a.M(obj2);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f fVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) obj).b;
                    boolean z = fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e;
                    u uVar = kVar.b;
                    b98Var = kVar.a;
                    if (z) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Found Wrapper child element, trying load wrapper render Ad", null, false, 12, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b bVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) fVar).a;
                        jVar2.t = kVar;
                        jVar2.v = b98Var;
                        jVar2.s = 1;
                        obj2 = uVar.c(bVar, kVar.c, kVar.d, kVar.e, kVar.f, kVar.g, jVar2);
                    } else {
                        if (!(fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d)) {
                            zzl.b();
                            return null;
                        }
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Found InLine child element, trying load render Ad", null, false, 12, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) fVar).a;
                        f fVar2 = kVar.c;
                        d dVar = fVar2 != null ? fVar2.d : null;
                        jVar2.t = kVar;
                        jVar2.v = b98Var;
                        jVar2.s = 2;
                        obj2 = uVar.e(tVar, dVar, kVar.d, kVar.e, kVar.f, kVar.g, jVar2);
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    b98 b98Var2 = jVar2.v;
                    k kVar2 = jVar2.t;
                    y6a.M(obj2);
                    b98Var = b98Var2;
                    kVar = kVar2;
                    l0Var = (com.moloco.sdk.internal.l0) obj2;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj2);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b98 b98Var3 = jVar2.v;
                    k kVar3 = jVar2.t;
                    y6a.M(obj2);
                    b98Var = b98Var3;
                    kVar = kVar3;
                    l0Var = (com.moloco.sdk.internal.l0) obj2;
                }
                if (!(l0Var instanceof com.moloco.sdk.internal.j0)) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    u uVar2 = kVar.b;
                    StringBuilder sb = new StringBuilder("Failed to load the ad with error: ");
                    Object obj3 = ((com.moloco.sdk.internal.j0) l0Var).a;
                    sb.append(obj3);
                    MolocoLogger.error$default(molocoLogger, "VastAdLoaderImpl", sb.toString(), null, false, 12, null);
                    kVar.h.a = obj3;
                    aVar = null;
                } else {
                    if (!(l0Var instanceof com.moloco.sdk.internal.k0)) {
                        zzl.b();
                        return null;
                    }
                    aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.k0) l0Var).a;
                }
                if (aVar != null) {
                    jVar2.t = null;
                    jVar2.v = null;
                    jVar2.s = 3;
                }
                return Unit.a;
            }
        }
        jVar = new j(kVar, rq3Var);
        j jVar22 = jVar;
        Object obj22 = jVar22.r;
        lu3 lu3Var2 = lu3.a;
        i = jVar22.s;
        if (i != 0) {
        }
        if (!(l0Var instanceof com.moloco.sdk.internal.j0)) {
        }
        if (aVar != null) {
        }
        return Unit.a;
    }
}
