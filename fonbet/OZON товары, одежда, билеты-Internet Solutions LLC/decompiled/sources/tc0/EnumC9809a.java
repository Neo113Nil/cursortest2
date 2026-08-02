package tc0;

import Xc.b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC9809a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC9809a[] $VALUES;
    public static final EnumC9809a BIND;
    public static final EnumC9809a MIGRATE;

    @NotNull
    private final String queryParamValue;

    static {
        EnumC9809a enumC9809a = new EnumC9809a("MIGRATE", 0, "migrate");
        MIGRATE = enumC9809a;
        EnumC9809a enumC9809a2 = new EnumC9809a("BIND", 1, "bind");
        BIND = enumC9809a2;
        EnumC9809a[] enumC9809aArr = {enumC9809a, enumC9809a2};
        $VALUES = enumC9809aArr;
        $ENTRIES = b.a(enumC9809aArr);
    }

    private EnumC9809a(String str, int i11, String str2) {
        this.queryParamValue = str2;
    }

    public static EnumC9809a valueOf(String str) {
        return (EnumC9809a) Enum.valueOf(EnumC9809a.class, str);
    }

    public static EnumC9809a[] values() {
        return (EnumC9809a[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.queryParamValue;
    }
}
