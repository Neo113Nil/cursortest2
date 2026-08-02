package ru.ozon.uni.ozi.components.island.presets;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/island/presets/OziIslandCorners;", "", "<init>", "(Ljava/lang/String;I)V", "TopStart", "TopEnd", "BottomEnd", "BottomStart", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIslandCorners {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziIslandCorners[] $VALUES;
    public static final OziIslandCorners TopStart = new OziIslandCorners("TopStart", 0);
    public static final OziIslandCorners TopEnd = new OziIslandCorners("TopEnd", 1);
    public static final OziIslandCorners BottomEnd = new OziIslandCorners("BottomEnd", 2);
    public static final OziIslandCorners BottomStart = new OziIslandCorners("BottomStart", 3);

    private static final /* synthetic */ OziIslandCorners[] $values() {
        return new OziIslandCorners[]{TopStart, TopEnd, BottomEnd, BottomStart};
    }

    static {
        OziIslandCorners[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziIslandCorners(String str, int i11) {
    }

    public static OziIslandCorners valueOf(String str) {
        return (OziIslandCorners) Enum.valueOf(OziIslandCorners.class, str);
    }

    public static OziIslandCorners[] values() {
        return (OziIslandCorners[]) $VALUES.clone();
    }
}
