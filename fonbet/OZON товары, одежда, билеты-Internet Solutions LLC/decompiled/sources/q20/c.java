package q20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c PROD_BUILDS_ALL_USERS;
    public static final c PROD_BUILDS_OZON_EMPLOYEE;
    public static final c PROD_BUILDS_OZON_QA;
    public static final c QA_BUILDS_OR_AUTOTEST;

    static {
        c cVar = new c("QA_BUILDS_OR_AUTOTEST", 0);
        QA_BUILDS_OR_AUTOTEST = cVar;
        c cVar2 = new c("PROD_BUILDS_OZON_QA", 1);
        PROD_BUILDS_OZON_QA = cVar2;
        c cVar3 = new c("PROD_BUILDS_OZON_EMPLOYEE", 2);
        PROD_BUILDS_OZON_EMPLOYEE = cVar3;
        c cVar4 = new c("PROD_BUILDS_ALL_USERS", 3);
        PROD_BUILDS_ALL_USERS = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = Xc.b.a(cVarArr);
    }

    private c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
