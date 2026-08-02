package com.vk.ecomm.onlinebooking.impl.services.presentation;

import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.ecomm.onlinebooking.impl.services.presentation.e;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.bm50;
import xsna.c5g;
import xsna.epx;
import xsna.ft7;
import xsna.i5g;
import xsna.j5g;
import xsna.on00;
import xsna.ow7;
import xsna.py7;
import xsna.qy7;
import xsna.rli0;
import xsna.ry7;
import xsna.sy7;
import xsna.ty7;
import xsna.ulp0;

/* compiled from: BookingServicesScreenReducer.kt */
/* loaded from: classes18.dex */
public final class f implements bm50<BookingServicesScreenState, e> {
    public static BookingServicesScreenState.e c(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            BookingServicesScreenState.ServiceWrapper serviceWrapper = (BookingServicesScreenState.ServiceWrapper) arrayList.get(i3);
            if (serviceWrapper.c) {
                i++;
                i2 += serviceWrapper.b.k;
            }
        }
        return new BookingServicesScreenState.e(i, i2, ft7.a.a(new ulp0(rli0.j(new i5g(arrayList), ry7.b), sy7.b)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v47 */
    @Override // xsna.bm50
    public final BookingServicesScreenState a(BookingServicesScreenState bookingServicesScreenState, e eVar) {
        LinkedHashMap linkedHashMap;
        Integer num;
        BookingServicesScreenState bookingServicesScreenState2 = bookingServicesScreenState;
        e eVar2 = eVar;
        Map<Integer, List<BookingServicesScreenState.ServiceWrapper>> map = bookingServicesScreenState2.h;
        if (eVar2 instanceof e.d) {
            return BookingServicesScreenState.a(bookingServicesScreenState2, ((e.d) eVar2).a, false, null, null, null, null, null, null, null, false, 16382);
        }
        if (eVar2 instanceof qy7) {
            return BookingServicesScreenState.a(bookingServicesScreenState2, null, true, null, null, null, null, null, null, null, false, 16381);
        }
        ArrayList arrayList = null;
        ow7 ow7Var = 0;
        if (eVar2 instanceof py7) {
            py7 py7Var = (py7) eVar2;
            List<ow7> list = py7Var.b;
            List<BookingServiceModel> list2 = py7Var.a;
            List<ow7> list3 = list;
            List D0 = j5g.D0(new ty7(), list3);
            Iterator it = list3.iterator();
            if (it.hasNext()) {
                ow7Var = it.next();
                if (it.hasNext()) {
                    int i = ((ow7) ow7Var).c;
                    boolean z = ow7Var;
                    while (true) {
                        Object next = it.next();
                        int i2 = ((ow7) next).c;
                        ow7Var = z;
                        if (i > i2) {
                            ow7Var = next;
                            i = i2;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        z = ow7Var;
                    }
                }
            }
            ow7 ow7Var2 = ow7Var;
            List<BookingServiceModel> list4 = py7Var.a;
            ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
            for (BookingServiceModel bookingServiceModel : list4) {
                arrayList2.add(new BookingServicesScreenState.ServiceWrapper(bookingServiceModel, py7Var.c.contains(Integer.valueOf(bookingServiceModel.b)), false));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                Integer num2 = ((BookingServicesScreenState.ServiceWrapper) next2).b.d;
                Integer valueOf = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                Object obj = linkedHashMap2.get(valueOf);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap2.put(valueOf, obj);
                }
                ((List) obj).add(next2);
            }
            return BookingServicesScreenState.a(bookingServicesScreenState2, null, false, null, D0, list2, linkedHashMap2, null, ow7Var2, null, false, 15657);
        }
        if (eVar2 instanceof e.c) {
            e.c cVar = (e.c) eVar2;
            return BookingServicesScreenState.a(bookingServicesScreenState2, null, false, new BookingServicesScreenState.d(com.vk.ecomm.onlinebooking.impl.common.b.c(cVar.a), cVar.b), null, null, null, null, null, null, false, 16377);
        }
        if (eVar2 instanceof e.h) {
            e.h hVar = (e.h) eVar2;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(map);
            for (Map.Entry<Integer, List<BookingServicesScreenState.ServiceWrapper>> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                List<BookingServicesScreenState.ServiceWrapper> value = entry.getValue();
                Integer valueOf2 = Integer.valueOf(intValue);
                List<BookingServicesScreenState.ServiceWrapper> list5 = value;
                ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
                for (BookingServicesScreenState.ServiceWrapper serviceWrapper : list5) {
                    BookingServiceModel bookingServiceModel2 = serviceWrapper.b;
                    int i3 = bookingServiceModel2.b;
                    BookingServicesScreenState.ServiceWrapper serviceWrapper2 = hVar.a;
                    BookingServiceModel bookingServiceModel3 = serviceWrapper2.b;
                    if (i3 == bookingServiceModel3.b) {
                        serviceWrapper = !epx.f(bookingServiceModel2.d, bookingServiceModel3.d) ? BookingServicesScreenState.ServiceWrapper.a(serviceWrapper, serviceWrapper2.c, false, 5) : serviceWrapper2;
                    }
                    arrayList3.add(serviceWrapper);
                }
                linkedHashMap3.put(valueOf2, arrayList3);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                if (((Number) entry2.getKey()).intValue() != -1) {
                    linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                }
            }
            return BookingServicesScreenState.a(bookingServicesScreenState2, null, false, null, null, null, linkedHashMap3, null, null, c(c5g.v(linkedHashMap4.values())), false, 14207);
        }
        if (eVar2 instanceof e.g) {
            BookingServicesScreenState.ServiceWrapper serviceWrapper3 = ((e.g) eVar2).a;
            BookingServiceModel bookingServiceModel4 = serviceWrapper3.b;
            Integer num3 = bookingServiceModel4.d;
            int intValue2 = num3 != null ? num3.intValue() : 0;
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(on00.e(map.size()));
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it3.next();
                Object key = entry3.getKey();
                List list6 = (List) entry3.getValue();
                ArrayList arrayList4 = new ArrayList(c5g.u(list6, 10));
                Iterator it4 = list6.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(BookingServicesScreenState.ServiceWrapper.a((BookingServicesScreenState.ServiceWrapper) it4.next(), false, false, 5));
                }
                linkedHashMap5.put(key, arrayList4);
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(linkedHashMap5);
            List list7 = (List) linkedHashMap6.get(Integer.valueOf(intValue2));
            if (list7 != null) {
                Integer valueOf3 = Integer.valueOf(intValue2);
                List<BookingServicesScreenState.ServiceWrapper> list8 = list7;
                ArrayList arrayList5 = new ArrayList(c5g.u(list8, 10));
                for (BookingServicesScreenState.ServiceWrapper serviceWrapper4 : list8) {
                    if (serviceWrapper4.b.b == bookingServiceModel4.b) {
                        serviceWrapper4 = serviceWrapper3;
                    }
                    arrayList5.add(serviceWrapper4);
                }
                linkedHashMap6.put(valueOf3, arrayList5);
            }
            return BookingServicesScreenState.a(bookingServicesScreenState2, null, false, null, null, null, linkedHashMap6, null, null, c(c5g.v(linkedHashMap6.values())), false, 14207);
        }
        if (eVar2 instanceof e.i) {
            LinkedHashMap linkedHashMap7 = new LinkedHashMap(map);
            BookingServicesScreenState.ServiceWrapper serviceWrapper5 = ((e.i) eVar2).a;
            BookingServiceModel bookingServiceModel5 = serviceWrapper5.b;
            List<BookingServicesScreenState.ServiceWrapper> list9 = map.get(bookingServiceModel5.d);
            if (list9 != null) {
                List<BookingServicesScreenState.ServiceWrapper> list10 = list9;
                arrayList = new ArrayList(c5g.u(list10, 10));
                for (BookingServicesScreenState.ServiceWrapper serviceWrapper6 : list10) {
                    arrayList.add(serviceWrapper6.b.b == bookingServiceModel5.b ? serviceWrapper5 : BookingServicesScreenState.ServiceWrapper.a(serviceWrapper6, false, false, 5));
                }
            }
            if (arrayList != null && (num = bookingServiceModel5.d) != null) {
                linkedHashMap7.put(num, arrayList);
            }
            return BookingServicesScreenState.a(bookingServicesScreenState2, null, false, null, null, null, linkedHashMap7, null, null, c(c5g.v(linkedHashMap7.values())), false, 14207);
        }
        if (eVar2 instanceof e.f) {
            return BookingServicesScreenState.a(bookingServicesScreenState2, null, false, null, null, null, null, null, ((e.f) eVar2).a, null, false, 15871);
        }
        if (!(eVar2 instanceof e.b)) {
            return eVar2 instanceof e.C0984e ? BookingServicesScreenState.a(bookingServicesScreenState2, null, false, null, null, null, null, ((e.C0984e) eVar2).a, null, null, false, 16127) : eVar2 instanceof e.a ? BookingServicesScreenState.a(bookingServicesScreenState2, null, false, null, null, null, null, "", null, null, false, 16127) : eVar2 instanceof e.j ? BookingServicesScreenState.a(bookingServicesScreenState2, null, false, null, null, null, null, null, null, null, ((e.j) eVar2).a, 12287) : bookingServicesScreenState2;
        }
        List<BookingServiceModel> list11 = ((e.b) eVar2).a;
        if (list11.isEmpty()) {
            LinkedHashMap linkedHashMap8 = new LinkedHashMap(on00.e(map.size()));
            Iterator it5 = map.entrySet().iterator();
            while (it5.hasNext()) {
                Map.Entry entry4 = (Map.Entry) it5.next();
                Object key2 = entry4.getKey();
                Iterable iterable = (Iterable) entry4.getValue();
                ArrayList arrayList6 = new ArrayList(c5g.u(iterable, 10));
                Iterator it6 = iterable.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(BookingServicesScreenState.ServiceWrapper.a((BookingServicesScreenState.ServiceWrapper) it6.next(), false, false, 3));
                }
                linkedHashMap8.put(key2, arrayList6);
            }
            linkedHashMap = linkedHashMap8;
        } else {
            LinkedHashMap linkedHashMap9 = new LinkedHashMap(on00.e(map.size()));
            Iterator it7 = map.entrySet().iterator();
            while (it7.hasNext()) {
                Map.Entry entry5 = (Map.Entry) it7.next();
                Object key3 = entry5.getKey();
                Iterable<BookingServicesScreenState.ServiceWrapper> iterable2 = (Iterable) entry5.getValue();
                ArrayList arrayList7 = new ArrayList(c5g.u(iterable2, 10));
                for (BookingServicesScreenState.ServiceWrapper serviceWrapper7 : iterable2) {
                    List<BookingServiceModel> list12 = list11;
                    ArrayList arrayList8 = new ArrayList(c5g.u(list12, 10));
                    Iterator it8 = list12.iterator();
                    while (it8.hasNext()) {
                        arrayList8.add(Integer.valueOf(((BookingServiceModel) it8.next()).b));
                    }
                    arrayList7.add(BookingServicesScreenState.ServiceWrapper.a(serviceWrapper7, false, !arrayList8.contains(Integer.valueOf(serviceWrapper7.b.b)), 3));
                }
                linkedHashMap9.put(key3, arrayList7);
            }
            linkedHashMap = linkedHashMap9;
        }
        return BookingServicesScreenState.a(bookingServicesScreenState2, null, false, null, null, null, linkedHashMap, null, null, null, false, 16255);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(e eVar) {
        return true;
    }
}
