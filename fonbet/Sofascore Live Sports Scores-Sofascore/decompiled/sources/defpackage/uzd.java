package defpackage;

import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uzd {
    public final double a;
    public final gv9 b;
    public final Gender c;

    public uzd(double d, gv9 gv9Var, Gender gender) {
        gv9Var.getClass();
        this.a = d;
        this.b = gv9Var;
        this.c = gender;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzd)) {
            return false;
        }
        uzd uzdVar = (uzd) obj;
        return Double.compare(this.a, uzdVar.a) == 0 && Intrinsics.c(this.b, uzdVar.b) && this.c == uzdVar.c;
    }

    public final int hashCode() {
        int d = ljg.d(Double.hashCode(this.a) * 31, 31, this.b);
        Gender gender = this.c;
        return d + (gender == null ? 0 : gender.hashCode());
    }

    public final String toString() {
        return "PESMRatingBreakdownUiData(rating=" + this.a + ", ratingComponents=" + this.b + ", gender=" + this.c + ")";
    }
}
