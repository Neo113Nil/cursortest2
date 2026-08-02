package defpackage;

import com.sofascore.model.newNetwork.FanPlayerOfTheMatchResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ly5 {
    public final FanPlayerOfTheMatchResponse a;
    public final Integer b;

    public ly5(FanPlayerOfTheMatchResponse fanPlayerOfTheMatchResponse, Integer num) {
        fanPlayerOfTheMatchResponse.getClass();
        this.a = fanPlayerOfTheMatchResponse;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly5)) {
            return false;
        }
        ly5 ly5Var = (ly5) obj;
        return Intrinsics.c(this.a, ly5Var.a) && Intrinsics.c(this.b, ly5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PlayerOfTheMatchVotingWrapper(options=" + this.a + ", myPickId=" + this.b + ")";
    }
}
