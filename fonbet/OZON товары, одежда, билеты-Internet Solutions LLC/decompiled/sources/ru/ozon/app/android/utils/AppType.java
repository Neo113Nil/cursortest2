package ru.ozon.app.android.utils;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/utils/AppType;", "", "<init>", "(Ljava/lang/String;I)V", "BX", "SELECT", "TRAVEL", "FRESH", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AppType[] $VALUES;

    /* renamed from: BX, reason: collision with root package name */
    public static final AppType f94580BX = new AppType("BX", 0);
    public static final AppType SELECT = new AppType("SELECT", 1);
    public static final AppType TRAVEL = new AppType("TRAVEL", 2);
    public static final AppType FRESH = new AppType("FRESH", 3);

    private static final /* synthetic */ AppType[] $values() {
        return new AppType[]{f94580BX, SELECT, TRAVEL, FRESH};
    }

    static {
        AppType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AppType(String str, int i11) {
    }

    public static AppType valueOf(String str) {
        return (AppType) Enum.valueOf(AppType.class, str);
    }

    public static AppType[] values() {
        return (AppType[]) $VALUES.clone();
    }
}
