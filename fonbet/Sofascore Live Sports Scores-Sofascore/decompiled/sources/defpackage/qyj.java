package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qyj {
    public static final qyj a;
    public static final qyj b;
    public static final qyj c;
    public static final qyj d;
    public static final qyj e;
    public static final /* synthetic */ qyj[] f;

    static {
        qyj qyjVar = new qyj("HOME", 0);
        a = qyjVar;
        qyj qyjVar2 = new qyj("AWAY", 1);
        b = qyjVar2;
        qyj qyjVar3 = new qyj("DRAW", 2);
        c = qyjVar3;
        qyj qyjVar4 = new qyj("NO_CONTEST", 3);
        d = qyjVar4;
        qyj qyjVar5 = new qyj("UNKNOWN", 4);
        e = qyjVar5;
        f = new qyj[]{qyjVar, qyjVar2, qyjVar3, qyjVar4, qyjVar5};
    }

    public static qyj valueOf(String str) {
        return (qyj) Enum.valueOf(qyj.class, str);
    }

    public static qyj[] values() {
        return (qyj[]) f.clone();
    }
}
