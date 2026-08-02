package pc0;

import Xc.b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8897a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC8897a[] $VALUES;
    public static final EnumC8897a INSTALL;
    public static final EnumC8897a UPDATE;

    @NotNull
    private final String queryParameterValue;

    static {
        EnumC8897a enumC8897a = new EnumC8897a("INSTALL", 0, "install");
        INSTALL = enumC8897a;
        EnumC8897a enumC8897a2 = new EnumC8897a("UPDATE", 1, "update");
        UPDATE = enumC8897a2;
        EnumC8897a[] enumC8897aArr = {enumC8897a, enumC8897a2};
        $VALUES = enumC8897aArr;
        $ENTRIES = b.a(enumC8897aArr);
    }

    private EnumC8897a(String str, int i11, String str2) {
        this.queryParameterValue = str2;
    }

    public static EnumC8897a valueOf(String str) {
        return (EnumC8897a) Enum.valueOf(EnumC8897a.class, str);
    }

    public static EnumC8897a[] values() {
        return (EnumC8897a[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.queryParameterValue;
    }
}
