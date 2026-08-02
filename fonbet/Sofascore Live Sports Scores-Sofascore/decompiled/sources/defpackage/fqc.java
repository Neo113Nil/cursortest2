package defpackage;

import com.sofascore.model.network.response.MmaPostMatchVote;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fqc {
    public final MmaPostMatchVote a;
    public final MmaPostMatchVotingOptions b;

    public fqc(MmaPostMatchVote mmaPostMatchVote, MmaPostMatchVotingOptions mmaPostMatchVotingOptions) {
        this.a = mmaPostMatchVote;
        this.b = mmaPostMatchVotingOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqc)) {
            return false;
        }
        fqc fqcVar = (fqc) obj;
        return this.a.equals(fqcVar.a) && this.b == fqcVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MmaPostMatchVotingOptions mmaPostMatchVotingOptions = this.b;
        return hashCode + (mmaPostMatchVotingOptions == null ? 0 : mmaPostMatchVotingOptions.hashCode());
    }

    public final String toString() {
        return "MmaPostMatchVotingData(postMatchVotingVotes=" + this.a + ", postMatchVotingLocalVotes=" + this.b + ")";
    }
}
