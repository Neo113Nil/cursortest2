package ru.ozon.android.messenger.framework.analytics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

/* loaded from: classes10.dex */
public final class h {
    @NotNull
    public static final Map<String, MessengerTrackingInfo> a(Map<String, TokenizedTrackingInfo> map) {
        Set<Map.Entry<String, TokenizedTrackingInfo>> entrySet;
        if (map == null || (entrySet = map.entrySet()) == null) {
            return U.c();
        }
        Set<Map.Entry<String, TokenizedTrackingInfo>> set = entrySet;
        int h11 = U.h(C7714v.z(set, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = new Pair(entry.getKey(), g((TokenizedTrackingInfo) entry.getValue()));
            linkedHashMap.put(pair.e(), pair.f());
        }
        return linkedHashMap;
    }

    public static final LinkedHashMap b(Map map) {
        Set entrySet;
        if (map == null || (entrySet = map.entrySet()) == null) {
            return null;
        }
        Set<Map.Entry> set = entrySet;
        int h11 = U.h(C7714v.z(set, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Map.Entry entry : set) {
            Pair pair = new Pair(entry.getKey(), c((MessengerTrackingInfo) entry.getValue()));
            linkedHashMap.put(pair.e(), pair.f());
        }
        return linkedHashMap;
    }

    private static final TokenizedTrackingInfo c(MessengerTrackingInfo messengerTrackingInfo) {
        ArrayList arrayList;
        String actionType = messengerTrackingInfo.getActionType();
        String key = messengerTrackingInfo.getKey();
        String sliceKey = messengerTrackingInfo.getSliceKey();
        List<MessengerTrackingInfo> nested = messengerTrackingInfo.getNested();
        if (nested != null) {
            List<MessengerTrackingInfo> list = nested;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c((MessengerTrackingInfo) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new TokenizedTrackingInfo(actionType, key, sliceKey, arrayList, null, 16, null);
    }

    public static final void d(@NotNull i iVar, @NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        iVar.processEvents(trackingInfo);
    }

    public static final void e(@NotNull i iVar, @NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, MessengerTrackingInfo> entry : trackingInfo.entrySet()) {
            if (!Intrinsics.d(entry.getKey(), "view")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        iVar.processEvents(linkedHashMap);
    }

    public static final void f(@NotNull i iVar, @NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, MessengerTrackingInfo> entry : trackingInfo.entrySet()) {
            if (Intrinsics.d(entry.getKey(), "view")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        iVar.processEvents(linkedHashMap);
    }

    private static final MessengerTrackingInfo g(TokenizedTrackingInfo tokenizedTrackingInfo) {
        ArrayList arrayList;
        String actionType = tokenizedTrackingInfo.getActionType();
        String key = tokenizedTrackingInfo.getKey();
        String sliceKey = tokenizedTrackingInfo.getSliceKey();
        List<TokenizedTrackingInfo> nested = tokenizedTrackingInfo.getNested();
        if (nested != null) {
            List<TokenizedTrackingInfo> list = nested;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((TokenizedTrackingInfo) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new MessengerTrackingInfo(actionType, key, 0L, sliceKey, arrayList, 4, null);
    }
}
