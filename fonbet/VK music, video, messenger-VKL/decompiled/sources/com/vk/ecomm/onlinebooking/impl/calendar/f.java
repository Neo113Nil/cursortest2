package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.wow;

/* compiled from: BookingCalendarScreenReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class f extends FunctionReferenceImpl implements izs<BookingCalendarScreenState, wow<BookingCalendarScreenState.DaySelector.a>> {
    public static final f b = new f(1, i.class, "composeDays", "composeDays(Lcom/vk/ecomm/onlinebooking/impl/calendar/BookingCalendarScreenState;)Ljava/util/List;", 1);

    @Override // xsna.izs
    public final wow<BookingCalendarScreenState.DaySelector.a> invoke(BookingCalendarScreenState bookingCalendarScreenState) {
        return new wow<>(bookingCalendarScreenState.g.a);
    }
}
