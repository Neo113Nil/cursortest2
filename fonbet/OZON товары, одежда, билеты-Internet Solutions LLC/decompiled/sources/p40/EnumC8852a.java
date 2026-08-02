package p40;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8852a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC8852a[] $VALUES;
    public static final EnumC8852a GOOGLE_PLAY;
    public static final EnumC8852a NONE;
    public static final EnumC8852a OZON_SDK;
    public static final EnumC8852a RUSTORE;

    static {
        EnumC8852a enumC8852a = new EnumC8852a("RUSTORE", 0);
        RUSTORE = enumC8852a;
        EnumC8852a enumC8852a2 = new EnumC8852a("GOOGLE_PLAY", 1);
        GOOGLE_PLAY = enumC8852a2;
        EnumC8852a enumC8852a3 = new EnumC8852a("OZON_SDK", 2);
        OZON_SDK = enumC8852a3;
        EnumC8852a enumC8852a4 = new EnumC8852a("NONE", 3);
        NONE = enumC8852a4;
        EnumC8852a[] enumC8852aArr = {enumC8852a, enumC8852a2, enumC8852a3, enumC8852a4};
        $VALUES = enumC8852aArr;
        $ENTRIES = Xc.b.a(enumC8852aArr);
    }

    private EnumC8852a() {
        throw null;
    }

    @NotNull
    public static Xc.a<EnumC8852a> a() {
        return $ENTRIES;
    }

    public static EnumC8852a valueOf(String str) {
        return (EnumC8852a) Enum.valueOf(EnumC8852a.class, str);
    }

    public static EnumC8852a[] values() {
        return (EnumC8852a[]) $VALUES.clone();
    }
}
