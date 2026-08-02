package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ema {
    public static final ema a;
    public static final ema b;
    public static final /* synthetic */ ema[] c;

    static {
        ema emaVar = new ema("Ltr", 0);
        a = emaVar;
        ema emaVar2 = new ema("Rtl", 1);
        b = emaVar2;
        c = new ema[]{emaVar, emaVar2};
    }

    public static ema valueOf(String str) {
        return (ema) Enum.valueOf(ema.class, str);
    }

    public static ema[] values() {
        return (ema[]) c.clone();
    }
}
