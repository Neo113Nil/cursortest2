package mg;

import ig.EnumC7074c;

/* loaded from: classes10.dex */
public final class g {

    private static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        private final int f74850a;

        /* renamed from: b, reason: collision with root package name */
        private final int f74851b;

        a(int i11, EnumC7074c enumC7074c) {
            lg.c.e(enumC7074c, "dayOfWeek");
            this.f74850a = i11;
            this.f74851b = enumC7074c.a();
        }

        @Override // mg.f
        public final d R(d dVar) {
            int Q11 = dVar.Q(EnumC8145a.DAY_OF_WEEK);
            int i11 = this.f74851b;
            int i12 = this.f74850a;
            if (i12 < 2 && Q11 == i11) {
                return dVar;
            }
            if ((i12 & 1) == 0) {
                return dVar.W0(Q11 - i11 >= 0 ? 7 - r0 : -r0, b.DAYS);
            }
            return dVar.s(i11 - Q11 >= 0 ? 7 - r2 : -r2, b.DAYS);
        }
    }

    public static f a(EnumC7074c enumC7074c) {
        return new a(0, enumC7074c);
    }

    public static f b(EnumC7074c enumC7074c) {
        return new a(1, enumC7074c);
    }
}
