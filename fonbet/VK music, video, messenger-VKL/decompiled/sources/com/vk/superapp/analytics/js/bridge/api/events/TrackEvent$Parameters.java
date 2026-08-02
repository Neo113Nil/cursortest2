package com.vk.superapp.analytics.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.b9y;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: TrackEvent.kt */
/* loaded from: classes6.dex */
public final class TrackEvent$Parameters implements ad6 {

    @pmi0("custom_user_id")
    private final String customUserId;

    @pmi0("event_name")
    private final String eventName;

    @pmi0("event_params")
    private final b9y eventParams;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public TrackEvent$Parameters(String str, String str2, String str3, b9y b9yVar) {
        this.eventName = str;
        this.requestId = str2;
        this.customUserId = str3;
        this.eventParams = b9yVar;
    }

    public static final TrackEvent$Parameters a(TrackEvent$Parameters trackEvent$Parameters) {
        return trackEvent$Parameters.requestId == null ? new TrackEvent$Parameters(trackEvent$Parameters.eventName, "default_request_id", trackEvent$Parameters.customUserId, trackEvent$Parameters.eventParams) : trackEvent$Parameters;
    }

    public static final void b(TrackEvent$Parameters trackEvent$Parameters) {
        if (trackEvent$Parameters.eventName.length() < 1) {
            throw new IllegalArgumentException("Value eventName cannot be less than 1");
        }
    }

    public static final void c(TrackEvent$Parameters trackEvent$Parameters) {
        if (trackEvent$Parameters.eventName == null) {
            throw new IllegalArgumentException("Value of non-nullable member eventName cannot be\n                        null");
        }
        if (trackEvent$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String d() {
        return this.customUserId;
    }

    public final String e() {
        return this.eventName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackEvent$Parameters)) {
            return false;
        }
        TrackEvent$Parameters trackEvent$Parameters = (TrackEvent$Parameters) obj;
        return epx.f(this.eventName, trackEvent$Parameters.eventName) && epx.f(this.requestId, trackEvent$Parameters.requestId) && epx.f(this.customUserId, trackEvent$Parameters.customUserId) && epx.f(this.eventParams, trackEvent$Parameters.eventParams);
    }

    public final b9y f() {
        return this.eventParams;
    }

    public final String g() {
        return this.requestId;
    }

    public final int hashCode() {
        int a = urd0.a(this.eventName.hashCode() * 31, 31, this.requestId);
        String str = this.customUserId;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        b9y b9yVar = this.eventParams;
        return hashCode + (b9yVar != null ? b9yVar.hashCode() : 0);
    }

    public final String toString() {
        return "Parameters(eventName=" + this.eventName + ", requestId=" + this.requestId + ", customUserId=" + this.customUserId + ", eventParams=" + this.eventParams + ')';
    }

    public /* synthetic */ TrackEvent$Parameters(String str, String str2, String str3, b9y b9yVar, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : b9yVar);
    }
}
