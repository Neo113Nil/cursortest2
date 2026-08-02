package jg;

import ig.C7073b;
import java.io.Serializable;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class u extends g implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final u f70068c = new u();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70069a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f70069a = iArr;
            try {
                iArr[EnumC8145a.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70069a[EnumC8145a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70069a[EnumC8145a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Object readResolve() {
        return f70068c;
    }

    @Override // jg.g
    public final AbstractC7423b a(mg.e eVar) {
        return eVar instanceof v ? (v) eVar : new v(ig.f.l1(eVar));
    }

    @Override // jg.g
    public final h f(int i11) {
        if (i11 == 0) {
            return w.BEFORE_BE;
        }
        if (i11 == 1) {
            return w.f70072BE;
        }
        throw new C7073b("Era is not valid for ThaiBuddhistEra");
    }

    @Override // jg.g
    public final String h() {
        return "buddhist";
    }

    @Override // jg.g
    public final String i() {
        return "ThaiBuddhist";
    }

    public final mg.m n(EnumC8145a enumC8145a) {
        int i11 = a.f70069a[enumC8145a.ordinal()];
        if (i11 == 1) {
            mg.m d11 = EnumC8145a.PROLEPTIC_MONTH.d();
            return mg.m.h(d11.e() + 6516, d11.d() + 6516);
        }
        if (i11 == 2) {
            mg.m d12 = EnumC8145a.YEAR.d();
            return mg.m.i(1L, 1L, (-(d12.e() + 543)) + 1, d12.d() + 543);
        }
        if (i11 != 3) {
            return enumC8145a.d();
        }
        mg.m d13 = EnumC8145a.YEAR.d();
        return mg.m.h(d13.e() + 543, d13.d() + 543);
    }
}
