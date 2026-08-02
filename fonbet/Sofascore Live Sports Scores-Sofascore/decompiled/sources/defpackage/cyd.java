package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cyd {
    public final int a;
    public final String b;
    public final int c;
    public final boolean d;
    public final List e;
    public final c14 f;
    public final Gender g;

    public cyd(int i, String str, int i2, boolean z, List list, c14 c14Var, Gender gender) {
        list.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
        this.e = list;
        this.f = c14Var;
        this.g = gender;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyd)) {
            return false;
        }
        cyd cydVar = (cyd) obj;
        return this.a == cydVar.a && this.b.equals(cydVar.b) && this.c == cydVar.c && this.d == cydVar.d && Intrinsics.c(this.e, cydVar.e) && this.f.equals(cydVar.f) && this.g == cydVar.g;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + dmi.d(dmi.e(wv8.a(this.c, dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e)) * 31;
        Gender gender = this.g;
        return hashCode + (gender == null ? 0 : gender.hashCode());
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "OverPlayerData(playerId=", ", playerShortname=", this.b, ", teamId=");
        t.append(this.c);
        t.append(", isOut=");
        t.append(this.d);
        t.append(", stats=");
        t.append(this.e);
        t.append(", columnData=");
        t.append(this.f);
        t.append(", gender=");
        t.append(this.g);
        t.append(")");
        return t.toString();
    }
}
