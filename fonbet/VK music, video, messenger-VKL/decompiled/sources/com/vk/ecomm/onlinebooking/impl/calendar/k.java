package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import xsna.epx;
import xsna.h0u0;
import xsna.tr;
import xsna.wow;
import xsna.yzt0;

/* compiled from: BookingCalendarScreenViewState.kt */
/* loaded from: classes18.dex */
public final class k {
    public final yzt0<wow<BookingCalendarScreenState.DaySelector.a>> a;

    public k(h0u0 h0u0Var) {
        this.a = h0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr.c(new StringBuilder("DaySelector(days="), this.a, ')');
    }
}
