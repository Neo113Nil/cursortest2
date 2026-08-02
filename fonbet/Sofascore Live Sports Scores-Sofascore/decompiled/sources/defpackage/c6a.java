package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c6a {
    public static final c6a a;
    public static final c6a b;
    public static final c6a c;
    public static final c6a d;
    public static final c6a e;
    public static final c6a f;
    public static final /* synthetic */ c6a[] g;

    static {
        c6a c6aVar = new c6a("Unknown", 0);
        a = c6aVar;
        c6a c6aVar2 = new c6a("Analysis", 1);
        b = c6aVar2;
        c6a c6aVar3 = new c6a("AnrReport", 2);
        c = c6aVar3;
        c6a c6aVar4 = new c6a("CrashReport", 3);
        d = c6aVar4;
        c6a c6aVar5 = new c6a("CrashShield", 4);
        e = c6aVar5;
        c6a c6aVar6 = new c6a("ThreadCheck", 5);
        f = c6aVar6;
        g = new c6a[]{c6aVar, c6aVar2, c6aVar3, c6aVar4, c6aVar5, c6aVar6};
    }

    public static c6a valueOf(String str) {
        return (c6a) Enum.valueOf(c6a.class, str);
    }

    public static c6a[] values() {
        return (c6a[]) g.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
    }
}
