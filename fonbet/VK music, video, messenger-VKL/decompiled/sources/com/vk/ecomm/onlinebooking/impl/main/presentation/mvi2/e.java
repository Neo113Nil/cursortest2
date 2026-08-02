package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d;
import xsna.epx;

/* compiled from: BookingStartScreenEvent.kt */
/* loaded from: classes18.dex */
public final class e implements d.a {
    public final Integer a;
    public final BookingServiceType b;

    public e(Integer num, BookingServiceType bookingServiceType) {
        this.a = num;
        this.b = bookingServiceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return epx.f(this.a, eVar.a) && this.b == eVar.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        BookingServiceType bookingServiceType = this.b;
        return hashCode + (bookingServiceType != null ? bookingServiceType.hashCode() : 0);
    }

    public final String toString() {
        return "Cancel(recordId=" + this.a + ", type=" + this.b + ')';
    }
}
