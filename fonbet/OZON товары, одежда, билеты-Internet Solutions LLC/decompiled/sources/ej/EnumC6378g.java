package ej;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ej.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6378g {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC6378g[] $VALUES;
    public static final EnumC6378g UPDATE_AVAILABLE;
    public static final EnumC6378g UPDATE_NOT_AVAILABLE;

    static {
        EnumC6378g enumC6378g = new EnumC6378g("UPDATE_AVAILABLE", 0);
        UPDATE_AVAILABLE = enumC6378g;
        EnumC6378g enumC6378g2 = new EnumC6378g("UPDATE_NOT_AVAILABLE", 1);
        UPDATE_NOT_AVAILABLE = enumC6378g2;
        EnumC6378g[] enumC6378gArr = {enumC6378g, enumC6378g2};
        $VALUES = enumC6378gArr;
        $ENTRIES = Xc.b.a(enumC6378gArr);
    }

    private EnumC6378g() {
        throw null;
    }

    public static EnumC6378g valueOf(String str) {
        return (EnumC6378g) Enum.valueOf(EnumC6378g.class, str);
    }

    public static EnumC6378g[] values() {
        return (EnumC6378g[]) $VALUES.clone();
    }
}
