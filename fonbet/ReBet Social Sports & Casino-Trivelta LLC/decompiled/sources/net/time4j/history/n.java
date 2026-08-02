package net.time4j.history;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class n {
    private static final /* synthetic */ n[] $VALUES;

    /* renamed from: a, reason: collision with root package name */
    public static final n f58224a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f58225b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f58226c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f58227d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f58228e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f58229f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f58230g;

    /* renamed from: h, reason: collision with root package name */
    public static final n f58231h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f58232i;

    public enum a extends n {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // net.time4j.history.n
        public int a(o oVar, net.time4j.history.h hVar) {
            return hVar.e();
        }

        @Override // net.time4j.history.n
        public net.time4j.history.h b(j jVar, int i10) {
            return net.time4j.history.h.g(jVar, i10, 1, 1);
        }
    }

    static {
        a aVar = new a("BEGIN_OF_JANUARY", 0);
        f58224a = aVar;
        n nVar = new n("BEGIN_OF_MARCH", 1) { // from class: net.time4j.history.n.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            public net.time4j.history.h b(j jVar, int i10) {
                return net.time4j.history.h.g(jVar, i10, 3, 1);
            }
        };
        f58225b = nVar;
        n nVar2 = new n("BEGIN_OF_SEPTEMBER", 2) { // from class: net.time4j.history.n.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            public int a(o oVar, net.time4j.history.h hVar) {
                j c10 = hVar.c();
                int e10 = hVar.e();
                int i10 = e10 + 1;
                return hVar.compareTo(oVar.d(c10, i10)) >= 0 ? i10 : e10;
            }

            @Override // net.time4j.history.n
            public net.time4j.history.h b(j jVar, int i10) {
                return net.time4j.history.h.g(jVar, i10 - 1, 9, 1);
            }
        };
        f58226c = nVar2;
        n nVar3 = new n("CHRISTMAS_STYLE", 3) { // from class: net.time4j.history.n.d
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            public int a(o oVar, net.time4j.history.h hVar) {
                int e10 = hVar.e();
                int i10 = e10 + 1;
                return hVar.compareTo(oVar.d(hVar.c(), i10)) >= 0 ? i10 : e10;
            }

            @Override // net.time4j.history.n
            public net.time4j.history.h b(j jVar, int i10) {
                return net.time4j.history.h.g(jVar, i10 - 1, 12, 25);
            }
        };
        f58227d = nVar3;
        n nVar4 = new n("EASTER_STYLE", 4) { // from class: net.time4j.history.n.e
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            public net.time4j.history.h b(j jVar, int i10) {
                int i11;
                int a10 = net.time4j.history.e.EASTERN.a(jVar.a(i10));
                int i12 = a10 - 1;
                if (i12 > 31) {
                    i12 = a10 - 32;
                    i11 = 4;
                } else {
                    i11 = 3;
                }
                return net.time4j.history.h.g(jVar, i10, i11, i12);
            }
        };
        f58228e = nVar4;
        n nVar5 = new n("GOOD_FRIDAY", 5) { // from class: net.time4j.history.n.f
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            public net.time4j.history.h b(j jVar, int i10) {
                int i11;
                int a10 = net.time4j.history.e.EASTERN.a(jVar.a(i10));
                int i12 = a10 - 2;
                if (i12 > 31) {
                    i12 = a10 - 33;
                    i11 = 4;
                } else {
                    i11 = 3;
                }
                return net.time4j.history.h.g(jVar, i10, i11, i12);
            }
        };
        f58229f = nVar5;
        n nVar6 = new n("MARIA_ANUNCIATA", 6) { // from class: net.time4j.history.n.g
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            public net.time4j.history.h b(j jVar, int i10) {
                return net.time4j.history.h.g(jVar, i10, 3, 25);
            }
        };
        f58230g = nVar6;
        n nVar7 = new n("CALCULUS_PISANUS", 7) { // from class: net.time4j.history.n.h
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            public int a(o oVar, net.time4j.history.h hVar) {
                int e10 = hVar.e();
                int i10 = e10 - 1;
                return hVar.compareTo(b(hVar.c(), i10)) < 0 ? e10 - 2 : i10;
            }

            @Override // net.time4j.history.n
            public net.time4j.history.h b(j jVar, int i10) {
                return n.f58230g.b(jVar, i10 + 1);
            }

            @Override // net.time4j.history.n
            public int c(boolean z10, o oVar, j jVar, int i10, int i11, int i12) {
                return n.f58230g.c(z10, oVar, jVar, i10 + 1, i11, i12);
            }
        };
        f58231h = nVar7;
        n nVar8 = new n("EPIPHANY", 8) { // from class: net.time4j.history.n.i
            {
                a aVar2 = null;
            }

            @Override // net.time4j.history.n
            public net.time4j.history.h b(j jVar, int i10) {
                return net.time4j.history.h.g(jVar, i10, 1, 6);
            }
        };
        f58232i = nVar8;
        $VALUES = new n[]{aVar, nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8};
    }

    public n(String str, int i10) {
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public int a(o oVar, net.time4j.history.h hVar) {
        int e10 = hVar.e();
        return hVar.compareTo(b(hVar.c(), e10)) < 0 ? e10 - 1 : e10;
    }

    public abstract net.time4j.history.h b(j jVar, int i10);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r7.a(r6) >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r9 > r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r5 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid date due to changing new year rule (year too short to cover month and day-of-month): " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r2.a(r6) >= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c(boolean z10, o oVar, j jVar, int i10, int i11, int i12) {
        int i13;
        if (i11 >= 5 && i11 <= 8) {
            return i10;
        }
        net.time4j.history.h b10 = b(jVar, i10);
        int i14 = i10 + 1;
        net.time4j.history.h d10 = oVar.d(jVar, i14);
        net.time4j.history.h g10 = net.time4j.history.h.g(jVar, i10, i11, i12);
        if (i11 <= 4) {
            net.time4j.history.h g11 = net.time4j.history.h.g(jVar, i14, i11, i12);
            i13 = g10.compareTo(b10) >= 0 ? i10 : i14;
        } else {
            i14 = i10 - 1;
            i13 = net.time4j.history.h.g(jVar, i14, i11, i12).compareTo(b10) >= 0 ? i14 : i10;
        }
    }

    public o d(int i10) {
        if (i10 <= 567) {
            throw new IllegalArgumentException("Defining New-Year-strategy is not supported before Council of Tours in AD 567.");
        }
        o oVar = new o(this, i10);
        n nVar = f58224a;
        return this != nVar ? new o(nVar, 567).b(oVar) : oVar;
    }

    public /* synthetic */ n(String str, int i10, a aVar) {
        this(str, i10);
    }
}
