package pf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class j {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j PROD_BUILDS_ALL_USERS;
    public static final j PROD_BUILDS_OZON_EMPLOYEE;
    public static final j PROD_BUILDS_OZON_QA;
    public static final j QA_BUILDS_OR_AUTOTEST;

    static {
        j jVar = new j("QA_BUILDS_OR_AUTOTEST", 0);
        QA_BUILDS_OR_AUTOTEST = jVar;
        j jVar2 = new j("PROD_BUILDS_OZON_QA", 1);
        PROD_BUILDS_OZON_QA = jVar2;
        j jVar3 = new j("PROD_BUILDS_OZON_EMPLOYEE", 2);
        PROD_BUILDS_OZON_EMPLOYEE = jVar3;
        j jVar4 = new j("PROD_BUILDS_ALL_USERS", 3);
        PROD_BUILDS_ALL_USERS = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        $VALUES = jVarArr;
        $ENTRIES = Xc.b.a(jVarArr);
    }

    private j() {
        throw null;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
