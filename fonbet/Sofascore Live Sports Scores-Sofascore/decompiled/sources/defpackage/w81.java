package defpackage;

import com.sofascore.model.mvvm.model.BaseballInningInfo;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w81 {
    public final int a;
    public final int b;
    public final BaseballInningInfo c;

    public w81(int i, int i2, BaseballInningInfo baseballInningInfo) {
        baseballInningInfo.getClass();
        this.a = i;
        this.b = i2;
        this.c = baseballInningInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w81)) {
            return false;
        }
        w81 w81Var = (w81) obj;
        return this.a == w81Var.a && this.b == w81Var.b && Intrinsics.c(this.c, w81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "BaseballEventInningInfoUiModel(homeScore=", ", awayScore=", ", inningInfo=");
        s.append(this.c);
        s.append(")");
        return s.toString();
    }
}
