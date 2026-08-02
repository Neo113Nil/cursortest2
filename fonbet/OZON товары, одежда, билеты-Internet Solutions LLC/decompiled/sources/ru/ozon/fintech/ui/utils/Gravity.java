package ru.ozon.fintech.ui.utils;

import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/fintech/ui/utils/Gravity;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "START", "END", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Gravity {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ Gravity[] $VALUES;
    public static final Gravity CENTER = new Gravity("CENTER", 0);
    public static final Gravity START = new Gravity("START", 1);
    public static final Gravity END = new Gravity("END", 2);

    private static final /* synthetic */ Gravity[] $values() {
        return new Gravity[]{CENTER, START, END};
    }

    static {
        Gravity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Gravity(String str, int i11) {
    }

    @NotNull
    public static Xc.a<Gravity> getEntries() {
        return $ENTRIES;
    }

    public static Gravity valueOf(String str) {
        return (Gravity) Enum.valueOf(Gravity.class, str);
    }

    public static Gravity[] values() {
        return (Gravity[]) $VALUES.clone();
    }
}
