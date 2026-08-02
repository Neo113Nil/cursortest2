package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.e1d;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a s;
    public final /* synthetic */ e1d t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar, e1d e1dVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = aVar;
        this.t = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        e1d e1dVar = this.t;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar = this.s;
        switch (i) {
            case 0:
                return new p(aVar, e1dVar, rq3Var, 0);
            default:
                return new p(aVar, e1dVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((p) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar = this.s;
        e1d e1dVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                long longValue = ((Number) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) e1dVar.getValue()).a).longValue();
                aVar.o = longValue;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar = aVar.k;
                if (jVar != null) {
                    jVar.seekTo(longValue);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (((Boolean) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) e1dVar.getValue()).a).booleanValue()) {
                    aVar.n = true;
                    aVar.a();
                } else {
                    aVar.n = false;
                    aVar.a();
                }
                break;
        }
        return Unit.a;
    }
}
