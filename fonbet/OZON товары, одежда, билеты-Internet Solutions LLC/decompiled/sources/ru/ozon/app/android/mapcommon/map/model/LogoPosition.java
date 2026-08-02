package ru.ozon.app.android.mapcommon.map.model;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/mapcommon/map/model/LogoPosition;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT_TOP", "RIGHT_TOP", "LEFT_BOTTOM", "RIGHT_BOTTOM", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LogoPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogoPosition[] $VALUES;
    public static final LogoPosition LEFT_TOP = new LogoPosition("LEFT_TOP", 0);
    public static final LogoPosition RIGHT_TOP = new LogoPosition("RIGHT_TOP", 1);
    public static final LogoPosition LEFT_BOTTOM = new LogoPosition("LEFT_BOTTOM", 2);
    public static final LogoPosition RIGHT_BOTTOM = new LogoPosition("RIGHT_BOTTOM", 3);

    private static final /* synthetic */ LogoPosition[] $values() {
        return new LogoPosition[]{LEFT_TOP, RIGHT_TOP, LEFT_BOTTOM, RIGHT_BOTTOM};
    }

    static {
        LogoPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LogoPosition(String str, int i11) {
    }

    public static LogoPosition valueOf(String str) {
        return (LogoPosition) Enum.valueOf(LogoPosition.class, str);
    }

    public static LogoPosition[] values() {
        return (LogoPosition[]) $VALUES.clone();
    }
}
