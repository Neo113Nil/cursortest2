package ru.ozon.uni.atoms.data.controls.button;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/IconSide;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconSide {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IconSide[] $VALUES;
    public static final IconSide START = new IconSide("START", 0);
    public static final IconSide END = new IconSide("END", 1);

    private static final /* synthetic */ IconSide[] $values() {
        return new IconSide[]{START, END};
    }

    static {
        IconSide[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private IconSide(String str, int i11) {
    }

    @NotNull
    public static a<IconSide> getEntries() {
        return $ENTRIES;
    }

    public static IconSide valueOf(String str) {
        return (IconSide) Enum.valueOf(IconSide.class, str);
    }

    public static IconSide[] values() {
        return (IconSide[]) $VALUES.clone();
    }
}
