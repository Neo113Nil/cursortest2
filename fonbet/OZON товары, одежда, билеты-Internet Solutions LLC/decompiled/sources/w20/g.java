package w20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DEBUG_LOCALIZATION;
    public static final g DEPENDENCIES;
    public static final g MAIN;

    static {
        g gVar = new g("MAIN", 0);
        MAIN = gVar;
        g gVar2 = new g("DEPENDENCIES", 1);
        DEPENDENCIES = gVar2;
        g gVar3 = new g("DEBUG_LOCALIZATION", 2);
        DEBUG_LOCALIZATION = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        $VALUES = gVarArr;
        $ENTRIES = Xc.b.a(gVarArr);
    }

    private g() {
        throw null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
