package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.a70;
import defpackage.b98;
import defpackage.fsf;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.ts2;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zzl;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q implements b98 {
    public final /* synthetic */ b98 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ u c;
    public final /* synthetic */ String d;
    public final /* synthetic */ fsf e;

    public q(b98 b98Var, boolean z, u uVar, String str, fsf fsfVar) {
        this.a = b98Var;
        this.b = z;
        this.c = uVar;
        this.d = str;
        this.e = fsfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0105, code lost:
    
        if (r11.emit(r2, r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        p pVar;
        int i;
        q qVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar;
        b98 b98Var;
        q qVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVar;
        Pair pair;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h hVar2;
        if (rq3Var instanceof p) {
            pVar = (p) rq3Var;
            int i2 = pVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.s = i2 - Integer.MIN_VALUE;
                Object obj2 = pVar.r;
                lu3 lu3Var = lu3.a;
                i = pVar.s;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj2);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) obj;
                    b98 b98Var2 = this.a;
                    boolean z = this.b;
                    u uVar = this.c;
                    if (z) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar = uVar.c;
                        String str = vVar3.a;
                        pVar.t = this;
                        pVar.v = b98Var2;
                        pVar.w = vVar3;
                        pVar.s = 1;
                        jVar.getClass();
                        hs4 hs4Var = z45.a;
                        Object R = xw3.R(hq4.c, new ts2(str, jVar, this.d, (rq3) null), pVar);
                        if (R != lu3Var) {
                            qVar2 = this;
                            vVar2 = vVar3;
                            b98Var = b98Var2;
                            obj2 = R;
                            hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) obj2;
                            if (!(hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d)) {
                            }
                            if (pair != null) {
                            }
                        }
                    } else {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar2 = uVar.c;
                        String str2 = vVar3.a;
                        pVar.t = this;
                        pVar.v = b98Var2;
                        pVar.w = vVar3;
                        pVar.s = 2;
                        jVar2.getClass();
                        hs4 hs4Var2 = z45.a;
                        Object R2 = xw3.R(hq4.c, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i(str2, jVar2, rq3Var2, 0), pVar);
                        if (R2 != lu3Var) {
                            qVar = this;
                            vVar = vVar3;
                            b98Var = b98Var2;
                            obj2 = R2;
                            hVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h) obj2;
                            if (!(hVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g)) {
                            }
                        }
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    vVar2 = pVar.w;
                    b98Var = pVar.v;
                    qVar2 = pVar.t;
                    y6a.M(obj2);
                    hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) obj2;
                    if (!(hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d)) {
                        pair = new Pair(vVar2, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) hVar).a);
                    } else if (hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) {
                        pair = new Pair(vVar2, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) hVar).a);
                    } else {
                        if (!(hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e)) {
                            zzl.b();
                            return null;
                        }
                        qVar2.e.a = x.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e) hVar).a);
                        pair = null;
                    }
                    if (pair != null) {
                    }
                } else if (i == 2) {
                    vVar = pVar.w;
                    b98Var = pVar.v;
                    qVar = pVar.t;
                    y6a.M(obj2);
                    hVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h) obj2;
                    if (!(hVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g)) {
                        pair = new Pair(vVar, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g) hVar2).a);
                        if (pair != null) {
                            pVar.t = null;
                            pVar.v = null;
                            pVar.w = null;
                            pVar.s = 3;
                        }
                    } else {
                        if (!(hVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f)) {
                            zzl.b();
                            return null;
                        }
                        qVar.e.a = x.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f) hVar2);
                        pair = null;
                        if (pair != null) {
                        }
                    }
                } else {
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                return Unit.a;
            }
        }
        pVar = new p(this, rq3Var);
        Object obj22 = pVar.r;
        lu3 lu3Var2 = lu3.a;
        i = pVar.s;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        return Unit.a;
    }
}
