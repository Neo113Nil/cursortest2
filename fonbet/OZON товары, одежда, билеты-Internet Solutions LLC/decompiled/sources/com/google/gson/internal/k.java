package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;

/* loaded from: classes.dex */
public final class k extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f59971a;

    public k(String str) {
        this.f59971a = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return n.b(this.f59971a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f59971a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f59971a.equals(((k) obj).f59971a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f59971a);
    }

    public final int hashCode() {
        return this.f59971a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f59971a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return n.b(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f59971a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return n.b(str).longValue();
        }
    }

    public final String toString() {
        return this.f59971a;
    }
}
