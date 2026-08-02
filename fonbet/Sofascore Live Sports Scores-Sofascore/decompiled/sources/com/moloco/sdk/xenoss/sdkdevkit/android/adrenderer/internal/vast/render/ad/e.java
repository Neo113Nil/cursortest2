package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.view.View;
import defpackage.a70;
import defpackage.b98;
import defpackage.fsf;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        i iVar;
        int i;
        int i2 = this.a;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar = this.b;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) obj;
                fsf fsfVar = (fsf) obj2;
                if ((fsfVar.a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d) && (fVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c)) {
                    ((m) oVar).f(b.h);
                }
                fsfVar.a = fVar;
                break;
            case 1:
                if (rq3Var instanceof i) {
                    iVar = (i) rq3Var;
                    int i3 = iVar.s;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        iVar.s = i3 - Integer.MIN_VALUE;
                        Object obj3 = iVar.r;
                        lu3 lu3Var = lu3.a;
                        i = iVar.s;
                        Object obj4 = null;
                        if (i != 0) {
                            y6a.M(obj3);
                            b98 b98Var = (b98) obj2;
                            x xVar = (x) obj;
                            boolean c = Intrinsics.c(CollectionsKt.j0(((m) oVar).a), xVar);
                            if (xVar instanceof t) {
                                obj4 = new n(((t) xVar).a, c);
                            } else if (xVar instanceof v) {
                                obj4 = new p(((v) xVar).a, c);
                            } else if (xVar instanceof u) {
                                obj4 = new o(((u) xVar).a, c);
                            } else if (xVar instanceof w) {
                                obj4 = new q(((w) xVar).a, c);
                            } else if (xVar != null) {
                                zzl.b();
                            }
                            iVar.s = 1;
                            if (b98Var.emit(obj4, iVar) == lu3Var) {
                            }
                        } else if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj3);
                            break;
                        }
                    }
                }
                iVar = new i(this, rq3Var);
                Object obj32 = iVar.r;
                lu3 lu3Var2 = lu3.a;
                i = iVar.s;
                Object obj42 = null;
                if (i != 0) {
                }
                break;
            case 2:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f fVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f) obj2;
                Function1<Boolean, Unit> onIsPlaying = fVar2.getOnIsPlaying();
                if (onIsPlaying != null) {
                    onIsPlaying.invoke(Boolean.valueOf(dVar.a));
                }
                Function1<Boolean, Unit> onIsVisible = fVar2.getOnIsVisible();
                if (onIsVisible != null) {
                    onIsVisible.invoke(Boolean.valueOf(dVar.b));
                }
                View c2 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l) oVar).a.c();
                if (c2 != null) {
                    c2.setKeepScreenOn(dVar.c);
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a) obj2;
                aVar.p = bool;
                if (booleanValue) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j) oVar;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o oVar2 = aVar.f;
                    if (oVar2 != null) {
                        jVar.seekTo(((Number) oVar2.invoke()).longValue());
                    }
                }
                aVar.a();
                break;
        }
        return Unit.a;
    }
}
