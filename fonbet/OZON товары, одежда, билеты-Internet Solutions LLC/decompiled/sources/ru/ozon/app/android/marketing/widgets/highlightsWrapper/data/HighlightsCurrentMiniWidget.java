package ru.ozon.app.android.marketing.widgets.highlightsWrapper.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY_STATE", "ACTION_PROGRESS", "COUPON", "HIGHLIGHT_PRODUCTS", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HighlightsCurrentMiniWidget {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HighlightsCurrentMiniWidget[] $VALUES;
    public static final HighlightsCurrentMiniWidget EMPTY_STATE = new HighlightsCurrentMiniWidget("EMPTY_STATE", 0);
    public static final HighlightsCurrentMiniWidget ACTION_PROGRESS = new HighlightsCurrentMiniWidget("ACTION_PROGRESS", 1);
    public static final HighlightsCurrentMiniWidget COUPON = new HighlightsCurrentMiniWidget("COUPON", 2);
    public static final HighlightsCurrentMiniWidget HIGHLIGHT_PRODUCTS = new HighlightsCurrentMiniWidget("HIGHLIGHT_PRODUCTS", 3);

    private static final /* synthetic */ HighlightsCurrentMiniWidget[] $values() {
        return new HighlightsCurrentMiniWidget[]{EMPTY_STATE, ACTION_PROGRESS, COUPON, HIGHLIGHT_PRODUCTS};
    }

    static {
        HighlightsCurrentMiniWidget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private HighlightsCurrentMiniWidget(String str, int i11) {
    }

    public static HighlightsCurrentMiniWidget valueOf(String str) {
        return (HighlightsCurrentMiniWidget) Enum.valueOf(HighlightsCurrentMiniWidget.class, str);
    }

    public static HighlightsCurrentMiniWidget[] values() {
        return (HighlightsCurrentMiniWidget[]) $VALUES.clone();
    }
}
