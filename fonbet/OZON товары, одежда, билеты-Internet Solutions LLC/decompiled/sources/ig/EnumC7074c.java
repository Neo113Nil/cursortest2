package ig;

import Fm.C3051a;
import mg.EnumC8145a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ig.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC7074c implements mg.e, mg.f {
    private static final /* synthetic */ EnumC7074c[] $VALUES;
    private static final EnumC7074c[] ENUMS;
    public static final EnumC7074c FRIDAY;
    public static final mg.j<EnumC7074c> FROM;
    public static final EnumC7074c MONDAY;
    public static final EnumC7074c SATURDAY;
    public static final EnumC7074c SUNDAY;
    public static final EnumC7074c THURSDAY;
    public static final EnumC7074c TUESDAY;
    public static final EnumC7074c WEDNESDAY;

    /* renamed from: ig.c$a */
    final class a implements mg.j<EnumC7074c> {
        @Override // mg.j
        public final EnumC7074c a(mg.e eVar) {
            if (eVar instanceof EnumC7074c) {
                return (EnumC7074c) eVar;
            }
            try {
                return EnumC7074c.b(eVar.Q(EnumC8145a.DAY_OF_WEEK));
            } catch (C7073b e11) {
                throw new C7073b("Unable to obtain DayOfWeek from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e11);
            }
        }
    }

    static {
        EnumC7074c enumC7074c = new EnumC7074c("MONDAY", 0);
        MONDAY = enumC7074c;
        EnumC7074c enumC7074c2 = new EnumC7074c("TUESDAY", 1);
        TUESDAY = enumC7074c2;
        EnumC7074c enumC7074c3 = new EnumC7074c("WEDNESDAY", 2);
        WEDNESDAY = enumC7074c3;
        EnumC7074c enumC7074c4 = new EnumC7074c("THURSDAY", 3);
        THURSDAY = enumC7074c4;
        EnumC7074c enumC7074c5 = new EnumC7074c("FRIDAY", 4);
        FRIDAY = enumC7074c5;
        EnumC7074c enumC7074c6 = new EnumC7074c("SATURDAY", 5);
        SATURDAY = enumC7074c6;
        EnumC7074c enumC7074c7 = new EnumC7074c("SUNDAY", 6);
        SUNDAY = enumC7074c7;
        $VALUES = new EnumC7074c[]{enumC7074c, enumC7074c2, enumC7074c3, enumC7074c4, enumC7074c5, enumC7074c6, enumC7074c7};
        FROM = new a();
        ENUMS = values();
    }

    private EnumC7074c() {
        throw null;
    }

    public static EnumC7074c b(int i11) {
        if (i11 < 1 || i11 > 7) {
            throw new C7073b(Ej.b.a(i11, "Invalid value for DayOfWeek: "));
        }
        return ENUMS[i11 - 1];
    }

    public static EnumC7074c valueOf(String str) {
        return (EnumC7074c) Enum.valueOf(EnumC7074c.class, str);
    }

    public static EnumC7074c[] values() {
        return (EnumC7074c[]) $VALUES.clone();
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.DAY_OF_WEEK : hVar != null && hVar.a(this);
    }

    @Override // mg.e
    public final int Q(mg.h hVar) {
        return hVar == EnumC8145a.DAY_OF_WEEK ? a() : p(hVar).a(m(hVar), hVar);
    }

    @Override // mg.f
    public final mg.d R(mg.d dVar) {
        return dVar.c1(a(), EnumC8145a.DAY_OF_WEEK);
    }

    public final int a() {
        return ordinal() + 1;
    }

    @Override // mg.e
    public final <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.e()) {
            return (R) mg.b.DAYS;
        }
        if (jVar == mg.i.b() || jVar == mg.i.c() || jVar == mg.i.a() || jVar == mg.i.f() || jVar == mg.i.g() || jVar == mg.i.d()) {
            return null;
        }
        return jVar.a(this);
    }

    public final EnumC7074c e(long j11) {
        return ENUMS[((((int) (j11 % 7)) + 7) + ordinal()) % 7];
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (hVar == EnumC8145a.DAY_OF_WEEK) {
            return a();
        }
        if (hVar instanceof EnumC8145a) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        return hVar.f(this);
    }

    @Override // mg.e
    public final mg.m p(mg.h hVar) {
        if (hVar == EnumC8145a.DAY_OF_WEEK) {
            return hVar.d();
        }
        if (hVar instanceof EnumC8145a) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        return hVar.g(this);
    }
}
