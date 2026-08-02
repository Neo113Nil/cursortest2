package defpackage;

import com.sofascore.model.newNetwork.StageStandingsItem;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l3i {
    public final StageStandingsItem a;
    public final Map b;

    public l3i(StageStandingsItem stageStandingsItem, Map map) {
        stageStandingsItem.getClass();
        this.a = stageStandingsItem;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3i)) {
            return false;
        }
        l3i l3iVar = (l3i) obj;
        return Intrinsics.c(this.a, l3iVar.a) && Intrinsics.c(this.b, l3iVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "ExtendedStageStandingsItem(standings=" + this.a + ", perStageStandings=" + this.b + ")";
    }
}
