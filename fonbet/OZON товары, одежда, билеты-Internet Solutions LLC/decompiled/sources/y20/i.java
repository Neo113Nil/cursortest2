package y20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i Dark;
    public static final i Light;

    static {
        i iVar = new i("Light", 0);
        Light = iVar;
        i iVar2 = new i("Dark", 1);
        Dark = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = Xc.b.a(iVarArr);
    }

    private i() {
        throw null;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
