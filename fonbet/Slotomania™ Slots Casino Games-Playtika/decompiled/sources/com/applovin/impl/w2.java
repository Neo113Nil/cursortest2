package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class w2 implements Comparable {
    private final String a;
    private final String b;
    private final boolean c;
    private final g3 d;

    w2(String str, String str2, boolean z, g3 g3Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = g3Var;
    }

    public String a() {
        return this.b;
    }

    public List b() {
        List l = this.d.l();
        return (l == null || l.isEmpty()) ? Collections.singletonList(this.a) : l;
    }

    public String c() {
        return this.a;
    }

    public g3 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            w2 w2Var = (w2) obj;
            String str = this.a;
            if (str == null ? w2Var.a != null : !str.equals(w2Var.a)) {
                return false;
            }
            String str2 = this.b;
            if (str2 == null ? w2Var.b != null : !str2.equals(w2Var.b)) {
                return false;
            }
            if (this.c == w2Var.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(w2 w2Var) {
        return this.b.compareToIgnoreCase(w2Var.b);
    }
}
