package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.ad2;
import defpackage.km5;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f1 {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k a;
    public final ad2 b;

    public f1(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar) {
        kVar.getClass();
        this.a = kVar;
        this.b = s9a.c(z45.a);
    }

    public final void a(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0 e0Var, Integer num, String str) {
        list.getClass();
        km5 km5Var = km5.a;
        if (list.isEmpty()) {
            return;
        }
        xw3.L(this.b, null, null, new e1(list, null, null, this, km5Var, e0Var, num, str, null), 3);
    }
}
