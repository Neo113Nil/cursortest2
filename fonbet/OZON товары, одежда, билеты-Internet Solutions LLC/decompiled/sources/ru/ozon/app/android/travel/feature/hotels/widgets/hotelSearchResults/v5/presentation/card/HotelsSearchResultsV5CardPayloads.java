package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardPayloads;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_STATE", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5CardPayloads {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HotelsSearchResultsV5CardPayloads[] $VALUES;
    public static final HotelsSearchResultsV5CardPayloads CHANGE_STATE = new HotelsSearchResultsV5CardPayloads("CHANGE_STATE", 0);

    private static final /* synthetic */ HotelsSearchResultsV5CardPayloads[] $values() {
        return new HotelsSearchResultsV5CardPayloads[]{CHANGE_STATE};
    }

    static {
        HotelsSearchResultsV5CardPayloads[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private HotelsSearchResultsV5CardPayloads(String str, int i11) {
    }

    public static HotelsSearchResultsV5CardPayloads valueOf(String str) {
        return (HotelsSearchResultsV5CardPayloads) Enum.valueOf(HotelsSearchResultsV5CardPayloads.class, str);
    }

    public static HotelsSearchResultsV5CardPayloads[] values() {
        return (HotelsSearchResultsV5CardPayloads[]) $VALUES.clone();
    }
}
