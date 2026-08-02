package bo.app;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public static final j9 f25614a;

    /* renamed from: b, reason: collision with root package name */
    public static final j9 f25615b;

    /* renamed from: c, reason: collision with root package name */
    public static final j9 f25616c;

    /* renamed from: d, reason: collision with root package name */
    public static final j9 f25617d;

    /* renamed from: e, reason: collision with root package name */
    public static final j9 f25618e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j9[] f25619f;

    static {
        j9 j9Var = new j9("UNKNOWN", 0, "");
        f25614a = j9Var;
        j9 j9Var2 = new j9("CONTENT_CARD_REFRESH", 1, "ccr");
        f25615b = j9Var2;
        j9 j9Var3 = new j9("TIME_TO_LIVE", 2, "ttl");
        f25616c = j9Var3;
        j9 j9Var4 = new j9("DISCONNECT_AND_RETRY", 3, "ddr");
        f25617d = j9Var4;
        j9 j9Var5 = new j9("FEATURE_FLAG_REFRESH", 4, "ffr");
        f25618e = j9Var5;
        j9[] j9VarArr = {j9Var, j9Var2, j9Var3, j9Var4, j9Var5};
        f25619f = j9VarArr;
        EnumEntriesKt.enumEntries(j9VarArr);
    }

    public j9(String str, int i10, String str2) {
    }

    public static j9 valueOf(String str) {
        return (j9) Enum.valueOf(j9.class, str);
    }

    public static j9[] values() {
        return (j9[]) f25619f.clone();
    }
}
