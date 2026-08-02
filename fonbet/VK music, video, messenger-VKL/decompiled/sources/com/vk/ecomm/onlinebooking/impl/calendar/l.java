package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import xsna.epx;
import xsna.h0u0;
import xsna.tr;
import xsna.yzt0;

/* compiled from: BookingCalendarScreenViewState.kt */
/* loaded from: classes18.dex */
public final class l {
    public final yzt0<BookingCalendarScreenState.TimeSlotSelector> a;

    public l(h0u0 h0u0Var) {
        this.a = h0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr.c(new StringBuilder("TimeSlotSelector(variant="), this.a, ')');
    }
}
