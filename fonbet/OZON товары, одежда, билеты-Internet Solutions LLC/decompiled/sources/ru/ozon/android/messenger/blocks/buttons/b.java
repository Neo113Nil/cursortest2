package ru.ozon.android.messenger.blocks.buttons;

import com.squareup.moshi.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @i(name = "Flex")
    public static final b FLEX;

    @i(name = "Horizontal")
    public static final b HORIZONTAL;

    static {
        b bVar = new b("HORIZONTAL", 0);
        HORIZONTAL = bVar;
        b bVar2 = new b("FLEX", 1);
        FLEX = bVar2;
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
