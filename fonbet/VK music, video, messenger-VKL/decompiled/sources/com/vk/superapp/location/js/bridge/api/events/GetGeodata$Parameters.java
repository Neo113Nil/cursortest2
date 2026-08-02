package com.vk.superapp.location.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: GetGeodata.kt */
/* loaded from: classes6.dex */
public final class GetGeodata$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("wait_for_result")
    private final Boolean waitForResult;

    public GetGeodata$Parameters(String str, Boolean bool) {
        this.requestId = str;
        this.waitForResult = bool;
    }

    public static final GetGeodata$Parameters a(GetGeodata$Parameters getGeodata$Parameters) {
        return getGeodata$Parameters.requestId == null ? new GetGeodata$Parameters("default_request_id", getGeodata$Parameters.waitForResult) : getGeodata$Parameters;
    }

    public static final void b(GetGeodata$Parameters getGeodata$Parameters) {
        if (getGeodata$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.requestId;
    }

    public final Boolean d() {
        return this.waitForResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGeodata$Parameters)) {
            return false;
        }
        GetGeodata$Parameters getGeodata$Parameters = (GetGeodata$Parameters) obj;
        return epx.f(this.requestId, getGeodata$Parameters.requestId) && epx.f(this.waitForResult, getGeodata$Parameters.waitForResult);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Boolean bool = this.waitForResult;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", waitForResult=");
        return tn.a(sb, this.waitForResult, ')');
    }

    public /* synthetic */ GetGeodata$Parameters(String str, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
