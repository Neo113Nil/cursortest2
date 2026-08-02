package com.moloco.sdk.internal.publisher;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ j0(q0 q0Var, int i) {
        this.a = i;
        this.b = q0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        q0 q0Var = this.b;
        switch (i) {
            case 0:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) q0Var.t.d;
                if (eVar != null) {
                    return eVar.getCreativeType();
                }
                return null;
            case 1:
                return (com.moloco.sdk.internal.ortb.model.h) q0Var.t.e;
            case 2:
                return (d0) q0Var.t.f;
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e) q0Var.t.d;
                if (eVar2 != null) {
                    return eVar2.getCreativeType();
                }
                return null;
        }
    }
}
