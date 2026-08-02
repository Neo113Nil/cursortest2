package ru.ozon.android.messenger.framework.data.remote.models.items;

import com.squareup.moshi.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @i(name = "blockContainer")
    public static final b BLOCK_CONTAINER;

    @i(name = "message")
    public static final b MESSAGE;

    static {
        b bVar = new b("MESSAGE", 0);
        MESSAGE = bVar;
        b bVar2 = new b("BLOCK_CONTAINER", 1);
        BLOCK_CONTAINER = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = Xc.b.a(bVarArr);
    }

    private b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
