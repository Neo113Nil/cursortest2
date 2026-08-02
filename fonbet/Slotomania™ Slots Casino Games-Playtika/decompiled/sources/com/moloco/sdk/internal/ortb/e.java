package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.ortb.model.C;
import com.moloco.sdk.internal.ortb.model.C2791e;
import com.moloco.sdk.internal.ortb.model.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public final class e {
    public static final Regex a = new Regex("\\$\\{AUCTION_PRICE\\}");

    public static final g a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        List<C> b = gVar.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            List<C2791e> b2 = ((C) it.next()).b();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(b2, 10));
            for (C2791e c2791e : b2) {
                float price = c2791e.getPrice();
                String crid = c2791e.getCrid();
                String a2 = a(c2791e.getAdm(), Float.valueOf(price));
                String str = c2791e.getCom.ironsource.q2.y java.lang.String();
                arrayList2.add(new C2791e(a2, price, str != null ? a(str, Float.valueOf(price)) : null, c2791e.getExt(), crid, c2791e.getBundle()));
            }
            arrayList.add(new C(arrayList2));
        }
        return new g(arrayList);
    }

    public static final String a(String str, Float f) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Regex regex = a;
        if (f == null || (str2 = f.toString()) == null) {
            str2 = "";
        }
        return regex.replace(str, str2);
    }
}
