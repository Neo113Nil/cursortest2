package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u75 {
    public final Integer a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final Gender f;
    public final String g;

    public u75(Integer num, String str, int i, String str2, String str3, Gender gender, String str4) {
        str3.getClass();
        this.a = num;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = gender;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u75)) {
            return false;
        }
        u75 u75Var = (u75) obj;
        return Intrinsics.c(this.a, u75Var.a) && this.b.equals(u75Var.b) && this.c == u75Var.c && this.d.equals(u75Var.d) && Intrinsics.c(this.e, u75Var.e) && this.f == u75Var.f && Intrinsics.c(this.g, u75Var.g);
    }

    public final int hashCode() {
        Integer num = this.a;
        int c = dmi.c(dmi.c(wv8.a(this.c, dmi.c((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        Gender gender = this.f;
        int hashCode = (c + (gender == null ? 0 : gender.hashCode())) * 31;
        String str = this.g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = wv8.m("DraftHotProspectsData(playerId=", this.a, ", playerName=", this.b, ", clubId=");
        vxd.p(this.c, ", clubName=", this.d, ", playerPosition=", m);
        m.append(this.e);
        m.append(", playerGender=");
        m.append(this.f);
        m.append(", sport=");
        return mz1.o(m, this.g, ")");
    }
}
