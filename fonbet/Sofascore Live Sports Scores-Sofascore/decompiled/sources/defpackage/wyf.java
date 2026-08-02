package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wyf implements o95 {
    public final EventSuggest.IncidentSuggest a;
    public final boolean b;
    public final Integer c;
    public final boolean d;
    public final Integer e;

    public wyf(EventSuggest.IncidentSuggest incidentSuggest, boolean z, Integer num) {
        incidentSuggest.getClass();
        this.a = incidentSuggest;
        this.b = z;
        this.c = num;
        this.d = z;
        this.e = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.sofascore.model.crowdsourcing.EventSuggest$IncidentSuggest] */
    public static wyf a(wyf wyfVar, EventSuggest.IncidentSuggest.GoalSuggest goalSuggest, Integer num, int i) {
        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest2 = goalSuggest;
        if ((i & 1) != 0) {
            goalSuggest2 = wyfVar.a;
        }
        boolean z = wyfVar.b;
        if ((i & 4) != 0) {
            num = wyfVar.c;
        }
        goalSuggest2.getClass();
        return new wyf(goalSuggest2, z, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyf)) {
            return false;
        }
        wyf wyfVar = (wyf) obj;
        return Intrinsics.c(this.a, wyfVar.a) && this.b == wyfVar.b && Intrinsics.c(this.c, wyfVar.c);
    }

    public final int hashCode() {
        int e = dmi.e(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReorderableIncident(incident=");
        sb.append(this.a);
        sb.append(", isReorderable=");
        sb.append(this.b);
        sb.append(", constraintIncidentIndex=");
        return vxd.n(sb, this.c, ")");
    }
}
