package ru.ozon.android.messenger.framework.composer.action;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a REMOVE_FAST_ANSWER_TEMPLATE;

    @NotNull
    private final String value = "removeFastAnswerTemplate";

    static {
        a aVar = new a();
        REMOVE_FAST_ANSWER_TEMPLATE = aVar;
        a[] aVarArr = {aVar};
        $VALUES = aVarArr;
        $ENTRIES = Xc.b.a(aVarArr);
    }

    private a() {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.value;
    }
}
