package com.moloco.sdk.acm.eventprocessing;

import com.facebook.login.i;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.w2g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c extends sq3 {
    public i r;
    public /* synthetic */ Object s;
    public final /* synthetic */ i t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = iVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        Object e = this.t.e(this);
        return e == lu3.a ? e : new w2g(e);
    }
}
