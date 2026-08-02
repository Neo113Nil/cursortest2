package defpackage;

import com.sofascore.model.newNetwork.StageStandingsItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o6i implements m6i {
    public final StageStandingsItem a;
    public final List b;
    public final alf c;
    public final i5i d;

    public o6i(StageStandingsItem stageStandingsItem, List list, alf alfVar, i5i i5iVar) {
        stageStandingsItem.getClass();
        list.getClass();
        alfVar.getClass();
        this.a = stageStandingsItem;
        this.b = list;
        this.c = alfVar;
        this.d = i5iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6i)) {
            return false;
        }
        o6i o6iVar = (o6i) obj;
        return Intrinsics.c(this.a, o6iVar.a) && Intrinsics.c(this.b, o6iVar.b) && Intrinsics.c(this.c, o6iVar.c) && this.d == o6iVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + dmi.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        i5i i5iVar = this.d;
        return hashCode + (i5iVar == null ? 0 : i5iVar.hashCode());
    }

    public final String toString() {
        return "StageStandingsRow(item=" + this.a + ", columns=" + this.b + ", resultType=" + this.c + ", cyclingStageColors=" + this.d + ")";
    }
}
