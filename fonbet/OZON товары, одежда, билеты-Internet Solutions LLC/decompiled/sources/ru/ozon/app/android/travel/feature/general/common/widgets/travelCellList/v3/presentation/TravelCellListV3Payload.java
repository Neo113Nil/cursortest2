package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3Payload;", "", "<init>", "(Ljava/lang/String;I)V", "DATA", "LAYOUT", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCellListV3Payload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TravelCellListV3Payload[] $VALUES;
    public static final TravelCellListV3Payload DATA = new TravelCellListV3Payload("DATA", 0);
    public static final TravelCellListV3Payload LAYOUT = new TravelCellListV3Payload("LAYOUT", 1);

    private static final /* synthetic */ TravelCellListV3Payload[] $values() {
        return new TravelCellListV3Payload[]{DATA, LAYOUT};
    }

    static {
        TravelCellListV3Payload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TravelCellListV3Payload(String str, int i11) {
    }

    public static TravelCellListV3Payload valueOf(String str) {
        return (TravelCellListV3Payload) Enum.valueOf(TravelCellListV3Payload.class, str);
    }

    public static TravelCellListV3Payload[] values() {
        return (TravelCellListV3Payload[]) $VALUES.clone();
    }
}
