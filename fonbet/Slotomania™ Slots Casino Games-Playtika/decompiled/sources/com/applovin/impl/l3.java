package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;

/* loaded from: classes2.dex */
public class l3 {
    private final String a;
    private final MaxAdFormat b;

    public l3(String str, MaxAdFormat maxAdFormat) {
        this.a = str;
        this.b = maxAdFormat;
    }

    protected boolean a(Object obj) {
        return obj instanceof l3;
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        if (!l3Var.a(this)) {
            return false;
        }
        String b = b();
        String b2 = l3Var.b();
        if (b != null ? !b.equals(b2) : b2 != null) {
            return false;
        }
        MaxAdFormat a = a();
        MaxAdFormat a2 = l3Var.a();
        return a != null ? a.equals(a2) : a2 == null;
    }

    public int hashCode() {
        String b = b();
        int hashCode = b == null ? 43 : b.hashCode();
        MaxAdFormat a = a();
        return ((hashCode + 59) * 59) + (a != null ? a.hashCode() : 43);
    }

    public String toString() {
        return this.a + "-" + this.b.getLabel();
    }

    public MaxAdFormat a() {
        return this.b;
    }

    public static l3 a(String str) {
        String[] split = str.split("-");
        return new l3(split[0], MaxAdFormat.formatFromString(split[1]));
    }
}
