package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.b98;
import defpackage.fdi;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class z implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ z(b0 b0Var, int i) {
        this.a = i;
        this.b = b0Var;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        b0 b0Var = this.b;
        switch (i) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u uVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar = b0Var.j;
                f videoPlayer$moloco_sdk_release = b0Var.getVideoPlayer$moloco_sdk_release();
                fdi fdiVar = b0Var.h;
                long longValue = ((Number) uVar.a).longValue();
                videoPlayer$moloco_sdk_release.h = longValue;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.l lVar = videoPlayer$moloco_sdk_release.k;
                if (lVar != null) {
                    lVar.seekTo(longValue);
                }
                b0Var.getVideoPlayer$moloco_sdk_release().setPlay(((Boolean) fdiVar.getValue()).booleanValue());
                if (aVar != null) {
                    long longValue2 = ((Number) uVar.a).longValue();
                    aVar.o = longValue2;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j jVar = aVar.k;
                    if (jVar != null) {
                        jVar.seekTo(longValue2);
                    }
                }
                if (((Boolean) fdiVar.getValue()).booleanValue()) {
                    if (aVar != null) {
                        aVar.n = true;
                        aVar.a();
                    }
                } else if (aVar != null) {
                    aVar.n = false;
                    aVar.a();
                }
                break;
            default:
                b0Var.getVideoPlayer$moloco_sdk_release().setMute(((Boolean) obj).booleanValue());
                break;
        }
        return Unit.a;
    }
}
