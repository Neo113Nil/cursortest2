package org.joda.time.base;

import Bl0.k0;
import org.joda.convert.ToString;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.format.i;
import org.joda.time.h;

/* loaded from: classes6.dex */
public abstract class c implements h {
    protected c() {
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        if (this == hVar) {
            return 0;
        }
        long millis = hVar.getMillis();
        long millis2 = getMillis();
        if (millis2 == millis) {
            return 0;
        }
        return millis2 < millis ? -1 : 1;
    }

    public final boolean b(h hVar) {
        return ((BaseDateTime) this).getMillis() < org.joda.time.c.c(hVar);
    }

    public DateTime d() {
        return new DateTime(getMillis(), getChronology().y());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return getMillis() == hVar.getMillis() && k0.o(getChronology(), hVar.getChronology());
    }

    public final int hashCode() {
        return getChronology().hashCode() + ((int) (getMillis() ^ (getMillis() >>> 32)));
    }

    @Override // org.joda.time.h
    public Instant toInstant() {
        return new Instant(getMillis());
    }

    @ToString
    public String toString() {
        return i.b().g(this);
    }
}
