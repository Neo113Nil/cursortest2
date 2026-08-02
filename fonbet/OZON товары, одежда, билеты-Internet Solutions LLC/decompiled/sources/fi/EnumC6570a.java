package fi;

import Xc.b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fi.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6570a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC6570a[] $VALUES;

    @NotNull
    private static final C1027a Companion;
    private static final int RADIUS_ROUNDED = 99;
    public static final EnumC6570a TAG_500;
    public static final EnumC6570a TAG_600;
    private final int cornerRadius;
    private final int cornerRadiusRounded;
    private final int height;
    private final int padding;

    /* renamed from: fi.a$a, reason: collision with other inner class name */
    private static final class C1027a {
    }

    static {
        EnumC6570a enumC6570a = new EnumC6570a("TAG_500", 0, 24, 8, 12, 4);
        TAG_500 = enumC6570a;
        EnumC6570a enumC6570a2 = new EnumC6570a("TAG_600", 1, 32, 10, 16, 8);
        TAG_600 = enumC6570a2;
        EnumC6570a[] enumC6570aArr = {enumC6570a, enumC6570a2};
        $VALUES = enumC6570aArr;
        $ENTRIES = b.a(enumC6570aArr);
        Companion = new C1027a();
    }

    private EnumC6570a(String str, int i11, int i12, int i13, int i14, int i15) {
        this.height = i12;
        this.cornerRadius = i13;
        this.cornerRadiusRounded = i14;
        this.padding = i15;
    }

    public static EnumC6570a valueOf(String str) {
        return (EnumC6570a) Enum.valueOf(EnumC6570a.class, str);
    }

    public static EnumC6570a[] values() {
        return (EnumC6570a[]) $VALUES.clone();
    }
}
