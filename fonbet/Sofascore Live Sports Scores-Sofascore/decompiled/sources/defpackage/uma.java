package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uma {
    public static final uma a;
    public static final uma b;
    public static final uma c;
    public static final /* synthetic */ uma[] d;

    static {
        uma umaVar = new uma("InMeasureBlock", 0);
        a = umaVar;
        uma umaVar2 = new uma("InLayoutBlock", 1);
        b = umaVar2;
        uma umaVar3 = new uma("NotUsed", 2);
        c = umaVar3;
        d = new uma[]{umaVar, umaVar2, umaVar3};
    }

    public static uma valueOf(String str) {
        return (uma) Enum.valueOf(uma.class, str);
    }

    public static uma[] values() {
        return (uma[]) d.clone();
    }
}
