package ru.ozon.android.messenger.blocks.emptystate.v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a HORIZONTAL;
    public static final a VERTICAL;

    static {
        a aVar = new a("HORIZONTAL", 0);
        HORIZONTAL = aVar;
        a aVar2 = new a("VERTICAL", 1);
        VERTICAL = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = Xc.b.a(aVarArr);
    }

    private a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
