package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/FlightDirection;", "", "<init>", "(Ljava/lang/String;I)V", "THERE_FLIGHT", "BACK_FLIGHT", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FlightDirection[] $VALUES;
    public static final FlightDirection THERE_FLIGHT = new FlightDirection("THERE_FLIGHT", 0);
    public static final FlightDirection BACK_FLIGHT = new FlightDirection("BACK_FLIGHT", 1);

    private static final /* synthetic */ FlightDirection[] $values() {
        return new FlightDirection[]{THERE_FLIGHT, BACK_FLIGHT};
    }

    static {
        FlightDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private FlightDirection(String str, int i11) {
    }

    public static FlightDirection valueOf(String str) {
        return (FlightDirection) Enum.valueOf(FlightDirection.class, str);
    }

    public static FlightDirection[] values() {
        return (FlightDirection[]) $VALUES.clone();
    }
}
