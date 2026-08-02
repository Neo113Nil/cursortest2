package j$.time;

import io.appmetrica.analytics.impl.C0122e9;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Optional;
import j$.util.a0;
import j$.util.b0;
import j$.util.c0;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Predicate$CC;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements j$.time.temporal.m, IntFunction, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17566a;

    public /* synthetic */ x(int i5) {
        this.f17566a = i5;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f17566a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f17566a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d10) {
        return Double.valueOf(d10);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d10, double d11) {
        switch (this.f17566a) {
            case 14:
                return Math.min(d10, d11);
            default:
                return Math.max(d10, d11);
        }
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f17566a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f17566a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f17566a) {
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return ((a0) obj).f17613a;
            case C0122e9.F /* 25 */:
                return ((b0) obj).f17617a;
            case C0122e9.G /* 26 */:
                return ((c0) obj).f17623a;
            default:
                return ((Optional) obj).f17603a != null;
        }
    }

    @Override // j$.time.temporal.m
    public j$.time.temporal.l n(j$.time.temporal.l lVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return lVar.c(lVar.k(aVar).f17540d, aVar);
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d10) {
        switch (this.f17566a) {
            case 15:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                j$.util.stream.m.a(dArr, d10);
                dArr[3] = dArr[3] + d10;
                break;
            case 16:
            default:
                double[] dArr2 = (double[]) obj;
                j$.util.stream.m.a(dArr2, d10);
                dArr2[2] = dArr2[2] + d10;
                break;
            case 17:
                ((j$.util.w) obj).accept(d10);
                break;
        }
    }

    public Object g(TemporalAccessor temporalAccessor) {
        switch (this.f17566a) {
            case 0:
                if (temporalAccessor instanceof ZonedDateTime) {
                    return (ZonedDateTime) temporalAccessor;
                }
                try {
                    ZoneId P = ZoneId.P(temporalAccessor);
                    j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
                    if (!temporalAccessor.e(aVar)) {
                        temporalAccessor = ZonedDateTime.P(LocalDateTime.S(g.R(temporalAccessor), j.R(temporalAccessor)), P, null);
                    } else {
                        temporalAccessor = ZonedDateTime.n(temporalAccessor.C(aVar), temporalAccessor.i(j$.time.temporal.a.NANO_OF_SECOND), P);
                    }
                    return temporalAccessor;
                } catch (b e7) {
                    throw new b("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e7);
                }
            case 1:
                ZoneId zoneId = (ZoneId) temporalAccessor.z(j$.time.temporal.q.f17530a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 2:
            default:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.e(aVar2)) {
                    return j.U(temporalAccessor.C(aVar2));
                }
                return null;
            case 3:
                return (ZoneId) temporalAccessor.z(j$.time.temporal.q.f17530a);
            case 4:
                return (j$.time.chrono.k) temporalAccessor.z(j$.time.temporal.q.f17531b);
            case 5:
                return (TemporalUnit) temporalAccessor.z(j$.time.temporal.q.f17532c);
            case 6:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.e(aVar3)) {
                    return ZoneOffset.X(temporalAccessor.i(aVar3));
                }
                return null;
            case 7:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.z(j$.time.temporal.q.f17530a);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.z(j$.time.temporal.q.f17533d);
            case 8:
                j$.time.temporal.a aVar4 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.e(aVar4)) {
                    return g.a0(temporalAccessor.C(aVar4));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f17566a) {
            case 3:
                return "ZoneId";
            case 4:
                return "Chronology";
            case 5:
                return "Precision";
            case 6:
                return "ZoneOffset";
            case 7:
                return "Zone";
            case 8:
                return "LocalDate";
            case 9:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f17566a) {
            case 11:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 12:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 13:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                j$.util.stream.m.a(dArr, dArr2[0]);
                j$.util.stream.m.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 14:
            case 15:
            default:
                ((j$.util.w) obj).a((j$.util.w) obj2);
                break;
            case 16:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                j$.util.stream.m.a(dArr3, dArr4[0]);
                j$.util.stream.m.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i5) {
        switch (this.f17566a) {
            case 10:
                return new Object[i5];
            case 21:
                return new Double[i5];
            case 28:
                return new Object[i5];
            default:
                return new Integer[i5];
        }
    }
}
