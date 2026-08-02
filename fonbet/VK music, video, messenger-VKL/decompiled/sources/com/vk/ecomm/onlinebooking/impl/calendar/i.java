package com.vk.ecomm.onlinebooking.impl.calendar;

import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.c5g;
import xsna.e43;
import xsna.i5g;
import xsna.pt;
import xsna.rli0;
import xsna.ulp0;
import xsna.ym7;

/* compiled from: BookingCalendarScreenReducer.kt */
/* loaded from: classes18.dex */
public final class i {
    public static final BookingCalendarScreenState.TimeSlotSelector a(ym7 ym7Var) {
        ym7.b bVar = ym7Var.a;
        ym7.e eVar = ym7Var.f;
        if (bVar.b) {
            boolean a = eVar.a();
            List<ym7.d> list = eVar.d;
            List<ym7.d> list2 = eVar.c;
            List<ym7.d> list3 = eVar.b;
            List<ym7.d> list4 = eVar.a;
            if (!a) {
                ListBuilder e = e43.e();
                if (!list4.isEmpty()) {
                    BookingCalendarScreenState.TimeSlotSelector.Block.Kind kind = BookingCalendarScreenState.TimeSlotSelector.Block.Kind.Night;
                    List<ym7.d> list5 = list4;
                    ArrayList arrayList = new ArrayList(c5g.u(list5, 10));
                    for (ym7.d dVar : list5) {
                        arrayList.add(new BookingCalendarScreenState.TimeSlotSelector.b(dVar.a, bVar, dVar));
                    }
                    e.add(new BookingCalendarScreenState.TimeSlotSelector.Block(kind, arrayList));
                }
                if (!list3.isEmpty()) {
                    BookingCalendarScreenState.TimeSlotSelector.Block.Kind kind2 = BookingCalendarScreenState.TimeSlotSelector.Block.Kind.Morning;
                    List<ym7.d> list6 = list3;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list6, 10));
                    for (ym7.d dVar2 : list6) {
                        arrayList2.add(new BookingCalendarScreenState.TimeSlotSelector.b(dVar2.a, bVar, dVar2));
                    }
                    e.add(new BookingCalendarScreenState.TimeSlotSelector.Block(kind2, arrayList2));
                }
                if (!list2.isEmpty()) {
                    BookingCalendarScreenState.TimeSlotSelector.Block.Kind kind3 = BookingCalendarScreenState.TimeSlotSelector.Block.Kind.Day;
                    List<ym7.d> list7 = list2;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list7, 10));
                    for (ym7.d dVar3 : list7) {
                        arrayList3.add(new BookingCalendarScreenState.TimeSlotSelector.b(dVar3.a, bVar, dVar3));
                    }
                    e.add(new BookingCalendarScreenState.TimeSlotSelector.Block(kind3, arrayList3));
                }
                if (!list.isEmpty()) {
                    BookingCalendarScreenState.TimeSlotSelector.Block.Kind kind4 = BookingCalendarScreenState.TimeSlotSelector.Block.Kind.Evening;
                    List<ym7.d> list8 = list;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list8, 10));
                    for (ym7.d dVar4 : list8) {
                        arrayList4.add(new BookingCalendarScreenState.TimeSlotSelector.b(dVar4.a, bVar, dVar4));
                    }
                    e.add(new BookingCalendarScreenState.TimeSlotSelector.Block(kind4, arrayList4));
                }
                return new BookingCalendarScreenState.TimeSlotSelector.c(e.g());
            }
        }
        ym7.a aVar = bVar.a;
        return new BookingCalendarScreenState.TimeSlotSelector.a(aVar.d, aVar.c, (ym7Var.c == null || ym7Var.b || !ym7Var.d) ? false : true, ym7Var.e);
    }

    public static final BookingCalendarScreenState.DaySelector b(ym7 ym7Var) {
        return new BookingCalendarScreenState.DaySelector((List<BookingCalendarScreenState.DaySelector.a>) rli0.A(new ulp0(rli0.p(new i5g(ym7Var.g), new pt(9)), new com.vk.im.ui.fragments.b(ym7Var.a.a, 11))));
    }
}
