package sa0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ERROR;
    public static final d NEED_UPDATE;
    public static final d SUCCESS;

    static {
        d dVar = new d("SUCCESS", 0);
        SUCCESS = dVar;
        d dVar2 = new d("ERROR", 1);
        ERROR = dVar2;
        d dVar3 = new d("NEED_UPDATE", 2);
        NEED_UPDATE = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
    }

    private d() {
        throw null;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
