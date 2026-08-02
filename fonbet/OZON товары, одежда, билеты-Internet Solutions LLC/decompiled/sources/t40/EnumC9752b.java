package t40;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t40.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC9752b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC9752b[] $VALUES;
    public static final EnumC9752b CENTER;
    public static final EnumC9752b END;
    public static final EnumC9752b START;

    static {
        EnumC9752b enumC9752b = new EnumC9752b("START", 0);
        START = enumC9752b;
        EnumC9752b enumC9752b2 = new EnumC9752b("CENTER", 1);
        CENTER = enumC9752b2;
        EnumC9752b enumC9752b3 = new EnumC9752b("END", 2);
        END = enumC9752b3;
        EnumC9752b[] enumC9752bArr = {enumC9752b, enumC9752b2, enumC9752b3};
        $VALUES = enumC9752bArr;
        $ENTRIES = Xc.b.a(enumC9752bArr);
    }

    private EnumC9752b() {
        throw null;
    }

    @NotNull
    public static Xc.a<EnumC9752b> a() {
        return $ENTRIES;
    }

    public static EnumC9752b valueOf(String str) {
        return (EnumC9752b) Enum.valueOf(EnumC9752b.class, str);
    }

    public static EnumC9752b[] values() {
        return (EnumC9752b[]) $VALUES.clone();
    }
}
