package ru.ozon.app.android.common.serviceCarousel.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/data/CornersState;", "", "<init>", "(Ljava/lang/String;I)V", "WITHOUT", "TOP", "BOTTOM", "BOTH", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CornersState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CornersState[] $VALUES;
    public static final CornersState WITHOUT = new CornersState("WITHOUT", 0);
    public static final CornersState TOP = new CornersState("TOP", 1);
    public static final CornersState BOTTOM = new CornersState("BOTTOM", 2);
    public static final CornersState BOTH = new CornersState("BOTH", 3);

    private static final /* synthetic */ CornersState[] $values() {
        return new CornersState[]{WITHOUT, TOP, BOTTOM, BOTH};
    }

    static {
        CornersState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CornersState(String str, int i11) {
    }

    public static CornersState valueOf(String str) {
        return (CornersState) Enum.valueOf(CornersState.class, str);
    }

    public static CornersState[] values() {
        return (CornersState[]) $VALUES.clone();
    }
}
