package ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4BottomViewConfiguration;", "", "<init>", "(Ljava/lang/String;I)V", "PRICE_ATOM", "PRICE_ATOM_AND_BADGE", "LEFT_BADGES", "LEFT_AND_RIGHT_BADGES", "BANKS", "BANKS_AND_BADGE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PriceV4BottomViewConfiguration {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PriceV4BottomViewConfiguration[] $VALUES;
    public static final PriceV4BottomViewConfiguration PRICE_ATOM = new PriceV4BottomViewConfiguration("PRICE_ATOM", 0);
    public static final PriceV4BottomViewConfiguration PRICE_ATOM_AND_BADGE = new PriceV4BottomViewConfiguration("PRICE_ATOM_AND_BADGE", 1);
    public static final PriceV4BottomViewConfiguration LEFT_BADGES = new PriceV4BottomViewConfiguration("LEFT_BADGES", 2);
    public static final PriceV4BottomViewConfiguration LEFT_AND_RIGHT_BADGES = new PriceV4BottomViewConfiguration("LEFT_AND_RIGHT_BADGES", 3);
    public static final PriceV4BottomViewConfiguration BANKS = new PriceV4BottomViewConfiguration("BANKS", 4);
    public static final PriceV4BottomViewConfiguration BANKS_AND_BADGE = new PriceV4BottomViewConfiguration("BANKS_AND_BADGE", 5);

    private static final /* synthetic */ PriceV4BottomViewConfiguration[] $values() {
        return new PriceV4BottomViewConfiguration[]{PRICE_ATOM, PRICE_ATOM_AND_BADGE, LEFT_BADGES, LEFT_AND_RIGHT_BADGES, BANKS, BANKS_AND_BADGE};
    }

    static {
        PriceV4BottomViewConfiguration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PriceV4BottomViewConfiguration(String str, int i11) {
    }

    public static PriceV4BottomViewConfiguration valueOf(String str) {
        return (PriceV4BottomViewConfiguration) Enum.valueOf(PriceV4BottomViewConfiguration.class, str);
    }

    public static PriceV4BottomViewConfiguration[] values() {
        return (PriceV4BottomViewConfiguration[]) $VALUES.clone();
    }
}
