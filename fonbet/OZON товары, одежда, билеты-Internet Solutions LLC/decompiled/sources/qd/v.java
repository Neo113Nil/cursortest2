package qd;

import Sd.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class v {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v UBYTE;
    public static final v UINT;
    public static final v ULONG;
    public static final v USHORT;

    @NotNull
    private final Sd.b arrayClassId;

    @NotNull
    private final Sd.b classId;

    @NotNull
    private final Sd.f typeName;

    static {
        v vVar = new v("UBYTE", 0, b.a.a("kotlin/UByte", false));
        UBYTE = vVar;
        v vVar2 = new v("USHORT", 1, b.a.a("kotlin/UShort", false));
        USHORT = vVar2;
        v vVar3 = new v("UINT", 2, b.a.a("kotlin/UInt", false));
        UINT = vVar3;
        v vVar4 = new v("ULONG", 3, b.a.a("kotlin/ULong", false));
        ULONG = vVar4;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4};
        $VALUES = vVarArr;
        $ENTRIES = Xc.b.a(vVarArr);
    }

    private v(String str, int i11, Sd.b bVar) {
        this.classId = bVar;
        Sd.f h11 = bVar.h();
        this.typeName = h11;
        Sd.c f7 = bVar.f();
        Sd.f f11 = Sd.f.f(h11.b() + "Array");
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        this.arrayClassId = new Sd.b(f7, f11);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    @NotNull
    public final Sd.b a() {
        return this.arrayClassId;
    }

    @NotNull
    public final Sd.b b() {
        return this.classId;
    }

    @NotNull
    public final Sd.f d() {
        return this.typeName;
    }
}
