package defpackage;

import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.network.response.FirstTeamToScoreVote;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.WillBothTeamsScoreVote;
import com.sofascore.model.newNetwork.VoteChoices;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w3f {
    public final int a;
    public final y3f b;
    public final boolean c;
    public final Vote d;
    public final FirstTeamToScoreVote e;
    public final WillBothTeamsScoreVote f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final VoteChoices n;
    public final VoteChoices o;
    public final VoteChoices p;
    public final int q;
    public final boolean r;

    public /* synthetic */ w3f(int i, y3f y3fVar, boolean z, Vote vote, FirstTeamToScoreVote firstTeamToScoreVote, WillBothTeamsScoreVote willBothTeamsScoreVote, String str, String str2, String str3, boolean z2, String str4, boolean z3, VoteChoices voteChoices, VoteChoices voteChoices2, VoteChoices voteChoices3, int i2, boolean z4, int i3) {
        this(i, y3fVar, z, (i3 & 8) != 0 ? null : vote, (i3 & 16) != 0 ? null : firstTeamToScoreVote, (i3 & 32) != 0 ? null : willBothTeamsScoreVote, str, str2, str3, z2, str4, false, (i3 & 4096) != 0 ? false : z3, voteChoices, (i3 & 16384) != 0 ? null : voteChoices2, voteChoices3, i2, z4);
    }

    public static w3f a(w3f w3fVar, Vote vote, FirstTeamToScoreVote firstTeamToScoreVote, WillBothTeamsScoreVote willBothTeamsScoreVote, String str, boolean z, String str2, boolean z2, int i) {
        int i2 = w3fVar.a;
        y3f y3fVar = w3fVar.b;
        boolean z3 = w3fVar.c;
        Vote vote2 = (i & 8) != 0 ? w3fVar.d : vote;
        FirstTeamToScoreVote firstTeamToScoreVote2 = (i & 16) != 0 ? w3fVar.e : firstTeamToScoreVote;
        WillBothTeamsScoreVote willBothTeamsScoreVote2 = (i & 32) != 0 ? w3fVar.f : willBothTeamsScoreVote;
        String str3 = (i & 64) != 0 ? w3fVar.g : str;
        String str4 = w3fVar.h;
        Vote vote3 = vote2;
        FirstTeamToScoreVote firstTeamToScoreVote3 = firstTeamToScoreVote2;
        WillBothTeamsScoreVote willBothTeamsScoreVote3 = willBothTeamsScoreVote2;
        String str5 = str3;
        String str6 = w3fVar.i;
        boolean z4 = (i & 512) != 0 ? w3fVar.j : z;
        String str7 = (i & 1024) != 0 ? w3fVar.k : str2;
        boolean z5 = (i & a.o) != 0 ? w3fVar.l : true;
        boolean z6 = (i & 4096) != 0 ? w3fVar.m : z2;
        VoteChoices voteChoices = w3fVar.n;
        VoteChoices voteChoices2 = w3fVar.o;
        boolean z7 = z6;
        VoteChoices voteChoices3 = w3fVar.p;
        int i3 = w3fVar.q;
        boolean z8 = w3fVar.r;
        w3fVar.getClass();
        y3fVar.getClass();
        str7.getClass();
        voteChoices.getClass();
        voteChoices3.getClass();
        return new w3f(i2, y3fVar, z3, vote3, firstTeamToScoreVote3, willBothTeamsScoreVote3, str5, str4, str6, z4, str7, z5, z7, voteChoices, voteChoices2, voteChoices3, i3, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3f)) {
            return false;
        }
        w3f w3fVar = (w3f) obj;
        return this.a == w3fVar.a && this.b == w3fVar.b && this.c == w3fVar.c && Intrinsics.c(this.d, w3fVar.d) && Intrinsics.c(this.e, w3fVar.e) && Intrinsics.c(this.f, w3fVar.f) && Intrinsics.c(this.g, w3fVar.g) && Intrinsics.c(this.h, w3fVar.h) && Intrinsics.c(this.i, w3fVar.i) && this.j == w3fVar.j && Intrinsics.c(this.k, w3fVar.k) && this.l == w3fVar.l && this.m == w3fVar.m && Intrinsics.c(this.n, w3fVar.n) && Intrinsics.c(this.o, w3fVar.o) && Intrinsics.c(this.p, w3fVar.p) && this.q == w3fVar.q && this.r == w3fVar.r;
    }

    public final int hashCode() {
        int e = dmi.e((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        Vote vote = this.d;
        int hashCode = (e + (vote == null ? 0 : vote.hashCode())) * 31;
        FirstTeamToScoreVote firstTeamToScoreVote = this.e;
        int hashCode2 = (hashCode + (firstTeamToScoreVote == null ? 0 : firstTeamToScoreVote.hashCode())) * 31;
        WillBothTeamsScoreVote willBothTeamsScoreVote = this.f;
        int hashCode3 = (hashCode2 + (willBothTeamsScoreVote == null ? 0 : willBothTeamsScoreVote.hashCode())) * 31;
        String str = this.g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode6 = (this.n.hashCode() + dmi.e(dmi.e(dmi.c(dmi.e((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31;
        VoteChoices voteChoices = this.o;
        return Boolean.hashCode(this.r) + wv8.a(this.q, (this.p.hashCode() + ((hashCode6 + (voteChoices != null ? voteChoices.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictionItem(title=");
        sb.append(this.a);
        sb.append(", predictionType=");
        sb.append(this.b);
        sb.append(", shouldReverseTeams=");
        sb.append(this.c);
        sb.append(", eventVotes=");
        sb.append(this.d);
        sb.append(", fistTeamToScoreVotes=");
        sb.append(this.e);
        sb.append(", willBothTeamsScoreVotes=");
        sb.append(this.f);
        sb.append(", userPrediction=");
        bf3.v(sb, this.g, ", homeTeamNameCode=", this.h, ", awayTeamNameCode=");
        dmi.w(sb, this.i, ", startTimestampPassed=", this.j, ", eventStatus=");
        dmi.w(sb, this.k, ", animate=", this.l, ", changeVote=");
        sb.append(this.m);
        sb.append(", voteOption1=");
        sb.append(this.n);
        sb.append(", voteOptionX=");
        sb.append(this.o);
        sb.append(", voteOption2=");
        sb.append(this.p);
        sb.append(", eventId=");
        sb.append(this.q);
        sb.append(", isDrawChoiceSupported=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }

    public w3f(int i, y3f y3fVar, boolean z, Vote vote, FirstTeamToScoreVote firstTeamToScoreVote, WillBothTeamsScoreVote willBothTeamsScoreVote, String str, String str2, String str3, boolean z2, String str4, boolean z3, boolean z4, VoteChoices voteChoices, VoteChoices voteChoices2, VoteChoices voteChoices3, int i2, boolean z5) {
        str4.getClass();
        voteChoices.getClass();
        voteChoices3.getClass();
        this.a = i;
        this.b = y3fVar;
        this.c = z;
        this.d = vote;
        this.e = firstTeamToScoreVote;
        this.f = willBothTeamsScoreVote;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = z2;
        this.k = str4;
        this.l = z3;
        this.m = z4;
        this.n = voteChoices;
        this.o = voteChoices2;
        this.p = voteChoices3;
        this.q = i2;
        this.r = z5;
    }
}
