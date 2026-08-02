package com.applovin.impl;

import java.util.Map;

/* loaded from: classes4.dex */
public class f0 {
    private final String a;
    private final Map b;
    private final Map c;
    private final String d;

    public f0(String str, Map map, Map map2, String str2) {
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = str2;
    }

    protected boolean a(Object obj) {
        return obj instanceof f0;
    }

    public String b() {
        return this.a;
    }

    public Map c() {
        return this.c;
    }

    public Map d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (!f0Var.a(this)) {
            return false;
        }
        String b = b();
        String b2 = f0Var.b();
        if (b != null ? !b.equals(b2) : b2 != null) {
            return false;
        }
        Map d = d();
        Map d2 = f0Var.d();
        if (d != null ? !d.equals(d2) : d2 != null) {
            return false;
        }
        Map c = c();
        Map c2 = f0Var.c();
        if (c != null ? !c.equals(c2) : c2 != null) {
            return false;
        }
        String a = a();
        String a2 = f0Var.a();
        return a != null ? a.equals(a2) : a2 == null;
    }

    public int hashCode() {
        String b = b();
        int hashCode = b == null ? 43 : b.hashCode();
        Map d = d();
        int hashCode2 = ((hashCode + 59) * 59) + (d == null ? 43 : d.hashCode());
        Map c = c();
        int hashCode3 = (hashCode2 * 59) + (c == null ? 43 : c.hashCode());
        String a = a();
        return (hashCode3 * 59) + (a != null ? a.hashCode() : 43);
    }

    public String toString() {
        return "AxonEventModel(eventName=" + b() + ", parameters=" + d() + ", options=" + c() + ", errorMessage=" + a() + ")";
    }

    public String a() {
        return this.d;
    }
}
