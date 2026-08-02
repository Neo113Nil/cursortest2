package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class paa {
    public static final paa a;
    public static final paa b;
    public static final paa c;
    public static final paa d;
    public static final /* synthetic */ paa[] e;

    static {
        paa paaVar = new paa("LookaheadMeasurement", 0);
        a = paaVar;
        paa paaVar2 = new paa("LookaheadPlacement", 1);
        b = paaVar2;
        paa paaVar3 = new paa("Measurement", 2);
        c = paaVar3;
        paa paaVar4 = new paa("Placement", 3);
        d = paaVar4;
        e = new paa[]{paaVar, paaVar2, paaVar3, paaVar4};
    }

    public static paa valueOf(String str) {
        return (paa) Enum.valueOf(paa.class, str);
    }

    public static paa[] values() {
        return (paa[]) e.clone();
    }
}
