package org.joda.time.base;

import Bl0.k0;
import org.joda.time.DateTime;
import org.joda.time.i;

/* loaded from: classes10.dex */
public abstract class d implements i {
    protected d() {
    }

    public final DateTime d() {
        BaseInterval baseInterval = (BaseInterval) this;
        return new DateTime(baseInterval.b(), baseInterval.getChronology());
    }

    public final DateTime e() {
        BaseInterval baseInterval = (BaseInterval) this;
        return new DateTime(baseInterval.a(), baseInterval.getChronology());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        BaseInterval baseInterval = (BaseInterval) this;
        return baseInterval.a() == iVar.a() && baseInterval.b() == iVar.b() && k0.o(baseInterval.getChronology(), iVar.getChronology());
    }

    public final int hashCode() {
        BaseInterval baseInterval = (BaseInterval) this;
        long a11 = baseInterval.a();
        long b11 = baseInterval.b();
        return baseInterval.getChronology().hashCode() + ((((3007 + ((int) (a11 ^ (a11 >>> 32)))) * 31) + ((int) (b11 ^ (b11 >>> 32)))) * 31);
    }

    public final String toString() {
        BaseInterval baseInterval = (BaseInterval) this;
        org.joda.time.format.b l11 = org.joda.time.format.i.b().l(baseInterval.getChronology());
        StringBuffer stringBuffer = new StringBuffer(48);
        l11.i(baseInterval.a(), stringBuffer);
        stringBuffer.append('/');
        l11.i(baseInterval.b(), stringBuffer);
        return stringBuffer.toString();
    }
}
