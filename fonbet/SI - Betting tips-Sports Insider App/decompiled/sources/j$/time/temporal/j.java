package j$.time.temporal;

import j$.time.format.d0;
import j$.time.format.e0;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class j implements p {
    public static final j JULIAN_DAY;
    public static final j MODIFIED_JULIAN_DAY;
    public static final j RATA_DIE;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f17523d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a, reason: collision with root package name */
    public final transient String f17524a;

    /* renamed from: b, reason: collision with root package name */
    public final transient s f17525b;

    /* renamed from: c, reason: collision with root package name */
    public final transient long f17526c;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f17523d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        j jVar = new j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = jVar;
        j jVar2 = new j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = jVar2;
        j jVar3 = new j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = jVar3;
        f17523d = new j[]{jVar, jVar2, jVar3};
    }

    public j(String str, int i5, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.f17524a = str2;
        this.f17525b = s.f((-365243219162L) + j, 365241780471L + j);
        this.f17526c = j;
    }

    @Override // j$.time.temporal.p
    public final s n() {
        return this.f17525b;
    }

    @Override // j$.time.temporal.p
    public final l z(l lVar, long j) {
        if (!this.f17525b.e(j)) {
            throw new j$.time.b("Invalid value: " + this.f17524a + " " + j);
        }
        return lVar.c(j$.com.android.tools.r8.a.U(j, this.f17526c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final boolean i(TemporalAccessor temporalAccessor) {
        return temporalAccessor.e(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final s j(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.e(a.EPOCH_DAY)) {
            return this.f17525b;
        }
        throw new j$.time.b("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.p
    public final long x(TemporalAccessor temporalAccessor) {
        return temporalAccessor.C(a.EPOCH_DAY) + this.f17526c;
    }

    @Override // j$.time.temporal.p
    public final TemporalAccessor k(Map map, d0 d0Var, e0 e0Var) {
        long longValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.k L = j$.com.android.tools.r8.a.L(d0Var);
        e0 e0Var2 = e0.LENIENT;
        long j = this.f17526c;
        if (e0Var == e0Var2) {
            return L.h(j$.com.android.tools.r8.a.U(longValue, j));
        }
        this.f17525b.b(longValue, this);
        return L.h(longValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17524a;
    }
}
