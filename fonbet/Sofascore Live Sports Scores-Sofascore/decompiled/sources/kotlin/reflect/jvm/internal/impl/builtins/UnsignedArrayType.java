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
public final class UnsignedArrayType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ UnsignedArrayType[] $VALUES;
    public static final UnsignedArrayType UBYTEARRAY;
    public static final UnsignedArrayType UINTARRAY;
    public static final UnsignedArrayType ULONGARRAY;
    public static final UnsignedArrayType USHORTARRAY;

    @NotNull
    private final ClassId classId;

    @NotNull
    private final Name typeName;

    private static final /* synthetic */ UnsignedArrayType[] $values() {
        return new UnsignedArrayType[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        ClassId fromString = ClassId.fromString("kotlin/UByteArray");
        fromString.getClass();
        UBYTEARRAY = new UnsignedArrayType("UBYTEARRAY", 0, fromString);
        ClassId fromString2 = ClassId.fromString("kotlin/UShortArray");
        fromString2.getClass();
        USHORTARRAY = new UnsignedArrayType("USHORTARRAY", 1, fromString2);
        ClassId fromString3 = ClassId.fromString("kotlin/UIntArray");
        fromString3.getClass();
        UINTARRAY = new UnsignedArrayType("UINTARRAY", 2, fromString3);
        ClassId fromString4 = ClassId.fromString("kotlin/ULongArray");
        fromString4.getClass();
        ULONGARRAY = new UnsignedArrayType("ULONGARRAY", 3, fromString4);
        UnsignedArrayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private UnsignedArrayType(String str, int i, ClassId classId) {
        this.classId = classId;
        Name shortClassName = classId.getShortClassName();
        shortClassName.getClass();
        this.typeName = shortClassName;
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) $VALUES.clone();
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}
