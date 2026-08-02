package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mte implements Serializable {
    public final int a;
    public final String b;
    public final Double c;
    public final Double d;
    public final Integer e;
    public final int f;
    public final String g;
    public final Gender h;
    public final String i;

    public mte(int i, String str, Double d, Double d2, Integer num, int i2, String str2, Gender gender, String str3) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = d;
        this.d = d2;
        this.e = num;
        this.f = i2;
        this.g = str2;
        this.h = gender;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mte)) {
            return false;
        }
        mte mteVar = (mte) obj;
        return this.a == mteVar.a && Intrinsics.c(this.b, mteVar.b) && Intrinsics.c(this.c, mteVar.c) && Intrinsics.c(this.d, mteVar.d) && Intrinsics.c(this.e, mteVar.e) && this.f == mteVar.f && Intrinsics.c(this.g, mteVar.g) && this.h == mteVar.h && Intrinsics.c(this.i, mteVar.i);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        Double d = this.c;
        int hashCode = (c + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.e;
        int c2 = dmi.c(wv8.a(this.f, (hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.g);
        Gender gender = this.h;
        int hashCode3 = (c2 + (gender == null ? 0 : gender.hashCode())) * 31;
        String str = this.i;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "PlayerOfTheMatch(playerId=", ", playerName=", this.b, ", rating=");
        fc6.A(t, this.c, ", votePercentage=", this.d, ", voteCount=");
        t.append(this.e);
        t.append(", teamId=");
        t.append(this.f);
        t.append(", teamName=");
        t.append(this.g);
        t.append(", gender=");
        t.append(this.h);
        t.append(", position=");
        return mz1.o(t, this.i, ")");
    }
}
