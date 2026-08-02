package ru.ozon.android.messenger.blocks.chat.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CHAT_STATUS_ACTIVE;
    public static final f CHAT_STATUS_INACTIVE;

    static {
        f fVar = new f("CHAT_STATUS_ACTIVE", 0);
        CHAT_STATUS_ACTIVE = fVar;
        f fVar2 = new f("CHAT_STATUS_INACTIVE", 1);
        CHAT_STATUS_INACTIVE = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = Xc.b.a(fVarArr);
    }

    private f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
