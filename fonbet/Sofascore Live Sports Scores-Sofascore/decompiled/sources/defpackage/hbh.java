package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hbh {
    public static final hbh a;
    public static final hbh b;
    public static final hbh c;
    public static final hbh d;
    public static final hbh e;
    public static final hbh f;
    public static final /* synthetic */ hbh[] g;

    /* JADX INFO: Fake field, exist only in values array */
    hbh EF0;

    static {
        hbh hbhVar = new hbh("CornerExtraExtraLarge", 0);
        hbh hbhVar2 = new hbh("CornerExtraLarge", 1);
        hbh hbhVar3 = new hbh("CornerExtraLargeIncreased", 2);
        hbh hbhVar4 = new hbh("CornerExtraLargeTop", 3);
        a = hbhVar4;
        hbh hbhVar5 = new hbh("CornerExtraSmall", 4);
        b = hbhVar5;
        hbh hbhVar6 = new hbh("CornerExtraSmallTop", 5);
        c = hbhVar6;
        hbh hbhVar7 = new hbh("CornerFull", 6);
        d = hbhVar7;
        hbh hbhVar8 = new hbh("CornerLarge", 7);
        e = hbhVar8;
        hbh hbhVar9 = new hbh("CornerLargeEnd", 8);
        hbh hbhVar10 = new hbh("CornerLargeIncreased", 9);
        hbh hbhVar11 = new hbh("CornerLargeStart", 10);
        hbh hbhVar12 = new hbh("CornerLargeTop", 11);
        hbh hbhVar13 = new hbh("CornerMedium", 12);
        f = hbhVar13;
        g = new hbh[]{hbhVar, hbhVar2, hbhVar3, hbhVar4, hbhVar5, hbhVar6, hbhVar7, hbhVar8, hbhVar9, hbhVar10, hbhVar11, hbhVar12, hbhVar13, new hbh("CornerNone", 13), new hbh("CornerSmall", 14)};
    }

    public static hbh valueOf(String str) {
        return (hbh) Enum.valueOf(hbh.class, str);
    }

    public static hbh[] values() {
        return (hbh[]) g.clone();
    }
}
