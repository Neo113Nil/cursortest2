package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellPayload;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", SelectionItemDescriptionDTO.TITLE, "TITLE_INFO_BUTTON", "SUBTITLE", "CONTROL", "CELL_TYPE", "TARIFFS_VISIBILITY", "SEPARATOR", "SUBTITLE_SKELETON", "TARIFF_SKELETONS", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesCellPayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdditionalServicesCellPayload[] $VALUES;
    public static final AdditionalServicesCellPayload IMAGE = new AdditionalServicesCellPayload("IMAGE", 0);
    public static final AdditionalServicesCellPayload TITLE = new AdditionalServicesCellPayload(SelectionItemDescriptionDTO.TITLE, 1);
    public static final AdditionalServicesCellPayload TITLE_INFO_BUTTON = new AdditionalServicesCellPayload("TITLE_INFO_BUTTON", 2);
    public static final AdditionalServicesCellPayload SUBTITLE = new AdditionalServicesCellPayload("SUBTITLE", 3);
    public static final AdditionalServicesCellPayload CONTROL = new AdditionalServicesCellPayload("CONTROL", 4);
    public static final AdditionalServicesCellPayload CELL_TYPE = new AdditionalServicesCellPayload("CELL_TYPE", 5);
    public static final AdditionalServicesCellPayload TARIFFS_VISIBILITY = new AdditionalServicesCellPayload("TARIFFS_VISIBILITY", 6);
    public static final AdditionalServicesCellPayload SEPARATOR = new AdditionalServicesCellPayload("SEPARATOR", 7);
    public static final AdditionalServicesCellPayload SUBTITLE_SKELETON = new AdditionalServicesCellPayload("SUBTITLE_SKELETON", 8);
    public static final AdditionalServicesCellPayload TARIFF_SKELETONS = new AdditionalServicesCellPayload("TARIFF_SKELETONS", 9);

    private static final /* synthetic */ AdditionalServicesCellPayload[] $values() {
        return new AdditionalServicesCellPayload[]{IMAGE, TITLE, TITLE_INFO_BUTTON, SUBTITLE, CONTROL, CELL_TYPE, TARIFFS_VISIBILITY, SEPARATOR, SUBTITLE_SKELETON, TARIFF_SKELETONS};
    }

    static {
        AdditionalServicesCellPayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AdditionalServicesCellPayload(String str, int i11) {
    }

    public static AdditionalServicesCellPayload valueOf(String str) {
        return (AdditionalServicesCellPayload) Enum.valueOf(AdditionalServicesCellPayload.class, str);
    }

    public static AdditionalServicesCellPayload[] values() {
        return (AdditionalServicesCellPayload[]) $VALUES.clone();
    }
}
