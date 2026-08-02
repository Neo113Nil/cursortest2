package ru.ozon.android.messenger.blocks.chat.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @com.squareup.moshi.i(name = "ALIGNMENT_INVALID")
    public static final a ALIGNMENT_INVALID;

    @com.squareup.moshi.i(name = "CENTER")
    public static final a CENTER;

    @com.squareup.moshi.i(name = "TOP")
    public static final a TOP;

    static {
        a aVar = new a("ALIGNMENT_INVALID", 0);
        ALIGNMENT_INVALID = aVar;
        a aVar2 = new a("TOP", 1);
        TOP = aVar2;
        a aVar3 = new a("CENTER", 2);
        CENTER = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
