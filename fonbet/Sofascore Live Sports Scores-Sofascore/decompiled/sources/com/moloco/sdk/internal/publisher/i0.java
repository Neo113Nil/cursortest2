package com.moloco.sdk.internal.publisher;

import defpackage.xd5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ i0(q0 q0Var, int i) {
        this.a = i;
        this.b = q0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        q0 q0Var = this.b;
        switch (i) {
            case 0:
                ((Long) obj).getClass();
                return new xd5(q0Var.i.a());
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar.getClass();
                q0Var.u.a(dVar);
                return Unit.a;
        }
    }
}
