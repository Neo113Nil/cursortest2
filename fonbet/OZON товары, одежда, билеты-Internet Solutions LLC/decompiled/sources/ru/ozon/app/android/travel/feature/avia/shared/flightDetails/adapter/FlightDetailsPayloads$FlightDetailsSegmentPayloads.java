package ru.ozon.app.android.travel.feature.avia.shared.flightDetails.adapter;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"ru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsPayloads$FlightDetailsSegmentPayloads", "", "", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsPayloads$FlightDetailsSegmentPayloads;", "<init>", "(Ljava/lang/String;I)V", "AIRLINE_LOGO", "SUB_AIRLINE_LOGO", "BADGE", "AIRLINE", "SEGMENT_DURATION", "SEGMENT_AIRPLANE", "SEGMENT_DEPARTURE", "SEGMENT_ARRIVAL", "LUGGAGE_BADGES", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightDetailsPayloads$FlightDetailsSegmentPayloads {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FlightDetailsPayloads$FlightDetailsSegmentPayloads[] $VALUES;
    public static final FlightDetailsPayloads$FlightDetailsSegmentPayloads AIRLINE_LOGO = new FlightDetailsPayloads$FlightDetailsSegmentPayloads("AIRLINE_LOGO", 0);
    public static final FlightDetailsPayloads$FlightDetailsSegmentPayloads SUB_AIRLINE_LOGO = new FlightDetailsPayloads$FlightDetailsSegmentPayloads("SUB_AIRLINE_LOGO", 1);
    public static final FlightDetailsPayloads$FlightDetailsSegmentPayloads BADGE = new FlightDetailsPayloads$FlightDetailsSegmentPayloads("BADGE", 2);
    public static final FlightDetailsPayloads$FlightDetailsSegmentPayloads AIRLINE = new FlightDetailsPayloads$FlightDetailsSegmentPayloads("AIRLINE", 3);
    public static final FlightDetailsPayloads$FlightDetailsSegmentPayloads SEGMENT_DURATION = new FlightDetailsPayloads$FlightDetailsSegmentPayloads("SEGMENT_DURATION", 4);
    public static final FlightDetailsPayloads$FlightDetailsSegmentPayloads SEGMENT_AIRPLANE = new FlightDetailsPayloads$FlightDetailsSegmentPayloads("SEGMENT_AIRPLANE", 5);
    public static final FlightDetailsPayloads$FlightDetailsSegmentPayloads SEGMENT_DEPARTURE = new FlightDetailsPayloads$FlightDetailsSegmentPayloads("SEGMENT_DEPARTURE", 6);
    public static final FlightDetailsPayloads$FlightDetailsSegmentPayloads SEGMENT_ARRIVAL = new FlightDetailsPayloads$FlightDetailsSegmentPayloads("SEGMENT_ARRIVAL", 7);
    public static final FlightDetailsPayloads$FlightDetailsSegmentPayloads LUGGAGE_BADGES = new FlightDetailsPayloads$FlightDetailsSegmentPayloads("LUGGAGE_BADGES", 8);

    private static final /* synthetic */ FlightDetailsPayloads$FlightDetailsSegmentPayloads[] $values() {
        return new FlightDetailsPayloads$FlightDetailsSegmentPayloads[]{AIRLINE_LOGO, SUB_AIRLINE_LOGO, BADGE, AIRLINE, SEGMENT_DURATION, SEGMENT_AIRPLANE, SEGMENT_DEPARTURE, SEGMENT_ARRIVAL, LUGGAGE_BADGES};
    }

    static {
        FlightDetailsPayloads$FlightDetailsSegmentPayloads[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private FlightDetailsPayloads$FlightDetailsSegmentPayloads(String str, int i11) {
    }

    public static FlightDetailsPayloads$FlightDetailsSegmentPayloads valueOf(String str) {
        return (FlightDetailsPayloads$FlightDetailsSegmentPayloads) Enum.valueOf(FlightDetailsPayloads$FlightDetailsSegmentPayloads.class, str);
    }

    public static FlightDetailsPayloads$FlightDetailsSegmentPayloads[] values() {
        return (FlightDetailsPayloads$FlightDetailsSegmentPayloads[]) $VALUES.clone();
    }
}
