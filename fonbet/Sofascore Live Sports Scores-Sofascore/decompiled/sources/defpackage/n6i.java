package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n6i implements m6i {
    public final List a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final Gender e;

    public n6i(List list, boolean z, String str, boolean z2, Gender gender) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = gender;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6i)) {
            return false;
        }
        n6i n6iVar = (n6i) obj;
        return Intrinsics.c(this.a, n6iVar.a) && this.b == n6iVar.b && Intrinsics.c(this.c, n6iVar.c) && this.d == n6iVar.d && this.e == n6iVar.e;
    }

    public final int hashCode() {
        int e = dmi.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int e2 = dmi.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Gender gender = this.e;
        return e2 + (gender != null ? gender.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StageSectionRow(columns=");
        sb.append(this.a);
        sb.append(", fixedLayout=");
        sb.append(this.b);
        sb.append(", uniqueStageName=");
        dmi.w(sb, this.c, ", gapIntervalInterchangeable=", this.d, ", gender=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
