package com.ironsource;

import xsna.epx;
import xsna.ss9;

/* loaded from: classes13.dex */
public final class Q9 {
    private final String a;
    private final String b;

    public Q9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q9)) {
            return false;
        }
        Q9 q9 = (Q9) obj;
        return epx.f(this.a, q9.a) && epx.f(this.b, q9.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return ss9.a("IronSourceAdvId(advId=", this.a, ", advIdType=", this.b, ")");
    }

    public final Q9 a(String str, String str2) {
        return new Q9(str, str2);
    }

    public static /* synthetic */ Q9 a(Q9 q9, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = q9.a;
        }
        if ((i & 2) != 0) {
            str2 = q9.b;
        }
        return q9.a(str, str2);
    }
}
