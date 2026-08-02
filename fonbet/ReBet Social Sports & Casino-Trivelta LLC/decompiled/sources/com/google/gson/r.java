package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class r {
    private static final /* synthetic */ r[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final r f38331a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f38332b;

    public enum a extends r {
        public a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f38331a = aVar;
        r rVar = new r("STRING", 1) { // from class: com.google.gson.r.b
            {
                a aVar2 = null;
            }
        };
        f38332b = rVar;
        $VALUES = new r[]{aVar, rVar};
    }

    public r(String str, int i10) {
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public /* synthetic */ r(String str, int i10, a aVar) {
        this(str, i10);
    }
}
