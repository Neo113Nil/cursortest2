package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.b98;
import defpackage.rq3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ e(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj;
                Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o, Unit> onProgressChanged = fVar.getOnProgressChanged();
                if (onProgressChanged != null) {
                    onProgressChanged.invoke(oVar);
                }
                break;
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) obj;
                Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> onError = fVar.getOnError();
                if (onError != null) {
                    onError.invoke(lVar);
                }
                break;
        }
        return Unit.a;
    }
}
