package com.inmobi.media;

import defpackage.h2d;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.yb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3908yb extends sq3 {
    public h2d a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3934zb c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3908yb(C3934zb c3934zb, sq3 sq3Var) {
        super(sq3Var);
        this.c = c3934zb;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
