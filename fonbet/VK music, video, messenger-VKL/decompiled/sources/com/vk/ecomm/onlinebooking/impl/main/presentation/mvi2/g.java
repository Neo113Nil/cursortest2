package com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.d;

/* compiled from: BookingStartScreenEvent.kt */
/* loaded from: classes18.dex */
public final class g implements d.a {
    public final BookingServiceType a;

    public g(BookingServiceType bookingServiceType) {
        this.a = bookingServiceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    public final int hashCode() {
        BookingServiceType bookingServiceType = this.a;
        if (bookingServiceType == null) {
            return 0;
        }
        return bookingServiceType.hashCode();
    }

    public final String toString() {
        return "ChooseServicesFlow(type=" + this.a + ')';
    }
}
