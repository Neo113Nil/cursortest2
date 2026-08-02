package io.sentry.util.network;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes9.dex */
public final class NetworkDetailCaptureUtils {

    public interface NetworkBodyExtractor<T> {
        NetworkBody extract(T t);
    }

    public interface NetworkHeaderExtractor<T> {
        Map<String, String> extract(T t);
    }

    private NetworkDetailCaptureUtils() {
    }

    public static NetworkRequestData initializeForUrl(String str, String str2, List<String> list, List<String> list2) {
        if (shouldCaptureUrl(str, list, list2)) {
            return new NetworkRequestData(str2);
        }
        return null;
    }

    public static <T> ReplayNetworkRequestOrResponse createRequest(T t, Long l, boolean z, NetworkBodyExtractor<T> networkBodyExtractor, List<String> list, NetworkHeaderExtractor<T> networkHeaderExtractor) {
        return createRequestOrResponseInternal(t, l, z, networkBodyExtractor, list, networkHeaderExtractor);
    }

    public static <T> ReplayNetworkRequestOrResponse createResponse(T t, Long l, boolean z, NetworkBodyExtractor<T> networkBodyExtractor, List<String> list, NetworkHeaderExtractor<T> networkHeaderExtractor) {
        return createRequestOrResponseInternal(t, l, z, networkBodyExtractor, list, networkHeaderExtractor);
    }

    private static boolean shouldCaptureUrl(String str, List<String> list, List<String> list2) {
        if (list2 != null) {
            for (String str2 : list2) {
                if (str2 != null && str.matches(str2)) {
                    return false;
                }
            }
        }
        if (list == null) {
            return false;
        }
        for (String str3 : list) {
            if (str3 != null && str.matches(str3)) {
                return true;
            }
        }
        return false;
    }

    static Map<String, String> getCaptureHeaders(Map<String, String> map, List<String> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            HashSet hashSet = new HashSet();
            for (String str : list) {
                if (str != null) {
                    hashSet.add(str.toLowerCase(Locale.ROOT));
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (hashSet.contains(entry.getKey().toLowerCase(Locale.ROOT))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    private static <T> ReplayNetworkRequestOrResponse createRequestOrResponseInternal(T t, Long l, boolean z, NetworkBodyExtractor<T> networkBodyExtractor, List<String> list, NetworkHeaderExtractor<T> networkHeaderExtractor) {
        return new ReplayNetworkRequestOrResponse(l, z ? networkBodyExtractor.extract(t) : null, getCaptureHeaders(networkHeaderExtractor.extract(t), list));
    }
}
