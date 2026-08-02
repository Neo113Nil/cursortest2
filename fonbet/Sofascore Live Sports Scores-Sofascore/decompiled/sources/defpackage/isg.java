package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class isg {
    public static final isg a;
    public static final isg b;
    public static final isg c;
    public static final /* synthetic */ isg[] d;

    static {
        isg isgVar = new isg("NETWORK_UNMETERED", 0);
        a = isgVar;
        isg isgVar2 = new isg("DEVICE_IDLE", 1);
        b = isgVar2;
        isg isgVar3 = new isg("DEVICE_CHARGING", 2);
        c = isgVar3;
        d = new isg[]{isgVar, isgVar2, isgVar3};
    }

    public static isg valueOf(String str) {
        return (isg) Enum.valueOf(isg.class, str);
    }

    public static isg[] values() {
        return (isg[]) d.clone();
    }
}
