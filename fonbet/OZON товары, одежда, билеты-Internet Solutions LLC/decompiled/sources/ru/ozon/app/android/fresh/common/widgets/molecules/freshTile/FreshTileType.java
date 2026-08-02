package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "", "<init>", "(Ljava/lang/String;I)V", "MINI", "MEDIUM", "MAX", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTileType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FreshTileType[] $VALUES;
    public static final FreshTileType MINI = new FreshTileType("MINI", 0);
    public static final FreshTileType MEDIUM = new FreshTileType("MEDIUM", 1);
    public static final FreshTileType MAX = new FreshTileType("MAX", 2);

    private static final /* synthetic */ FreshTileType[] $values() {
        return new FreshTileType[]{MINI, MEDIUM, MAX};
    }

    static {
        FreshTileType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private FreshTileType(String str, int i11) {
    }

    public static FreshTileType valueOf(String str) {
        return (FreshTileType) Enum.valueOf(FreshTileType.class, str);
    }

    public static FreshTileType[] values() {
        return (FreshTileType[]) $VALUES.clone();
    }
}
