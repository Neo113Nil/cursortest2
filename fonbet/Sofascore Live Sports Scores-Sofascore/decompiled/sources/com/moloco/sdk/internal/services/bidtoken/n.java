package com.moloco.sdk.internal.services.bidtoken;

import defpackage.h2d;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n extends sq3 {
    public o r;
    public com.moloco.sdk.acm.recorder.b s;
    public h2d t;
    public com.moloco.sdk.acm.h u;
    public String v;
    public /* synthetic */ Object w;
    public final /* synthetic */ o x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, sq3 sq3Var) {
        super(sq3Var);
        this.x = oVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.a(null, this);
    }
}
