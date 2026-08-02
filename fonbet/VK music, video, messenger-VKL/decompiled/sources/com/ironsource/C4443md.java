package com.ironsource;

import xsna.epx;
import xsna.rq;
import xsna.zcl;

/* renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4443md {
    private final Integer a;
    private final String b;
    private final Boolean c;
    private final String d;
    private final Integer e;
    private final Boolean f;
    private final C4648y3 g;
    private final Yc h;

    public C4443md() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4443md)) {
            return false;
        }
        C4443md c4443md = (C4443md) obj;
        return epx.f(this.a, c4443md.a) && epx.f(this.b, c4443md.b) && epx.f(this.c, c4443md.c) && epx.f(this.d, c4443md.d) && epx.f(this.e, c4443md.e) && epx.f(this.f, c4443md.f) && epx.f(this.g, c4443md.g) && epx.f(this.h, c4443md.h);
    }

    public final Boolean f() {
        return this.f;
    }

    public final C4648y3 g() {
        return this.g;
    }

    public final Yc h() {
        return this.h;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.f;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C4648y3 c4648y3 = this.g;
        int hashCode7 = (hashCode6 + (c4648y3 == null ? 0 : c4648y3.hashCode())) * 31;
        Yc yc = this.h;
        return hashCode7 + (yc != null ? yc.hashCode() : 0);
    }

    public final C4648y3 i() {
        return this.g;
    }

    public final Boolean j() {
        return this.f;
    }

    public final Yc k() {
        return this.h;
    }

    public final Integer l() {
        return this.a;
    }

    public final String m() {
        return this.b;
    }

    public final Integer n() {
        return this.e;
    }

    public final String o() {
        return this.d;
    }

    public final Boolean p() {
        return this.c;
    }

    public String toString() {
        Integer num = this.a;
        String str = this.b;
        Boolean bool = this.c;
        String str2 = this.d;
        Integer num2 = this.e;
        Boolean bool2 = this.f;
        C4648y3 c4648y3 = this.g;
        Yc yc = this.h;
        StringBuilder sb = new StringBuilder("PlacementConfig2(placementId=");
        sb.append(num);
        sb.append(", placementName=");
        sb.append(str);
        sb.append(", isDefault=");
        xsna.l4.i(bool, ", virtualItemName=", str2, ", virtualItemCount=", sb);
        rq.h(sb, num2, ", delivery=", bool2, ", capping=");
        sb.append(c4648y3);
        sb.append(", pacing=");
        sb.append(yc);
        sb.append(")");
        return sb.toString();
    }

    public C4443md(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C4648y3 c4648y3, Yc yc) {
        this.a = num;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = num2;
        this.f = bool2;
        this.g = c4648y3;
        this.h = yc;
    }

    public final C4443md a(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C4648y3 c4648y3, Yc yc) {
        return new C4443md(num, str, bool, str2, num2, bool2, c4648y3, yc);
    }

    public static /* synthetic */ C4443md a(C4443md c4443md, Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C4648y3 c4648y3, Yc yc, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c4443md.a;
        }
        if ((i & 2) != 0) {
            str = c4443md.b;
        }
        if ((i & 4) != 0) {
            bool = c4443md.c;
        }
        if ((i & 8) != 0) {
            str2 = c4443md.d;
        }
        if ((i & 16) != 0) {
            num2 = c4443md.e;
        }
        if ((i & 32) != 0) {
            bool2 = c4443md.f;
        }
        if ((i & 64) != 0) {
            c4648y3 = c4443md.g;
        }
        if ((i & 128) != 0) {
            yc = c4443md.h;
        }
        C4648y3 c4648y32 = c4648y3;
        Yc yc2 = yc;
        Integer num3 = num2;
        Boolean bool3 = bool2;
        return c4443md.a(num, str, bool, str2, num3, bool3, c4648y32, yc2);
    }

    public /* synthetic */ C4443md(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C4648y3 c4648y3, Yc yc, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c4648y3, (i & 128) != 0 ? null : yc);
    }
}
