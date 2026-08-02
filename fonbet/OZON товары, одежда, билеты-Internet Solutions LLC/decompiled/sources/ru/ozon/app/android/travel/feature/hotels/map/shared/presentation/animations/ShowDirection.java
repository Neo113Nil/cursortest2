package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.animations;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/animations/ShowDirection;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShowDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ShowDirection[] $VALUES;
    public static final ShowDirection UP = new ShowDirection("UP", 0);
    public static final ShowDirection DOWN = new ShowDirection("DOWN", 1);

    private static final /* synthetic */ ShowDirection[] $values() {
        return new ShowDirection[]{UP, DOWN};
    }

    static {
        ShowDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ShowDirection(String str, int i11) {
    }

    public static ShowDirection valueOf(String str) {
        return (ShowDirection) Enum.valueOf(ShowDirection.class, str);
    }

    public static ShowDirection[] values() {
        return (ShowDirection[]) $VALUES.clone();
    }
}
