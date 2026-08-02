package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w75 {
    public final Integer a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final int f;
    public final String g;
    public final Gender h;
    public final String i;

    public w75(Integer num, String str, Integer num2, String str2, Integer num3, int i, String str3, Gender gender, String str4) {
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = str2;
        this.e = num3;
        this.f = i;
        this.g = str3;
        this.h = gender;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w75)) {
            return false;
        }
        w75 w75Var = (w75) obj;
        return Intrinsics.c(this.a, w75Var.a) && Intrinsics.c(this.b, w75Var.b) && Intrinsics.c(this.c, w75Var.c) && this.d.equals(w75Var.d) && Intrinsics.c(this.e, w75Var.e) && this.f == w75Var.f && Intrinsics.c(this.g, w75Var.g) && this.h == w75Var.h && Intrinsics.c(this.i, w75Var.i);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int c = dmi.c((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.d);
        Integer num3 = this.e;
        int a = wv8.a(this.f, (c + (num3 == null ? 0 : num3.hashCode())) * 31, 31);
        String str2 = this.g;
        int hashCode3 = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        Gender gender = this.h;
        int hashCode4 = (hashCode3 + (gender == null ? 0 : gender.hashCode())) * 31;
        String str3 = this.i;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = wv8.m("DraftPicksData(playerId=", this.a, ", playerName=", this.b, ", clubId=");
        vxd.s(this.c, ", clubName=", this.d, ", teamFromId=", m);
        m.append(this.e);
        m.append(", teamToId=");
        m.append(this.f);
        m.append(", playerPosition=");
        m.append(this.g);
        m.append(", playerGender=");
        m.append(this.h);
        m.append(", sport=");
        return mz1.o(m, this.i, ")");
    }
}
