package j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b Cancelled;
    public static final b None;
    public static final b RedirectCancelled;
    public static final b Redirected;

    static {
        b bVar = new b("None", 0);
        None = bVar;
        b bVar2 = new b("Cancelled", 1);
        Cancelled = bVar2;
        b bVar3 = new b("Redirected", 2);
        Redirected = bVar3;
        b bVar4 = new b("RedirectCancelled", 3);
        RedirectCancelled = bVar4;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    private b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
