package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.b98;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c0 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ c0(e0 e0Var, int i) {
        this.a = i;
        this.b = e0Var;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                e0 e0Var = this.b;
                f1.n(e0Var, booleanValue, e0Var.e, e0Var.f, null);
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                e0 e0Var2 = this.b;
                e0Var2.j = booleanValue2;
                e0Var2.n.setImageResource(booleanValue2 ? e0Var2.c : e0Var2.d);
                break;
        }
        return Unit.a;
    }
}
