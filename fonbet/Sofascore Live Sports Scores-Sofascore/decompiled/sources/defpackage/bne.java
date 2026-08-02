package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class bne {
    public static final bne a;
    public static final bne b;
    public static final bne c;
    public static final bne d;
    public static final bne e;
    public static final bne f;
    public static final bne g;
    public static final /* synthetic */ bne[] h;

    static {
        bne bneVar = new bne("UNKNOWN", 0);
        a = bneVar;
        bne bneVar2 = new bne("UNSTARTED", 1);
        b = bneVar2;
        bne bneVar3 = new bne("ENDED", 2);
        c = bneVar3;
        bne bneVar4 = new bne("PLAYING", 3);
        d = bneVar4;
        bne bneVar5 = new bne("PAUSED", 4);
        e = bneVar5;
        bne bneVar6 = new bne("BUFFERING", 5);
        f = bneVar6;
        bne bneVar7 = new bne("VIDEO_CUED", 6);
        g = bneVar7;
        h = new bne[]{bneVar, bneVar2, bneVar3, bneVar4, bneVar5, bneVar6, bneVar7};
    }

    public static bne valueOf(String str) {
        return (bne) Enum.valueOf(bne.class, str);
    }

    public static bne[] values() {
        return (bne[]) h.clone();
    }
}
