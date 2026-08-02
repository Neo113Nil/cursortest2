package com.inmobi.media;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.sm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3763sm extends sq3 {
    public Pl a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3841vm c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3763sm(C3841vm c3841vm, sq3 sq3Var) {
        super(sq3Var);
        this.c = c3841vm;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
