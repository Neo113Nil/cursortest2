package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonPayloads;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_ERROR", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5SkeletonPayloads {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HotelsSearchResultsV5SkeletonPayloads[] $VALUES;
    public static final HotelsSearchResultsV5SkeletonPayloads SHOW_ERROR = new HotelsSearchResultsV5SkeletonPayloads("SHOW_ERROR", 0);

    private static final /* synthetic */ HotelsSearchResultsV5SkeletonPayloads[] $values() {
        return new HotelsSearchResultsV5SkeletonPayloads[]{SHOW_ERROR};
    }

    static {
        HotelsSearchResultsV5SkeletonPayloads[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private HotelsSearchResultsV5SkeletonPayloads(String str, int i11) {
    }

    public static HotelsSearchResultsV5SkeletonPayloads valueOf(String str) {
        return (HotelsSearchResultsV5SkeletonPayloads) Enum.valueOf(HotelsSearchResultsV5SkeletonPayloads.class, str);
    }

    public static HotelsSearchResultsV5SkeletonPayloads[] values() {
        return (HotelsSearchResultsV5SkeletonPayloads[]) $VALUES.clone();
    }
}
