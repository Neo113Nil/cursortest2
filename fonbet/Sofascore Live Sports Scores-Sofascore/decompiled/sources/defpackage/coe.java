package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class coe {
    public final int a;
    public final String b;
    public final Gender c;
    public final int d;
    public final String e;

    public coe(int i, String str, Gender gender, int i2, String str2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = gender;
        this.d = i2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coe)) {
            return false;
        }
        coe coeVar = (coe) obj;
        return this.a == coeVar.a && Intrinsics.c(this.b, coeVar.b) && this.c == coeVar.c && this.d == coeVar.d && Intrinsics.c(this.e, coeVar.e);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        Gender gender = this.c;
        int a = wv8.a(this.d, (c + (gender == null ? 0 : gender.hashCode())) * 31, 31);
        String str = this.e;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "PlayerDepthChartData(playerId=", ", playerName=", this.b, ", gender=");
        t.append(this.c);
        t.append(", depth=");
        t.append(this.d);
        t.append(", injury=");
        return mz1.o(t, this.e, ")");
    }
}
