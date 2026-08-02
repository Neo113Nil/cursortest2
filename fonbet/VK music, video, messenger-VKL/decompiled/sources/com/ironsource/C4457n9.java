package com.ironsource;

import xsna.epx;
import xsna.i5s;
import xsna.shy;
import xsna.xy6;
import xsna.zcl;

/* renamed from: com.ironsource.n9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4457n9 {
    private final String a;
    private final int b;
    private final String c;

    public C4457n9() {
        this(null, 0, null, 7, null);
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4457n9)) {
            return false;
        }
        C4457n9 c4457n9 = (C4457n9) obj;
        return epx.f(this.a, c4457n9.a) && this.b == c4457n9.b && epx.f(this.c, c4457n9.c);
    }

    public final int f() {
        return this.b;
    }

    public int hashCode() {
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        return i5s.a(xy6.b(i, "InstanceInformation(instanceId=", str, ", instanceType=", ", dynamicDemandSourceId="), this.c, ")");
    }

    public C4457n9(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final C4457n9 a(String str, int i, String str2) {
        return new C4457n9(str, i, str2);
    }

    public static /* synthetic */ C4457n9 a(C4457n9 c4457n9, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c4457n9.a;
        }
        if ((i2 & 2) != 0) {
            i = c4457n9.b;
        }
        if ((i2 & 4) != 0) {
            str2 = c4457n9.c;
        }
        return c4457n9.a(str, i, str2);
    }

    public /* synthetic */ C4457n9(String str, int i, String str2, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
