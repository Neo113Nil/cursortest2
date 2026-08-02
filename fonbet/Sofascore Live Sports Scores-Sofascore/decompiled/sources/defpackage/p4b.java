package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p4b {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;

    public p4b(boolean z, boolean z2, String str, String str2, String str3, String str4, int i, int i2) {
        w1l.y(str, str2, str3, str4);
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4b)) {
            return false;
        }
        p4b p4bVar = (p4b) obj;
        return this.a == p4bVar.a && this.b == p4bVar.b && Intrinsics.c(this.c, p4bVar.c) && Intrinsics.c(this.d, p4bVar.d) && Intrinsics.c(this.e, p4bVar.e) && Intrinsics.c(this.f, p4bVar.f) && this.g == p4bVar.g && this.h == p4bVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + wv8.a(this.g, dmi.c(dmi.c(dmi.c(dmi.c(dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder k = w1l.k("LeagueUiModel(unlocked=", this.a, ", current=", this.b, ", leagueName=");
        bf3.v(k, this.c, ", imageUrl=", this.d, ", lockedImageUrlLight=");
        bf3.v(k, this.e, ", lockedImageUrlDark=", this.f, ", level=");
        return me4.i(k, this.g, ", bgColor=", this.h, ")");
    }
}
