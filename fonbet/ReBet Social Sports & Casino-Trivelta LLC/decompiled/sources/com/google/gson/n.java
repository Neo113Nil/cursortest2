package com.google.gson;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class n extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f38330a;

    public n(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f38330a = bool;
    }

    public static boolean p(n nVar) {
        Object obj = nVar.f38330a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.h
    public boolean a() {
        return o() ? ((Boolean) this.f38330a).booleanValue() : Boolean.parseBoolean(h());
    }

    @Override // com.google.gson.h
    public int b() {
        return q() ? n().intValue() : Integer.parseInt(h());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f38330a == null) {
            return nVar.f38330a == null;
        }
        if (p(this) && p(nVar)) {
            return n().longValue() == nVar.n().longValue();
        }
        Object obj2 = this.f38330a;
        if (!(obj2 instanceof Number) || !(nVar.f38330a instanceof Number)) {
            return obj2.equals(nVar.f38330a);
        }
        double doubleValue = n().doubleValue();
        double doubleValue2 = nVar.n().doubleValue();
        return doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2));
    }

    @Override // com.google.gson.h
    public long g() {
        return q() ? n().longValue() : Long.parseLong(h());
    }

    @Override // com.google.gson.h
    public String h() {
        Object obj = this.f38330a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (q()) {
            return n().toString();
        }
        if (o()) {
            return ((Boolean) this.f38330a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f38330a.getClass());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f38330a == null) {
            return 31;
        }
        if (p(this)) {
            doubleToLongBits = n().longValue();
        } else {
            Object obj = this.f38330a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(n().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public double m() {
        return q() ? n().doubleValue() : Double.parseDouble(h());
    }

    public Number n() {
        Object obj = this.f38330a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new com.google.gson.internal.f((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public boolean o() {
        return this.f38330a instanceof Boolean;
    }

    public boolean q() {
        return this.f38330a instanceof Number;
    }

    public boolean r() {
        return this.f38330a instanceof String;
    }

    public n(Number number) {
        Objects.requireNonNull(number);
        this.f38330a = number;
    }

    public n(String str) {
        Objects.requireNonNull(str);
        this.f38330a = str;
    }
}
