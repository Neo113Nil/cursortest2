package th0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CORRECT_MIGRATION_FROM_NEW_TO_NEW;
    public static final e CORRECT_MIGRATION_FROM_OLD_TO_NEW;
    public static final e CORRECT_NO_MIGRATION_NEW;
    public static final e CORRECT_NO_MIGRATION_OLD;
    public static final e INCORRECT;

    static {
        e eVar = new e("CORRECT_NO_MIGRATION_OLD", 0);
        CORRECT_NO_MIGRATION_OLD = eVar;
        e eVar2 = new e("CORRECT_NO_MIGRATION_NEW", 1);
        CORRECT_NO_MIGRATION_NEW = eVar2;
        e eVar3 = new e("CORRECT_MIGRATION_FROM_OLD_TO_NEW", 2);
        CORRECT_MIGRATION_FROM_OLD_TO_NEW = eVar3;
        e eVar4 = new e("CORRECT_MIGRATION_FROM_NEW_TO_NEW", 3);
        CORRECT_MIGRATION_FROM_NEW_TO_NEW = eVar4;
        e eVar5 = new e("INCORRECT", 4);
        INCORRECT = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = Xc.b.a(eVarArr);
    }

    private e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
