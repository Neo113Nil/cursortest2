package org.joda.time.field;

import Bl0.k0;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class AbstractReadableInstantFieldProperty implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    public final String a(Locale locale) {
        return e().f(g(), locale);
    }

    public final String b(Locale locale) {
        return e().i(g(), locale);
    }

    protected org.joda.time.a d() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    public abstract org.joda.time.b e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractReadableInstantFieldProperty)) {
            return false;
        }
        AbstractReadableInstantFieldProperty abstractReadableInstantFieldProperty = (AbstractReadableInstantFieldProperty) obj;
        return e().d(g()) == abstractReadableInstantFieldProperty.e().d(abstractReadableInstantFieldProperty.g()) && e().C().equals(abstractReadableInstantFieldProperty.e().C()) && k0.o(d(), abstractReadableInstantFieldProperty.d());
    }

    public final int f() {
        return e().v(g());
    }

    protected abstract long g();

    public final int hashCode() {
        return d().hashCode() + e().C().hashCode() + (e().d(g()) * 17);
    }

    public final String toString() {
        return "Property[" + e().A() + "]";
    }
}
