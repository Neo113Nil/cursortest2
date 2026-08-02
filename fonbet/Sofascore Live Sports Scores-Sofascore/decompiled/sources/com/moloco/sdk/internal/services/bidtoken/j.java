package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.publisher.MolocoBidTokenListener;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j extends sq3 {
    public k r;
    public com.moloco.sdk.acm.recorder.c s;
    public MolocoBidTokenListener t;
    public long u;
    public /* synthetic */ Object v;
    public final /* synthetic */ k w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = kVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, null, null, this);
    }
}
