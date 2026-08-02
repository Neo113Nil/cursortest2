package qd;

import Sd.b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class u {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u UBYTEARRAY;
    public static final u UINTARRAY;
    public static final u ULONGARRAY;
    public static final u USHORTARRAY;

    @NotNull
    private final Sd.b classId;

    @NotNull
    private final Sd.f typeName;

    static {
        u uVar = new u("UBYTEARRAY", 0, b.a.a("kotlin/UByteArray", false));
        UBYTEARRAY = uVar;
        u uVar2 = new u("USHORTARRAY", 1, b.a.a("kotlin/UShortArray", false));
        USHORTARRAY = uVar2;
        u uVar3 = new u("UINTARRAY", 2, b.a.a("kotlin/UIntArray", false));
        UINTARRAY = uVar3;
        u uVar4 = new u("ULONGARRAY", 3, b.a.a("kotlin/ULongArray", false));
        ULONGARRAY = uVar4;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        $VALUES = uVarArr;
        $ENTRIES = Xc.b.a(uVarArr);
    }

    private u(String str, int i11, Sd.b bVar) {
        this.classId = bVar;
        this.typeName = bVar.h();
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    @NotNull
    public final Sd.f a() {
        return this.typeName;
    }
}
