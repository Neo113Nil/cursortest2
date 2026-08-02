package com.moloco.sdk.acm.eventprocessing;

import defpackage.j2d;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d extends sq3 {
    public f r;
    public j2d s;
    public /* synthetic */ Object t;
    public final /* synthetic */ f u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = fVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(this);
    }
}
