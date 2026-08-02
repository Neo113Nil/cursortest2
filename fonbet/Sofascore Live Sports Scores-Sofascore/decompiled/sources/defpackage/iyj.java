package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iyj {
    public static final iyj a;
    public static final iyj b;
    public static final iyj c;
    public static final /* synthetic */ iyj[] d;

    static {
        iyj iyjVar = new iyj("ContinueTraversal", 0);
        a = iyjVar;
        iyj iyjVar2 = new iyj("SkipSubtreeAndContinueTraversal", 1);
        b = iyjVar2;
        iyj iyjVar3 = new iyj("CancelTraversal", 2);
        c = iyjVar3;
        d = new iyj[]{iyjVar, iyjVar2, iyjVar3};
    }

    public static iyj valueOf(String str) {
        return (iyj) Enum.valueOf(iyj.class, str);
    }

    public static iyj[] values() {
        return (iyj[]) d.clone();
    }
}
