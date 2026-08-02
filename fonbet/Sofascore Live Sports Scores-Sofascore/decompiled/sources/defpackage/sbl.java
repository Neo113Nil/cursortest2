package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sbl {
    public static final sbl a;
    public static final sbl b;
    public static final sbl c;
    public static final sbl d;
    public static final sbl e;
    public static final sbl f;
    public static final /* synthetic */ sbl[] g;

    static {
        sbl sblVar = new sbl("ENQUEUED", 0);
        a = sblVar;
        sbl sblVar2 = new sbl("RUNNING", 1);
        b = sblVar2;
        sbl sblVar3 = new sbl("SUCCEEDED", 2);
        c = sblVar3;
        sbl sblVar4 = new sbl("FAILED", 3);
        d = sblVar4;
        sbl sblVar5 = new sbl("BLOCKED", 4);
        e = sblVar5;
        sbl sblVar6 = new sbl("CANCELLED", 5);
        f = sblVar6;
        g = new sbl[]{sblVar, sblVar2, sblVar3, sblVar4, sblVar5, sblVar6};
    }

    public static sbl valueOf(String str) {
        return (sbl) Enum.valueOf(sbl.class, str);
    }

    public static sbl[] values() {
        return (sbl[]) g.clone();
    }

    public final boolean d() {
        return this == c || this == d || this == f;
    }
}
