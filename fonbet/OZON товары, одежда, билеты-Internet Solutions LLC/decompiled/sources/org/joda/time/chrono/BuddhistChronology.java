package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/* loaded from: classes10.dex */
public final class BuddhistChronology extends AssembledChronology {

    /* renamed from: K, reason: collision with root package name */
    private static final org.joda.time.b f79149K = new c();

    /* renamed from: L, reason: collision with root package name */
    private static final ConcurrentHashMap<DateTimeZone, BuddhistChronology> f79150L = new ConcurrentHashMap<>();

    /* renamed from: M, reason: collision with root package name */
    private static final BuddhistChronology f79151M = g0(DateTimeZone.f78989a);
    private static final long serialVersionUID = -3474595157769370126L;

    public static BuddhistChronology g0(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        ConcurrentHashMap<DateTimeZone, BuddhistChronology> concurrentHashMap = f79150L;
        BuddhistChronology buddhistChronology = concurrentHashMap.get(dateTimeZone);
        if (buddhistChronology != null) {
            return buddhistChronology;
        }
        BuddhistChronology buddhistChronology2 = new BuddhistChronology(GJChronology.k0(dateTimeZone, null, 4), null);
        BuddhistChronology buddhistChronology3 = new BuddhistChronology(LimitChronology.j0(buddhistChronology2, new DateTime(buddhistChronology2), null), "");
        BuddhistChronology putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, buddhistChronology3);
        return putIfAbsent != null ? putIfAbsent : buddhistChronology3;
    }

    private Object readResolve() {
        org.joda.time.a d02 = d0();
        return d02 == null ? f79151M : g0(d02.y());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.a
    public final org.joda.time.a W() {
        return f79151M;
    }

    @Override // org.joda.time.a
    public final org.joda.time.a X(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        return dateTimeZone == y() ? this : g0(dateTimeZone);
    }

    @Override // org.joda.time.chrono.AssembledChronology
    protected final void c0(AssembledChronology.a aVar) {
        if (e0() == null) {
            aVar.f79109l = UnsupportedDurationField.l(DurationFieldType.d());
            org.joda.time.field.d dVar = new org.joda.time.field.d(new SkipUndoDateTimeField(this, aVar.f79093E), 543);
            aVar.f79093E = dVar;
            aVar.f79094F = new DelegatedDateTimeField(dVar, aVar.f79109l, DateTimeFieldType.g0());
            aVar.f79090B = new org.joda.time.field.d(new SkipUndoDateTimeField(this, aVar.f79090B), 543);
            org.joda.time.field.c cVar = new org.joda.time.field.c(new org.joda.time.field.d(aVar.f79094F, 99), aVar.f79109l, DateTimeFieldType.G());
            aVar.f79096H = cVar;
            aVar.f79108k = cVar.n();
            aVar.f79095G = new org.joda.time.field.d(new org.joda.time.field.g((org.joda.time.field.c) aVar.f79096H), DateTimeFieldType.f0(), 1);
            aVar.f79091C = new org.joda.time.field.d(new org.joda.time.field.g(aVar.f79090B, aVar.f79108k, DateTimeFieldType.d0()), DateTimeFieldType.d0(), 1);
            aVar.f79097I = f79149K;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuddhistChronology) {
            return y().equals(((BuddhistChronology) obj).y());
        }
        return false;
    }

    public final int hashCode() {
        return y().hashCode() + 499287079;
    }

    @Override // org.joda.time.a
    public final String toString() {
        DateTimeZone y11 = y();
        if (y11 == null) {
            return "BuddhistChronology";
        }
        return "BuddhistChronology[" + y11.h() + ']';
    }
}
