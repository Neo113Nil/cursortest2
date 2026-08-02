package yi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class g {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g TELEPHOTO;
    public static final g ULTRA_WIDE;
    public static final g WIDE;

    static {
        g gVar = new g("ULTRA_WIDE", 0);
        ULTRA_WIDE = gVar;
        g gVar2 = new g("WIDE", 1);
        WIDE = gVar2;
        g gVar3 = new g("TELEPHOTO", 2);
        TELEPHOTO = gVar3;
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
