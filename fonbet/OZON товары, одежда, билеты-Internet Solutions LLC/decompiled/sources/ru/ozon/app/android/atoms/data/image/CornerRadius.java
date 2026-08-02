package ru.ozon.app.android.atoms.data.image;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/atoms/data/image/CornerRadius;", "", "px", "", "<init>", "(Ljava/lang/String;II)V", "getPx", "()I", "NO_RADIUS", "RADIUS_200", "RADIUS_250", "RADIUS_300", "RADIUS_350", "RADIUS_400", "RADIUS_450", "RADIUS_500", "RADIUS_525", "RADIUS_550", "RADIUS_600", "RADIUS_650", "RADIUS_700", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CornerRadius {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CornerRadius[] $VALUES;
    public static final CornerRadius NO_RADIUS = new CornerRadius("NO_RADIUS", 0, 0);
    public static final CornerRadius RADIUS_200 = new CornerRadius("RADIUS_200", 1, 4);
    public static final CornerRadius RADIUS_250 = new CornerRadius("RADIUS_250", 2, 6);
    public static final CornerRadius RADIUS_300 = new CornerRadius("RADIUS_300", 3, 8);
    public static final CornerRadius RADIUS_350 = new CornerRadius("RADIUS_350", 4, 10);
    public static final CornerRadius RADIUS_400 = new CornerRadius("RADIUS_400", 5, 12);
    public static final CornerRadius RADIUS_450 = new CornerRadius("RADIUS_450", 6, 14);
    public static final CornerRadius RADIUS_500 = new CornerRadius("RADIUS_500", 7, 16);
    public static final CornerRadius RADIUS_525 = new CornerRadius("RADIUS_525", 8, 18);
    public static final CornerRadius RADIUS_550 = new CornerRadius("RADIUS_550", 9, 20);
    public static final CornerRadius RADIUS_600 = new CornerRadius("RADIUS_600", 10, 24);
    public static final CornerRadius RADIUS_650 = new CornerRadius("RADIUS_650", 11, 28);
    public static final CornerRadius RADIUS_700 = new CornerRadius("RADIUS_700", 12, 32);
    private final int px;

    private static final /* synthetic */ CornerRadius[] $values() {
        return new CornerRadius[]{NO_RADIUS, RADIUS_200, RADIUS_250, RADIUS_300, RADIUS_350, RADIUS_400, RADIUS_450, RADIUS_500, RADIUS_525, RADIUS_550, RADIUS_600, RADIUS_650, RADIUS_700};
    }

    static {
        CornerRadius[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CornerRadius(String str, int i11, int i12) {
        this.px = i12;
    }

    @NotNull
    public static a<CornerRadius> getEntries() {
        return $ENTRIES;
    }

    public static CornerRadius valueOf(String str) {
        return (CornerRadius) Enum.valueOf(CornerRadius.class, str);
    }

    public static CornerRadius[] values() {
        return (CornerRadius[]) $VALUES.clone();
    }

    public final int getPx() {
        return this.px;
    }
}
