package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/TimerPosition;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "SUBTITLE", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TimerPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TimerPosition[] $VALUES;
    public static final TimerPosition TITLE = new TimerPosition(SelectionItemDescriptionDTO.TITLE, 0);
    public static final TimerPosition SUBTITLE = new TimerPosition("SUBTITLE", 1);

    private static final /* synthetic */ TimerPosition[] $values() {
        return new TimerPosition[]{TITLE, SUBTITLE};
    }

    static {
        TimerPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TimerPosition(String str, int i11) {
    }

    public static TimerPosition valueOf(String str) {
        return (TimerPosition) Enum.valueOf(TimerPosition.class, str);
    }

    public static TimerPosition[] values() {
        return (TimerPosition[]) $VALUES.clone();
    }
}
