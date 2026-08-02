package ru.ozon.app.android.universalwidgets.widgets.uw.utils;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "TOP", "BOTTOM", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RoundMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RoundMode[] $VALUES;
    public static final RoundMode ALL = new RoundMode("ALL", 0);
    public static final RoundMode TOP = new RoundMode("TOP", 1);
    public static final RoundMode BOTTOM = new RoundMode("BOTTOM", 2);

    private static final /* synthetic */ RoundMode[] $values() {
        return new RoundMode[]{ALL, TOP, BOTTOM};
    }

    static {
        RoundMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private RoundMode(String str, int i11) {
    }

    public static RoundMode valueOf(String str) {
        return (RoundMode) Enum.valueOf(RoundMode.class, str);
    }

    public static RoundMode[] values() {
        return (RoundMode[]) $VALUES.clone();
    }
}
