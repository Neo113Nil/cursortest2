package com.inmobi.media;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.s6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3747s6 extends sq3 {
    public long a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3773t6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3747s6(C3773t6 c3773t6, sq3 sq3Var) {
        super(sq3Var);
        this.d = c3773t6;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0L, 0L, this);
    }
}
