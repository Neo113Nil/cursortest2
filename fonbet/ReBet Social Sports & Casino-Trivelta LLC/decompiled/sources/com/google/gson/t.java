package com.google.gson;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class t implements u {
    private static final /* synthetic */ t[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final t f38337a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f38338b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f38339c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f38340d;

    public enum a extends t {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a(Jb.a aVar) {
            return Double.valueOf(aVar.nextDouble());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f38337a = aVar;
        t tVar = new t("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.t.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u
            public Number a(Jb.a aVar2) {
                return new com.google.gson.internal.f(aVar2.M0());
            }
        };
        f38338b = tVar;
        t tVar2 = new t("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.t.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u
            public Number a(Jb.a aVar2) {
                String M02 = aVar2.M0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(M02));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(M02);
                        if (!valueOf.isInfinite()) {
                            if (valueOf.isNaN()) {
                            }
                            return valueOf;
                        }
                        if (!aVar2.w0()) {
                            throw new Jb.d("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.U());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e10) {
                    throw new l("Cannot parse " + M02 + "; at path " + aVar2.U(), e10);
                }
            }
        };
        f38339c = tVar2;
        t tVar3 = new t("BIG_DECIMAL", 3) { // from class: com.google.gson.t.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BigDecimal a(Jb.a aVar2) {
                String M02 = aVar2.M0();
                try {
                    return new BigDecimal(M02);
                } catch (NumberFormatException e10) {
                    throw new l("Cannot parse " + M02 + "; at path " + aVar2.U(), e10);
                }
            }
        };
        f38340d = tVar3;
        $VALUES = new t[]{aVar, tVar, tVar2, tVar3};
    }

    public t(String str, int i10) {
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    public /* synthetic */ t(String str, int i10, a aVar) {
        this(str, i10);
    }
}
