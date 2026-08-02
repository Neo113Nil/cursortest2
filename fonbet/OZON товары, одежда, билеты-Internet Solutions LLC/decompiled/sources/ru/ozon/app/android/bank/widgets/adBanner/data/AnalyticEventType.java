package ru.ozon.app.android.bank.widgets.adBanner.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/data/AnalyticEventType;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW", "CLICK", "CLOSE", "IMAGE_CLICK", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnalyticEventType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnalyticEventType[] $VALUES;
    public static final AnalyticEventType VIEW = new AnalyticEventType("VIEW", 0);
    public static final AnalyticEventType CLICK = new AnalyticEventType("CLICK", 1);
    public static final AnalyticEventType CLOSE = new AnalyticEventType("CLOSE", 2);
    public static final AnalyticEventType IMAGE_CLICK = new AnalyticEventType("IMAGE_CLICK", 3);

    private static final /* synthetic */ AnalyticEventType[] $values() {
        return new AnalyticEventType[]{VIEW, CLICK, CLOSE, IMAGE_CLICK};
    }

    static {
        AnalyticEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AnalyticEventType(String str, int i11) {
    }

    public static AnalyticEventType valueOf(String str) {
        return (AnalyticEventType) Enum.valueOf(AnalyticEventType.class, str);
    }

    public static AnalyticEventType[] values() {
        return (AnalyticEventType[]) $VALUES.clone();
    }
}
