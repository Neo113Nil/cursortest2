package ru.ozon.android.messenger.blocks.chat.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AVATAR;
    public static final e BLOCK;
    public static final e INVALID;

    static {
        e eVar = new e("INVALID", 0);
        INVALID = eVar;
        e eVar2 = new e("BLOCK", 1);
        BLOCK = eVar2;
        e eVar3 = new e("AVATAR", 2);
        AVATAR = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = Xc.b.a(eVarArr);
    }

    private e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
