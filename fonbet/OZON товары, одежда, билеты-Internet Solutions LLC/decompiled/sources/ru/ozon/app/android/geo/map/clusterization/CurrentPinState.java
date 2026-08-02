package ru.ozon.app.android.geo.map.clusterization;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/CurrentPinState;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SELECTED", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CurrentPinState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CurrentPinState[] $VALUES;
    public static final CurrentPinState DEFAULT = new CurrentPinState("DEFAULT", 0);
    public static final CurrentPinState SELECTED = new CurrentPinState("SELECTED", 1);

    private static final /* synthetic */ CurrentPinState[] $values() {
        return new CurrentPinState[]{DEFAULT, SELECTED};
    }

    static {
        CurrentPinState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CurrentPinState(String str, int i11) {
    }

    public static CurrentPinState valueOf(String str) {
        return (CurrentPinState) Enum.valueOf(CurrentPinState.class, str);
    }

    public static CurrentPinState[] values() {
        return (CurrentPinState[]) $VALUES.clone();
    }
}
