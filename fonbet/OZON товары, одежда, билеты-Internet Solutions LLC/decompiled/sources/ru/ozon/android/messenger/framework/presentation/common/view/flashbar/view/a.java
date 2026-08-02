package ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EXIT;
    public static final a MANUAL;
    public static final a SWIPE;
    public static final a TIMEOUT;

    static {
        a aVar = new a("TIMEOUT", 0);
        TIMEOUT = aVar;
        a aVar2 = new a("MANUAL", 1);
        MANUAL = aVar2;
        a aVar3 = new a("SWIPE", 2);
        SWIPE = aVar3;
        a aVar4 = new a("EXIT", 3);
        EXIT = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
