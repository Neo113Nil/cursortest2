package defpackage;

import com.sofascore.model.mvvm.model.Season;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tb9 extends ub9 {
    public final int b;
    public final List c;
    public final int d;
    public final Season e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb9(int i, List list, int i2, Season season) {
        super(i);
        list.getClass();
        season.getClass();
        this.b = i;
        this.c = list;
        this.d = i2;
        this.e = season;
    }

    @Override // defpackage.ub9
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb9)) {
            return false;
        }
        tb9 tb9Var = (tb9) obj;
        return this.b == tb9Var.b && Intrinsics.c(this.c, tb9Var.c) && this.d == tb9Var.d && Intrinsics.c(this.e, tb9Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + wv8.a(this.d, dmi.d(Integer.hashCode(this.b) * 31, 31, this.c), 31);
    }

    public final String toString() {
        return "TopPerformanceItem(type=" + this.b + ", categories=" + this.c + ", uniqueTournamentId=" + this.d + ", season=" + this.e + ")";
    }
}
