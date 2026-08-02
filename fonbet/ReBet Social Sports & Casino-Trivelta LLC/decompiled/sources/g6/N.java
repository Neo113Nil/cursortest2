package g6;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum N {
    REQUESTS,
    INCLUDE_ACCESS_TOKENS,
    INCLUDE_RAW_RESPONSES,
    CACHE,
    APP_EVENTS,
    DEVELOPER_ERRORS,
    GRAPH_API_DEBUG_WARNING,
    GRAPH_API_DEBUG_INFO;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static N[] valuesCustom() {
        N[] valuesCustom = values();
        return (N[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
