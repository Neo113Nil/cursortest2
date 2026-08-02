package ru.ozon.app.android.checkoutcomposer.common.promoIcon;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PromoIconPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PromoIconPosition[] $VALUES;
    public static final PromoIconPosition TOP_LEFT = new PromoIconPosition("TOP_LEFT", 0);
    public static final PromoIconPosition TOP_RIGHT = new PromoIconPosition("TOP_RIGHT", 1);
    public static final PromoIconPosition BOTTOM_LEFT = new PromoIconPosition("BOTTOM_LEFT", 2);
    public static final PromoIconPosition BOTTOM_RIGHT = new PromoIconPosition("BOTTOM_RIGHT", 3);

    private static final /* synthetic */ PromoIconPosition[] $values() {
        return new PromoIconPosition[]{TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT};
    }

    static {
        PromoIconPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PromoIconPosition(String str, int i11) {
    }

    public static PromoIconPosition valueOf(String str) {
        return (PromoIconPosition) Enum.valueOf(PromoIconPosition.class, str);
    }

    public static PromoIconPosition[] values() {
        return (PromoIconPosition[]) $VALUES.clone();
    }
}
