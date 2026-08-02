package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kza {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final Gender e;
    public final tee f;
    public final long g;

    public kza(int i, int i2, int i3, String str, Gender gender, tee teeVar, long j) {
        str.getClass();
        teeVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = gender;
        this.f = teeVar;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kza)) {
            return false;
        }
        kza kzaVar = (kza) obj;
        return this.a == kzaVar.a && this.b == kzaVar.b && this.c == kzaVar.c && Intrinsics.c(this.d, kzaVar.d) && this.e == kzaVar.e && Intrinsics.c(this.f, kzaVar.f) && this.g == kzaVar.g;
    }

    public final int hashCode() {
        int c = dmi.c(wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
        Gender gender = this.e;
        return Long.hashCode(this.g) + ((this.f.hashCode() + ((c + (gender == null ? 0 : gender.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "LeagueRecapTopPerformancesUiModel(playerId=", ", teamId=", ", eventId=");
        vxd.p(this.c, ", playerName=", this.d, ", gender=", s);
        s.append(this.e);
        s.append(", statistics=");
        s.append(this.f);
        s.append(", eventTimestamp=");
        return lnb.l(this.g, ")", s);
    }
}
