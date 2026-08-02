package com.moloco.sdk.internal.services.bidtoken;

import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l);
    }

    public final int hashCode() {
        return Long.hashCode(200L) + wv8.a(3, Long.hashCode(2800L) * 31, 31);
    }

    public final String toString() {
        return "BidTokenHttpRequestInfo(requestTimeoutMillis=2800, fetchRetryMax=3, fetchRetryDelayMillis=200)";
    }
}
