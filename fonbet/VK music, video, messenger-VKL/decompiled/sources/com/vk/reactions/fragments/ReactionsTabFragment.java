package com.vk.reactions.fragments;

import com.vk.dto.reactions.ReactionMeta;
import com.vk.reactions.fragments.BaseReactionsTabFragment;
import xsna.s6f0;
import xsna.t2f0;
import xsna.u6f0;

/* compiled from: ReactionsTabFragment.kt */
/* loaded from: classes5.dex */
public final class ReactionsTabFragment extends BaseReactionsTabFragment {
    public final s6f0 Z;
    public final t2f0 a0;

    /* compiled from: ReactionsTabFragment.kt */
    public static final class a extends BaseReactionsTabFragment.a {
        public a() {
            super(ReactionsTabFragment.class, null, null);
        }

        public final void D(ReactionMeta reactionMeta) {
            this.j.putParcelable("reaction", reactionMeta);
        }
    }

    public ReactionsTabFragment() {
        s6f0 s6f0Var = new s6f0(this);
        this.Z = s6f0Var;
        this.a0 = new t2f0(s6f0Var.c);
    }

    @Override // xsna.v6f0
    public final t2f0 getAdapter() {
        return this.a0;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final u6f0 io() {
        return this.Z;
    }
}
