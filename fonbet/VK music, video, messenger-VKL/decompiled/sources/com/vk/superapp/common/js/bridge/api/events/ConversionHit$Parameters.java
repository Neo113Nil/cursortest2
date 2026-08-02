package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.reactivex.rxjava3.subjects.b;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ConversionHit.kt */
/* loaded from: classes6.dex */
public final class ConversionHit$Parameters implements ad6 {

    @pmi0("conversion_event")
    private final String conversionEvent;

    @pmi0("conversion_value")
    private final float conversionValue;

    @pmi0("pixel_code")
    private final String pixelCode;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public ConversionHit$Parameters(String str, String str2, float f, String str3) {
        this.pixelCode = str;
        this.conversionEvent = str2;
        this.conversionValue = f;
        this.requestId = str3;
    }

    public static final ConversionHit$Parameters a(ConversionHit$Parameters conversionHit$Parameters) {
        return conversionHit$Parameters.requestId == null ? new ConversionHit$Parameters(conversionHit$Parameters.pixelCode, conversionHit$Parameters.conversionEvent, conversionHit$Parameters.conversionValue, "default_request_id") : conversionHit$Parameters;
    }

    public static final void b(ConversionHit$Parameters conversionHit$Parameters) {
        if (conversionHit$Parameters.pixelCode == null) {
            throw new IllegalArgumentException("Value of non-nullable member pixelCode cannot be\n                        null");
        }
        if (conversionHit$Parameters.conversionEvent == null) {
            throw new IllegalArgumentException("Value of non-nullable member conversionEvent\n                        cannot be null");
        }
        if (conversionHit$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.conversionEvent;
    }

    public final float d() {
        return this.conversionValue;
    }

    public final String e() {
        return this.pixelCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversionHit$Parameters)) {
            return false;
        }
        ConversionHit$Parameters conversionHit$Parameters = (ConversionHit$Parameters) obj;
        return epx.f(this.pixelCode, conversionHit$Parameters.pixelCode) && epx.f(this.conversionEvent, conversionHit$Parameters.conversionEvent) && Float.compare(this.conversionValue, conversionHit$Parameters.conversionValue) == 0 && epx.f(this.requestId, conversionHit$Parameters.requestId);
    }

    public final String f() {
        return this.requestId;
    }

    public final int hashCode() {
        return this.requestId.hashCode() + b.a(this.conversionValue, urd0.a(this.pixelCode.hashCode() * 31, 31, this.conversionEvent), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(pixelCode=");
        sb.append(this.pixelCode);
        sb.append(", conversionEvent=");
        sb.append(this.conversionEvent);
        sb.append(", conversionValue=");
        sb.append(this.conversionValue);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }
}
