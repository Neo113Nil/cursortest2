package com.inmobi.media;

import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sa extends sq3 {
    public C3312ba a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Xa c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sa(Xa xa, sq3 sq3Var) {
        super(sq3Var);
        this.c = xa;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return Xa.a(this.c, null, this);
    }
}
