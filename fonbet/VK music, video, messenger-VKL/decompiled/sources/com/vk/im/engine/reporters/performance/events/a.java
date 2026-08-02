package com.vk.im.engine.reporters.performance.events;

import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import defpackage.q0;
import xsna.epx;
import xsna.l5m;
import xsna.qrk0;
import xsna.urd0;

/* compiled from: VkmMsgSuccessRateEventBuilder.kt */
/* loaded from: classes2.dex */
public final class a extends l5m {
    public final VkmSuccessRateEventBuilder.EventName h;
    public final VkmSuccessRateEventBuilder.EventType i;
    public final String j;
    public final String k;
    public final String l;
    public final Integer m;
    public final boolean n;

    public a(VkmSuccessRateEventBuilder.EventName eventName, VkmSuccessRateEventBuilder.EventType eventType, String str, String str2, String str3, Integer num, boolean z) {
        super(null, null, 3);
        this.h = eventName;
        this.i = eventType;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = num;
        this.n = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.h == aVar.h && this.i == aVar.i && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && this.n == aVar.n;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a((this.i.hashCode() + (this.h.hashCode() * 31)) * 31, 31, this.j), 31, this.k), 31, this.l);
        Integer num = this.m;
        return Boolean.hashCode(this.n) + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkmMsgSuccessRateEventBuilder(eventName=");
        sb.append(this.h);
        sb.append(", eventType=");
        sb.append(this.i);
        sb.append(", networkType=");
        sb.append(this.j);
        sb.append(", attaches=");
        sb.append(this.k);
        sb.append(", error=");
        sb.append(this.l);
        sb.append(", duration=");
        sb.append(this.m);
        sb.append(", isAlreadySent=");
        return q0.a(sb, this.n, ')');
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        return new qrk0(new SchemeStat$TypeDevNullItem(DevNullEventKey.MESSENGER_LOADING_SUCCESS_RATE.h(), null, this.h.h(), Integer.valueOf(this.i.h()), this.j, this.m, this.k, this.n ? 1 : null, this.l, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -510, 3, null), false);
    }
}
