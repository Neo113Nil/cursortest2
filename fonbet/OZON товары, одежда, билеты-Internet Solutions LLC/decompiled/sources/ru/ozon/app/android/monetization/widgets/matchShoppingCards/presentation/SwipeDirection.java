package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/SwipeDirection;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwipeDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SwipeDirection[] $VALUES;
    public static final SwipeDirection LEFT = new SwipeDirection("LEFT", 0);
    public static final SwipeDirection RIGHT = new SwipeDirection("RIGHT", 1);

    private static final /* synthetic */ SwipeDirection[] $values() {
        return new SwipeDirection[]{LEFT, RIGHT};
    }

    static {
        SwipeDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SwipeDirection(String str, int i11) {
    }

    public static SwipeDirection valueOf(String str) {
        return (SwipeDirection) Enum.valueOf(SwipeDirection.class, str);
    }

    public static SwipeDirection[] values() {
        return (SwipeDirection[]) $VALUES.clone();
    }
}
