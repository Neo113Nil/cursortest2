package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final s f6375a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f6376b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w[] f6377c;

    static {
        s sVar = new s();
        f6375a = sVar;
        t tVar = new t();
        f6376b = tVar;
        f6377c = new w[]{sVar, tVar, new w() { // from class: com.google.gson.u
            public static Double b(String str, r9.a aVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (aVar.f22332o != 1) {
                        throw new r9.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.z(true));
                    }
                    return valueOf;
                } catch (NumberFormatException e7) {
                    StringBuilder p10 = d9.e.p("Cannot parse ", str, "; at path ");
                    p10.append(aVar.z(true));
                    throw new p(p10.toString(), e7);
                }
            }

            @Override // com.google.gson.w
            public final Number a(r9.a aVar) {
                String f02 = aVar.f0();
                if (f02.indexOf(46) >= 0) {
                    return b(f02, aVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(f02));
                } catch (NumberFormatException unused) {
                    return b(f02, aVar);
                }
            }
        }, new w() { // from class: com.google.gson.v
            @Override // com.google.gson.w
            public final Number a(r9.a aVar) {
                String f02 = aVar.f0();
                try {
                    return com.google.gson.internal.e.i(f02);
                } catch (NumberFormatException e7) {
                    StringBuilder p10 = d9.e.p("Cannot parse ", f02, "; at path ");
                    p10.append(aVar.z(true));
                    throw new p(p10.toString(), e7);
                }
            }
        }};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f6377c.clone();
    }

    public abstract Number a(r9.a aVar);
}
