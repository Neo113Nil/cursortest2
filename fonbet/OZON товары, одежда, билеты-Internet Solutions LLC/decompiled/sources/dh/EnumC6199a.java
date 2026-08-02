package dh;

import Xc.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: dh.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6199a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC6199a[] $VALUES;
    public static final EnumC6199a ALIGNMENT_CENTER;
    public static final EnumC6199a ALIGNMENT_TOP;

    static {
        EnumC6199a enumC6199a = new EnumC6199a("ALIGNMENT_TOP", 0);
        ALIGNMENT_TOP = enumC6199a;
        EnumC6199a enumC6199a2 = new EnumC6199a("ALIGNMENT_CENTER", 1);
        ALIGNMENT_CENTER = enumC6199a2;
        EnumC6199a[] enumC6199aArr = {enumC6199a, enumC6199a2};
        $VALUES = enumC6199aArr;
        $ENTRIES = b.a(enumC6199aArr);
    }

    private EnumC6199a() {
        throw null;
    }

    public static EnumC6199a valueOf(String str) {
        return (EnumC6199a) Enum.valueOf(EnumC6199a.class, str);
    }

    public static EnumC6199a[] values() {
        return (EnumC6199a[]) $VALUES.clone();
    }
}
