package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.aspect;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/aspect/AdditionalServicesTariffAspectPayload;", "", "<init>", "(Ljava/lang/String;I)V", "ASPECT", SelectionItemDescriptionDTO.TITLE, "SUBTITLE", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesTariffAspectPayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdditionalServicesTariffAspectPayload[] $VALUES;
    public static final AdditionalServicesTariffAspectPayload ASPECT = new AdditionalServicesTariffAspectPayload("ASPECT", 0);
    public static final AdditionalServicesTariffAspectPayload TITLE = new AdditionalServicesTariffAspectPayload(SelectionItemDescriptionDTO.TITLE, 1);
    public static final AdditionalServicesTariffAspectPayload SUBTITLE = new AdditionalServicesTariffAspectPayload("SUBTITLE", 2);

    private static final /* synthetic */ AdditionalServicesTariffAspectPayload[] $values() {
        return new AdditionalServicesTariffAspectPayload[]{ASPECT, TITLE, SUBTITLE};
    }

    static {
        AdditionalServicesTariffAspectPayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AdditionalServicesTariffAspectPayload(String str, int i11) {
    }

    public static AdditionalServicesTariffAspectPayload valueOf(String str) {
        return (AdditionalServicesTariffAspectPayload) Enum.valueOf(AdditionalServicesTariffAspectPayload.class, str);
    }

    public static AdditionalServicesTariffAspectPayload[] values() {
        return (AdditionalServicesTariffAspectPayload[]) $VALUES.clone();
    }
}
