package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.fsf;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n extends sq3 {
    public u r;
    public fsf s;
    public /* synthetic */ Object t;
    public final /* synthetic */ u u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = uVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.g(null, null, 0.0d, null, false, null, this);
    }
}
