package com.vk.ecomm.orders.impl.orderlist.presentation.mvi;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.orderlist.domain.OrderPreview;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.bm50;
import xsna.c5g;
import xsna.dw80;
import xsna.gy80;
import xsna.jgp;
import xsna.on00;
import xsna.pn00;

/* compiled from: OrderListReducer.kt */
/* loaded from: classes18.dex */
public final class e implements bm50<dw80, d> {

    /* compiled from: OrderListReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderPaymentResult.values().length];
            try {
                iArr[OrderPaymentResult.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderPaymentResult.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderPaymentResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.bm50
    public final dw80 a(dw80 dw80Var, d dVar) {
        dw80 dw80Var2 = dw80Var;
        d dVar2 = dVar;
        Integer num = dw80Var2.e;
        Map<Integer, OrderPreview> map = dw80Var2.c;
        if (dVar2 instanceof d.b) {
            d.b bVar = (d.b) dVar2;
            if (bVar instanceof d.b.c) {
                return dw80.a(dw80Var2, 0, jgp.b, null, 0, true, false, null, false, false, null, 988);
            }
            if (!(bVar instanceof d.b.C0997b)) {
                if (bVar instanceof d.b.a) {
                    return dw80.a(dw80Var2, 0, null, null, 0, false, false, null, false, false, ((d.b.a) bVar).a, 479);
                }
                throw new NoWhenBranchMatchedException();
            }
            gy80 gy80Var = ((d.b.C0997b) bVar).a;
            int i = gy80Var.a;
            ArrayList arrayList = gy80Var.b;
            int e = on00.e(c5g.u(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(e >= 16 ? e : 16);
            for (Object obj : arrayList) {
                linkedHashMap.put(Integer.valueOf(((OrderPreview) obj).c), obj);
            }
            return dw80.a(dw80Var2, i, linkedHashMap, null, 0, false, false, null, false, false, null, 476);
        }
        if (dVar2 instanceof d.a) {
            return dw80.a(dw80Var2, 0, null, null, ((d.a) dVar2).a, false, false, null, false, false, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
        }
        if (dVar2 instanceof d.c) {
            d.c cVar = (d.c) dVar2;
            if (cVar instanceof d.c.C0998c) {
                return dw80.a(dw80Var2, 0, null, null, 0, false, true, null, false, false, null, 1855);
            }
            if (!(cVar instanceof d.c.a)) {
                if (cVar instanceof d.c.b) {
                    return dw80.a(dw80Var2, 0, null, null, 0, false, false, ((d.c.b) cVar).a, false, false, null, 1855);
                }
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList2 = ((d.c.a) cVar).a;
            int e2 = on00.e(c5g.u(arrayList2, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
            for (Object obj2 : arrayList2) {
                linkedHashMap2.put(Integer.valueOf(((OrderPreview) obj2).c), obj2);
            }
            return dw80.a(dw80Var2, 0, pn00.n(map, linkedHashMap2), null, 0, false, false, null, false, false, null, 1981);
        }
        if (!(dVar2 instanceof d.InterfaceC0999d)) {
            if (dVar2.equals(d.e.a)) {
                return dw80.a(dw80Var2, 0, null, null, 0, false, false, null, false, true, null, 1535);
            }
            if (!(dVar2 instanceof d.f)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = ((d.f) dVar2).a;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(map);
            Integer valueOf = Integer.valueOf(i2);
            OrderPreview orderPreview = (OrderPreview) linkedHashMap3.get(Integer.valueOf(i2));
            linkedHashMap3.put(valueOf, orderPreview != null ? OrderPreview.a(orderPreview, 8175) : (OrderPreview) linkedHashMap3.get(Integer.valueOf(i2)));
            return dw80.a(dw80Var2, 0, linkedHashMap3, null, 0, false, false, null, false, false, null, 2045);
        }
        d.InterfaceC0999d interfaceC0999d = (d.InterfaceC0999d) dVar2;
        if (interfaceC0999d instanceof d.InterfaceC0999d.b) {
            return dw80.a(dw80Var2, 0, null, Integer.valueOf(((d.InterfaceC0999d.b) interfaceC0999d).a), 0, false, false, null, true, false, null, 1783);
        }
        if (!(interfaceC0999d instanceof d.InterfaceC0999d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        d.InterfaceC0999d.a aVar = (d.InterfaceC0999d.a) interfaceC0999d;
        if (num == null) {
            return dw80Var2;
        }
        int i3 = a.$EnumSwitchMapping$0[aVar.a.ordinal()];
        if (i3 == 1) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(map);
            OrderPreview orderPreview2 = (OrderPreview) linkedHashMap4.get(num);
            linkedHashMap4.put(num, orderPreview2 != null ? OrderPreview.a(orderPreview2, 7679) : (OrderPreview) linkedHashMap4.get(num));
            return dw80.a(dw80Var2, 0, linkedHashMap4, null, 0, false, false, null, false, false, null, 1781);
        }
        if (i3 == 2) {
            return dw80.a(dw80Var2, 0, null, null, 0, false, false, null, false, false, null, 1783);
        }
        if (i3 == 3) {
            return dw80.a(dw80Var2, 0, null, null, 0, false, false, null, false, false, null, 1783);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(d dVar) {
        return true;
    }
}
