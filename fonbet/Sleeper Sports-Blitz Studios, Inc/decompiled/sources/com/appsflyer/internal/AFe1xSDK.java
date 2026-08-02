package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class AFe1xSDK {
    public static final JSONArray getMediationNetwork(List<AFd1jSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<AFd1jSDK> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFd1jSDK) it.next()).getMediationNetwork());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean getRevenue(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
