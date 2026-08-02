package jg;

import java.io.Serializable;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class q extends g implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final q f70062c = new q();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70063a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f70063a = iArr;
            try {
                iArr[EnumC8145a.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70063a[EnumC8145a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70063a[EnumC8145a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Object readResolve() {
        return f70062c;
    }

    @Override // jg.g
    public final AbstractC7423b a(mg.e eVar) {
        return eVar instanceof r ? (r) eVar : new r(ig.f.l1(eVar));
    }

    @Override // jg.g
    public final h f(int i11) {
        return s.a(i11);
    }

    @Override // jg.g
    public final String h() {
        return "roc";
    }

    @Override // jg.g
    public final String i() {
        return "Minguo";
    }

    public final mg.m n(EnumC8145a enumC8145a) {
        int i11 = a.f70063a[enumC8145a.ordinal()];
        if (i11 == 1) {
            mg.m d11 = EnumC8145a.PROLEPTIC_MONTH.d();
            return mg.m.h(d11.e() - 22932, d11.d() - 22932);
        }
        if (i11 == 2) {
            mg.m d12 = EnumC8145a.YEAR.d();
            return mg.m.i(1L, 1L, d12.d() - 1911, (-d12.e()) + 1912);
        }
        if (i11 != 3) {
            return enumC8145a.d();
        }
        mg.m d13 = EnumC8145a.YEAR.d();
        return mg.m.h(d13.e() - 1911, d13.d() - 1911);
    }
}
