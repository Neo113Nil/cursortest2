package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vjj {
    public static final vjj a;
    public static final vjj b;
    public static final vjj c;
    public static final /* synthetic */ vjj[] d;

    static {
        vjj vjjVar = new vjj("On", 0);
        a = vjjVar;
        vjj vjjVar2 = new vjj("Off", 1);
        b = vjjVar2;
        vjj vjjVar3 = new vjj("Indeterminate", 2);
        c = vjjVar3;
        d = new vjj[]{vjjVar, vjjVar2, vjjVar3};
    }

    public static vjj valueOf(String str) {
        return (vjj) Enum.valueOf(vjj.class, str);
    }

    public static vjj[] values() {
        return (vjj[]) d.clone();
    }
}
