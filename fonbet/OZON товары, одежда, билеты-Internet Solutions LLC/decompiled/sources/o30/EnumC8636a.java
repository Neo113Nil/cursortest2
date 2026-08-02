package o30;

import Xc.b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8636a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC8636a[] $VALUES;
    public static final EnumC8636a BECOME_ACTIVE;
    public static final EnumC8636a ENTER_BACKGROUND;

    @NotNull
    private final String value;

    static {
        EnumC8636a enumC8636a = new EnumC8636a("BECOME_ACTIVE", 0, "becomeActive");
        BECOME_ACTIVE = enumC8636a;
        EnumC8636a enumC8636a2 = new EnumC8636a("ENTER_BACKGROUND", 1, "enterBackground");
        ENTER_BACKGROUND = enumC8636a2;
        EnumC8636a[] enumC8636aArr = {enumC8636a, enumC8636a2};
        $VALUES = enumC8636aArr;
        $ENTRIES = b.a(enumC8636aArr);
    }

    private EnumC8636a(String str, int i11, String str2) {
        this.value = str2;
    }

    public static EnumC8636a valueOf(String str) {
        return (EnumC8636a) Enum.valueOf(EnumC8636a.class, str);
    }

    public static EnumC8636a[] values() {
        return (EnumC8636a[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.value;
    }
}
