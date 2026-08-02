package com.braze.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/enums/GeofenceTransitionType;", "", "<init>", "(Ljava/lang/String;I)V", "ENTER", "EXIT", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GeofenceTransitionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GeofenceTransitionType[] $VALUES;
    public static final GeofenceTransitionType ENTER = new GeofenceTransitionType("ENTER", 0);
    public static final GeofenceTransitionType EXIT = new GeofenceTransitionType("EXIT", 1);

    private static final /* synthetic */ GeofenceTransitionType[] $values() {
        return new GeofenceTransitionType[]{ENTER, EXIT};
    }

    static {
        GeofenceTransitionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private GeofenceTransitionType(String str, int i10) {
    }

    public static GeofenceTransitionType valueOf(String str) {
        return (GeofenceTransitionType) Enum.valueOf(GeofenceTransitionType.class, str);
    }

    public static GeofenceTransitionType[] values() {
        return (GeofenceTransitionType[]) $VALUES.clone();
    }
}
