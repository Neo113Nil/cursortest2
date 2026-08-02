package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* loaded from: classes8.dex */
public final class AFd1eSDK {
    @NotNull
    public static final JSONArray AFInAppEventParameterName(@NotNull List<AFd1fSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<AFd1fSDK> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFd1fSDK) it.next()).values());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean AFKeystoreWrapper(@NotNull HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
