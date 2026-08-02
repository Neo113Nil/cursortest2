package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d;
import xsna.epx;

/* compiled from: BookingStartScreenEvent.kt */
/* loaded from: classes18.dex */
public final class h implements d.a {
    public final Integer a;
    public final BookingServiceType b;

    public h(Integer num, BookingServiceType bookingServiceType) {
        this.a = num;
        this.b = bookingServiceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return epx.f(this.a, hVar.a) && this.b == hVar.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        BookingServiceType bookingServiceType = this.b;
        return hashCode + (bookingServiceType != null ? bookingServiceType.hashCode() : 0);
    }

    public final String toString() {
        return "Reschedule(recordId=" + this.a + ", type=" + this.b + ')';
    }
}
