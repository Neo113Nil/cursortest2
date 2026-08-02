package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.ecomm.onlinebooking.impl.calendar.e;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.dm50;
import xsna.j5g;
import xsna.nt;
import xsna.tn7;
import xsna.ym7;

/* compiled from: BookingCalendarScreenReducer.kt */
/* loaded from: classes18.dex */
public final class h extends dm50<tn7, e, BookingCalendarScreenState> {
    @Override // xsna.dm50
    public final BookingCalendarScreenState c(BookingCalendarScreenState bookingCalendarScreenState, e eVar) {
        Object obj;
        Object obj2;
        ym7.b bVar;
        List<ym7.b> list;
        BookingCalendarScreenState bookingCalendarScreenState2 = bookingCalendarScreenState;
        e eVar2 = eVar;
        if (eVar2 instanceof e.i) {
            return BookingCalendarScreenState.a(bookingCalendarScreenState2, false, false, null, ((e.i) eVar2).b, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        }
        if (eVar2.equals(e.j.b)) {
            return BookingCalendarScreenState.a(bookingCalendarScreenState2, true, false, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
        if (eVar2.equals(e.g.b)) {
            return BookingCalendarScreenState.a(bookingCalendarScreenState2, false, false, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
        if (eVar2 instanceof e.h) {
            e.h hVar = (e.h) eVar2;
            return BookingCalendarScreenState.a(bookingCalendarScreenState2, false, false, new BookingCalendarScreenState.a(com.vk.ecomm.onlinebooking.impl.common.b.c(hVar.b), hVar.c, hVar.d), null, null, null, null, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
        }
        if (eVar2 instanceof e.c) {
            ym7 ym7Var = ((e.c) eVar2).b;
            return BookingCalendarScreenState.a(bookingCalendarScreenState2, false, false, null, null, ym7Var, i.b(ym7Var), i.a(ym7Var), 9);
        }
        if (eVar2.equals(e.C0954e.b)) {
            return BookingCalendarScreenState.a(bookingCalendarScreenState2, false, true, null, null, ym7.a(bookingCalendarScreenState2.f, null, false, ym7.e.e, null, 95), null, new BookingCalendarScreenState.TimeSlotSelector.c(EmptyList.b), 41);
        }
        if (!(eVar2 instanceof e.b)) {
            if (eVar2 instanceof e.a) {
                ym7 a = ym7.a(bookingCalendarScreenState2.f, ((e.a) eVar2).b, false, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return BookingCalendarScreenState.a(bookingCalendarScreenState2, false, true, null, null, a, i.b(a), null, 73);
            }
            if (eVar2 instanceof e.f) {
                return BookingCalendarScreenState.a(bookingCalendarScreenState2, false, true, null, null, ym7.a(bookingCalendarScreenState2.f, null, false, ym7.e.e, null, 95), null, new BookingCalendarScreenState.TimeSlotSelector.c(EmptyList.b), 41);
            }
            if (!(eVar2 instanceof e.d)) {
                throw new NoWhenBranchMatchedException();
            }
            ym7 a2 = ym7.a(bookingCalendarScreenState2.f, null, false, ((e.d) eVar2).b, null, 95);
            return BookingCalendarScreenState.a(bookingCalendarScreenState2, false, false, null, null, a2, null, i.a(a2), 41);
        }
        e.b bVar2 = (e.b) eVar2;
        List<ym7.c> list2 = bVar2.c;
        ym7.a aVar = bookingCalendarScreenState2.f.a.a;
        List<ym7.c> list3 = list2;
        Iterator<T> it = list3.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            ym7.c cVar = (ym7.c) obj2;
            if (cVar.a == aVar.b && cVar.b == aVar.c) {
                break;
            }
        }
        ym7.c cVar2 = (ym7.c) obj2;
        ym7.a aVar2 = ym7.a.g;
        if (cVar2 == null) {
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!((ym7.c) next).c.isEmpty()) {
                    obj = next;
                    break;
                }
            }
            ym7.c cVar3 = (ym7.c) obj;
            if (cVar3 == null || (list = cVar3.c) == null || (bVar = (ym7.b) j5g.a0(list)) == null) {
                bVar = new ym7.b(aVar2, true);
            }
        } else {
            List<ym7.b> list4 = cVar2.c;
            Iterator<T> it3 = list4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (((ym7.b) next2).a.d == aVar.d) {
                    obj = next2;
                    break;
                }
            }
            ym7.b bVar3 = (ym7.b) obj;
            if (bVar3 == null) {
                bVar = (ym7.b) j5g.a0(list4);
                if (bVar == null) {
                    bVar = new ym7.b(aVar2, true);
                }
            } else {
                bVar = bVar3;
            }
        }
        ym7 a3 = ym7.a(bookingCalendarScreenState2.f, bVar, bVar2.b, ym7.e.e, bVar2.c, 28);
        return BookingCalendarScreenState.a(bookingCalendarScreenState2, false, true, null, null, a3, i.b(a3), new BookingCalendarScreenState.TimeSlotSelector.c(EmptyList.b), 9);
    }

    @Override // xsna.dm50
    public final tn7 d() {
        return new tn7(e(new nt(7)));
    }

    @Override // xsna.dm50
    public final void h(BookingCalendarScreenState bookingCalendarScreenState, tn7 tn7Var) {
        f(tn7Var.a, bookingCalendarScreenState);
    }
}
