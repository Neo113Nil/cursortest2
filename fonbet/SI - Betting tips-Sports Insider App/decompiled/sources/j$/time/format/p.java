package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p implements e {
    public static final p INSENSITIVE;
    public static final p LENIENT;
    public static final p SENSITIVE;
    public static final p STRICT;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ p[] f17433a;

    @Override // j$.time.format.e
    public final boolean i(y yVar, StringBuilder sb2) {
        return true;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f17433a.clone();
    }

    static {
        p pVar = new p("SENSITIVE", 0);
        SENSITIVE = pVar;
        p pVar2 = new p("INSENSITIVE", 1);
        INSENSITIVE = pVar2;
        p pVar3 = new p("STRICT", 2);
        STRICT = pVar3;
        p pVar4 = new p("LENIENT", 3);
        LENIENT = pVar4;
        f17433a = new p[]{pVar, pVar2, pVar3, pVar4};
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            vVar.f17459b = true;
            return i5;
        }
        if (ordinal == 1) {
            vVar.f17459b = false;
            return i5;
        }
        if (ordinal == 2) {
            vVar.f17460c = true;
            return i5;
        }
        if (ordinal != 3) {
            return i5;
        }
        vVar.f17460c = false;
        return i5;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
