package com.moloco.sdk.internal.services.usertracker;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b extends sq3 {
    public Object r;
    public Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ c u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = cVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(this);
    }
}
