package dj;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class k {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final k GOOGLE_PLAY;
    public static final k HUAWEI;
    public static final k OTHER;
    public static final k RU_STORE;

    public static final class a {
    }

    static {
        k kVar = new k("GOOGLE_PLAY", 0);
        GOOGLE_PLAY = kVar;
        k kVar2 = new k("RU_STORE", 1);
        RU_STORE = kVar2;
        k kVar3 = new k("HUAWEI", 2);
        HUAWEI = kVar3;
        k kVar4 = new k("OTHER", 3);
        OTHER = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        $VALUES = kVarArr;
        $ENTRIES = Xc.b.a(kVarArr);
        Companion = new a();
    }

    private k() {
        throw null;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
