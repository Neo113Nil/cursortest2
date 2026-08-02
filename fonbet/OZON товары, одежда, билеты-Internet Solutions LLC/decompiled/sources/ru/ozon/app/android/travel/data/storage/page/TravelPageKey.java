package ru.ozon.app.android.travel.data.storage.page;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/data/storage/page/TravelPageKey;", "", "<init>", "(Ljava/lang/String;I)V", "HOTELS_BOOK", "PASSENGERS", "ICON_CHOOSER", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPageKey {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TravelPageKey[] $VALUES;
    public static final TravelPageKey HOTELS_BOOK = new TravelPageKey("HOTELS_BOOK", 0);
    public static final TravelPageKey PASSENGERS = new TravelPageKey("PASSENGERS", 1);
    public static final TravelPageKey ICON_CHOOSER = new TravelPageKey("ICON_CHOOSER", 2);

    private static final /* synthetic */ TravelPageKey[] $values() {
        return new TravelPageKey[]{HOTELS_BOOK, PASSENGERS, ICON_CHOOSER};
    }

    static {
        TravelPageKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TravelPageKey(String str, int i11) {
    }

    public static TravelPageKey valueOf(String str) {
        return (TravelPageKey) Enum.valueOf(TravelPageKey.class, str);
    }

    public static TravelPageKey[] values() {
        return (TravelPageKey[]) $VALUES.clone();
    }
}
