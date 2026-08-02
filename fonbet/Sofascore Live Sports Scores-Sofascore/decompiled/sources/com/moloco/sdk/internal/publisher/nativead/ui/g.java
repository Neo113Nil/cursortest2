package com.moloco.sdk.internal.publisher.nativead.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i0;
import com.sofascore.results.R;
import defpackage.av8;
import defpackage.haa;
import defpackage.of3;
import defpackage.r13;
import defpackage.tc3;
import defpackage.uxf;
import defpackage.xtc;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g implements Function2 {
    public final /* synthetic */ i a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ q d;

    public g(i iVar, Function0 function0, xtc xtcVar, q qVar) {
        this.a = iVar;
        this.b = function0;
        this.c = xtcVar;
        this.d = qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.m mVar = this.a.a;
        long j = r13.b;
        Function0 function0 = this.b;
        f0 f0Var = new f0(function0, function0, function0);
        av8 av8Var2 = (av8) of3Var;
        av8Var2.e0(-1062465295);
        tc3 a = f1.a(0L, 0L, 0L, uxf.c, null, r13.d, haa.t(R.drawable.moloco_twotone_volume_off_24, 0, av8Var2), haa.t(R.drawable.moloco_twotone_volume_up_24, 0, av8Var2), av8Var2, 559);
        av8Var2.s(false);
        tc3 tc3Var = m.a;
        int i = i0.a;
        av8Var2.e0(718660168);
        tc3 y = yqo.y(1901828083, av8Var2, new h0(tc3Var));
        av8Var2.s(false);
        f1.o(mVar, this.c, j, a, null, null, null, null, f0Var, null, null, y, this.d, false, of3Var, 818110848, 9280);
        return Unit.a;
    }
}
