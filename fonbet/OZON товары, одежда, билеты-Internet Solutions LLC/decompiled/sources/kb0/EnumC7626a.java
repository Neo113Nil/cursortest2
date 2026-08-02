package kb0;

import Xc.b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kb0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC7626a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC7626a[] $VALUES;
    public static final EnumC7626a CnProd;
    public static final EnumC7626a CnStg;

    @NotNull
    public static final C1163a Companion;
    public static final EnumC7626a Prod;
    public static final EnumC7626a Stg;

    @NotNull
    private final String value;

    /* renamed from: kb0.a$a, reason: collision with other inner class name */
    public static final class C1163a {
    }

    static {
        EnumC7626a enumC7626a = new EnumC7626a("Prod", 0, "Prod");
        Prod = enumC7626a;
        EnumC7626a enumC7626a2 = new EnumC7626a("Stg", 1, "Stg");
        Stg = enumC7626a2;
        EnumC7626a enumC7626a3 = new EnumC7626a("CnProd", 2, "CnProd");
        CnProd = enumC7626a3;
        EnumC7626a enumC7626a4 = new EnumC7626a("CnStg", 3, "CnStg");
        CnStg = enumC7626a4;
        EnumC7626a[] enumC7626aArr = {enumC7626a, enumC7626a2, enumC7626a3, enumC7626a4};
        $VALUES = enumC7626aArr;
        $ENTRIES = b.a(enumC7626aArr);
        Companion = new C1163a();
    }

    private EnumC7626a(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static Xc.a<EnumC7626a> a() {
        return $ENTRIES;
    }

    public static EnumC7626a valueOf(String str) {
        return (EnumC7626a) Enum.valueOf(EnumC7626a.class, str);
    }

    public static EnumC7626a[] values() {
        return (EnumC7626a[]) $VALUES.clone();
    }

    @NotNull
    public final String b() {
        return this.value;
    }
}
