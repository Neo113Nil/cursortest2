package com.moloco.sdk.internal.publisher.nativead;

import defpackage.lu3;
import defpackage.sq3;
import defpackage.w2g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i extends sq3 {
    public Object r;
    public Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ m u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = mVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object e = this.u.e(null, null, null, this);
        return e == lu3.a ? e : new w2g(e);
    }
}
