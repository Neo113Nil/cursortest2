package com.moloco.sdk.internal.publisher;

import defpackage.ddi;
import defpackage.fdi;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ e(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ddi k;
        int i = this.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                return (com.moloco.sdk.internal.ortb.model.h) fVar.a.h.c;
            case 1:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p) fVar.a.h.a;
                if (pVar == null || (k = pVar.k()) == null) {
                    return null;
                }
                return (Boolean) ((fdi) k).getValue();
            default:
                return fVar.a.c();
        }
    }
}
