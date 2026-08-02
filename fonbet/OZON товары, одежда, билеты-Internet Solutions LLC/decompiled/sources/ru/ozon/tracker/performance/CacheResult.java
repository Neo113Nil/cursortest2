package ru.ozon.tracker.performance;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/tracker/performance/CacheResult;", "", "<init>", "(Ljava/lang/String;I)V", "NGINX", "CDN", "CACHE_TYPE_UNKNOWN", "MISS_ALL", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheResult {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ CacheResult[] $VALUES;
    public static final CacheResult NGINX = new CacheResult("NGINX", 0);
    public static final CacheResult CDN = new CacheResult("CDN", 1);
    public static final CacheResult CACHE_TYPE_UNKNOWN = new CacheResult("CACHE_TYPE_UNKNOWN", 2);
    public static final CacheResult MISS_ALL = new CacheResult("MISS_ALL", 3);

    private static final /* synthetic */ CacheResult[] $values() {
        return new CacheResult[]{NGINX, CDN, CACHE_TYPE_UNKNOWN, MISS_ALL};
    }

    static {
        CacheResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private CacheResult(String str, int i11) {
    }

    @NotNull
    public static Xc.a<CacheResult> getEntries() {
        return $ENTRIES;
    }

    public static CacheResult valueOf(String str) {
        return (CacheResult) Enum.valueOf(CacheResult.class, str);
    }

    public static CacheResult[] values() {
        return (CacheResult[]) $VALUES.clone();
    }
}
