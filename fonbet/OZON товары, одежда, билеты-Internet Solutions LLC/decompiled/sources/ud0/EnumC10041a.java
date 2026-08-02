package ud0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ud0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC10041a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC10041a[] $VALUES;
    public static final EnumC10041a Cellular2G;
    public static final EnumC10041a Cellular3G;
    public static final EnumC10041a Cellular4G;
    public static final EnumC10041a NoInternet;
    public static final EnumC10041a Unknown;
    public static final EnumC10041a WiFi;

    @NotNull
    private final String serialized;

    static {
        EnumC10041a enumC10041a = new EnumC10041a("Unknown", 0, "CONNECTION_TYPE_UNKNOWN");
        Unknown = enumC10041a;
        EnumC10041a enumC10041a2 = new EnumC10041a("Cellular2G", 1, "CELLULAR_2G");
        Cellular2G = enumC10041a2;
        EnumC10041a enumC10041a3 = new EnumC10041a("Cellular3G", 2, "CELLULAR_3G");
        Cellular3G = enumC10041a3;
        EnumC10041a enumC10041a4 = new EnumC10041a("Cellular4G", 3, "CELLULAR_4G");
        Cellular4G = enumC10041a4;
        EnumC10041a enumC10041a5 = new EnumC10041a("WiFi", 4, "WIFI");
        WiFi = enumC10041a5;
        EnumC10041a enumC10041a6 = new EnumC10041a("NoInternet", 5, "NO_INTERNET");
        NoInternet = enumC10041a6;
        EnumC10041a[] enumC10041aArr = {enumC10041a, enumC10041a2, enumC10041a3, enumC10041a4, enumC10041a5, enumC10041a6};
        $VALUES = enumC10041aArr;
        $ENTRIES = Xc.b.a(enumC10041aArr);
    }

    private EnumC10041a(String str, int i11, String str2) {
        this.serialized = str2;
    }

    public static EnumC10041a valueOf(String str) {
        return (EnumC10041a) Enum.valueOf(EnumC10041a.class, str);
    }

    public static EnumC10041a[] values() {
        return (EnumC10041a[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.serialized;
    }
}
