package com.inmobi.media;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.x6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3877x6 extends sq3 {
    public int a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C6 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3877x6(C6 c6, sq3 sq3Var) {
        super(sq3Var);
        this.e = c6;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, this);
    }
}
