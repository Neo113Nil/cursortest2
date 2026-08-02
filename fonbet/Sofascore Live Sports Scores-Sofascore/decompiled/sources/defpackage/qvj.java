package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qvj {
    public static final qvj a;
    public static final qvj b;
    public static final qvj c;
    public static final qvj d;
    public static final qvj e;
    public static final qvj f;
    public static final qvj g;
    public static final /* synthetic */ qvj[] h;

    /* JADX INFO: Fake field, exist only in values array */
    qvj EF0;

    static {
        qvj qvjVar = new qvj("UNKNOWN", 0);
        qvj qvjVar2 = new qvj("LOAN", 1);
        a = qvjVar2;
        qvj qvjVar3 = new qvj("END_OF_LOAN", 2);
        b = qvjVar3;
        qvj qvjVar4 = new qvj("TRANSFER", 3);
        c = qvjVar4;
        qvj qvjVar5 = new qvj("END_OF_CAREER", 4);
        d = qvjVar5;
        qvj qvjVar6 = new qvj("DRAFT", 5);
        e = qvjVar6;
        qvj qvjVar7 = new qvj("RELEASED", 6);
        f = qvjVar7;
        qvj qvjVar8 = new qvj("SIGNED", 7);
        g = qvjVar8;
        h = new qvj[]{qvjVar, qvjVar2, qvjVar3, qvjVar4, qvjVar5, qvjVar6, qvjVar7, qvjVar8, new qvj("WAIVED", 8), new qvj("CLAIMED", 9), new qvj("TRADED", 10)};
    }

    public static qvj valueOf(String str) {
        return (qvj) Enum.valueOf(qvj.class, str);
    }

    public static qvj[] values() {
        return (qvj[]) h.clone();
    }
}
