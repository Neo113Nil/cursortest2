package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomPayload;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "DELETE_BUTTON", "GUESTS", "FORMS", "VISIBILITY", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3RoomPayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TouristCountSelectorV3RoomPayload[] $VALUES;
    public static final TouristCountSelectorV3RoomPayload TITLE = new TouristCountSelectorV3RoomPayload(SelectionItemDescriptionDTO.TITLE, 0);
    public static final TouristCountSelectorV3RoomPayload DELETE_BUTTON = new TouristCountSelectorV3RoomPayload("DELETE_BUTTON", 1);
    public static final TouristCountSelectorV3RoomPayload GUESTS = new TouristCountSelectorV3RoomPayload("GUESTS", 2);
    public static final TouristCountSelectorV3RoomPayload FORMS = new TouristCountSelectorV3RoomPayload("FORMS", 3);
    public static final TouristCountSelectorV3RoomPayload VISIBILITY = new TouristCountSelectorV3RoomPayload("VISIBILITY", 4);

    private static final /* synthetic */ TouristCountSelectorV3RoomPayload[] $values() {
        return new TouristCountSelectorV3RoomPayload[]{TITLE, DELETE_BUTTON, GUESTS, FORMS, VISIBILITY};
    }

    static {
        TouristCountSelectorV3RoomPayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TouristCountSelectorV3RoomPayload(String str, int i11) {
    }

    public static TouristCountSelectorV3RoomPayload valueOf(String str) {
        return (TouristCountSelectorV3RoomPayload) Enum.valueOf(TouristCountSelectorV3RoomPayload.class, str);
    }

    public static TouristCountSelectorV3RoomPayload[] values() {
        return (TouristCountSelectorV3RoomPayload[]) $VALUES.clone();
    }
}
