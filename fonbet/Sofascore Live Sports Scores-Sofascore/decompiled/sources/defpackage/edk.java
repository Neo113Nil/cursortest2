package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class edk {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;

    public edk(int i, String str, String str2, int i2, int i3, String str3, int i4, int i5, String str4, String str5, String str6) {
        str5.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = i4;
        this.h = i5;
        this.i = str4;
        this.j = str5;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edk)) {
            return false;
        }
        edk edkVar = (edk) obj;
        return this.a == edkVar.a && this.b.equals(edkVar.b) && this.c.equals(edkVar.c) && this.d == edkVar.d && this.e == edkVar.e && this.f.equals(edkVar.f) && this.g == edkVar.g && this.h == edkVar.h && this.i.equals(edkVar.i) && Intrinsics.c(this.j, edkVar.j) && this.k.equals(edkVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + dmi.c(dmi.c(wv8.a(this.h, wv8.a(this.g, dmi.c(wv8.a(this.e, wv8.a(this.d, dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "UpcomingEventUiModel(id=", ", textUpper=", this.b, ", textLower=");
        w1l.q(this.d, this.c, ", homeTeamId=", ", homeTeamType=", t);
        vxd.p(this.e, ", homeTeamCountryAlpha2=", this.f, ", awayTeamId=", t);
        me4.q(t, this.g, ", awayTeamType=", this.h, ", awayTeamCountryAlpha2=");
        bf3.v(t, this.i, ", homeTeamTranslatedName=", this.j, ", awayTeamTranslatedName=");
        return mz1.o(t, this.k, ")");
    }
}
