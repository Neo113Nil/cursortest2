package p40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g COMPLETE;
    public static final g NOT_INSTALL_MARKET;
    public static final g OZON_UPDATE_SDK;
    public static final g SKIP;
    public static final g UPDATE_ERROR;

    static {
        g gVar = new g("COMPLETE", 0);
        COMPLETE = gVar;
        g gVar2 = new g("SKIP", 1);
        SKIP = gVar2;
        g gVar3 = new g("OZON_UPDATE_SDK", 2);
        OZON_UPDATE_SDK = gVar3;
        g gVar4 = new g("NOT_INSTALL_MARKET", 3);
        NOT_INSTALL_MARKET = gVar4;
        g gVar5 = new g("UPDATE_ERROR", 4);
        UPDATE_ERROR = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
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
