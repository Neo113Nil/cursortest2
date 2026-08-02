package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class RenderMode {
    private static final /* synthetic */ RenderMode[] $VALUES;
    public static final RenderMode AUTOMATIC;
    public static final RenderMode HARDWARE;
    public static final RenderMode SOFTWARE;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            a = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        RenderMode renderMode = new RenderMode("AUTOMATIC", 0);
        AUTOMATIC = renderMode;
        RenderMode renderMode2 = new RenderMode("HARDWARE", 1);
        HARDWARE = renderMode2;
        RenderMode renderMode3 = new RenderMode("SOFTWARE", 2);
        SOFTWARE = renderMode3;
        $VALUES = new RenderMode[]{renderMode, renderMode2, renderMode3};
    }

    public RenderMode() {
        throw null;
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) $VALUES.clone();
    }
}
