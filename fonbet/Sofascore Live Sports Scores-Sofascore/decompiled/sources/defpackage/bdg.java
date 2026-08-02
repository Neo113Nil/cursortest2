package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class bdg {
    public static final ubf a;
    public static final bdg b;
    public static final bdg c;
    public static final /* synthetic */ bdg[] d;

    static {
        bdg bdgVar = new bdg("ADVERTISER_WILL_NOT_RENDER", 0);
        b = bdgVar;
        bdg bdgVar2 = new bdg("ADVERTISER_WILL_RENDER", 1);
        c = bdgVar2;
        d = new bdg[]{bdgVar, bdgVar2};
        a = new ubf(1);
    }

    public static bdg valueOf(String str) {
        return (bdg) Enum.valueOf(bdg.class, str);
    }

    public static bdg[] values() {
        return (bdg[]) d.clone();
    }
}
