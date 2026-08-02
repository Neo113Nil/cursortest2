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
public final class l implements z88 {
    public final /* synthetic */ nj2 a;
    public final /* synthetic */ u b;
    public final /* synthetic */ f c;
    public final /* synthetic */ double d;
    public final /* synthetic */ com.moloco.sdk.common_adapter_internal.a e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ fsf h;

    public l(nj2 nj2Var, u uVar, f fVar, double d, com.moloco.sdk.common_adapter_internal.a aVar, boolean z, String str, fsf fsfVar) {
        this.a = nj2Var;
        this.b = uVar;
        this.c = fVar;
        this.d = d;
        this.e = aVar;
        this.f = z;
        this.g = str;
        this.h = fsfVar;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        Object collect = this.a.collect(new k(b98Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
