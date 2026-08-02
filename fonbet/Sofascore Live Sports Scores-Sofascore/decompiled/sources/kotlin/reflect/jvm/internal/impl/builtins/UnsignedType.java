package kotlin.reflect.jvm.internal.impl.builtins;

import defpackage.gz8;
import defpackage.jp5;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class UnsignedType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ UnsignedType[] $VALUES;
    public static final UnsignedType UBYTE;
    public static final UnsignedType UINT;
    public static final UnsignedType ULONG;
    public static final UnsignedType USHORT;

    @NotNull
    private final ClassId arrayClassId;

    @NotNull
    private final ClassId classId;

    @NotNull
    private final Name typeName;

    private static final /* synthetic */ UnsignedType[] $values() {
        return new UnsignedType[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        ClassId fromString = ClassId.fromString("kotlin/UByte");
        fromString.getClass();
        UBYTE = new UnsignedType("UBYTE", 0, fromString);
        ClassId fromString2 = ClassId.fromString("kotlin/UShort");
        fromString2.getClass();
        USHORT = new UnsignedType("USHORT", 1, fromString2);
        ClassId fromString3 = ClassId.fromString("kotlin/UInt");
        fromString3.getClass();
        UINT = new UnsignedType("UINT", 2, fromString3);
        ClassId fromString4 = ClassId.fromString("kotlin/ULong");
        fromString4.getClass();
        ULONG = new UnsignedType("ULONG", 3, fromString4);
        UnsignedType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private UnsignedType(String str, int i, ClassId classId) {
        this.classId = classId;
        Name shortClassName = classId.getShortClassName();
        shortClassName.getClass();
        this.typeName = shortClassName;
        this.arrayClassId = new ClassId(classId.getPackageFqName(), Name.identifier(shortClassName.asString() + "Array"));
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) $VALUES.clone();
    }

    @NotNull
    public final ClassId getArrayClassId() {
        return this.arrayClassId;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.classId;
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}
