package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.rq3;
import java.util.HashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.c8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3336c8 implements Xg {
    public final String a;

    public C3336c8(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.inmobi.media.Xg
    public final void a() {
        if (this.a.length() != 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2162);
        throw new Zg(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(hashMap));
    }

    @Override // com.inmobi.media.Xg
    public final Object b() {
        return this.a;
    }

    @Override // com.inmobi.media.Xg
    public final Object a(rq3 rq3Var) {
        return Unit.a;
    }
}
