package com.ironsource;

import xsna.epx;
import xsna.zcl;
import xsna.zr;

/* renamed from: com.ironsource.ag, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4231ag {
    private String a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4231ag() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4231ag) && epx.f(this.a, ((C4231ag) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return zr.a("TestSuiteSettings(controllerUrl=", this.a, ")");
    }

    public C4231ag(String str) {
        this.a = str;
    }

    public final C4231ag a(String str) {
        return new C4231ag(str);
    }

    public final void b(String str) {
        this.a = str;
    }

    public /* synthetic */ C4231ag(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ C4231ag a(C4231ag c4231ag, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4231ag.a;
        }
        return c4231ag.a(str);
    }
}
