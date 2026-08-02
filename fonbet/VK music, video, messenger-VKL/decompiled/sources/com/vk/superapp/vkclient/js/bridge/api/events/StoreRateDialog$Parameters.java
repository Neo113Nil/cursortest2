package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StoreRateDialog.kt */
/* loaded from: classes6.dex */
public final class StoreRateDialog$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public StoreRateDialog$Parameters(String str) {
        this.requestId = str;
    }

    public static final StoreRateDialog$Parameters a(StoreRateDialog$Parameters storeRateDialog$Parameters) {
        return storeRateDialog$Parameters.requestId == null ? new StoreRateDialog$Parameters("default_request_id") : storeRateDialog$Parameters;
    }

    public static final void b(StoreRateDialog$Parameters storeRateDialog$Parameters) {
        if (storeRateDialog$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreRateDialog$Parameters) && epx.f(this.requestId, ((StoreRateDialog$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
