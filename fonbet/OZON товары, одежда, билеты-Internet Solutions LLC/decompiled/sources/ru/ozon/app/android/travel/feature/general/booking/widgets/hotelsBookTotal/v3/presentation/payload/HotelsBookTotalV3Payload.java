package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.payload;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/payload/HotelsBookTotalV3Payload;", "", "<init>", "(Ljava/lang/String;I)V", "FINAL_PRICE", "BASE_PRICE", "BONUSES_AMOUNT", "IS_LOADING", "NEXT_BUTTON", "AGREEMENT", "NOTIFICATION", "STARS_BONUSES", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3Payload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HotelsBookTotalV3Payload[] $VALUES;
    public static final HotelsBookTotalV3Payload FINAL_PRICE = new HotelsBookTotalV3Payload("FINAL_PRICE", 0);
    public static final HotelsBookTotalV3Payload BASE_PRICE = new HotelsBookTotalV3Payload("BASE_PRICE", 1);
    public static final HotelsBookTotalV3Payload BONUSES_AMOUNT = new HotelsBookTotalV3Payload("BONUSES_AMOUNT", 2);
    public static final HotelsBookTotalV3Payload IS_LOADING = new HotelsBookTotalV3Payload("IS_LOADING", 3);
    public static final HotelsBookTotalV3Payload NEXT_BUTTON = new HotelsBookTotalV3Payload("NEXT_BUTTON", 4);
    public static final HotelsBookTotalV3Payload AGREEMENT = new HotelsBookTotalV3Payload("AGREEMENT", 5);
    public static final HotelsBookTotalV3Payload NOTIFICATION = new HotelsBookTotalV3Payload("NOTIFICATION", 6);
    public static final HotelsBookTotalV3Payload STARS_BONUSES = new HotelsBookTotalV3Payload("STARS_BONUSES", 7);

    private static final /* synthetic */ HotelsBookTotalV3Payload[] $values() {
        return new HotelsBookTotalV3Payload[]{FINAL_PRICE, BASE_PRICE, BONUSES_AMOUNT, IS_LOADING, NEXT_BUTTON, AGREEMENT, NOTIFICATION, STARS_BONUSES};
    }

    static {
        HotelsBookTotalV3Payload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private HotelsBookTotalV3Payload(String str, int i11) {
    }

    public static HotelsBookTotalV3Payload valueOf(String str) {
        return (HotelsBookTotalV3Payload) Enum.valueOf(HotelsBookTotalV3Payload.class, str);
    }

    public static HotelsBookTotalV3Payload[] values() {
        return (HotelsBookTotalV3Payload[]) $VALUES.clone();
    }
}
