package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xkb {
    public static final xkb a;
    public static final xkb b;
    public static final xkb c;
    public static final /* synthetic */ xkb[] d;

    static {
        xkb xkbVar = new xkb("IsPlacedInLookahead", 0);
        a = xkbVar;
        xkb xkbVar2 = new xkb("IsPlacedInApproach", 1);
        b = xkbVar2;
        xkb xkbVar3 = new xkb("IsNotPlaced", 2);
        c = xkbVar3;
        d = new xkb[]{xkbVar, xkbVar2, xkbVar3};
    }

    public static xkb valueOf(String str) {
        return (xkb) Enum.valueOf(xkb.class, str);
    }

    public static xkb[] values() {
        return (xkb[]) d.clone();
    }
}
