package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class svi {
    public static final svi a;
    public static final svi b;
    public static final svi c;
    public static final svi d;
    public static final /* synthetic */ svi[] e;

    static {
        svi sviVar = new svi("Live", 0);
        a = sviVar;
        svi sviVar2 = new svi("Win", 1);
        b = sviVar2;
        svi sviVar3 = new svi("Draw", 2);
        c = sviVar3;
        svi sviVar4 = new svi("Loss", 3);
        d = sviVar4;
        e = new svi[]{sviVar, sviVar2, sviVar3, sviVar4};
    }

    public static svi valueOf(String str) {
        return (svi) Enum.valueOf(svi.class, str);
    }

    public static svi[] values() {
        return (svi[]) e.clone();
    }
}
