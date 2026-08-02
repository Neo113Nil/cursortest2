package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.b98;
import defpackage.fsf;
import defpackage.lu3;
import defpackage.nj2;
import defpackage.rq3;
import defpackage.z88;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class r implements z88 {
    public final /* synthetic */ nj2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ u c;
    public final /* synthetic */ String d;
    public final /* synthetic */ fsf e;

    public r(nj2 nj2Var, boolean z, u uVar, String str, fsf fsfVar) {
        this.a = nj2Var;
        this.b = z;
        this.c = uVar;
        this.d = str;
        this.e = fsfVar;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        Object collect = this.a.collect(new q(b98Var, this.b, this.c, this.d, this.e), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
