package com.moloco.sdk.internal.ilrd;

import defpackage.h2d;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d extends sq3 {
    public e r;
    public h2d s;
    public byte[] t;
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = eVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.d(this);
    }
}
