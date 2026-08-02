package com.vk.ecomm.onlinebooking.impl.services.presentation.model;

import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingSettings;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.a;
import xsna.hx7;
import xsna.izs;

/* compiled from: BookingServicesStateToViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class b implements izs<BookingServicesScreenState, a> {
    public static final b b = new b();

    @Override // xsna.izs
    public final a invoke(BookingServicesScreenState bookingServicesScreenState) {
        BookingServiceType bookingServiceType;
        BookingServicesScreenState.c cVar;
        a.InterfaceC0987a c0988a;
        BookingSettings bookingSettings;
        BookingServicesScreenState bookingServicesScreenState2 = bookingServicesScreenState;
        BookingScreenParams bookingScreenParams = bookingServicesScreenState2.b;
        if (bookingScreenParams == null || (bookingServiceType = bookingScreenParams.q) == null) {
            bookingServiceType = BookingServiceType.INDIVIDUAL;
        }
        hx7.a aVar = bookingServicesScreenState2.n;
        BookingServicesScreenState.f fVar = new BookingServicesScreenState.f(aVar.a);
        if (bookingServicesScreenState2.c) {
            c0988a = a.InterfaceC0987a.c.a;
        } else {
            BookingServicesScreenState.d dVar = bookingServicesScreenState2.d;
            if (dVar != null) {
                c0988a = new a.InterfaceC0987a.b(dVar);
            } else {
                boolean z = aVar.b;
                if (z) {
                    cVar = BookingServicesScreenState.c.b.d;
                } else {
                    cVar = (bookingScreenParams != null ? bookingScreenParams.q : null) == BookingServiceType.GROUP ? BookingServicesScreenState.c.b.d : BookingServicesScreenState.c.a.d;
                }
                c0988a = new a.InterfaceC0987a.C0988a(bookingServicesScreenState2.k, bookingServicesScreenState2.j, bookingServicesScreenState2.h, bookingServicesScreenState2.e, bookingServicesScreenState2.i, bookingServicesScreenState2.l, (bookingScreenParams == null || (bookingSettings = bookingScreenParams.d) == null) ? "" : bookingSettings.c, cVar, new BookingServicesScreenState.b(Boolean.valueOf(z).equals(Boolean.FALSE)));
            }
        }
        return new a(bookingServiceType, fVar, c0988a);
    }
}
