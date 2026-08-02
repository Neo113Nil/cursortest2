package ru.ozon.uni.android.component.sheet;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/component/sheet/SheetMode;", "", "<init>", "(Ljava/lang/String;I)V", "FULLSCREEN", "HALF_SCREEN", "HUG_CONTENT", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SheetMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SheetMode[] $VALUES;
    public static final SheetMode FULLSCREEN = new SheetMode("FULLSCREEN", 0);
    public static final SheetMode HALF_SCREEN = new SheetMode("HALF_SCREEN", 1);
    public static final SheetMode HUG_CONTENT = new SheetMode("HUG_CONTENT", 2);

    private static final /* synthetic */ SheetMode[] $values() {
        return new SheetMode[]{FULLSCREEN, HALF_SCREEN, HUG_CONTENT};
    }

    static {
        SheetMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SheetMode(String str, int i11) {
    }

    public static SheetMode valueOf(String str) {
        return (SheetMode) Enum.valueOf(SheetMode.class, str);
    }

    public static SheetMode[] values() {
        return (SheetMode[]) $VALUES.clone();
    }
}
