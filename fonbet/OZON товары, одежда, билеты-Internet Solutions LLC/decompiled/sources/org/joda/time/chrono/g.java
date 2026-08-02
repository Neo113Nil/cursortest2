package org.joda.time.chrono;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/* loaded from: classes10.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final DateTimeZone f79186a;

    /* renamed from: b, reason: collision with root package name */
    private final Instant f79187b;

    /* renamed from: c, reason: collision with root package name */
    private final int f79188c;

    g(DateTimeZone dateTimeZone, Instant instant, int i11) {
        this.f79186a = dateTimeZone;
        this.f79187b = instant;
        this.f79188c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        Instant instant = gVar.f79187b;
        Instant instant2 = this.f79187b;
        if (instant2 == null) {
            if (instant != null) {
                return false;
            }
        } else if (!instant2.equals(instant)) {
            return false;
        }
        if (this.f79188c != gVar.f79188c) {
            return false;
        }
        DateTimeZone dateTimeZone = gVar.f79186a;
        DateTimeZone dateTimeZone2 = this.f79186a;
        if (dateTimeZone2 == null) {
            if (dateTimeZone != null) {
                return false;
            }
        } else if (!dateTimeZone2.equals(dateTimeZone)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Instant instant = this.f79187b;
        int hashCode = ((((instant == null ? 0 : instant.hashCode()) + 31) * 31) + this.f79188c) * 31;
        DateTimeZone dateTimeZone = this.f79186a;
        return hashCode + (dateTimeZone != null ? dateTimeZone.hashCode() : 0);
    }
}
