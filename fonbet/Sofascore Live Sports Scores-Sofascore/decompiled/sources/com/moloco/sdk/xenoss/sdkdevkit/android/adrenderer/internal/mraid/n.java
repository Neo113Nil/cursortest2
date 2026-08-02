package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import defpackage.b98;
import defpackage.lu3;
import defpackage.pog;
import defpackage.rq3;
import defpackage.xdh;
import defpackage.z88;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z88 b;

    public /* synthetic */ n(z88 z88Var, int i) {
        this.a = i;
        this.b = z88Var;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        z88 z88Var = this.b;
        switch (i) {
            case 0:
                Object collect = ((xdh) z88Var).collect(new m(b98Var, 0), rq3Var);
                if (collect != lu3.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((pog) z88Var).collect(new m(b98Var, 1), rq3Var);
                if (collect2 != lu3.a) {
                    break;
                }
                break;
            default:
                Object collect3 = z88Var.collect(new m(b98Var, 4), rq3Var);
                if (collect3 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
