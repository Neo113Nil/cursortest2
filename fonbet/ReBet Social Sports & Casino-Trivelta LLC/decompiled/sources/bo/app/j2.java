package bo.app;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: b, reason: collision with root package name */
    public static final j2 f25585b;

    /* renamed from: c, reason: collision with root package name */
    public static final j2 f25586c;

    /* renamed from: d, reason: collision with root package name */
    public static final j2 f25587d;

    /* renamed from: e, reason: collision with root package name */
    public static final j2 f25588e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j2[] f25589f;

    /* renamed from: a, reason: collision with root package name */
    public final String f25590a;

    static {
        j2 j2Var = new j2("SESSION_START", 0, "ss");
        f25585b = j2Var;
        j2 j2Var2 = new j2("DUST_INITIATED", 1, "di");
        f25586c = j2Var2;
        j2 j2Var3 = new j2("CLIENT_INITIATED", 2, "ci");
        f25587d = j2Var3;
        j2 j2Var4 = new j2("UNKNOWN", 3, "unknown");
        f25588e = j2Var4;
        j2[] j2VarArr = {j2Var, j2Var2, j2Var3, j2Var4};
        f25589f = j2VarArr;
        EnumEntriesKt.enumEntries(j2VarArr);
    }

    public j2(String str, int i10, String str2) {
        this.f25590a = str2;
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) f25589f.clone();
    }
}
