package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import defpackage.h2d;
import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class S9 extends sq3 {
    public Object a;
    public h2d b;
    public /* synthetic */ Object c;
    public int d;

    public S9(rq3 rq3Var) {
        super(rq3Var);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(null, this);
    }
}
