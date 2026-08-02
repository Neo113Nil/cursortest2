package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class W9 extends sq3 {
    public /* synthetic */ Object a;
    public int b;

    public W9(rq3 rq3Var) {
        super(rq3Var);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.access$resetInternal(this);
    }
}
