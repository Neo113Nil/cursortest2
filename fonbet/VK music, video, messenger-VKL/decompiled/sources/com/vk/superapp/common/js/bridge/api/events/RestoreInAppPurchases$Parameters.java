package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: RestoreInAppPurchases.kt */
/* loaded from: classes6.dex */
public final class RestoreInAppPurchases$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("show_hud")
    private final Boolean showHud;

    public RestoreInAppPurchases$Parameters(String str, Boolean bool) {
        this.requestId = str;
        this.showHud = bool;
    }

    public static final RestoreInAppPurchases$Parameters a(RestoreInAppPurchases$Parameters restoreInAppPurchases$Parameters) {
        return restoreInAppPurchases$Parameters.requestId == null ? new RestoreInAppPurchases$Parameters("default_request_id", restoreInAppPurchases$Parameters.showHud) : restoreInAppPurchases$Parameters;
    }

    public static final void b(RestoreInAppPurchases$Parameters restoreInAppPurchases$Parameters) {
        if (restoreInAppPurchases$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestoreInAppPurchases$Parameters)) {
            return false;
        }
        RestoreInAppPurchases$Parameters restoreInAppPurchases$Parameters = (RestoreInAppPurchases$Parameters) obj;
        return epx.f(this.requestId, restoreInAppPurchases$Parameters.requestId) && epx.f(this.showHud, restoreInAppPurchases$Parameters.showHud);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Boolean bool = this.showHud;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", showHud=");
        return tn.a(sb, this.showHud, ')');
    }

    public /* synthetic */ RestoreInAppPurchases$Parameters(String str, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
