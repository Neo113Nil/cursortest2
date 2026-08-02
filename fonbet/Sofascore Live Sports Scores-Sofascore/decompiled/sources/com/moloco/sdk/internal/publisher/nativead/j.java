package com.moloco.sdk.internal.publisher.nativead;

import defpackage.lu3;
import defpackage.sq3;
import defpackage.w2g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ m s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, sq3 sq3Var) {
        super(sq3Var);
        this.s = mVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object g = this.s.g(null, null, null, this);
        return g == lu3.a ? g : new w2g(g);
    }
}
