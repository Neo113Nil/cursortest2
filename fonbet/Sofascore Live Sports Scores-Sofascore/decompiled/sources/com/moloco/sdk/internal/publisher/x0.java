package com.moloco.sdk.internal.publisher;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ x0(c1 c1Var, int i) {
        this.a = i;
        this.b = c1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        c1 c1Var = this.b;
        switch (i) {
            case 0:
                return c1Var.c();
            case 1:
                return (com.moloco.sdk.internal.ortb.model.h) c1Var.h.c;
            case 2:
                return (d0) c1Var.h.d;
            default:
                return c1Var.c();
        }
    }
}
