package td;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: td.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9812C {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC9812C[] $VALUES;
    public static final EnumC9812C ABSTRACT;

    @NotNull
    public static final a Companion;
    public static final EnumC9812C FINAL;
    public static final EnumC9812C OPEN;
    public static final EnumC9812C SEALED;

    /* renamed from: td.C$a */
    public static final class a {
    }

    static {
        EnumC9812C enumC9812C = new EnumC9812C("FINAL", 0);
        FINAL = enumC9812C;
        EnumC9812C enumC9812C2 = new EnumC9812C("SEALED", 1);
        SEALED = enumC9812C2;
        EnumC9812C enumC9812C3 = new EnumC9812C("OPEN", 2);
        OPEN = enumC9812C3;
        EnumC9812C enumC9812C4 = new EnumC9812C("ABSTRACT", 3);
        ABSTRACT = enumC9812C4;
        EnumC9812C[] enumC9812CArr = {enumC9812C, enumC9812C2, enumC9812C3, enumC9812C4};
        $VALUES = enumC9812CArr;
        $ENTRIES = Xc.b.a(enumC9812CArr);
        Companion = new a();
    }

    private EnumC9812C() {
        throw null;
    }

    public static EnumC9812C valueOf(String str) {
        return (EnumC9812C) Enum.valueOf(EnumC9812C.class, str);
    }

    public static EnumC9812C[] values() {
        return (EnumC9812C[]) $VALUES.clone();
    }
}
