package com.inmobi.media;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3828v9 extends sq3 {
    public C3854w9 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3854w9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3828v9(C3854w9 c3854w9, sq3 sq3Var) {
        super(sq3Var);
        this.c = c3854w9;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
