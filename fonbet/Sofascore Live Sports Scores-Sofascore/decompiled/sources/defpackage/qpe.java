package defpackage;

import com.sofascore.model.newNetwork.PlayerEventsListResponse;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qpe implements Serializable {
    public final int a;
    public final PlayerEventsListResponse b;
    public final AbstractPlayerSeasonStatistics c;

    public qpe(int i, PlayerEventsListResponse playerEventsListResponse, AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics) {
        this.a = i;
        this.b = playerEventsListResponse;
        this.c = abstractPlayerSeasonStatistics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qpe) {
            qpe qpeVar = (qpe) obj;
            if (this.a == qpeVar.a && this.b == qpeVar.b && Intrinsics.c(this.c, qpeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics = this.c;
        return hashCode + (abstractPlayerSeasonStatistics == null ? 0 : abstractPlayerSeasonStatistics.hashCode());
    }

    public final String toString() {
        return "PlayerPreviousMatchesWrapper(playerId=" + this.a + ", playerEventsResponse=" + this.b + ", playerSeasonStatistics=" + this.c + ")";
    }
}
