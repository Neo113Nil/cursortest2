package ru.ozon.android.messenger.framework.data.local;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class r {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r IDLE;
    public static final r INITIALIZED;
    public static final r INITIALIZE_FAILED;
    public static final r INITIALIZING;

    static {
        r rVar = new r("IDLE", 0);
        IDLE = rVar;
        r rVar2 = new r("INITIALIZING", 1);
        INITIALIZING = rVar2;
        r rVar3 = new r("INITIALIZE_FAILED", 2);
        INITIALIZE_FAILED = rVar3;
        r rVar4 = new r("INITIALIZED", 3);
        INITIALIZED = rVar4;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4};
        $VALUES = rVarArr;
        $ENTRIES = Xc.b.a(rVarArr);
    }

    private r() {
        throw null;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
