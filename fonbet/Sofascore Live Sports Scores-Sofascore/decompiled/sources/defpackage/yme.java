package defpackage;

import com.ironsource.mediationsdk.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class yme {
    public static final yme a;
    public static final yme b;
    public static final yme c;
    public static final yme d;
    public static final yme e;
    public static final yme f;
    public static final yme g;
    public static final yme h;
    public static final /* synthetic */ yme[] i;

    static {
        yme ymeVar = new yme("UNKNOWN", 0);
        a = ymeVar;
        yme ymeVar2 = new yme("SMALL", 1);
        b = ymeVar2;
        yme ymeVar3 = new yme("MEDIUM", 2);
        c = ymeVar3;
        yme ymeVar4 = new yme(j.b, 3);
        d = ymeVar4;
        yme ymeVar5 = new yme("HD720", 4);
        e = ymeVar5;
        yme ymeVar6 = new yme("HD1080", 5);
        f = ymeVar6;
        yme ymeVar7 = new yme("HIGH_RES", 6);
        g = ymeVar7;
        yme ymeVar8 = new yme("DEFAULT", 7);
        h = ymeVar8;
        i = new yme[]{ymeVar, ymeVar2, ymeVar3, ymeVar4, ymeVar5, ymeVar6, ymeVar7, ymeVar8};
    }

    public static yme valueOf(String str) {
        return (yme) Enum.valueOf(yme.class, str);
    }

    public static yme[] values() {
        return (yme[]) i.clone();
    }
}
