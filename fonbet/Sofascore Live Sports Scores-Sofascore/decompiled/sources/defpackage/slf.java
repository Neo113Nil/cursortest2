package defpackage;

import com.sofascore.model.profile.UserBadge;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class slf extends ulf {
    public final String a;
    public final String b;
    public final float c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final UserBadge h;
    public final Integer i;

    public slf(String str, String str2, float f, int i, boolean z, boolean z2, boolean z3, UserBadge userBadge, Integer num) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = userBadge;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slf)) {
            return false;
        }
        slf slfVar = (slf) obj;
        return Intrinsics.c(this.a, slfVar.a) && Intrinsics.c(this.b, slfVar.b) && Float.compare(this.c, slfVar.c) == 0 && this.d == slfVar.d && this.e == slfVar.e && this.f == slfVar.f && this.g == slfVar.g && this.h == slfVar.h && Intrinsics.c(this.i, slfVar.i);
    }

    public final int hashCode() {
        int e = dmi.e(dmi.e(dmi.e(wv8.a(this.d, fc6.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g);
        UserBadge userBadge = this.h;
        int hashCode = (e + (userBadge == null ? 0 : userBadge.hashCode())) * 31;
        Integer num = this.i;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = mz1.s("UserRankingUiModel(id=", this.a, ", nickname=", this.b, ", score=");
        s.append(this.c);
        s.append(", position=");
        s.append(this.d);
        s.append(", promotion=");
        vxd.t(", demotion=", ", myProfile=", s, this.e, this.f);
        s.append(this.g);
        s.append(", badge=");
        s.append(this.h);
        s.append(", weeklyStreak=");
        return vxd.n(s, this.i, ")");
    }
}
