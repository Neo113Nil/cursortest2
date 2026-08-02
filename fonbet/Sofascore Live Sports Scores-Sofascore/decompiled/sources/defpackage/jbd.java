package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jbd {
    public static final jbd a;
    public static final jbd b;
    public static final jbd c;
    public static final jbd d;
    public static final jbd e;
    public static final jbd f;
    public static final /* synthetic */ jbd[] g;

    static {
        jbd jbdVar = new jbd("NOT_REQUIRED", 0);
        a = jbdVar;
        jbd jbdVar2 = new jbd("CONNECTED", 1);
        b = jbdVar2;
        jbd jbdVar3 = new jbd("UNMETERED", 2);
        c = jbdVar3;
        jbd jbdVar4 = new jbd("NOT_ROAMING", 3);
        d = jbdVar4;
        jbd jbdVar5 = new jbd("METERED", 4);
        e = jbdVar5;
        jbd jbdVar6 = new jbd("TEMPORARILY_UNMETERED", 5);
        f = jbdVar6;
        g = new jbd[]{jbdVar, jbdVar2, jbdVar3, jbdVar4, jbdVar5, jbdVar6};
    }

    public static jbd valueOf(String str) {
        return (jbd) Enum.valueOf(jbd.class, str);
    }

    public static jbd[] values() {
        return (jbd[]) g.clone();
    }
}
