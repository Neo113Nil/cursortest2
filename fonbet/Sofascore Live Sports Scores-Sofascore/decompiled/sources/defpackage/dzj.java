package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dzj {
    public static final dzj a;
    public static final dzj b;
    public static final /* synthetic */ dzj[] c;

    static {
        dzj dzjVar = new dzj("START", 0);
        a = dzjVar;
        dzj dzjVar2 = new dzj("END", 1);
        b = dzjVar2;
        c = new dzj[]{dzjVar, dzjVar2};
    }

    public static dzj valueOf(String str) {
        return (dzj) Enum.valueOf(dzj.class, str);
    }

    public static dzj[] values() {
        return (dzj[]) c.clone();
    }
}
