package com.vk.ecomm.onlinebooking.impl.services.presentation;

import com.vk.ecomm.onlinebooking.impl.common.BookingError;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.services.presentation.BookingServicesScreenTask;
import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.c;
import com.vk.ecomm.onlinebooking.impl.services.presentation.e;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.al50;
import xsna.am0;
import xsna.ci3;
import xsna.dli0;
import xsna.fsk;
import xsna.hx7;
import xsna.i5g;
import xsna.j5g;
import xsna.lt0;
import xsna.on50;
import xsna.rli0;
import xsna.sj50;
import xsna.ulp0;
import xsna.xx0;

/* compiled from: BookingServicesScreenActor.kt */
/* loaded from: classes18.dex */
public final class b extends al50<BookingServicesScreenState, a, on50, BookingServicesScreenTask, e, c> {
    public final hx7.a c;
    public final BookingScreenParams d;

    public b(hx7.a aVar, BookingScreenParams bookingScreenParams, sj50<BookingServicesScreenState, on50, BookingServicesScreenTask, e, c> sj50Var) {
        super(sj50Var);
        this.c = aVar;
        this.d = bookingScreenParams;
    }

    public static List q(BookingServicesScreenState bookingServicesScreenState) {
        return rli0.A(new ulp0(rli0.j(dli0.d(new i5g(bookingServicesScreenState.h.values())), new am0(13)), new ci3(3)));
    }

    @Override // xsna.al50, xsna.qj50
    public final void init() {
        BookingScreenParams bookingScreenParams = this.d;
        a(new BookingServicesScreenTask.LoadData(bookingScreenParams));
        if (com.vk.ecomm.onlinebooking.impl.navhostfragment.c.a(bookingScreenParams) && !fsk.w(bookingScreenParams.e)) {
            c(new c.b(BookingError.ServiceIsNotAvailableForRebooking.b));
            c(new c.a.b(bookingScreenParams.b));
        }
    }

    @Override // xsna.qj50
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void p(a aVar) {
        BookingScreenParams bookingScreenParams;
        ArrayList v0;
        boolean z = aVar instanceof a.c;
        BookingScreenParams bookingScreenParams2 = this.d;
        if (z) {
            a(new BookingServicesScreenTask.LoadData(bookingScreenParams2));
            return;
        }
        boolean z2 = aVar instanceof a.h;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (z2) {
            BookingServicesScreenState.ServiceWrapper serviceWrapper = ((a.h) aVar).b;
            if (this.c.b) {
                e(new e.i(BookingServicesScreenState.ServiceWrapper.a(serviceWrapper, !serviceWrapper.c, false, 5)));
                c(new c.a.d(bookingScreenParams2.b, Collections.singletonList(Integer.valueOf(serviceWrapper.b.b))));
                p(a.e.b);
                return;
            }
            if (bookingScreenParams2.q == BookingServiceType.GROUP) {
                e(new e.g(BookingServicesScreenState.ServiceWrapper.a(serviceWrapper, !serviceWrapper.c, false, 5)));
                p(a.e.b);
                return;
            }
            BookingServicesScreenState bookingServicesScreenState = (BookingServicesScreenState) sj50Var.getCurrentState();
            List q = q((BookingServicesScreenState) sj50Var.getCurrentState());
            if (bookingServicesScreenState.m) {
                return;
            }
            boolean z3 = serviceWrapper.d;
            boolean z4 = serviceWrapper.c;
            if (z3) {
                return;
            }
            e(new e.h(BookingServicesScreenState.ServiceWrapper.a(serviceWrapper, !z4, false, 5)));
            BookingServiceModel bookingServiceModel = serviceWrapper.b;
            if (z4) {
                v0 = new ArrayList();
                for (Object obj : q) {
                    if (((BookingServiceModel) obj).b != bookingServiceModel.b) {
                        v0.add(obj);
                    }
                }
            } else {
                v0 = j5g.v0(bookingServiceModel, q);
            }
            if (v0.isEmpty()) {
                e(new e.b(EmptyList.b));
                return;
            } else {
                a(new BookingServicesScreenTask.LoadAvailableServices(bookingScreenParams2.b, bookingScreenParams2.f, q((BookingServicesScreenState) sj50Var.getCurrentState())));
                return;
            }
        }
        if (aVar instanceof a.g) {
            e(new e.f(((a.g) aVar).b));
            return;
        }
        if (aVar instanceof a.f) {
            e(new e.C0984e(((a.f) aVar).b));
            return;
        }
        if (aVar instanceof a.C0979a) {
            e(e.a.a);
            return;
        }
        if (!(aVar instanceof a.e)) {
            if (!(aVar instanceof a.d)) {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c(c.InterfaceC0982c.a.a);
                return;
            } else if (((BookingServicesScreenState) sj50Var.getCurrentState()).i.length() == 0) {
                c(c.InterfaceC0982c.b.a);
                return;
            } else {
                e(e.a.a);
                return;
            }
        }
        BookingServicesScreenState bookingServicesScreenState2 = (BookingServicesScreenState) sj50Var.getCurrentState();
        BookingScreenParams bookingScreenParams3 = bookingServicesScreenState2.b;
        if (bookingScreenParams3 != null) {
            Map<Integer, List<BookingServicesScreenState.ServiceWrapper>> map = bookingServicesScreenState2.h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, List<BookingServicesScreenState.ServiceWrapper>> entry : map.entrySet()) {
                if (entry.getKey().intValue() != -1) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            bookingScreenParams = BookingScreenParams.a(bookingScreenParams3, 0, null, rli0.A(new ulp0(rli0.j(dli0.d(new i5g(linkedHashMap.values())), new lt0(12)), new xx0(4))), null, null, 0, null, 0, null, 131063);
        } else {
            bookingScreenParams = null;
        }
        c(new c.InterfaceC0982c.C0983c(bookingScreenParams));
    }
}
