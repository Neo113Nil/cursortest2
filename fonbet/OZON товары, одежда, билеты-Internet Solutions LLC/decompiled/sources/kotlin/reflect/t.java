package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class t {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t INTERNAL;
    public static final t PRIVATE;
    public static final t PROTECTED;
    public static final t PUBLIC;

    static {
        t tVar = new t("PUBLIC", 0);
        PUBLIC = tVar;
        t tVar2 = new t("PROTECTED", 1);
        PROTECTED = tVar2;
        t tVar3 = new t("INTERNAL", 2);
        INTERNAL = tVar3;
        t tVar4 = new t("PRIVATE", 3);
        PRIVATE = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
        $VALUES = tVarArr;
        $ENTRIES = Xc.b.a(tVarArr);
    }

    private t() {
        throw null;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
