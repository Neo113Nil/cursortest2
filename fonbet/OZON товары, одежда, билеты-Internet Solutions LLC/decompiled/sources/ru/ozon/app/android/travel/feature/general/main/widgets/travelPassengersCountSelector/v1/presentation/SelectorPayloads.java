package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/SelectorPayloads;", "", "<init>", "(Ljava/lang/String;I)V", "CELLS", "TRAVEL_CLASS_SELECTOR", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SelectorPayloads {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SelectorPayloads[] $VALUES;
    public static final SelectorPayloads CELLS = new SelectorPayloads("CELLS", 0);
    public static final SelectorPayloads TRAVEL_CLASS_SELECTOR = new SelectorPayloads("TRAVEL_CLASS_SELECTOR", 1);

    private static final /* synthetic */ SelectorPayloads[] $values() {
        return new SelectorPayloads[]{CELLS, TRAVEL_CLASS_SELECTOR};
    }

    static {
        SelectorPayloads[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SelectorPayloads(String str, int i11) {
    }

    public static SelectorPayloads valueOf(String str) {
        return (SelectorPayloads) Enum.valueOf(SelectorPayloads.class, str);
    }

    public static SelectorPayloads[] values() {
        return (SelectorPayloads[]) $VALUES.clone();
    }
}
