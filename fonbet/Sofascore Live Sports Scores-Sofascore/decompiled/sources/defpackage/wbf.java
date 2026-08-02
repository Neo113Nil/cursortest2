package defpackage;

import com.sofascore.model.profile.EditorsEventsCountResponse;
import com.sofascore.model.profile.VoteStatistics;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wbf {
    public final p4b a;
    public final EditorsEventsCountResponse b;
    public final boolean c;
    public final VoteStatistics d;
    public final List e;
    public final k3l f;

    public wbf(p4b p4bVar, EditorsEventsCountResponse editorsEventsCountResponse, boolean z, VoteStatistics voteStatistics, List list, k3l k3lVar) {
        list.getClass();
        this.a = p4bVar;
        this.b = editorsEventsCountResponse;
        this.c = z;
        this.d = voteStatistics;
        this.e = list;
        this.f = k3lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbf)) {
            return false;
        }
        wbf wbfVar = (wbf) obj;
        return Intrinsics.c(this.a, wbfVar.a) && Intrinsics.c(this.b, wbfVar.b) && this.c == wbfVar.c && Intrinsics.c(this.d, wbfVar.d) && Intrinsics.c(this.e, wbfVar.e) && this.f.equals(wbfVar.f);
    }

    public final int hashCode() {
        p4b p4bVar = this.a;
        int hashCode = (p4bVar == null ? 0 : p4bVar.hashCode()) * 31;
        EditorsEventsCountResponse editorsEventsCountResponse = this.b;
        int e = dmi.e((hashCode + (editorsEventsCountResponse == null ? 0 : editorsEventsCountResponse.hashCode())) * 31, 31, this.c);
        VoteStatistics voteStatistics = this.d;
        return this.f.hashCode() + dmi.d((e + (voteStatistics != null ? voteStatistics.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "ProfileWrapper(league=" + this.a + ", editorEventsCount=" + this.b + ", hasContributions=" + this.c + ", voteStatistics=" + this.d + ", followedItems=" + this.e + ", weeklyChallengeStreak=" + this.f + ")";
    }
}
