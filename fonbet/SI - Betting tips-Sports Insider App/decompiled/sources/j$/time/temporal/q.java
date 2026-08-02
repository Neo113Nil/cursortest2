package j$.time.temporal;

import j$.time.x;
import j$.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final x f17530a = new x(3);

    /* renamed from: b, reason: collision with root package name */
    public static final x f17531b = new x(4);

    /* renamed from: c, reason: collision with root package name */
    public static final x f17532c = new x(5);

    /* renamed from: d, reason: collision with root package name */
    public static final x f17533d = new x(6);

    /* renamed from: e, reason: collision with root package name */
    public static final x f17534e = new x(7);

    /* renamed from: f, reason: collision with root package name */
    public static final x f17535f = new x(8);

    /* renamed from: g, reason: collision with root package name */
    public static final x f17536g = new x(9);

    public static /* synthetic */ int e(int i5) {
        int i10 = i5 % 7;
        if (i10 == 0) {
            return 0;
        }
        return (((i5 ^ 7) >> 31) | 1) > 0 ? i10 : i10 + 7;
    }

    public static s d(TemporalAccessor temporalAccessor, p pVar) {
        if (!(pVar instanceof a)) {
            Objects.requireNonNull(pVar, "field");
            return pVar.j(temporalAccessor);
        }
        if (temporalAccessor.e(pVar)) {
            return ((a) pVar).f17512b;
        }
        throw new r(j$.time.c.a("Unsupported field: ", pVar));
    }

    public static int a(TemporalAccessor temporalAccessor, p pVar) {
        s k6 = temporalAccessor.k(pVar);
        if (!k6.d()) {
            throw new r("Invalid field " + pVar + " for get() method, use getLong() instead");
        }
        long C = temporalAccessor.C(pVar);
        if (k6.e(C)) {
            return (int) C;
        }
        throw new j$.time.b("Invalid value for " + pVar + " (valid values " + k6 + "): " + C);
    }

    public static Object c(TemporalAccessor temporalAccessor, x xVar) {
        if (xVar == f17530a || xVar == f17531b || xVar == f17532c) {
            return null;
        }
        return xVar.g(temporalAccessor);
    }

    public static l b(l lVar, long j, TemporalUnit temporalUnit) {
        long j6;
        if (j == Long.MIN_VALUE) {
            lVar = lVar.d(LongCompanionObject.MAX_VALUE, temporalUnit);
            j6 = 1;
        } else {
            j6 = -j;
        }
        return lVar.d(j6, temporalUnit);
    }
}
