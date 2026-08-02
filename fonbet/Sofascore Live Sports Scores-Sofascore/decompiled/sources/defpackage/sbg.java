package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sbg {
    public static final sbg a;
    public static final sbg b;
    public static final sbg c;
    public static final sbg d;
    public static final /* synthetic */ sbg[] e;

    static {
        sbg sbgVar = new sbg("NOT_AVAILABLE", 0);
        a = sbgVar;
        sbg sbgVar2 = new sbg("LOADING", 1);
        b = sbgVar2;
        sbg sbgVar3 = new sbg("READY", 2);
        c = sbgVar3;
        sbg sbgVar4 = new sbg("SHOWING", 3);
        d = sbgVar4;
        e = new sbg[]{sbgVar, sbgVar2, sbgVar3, sbgVar4};
    }

    public static sbg valueOf(String str) {
        return (sbg) Enum.valueOf(sbg.class, str);
    }

    public static sbg[] values() {
        return (sbg[]) e.clone();
    }
}
