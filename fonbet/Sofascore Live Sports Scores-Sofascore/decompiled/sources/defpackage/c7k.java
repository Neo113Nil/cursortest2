package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c7k {
    public static final c7k a;
    public static final c7k b;
    public static final c7k c;
    public static final c7k d;
    public static final c7k e;
    public static final /* synthetic */ c7k[] f;

    static {
        c7k c7kVar = new c7k("BodyLarge", 0);
        a = c7kVar;
        c7k c7kVar2 = new c7k("BodyMedium", 1);
        c7k c7kVar3 = new c7k("BodySmall", 2);
        b = c7kVar3;
        c7k c7kVar4 = new c7k("DisplayLarge", 3);
        c7k c7kVar5 = new c7k("DisplayMedium", 4);
        c7k c7kVar6 = new c7k("DisplaySmall", 5);
        c7k c7kVar7 = new c7k("HeadlineLarge", 6);
        c = c7kVar7;
        c7k c7kVar8 = new c7k("HeadlineMedium", 7);
        c7k c7kVar9 = new c7k("HeadlineSmall", 8);
        c7k c7kVar10 = new c7k("LabelLarge", 9);
        d = c7kVar10;
        c7k c7kVar11 = new c7k("LabelMedium", 10);
        c7k c7kVar12 = new c7k("LabelSmall", 11);
        c7k c7kVar13 = new c7k("TitleLarge", 12);
        e = c7kVar13;
        f = new c7k[]{c7kVar, c7kVar2, c7kVar3, c7kVar4, c7kVar5, c7kVar6, c7kVar7, c7kVar8, c7kVar9, c7kVar10, c7kVar11, c7kVar12, c7kVar13, new c7k("TitleMedium", 13), new c7k("TitleSmall", 14), new c7k("BodyLargeEmphasized", 15), new c7k("BodyMediumEmphasized", 16), new c7k("BodySmallEmphasized", 17), new c7k("DisplayLargeEmphasized", 18), new c7k("DisplayMediumEmphasized", 19), new c7k("DisplaySmallEmphasized", 20), new c7k("HeadlineLargeEmphasized", 21), new c7k("HeadlineMediumEmphasized", 22), new c7k("HeadlineSmallEmphasized", 23), new c7k("LabelLargeEmphasized", 24), new c7k("LabelMediumEmphasized", 25), new c7k("LabelSmallEmphasized", 26), new c7k("TitleLargeEmphasized", 27), new c7k("TitleMediumEmphasized", 28), new c7k("TitleSmallEmphasized", 29)};
    }

    public static c7k valueOf(String str) {
        return (c7k) Enum.valueOf(c7k.class, str);
    }

    public static c7k[] values() {
        return (c7k[]) f.clone();
    }
}
