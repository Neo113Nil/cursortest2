package com.moloco.sdk.internal.services.bidtoken;

import com.facebook.c0;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e extends sq3 {
    public c0 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ c0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c0 c0Var, sq3 sq3Var) {
        super(sq3Var);
        this.t = c0Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.b(null, this);
    }
}
