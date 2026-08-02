package com.inmobi.media;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class O1 extends sq3 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Q1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(Q1 q1, sq3 sq3Var) {
        super(sq3Var);
        this.b = q1;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return Q1.a(this.b, null, null, this);
    }
}
