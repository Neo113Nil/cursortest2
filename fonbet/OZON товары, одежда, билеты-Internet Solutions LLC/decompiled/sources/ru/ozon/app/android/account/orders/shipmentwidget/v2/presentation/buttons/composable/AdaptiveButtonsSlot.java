package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.composable;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/composable/AdaptiveButtonsSlot;", "", "<init>", "(Ljava/lang/String;I)V", "FirstMeasure", "SecondMeasure", "FirstContent", "SecondContent", "IconButton", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdaptiveButtonsSlot {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdaptiveButtonsSlot[] $VALUES;
    public static final AdaptiveButtonsSlot FirstMeasure = new AdaptiveButtonsSlot("FirstMeasure", 0);
    public static final AdaptiveButtonsSlot SecondMeasure = new AdaptiveButtonsSlot("SecondMeasure", 1);
    public static final AdaptiveButtonsSlot FirstContent = new AdaptiveButtonsSlot("FirstContent", 2);
    public static final AdaptiveButtonsSlot SecondContent = new AdaptiveButtonsSlot("SecondContent", 3);
    public static final AdaptiveButtonsSlot IconButton = new AdaptiveButtonsSlot("IconButton", 4);

    private static final /* synthetic */ AdaptiveButtonsSlot[] $values() {
        return new AdaptiveButtonsSlot[]{FirstMeasure, SecondMeasure, FirstContent, SecondContent, IconButton};
    }

    static {
        AdaptiveButtonsSlot[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AdaptiveButtonsSlot(String str, int i11) {
    }

    public static AdaptiveButtonsSlot valueOf(String str) {
        return (AdaptiveButtonsSlot) Enum.valueOf(AdaptiveButtonsSlot.class, str);
    }

    public static AdaptiveButtonsSlot[] values() {
        return (AdaptiveButtonsSlot[]) $VALUES.clone();
    }
}
