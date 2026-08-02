package expo.modules.location;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/location/LocationAccuracy;", "", "<init>", "(Ljava/lang/String;I)V", "LOWEST", "LOW", "MEDIUM", "HIGH", "expo-location_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocationAccuracy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocationAccuracy[] $VALUES;
    public static final LocationAccuracy LOWEST = new LocationAccuracy("LOWEST", 0);
    public static final LocationAccuracy LOW = new LocationAccuracy("LOW", 1);
    public static final LocationAccuracy MEDIUM = new LocationAccuracy("MEDIUM", 2);
    public static final LocationAccuracy HIGH = new LocationAccuracy("HIGH", 3);

    private static final /* synthetic */ LocationAccuracy[] $values() {
        return new LocationAccuracy[]{LOWEST, LOW, MEDIUM, HIGH};
    }

    public static EnumEntries<LocationAccuracy> getEntries() {
        return $ENTRIES;
    }

    private LocationAccuracy(String str, int i) {
    }

    static {
        LocationAccuracy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static LocationAccuracy valueOf(String str) {
        return (LocationAccuracy) Enum.valueOf(LocationAccuracy.class, str);
    }

    public static LocationAccuracy[] values() {
        return (LocationAccuracy[]) $VALUES.clone();
    }
}
