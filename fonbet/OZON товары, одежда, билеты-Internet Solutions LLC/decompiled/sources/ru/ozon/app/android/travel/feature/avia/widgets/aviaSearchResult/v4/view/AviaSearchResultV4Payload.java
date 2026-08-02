package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4Payload;", "", "<init>", "(Ljava/lang/String;I)V", "BACKGROUND", "BADGES", "PRICE", "LUGGAGE", "AIRLINE", "THERE_DETAILS", "BACK_DETAILS", "ADDITIONAL_INFO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4Payload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AviaSearchResultV4Payload[] $VALUES;
    public static final AviaSearchResultV4Payload BACKGROUND = new AviaSearchResultV4Payload("BACKGROUND", 0);
    public static final AviaSearchResultV4Payload BADGES = new AviaSearchResultV4Payload("BADGES", 1);
    public static final AviaSearchResultV4Payload PRICE = new AviaSearchResultV4Payload("PRICE", 2);
    public static final AviaSearchResultV4Payload LUGGAGE = new AviaSearchResultV4Payload("LUGGAGE", 3);
    public static final AviaSearchResultV4Payload AIRLINE = new AviaSearchResultV4Payload("AIRLINE", 4);
    public static final AviaSearchResultV4Payload THERE_DETAILS = new AviaSearchResultV4Payload("THERE_DETAILS", 5);
    public static final AviaSearchResultV4Payload BACK_DETAILS = new AviaSearchResultV4Payload("BACK_DETAILS", 6);
    public static final AviaSearchResultV4Payload ADDITIONAL_INFO = new AviaSearchResultV4Payload("ADDITIONAL_INFO", 7);

    private static final /* synthetic */ AviaSearchResultV4Payload[] $values() {
        return new AviaSearchResultV4Payload[]{BACKGROUND, BADGES, PRICE, LUGGAGE, AIRLINE, THERE_DETAILS, BACK_DETAILS, ADDITIONAL_INFO};
    }

    static {
        AviaSearchResultV4Payload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AviaSearchResultV4Payload(String str, int i11) {
    }

    public static AviaSearchResultV4Payload valueOf(String str) {
        return (AviaSearchResultV4Payload) Enum.valueOf(AviaSearchResultV4Payload.class, str);
    }

    public static AviaSearchResultV4Payload[] values() {
        return (AviaSearchResultV4Payload[]) $VALUES.clone();
    }
}
