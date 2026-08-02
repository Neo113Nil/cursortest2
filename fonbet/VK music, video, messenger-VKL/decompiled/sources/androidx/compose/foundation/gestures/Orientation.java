package androidx.compose.foundation.gestures;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Orientation.kt */
/* loaded from: classes11.dex */
public final class Orientation {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Orientation[] $VALUES;
    public static final Orientation Horizontal;
    public static final Orientation Vertical;

    static {
        Orientation orientation = new Orientation("Vertical", 0);
        Vertical = orientation;
        Orientation orientation2 = new Orientation("Horizontal", 1);
        Horizontal = orientation2;
        Orientation[] orientationArr = {orientation, orientation2};
        $VALUES = orientationArr;
        $ENTRIES = new asp(orientationArr);
    }

    public Orientation() {
        throw null;
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }
}
