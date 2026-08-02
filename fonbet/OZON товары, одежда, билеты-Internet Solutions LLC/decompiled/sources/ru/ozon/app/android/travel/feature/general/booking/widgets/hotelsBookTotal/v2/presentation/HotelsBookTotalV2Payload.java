package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2Payload;", "", "<init>", "(Ljava/lang/String;I)V", "STATE", "SHOULD_FETCH_STATE", "SHOULD_SHOW_LOADER", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV2Payload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HotelsBookTotalV2Payload[] $VALUES;
    public static final HotelsBookTotalV2Payload STATE = new HotelsBookTotalV2Payload("STATE", 0);
    public static final HotelsBookTotalV2Payload SHOULD_FETCH_STATE = new HotelsBookTotalV2Payload("SHOULD_FETCH_STATE", 1);
    public static final HotelsBookTotalV2Payload SHOULD_SHOW_LOADER = new HotelsBookTotalV2Payload("SHOULD_SHOW_LOADER", 2);

    private static final /* synthetic */ HotelsBookTotalV2Payload[] $values() {
        return new HotelsBookTotalV2Payload[]{STATE, SHOULD_FETCH_STATE, SHOULD_SHOW_LOADER};
    }

    static {
        HotelsBookTotalV2Payload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private HotelsBookTotalV2Payload(String str, int i11) {
    }

    public static HotelsBookTotalV2Payload valueOf(String str) {
        return (HotelsBookTotalV2Payload) Enum.valueOf(HotelsBookTotalV2Payload.class, str);
    }

    public static HotelsBookTotalV2Payload[] values() {
        return (HotelsBookTotalV2Payload[]) $VALUES.clone();
    }
}
