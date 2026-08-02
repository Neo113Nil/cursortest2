package com.vk.superapp.vibration.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: TapticSelectionChanged.kt */
/* loaded from: classes6.dex */
public final class TapticSelectionChanged$Parameters implements ad6 {

    @pmi0("disable_vibration_fallback")
    private final Boolean disableVibrationFallback;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public TapticSelectionChanged$Parameters(String str, Boolean bool) {
        this.requestId = str;
        this.disableVibrationFallback = bool;
    }

    public static final TapticSelectionChanged$Parameters a(TapticSelectionChanged$Parameters tapticSelectionChanged$Parameters) {
        return tapticSelectionChanged$Parameters.requestId == null ? new TapticSelectionChanged$Parameters("default_request_id", tapticSelectionChanged$Parameters.disableVibrationFallback) : tapticSelectionChanged$Parameters;
    }

    public static final void b(TapticSelectionChanged$Parameters tapticSelectionChanged$Parameters) {
        if (tapticSelectionChanged$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final Boolean c() {
        return this.disableVibrationFallback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapticSelectionChanged$Parameters)) {
            return false;
        }
        TapticSelectionChanged$Parameters tapticSelectionChanged$Parameters = (TapticSelectionChanged$Parameters) obj;
        return epx.f(this.requestId, tapticSelectionChanged$Parameters.requestId) && epx.f(this.disableVibrationFallback, tapticSelectionChanged$Parameters.disableVibrationFallback);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Boolean bool = this.disableVibrationFallback;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", disableVibrationFallback=");
        return tn.a(sb, this.disableVibrationFallback, ')');
    }

    public /* synthetic */ TapticSelectionChanged$Parameters(String str, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
