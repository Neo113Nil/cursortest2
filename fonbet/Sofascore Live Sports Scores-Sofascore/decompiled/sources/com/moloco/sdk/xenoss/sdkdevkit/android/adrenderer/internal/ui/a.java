package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ a(t0 t0Var, int i) {
        this.a = i;
        this.b = t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        t0 t0Var = this.b;
        ((String) obj).getClass();
        switch (i) {
            case 0:
                t0Var.a("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                break;
            default:
                t0Var.a("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                break;
        }
        return Unit.a;
    }
}
