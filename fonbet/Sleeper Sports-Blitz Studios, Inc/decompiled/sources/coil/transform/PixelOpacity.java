package coil.transform;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PixelOpacity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcoil/transform/PixelOpacity;", "", "<init>", "(Ljava/lang/String;I)V", "UNCHANGED", "TRANSLUCENT", "OPAQUE", "coil-gif_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PixelOpacity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PixelOpacity[] $VALUES;
    public static final PixelOpacity UNCHANGED = new PixelOpacity("UNCHANGED", 0);
    public static final PixelOpacity TRANSLUCENT = new PixelOpacity("TRANSLUCENT", 1);
    public static final PixelOpacity OPAQUE = new PixelOpacity("OPAQUE", 2);

    private static final /* synthetic */ PixelOpacity[] $values() {
        return new PixelOpacity[]{UNCHANGED, TRANSLUCENT, OPAQUE};
    }

    public static EnumEntries<PixelOpacity> getEntries() {
        return $ENTRIES;
    }

    private PixelOpacity(String str, int i) {
    }

    static {
        PixelOpacity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static PixelOpacity valueOf(String str) {
        return (PixelOpacity) Enum.valueOf(PixelOpacity.class, str);
    }

    public static PixelOpacity[] values() {
        return (PixelOpacity[]) $VALUES.clone();
    }
}
