package com.moloco.sdk.acm;

import defpackage.j2d;
import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a extends sq3 {
    public i r;
    public j2d s;
    public /* synthetic */ Object t;
    public final /* synthetic */ b u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, rq3 rq3Var) {
        super(rq3Var);
        this.u = bVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(null, this);
    }
}
