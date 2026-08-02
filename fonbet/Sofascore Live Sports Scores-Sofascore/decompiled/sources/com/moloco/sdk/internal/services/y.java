package com.moloco.sdk.internal.services;

import defpackage.aeh;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class y extends sq3 {
    public z r;
    public aeh s;
    public /* synthetic */ Object t;
    public final /* synthetic */ z u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = zVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, null, null, null, this);
    }
}
