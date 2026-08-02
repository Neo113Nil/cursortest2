package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class zme {
    public static final zme a;
    public static final zme b;
    public static final zme c;
    public static final zme d;
    public static final zme e;
    public static final zme f;
    public static final zme g;
    public static final zme h;
    public static final zme i;
    public static final /* synthetic */ zme[] j;

    static {
        zme zmeVar = new zme("UNKNOWN", 0);
        a = zmeVar;
        zme zmeVar2 = new zme("RATE_0_25", 1);
        b = zmeVar2;
        zme zmeVar3 = new zme("RATE_0_5", 2);
        c = zmeVar3;
        zme zmeVar4 = new zme("RATE_0_75", 3);
        d = zmeVar4;
        zme zmeVar5 = new zme("RATE_1", 4);
        e = zmeVar5;
        zme zmeVar6 = new zme("RATE_1_25", 5);
        f = zmeVar6;
        zme zmeVar7 = new zme("RATE_1_5", 6);
        g = zmeVar7;
        zme zmeVar8 = new zme("RATE_1_75", 7);
        h = zmeVar8;
        zme zmeVar9 = new zme("RATE_2", 8);
        i = zmeVar9;
        j = new zme[]{zmeVar, zmeVar2, zmeVar3, zmeVar4, zmeVar5, zmeVar6, zmeVar7, zmeVar8, zmeVar9};
    }

    public static zme valueOf(String str) {
        return (zme) Enum.valueOf(zme.class, str);
    }

    public static zme[] values() {
        return (zme[]) j.clone();
    }
}
