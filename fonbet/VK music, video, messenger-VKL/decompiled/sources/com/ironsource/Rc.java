package com.ironsource;

import xsna.epx;
import xsna.ss9;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Rc {
    private final String a;
    private final String b;

    public Rc(String str, String str2) {
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
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rc)) {
            return false;
        }
        Rc rc = (Rc) obj;
        return epx.f(this.a, rc.a) && epx.f(this.b, rc.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return ss9.a("OpenUrl(url=", this.a, ", packageName=", this.b, ")");
    }

    public /* synthetic */ Rc(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public final Rc a(String str, String str2) {
        return new Rc(str, str2);
    }

    public static /* synthetic */ Rc a(Rc rc, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rc.a;
        }
        if ((i & 2) != 0) {
            str2 = rc.b;
        }
        return rc.a(str, str2);
    }
}
