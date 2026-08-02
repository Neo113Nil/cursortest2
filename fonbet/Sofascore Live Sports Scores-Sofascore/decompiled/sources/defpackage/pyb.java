package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pyb {
    public static final pyb a;
    public static final pyb b;
    public static final pyb c;
    public static final pyb d;
    public static final /* synthetic */ pyb[] e;

    static {
        pyb pybVar = new pyb("NONE", 0);
        a = pybVar;
        pyb pybVar2 = new pyb("START", 1);
        b = pybVar2;
        pyb pybVar3 = new pyb("END", 2);
        c = pybVar3;
        pyb pybVar4 = new pyb("BOTH", 3);
        d = pybVar4;
        e = new pyb[]{pybVar, pybVar2, pybVar3, pybVar4};
    }

    public static pyb valueOf(String str) {
        return (pyb) Enum.valueOf(pyb.class, str);
    }

    public static pyb[] values() {
        return (pyb[]) e.clone();
    }
}
