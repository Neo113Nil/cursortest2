package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xrj {
    public final int a;
    public final String b;
    public final Gender c;
    public final String d;
    public final Integer e;
    public final int f;
    public final int g;

    public xrj(int i, String str, Gender gender, String str2, Integer num, int i2, int i3, int i4) {
        str2 = (i4 & 8) != 0 ? null : str2;
        num = (i4 & 16) != 0 ? null : num;
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = gender;
        this.d = str2;
        this.e = num;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrj)) {
            return false;
        }
        xrj xrjVar = (xrj) obj;
        return this.a == xrjVar.a && Intrinsics.c(this.b, xrjVar.b) && this.c == xrjVar.c && Intrinsics.c(this.d, xrjVar.d) && Intrinsics.c(this.e, xrjVar.e) && this.f == xrjVar.f && this.g == xrjVar.g;
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        Gender gender = this.c;
        int hashCode = (c + (gender == null ? 0 : gender.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return Integer.hashCode(this.g) + wv8.a(this.f, (hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TournamentWinnerUIModel(id=", ", name=", this.b, ", gender=");
        t.append(this.c);
        t.append(", year=");
        t.append(this.d);
        t.append(", numberOfTitles=");
        t.append(this.e);
        t.append(", titleHolderRes=");
        t.append(this.f);
        t.append(", pluralTitleHolderRes=");
        return fc6.h(this.g, ")", t);
    }
}
