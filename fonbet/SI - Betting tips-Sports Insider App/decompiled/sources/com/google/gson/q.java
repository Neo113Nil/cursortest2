package com.google.gson;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f6374a;

    public q(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f6374a = bool;
    }

    public static boolean d(q qVar) {
        Serializable serializable = qVar.f6374a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final BigInteger a() {
        Serializable serializable = this.f6374a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (d(this)) {
            return BigInteger.valueOf(b().longValue());
        }
        String c2 = c();
        com.google.gson.internal.e.d(c2);
        return new BigInteger(c2);
    }

    public final Number b() {
        Serializable serializable = this.f6374a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.google.gson.internal.g((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String c() {
        Serializable serializable = this.f6374a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        Serializable serializable = qVar.f6374a;
        Serializable serializable2 = this.f6374a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (d(this) && d(qVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? a().equals(qVar.a()) : b().longValue() == qVar.b().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : com.google.gson.internal.e.i(c())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : com.google.gson.internal.e.i(qVar.c())) == 0;
        }
        double doubleValue = serializable2 instanceof Number ? b().doubleValue() : Double.parseDouble(c());
        double doubleValue2 = serializable instanceof Number ? qVar.b().doubleValue() : Double.parseDouble(qVar.c());
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f6374a;
        if (serializable == null) {
            return 31;
        }
        if (d(this)) {
            doubleToLongBits = b().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(b().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public q(Number number) {
        Objects.requireNonNull(number);
        this.f6374a = number;
    }

    public q(String str) {
        Objects.requireNonNull(str);
        this.f6374a = str;
    }
}
