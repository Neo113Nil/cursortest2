package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: Scroll.kt */
/* loaded from: classes6.dex */
public final class Scroll$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("speed")
    private final Integer speed;

    @pmi0("top")
    private final int top;

    public Scroll$Parameters(int i, String str, Integer num) {
        this.top = i;
        this.requestId = str;
        this.speed = num;
    }

    public static final Scroll$Parameters a(Scroll$Parameters scroll$Parameters) {
        return scroll$Parameters.requestId == null ? new Scroll$Parameters(scroll$Parameters.top, "default_request_id", scroll$Parameters.speed) : scroll$Parameters;
    }

    public static final void b(Scroll$Parameters scroll$Parameters) {
        Integer num = scroll$Parameters.speed;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Value speed cannot be less than 0");
        }
    }

    public static final void c(Scroll$Parameters scroll$Parameters) {
        if (scroll$Parameters.top < 0) {
            throw new IllegalArgumentException("Value top cannot be less than 0");
        }
    }

    public static final void d(Scroll$Parameters scroll$Parameters) {
        if (scroll$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scroll$Parameters)) {
            return false;
        }
        Scroll$Parameters scroll$Parameters = (Scroll$Parameters) obj;
        return this.top == scroll$Parameters.top && epx.f(this.requestId, scroll$Parameters.requestId) && epx.f(this.speed, scroll$Parameters.speed);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.top) * 31, 31, this.requestId);
        Integer num = this.speed;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(top=");
        sb.append(this.top);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", speed=");
        return uqi.b(sb, this.speed, ')');
    }

    public /* synthetic */ Scroll$Parameters(int i, String str, Integer num, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : num);
    }
}
