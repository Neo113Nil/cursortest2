package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Y extends RuntimeException {
    public final InMobiAdRequestStatus a;
    public final V b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InMobiAdRequestStatus inMobiAdRequestStatus, V v) {
        super(inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
        inMobiAdRequestStatus.getClass();
        v.getClass();
        this.a = inMobiAdRequestStatus;
        this.b = v;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdFetchFailureException(statusCode=" + this.a.getStatusCode() + ", statusMessage=" + this.a.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String() + ", adFetchError=" + this.b + ")";
    }
}
