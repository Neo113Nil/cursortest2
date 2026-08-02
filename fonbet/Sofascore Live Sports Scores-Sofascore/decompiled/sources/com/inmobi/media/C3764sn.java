package com.inmobi.media;

import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.sn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3764sn extends sq3 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C3790tn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3764sn(C3790tn c3790tn, rq3 rq3Var) {
        super(rq3Var);
        this.c = c3790tn;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
