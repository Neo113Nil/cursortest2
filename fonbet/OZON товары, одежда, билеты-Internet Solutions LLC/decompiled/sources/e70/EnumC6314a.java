package e70;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6314a implements InterfaceC6316c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC6314a[] $VALUES;
    public static final EnumC6314a DISK_FULL;
    public static final EnumC6314a IO_ERROR;
    public static final EnumC6314a NOT_FOUND;
    public static final EnumC6314a UNKNOWN;

    static {
        EnumC6314a enumC6314a = new EnumC6314a("DISK_FULL", 0);
        DISK_FULL = enumC6314a;
        EnumC6314a enumC6314a2 = new EnumC6314a("NOT_FOUND", 1);
        NOT_FOUND = enumC6314a2;
        EnumC6314a enumC6314a3 = new EnumC6314a(FraudMonInfo.UNKNOWN, 2);
        UNKNOWN = enumC6314a3;
        EnumC6314a enumC6314a4 = new EnumC6314a("IO_ERROR", 3);
        IO_ERROR = enumC6314a4;
        EnumC6314a[] enumC6314aArr = {enumC6314a, enumC6314a2, enumC6314a3, enumC6314a4};
        $VALUES = enumC6314aArr;
        $ENTRIES = Xc.b.a(enumC6314aArr);
    }

    private EnumC6314a() {
        throw null;
    }

    public static EnumC6314a valueOf(String str) {
        return (EnumC6314a) Enum.valueOf(EnumC6314a.class, str);
    }

    public static EnumC6314a[] values() {
        return (EnumC6314a[]) $VALUES.clone();
    }
}
