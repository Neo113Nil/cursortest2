package com.ironsource;

import xsna.epx;
import xsna.oq;
import xsna.zcl;

/* renamed from: com.ironsource.y3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4648y3 {
    private final Boolean a;
    private final String b;
    private final Integer c;

    public C4648y3() {
        this(null, null, null, 7, null);
    }

    public final Boolean a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final Boolean d() {
        return this.a;
    }

    public final Integer e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4648y3)) {
            return false;
        }
        C4648y3 c4648y3 = (C4648y3) obj;
        return epx.f(this.a, c4648y3.a) && epx.f(this.b, c4648y3.b) && epx.f(this.c, c4648y3.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.a;
        String str = this.b;
        Integer num = this.c;
        StringBuilder sb = new StringBuilder("CappingConfig2(enabled=");
        sb.append(bool);
        sb.append(", unit=");
        sb.append(str);
        sb.append(", maxImpressions=");
        return oq.b(sb, num, ")");
    }

    public C4648y3(Boolean bool, String str, Integer num) {
        this.a = bool;
        this.b = str;
        this.c = num;
    }

    public final C4648y3 a(Boolean bool, String str, Integer num) {
        return new C4648y3(bool, str, num);
    }

    public static /* synthetic */ C4648y3 a(C4648y3 c4648y3, Boolean bool, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c4648y3.a;
        }
        if ((i & 2) != 0) {
            str = c4648y3.b;
        }
        if ((i & 4) != 0) {
            num = c4648y3.c;
        }
        return c4648y3.a(bool, str, num);
    }

    public /* synthetic */ C4648y3(Boolean bool, String str, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
