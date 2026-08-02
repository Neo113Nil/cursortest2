package bo.app;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n5 {

    /* renamed from: a, reason: collision with root package name */
    public static final n5 f25787a;

    /* renamed from: b, reason: collision with root package name */
    public static final n5 f25788b;

    /* renamed from: c, reason: collision with root package name */
    public static final n5 f25789c;

    /* renamed from: d, reason: collision with root package name */
    public static final n5 f25790d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n5[] f25791e;

    static {
        n5 n5Var = new n5("ADD_PENDING_BRAZE_EVENT", 0);
        f25787a = n5Var;
        n5 n5Var2 = new n5("ADD_BRAZE_EVENTS", 1);
        f25788b = n5Var2;
        n5 n5Var3 = new n5("FLUSH_PENDING_BRAZE_EVENTS", 2);
        f25789c = n5Var3;
        n5 n5Var4 = new n5("ADD_REQUEST", 3);
        f25790d = n5Var4;
        n5[] n5VarArr = {n5Var, n5Var2, n5Var3, n5Var4};
        f25791e = n5VarArr;
        EnumEntriesKt.enumEntries(n5VarArr);
    }

    public n5(String str, int i10) {
    }

    public static n5 valueOf(String str) {
        return (n5) Enum.valueOf(n5.class, str);
    }

    public static n5[] values() {
        return (n5[]) f25791e.clone();
    }
}
