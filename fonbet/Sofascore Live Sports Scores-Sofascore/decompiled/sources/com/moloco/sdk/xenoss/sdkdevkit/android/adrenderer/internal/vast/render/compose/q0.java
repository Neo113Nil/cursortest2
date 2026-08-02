package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.b98;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q0 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ q0(s0 s0Var, int i) {
        this.a = i;
        this.b = s0Var;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        s0 s0Var = this.b;
        switch (i) {
            case 0:
                s0Var.k = ((Boolean) obj).booleanValue();
                s0Var.a();
                break;
            default:
                s0Var.l = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj;
                s0Var.a();
                break;
        }
        return Unit.a;
    }
}
