package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l implements TemporalAccessor, j$.time.temporal.m {
    public static final l APRIL;
    public static final l AUGUST;
    public static final l DECEMBER;
    public static final l FEBRUARY;
    public static final l JANUARY;
    public static final l JULY;
    public static final l JUNE;
    public static final l MARCH;
    public static final l MAY;
    public static final l NOVEMBER;
    public static final l OCTOBER;
    public static final l SEPTEMBER;

    /* renamed from: a, reason: collision with root package name */
    public static final l[] f17487a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ l[] f17488b;

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f17488b.clone();
    }

    static {
        l lVar = new l("JANUARY", 0);
        JANUARY = lVar;
        l lVar2 = new l("FEBRUARY", 1);
        FEBRUARY = lVar2;
        l lVar3 = new l("MARCH", 2);
        MARCH = lVar3;
        l lVar4 = new l("APRIL", 3);
        APRIL = lVar4;
        l lVar5 = new l("MAY", 4);
        MAY = lVar5;
        l lVar6 = new l("JUNE", 5);
        JUNE = lVar6;
        l lVar7 = new l("JULY", 6);
        JULY = lVar7;
        l lVar8 = new l("AUGUST", 7);
        AUGUST = lVar8;
        l lVar9 = new l("SEPTEMBER", 8);
        SEPTEMBER = lVar9;
        l lVar10 = new l("OCTOBER", 9);
        OCTOBER = lVar10;
        l lVar11 = new l("NOVEMBER", 10);
        NOVEMBER = lVar11;
        l lVar12 = new l("DECEMBER", 11);
        DECEMBER = lVar12;
        f17488b = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12};
        f17487a = values();
    }

    public static l S(int i5) {
        if (i5 < 1 || i5 > 12) {
            throw new b("Invalid value for MonthOfYear: " + i5);
        }
        return f17487a[i5 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.n();
        }
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
        }
        return pVar.x(this);
    }

    public final int Q(boolean z5) {
        int i5 = k.f17486a[ordinal()];
        return i5 != 1 ? (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) ? 30 : 31 : z5 ? 29 : 28;
    }

    public final int R() {
        int i5 = k.f17486a[ordinal()];
        if (i5 != 1) {
            return (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int P(boolean z5) {
        switch (k.f17486a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z5 ? 1 : 0) + 91;
            case 3:
                return (z5 ? 1 : 0) + 152;
            case 4:
                return (z5 ? 1 : 0) + 244;
            case 5:
                return (z5 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z5 ? 1 : 0) + 60;
            case 8:
                return (z5 ? 1 : 0) + 121;
            case 9:
                return (z5 ? 1 : 0) + 182;
            case 10:
                return (z5 ? 1 : 0) + 213;
            case 11:
                return (z5 ? 1 : 0) + 274;
            default:
                return (z5 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        if (xVar == j$.time.temporal.q.f17531b) {
            return j$.time.chrono.r.f17346c;
        }
        if (xVar == j$.time.temporal.q.f17532c) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.q.c(this, xVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        if (!j$.com.android.tools.r8.a.L(lVar).equals(j$.time.chrono.r.f17346c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return lVar.c(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
