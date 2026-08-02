package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rcg {
    public static final rcg a;
    public static final rcg b;
    public static final rcg c;
    public static final rcg d;
    public static final rcg e;
    public static final /* synthetic */ rcg[] f;

    static {
        rcg rcgVar = new rcg("NOT_STARTED", 0);
        a = rcgVar;
        rcg rcgVar2 = new rcg("RUNNING", 1);
        b = rcgVar2;
        rcg rcgVar3 = new rcg("PAUSED", 2);
        c = rcgVar3;
        rcg rcgVar4 = new rcg("ENDED", 3);
        d = rcgVar4;
        rcg rcgVar5 = new rcg("CANCELED", 4);
        e = rcgVar5;
        f = new rcg[]{rcgVar, rcgVar2, rcgVar3, rcgVar4, rcgVar5};
    }

    public static rcg valueOf(String str) {
        return (rcg) Enum.valueOf(rcg.class, str);
    }

    public static rcg[] values() {
        return (rcg[]) f.clone();
    }
}
