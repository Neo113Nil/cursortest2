package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.internal.publisher.h1;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.w2g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h extends sq3 {
    public Object r;
    public com.moloco.sdk.acm.h s;
    public h1 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = mVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        Object d = this.v.d(null, null, null, this);
        return d == lu3.a ? d : new w2g(d);
    }
}
