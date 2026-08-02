package com.ironsource;

import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Yc {
    private final Boolean a;
    private final Integer b;

    /* JADX WARN: Multi-variable type inference failed */
    public Yc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Boolean a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final Boolean c() {
        return this.a;
    }

    public final Integer d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yc)) {
            return false;
        }
        Yc yc = (Yc) obj;
        return epx.f(this.a, yc.a) && epx.f(this.b, yc.b);
    }

    public int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PacingConfig2(enabled=" + this.a + ", minTimeBetweenShowsSeconds=" + this.b + ")";
    }

    public Yc(Boolean bool, Integer num) {
        this.a = bool;
        this.b = num;
    }

    public final Yc a(Boolean bool, Integer num) {
        return new Yc(bool, num);
    }

    public /* synthetic */ Yc(Boolean bool, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
    }

    public static /* synthetic */ Yc a(Yc yc, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = yc.a;
        }
        if ((i & 2) != 0) {
            num = yc.b;
        }
        return yc.a(bool, num);
    }
}
