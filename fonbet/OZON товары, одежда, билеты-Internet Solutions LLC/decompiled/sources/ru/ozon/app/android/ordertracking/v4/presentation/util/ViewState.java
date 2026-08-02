package ru.ozon.app.android.ordertracking.v4.presentation.util;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/ViewState;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_SUBTITLE", "STATUS_BUTTON", "STATUS_BADGE", "STATUS_TITLE_SUBTITLE", "STATUS_BADGE_SUBTITLE", "ALL", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ViewState[] $VALUES;
    public static final ViewState STATUS_SUBTITLE = new ViewState("STATUS_SUBTITLE", 0);
    public static final ViewState STATUS_BUTTON = new ViewState("STATUS_BUTTON", 1);
    public static final ViewState STATUS_BADGE = new ViewState("STATUS_BADGE", 2);
    public static final ViewState STATUS_TITLE_SUBTITLE = new ViewState("STATUS_TITLE_SUBTITLE", 3);
    public static final ViewState STATUS_BADGE_SUBTITLE = new ViewState("STATUS_BADGE_SUBTITLE", 4);
    public static final ViewState ALL = new ViewState("ALL", 5);

    private static final /* synthetic */ ViewState[] $values() {
        return new ViewState[]{STATUS_SUBTITLE, STATUS_BUTTON, STATUS_BADGE, STATUS_TITLE_SUBTITLE, STATUS_BADGE_SUBTITLE, ALL};
    }

    static {
        ViewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ViewState(String str, int i11) {
    }

    public static ViewState valueOf(String str) {
        return (ViewState) Enum.valueOf(ViewState.class, str);
    }

    public static ViewState[] values() {
        return (ViewState[]) $VALUES.clone();
    }
}
