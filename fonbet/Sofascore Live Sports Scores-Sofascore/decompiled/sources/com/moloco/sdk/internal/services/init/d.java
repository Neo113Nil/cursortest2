package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.internal.services.t;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d extends sq3 {
    public int A;
    public e r;
    public Object s;
    public Object t;
    public com.moloco.sdk.acm.recorder.c u;
    public com.moloco.sdk.acm.h v;
    public c0 w;
    public t x;
    public /* synthetic */ Object y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, sq3 sq3Var) {
        super(sq3Var);
        this.z = eVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, null, this);
    }
}
