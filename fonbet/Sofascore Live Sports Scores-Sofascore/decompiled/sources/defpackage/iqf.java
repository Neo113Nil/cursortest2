package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iqf {
    public static final iqf a;
    public static final iqf b;
    public static final iqf c;
    public static final iqf d;
    public static final iqf e;
    public static final iqf f;
    public static final /* synthetic */ iqf[] g;

    static {
        iqf iqfVar = new iqf("ShutDown", 0);
        a = iqfVar;
        iqf iqfVar2 = new iqf("ShuttingDown", 1);
        b = iqfVar2;
        iqf iqfVar3 = new iqf("Inactive", 2);
        c = iqfVar3;
        iqf iqfVar4 = new iqf("InactivePendingWork", 3);
        d = iqfVar4;
        iqf iqfVar5 = new iqf("Idle", 4);
        e = iqfVar5;
        iqf iqfVar6 = new iqf("PendingWork", 5);
        f = iqfVar6;
        g = new iqf[]{iqfVar, iqfVar2, iqfVar3, iqfVar4, iqfVar5, iqfVar6};
    }

    public static iqf valueOf(String str) {
        return (iqf) Enum.valueOf(iqf.class, str);
    }

    public static iqf[] values() {
        return (iqf[]) g.clone();
    }
}
