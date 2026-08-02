package we0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y DARK;
    public static final y LIGHT;

    static {
        y yVar = new y("LIGHT", 0);
        LIGHT = yVar;
        y yVar2 = new y("DARK", 1);
        DARK = yVar2;
        y[] yVarArr = {yVar, yVar2};
        $VALUES = yVarArr;
        $ENTRIES = Xc.b.a(yVarArr);
    }

    private y() {
        throw null;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
