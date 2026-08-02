package oi;

import li.AbstractC5469c;

/* renamed from: oi.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC5900A implements p {
    UTC(2441317),
    UNIX(2440587),
    MODIFIED_JULIAN_DATE(2400000),
    EXCEL(2415019),
    ANSI(2305812),
    RATA_DIE(1721424),
    JULIAN_DAY_NUMBER(-1),
    LILIAN_DAY_NUMBER(2299159);

    private final int offset;

    /* renamed from: oi.A$a */
    public static class a implements z {

        /* renamed from: a, reason: collision with root package name */
        public final EnumC5900A f61251a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC5915k f61252b;

        public a(EnumC5900A enumC5900A, InterfaceC5915k interfaceC5915k) {
            this.f61251a = enumC5900A;
            this.f61252b = interfaceC5915k;
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p b(q qVar) {
            return null;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public p d(q qVar) {
            return null;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long e(q qVar) {
            return Long.valueOf(this.f61251a.i(this.f61252b.a() + 730, EnumC5900A.UNIX));
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long i(q qVar) {
            return Long.valueOf(this.f61251a.i(this.f61252b.d() + 730, EnumC5900A.UNIX));
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long p(q qVar) {
            return Long.valueOf(this.f61251a.i(this.f61252b.c(qVar) + 730, EnumC5900A.UNIX));
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public q o(q qVar, Long l10, boolean z10) {
            if (l10 == null) {
                throw new IllegalArgumentException("Missing epoch day value.");
            }
            return (q) this.f61252b.b(AbstractC5469c.m(EnumC5900A.UNIX.i(l10.longValue(), this.f61251a), 730L));
        }

        @Override // oi.z
        public boolean isValid(q qVar, Long l10) {
            if (l10 == null) {
                return false;
            }
            try {
                long m10 = AbstractC5469c.m(EnumC5900A.UNIX.i(l10.longValue(), this.f61251a), 730L);
                if (m10 <= this.f61252b.a()) {
                    return m10 >= this.f61252b.d();
                }
                return false;
            } catch (ArithmeticException | IllegalArgumentException unused) {
                return false;
            }
        }
    }

    EnumC5900A(int i10) {
        this.offset = i10 - 2441317;
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // oi.p
    public char a() {
        return this == MODIFIED_JULIAN_DATE ? 'g' : (char) 0;
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(o oVar, o oVar2) {
        return ((Long) oVar.j(this)).compareTo((Long) oVar2.j(this));
    }

    public z d(InterfaceC5915k interfaceC5915k) {
        return new a(this, interfaceC5915k);
    }

    @Override // oi.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long c() {
        return Long.valueOf(365241779741L - this.offset);
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public boolean g() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return Long.class;
    }

    @Override // oi.p
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Long d0() {
        return Long.valueOf((-365243219892L) - this.offset);
    }

    public long i(long j10, EnumC5900A enumC5900A) {
        try {
            return AbstractC5469c.f(j10, enumC5900A.offset - this.offset);
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
