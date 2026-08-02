package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ddg {
    public static final dff a;
    public static final ddg b;
    public static final ddg c;
    public static final ddg d;
    public static final /* synthetic */ ddg[] e;

    static {
        ddg ddgVar = new ddg("PUBLISHER_CAN_NOT_RENDER", 0);
        b = ddgVar;
        ddg ddgVar2 = new ddg("PUBLISHER_COULD_RENDER", 1);
        c = ddgVar2;
        ddg ddgVar3 = new ddg("PUBLISHER_WILL_RENDER", 2);
        d = ddgVar3;
        e = new ddg[]{ddgVar, ddgVar2, ddgVar3};
        a = new dff(1);
    }

    public static ddg valueOf(String str) {
        return (ddg) Enum.valueOf(ddg.class, str);
    }

    public static ddg[] values() {
        return (ddg[]) e.clone();
    }
}
