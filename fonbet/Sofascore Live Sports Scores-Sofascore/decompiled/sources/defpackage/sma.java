package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sma {
    public static final sma a;
    public static final sma b;
    public static final sma c;
    public static final sma d;
    public static final sma e;
    public static final /* synthetic */ sma[] f;

    static {
        sma smaVar = new sma("Measuring", 0);
        a = smaVar;
        sma smaVar2 = new sma("LookaheadMeasuring", 1);
        b = smaVar2;
        sma smaVar3 = new sma("LayingOut", 2);
        c = smaVar3;
        sma smaVar4 = new sma("LookaheadLayingOut", 3);
        d = smaVar4;
        sma smaVar5 = new sma("Idle", 4);
        e = smaVar5;
        f = new sma[]{smaVar, smaVar2, smaVar3, smaVar4, smaVar5};
    }

    public static sma valueOf(String str) {
        return (sma) Enum.valueOf(sma.class, str);
    }

    public static sma[] values() {
        return (sma[]) f.clone();
    }
}
