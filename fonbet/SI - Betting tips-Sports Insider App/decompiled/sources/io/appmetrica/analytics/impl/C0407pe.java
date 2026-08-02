package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407pe {

    /* renamed from: a, reason: collision with root package name */
    public final String f14476a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14477b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14478c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f14479d;

    public C0407pe(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), CollectionUtils.mapCopyOfNullableMap(eCommerceOrder.getPayload()));
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0271k3((ECommerceCartItem) it.next()));
        }
        return arrayList;
    }

    public final String toString() {
        return "OrderWrapper{uuid='" + this.f14476a + "', identifier='" + this.f14477b + "', cartItems=" + this.f14478c + ", payload=" + this.f14479d + '}';
    }

    public C0407pe(String str, String str2, ArrayList arrayList, Map map) {
        this.f14476a = str;
        this.f14477b = str2;
        this.f14478c = arrayList;
        this.f14479d = map;
    }
}
