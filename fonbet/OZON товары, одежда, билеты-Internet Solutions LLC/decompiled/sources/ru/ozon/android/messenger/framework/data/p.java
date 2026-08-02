package ru.ozon.android.messenger.framework.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class p {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p HTTP_PROXY;
    public static final p LOCAL_MOCKS;
    public static final p ORIGINAL;

    static {
        p pVar = new p("ORIGINAL", 0);
        ORIGINAL = pVar;
        p pVar2 = new p("LOCAL_MOCKS", 1);
        LOCAL_MOCKS = pVar2;
        p pVar3 = new p("HTTP_PROXY", 2);
        HTTP_PROXY = pVar3;
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
