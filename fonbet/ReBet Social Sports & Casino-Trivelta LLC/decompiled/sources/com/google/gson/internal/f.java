package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class f extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f38278a;

    public f(String str) {
        this.f38278a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new BigDecimal(this.f38278a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f38278a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f38278a;
        String str2 = ((f) obj).f38278a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f38278a);
    }

    public int hashCode() {
        return this.f38278a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f38278a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f38278a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f38278a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f38278a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f38278a).longValue();
        }
    }

    public String toString() {
        return this.f38278a;
    }
}
