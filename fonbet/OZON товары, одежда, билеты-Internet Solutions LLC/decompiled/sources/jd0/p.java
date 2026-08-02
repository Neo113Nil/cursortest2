package jd0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p Antibot;
    public static final p FintechRecovery;
    public static final p OzonIdAuth;

    static {
        p pVar = new p("Antibot", 0);
        Antibot = pVar;
        p pVar2 = new p("OzonIdAuth", 1);
        OzonIdAuth = pVar2;
        p pVar3 = new p("FintechRecovery", 2);
        FintechRecovery = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        $VALUES = pVarArr;
        $ENTRIES = Xc.b.a(pVarArr);
    }

    private p() {
        throw null;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
