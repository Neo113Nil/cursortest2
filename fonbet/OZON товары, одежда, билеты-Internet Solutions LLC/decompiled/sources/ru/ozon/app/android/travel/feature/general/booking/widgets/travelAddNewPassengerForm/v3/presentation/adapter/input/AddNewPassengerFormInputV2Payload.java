package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.adapter.input;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/adapter/input/AddNewPassengerFormInputV2Payload;", "", "<init>", "(Ljava/lang/String;I)V", "CHANGE_ERROR", "CHANGE_SERIES_TEXT_ERROR", "CHANGE_SUGGESTS", "CHANGE_INPUT_DATA", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddNewPassengerFormInputV2Payload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AddNewPassengerFormInputV2Payload[] $VALUES;
    public static final AddNewPassengerFormInputV2Payload CHANGE_ERROR = new AddNewPassengerFormInputV2Payload("CHANGE_ERROR", 0);
    public static final AddNewPassengerFormInputV2Payload CHANGE_SERIES_TEXT_ERROR = new AddNewPassengerFormInputV2Payload("CHANGE_SERIES_TEXT_ERROR", 1);
    public static final AddNewPassengerFormInputV2Payload CHANGE_SUGGESTS = new AddNewPassengerFormInputV2Payload("CHANGE_SUGGESTS", 2);
    public static final AddNewPassengerFormInputV2Payload CHANGE_INPUT_DATA = new AddNewPassengerFormInputV2Payload("CHANGE_INPUT_DATA", 3);

    private static final /* synthetic */ AddNewPassengerFormInputV2Payload[] $values() {
        return new AddNewPassengerFormInputV2Payload[]{CHANGE_ERROR, CHANGE_SERIES_TEXT_ERROR, CHANGE_SUGGESTS, CHANGE_INPUT_DATA};
    }

    static {
        AddNewPassengerFormInputV2Payload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AddNewPassengerFormInputV2Payload(String str, int i11) {
    }

    public static AddNewPassengerFormInputV2Payload valueOf(String str) {
        return (AddNewPassengerFormInputV2Payload) Enum.valueOf(AddNewPassengerFormInputV2Payload.class, str);
    }

    public static AddNewPassengerFormInputV2Payload[] values() {
        return (AddNewPassengerFormInputV2Payload[]) $VALUES.clone();
    }
}
