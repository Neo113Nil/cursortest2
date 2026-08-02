package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b98;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j0 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ j0(l0 l0Var, int i) {
        this.a = i;
        this.b = l0Var;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        l0 l0Var = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                l0Var.h = booleanValue;
                long j = l0Var.g;
                View view = l0Var.e;
                View view2 = l0Var.f;
                View view3 = booleanValue ? view2 : view;
                if (!booleanValue) {
                    view = view2;
                }
                view3.bringToFront();
                view3.animate().alpha(1.0f).setDuration(j).start();
                view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j).start();
                break;
            default:
                l0Var.i = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj;
                break;
        }
        return Unit.a;
    }
}
