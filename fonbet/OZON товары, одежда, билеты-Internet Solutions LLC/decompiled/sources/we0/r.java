package we0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r LEFT_BOTTOM;
    public static final r LEFT_TOP;
    public static final r RIGHT_BOTTOM;
    public static final r RIGHT_TOP;

    static {
        r rVar = new r("LEFT_TOP", 0);
        LEFT_TOP = rVar;
        r rVar2 = new r("RIGHT_TOP", 1);
        RIGHT_TOP = rVar2;
        r rVar3 = new r("LEFT_BOTTOM", 2);
        LEFT_BOTTOM = rVar3;
        r rVar4 = new r("RIGHT_BOTTOM", 3);
        RIGHT_BOTTOM = rVar4;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4};
        $VALUES = rVarArr;
        $ENTRIES = Xc.b.a(rVarArr);
    }

    private r() {
        throw null;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
