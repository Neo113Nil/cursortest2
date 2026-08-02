package l40;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b GOOGLE_PLAY;
    public static final b NONE;
    public static final b RUSTORE;

    static {
        b bVar = new b("RUSTORE", 0);
        RUSTORE = bVar;
        b bVar2 = new b("GOOGLE_PLAY", 1);
        GOOGLE_PLAY = bVar2;
        b bVar3 = new b("NONE", 2);
        NONE = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = Xc.b.a(bVarArr);
    }

    private b() {
        throw null;
    }

    @NotNull
    public static Xc.a<b> a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
