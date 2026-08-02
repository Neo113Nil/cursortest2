package com.inmobi.media;

import defpackage.h2d;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.u2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3795u2 extends sq3 {
    public h2d a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AbstractC3873x2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3795u2(AbstractC3873x2 abstractC3873x2, sq3 sq3Var) {
        super(sq3Var);
        this.c = abstractC3873x2;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return AbstractC3873x2.b(this.c, this);
    }
}
