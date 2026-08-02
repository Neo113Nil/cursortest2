package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i AUTOMATIC;
    public static final i HARDWARE;
    public static final i SOFTWARE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57350a;

        static {
            int[] iArr = new int[i.values().length];
            f57350a = iArr;
            try {
                iArr[i.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57350a[i.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57350a[i.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        i iVar = new i("AUTOMATIC", 0);
        AUTOMATIC = iVar;
        i iVar2 = new i("HARDWARE", 1);
        HARDWARE = iVar2;
        i iVar3 = new i("SOFTWARE", 2);
        SOFTWARE = iVar3;
        $VALUES = new i[]{iVar, iVar2, iVar3};
    }

    private i() {
        throw null;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
