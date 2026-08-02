package ru.ozon.app.android.geo.map.utils;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/map/utils/CameraMotionState;", "", "<init>", "(Ljava/lang/String;I)V", "MOVING", "IDLE", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CameraMotionState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CameraMotionState[] $VALUES;
    public static final CameraMotionState MOVING = new CameraMotionState("MOVING", 0);
    public static final CameraMotionState IDLE = new CameraMotionState("IDLE", 1);

    private static final /* synthetic */ CameraMotionState[] $values() {
        return new CameraMotionState[]{MOVING, IDLE};
    }

    static {
        CameraMotionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CameraMotionState(String str, int i11) {
    }

    public static CameraMotionState valueOf(String str) {
        return (CameraMotionState) Enum.valueOf(CameraMotionState.class, str);
    }

    public static CameraMotionState[] values() {
        return (CameraMotionState[]) $VALUES.clone();
    }
}
