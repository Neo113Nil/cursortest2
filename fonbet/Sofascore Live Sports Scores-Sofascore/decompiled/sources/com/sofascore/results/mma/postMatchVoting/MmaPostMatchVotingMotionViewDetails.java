package com.sofascore.results.mma.postMatchVoting;

import android.content.Context;
import android.util.AttributeSet;
import com.sofascore.model.network.response.MmaPostMatchVote;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import defpackage.hqc;
import defpackage.hxj;
import defpackage.k6;
import defpackage.kdc;
import defpackage.yp8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/mma/postMatchVoting/MmaPostMatchVotingMotionViewDetails;", "Lk6;", "", "canChangeVote", "Z", "getCanChangeVote", "()Z", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaPostMatchVotingMotionViewDetails extends k6 {
    public static final /* synthetic */ int p = 0;
    public MmaPostMatchVote o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MmaPostMatchVotingMotionViewDetails(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // defpackage.k6
    public boolean getCanChangeVote() {
        return false;
    }

    @Override // defpackage.k6
    public final void n(MmaPostMatchVotingOptions mmaPostMatchVotingOptions) {
        mmaPostMatchVotingOptions.getClass();
        MmaPostMatchVote mmaPostMatchVote = this.o;
        if (mmaPostMatchVote != null) {
            VotesResponseKt.addVote(mmaPostMatchVote, mmaPostMatchVotingOptions);
            getBinding().a.post(new kdc(3, this, mmaPostMatchVote, mmaPostMatchVotingOptions));
        }
    }

    public final void s(MmaPostMatchVote mmaPostMatchVote, MmaPostMatchVotingOptions mmaPostMatchVotingOptions, boolean z) {
        mmaPostMatchVote.getClass();
        int vote1 = mmaPostMatchVote.getVote1();
        int vote2 = mmaPostMatchVote.getVote2();
        if (z) {
            hxj.a(getBinding().a, null);
        }
        getBinding().a.post(new yp8(this, 18));
        getBinding().a.post(new hqc(this, vote1, mmaPostMatchVotingOptions, vote2));
    }
}
