package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s9p extends m9p {
    public final Serializable a;

    public s9p(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean n(s9p s9pVar) {
        Serializable serializable = s9pVar.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number c() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new ybp((String) serializable);
        }
        a70.m("Primitive is neither a number nor a string");
        return null;
    }

    public final String d() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        a70.j("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
        return null;
    }

    public final double e() {
        return this.a instanceof Number ? c().doubleValue() : Double.parseDouble(d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s9p.class != obj.getClass()) {
            return false;
        }
        s9p s9pVar = (s9p) obj;
        Serializable serializable = s9pVar.a;
        Serializable serializable2 = this.a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (n(this) && n(s9pVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? m().equals(s9pVar.m()) : c().longValue() == s9pVar.c().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : tz9.b0(d())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : tz9.b0(s9pVar.d())) == 0;
        }
        double e = e();
        double e2 = s9pVar.e();
        if (e != e2) {
            return Double.isNaN(e) && Double.isNaN(e2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (n(this)) {
            doubleToLongBits = c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final BigInteger m() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (n(this)) {
            return BigInteger.valueOf(c().longValue());
        }
        String d = d();
        tz9.e0(d);
        return new BigInteger(d);
    }

    public s9p(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public s9p(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
