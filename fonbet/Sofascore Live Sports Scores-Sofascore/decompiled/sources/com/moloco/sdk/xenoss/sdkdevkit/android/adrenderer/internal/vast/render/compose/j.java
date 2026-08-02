package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.av8;
import defpackage.ct8;
import defpackage.n8g;
import defpackage.of3;
import defpackage.vdj;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j implements ct8 {
    public final /* synthetic */ boolean a;

    public j(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        ((n8g) obj).getClass();
        if ((intValue & 17) == 16) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        vdj.c(this.a ? "Pause" : "Play", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, null, null, of3Var, 0, 0, 65534);
        return Unit.a;
    }
}
