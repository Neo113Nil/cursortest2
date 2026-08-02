package n70;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n70.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8450b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC8450b[] $VALUES;
    public static final EnumC8450b CONFIRM_BUTTON;
    public static final EnumC8450b DATA_LABEL;
    public static final EnumC8450b TARIFFS_AND_LIMITS;
    public static final EnumC8450b TRANSFER_BUTTON;

    /* renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f76559id;

    static {
        EnumC8450b enumC8450b = new EnumC8450b("CONFIRM_BUTTON", 0, "confirmButton");
        CONFIRM_BUTTON = enumC8450b;
        EnumC8450b enumC8450b2 = new EnumC8450b("TRANSFER_BUTTON", 1, "transferButton");
        TRANSFER_BUTTON = enumC8450b2;
        EnumC8450b enumC8450b3 = new EnumC8450b("DATA_LABEL", 2, "dateLabel");
        DATA_LABEL = enumC8450b3;
        EnumC8450b enumC8450b4 = new EnumC8450b("TARIFFS_AND_LIMITS", 3, "tariffsAndLimits");
        TARIFFS_AND_LIMITS = enumC8450b4;
        EnumC8450b[] enumC8450bArr = {enumC8450b, enumC8450b2, enumC8450b3, enumC8450b4};
        $VALUES = enumC8450bArr;
        $ENTRIES = Xc.b.a(enumC8450bArr);
    }

    private EnumC8450b(String str, int i11, String str2) {
        this.f76559id = str2;
    }

    public static EnumC8450b valueOf(String str) {
        return (EnumC8450b) Enum.valueOf(EnumC8450b.class, str);
    }

    public static EnumC8450b[] values() {
        return (EnumC8450b[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.f76559id;
    }
}
