package ru.ozon.tracker.performance;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/tracker/performance/MapLoadingSteps;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "INITIAL", "UPDATE", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapLoadingSteps {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ MapLoadingSteps[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final MapLoadingSteps INITIAL = new MapLoadingSteps("INITIAL", 0);
    public static final MapLoadingSteps UPDATE = new MapLoadingSteps("UPDATE", 1);

    @NotNull
    private static final Map<String, MapLoadingSteps> lookupMap;

    /* renamed from: ru.ozon.tracker.performance.MapLoadingSteps$a, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static MapLoadingSteps a(String str) {
            return (MapLoadingSteps) MapLoadingSteps.lookupMap.get(str);
        }
    }

    private static final /* synthetic */ MapLoadingSteps[] $values() {
        return new MapLoadingSteps[]{INITIAL, UPDATE};
    }

    static {
        MapLoadingSteps[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
        INSTANCE = new Companion();
        MapLoadingSteps[] values = values();
        int h11 = U.h(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (MapLoadingSteps mapLoadingSteps : values) {
            linkedHashMap.put(mapLoadingSteps.name(), mapLoadingSteps);
        }
        lookupMap = linkedHashMap;
    }

    private MapLoadingSteps(String str, int i11) {
    }

    public static final MapLoadingSteps from(String str) {
        INSTANCE.getClass();
        return Companion.a(str);
    }

    @NotNull
    public static Xc.a<MapLoadingSteps> getEntries() {
        return $ENTRIES;
    }

    public static MapLoadingSteps valueOf(String str) {
        return (MapLoadingSteps) Enum.valueOf(MapLoadingSteps.class, str);
    }

    public static MapLoadingSteps[] values() {
        return (MapLoadingSteps[]) $VALUES.clone();
    }
}
