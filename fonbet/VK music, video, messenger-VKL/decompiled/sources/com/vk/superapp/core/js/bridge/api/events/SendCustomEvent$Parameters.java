package com.vk.superapp.core.js.bridge.api.events;

import androidx.core.app.NotificationCompat;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SendCustomEvent.kt */
/* loaded from: classes6.dex */
public final class SendCustomEvent$Parameters implements ad6 {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final String event;

    @pmi0("json")
    private final String json;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("screen")
    private final String screen;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    private final String timezone;

    @pmi0("type")
    private final String type;

    public SendCustomEvent$Parameters(String str, String str2, String str3, String str4, String str5, String str6) {
        this.event = str;
        this.requestId = str2;
        this.type = str3;
        this.timezone = str4;
        this.json = str5;
        this.screen = str6;
    }

    public static final SendCustomEvent$Parameters a(SendCustomEvent$Parameters sendCustomEvent$Parameters) {
        return sendCustomEvent$Parameters.requestId == null ? new SendCustomEvent$Parameters(sendCustomEvent$Parameters.event, "default_request_id", sendCustomEvent$Parameters.type, sendCustomEvent$Parameters.timezone, sendCustomEvent$Parameters.json, sendCustomEvent$Parameters.screen) : sendCustomEvent$Parameters;
    }

    public static final void b(SendCustomEvent$Parameters sendCustomEvent$Parameters) {
        if (sendCustomEvent$Parameters.event == null) {
            throw new IllegalArgumentException("Value of non-nullable member event cannot be\n                        null");
        }
        if (sendCustomEvent$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.event;
    }

    public final String d() {
        return this.json;
    }

    public final String e() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendCustomEvent$Parameters)) {
            return false;
        }
        SendCustomEvent$Parameters sendCustomEvent$Parameters = (SendCustomEvent$Parameters) obj;
        return epx.f(this.event, sendCustomEvent$Parameters.event) && epx.f(this.requestId, sendCustomEvent$Parameters.requestId) && epx.f(this.type, sendCustomEvent$Parameters.type) && epx.f(this.timezone, sendCustomEvent$Parameters.timezone) && epx.f(this.json, sendCustomEvent$Parameters.json) && epx.f(this.screen, sendCustomEvent$Parameters.screen);
    }

    public final String f() {
        return this.screen;
    }

    public final String g() {
        return this.timezone;
    }

    public final String h() {
        return this.type;
    }

    public final int hashCode() {
        int a = urd0.a(this.event.hashCode() * 31, 31, this.requestId);
        String str = this.type;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timezone;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.json;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.screen;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(event=");
        sb.append(this.event);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", timezone=");
        sb.append(this.timezone);
        sb.append(", json=");
        sb.append(this.json);
        sb.append(", screen=");
        return ho8.a(sb, this.screen, ')');
    }

    public /* synthetic */ SendCustomEvent$Parameters(String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
