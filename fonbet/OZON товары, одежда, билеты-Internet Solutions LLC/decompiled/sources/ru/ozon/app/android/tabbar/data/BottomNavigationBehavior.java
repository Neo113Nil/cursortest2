package ru.ozon.app.android.tabbar.data;

import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "BEHAVIOR_TYPE_SELECT", "BEHAVIOR_TYPE_REDIRECT", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BottomNavigationBehavior {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ BottomNavigationBehavior[] $VALUES;
    public static final BottomNavigationBehavior BEHAVIOR_TYPE_SELECT = new BottomNavigationBehavior("BEHAVIOR_TYPE_SELECT", 0);
    public static final BottomNavigationBehavior BEHAVIOR_TYPE_REDIRECT = new BottomNavigationBehavior("BEHAVIOR_TYPE_REDIRECT", 1);

    private static final /* synthetic */ BottomNavigationBehavior[] $values() {
        return new BottomNavigationBehavior[]{BEHAVIOR_TYPE_SELECT, BEHAVIOR_TYPE_REDIRECT};
    }

    static {
        BottomNavigationBehavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private BottomNavigationBehavior(String str, int i11) {
    }

    public static BottomNavigationBehavior valueOf(String str) {
        return (BottomNavigationBehavior) Enum.valueOf(BottomNavigationBehavior.class, str);
    }

    public static BottomNavigationBehavior[] values() {
        return (BottomNavigationBehavior[]) $VALUES.clone();
    }
}
