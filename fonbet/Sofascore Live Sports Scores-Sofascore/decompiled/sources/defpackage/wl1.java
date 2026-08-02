package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class wl1 {
    public final m91 a;
    public final l91 b;
    public final Double c;
    public final Float d;
    public final Float e;
    public final Float f;
    public final Float g;
    public final Integer h;
    public final boolean i;

    public wl1(m91 m91Var, l91 l91Var, Double d, Float f, Float f2, Float f3, Float f4, Integer num) {
        this.a = m91Var;
        this.b = l91Var;
        this.c = d;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = num;
        this.i = (l91Var == l91.m || l91Var == l91.n) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl1)) {
            return false;
        }
        wl1 wl1Var = (wl1) obj;
        return this.a == wl1Var.a && this.b == wl1Var.b && Intrinsics.c(this.c, wl1Var.c) && Intrinsics.c(this.d, wl1Var.d) && Intrinsics.c(this.e, wl1Var.e) && Intrinsics.c(this.f, wl1Var.f) && Intrinsics.c(this.g, wl1Var.g) && Intrinsics.c(this.h, wl1Var.h);
    }

    public final int hashCode() {
        m91 m91Var = this.a;
        int hashCode = (m91Var == null ? 0 : m91Var.hashCode()) * 31;
        l91 l91Var = this.b;
        int hashCode2 = (hashCode + (l91Var == null ? 0 : l91Var.hashCode())) * 31;
        Double d = this.c;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Float f = this.d;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.e;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.f;
        int hashCode6 = (hashCode5 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.g;
        int hashCode7 = (hashCode6 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num = this.h;
        return hashCode7 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "BaseballSeasonPitchDisplayData(pitchTypeDisplay=" + this.a + ", outcomeDisplay=" + this.b + ", pitchSpeed=" + this.c + ", mlbX=" + this.d + ", mlbY=" + this.e + ", mlbHitCordX=" + this.f + ", mlbHitCordY=" + this.g + ", mlbZone=" + this.h + ")";
    }
}
