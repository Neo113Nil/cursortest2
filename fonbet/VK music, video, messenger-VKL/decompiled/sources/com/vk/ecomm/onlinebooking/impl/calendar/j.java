package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import xsna.epx;
import xsna.fm50;
import xsna.h0u0;
import xsna.sn7;
import xsna.sr;
import xsna.tr;
import xsna.yzt0;

/* compiled from: BookingCalendarScreenViewState.kt */
/* loaded from: classes18.dex */
public final class j implements fm50 {
    public final yzt0<sn7> a;
    public final k b;
    public final l c;
    public final yzt0<Boolean> d;
    public final yzt0<Boolean> e;
    public final yzt0<BookingCalendarScreenState.a> f;

    public j(h0u0 h0u0Var, k kVar, l lVar, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
        this.a = h0u0Var;
        this.b = kVar;
        this.c = lVar;
        this.d = h0u0Var2;
        this.e = h0u0Var3;
        this.f = h0u0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c) && epx.f(this.d, jVar.d) && epx.f(this.e, jVar.e) && epx.f(this.f, jVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + sr.a(this.e, sr.a(this.d, sr.a(this.c.a, sr.a(this.b.a, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(masterFilter=");
        sb.append(this.a);
        sb.append(", daySelector=");
        sb.append(this.b);
        sb.append(", timeSlotSelector=");
        sb.append(this.c);
        sb.append(", fullScreenLoader=");
        sb.append(this.d);
        sb.append(", timeSlotsLoader=");
        sb.append(this.e);
        sb.append(", error=");
        return tr.c(sb, this.f, ')');
    }
}
