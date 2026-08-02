package com.vk.ecomm.cart.impl.checkout.feature.state;

import com.ironsource.C4572u;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.checkout.feature.state.c;
import com.vk.ecomm.cart.impl.checkout.feature.state.g;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.b7r;
import xsna.d0c;
import xsna.e43;
import xsna.epx;
import xsna.iwl;
import xsna.ppg0;
import xsna.qwu;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;

/* compiled from: CheckoutFormStructure.kt */
/* loaded from: classes18.dex */
public final class f {
    public final LinkedHashMap<String, LinkedHashMap<String, b7r>> a;
    public final boolean b;

    /* compiled from: CheckoutFormStructure.kt */
    public static final class a {
        public static LinkedHashMap a() {
            List l = e43.l(new qwu("order_list_header", null, tq.h(tlo0.Companion, R.string.ecomm_checkout_order_list)), new g("order_list", g.a.b.a));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : l) {
                linkedHashMap.put(((b7r) obj).c(), obj);
            }
            return linkedHashMap;
        }
    }

    public f(LinkedHashMap<String, LinkedHashMap<String, b7r>> linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = z;
    }

    public static Object c(b7r b7rVar, boolean z) {
        if (b7rVar instanceof d) {
            return ((d) b7rVar).d;
        }
        if (b7rVar instanceof InputField) {
            return ((InputField) b7rVar).h;
        }
        if (b7rVar instanceof h) {
            if (z) {
                return null;
            }
            return ((h) b7rVar).e.h;
        }
        if (b7rVar instanceof c) {
            c.a aVar = ((c) b7rVar).c;
            if (aVar != null) {
                return Integer.valueOf(aVar.a);
            }
            return null;
        }
        if (b7rVar instanceof e) {
            return ((e) b7rVar).h;
        }
        if (b7rVar instanceof d0c) {
            return Boolean.valueOf(((d0c) b7rVar).d);
        }
        if (!(b7rVar instanceof j)) {
            return b7rVar instanceof i ? ((i) b7rVar).c : b7rVar instanceof PaymentOptionsField ? ((PaymentOptionsField) b7rVar).d.i() : b7rVar instanceof PaymentInfoField ? ((PaymentInfoField) b7rVar).c.i() : s3q0.a;
        }
        DeliveryPoint deliveryPoint = ((j) b7rVar).c;
        if (deliveryPoint != null) {
            return iwl.b(deliveryPoint);
        }
        return null;
    }

    public final f a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, LinkedHashMap<String, b7r>> entry : this.a.entrySet()) {
            String key = entry.getKey();
            LinkedHashMap<String, b7r> value = entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, b7r> entry2 : value.entrySet()) {
                String key2 = entry2.getKey();
                b7r value2 = entry2.getValue();
                if (value2 instanceof ppg0) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    ppg0 ppg0Var = (ppg0) value2;
                    linkedHashMap3.putAll(ppg0Var.c);
                    linkedHashMap2.put(key2, new ppg0(ppg0Var.a, linkedHashMap3, ppg0Var.b));
                }
                linkedHashMap2.put(key2, value2);
            }
            linkedHashMap.put(key, linkedHashMap2);
        }
        return new f(linkedHashMap, this.b);
    }

    public final LinkedHashMap<String, b7r> b(String str) {
        return this.a.get(str);
    }

    public final HashMap d(boolean z) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, LinkedHashMap<String, b7r>> entry : this.a.entrySet()) {
            String key = entry.getKey();
            for (Map.Entry<String, b7r> entry2 : entry.getValue().entrySet()) {
                String key2 = entry2.getKey();
                b7r value = entry2.getValue();
                if (value instanceof ppg0) {
                    for (Map.Entry<String, b7r> entry3 : ((ppg0) value).c.entrySet()) {
                        String key3 = entry3.getKey();
                        b7r value2 = entry3.getValue();
                        if (value2 != null) {
                            new FieldKey(key, key2, key3, null, 8, null);
                            if (com.vk.ecomm.cart.impl.checkout.feature.state.a.a(value2)) {
                                hashMap.put(value2.c(), c(value2, z));
                            }
                        }
                    }
                } else if (value != null) {
                    new FieldKey(key, key2, null, null, 12, null);
                    if (com.vk.ecomm.cart.impl.checkout.feature.state.a.a(value)) {
                        hashMap.put(value.c(), c(value, z));
                    }
                }
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return epx.f(this.a, fVar.a) && this.b == fVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Form(formMap=");
        sb.append(this.a);
        sb.append(", isCompleteActionsShown=");
        return q0.a(sb, this.b, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f() {
        this(r0, true);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C4572u.g, new LinkedHashMap());
        linkedHashMap.put("recipient", new LinkedHashMap());
        linkedHashMap.put("comment", new LinkedHashMap());
        linkedHashMap.put("order_list", a.a());
        linkedHashMap.put("payment", new LinkedHashMap());
    }
}
