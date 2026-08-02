package n2;

import m2.d;
import m2.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f76343a;

    /* renamed from: b, reason: collision with root package name */
    m2.e f76344b;

    /* renamed from: c, reason: collision with root package name */
    m f76345c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f76346d;

    /* renamed from: e, reason: collision with root package name */
    g f76347e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f76348f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f76349g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f76350h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f76351i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f76352j = b.NONE;

    /* loaded from: classes8.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f76353a;

        static {
            int[] iArr = new int[d.a.values().length];
            f76353a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76353a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76353a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f76353a[d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f76353a[d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
    static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CENTER;
        public static final b END;
        public static final b NONE;
        public static final b START;

        static {
            b bVar = new b("NONE", 0);
            NONE = bVar;
            b bVar2 = new b("START", 1);
            START = bVar2;
            b bVar3 = new b("END", 2);
            END = bVar3;
            b bVar4 = new b("CENTER", 3);
            CENTER = bVar4;
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

    public p(m2.e eVar) {
        this.f76344b = eVar;
    }

    protected static void b(f fVar, f fVar2, int i11) {
        fVar.f76327l.add(fVar2);
        fVar.f76321f = i11;
        fVar2.f76326k.add(fVar);
    }

    protected static f h(m2.d dVar) {
        m2.d dVar2 = dVar.f74090f;
        if (dVar2 == null) {
            return null;
        }
        int i11 = a.f76353a[dVar2.f74089e.ordinal()];
        m2.e eVar = dVar2.f74088d;
        if (i11 == 1) {
            return eVar.f74126d.f76350h;
        }
        if (i11 == 2) {
            return eVar.f74126d.f76351i;
        }
        if (i11 == 3) {
            return eVar.f74128e.f76350h;
        }
        if (i11 == 4) {
            return eVar.f74128e.f76334k;
        }
        if (i11 != 5) {
            return null;
        }
        return eVar.f74128e.f76351i;
    }

    protected static f i(m2.d dVar, int i11) {
        m2.d dVar2 = dVar.f74090f;
        if (dVar2 == null) {
            return null;
        }
        m2.e eVar = dVar2.f74088d;
        p pVar = i11 == 0 ? eVar.f74126d : eVar.f74128e;
        int i12 = a.f76353a[dVar2.f74089e.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f76351i;
        }
        return pVar.f76350h;
    }

    @Override // n2.d
    public void a(d dVar) {
    }

    protected final void c(f fVar, f fVar2, int i11, g gVar) {
        fVar.f76327l.add(fVar2);
        fVar.f76327l.add(this.f76347e);
        fVar.f76323h = i11;
        fVar.f76324i = gVar;
        fVar2.f76326k.add(fVar);
        gVar.f76326k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i11, int i12) {
        if (i12 == 0) {
            m2.e eVar = this.f76344b;
            int i13 = eVar.f74163w;
            int max = Math.max(eVar.f74162v, i11);
            if (i13 > 0) {
                max = Math.min(i13, i11);
            }
            if (max != i11) {
                return max;
            }
        } else {
            m2.e eVar2 = this.f76344b;
            int i14 = eVar2.f74166z;
            int max2 = Math.max(eVar2.f74165y, i11);
            if (i14 > 0) {
                max2 = Math.min(i14, i11);
            }
            if (max2 != i11) {
                return max2;
            }
        }
        return i11;
    }

    public long j() {
        if (this.f76347e.f76325j) {
            return r0.f76322g;
        }
        return 0L;
    }

    public final boolean k() {
        return this.f76349g;
    }

    abstract boolean l();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.f76343a == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void m(m2.d dVar, m2.d dVar2, int i11) {
        f h11 = h(dVar);
        f h12 = h(dVar2);
        if (h11.f76325j && h12.f76325j) {
            int f7 = dVar.f() + h11.f76322g;
            int f11 = h12.f76322g - dVar2.f();
            int i12 = f11 - f7;
            g gVar = this.f76347e;
            if (!gVar.f76325j) {
                e.b bVar = this.f76346d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2) {
                    int i13 = this.f76343a;
                    if (i13 == 0) {
                        gVar.d(g(i12, i11));
                    } else if (i13 == 1) {
                        gVar.d(Math.min(g(gVar.f76328m, i11), i12));
                    } else if (i13 == 2) {
                        m2.e eVar = this.f76344b;
                        m2.e eVar2 = eVar.f74116W;
                        if (eVar2 != null) {
                            if ((i11 == 0 ? eVar2.f74126d : eVar2.f74128e).f76347e.f76325j) {
                                gVar.d(g((int) ((r6.f76322g * (i11 == 0 ? eVar.f74164x : eVar.f74094A)) + 0.5f), i11));
                            }
                        }
                    } else if (i13 == 3) {
                        m2.e eVar3 = this.f76344b;
                        p pVar = eVar3.f74126d;
                        if (pVar.f76346d == bVar2 && pVar.f76343a == 3) {
                            n nVar = eVar3.f74128e;
                            if (nVar.f76346d == bVar2) {
                            }
                        }
                        if (i11 == 0) {
                            pVar = eVar3.f74128e;
                        }
                        if (pVar.f76347e.f76325j) {
                            float f12 = eVar3.f74119Z;
                            gVar.d(i11 == 1 ? (int) ((r6.f76322g / f12) + 0.5f) : (int) ((f12 * r6.f76322g) + 0.5f));
                        }
                    }
                }
            }
            if (gVar.f76325j) {
                int i14 = gVar.f76322g;
                f fVar = this.f76351i;
                f fVar2 = this.f76350h;
                if (i14 == i12) {
                    fVar2.d(f7);
                    fVar.d(f11);
                    return;
                }
                float w11 = i11 == 0 ? this.f76344b.w() : this.f76344b.K();
                if (h11 == h12) {
                    f7 = h11.f76322g;
                    f11 = h12.f76322g;
                    w11 = 0.5f;
                }
                fVar2.d((int) ((((f11 - f7) - gVar.f76322g) * w11) + f7 + 0.5f));
                fVar.d(fVar2.f76322g + gVar.f76322g);
            }
        }
    }
}
