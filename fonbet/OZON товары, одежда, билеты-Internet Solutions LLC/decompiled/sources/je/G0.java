package je;

import com.google.android.gms.stats.CodePackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class G0 {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ G0[] $VALUES;
    public static final G0 COMMON;
    public static final G0 SUPERTYPE;

    static {
        G0 g02 = new G0("SUPERTYPE", 0);
        SUPERTYPE = g02;
        G0 g03 = new G0(CodePackage.COMMON, 1);
        COMMON = g03;
        G0[] g0Arr = {g02, g03};
        $VALUES = g0Arr;
        $ENTRIES = Xc.b.a(g0Arr);
    }

    private G0() {
        throw null;
    }

    public static G0 valueOf(String str) {
        return (G0) Enum.valueOf(G0.class, str);
    }

    public static G0[] values() {
        return (G0[]) $VALUES.clone();
    }
}
