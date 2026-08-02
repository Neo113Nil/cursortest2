package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kfg {
    public static final kfg a;
    public static final kfg b;
    public static final kfg c;
    public static final kfg d;
    public static final /* synthetic */ kfg[] e;

    static {
        kfg kfgVar = new kfg("NOT_STARTED", 0);
        a = kfgVar;
        kfg kfgVar2 = new kfg("PLAYING", 1);
        b = kfgVar2;
        kfg kfgVar3 = new kfg("PAUSED", 2);
        c = kfgVar3;
        kfg kfgVar4 = new kfg("COMPLETED", 3);
        d = kfgVar4;
        e = new kfg[]{kfgVar, kfgVar2, kfgVar3, kfgVar4};
    }

    public static kfg valueOf(String str) {
        return (kfg) Enum.valueOf(kfg.class, str);
    }

    public static kfg[] values() {
        return (kfg[]) e.clone();
    }
}
