package ig;

import Fm.C3051a;
import mg.EnumC8145a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class i implements mg.e, mg.f {
    private static final /* synthetic */ i[] $VALUES;
    public static final i APRIL;
    public static final i AUGUST;
    public static final i DECEMBER;
    private static final i[] ENUMS;
    public static final i FEBRUARY;
    public static final mg.j<i> FROM;
    public static final i JANUARY;
    public static final i JULY;
    public static final i JUNE;
    public static final i MARCH;
    public static final i MAY;
    public static final i NOVEMBER;
    public static final i OCTOBER;
    public static final i SEPTEMBER;

    final class a implements mg.j<i> {
        @Override // mg.j
        public final i a(mg.e eVar) {
            if (eVar instanceof i) {
                return (i) eVar;
            }
            try {
                if (!jg.l.f70047c.equals(jg.g.g(eVar))) {
                    eVar = f.l1(eVar);
                }
                return i.g(eVar.Q(EnumC8145a.MONTH_OF_YEAR));
            } catch (C7073b e11) {
                throw new C7073b("Unable to obtain Month from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e11);
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66431a;

        static {
            int[] iArr = new int[i.values().length];
            f66431a = iArr;
            try {
                iArr[i.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66431a[i.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66431a[i.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66431a[i.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66431a[i.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66431a[i.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66431a[i.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66431a[i.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66431a[i.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66431a[i.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66431a[i.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66431a[i.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        i iVar = new i("JANUARY", 0);
        JANUARY = iVar;
        i iVar2 = new i("FEBRUARY", 1);
        FEBRUARY = iVar2;
        i iVar3 = new i("MARCH", 2);
        MARCH = iVar3;
        i iVar4 = new i("APRIL", 3);
        APRIL = iVar4;
        i iVar5 = new i("MAY", 4);
        MAY = iVar5;
        i iVar6 = new i("JUNE", 5);
        JUNE = iVar6;
        i iVar7 = new i("JULY", 6);
        JULY = iVar7;
        i iVar8 = new i("AUGUST", 7);
        AUGUST = iVar8;
        i iVar9 = new i("SEPTEMBER", 8);
        SEPTEMBER = iVar9;
        i iVar10 = new i("OCTOBER", 9);
        OCTOBER = iVar10;
        i iVar11 = new i("NOVEMBER", 10);
        NOVEMBER = iVar11;
        i iVar12 = new i("DECEMBER", 11);
        DECEMBER = iVar12;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12};
        FROM = new a();
        ENUMS = values();
    }

    private i() {
        throw null;
    }

    public static i g(int i11) {
        if (i11 < 1 || i11 > 12) {
            throw new C7073b(Ej.b.a(i11, "Invalid value for MonthOfYear: "));
        }
        return ENUMS[i11 - 1];
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.MONTH_OF_YEAR : hVar != null && hVar.a(this);
    }

    @Override // mg.e
    public final int Q(mg.h hVar) {
        return hVar == EnumC8145a.MONTH_OF_YEAR ? b() : p(hVar).a(m(hVar), hVar);
    }

    @Override // mg.f
    public final mg.d R(mg.d dVar) {
        if (!jg.g.g(dVar).equals(jg.l.f70047c)) {
            throw new C7073b("Adjustment only supported on ISO date-time");
        }
        return dVar.j1(b(), EnumC8145a.MONTH_OF_YEAR);
    }

    public final int a(boolean z11) {
        switch (b.f66431a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z11 ? 1 : 0) + 91;
            case 3:
                return (z11 ? 1 : 0) + 152;
            case 4:
                return (z11 ? 1 : 0) + 244;
            case 5:
                return (z11 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z11 ? 1 : 0) + 60;
            case 8:
                return (z11 ? 1 : 0) + 121;
            case 9:
                return (z11 ? 1 : 0) + 182;
            case 10:
                return (z11 ? 1 : 0) + 213;
            case 11:
                return (z11 ? 1 : 0) + 274;
            default:
                return (z11 ? 1 : 0) + 335;
        }
    }

    public final int b() {
        return ordinal() + 1;
    }

    @Override // mg.e
    public final <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.a()) {
            return (R) jg.l.f70047c;
        }
        if (jVar == mg.i.e()) {
            return (R) mg.b.MONTHS;
        }
        if (jVar == mg.i.b() || jVar == mg.i.c() || jVar == mg.i.f() || jVar == mg.i.g() || jVar == mg.i.d()) {
            return null;
        }
        return jVar.a(this);
    }

    public final int e(boolean z11) {
        int i11 = b.f66431a[ordinal()];
        return i11 != 1 ? (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31 : z11 ? 29 : 28;
    }

    public final int f() {
        int i11 = b.f66431a[ordinal()];
        if (i11 != 1) {
            return (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final i h() {
        return ENUMS[((((int) 1) + 12) + ordinal()) % 12];
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (hVar == EnumC8145a.MONTH_OF_YEAR) {
            return b();
        }
        if (hVar instanceof EnumC8145a) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        return hVar.f(this);
    }

    @Override // mg.e
    public final mg.m p(mg.h hVar) {
        if (hVar == EnumC8145a.MONTH_OF_YEAR) {
            return hVar.d();
        }
        if (hVar instanceof EnumC8145a) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        return hVar.g(this);
    }
}
