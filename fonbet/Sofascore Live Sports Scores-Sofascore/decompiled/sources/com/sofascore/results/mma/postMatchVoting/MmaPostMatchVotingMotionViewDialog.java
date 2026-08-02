package com.sofascore.results.mma.postMatchVoting;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import defpackage.j4;
import defpackage.k6;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sofascore/results/mma/postMatchVoting/MmaPostMatchVotingMotionViewDialog;", "Lk6;", "", TtmlNode.TAG_P, "Z", "getCanChangeVote", "()Z", "canChangeVote", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaPostMatchVotingMotionViewDialog extends k6 {
    public j4 o;

    /* renamed from: p, reason: from kotlin metadata */
    public final boolean canChangeVote;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MmaPostMatchVotingMotionViewDialog(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.canChangeVote = true;
    }

    @Override // defpackage.k6
    public boolean getCanChangeVote() {
        return this.canChangeVote;
    }

    @Override // defpackage.k6
    public final void l() {
        j4 j4Var = this.o;
        if (j4Var != null) {
            j4Var.invoke();
        }
    }

    @Override // defpackage.k6
    public final void n(MmaPostMatchVotingOptions mmaPostMatchVotingOptions) {
        mmaPostMatchVotingOptions.getClass();
    }
}
