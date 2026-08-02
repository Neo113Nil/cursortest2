package ve;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ve.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10311b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC10311b[] $VALUES;
    public static final EnumC10311b DAYS;
    public static final EnumC10311b HOURS;
    public static final EnumC10311b MICROSECONDS;
    public static final EnumC10311b MILLISECONDS;
    public static final EnumC10311b MINUTES;
    public static final EnumC10311b NANOSECONDS;
    public static final EnumC10311b SECONDS;

    @NotNull
    private final TimeUnit timeUnit;

    static {
        EnumC10311b enumC10311b = new EnumC10311b("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        NANOSECONDS = enumC10311b;
        EnumC10311b enumC10311b2 = new EnumC10311b("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        MICROSECONDS = enumC10311b2;
        EnumC10311b enumC10311b3 = new EnumC10311b("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        MILLISECONDS = enumC10311b3;
        EnumC10311b enumC10311b4 = new EnumC10311b("SECONDS", 3, TimeUnit.SECONDS);
        SECONDS = enumC10311b4;
        EnumC10311b enumC10311b5 = new EnumC10311b("MINUTES", 4, TimeUnit.MINUTES);
        MINUTES = enumC10311b5;
        EnumC10311b enumC10311b6 = new EnumC10311b("HOURS", 5, TimeUnit.HOURS);
        HOURS = enumC10311b6;
        EnumC10311b enumC10311b7 = new EnumC10311b("DAYS", 6, TimeUnit.DAYS);
        DAYS = enumC10311b7;
        EnumC10311b[] enumC10311bArr = {enumC10311b, enumC10311b2, enumC10311b3, enumC10311b4, enumC10311b5, enumC10311b6, enumC10311b7};
        $VALUES = enumC10311bArr;
        $ENTRIES = Xc.b.a(enumC10311bArr);
    }

    private EnumC10311b(String str, int i11, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static EnumC10311b valueOf(String str) {
        return (EnumC10311b) Enum.valueOf(EnumC10311b.class, str);
    }

    public static EnumC10311b[] values() {
        return (EnumC10311b[]) $VALUES.clone();
    }

    @NotNull
    public final TimeUnit a() {
        return this.timeUnit;
    }
}
