package pf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pf0.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC8923f {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC8923f[] $VALUES;
    public static final EnumC8923f AppInterceptor;
    public static final EnumC8923f NetworkInterceptor;
    public static final EnumC8923f OzonIdAppInterceptor;
    public static final EnumC8923f OzonIdNetworkInterceptor;
    public static final EnumC8923f PerformanceAppInterceptor;
    public static final EnumC8923f PerformanceNetworkInterceptor;

    static {
        EnumC8923f enumC8923f = new EnumC8923f("PerformanceAppInterceptor", 0);
        PerformanceAppInterceptor = enumC8923f;
        EnumC8923f enumC8923f2 = new EnumC8923f("AppInterceptor", 1);
        AppInterceptor = enumC8923f2;
        EnumC8923f enumC8923f3 = new EnumC8923f("OzonIdAppInterceptor", 2);
        OzonIdAppInterceptor = enumC8923f3;
        EnumC8923f enumC8923f4 = new EnumC8923f("NetworkInterceptor", 3);
        NetworkInterceptor = enumC8923f4;
        EnumC8923f enumC8923f5 = new EnumC8923f("OzonIdNetworkInterceptor", 4);
        OzonIdNetworkInterceptor = enumC8923f5;
        EnumC8923f enumC8923f6 = new EnumC8923f("PerformanceNetworkInterceptor", 5);
        PerformanceNetworkInterceptor = enumC8923f6;
        EnumC8923f[] enumC8923fArr = {enumC8923f, enumC8923f2, enumC8923f3, enumC8923f4, enumC8923f5, enumC8923f6};
        $VALUES = enumC8923fArr;
        $ENTRIES = Xc.b.a(enumC8923fArr);
    }

    private EnumC8923f() {
        throw null;
    }

    public static EnumC8923f valueOf(String str) {
        return (EnumC8923f) Enum.valueOf(EnumC8923f.class, str);
    }

    public static EnumC8923f[] values() {
        return (EnumC8923f[]) $VALUES.clone();
    }
}
