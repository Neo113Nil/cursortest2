package com.moloco.sdk.acm.services;

import com.facebook.login.i;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ i s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, sq3 sq3Var) {
        super(sq3Var);
        this.s = iVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.e(this);
    }
}
