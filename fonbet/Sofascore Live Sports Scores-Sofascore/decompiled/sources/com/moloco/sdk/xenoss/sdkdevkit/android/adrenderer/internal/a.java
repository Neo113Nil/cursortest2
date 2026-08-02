package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.publisher.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ a(z0 z0Var, int i) {
        this.a = i;
        this.b = z0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        z0 z0Var = this.b;
        switch (i) {
            case 0:
                z0Var.b();
                break;
            case 1:
                z0Var.c();
                break;
            default:
                z0Var.c();
                break;
        }
        return Unit.a;
    }
}
