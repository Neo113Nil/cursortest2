package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import defpackage.rq3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class U9 extends sq3 {
    public /* synthetic */ Object a;
    public int b;

    public U9(rq3 rq3Var) {
        super(rq3Var);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        a = InMobiUnifiedIdService.a((InMobiUserDataModel) null, this);
        return a;
    }
}
