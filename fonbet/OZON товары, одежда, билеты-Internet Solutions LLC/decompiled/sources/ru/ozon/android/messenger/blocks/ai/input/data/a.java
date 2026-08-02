package ru.ozon.android.messenger.blocks.ai.input.data;

import Xc.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AI_INPUT_MODE_DEFAULT;
    public static final a AI_INPUT_MODE_DEFAULT_EMPTY;
    public static final a AI_INPUT_MODE_PROCESSING;
    public static final a AI_INPUT_MODE_PROCESSING_EMPTY;
    public static final a AI_INPUT_MODE_UNSPECIFIED;

    static {
        a aVar = new a("AI_INPUT_MODE_DEFAULT", 0);
        AI_INPUT_MODE_DEFAULT = aVar;
        a aVar2 = new a("AI_INPUT_MODE_DEFAULT_EMPTY", 1);
        AI_INPUT_MODE_DEFAULT_EMPTY = aVar2;
        a aVar3 = new a("AI_INPUT_MODE_PROCESSING", 2);
        AI_INPUT_MODE_PROCESSING = aVar3;
        a aVar4 = new a("AI_INPUT_MODE_PROCESSING_EMPTY", 3);
        AI_INPUT_MODE_PROCESSING_EMPTY = aVar4;
        a aVar5 = new a("AI_INPUT_MODE_UNSPECIFIED", 4);
        AI_INPUT_MODE_UNSPECIFIED = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = b.a(aVarArr);
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
