package com.inmobi.media;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ke extends sq3 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Me b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ke(Me me, sq3 sq3Var) {
        super(sq3Var);
        this.b = me;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
