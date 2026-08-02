package com.inmobi.media;

import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fm extends sq3 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ Gm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fm(Gm gm, rq3 rq3Var) {
        super(rq3Var);
        this.c = gm;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
