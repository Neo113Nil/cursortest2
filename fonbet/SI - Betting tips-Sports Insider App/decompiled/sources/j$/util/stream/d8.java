package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d8 {
    public static final d8 MAYBE_MORE;
    public static final d8 NO_MORE;
    public static final d8 UNLIMITED;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d8[] f17865a;

    static {
        d8 d8Var = new d8("NO_MORE", 0);
        NO_MORE = d8Var;
        d8 d8Var2 = new d8("MAYBE_MORE", 1);
        MAYBE_MORE = d8Var2;
        d8 d8Var3 = new d8("UNLIMITED", 2);
        UNLIMITED = d8Var3;
        f17865a = new d8[]{d8Var, d8Var2, d8Var3};
    }

    public static d8 valueOf(String str) {
        return (d8) Enum.valueOf(d8.class, str);
    }

    public static d8[] values() {
        return (d8[]) f17865a.clone();
    }
}
