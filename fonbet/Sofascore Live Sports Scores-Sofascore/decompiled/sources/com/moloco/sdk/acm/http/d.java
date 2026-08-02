package com.moloco.sdk.acm.http;

import defpackage.lu3;
import defpackage.sq3;
import defpackage.w2g;
import defpackage.zk9;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d extends sq3 {
    public e r;
    public zk9 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ e u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = eVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Serializable a = this.u.a(0L, null, null, this);
        return a == lu3.a ? a : new w2g(a);
    }
}
