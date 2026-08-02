package w20;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w20.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC10419a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC10419a[] $VALUES;

    @NotNull
    public static final C2241a Companion;
    public static final EnumC10419a DEBUG_LOCALIZATION;
    public static final EnumC10419a SHOW;

    @NotNull
    private final String path;

    /* renamed from: w20.a$a, reason: collision with other inner class name */
    public static final class C2241a {
    }

    static {
        EnumC10419a enumC10419a = new EnumC10419a("SHOW", 0, "show");
        SHOW = enumC10419a;
        EnumC10419a enumC10419a2 = new EnumC10419a("DEBUG_LOCALIZATION", 1, "debugLocalization");
        DEBUG_LOCALIZATION = enumC10419a2;
        EnumC10419a[] enumC10419aArr = {enumC10419a, enumC10419a2};
        $VALUES = enumC10419aArr;
        $ENTRIES = Xc.b.a(enumC10419aArr);
        Companion = new C2241a();
    }

    private EnumC10419a(String str, int i11, String str2) {
        this.path = str2;
    }

    @NotNull
    public static Xc.a<EnumC10419a> a() {
        return $ENTRIES;
    }

    public static EnumC10419a valueOf(String str) {
        return (EnumC10419a) Enum.valueOf(EnumC10419a.class, str);
    }

    public static EnumC10419a[] values() {
        return (EnumC10419a[]) $VALUES.clone();
    }

    @NotNull
    public final String b() {
        return this.path;
    }
}
