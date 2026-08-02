package expo.modules.location.records;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationArguments.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/location/records/GeofencingRegionState;", "Lexpo/modules/kotlin/types/Enumerable;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "INSIDE", "OUTSIDE", "expo-location_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GeofencingRegionState implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GeofencingRegionState[] $VALUES;
    public static final GeofencingRegionState UNKNOWN = new GeofencingRegionState("UNKNOWN", 0);
    public static final GeofencingRegionState INSIDE = new GeofencingRegionState("INSIDE", 1);
    public static final GeofencingRegionState OUTSIDE = new GeofencingRegionState("OUTSIDE", 2);

    private static final /* synthetic */ GeofencingRegionState[] $values() {
        return new GeofencingRegionState[]{UNKNOWN, INSIDE, OUTSIDE};
    }

    public static EnumEntries<GeofencingRegionState> getEntries() {
        return $ENTRIES;
    }

    private GeofencingRegionState(String str, int i) {
    }

    static {
        GeofencingRegionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static GeofencingRegionState valueOf(String str) {
        return (GeofencingRegionState) Enum.valueOf(GeofencingRegionState.class, str);
    }

    public static GeofencingRegionState[] values() {
        return (GeofencingRegionState[]) $VALUES.clone();
    }
}
