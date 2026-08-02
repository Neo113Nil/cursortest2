package ru.ozon.app.android.travel.feature.avia.shared.flightDetails.adapter;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsPayloads$FlightDetailsTitlePayloads", "", "", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsPayloads$FlightDetailsTitlePayloads;", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "SUBTITLE", "BUTTON", "FAVORITE_BUTTON", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightDetailsPayloads$FlightDetailsTitlePayloads {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FlightDetailsPayloads$FlightDetailsTitlePayloads[] $VALUES;
    public static final FlightDetailsPayloads$FlightDetailsTitlePayloads TITLE = new FlightDetailsPayloads$FlightDetailsTitlePayloads(SelectionItemDescriptionDTO.TITLE, 0);
    public static final FlightDetailsPayloads$FlightDetailsTitlePayloads SUBTITLE = new FlightDetailsPayloads$FlightDetailsTitlePayloads("SUBTITLE", 1);
    public static final FlightDetailsPayloads$FlightDetailsTitlePayloads BUTTON = new FlightDetailsPayloads$FlightDetailsTitlePayloads("BUTTON", 2);
    public static final FlightDetailsPayloads$FlightDetailsTitlePayloads FAVORITE_BUTTON = new FlightDetailsPayloads$FlightDetailsTitlePayloads("FAVORITE_BUTTON", 3);

    private static final /* synthetic */ FlightDetailsPayloads$FlightDetailsTitlePayloads[] $values() {
        return new FlightDetailsPayloads$FlightDetailsTitlePayloads[]{TITLE, SUBTITLE, BUTTON, FAVORITE_BUTTON};
    }

    static {
        FlightDetailsPayloads$FlightDetailsTitlePayloads[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private FlightDetailsPayloads$FlightDetailsTitlePayloads(String str, int i11) {
    }

    public static FlightDetailsPayloads$FlightDetailsTitlePayloads valueOf(String str) {
        return (FlightDetailsPayloads$FlightDetailsTitlePayloads) Enum.valueOf(FlightDetailsPayloads$FlightDetailsTitlePayloads.class, str);
    }

    public static FlightDetailsPayloads$FlightDetailsTitlePayloads[] values() {
        return (FlightDetailsPayloads$FlightDetailsTitlePayloads[]) $VALUES.clone();
    }
}
