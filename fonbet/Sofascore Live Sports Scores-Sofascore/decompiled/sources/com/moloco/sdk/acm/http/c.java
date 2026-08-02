package com.moloco.sdk.acm.http;

import defpackage.lu3;
import defpackage.sq3;
import defpackage.w2g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ e s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, sq3 sq3Var) {
        super(sq3Var);
        this.s = eVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object b = this.s.b(null, null, this);
        return b == lu3.a ? b : new w2g(b);
    }
}
