package ru.ozon.app.android.search.widgets.dialogSearchBar.data.api;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "REDIRECT_TO_DIALOG", "SCROLL", "ENTER", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;

    @i(name = "redirectToDialog")
    public static final ActionType REDIRECT_TO_DIALOG = new ActionType("REDIRECT_TO_DIALOG", 0);

    @i(name = "scroll")
    public static final ActionType SCROLL = new ActionType("SCROLL", 1);

    @i(name = "enter")
    public static final ActionType ENTER = new ActionType("ENTER", 2);

    private static final /* synthetic */ ActionType[] $values() {
        return new ActionType[]{REDIRECT_TO_DIALOG, SCROLL, ENTER};
    }

    static {
        ActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ActionType(String str, int i11) {
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
