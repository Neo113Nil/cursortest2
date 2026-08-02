package ru.ozon.android.messenger.blocks.chat.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class n {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n ACTIVE;
    public static final n MUTED;

    static {
        n nVar = new n("ACTIVE", 0);
        ACTIVE = nVar;
        n nVar2 = new n("MUTED", 1);
        MUTED = nVar2;
        n[] nVarArr = {nVar, nVar2};
        $VALUES = nVarArr;
        $ENTRIES = Xc.b.a(nVarArr);
    }

    private n() {
        throw null;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
