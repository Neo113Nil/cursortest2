package com.inmobi.media;

import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.wg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3861wg extends sq3 {
    public C3628ng a;
    public InterfaceC3835vg b;
    public C3473hg c;
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractC3913yg e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3861wg(AbstractC3913yg abstractC3913yg, rq3 rq3Var) {
        super(rq3Var);
        this.e = abstractC3913yg;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
