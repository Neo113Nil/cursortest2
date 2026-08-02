package ru.ozon.app.android.storefront.stories.story.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/data/Direction;", "", "<init>", "(Ljava/lang/String;I)V", "DIRECTION_HORIZONTAL", "DIRECTION_VERTICAL", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Direction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction DIRECTION_HORIZONTAL = new Direction("DIRECTION_HORIZONTAL", 0);
    public static final Direction DIRECTION_VERTICAL = new Direction("DIRECTION_VERTICAL", 1);

    private static final /* synthetic */ Direction[] $values() {
        return new Direction[]{DIRECTION_HORIZONTAL, DIRECTION_VERTICAL};
    }

    static {
        Direction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Direction(String str, int i11) {
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
