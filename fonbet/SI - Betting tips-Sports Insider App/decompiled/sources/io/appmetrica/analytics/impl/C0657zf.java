package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657zf {

    /* renamed from: a, reason: collision with root package name */
    public final Z f14995a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14996b;

    public C0657zf(ECommercePrice eCommercePrice) {
        this(new Z(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static LinkedList a(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECommerceAmount eCommerceAmount = (ECommerceAmount) it.next();
            linkedList.add(new Z(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceWrapper{fiat=");
        sb2.append(this.f14995a);
        sb2.append(", internalComponents=");
        return androidx.appcompat.widget.c1.p(sb2, this.f14996b, '}');
    }

    public C0657zf(Z z5, LinkedList linkedList) {
        this.f14995a = z5;
        this.f14996b = linkedList;
    }
}
