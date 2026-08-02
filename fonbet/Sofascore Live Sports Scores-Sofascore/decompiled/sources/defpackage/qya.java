package defpackage;

import com.sofascore.model.newNetwork.PowerRankingRound;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qya implements sya {
    public final PowerRankingRound a;

    public qya(PowerRankingRound powerRankingRound) {
        this.a = powerRankingRound;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qya) && this.a.equals(((qya) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RoundSelected(round=" + this.a + ")";
    }
}
