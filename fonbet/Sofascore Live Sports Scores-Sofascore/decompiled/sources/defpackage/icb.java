package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class icb {
    public static final icb a;
    public static final icb b;
    public static final icb c;
    public static final icb d;
    public static final /* synthetic */ icb[] e;

    static {
        icb icbVar = new icb("Top", 0);
        a = icbVar;
        icb icbVar2 = new icb("Middle", 1);
        b = icbVar2;
        icb icbVar3 = new icb("Bottom", 2);
        c = icbVar3;
        icb icbVar4 = new icb("Single", 3);
        d = icbVar4;
        e = new icb[]{icbVar, icbVar2, icbVar3, icbVar4};
    }

    public static icb valueOf(String str) {
        return (icb) Enum.valueOf(icb.class, str);
    }

    public static icb[] values() {
        return (icb[]) e.clone();
    }
}
