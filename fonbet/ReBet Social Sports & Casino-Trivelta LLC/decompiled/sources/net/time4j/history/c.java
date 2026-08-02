package net.time4j.history;

import li.AbstractC5468b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class c implements net.time4j.history.b {
    private static final /* synthetic */ c[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final c f58157a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f58158b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f58159c;

    public enum a extends c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // net.time4j.history.b
        public long a(h hVar) {
            return AbstractC5468b.i(c.e(hVar), hVar.d(), hVar.b());
        }

        @Override // net.time4j.history.b
        public int b(h hVar) {
            return AbstractC5468b.d(c.e(hVar), hVar.d());
        }

        @Override // net.time4j.history.b
        public h c(long j10) {
            long k10 = AbstractC5468b.k(j10);
            int h10 = AbstractC5468b.h(k10);
            int g10 = AbstractC5468b.g(k10);
            int f10 = AbstractC5468b.f(k10);
            j jVar = h10 <= 0 ? j.BC : j.AD;
            if (h10 <= 0) {
                h10 = 1 - h10;
            }
            return new h(jVar, h10, g10, f10);
        }

        @Override // net.time4j.history.c, net.time4j.history.b
        public boolean isValid(h hVar) {
            return AbstractC5468b.isValid(c.e(hVar), hVar.d(), hVar.b());
        }
    }

    static {
        a aVar = new a("GREGORIAN", 0);
        f58157a = aVar;
        c cVar = new c("JULIAN", 1) { // from class: net.time4j.history.c.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.b
            public long a(h hVar) {
                return m.g(c.e(hVar), hVar.d(), hVar.b());
            }

            @Override // net.time4j.history.b
            public int b(h hVar) {
                return m.b(c.e(hVar), hVar.d());
            }

            @Override // net.time4j.history.b
            public h c(long j10) {
                long h10 = m.h(j10);
                int f10 = m.f(h10);
                int e10 = m.e(h10);
                int d10 = m.d(h10);
                j jVar = f10 <= 0 ? j.BC : j.AD;
                if (f10 <= 0) {
                    f10 = 1 - f10;
                }
                return new h(jVar, f10, e10, d10);
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public boolean isValid(h hVar) {
                return m.isValid(c.e(hVar), hVar.d(), hVar.b());
            }
        };
        f58158b = cVar;
        c cVar2 = new c("SWEDISH", 2) { // from class: net.time4j.history.c.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.b
            public long a(h hVar) {
                int e10 = c.e(hVar);
                if (hVar.b() == 30 && hVar.d() == 2 && e10 == 1712) {
                    return -53576L;
                }
                return m.g(e10, hVar.d(), hVar.b()) - 1;
            }

            @Override // net.time4j.history.b
            public int b(h hVar) {
                int e10 = c.e(hVar);
                if (hVar.d() == 2 && e10 == 1712) {
                    return 30;
                }
                return m.b(e10, hVar.d());
            }

            @Override // net.time4j.history.b
            public h c(long j10) {
                return j10 == -53576 ? new h(j.AD, 1712, 2, 30) : c.f58158b.c(j10 + 1);
            }

            @Override // net.time4j.history.c, net.time4j.history.b
            public boolean isValid(h hVar) {
                int e10 = c.e(hVar);
                if (hVar.b() == 30 && hVar.d() == 2 && e10 == 1712) {
                    return true;
                }
                return m.isValid(e10, hVar.d(), hVar.b());
            }
        };
        f58159c = cVar2;
        $VALUES = new c[]{aVar, cVar, cVar2};
    }

    public c(String str, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(h hVar) {
        return hVar.c().a(hVar.e());
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // net.time4j.history.b
    public abstract /* synthetic */ boolean isValid(h hVar);

    public /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }
}
