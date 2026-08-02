package ru.ozon.android.messenger.blocks.emptystate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class j {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CHAT_DETAILS;
    public static final j CHAT_LIST;

    static {
        j jVar = new j("CHAT_DETAILS", 0);
        CHAT_DETAILS = jVar;
        j jVar2 = new j("CHAT_LIST", 1);
        CHAT_LIST = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = Xc.b.a(jVarArr);
    }

    private j() {
        throw null;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
